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

//import com.bydan.erp.inventario.util.MovimientosResumidosConstantesFunciones;
import com.bydan.erp.inventario.util.report.MovimientosResumidosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.MovimientosResumidosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.MovimientosResumidosBean;
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
import com.bydan.erp.tesoreria.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MovimientosResumidosBeanSwingJInternalFrame extends MovimientosResumidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MovimientosResumidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MovimientosResumidos> movimientosresumidosValidator = new ClassValidator<MovimientosResumidos>(MovimientosResumidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MovimientosResumidos movimientosresumidos;	
	public MovimientosResumidos movimientosresumidosAux;
	public MovimientosResumidos movimientosresumidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MovimientosResumidos movimientosresumidosTotales;
	public Long idMovimientosResumidosActual;
	public Long iIdNuevoMovimientosResumidos=0L;
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
	
	public Boolean isPermisoTodoMovimientosResumidos;
	public Boolean isPermisoNuevoMovimientosResumidos;
	public Boolean isPermisoActualizarMovimientosResumidos;
	public Boolean isPermisoActualizarOriginalMovimientosResumidos;
	public Boolean isPermisoEliminarMovimientosResumidos;
	public Boolean isPermisoGuardarCambiosMovimientosResumidos;
	public Boolean isPermisoConsultaMovimientosResumidos;
	public Boolean isPermisoBusquedaMovimientosResumidos;
	public Boolean isPermisoReporteMovimientosResumidos;
	public Boolean isPermisoPaginacionMedioMovimientosResumidos;
	public Boolean isPermisoPaginacionAltoMovimientosResumidos;
	public Boolean isPermisoPaginacionTodoMovimientosResumidos;
	public Boolean isPermisoCopiarMovimientosResumidos;
	public Boolean isPermisoVerFormMovimientosResumidos;
	public Boolean isPermisoDuplicarMovimientosResumidos;
	public Boolean isPermisoOrdenMovimientosResumidos;
	
	
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
	
	public MovimientosResumidosParameterReturnGeneral movimientosresumidosReturnGeneral;
	public MovimientosResumidosParameterReturnGeneral movimientosresumidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMovimientosResumidos=false;
	public Boolean esParaAccionDesdeFormularioMovimientosResumidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MovimientosResumidosSessionBeanAdditional movimientosresumidosSessionBeanAdditional=null;
	
	public MovimientosResumidosSessionBeanAdditional getMovimientosResumidosSessionBeanAdditional() {
		return this.movimientosresumidosSessionBeanAdditional;
	}
	
	public void setMovimientosResumidosSessionBeanAdditional(MovimientosResumidosSessionBeanAdditional movimientosresumidosSessionBeanAdditional) {
		try {
			this.movimientosresumidosSessionBeanAdditional=movimientosresumidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MovimientosResumidosBeanSwingJInternalFrameAdditional movimientosresumidosBeanSwingJInternalFrameAdditional=null;
	//public class MovimientosResumidosBeanSwingJInternalFrame
	
	public MovimientosResumidosBeanSwingJInternalFrameAdditional getMovimientosResumidosBeanSwingJInternalFrameAdditional() {
		return this.movimientosresumidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setMovimientosResumidosBeanSwingJInternalFrameAdditional(MovimientosResumidosBeanSwingJInternalFrameAdditional movimientosresumidosBeanSwingJInternalFrameAdditional) {
		try {
			this.movimientosresumidosBeanSwingJInternalFrameAdditional=movimientosresumidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MovimientosResumidosLogic movimientosresumidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MovimientosResumidos movimientosresumidosBean;
	public MovimientosResumidosConstantesFunciones movimientosresumidosConstantesFunciones;
	//public MovimientosResumidosParameterReturnGeneral movimientosresumidosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TransaccionLogic transaccionLogic;
	
	//PARAMETROS
	
	
	//public List<MovimientosResumidos> movimientosresumidoss;	
	//public List<MovimientosResumidos> movimientosresumidossEliminados;
	//public List<MovimientosResumidos> movimientosresumidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaDuplicarMovimientosResumidos=true;
	public Boolean isVisibilidadCeldaCopiarMovimientosResumidos=true;
	public Boolean isVisibilidadCeldaVerFormMovimientosResumidos=true;
	public Boolean isVisibilidadCeldaOrdenMovimientosResumidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaModificarMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaActualizarMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaEliminarMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaCancelarMovimientosResumidos=false;
	public Boolean isVisibilidadCeldaGuardarMovimientosResumidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;	
	
	
	public Boolean isVisibilidadBusquedaMovimientosResumidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoMovimientosResumidos() {
		return this.iIdNuevoMovimientosResumidos;
	}

	public void setiIdNuevoMovimientosResumidos(Long iIdNuevoMovimientosResumidos) {
		this.iIdNuevoMovimientosResumidos = iIdNuevoMovimientosResumidos;
	}
	
	public Long getidMovimientosResumidosActual() {
		return this.idMovimientosResumidosActual;
	}

	public void setidMovimientosResumidosActual(Long idMovimientosResumidosActual) {
		this.idMovimientosResumidosActual = idMovimientosResumidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MovimientosResumidos getmovimientosresumidos() {
		return this.movimientosresumidos;
	}

	public void setmovimientosresumidos(MovimientosResumidos movimientosresumidos) {
		this.movimientosresumidos = movimientosresumidos;
	}
	
	public MovimientosResumidos getmovimientosresumidosAux() {
		return this.movimientosresumidosAux;
	}

	public void setmovimientosresumidosAux(MovimientosResumidos movimientosresumidosAux) {
		this.movimientosresumidosAux = movimientosresumidosAux;
	}				
	
	public MovimientosResumidos getmovimientosresumidosAnterior() {
		return this.movimientosresumidosAnterior;
	}

	public void setmovimientosresumidosAnterior(MovimientosResumidos movimientosresumidosAnterior) {
		this.movimientosresumidosAnterior = movimientosresumidosAnterior;
	}	
	
	public MovimientosResumidos getmovimientosresumidosTotales() {
		return this.movimientosresumidosTotales;
	}

	public void setmovimientosresumidosTotales(MovimientosResumidos movimientosresumidosTotales) {
		this.movimientosresumidosTotales = movimientosresumidosTotales;
	}	
	
	public MovimientosResumidos getmovimientosresumidosBean() {
		return this.movimientosresumidosBean;
	}

	public void setmovimientosresumidosBean(MovimientosResumidos movimientosresumidosBean) {
		this.movimientosresumidosBean = movimientosresumidosBean;
	}	
	
	public MovimientosResumidosParameterReturnGeneral getmovimientosresumidosReturnGeneral() {
		return this.movimientosresumidosReturnGeneral;
	}

	public void setmovimientosresumidosReturnGeneral(MovimientosResumidosParameterReturnGeneral movimientosresumidosReturnGeneral) {
		this.movimientosresumidosReturnGeneral = movimientosresumidosReturnGeneral;
	}	
	
	
	public Long id_transaccionBusquedaMovimientosResumidos=-1L;

	public Long getid_transaccionBusquedaMovimientosResumidos() {
		return this.id_transaccionBusquedaMovimientosResumidos;
	}

	public void setid_transaccionBusquedaMovimientosResumidos(Long id_transaccionBusquedaMovimientosResumidos) {
		this.id_transaccionBusquedaMovimientosResumidos = id_transaccionBusquedaMovimientosResumidos;
	}

;
	public Date fecha_emision_desdeBusquedaMovimientosResumidos=new Date();

	public Date getfecha_emision_desdeBusquedaMovimientosResumidos() {
		return this.fecha_emision_desdeBusquedaMovimientosResumidos;
	}

	public void setfecha_emision_desdeBusquedaMovimientosResumidos(Date fecha_emision_desdeBusquedaMovimientosResumidos) {
		this.fecha_emision_desdeBusquedaMovimientosResumidos = fecha_emision_desdeBusquedaMovimientosResumidos;
	}

;
	public Date fecha_emision_hastaBusquedaMovimientosResumidos=new Date();

	public Date getfecha_emision_hastaBusquedaMovimientosResumidos() {
		return this.fecha_emision_hastaBusquedaMovimientosResumidos;
	}

	public void setfecha_emision_hastaBusquedaMovimientosResumidos(Date fecha_emision_hastaBusquedaMovimientosResumidos) {
		this.fecha_emision_hastaBusquedaMovimientosResumidos = fecha_emision_hastaBusquedaMovimientosResumidos;
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

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MovimientosResumidosLogic getMovimientosResumidosLogic()	{		
		return movimientosresumidosLogic;
	}

	public void setMovimientosResumidosLogic(MovimientosResumidosLogic movimientosresumidosLogic) {
		this.movimientosresumidosLogic = movimientosresumidosLogic;
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
	
	public Boolean getIsEsNuevoMovimientosResumidos() {
		return isEsNuevoMovimientosResumidos;
	}

	public void setIsEsNuevoMovimientosResumidos(Boolean isEsNuevoMovimientosResumidos) {
		this.isEsNuevoMovimientosResumidos = isEsNuevoMovimientosResumidos;
	}

	public Boolean getEsParaAccionDesdeFormularioMovimientosResumidos() {
		return esParaAccionDesdeFormularioMovimientosResumidos;
	}
	
	public void setEsParaAccionDesdeFormularioMovimientosResumidos(Boolean esParaAccionDesdeFormularioMovimientosResumidos) {
		this.esParaAccionDesdeFormularioMovimientosResumidos = esParaAccionDesdeFormularioMovimientosResumidos;
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

			if(this.movimientosresumidosSessionBean==null) {
				this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
			}

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(movimientosresumidosSessionBean.getlidEmpresaActual());
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

			if(this.movimientosresumidosSessionBean==null) {
				this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
			}

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(movimientosresumidosSessionBean.getlidSucursalActual());
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

			if(this.movimientosresumidosSessionBean==null) {
				this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
			}

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
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
					transaccionLogic.getEntityWithConnection(movimientosresumidosSessionBean.getlidTransaccionActual());
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

					if(this.movimientosresumidos!=null) {
						this.movimientosresumidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMovimientosResumidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMovimientosResumidosGenerico)throws Exception
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
				jComboBoxid_empresaMovimientosResumidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMovimientosResumidosGenerico!=null && jComboBoxid_empresaMovimientosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaMovimientosResumidosGenerico.setSelectedIndex(0);
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

					if(this.movimientosresumidos!=null) {
						this.movimientosresumidos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMovimientosResumidos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMovimientosResumidosGenerico)throws Exception
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
				jComboBoxid_sucursalMovimientosResumidosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMovimientosResumidosGenerico!=null && jComboBoxid_sucursalMovimientosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMovimientosResumidosGenerico.setSelectedIndex(0);
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

					if(this.movimientosresumidos!=null) {
						this.movimientosresumidos.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionMovimientosResumidos.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
						if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos!=null) {
						jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos!=null) {
							//jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setSelectedIndex(0);
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
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionMovimientosResumidosGenerico)throws Exception
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
				jComboBoxid_transaccionMovimientosResumidosGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionMovimientosResumidosGenerico!=null && jComboBoxid_transaccionMovimientosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_transaccionMovimientosResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MovimientosResumidos movimientosresumidos,JComboBox jComboBoxid_empresaMovimientosResumidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMovimientosResumidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMovimientosResumidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				movimientosresumidos.setid_empresa(empresaAux.getId());
				movimientosresumidos.setempresa_descripcion(MovimientosResumidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				movimientosresumidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MovimientosResumidos movimientosresumidos,JComboBox jComboBoxid_sucursalMovimientosResumidosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMovimientosResumidosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMovimientosResumidosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				movimientosresumidos.setid_sucursal(sucursalAux.getId());
				movimientosresumidos.setsucursal_descripcion(MovimientosResumidosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				movimientosresumidos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(MovimientosResumidos movimientosresumidos,JComboBox jComboBoxid_transaccionMovimientosResumidosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionMovimientosResumidosGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionMovimientosResumidosGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				movimientosresumidos.setid_transaccion(transaccionAux.getId());
				movimientosresumidos.settransaccion_descripcion(MovimientosResumidosConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				movimientosresumidos.setTransaccion(transaccionAux);			}
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

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
					}

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
					}

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { 
					}

					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.addItem(transaccion);
							}
						}

						if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMovimientosResumidos() throws Exception {
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
		
	public MovimientosResumidosParameterReturnGeneral getMovimientosResumidosParameterGeneral() {
		return this.movimientosresumidosParameterGeneral;
	}
	
	public void setMovimientosResumidosParameterGeneral(MovimientosResumidosParameterReturnGeneral movimientosresumidosParameterGeneral) {
		this.movimientosresumidosParameterGeneral = movimientosresumidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMovimientosResumidos() {
		return isPermisoTodoMovimientosResumidos;
	}

	public void setIsPermisoTodoMovimientosResumidos(Boolean isPermisoTodoMovimientosResumidos) {
		this.isPermisoTodoMovimientosResumidos = isPermisoTodoMovimientosResumidos;
	}

	public Boolean getIsPermisoNuevoMovimientosResumidos() {
		return isPermisoNuevoMovimientosResumidos;
	}

	public void setIsPermisoNuevoMovimientosResumidos(Boolean isPermisoNuevoMovimientosResumidos) {
		this.isPermisoNuevoMovimientosResumidos = isPermisoNuevoMovimientosResumidos;
	}

	public Boolean getIsPermisoActualizarMovimientosResumidos() {
		return isPermisoActualizarMovimientosResumidos;
	}

	public void setIsPermisoActualizarMovimientosResumidos(Boolean isPermisoActualizarMovimientosResumidos) {
		this.isPermisoActualizarMovimientosResumidos = isPermisoActualizarMovimientosResumidos;
	}

	public Boolean getIsPermisoEliminarMovimientosResumidos() {
		return isPermisoEliminarMovimientosResumidos;
	}

	public void setIsPermisoEliminarMovimientosResumidos(Boolean isPermisoEliminarMovimientosResumidos) {
		this.isPermisoEliminarMovimientosResumidos = isPermisoEliminarMovimientosResumidos;
	}

	public Boolean getIsPermisoGuardarCambiosMovimientosResumidos() {
		return isPermisoGuardarCambiosMovimientosResumidos;
	}

	public void setIsPermisoGuardarCambiosMovimientosResumidos(Boolean isPermisoGuardarCambiosMovimientosResumidos) {
		this.isPermisoGuardarCambiosMovimientosResumidos = isPermisoGuardarCambiosMovimientosResumidos;
	}
	
	public Boolean getIsPermisoConsultaMovimientosResumidos() {
		return isPermisoConsultaMovimientosResumidos;
	}

	public void setIsPermisoConsultaMovimientosResumidos(Boolean isPermisoConsultaMovimientosResumidos) {
		this.isPermisoConsultaMovimientosResumidos = isPermisoConsultaMovimientosResumidos;
	}

	public Boolean getIsPermisoBusquedaMovimientosResumidos() {
		return isPermisoBusquedaMovimientosResumidos;
	}

	public void setIsPermisoBusquedaMovimientosResumidos(Boolean isPermisoBusquedaMovimientosResumidos) {
		this.isPermisoBusquedaMovimientosResumidos = isPermisoBusquedaMovimientosResumidos;
	}

	public Boolean getIsPermisoReporteMovimientosResumidos() {
		return isPermisoReporteMovimientosResumidos;
	}

	public void setIsPermisoReporteMovimientosResumidos(Boolean isPermisoReporteMovimientosResumidos) {
		this.isPermisoReporteMovimientosResumidos = isPermisoReporteMovimientosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioMovimientosResumidos() {
		return isPermisoPaginacionMedioMovimientosResumidos;
	}

	public void setIsPermisoPaginacionMedioMovimientosResumidos(Boolean isPermisoPaginacionMedioMovimientosResumidos) {
		this.isPermisoPaginacionMedioMovimientosResumidos = isPermisoPaginacionMedioMovimientosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoMovimientosResumidos() {
		return isPermisoPaginacionTodoMovimientosResumidos;
	}

	public void setIsPermisoPaginacionTodoMovimientosResumidos(Boolean isPermisoPaginacionTodoMovimientosResumidos) {
		this.isPermisoPaginacionTodoMovimientosResumidos = isPermisoPaginacionTodoMovimientosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoMovimientosResumidos() {
		return isPermisoPaginacionAltoMovimientosResumidos;
	}

	public void setIsPermisoPaginacionAltoMovimientosResumidos(Boolean isPermisoPaginacionAltoMovimientosResumidos) {
		this.isPermisoPaginacionAltoMovimientosResumidos = isPermisoPaginacionAltoMovimientosResumidos;
	}
	
	public Boolean getIsPermisoCopiarMovimientosResumidos() {
		return isPermisoCopiarMovimientosResumidos;
	}

	public void setIsPermisoCopiarMovimientosResumidos(Boolean isPermisoCopiarMovimientosResumidos) {
		this.isPermisoCopiarMovimientosResumidos = isPermisoCopiarMovimientosResumidos;
	}
	
	public Boolean getIsPermisoVerFormMovimientosResumidos() {
		return isPermisoVerFormMovimientosResumidos;
	}

	public void setIsPermisoVerFormMovimientosResumidos(Boolean isPermisoVerFormMovimientosResumidos) {
		this.isPermisoVerFormMovimientosResumidos = isPermisoVerFormMovimientosResumidos;
	}
	
	public Boolean getIsPermisoDuplicarMovimientosResumidos() {
		return isPermisoDuplicarMovimientosResumidos;
	}

	public void setIsPermisoDuplicarMovimientosResumidos(Boolean isPermisoDuplicarMovimientosResumidos) {
		this.isPermisoDuplicarMovimientosResumidos = isPermisoDuplicarMovimientosResumidos;
	}
	
	public Boolean getIsPermisoOrdenMovimientosResumidos() {
		return isPermisoOrdenMovimientosResumidos;
	}

	public void setIsPermisoOrdenMovimientosResumidos(Boolean isPermisoOrdenMovimientosResumidos) {
		this.isPermisoOrdenMovimientosResumidos = isPermisoOrdenMovimientosResumidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMovimientosResumidos() {
		return isVisibilidadCeldaNuevoMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaNuevoMovimientosResumidos(Boolean isVisibilidadCeldaNuevoMovimientosResumidos) {
		this.isVisibilidadCeldaNuevoMovimientosResumidos = isVisibilidadCeldaNuevoMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMovimientosResumidos() {
		return isVisibilidadCeldaDuplicarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaDuplicarMovimientosResumidos(Boolean isVisibilidadCeldaDuplicarMovimientosResumidos) {
		this.isVisibilidadCeldaDuplicarMovimientosResumidos = isVisibilidadCeldaDuplicarMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMovimientosResumidos() {
		return isVisibilidadCeldaCopiarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaCopiarMovimientosResumidos(Boolean isVisibilidadCeldaCopiarMovimientosResumidos) {
		this.isVisibilidadCeldaCopiarMovimientosResumidos = isVisibilidadCeldaCopiarMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMovimientosResumidos() {
		return isVisibilidadCeldaVerFormMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaVerFormMovimientosResumidos(Boolean isVisibilidadCeldaVerFormMovimientosResumidos) {
		this.isVisibilidadCeldaVerFormMovimientosResumidos = isVisibilidadCeldaVerFormMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMovimientosResumidos() {
		return isVisibilidadCeldaOrdenMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaOrdenMovimientosResumidos(Boolean isVisibilidadCeldaOrdenMovimientosResumidos) {
		this.isVisibilidadCeldaOrdenMovimientosResumidos = isVisibilidadCeldaOrdenMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMovimientosResumidos() {
		return isVisibilidadCeldaNuevoRelacionesMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMovimientosResumidos(Boolean isVisibilidadCeldaNuevoRelacionesMovimientosResumidos) {
		this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos = isVisibilidadCeldaNuevoRelacionesMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMovimientosResumidos() {
		return isVisibilidadCeldaModificarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaModificarMovimientosResumidos(Boolean isVisibilidadCeldaModificarMovimientosResumidos) {
		this.isVisibilidadCeldaModificarMovimientosResumidos = isVisibilidadCeldaModificarMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMovimientosResumidos() {
		return isVisibilidadCeldaActualizarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaActualizarMovimientosResumidos(Boolean isVisibilidadCeldaActualizarMovimientosResumidos) {
		this.isVisibilidadCeldaActualizarMovimientosResumidos = isVisibilidadCeldaActualizarMovimientosResumidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarMovimientosResumidos() {
		return isVisibilidadCeldaEliminarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaEliminarMovimientosResumidos(Boolean isVisibilidadCeldaEliminarMovimientosResumidos) {
		this.isVisibilidadCeldaEliminarMovimientosResumidos = isVisibilidadCeldaEliminarMovimientosResumidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarMovimientosResumidos() {
		return isVisibilidadCeldaCancelarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaCancelarMovimientosResumidos(Boolean isVisibilidadCeldaCancelarMovimientosResumidos) {
		this.isVisibilidadCeldaCancelarMovimientosResumidos = isVisibilidadCeldaCancelarMovimientosResumidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarMovimientosResumidos() {
		return isVisibilidadCeldaGuardarMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaGuardarMovimientosResumidos(Boolean isVisibilidadCeldaGuardarMovimientosResumidos) {
		this.isVisibilidadCeldaGuardarMovimientosResumidos = isVisibilidadCeldaGuardarMovimientosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMovimientosResumidos() {
		return isVisibilidadCeldaGuardarCambiosMovimientosResumidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMovimientosResumidos(Boolean isVisibilidadCeldaGuardarCambiosMovimientosResumidos) {
		this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos = isVisibilidadCeldaGuardarCambiosMovimientosResumidos;
	}
		
	public MovimientosResumidosSessionBean getmovimientosresumidosSessionBean() {
		return this.movimientosresumidosSessionBean;
	}
	
	public void setmovimientosresumidosSessionBean(MovimientosResumidosSessionBean movimientosresumidosSessionBean) {
		this.movimientosresumidosSessionBean=movimientosresumidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaMovimientosResumidos() {
		return this.isVisibilidadBusquedaMovimientosResumidos;
	}

	public void setisVisibilidadBusquedaMovimientosResumidos(Boolean isVisibilidadBusquedaMovimientosResumidos) {
		this.isVisibilidadBusquedaMovimientosResumidos=isVisibilidadBusquedaMovimientosResumidos;
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

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(MovimientosResumidos movimientosresumidos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(movimientosresumidos,null);
				this.setActualParaGuardarSucursalForeignKey(movimientosresumidos,null);
				this.setActualParaGuardarTransaccionForeignKey(movimientosresumidos,null);
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
	
	public void bugActualizarReferenciaActual(MovimientosResumidos movimientosresumidos,MovimientosResumidos movimientosresumidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMovimientosResumidos(movimientosresumidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		movimientosresumidosAux.setId(movimientosresumidos.getId());
		movimientosresumidosAux.setVersionRow(movimientosresumidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(MovimientosResumidos movimientosresumidosLocal) throws Exception {
		
		if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MovimientosResumidos movimientosresumidosLocal) throws Exception {	
		if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				movimientosresumidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				movimientosresumidosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				movimientosresumidosLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMovimientosResumidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = movimientosresumidosValidator.getInvalidValues(this.movimientosresumidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MovimientosResumidos movimientosresumidos,List<MovimientosResumidos> movimientosresumidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(MovimientosResumidos movimientosresumidos,List<MovimientosResumidos> movimientosresumidoss) throws Exception {
		try	{			
			MovimientosResumidosConstantesFunciones.actualizarSelectedLista(movimientosresumidos,movimientosresumidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MovimientosResumidos> movimientosresumidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				movimientosresumidossLocal=this.movimientosresumidosLogic.getMovimientosResumidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				movimientosresumidossLocal=this.movimientosresumidoss;
			}
			//ARCHITECTURE
		
			for(MovimientosResumidos movimientosresumidosLocal:movimientosresumidossLocal) {
				if(this.permiteMantenimiento(movimientosresumidosLocal) && movimientosresumidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MovimientosResumidosConstantesFunciones.getMovimientosResumidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_sucursalMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_completo_clienteMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_transaccionMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_comprobanteMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_facturaMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotalMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelivaMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.NUMEROSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_secuencialMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelfecha_emisionMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.TOTALDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_descuentoMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeliceMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.RETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelretencionMovimientosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosResumidosConstantesFunciones.TOTALOTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_otroMovimientosResumidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_sucursalMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_completo_clienteMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_transaccionMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_comprobanteMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_facturaMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotalMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelivaMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_secuencialMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelfecha_emisionMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_descuentoMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeliceMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelretencionMovimientosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_otroMovimientosResumidos,"");
		
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
		this.iIdNuevoMovimientosResumidos--;	
		
		
		this.movimientosresumidosAux=new MovimientosResumidos();
		
		this.movimientosresumidosAux.setId(this.iIdNuevoMovimientosResumidos);
		this.movimientosresumidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.movimientosresumidosLogic.getMovimientosResumidoss().add(this.movimientosresumidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.movimientosresumidoss.add(this.movimientosresumidosAux);
		}
		//ARCHITECTURE
		
		this.movimientosresumidos=this.movimientosresumidosAux;
		
		if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidos);
			this.setVariablesObjetoActualToFormularioForeignKeyMovimientosResumidos(this.movimientosresumidos);
		}
				
		//this.setDefaultControlesMovimientosResumidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMovimientosResumidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMovimientosResumidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosResumidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMovimientosResumidos(this.movimientosresumidosBean,this.movimientosresumidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMovimientosResumidos(this.movimientosresumidosReturnGeneral,this.movimientosresumidosBean,false);
		
		if(this.movimientosresumidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos());
		}
		
		if(this.movimientosresumidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos(),classes);//this.movimientosresumidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMovimientosResumidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMovimientosResumidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.RecargarFormMovimientosResumidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMovimientosResumidos(false);
						
			if(movimientosresumidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosResumidos();
			}
			
			this.actualizarVisualTableDatosMovimientosResumidos();
			
			this.jTableDatosMovimientosResumidos.setRowSelectionInterval(this.getIndiceNuevoMovimientosResumidos(), this.getIndiceNuevoMovimientosResumidos());
			
			this.seleccionarFilaTablaMovimientosResumidosActual();
						
			this.actualizarEstadoCeldasBotonesMovimientosResumidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMovimientosResumidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_desdeMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarfecha_emision_desdeMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_hastaMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarfecha_emision_hastaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnombre_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnombre_completo_clienteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnombre_transaccionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnumero_comprobanteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnumero_facturaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activartotalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarivaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarnumero_secuencialMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarfecha_emisionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activartotal_descuentoMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activariceMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarretencionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activartotal_otroMovimientosResumidos);	
		//
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarid_empresaMovimientosResumidos);//
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarid_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setEnabled(isHabilitar && this.movimientosresumidosConstantesFunciones.activarid_transaccionMovimientosResumidos);
	};
	
	public void setDefaultControlesMovimientosResumidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMovimientosResumidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.movimientosresumidosSessionBean.setConGuardarRelaciones(true);			
			this.movimientosresumidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.setVisible(true);
			
					
		} else {
			//this.movimientosresumidosSessionBean.setConGuardarRelaciones(false);			
			this.movimientosresumidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMovimientosResumidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
				if(movimientosresumidosAux.getId().equals(this.iIdNuevoMovimientosResumidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidoss) {
				if(movimientosresumidosAux.getId().equals(this.iIdNuevoMovimientosResumidos)) {
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
	
	public int getIndiceActualMovimientosResumidos(MovimientosResumidos movimientosresumidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
				if(movimientosresumidosAux.getId().equals(movimientosresumidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidoss) {
				if(movimientosresumidosAux.getId().equals(movimientosresumidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMovimientosResumidos(MovimientosResumidos movimientosresumidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
				if(movimientosresumidosAux.getMovimientosResumidosOriginal().getId().equals(movimientosresumidosOriginal.getId())) {
					existe=true;
					movimientosresumidosOriginal.setId(movimientosresumidosAux.getId());
					movimientosresumidosOriginal.setVersionRow(movimientosresumidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidoss) {
				if(movimientosresumidosAux.getMovimientosResumidosOriginal().getId().equals(movimientosresumidosOriginal.getId())) {
					existe=true;
					movimientosresumidosOriginal.setId(movimientosresumidosAux.getId());
					movimientosresumidosOriginal.setVersionRow(movimientosresumidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMovimientosResumidos(Boolean esParaCancelar) throws Exception {
		movimientosresumidossAux=new ArrayList<MovimientosResumidos>();
		movimientosresumidosAux=new MovimientosResumidos();
		
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
					if(movimientosresumidosAux.getId()<0) {
						movimientosresumidossAux.add(movimientosresumidosAux);
					}		
				}
				this.iIdNuevoMovimientosResumidos=0L;
				this.movimientosresumidosLogic.getMovimientosResumidoss().removeAll(movimientosresumidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidoss) {
					if(movimientosresumidosAux.getId()<0) {
						movimientosresumidossAux.add(movimientosresumidosAux);
					}		
				}
				this.iIdNuevoMovimientosResumidos=0L;
				this.movimientosresumidoss.removeAll(movimientosresumidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMovimientosResumidos 
					&& this.movimientosresumidosLogic.getMovimientosResumidoss().size()>0
					) {
					movimientosresumidosAux=this.movimientosresumidosLogic.getMovimientosResumidoss().get(this.movimientosresumidosLogic.getMovimientosResumidoss().size() - 1);
				
					if(movimientosresumidosAux.getId()<0) {
						this.movimientosresumidosLogic.getMovimientosResumidoss().remove(movimientosresumidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMovimientosResumidos && this.movimientosresumidoss.size()>0) {
					movimientosresumidosAux=this.movimientosresumidoss.get(this.movimientosresumidoss.size() - 1);
				
					if(movimientosresumidosAux.getId()<0) {
						this.movimientosresumidoss.remove(movimientosresumidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMovimientosResumidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(movimientosresumidos.getId()<0) {
				this.movimientosresumidosLogic.getMovimientosResumidoss().remove(this.movimientosresumidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(movimientosresumidos.getId()<0) {
				this.movimientosresumidoss.remove(this.movimientosresumidos);
			}
		}			
	}
	
	public void setEstadosInicialesMovimientosResumidos(List<MovimientosResumidos> movimientosresumidossAux) throws Exception {
		MovimientosResumidosConstantesFunciones.setEstadosInicialesMovimientosResumidos(movimientosresumidossAux);
	}
	
	public void setEstadosInicialesMovimientosResumidos(MovimientosResumidos movimientosresumidosAux) throws Exception {
		MovimientosResumidosConstantesFunciones.setEstadosInicialesMovimientosResumidos(movimientosresumidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMovimientosResumidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMovimientosResumidosActual()) {
				if(!this.isEsNuevoMovimientosResumidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMovimientosResumidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMovimientosResumidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Movimientos Resumidos ?", "MANTENIMIENTO DE Movimientos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MovimientosResumidos movimientosresumidos) throws Exception {
		MovimientosResumidosConstantesFunciones.seleccionarAsignar(this.movimientosresumidos,movimientosresumidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMovimientosResumidos=this.isPermisoActualizarOriginalMovimientosResumidos;
			
			
			this.seleccionarAsignar(movimientosresumidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesMovimientosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.movimientosresumidosSessionBean.setsFuncionBusquedaRapida(this.movimientosresumidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMovimientosResumidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMovimientosResumidos(esParaCancelar);				
				this.cancelarNuevoMovimientosResumidos(esParaCancelar);								
			}
			
			this.movimientosresumidos=new MovimientosResumidos();
			
			this.inicializarMovimientosResumidos();
			
			this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMovimientosResumidos() throws Exception {
		try {
			MovimientosResumidosConstantesFunciones.inicializarMovimientosResumidos(this.movimientosresumidos);
			
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
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.movimientosresumidosLogic.getMovimientosResumidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMovimientosResumidoss(String sAccionBusqueda,List<MovimientosResumidos> movimientosresumidossParaReportes) throws Exception {
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
					sPathReporteFinal="MovimientosResumidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MovimientosResumidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MovimientosResumidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MovimientosResumidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Movimientos Resumidoses");		
		parameters.put("busquedapor", MovimientosResumidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMovimientosResumidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MovimientosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MovimientosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMovimientosResumidos=new JRBeanArrayDataSource(MovimientosResumidosJInternalFrame.TraerMovimientosResumidosBeans(movimientosresumidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMovimientosResumidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MovimientosResumidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MovimientosResumidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MovimientosResumidosBean.TraerMovimientosResumidosBeans(movimientosresumidossParaReportes).toArray()));
							
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
				this.generarExcelReporteMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMovimientosResumidosActionPerformed(null);
					//this.generarExcelReporteMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMovimientosResumidoss(sAccionBusqueda,sTipoArchivoReporte,movimientosresumidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMovimientosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosResumidos> movimientosresumidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosResumidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMovimientosResumidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MovimientosResumidos movimientosresumidos : movimientosresumidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MovimientosResumidosConstantesFunciones.generarExcelReporteDataMovimientosResumidos("NORMAL",row,workbook,movimientosresumidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMovimientosResumidos(String sTipo,Row row,Workbook workbook) {
		
		MovimientosResumidosConstantesFunciones.generarExcelReporteHeaderMovimientosResumidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMovimientosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosResumidos> movimientosresumidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MovimientosResumidos movimientosresumidos : movimientosresumidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MovimientosResumidosConstantesFunciones.getMovimientosResumidosDescripcion(movimientosresumidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getnumero_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.gettotal_descuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_RETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_RETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.getretencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosresumidos.gettotal_otro());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMovimientosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosResumidos> movimientosresumidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MovimientosResumidos> movimientosresumidossRespaldo=null;
		
		classes=MovimientosResumidosConstantesFunciones.getClassesRelationshipsOfMovimientosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.movimientosresumidosLogic.setDatosCliente(this.datosCliente);
		this.movimientosresumidosLogic.setDatosDeep(this.datosDeep);
		this.movimientosresumidosLogic.setIsConDeep(true);
		
		movimientosresumidossRespaldo=this.movimientosresumidosLogic.getMovimientosResumidoss();
		
		this.movimientosresumidosLogic.setMovimientosResumidoss(movimientosresumidossParaReportes);	
		this.movimientosresumidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		movimientosresumidossParaReportes=this.movimientosresumidosLogic.getMovimientosResumidoss();
		this.movimientosresumidosLogic.setMovimientosResumidoss(movimientosresumidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMovimientosResumidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MovimientosResumidos movimientosresumidos : movimientosresumidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMovimientosResumidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MovimientosResumidosConstantesFunciones.generarExcelReporteDataMovimientosResumidos("NORMAL",row,workbook,movimientosresumidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MovimientosResumidosConstantesFunciones.getMovimientosResumidosDescripcion(movimientosresumidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMovimientosResumidos() throws Exception {		
		this.startProcessMovimientosResumidos(true);
	}
	
	public void startProcessMovimientosResumidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMovimientosResumidos ,this.jPanelParametrosReportesMovimientosResumidos, this.jScrollPanelDatosMovimientosResumidos,this.jPanelPaginacionMovimientosResumidos, this.jScrollPanelDatosEdicionMovimientosResumidos, this.jPanelAccionesMovimientosResumidos,this.jPanelAccionesFormularioMovimientosResumidos,this.jmenuBarMovimientosResumidos,this.jmenuBarDetalleMovimientosResumidos,this.jTtoolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasMovimientosResumidos=this.jTabbedPaneBusquedasMovimientosResumidos; 
		
		final JPanel jPanelParametrosReportesMovimientosResumidos=this.jPanelParametrosReportesMovimientosResumidos;
		//final JScrollPane jScrollPanelDatosMovimientosResumidos=this.jScrollPanelDatosMovimientosResumidos;
		final JTable jTableDatosMovimientosResumidos=this.jTableDatosMovimientosResumidos;		
		final JPanel jPanelPaginacionMovimientosResumidos=this.jPanelPaginacionMovimientosResumidos;
		//final JScrollPane jScrollPanelDatosEdicionMovimientosResumidos=this.jScrollPanelDatosEdicionMovimientosResumidos;
		final JPanel jPanelAccionesMovimientosResumidos=this.jPanelAccionesMovimientosResumidos;
		
		JPanel jPanelCamposAuxiliarMovimientosResumidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMovimientosResumidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			jPanelCamposAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jPanelCamposMovimientosResumidos;
			jPanelAccionesFormularioAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jPanelAccionesFormularioMovimientosResumidos;
		}
		
		final JPanel jPanelCamposMovimientosResumidos=jPanelCamposAuxiliarMovimientosResumidos;
		final JPanel jPanelAccionesFormularioMovimientosResumidos=jPanelAccionesFormularioAuxiliarMovimientosResumidos;
		
		
		final JMenuBar jmenuBarMovimientosResumidos=this.jmenuBarMovimientosResumidos;
		final JToolBar jTtoolBarMovimientosResumidos=this.jTtoolBarMovimientosResumidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMovimientosResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMovimientosResumidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			jmenuBarDetalleAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jmenuBarDetalleMovimientosResumidos;
			jTtoolBarDetalleAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jTtoolBarDetalleMovimientosResumidos;
		}
		
		final JMenuBar jmenuBarDetalleMovimientosResumidos=jmenuBarDetalleAuxiliarMovimientosResumidos;
		final JToolBar jTtoolBarDetalleMovimientosResumidos=jTtoolBarDetalleAuxiliarMovimientosResumidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMovimientosResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMovimientosResumidos;
			processRunnable.jTableDatos=jTableDatosMovimientosResumidos;
			processRunnable.jPanelCampos=jPanelCamposMovimientosResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionMovimientosResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesMovimientosResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMovimientosResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarMovimientosResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMovimientosResumidos;
			processRunnable.jTtoolBar=jTtoolBarMovimientosResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMovimientosResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMovimientosResumidos ,jPanelParametrosReportesMovimientosResumidos,jTableDatosMovimientosResumidos, /*jScrollPanelDatosMovimientosResumidos,*/jPanelCamposMovimientosResumidos,jPanelPaginacionMovimientosResumidos, /*jScrollPanelDatosEdicionMovimientosResumidos,*/ jPanelAccionesMovimientosResumidos,jPanelAccionesFormularioMovimientosResumidos,jmenuBarMovimientosResumidos,jmenuBarDetalleMovimientosResumidos,jTtoolBarMovimientosResumidos,jTtoolBarDetalleMovimientosResumidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMovimientosResumidos ,jPanelParametrosReportesMovimientosResumidos, jScrollPanelDatosMovimientosResumidos,jPanelPaginacionMovimientosResumidos, jScrollPanelDatosEdicionMovimientosResumidos, jPanelAccionesMovimientosResumidos,jPanelAccionesFormularioMovimientosResumidos,jmenuBarMovimientosResumidos,jmenuBarDetalleMovimientosResumidos,jTtoolBarMovimientosResumidos,jTtoolBarDetalleMovimientosResumidos);
						
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
	
	public void finishProcessMovimientosResumidos() {// throws Exception 
		this.finishProcessMovimientosResumidos(true);
	}
	
	public void finishProcessMovimientosResumidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMovimientosResumidos ,this.jPanelParametrosReportesMovimientosResumidos, this.jScrollPanelDatosMovimientosResumidos,this.jPanelPaginacionMovimientosResumidos, this.jScrollPanelDatosEdicionMovimientosResumidos, this.jPanelAccionesMovimientosResumidos,this.jPanelAccionesFormularioMovimientosResumidos,this.jmenuBarMovimientosResumidos,this.jmenuBarDetalleMovimientosResumidos,this.jTtoolBarMovimientosResumidos,this.jTtoolBarDetalleMovimientosResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasMovimientosResumidos=this.jTabbedPaneBusquedasMovimientosResumidos; 
		
		final JPanel jPanelParametrosReportesMovimientosResumidos=this.jPanelParametrosReportesMovimientosResumidos;
		//final JScrollPane jScrollPanelDatosMovimientosResumidos=this.jScrollPanelDatosMovimientosResumidos;
		final JTable jTableDatosMovimientosResumidos=this.jTableDatosMovimientosResumidos;		
		final JPanel jPanelPaginacionMovimientosResumidos=this.jPanelPaginacionMovimientosResumidos;
		//final JScrollPane jScrollPanelDatosEdicionMovimientosResumidos=this.jScrollPanelDatosEdicionMovimientosResumidos;
		final JPanel jPanelAccionesMovimientosResumidos=this.jPanelAccionesMovimientosResumidos;
		
		JPanel jPanelCamposAuxiliarMovimientosResumidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMovimientosResumidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			jPanelCamposAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jPanelCamposMovimientosResumidos;
			jPanelAccionesFormularioAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jPanelAccionesFormularioMovimientosResumidos;
		}
		
		final JPanel jPanelCamposMovimientosResumidos=jPanelCamposAuxiliarMovimientosResumidos;
		final JPanel jPanelAccionesFormularioMovimientosResumidos=jPanelAccionesFormularioAuxiliarMovimientosResumidos;
		
		
		final JMenuBar jmenuBarMovimientosResumidos=this.jmenuBarMovimientosResumidos;		
		final JToolBar jTtoolBarMovimientosResumidos=this.jTtoolBarMovimientosResumidos;
				
		JMenuBar jmenuBarDetalleAuxiliarMovimientosResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMovimientosResumidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			jmenuBarDetalleAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jmenuBarDetalleMovimientosResumidos;
			jTtoolBarDetalleAuxiliarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jTtoolBarDetalleMovimientosResumidos;		
		}
		
		final JMenuBar jmenuBarDetalleMovimientosResumidos=jmenuBarDetalleAuxiliarMovimientosResumidos;
		final JToolBar jTtoolBarDetalleMovimientosResumidos=jTtoolBarDetalleAuxiliarMovimientosResumidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMovimientosResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMovimientosResumidos;
			processRunnable.jTableDatos=jTableDatosMovimientosResumidos;
			processRunnable.jPanelCampos=jPanelCamposMovimientosResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionMovimientosResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesMovimientosResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMovimientosResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarMovimientosResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMovimientosResumidos;
			processRunnable.jTtoolBar=jTtoolBarMovimientosResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMovimientosResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMovimientosResumidos ,jPanelParametrosReportesMovimientosResumidos, jTableDatosMovimientosResumidos,/*jScrollPanelDatosMovimientosResumidos,*/jPanelCamposMovimientosResumidos,jPanelPaginacionMovimientosResumidos, /*jScrollPanelDatosEdicionMovimientosResumidos,*/ jPanelAccionesMovimientosResumidos,jPanelAccionesFormularioMovimientosResumidos,jmenuBarMovimientosResumidos,jmenuBarDetalleMovimientosResumidos,jTtoolBarMovimientosResumidos,jTtoolBarDetalleMovimientosResumidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMovimientosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMovimientosResumidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMovimientosResumidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMovimientosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMovimientosResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMovimientosResumidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMovimientosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMovimientosResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMovimientosResumidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.movimientosresumidosConstantesFunciones.getsFinalQueryMovimientosResumidos();
		String  finalQueryPaginacionTodos=this.movimientosresumidosConstantesFunciones.getsFinalQueryMovimientosResumidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MovimientosResumidosConstantesFunciones.getArrayColumnasGlobalesNoMovimientosResumidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MovimientosResumidosConstantesFunciones.getArrayColumnasGlobalesMovimientosResumidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MovimientosResumidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.movimientosresumidossEliminados= new ArrayList<MovimientosResumidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMovimientosResumidos();
		
				///*MovimientosResumidosSessionBean*/this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
			
			if(this.movimientosresumidosSessionBean==null) {
				this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
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
					this.iNumeroPaginacion=MovimientosResumidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MovimientosResumidosConstantesFunciones.getClassesForeignKeysOfMovimientosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/movimientosresumidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			movimientosresumidossAux= new ArrayList<MovimientosResumidos>();
			
				
			movimientosresumidosLogic.setDatosCliente(this.datosCliente);
			movimientosresumidosLogic.setDatosDeep(this.datosDeep);
			movimientosresumidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaMovimientosResumidos")) {
				this.sDetalleReporte=MovimientosResumidosConstantesFunciones.getDetalleIndiceBusquedaMovimientosResumidos(id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					movimientosresumidosLogic.getMovimientosResumidossBusquedaMovimientosResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MovimientosResumidosConstantesFunciones.getDetalleIndiceBusquedaMovimientosResumidos(id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MovimientosResumidosConstantesFunciones.getDetalleIndiceBusquedaMovimientosResumidos(id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=movimientosresumidosLogic.getMovimientosResumidoss()==null||movimientosresumidosLogic.getMovimientosResumidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=movimientosresumidoss==null|| movimientosresumidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosresumidossAux=new ArrayList<MovimientosResumidos>();
						movimientosresumidossAux.addAll(movimientosresumidosLogic.getMovimientosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosresumidossAux=new ArrayList<MovimientosResumidos>();
							movimientosresumidossAux.addAll(movimientosresumidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							movimientosresumidosLogic.getMovimientosResumidossBusquedaMovimientosResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MovimientosResumidosConstantesFunciones.getDetalleIndiceBusquedaMovimientosResumidos(id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MovimientosResumidosConstantesFunciones.getDetalleIndiceBusquedaMovimientosResumidos(id_transaccionBusquedaMovimientosResumidos,fecha_emision_desdeBusquedaMovimientosResumidos,fecha_emision_hastaBusquedaMovimientosResumidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMovimientosResumidoss("BusquedaMovimientosResumidos",movimientosresumidosLogic.getMovimientosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMovimientosResumidoss("BusquedaMovimientosResumidos",movimientosresumidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosresumidosLogic.setMovimientosResumidoss(new ArrayList<MovimientosResumidos>());
						movimientosresumidosLogic.getMovimientosResumidoss().addAll(movimientosresumidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosresumidoss=new ArrayList<MovimientosResumidos>();
							movimientosresumidoss.addAll(movimientosresumidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMovimientosResumidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMovimientosResumidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=movimientosresumidosLogic.getMovimientosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosresumidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=movimientosresumidosLogic.getMovimientosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosresumidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MovimientosResumidos movimientosresumidos) {
		Boolean permite=true;
		
		if(this.movimientosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MovimientosResumidosConstantesFunciones.getOrderByListaMovimientosResumidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MovimientosResumidosConstantesFunciones.getOrderByListaMovimientosResumidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosResumidos movimientosresumidos:movimientosresumidosLogic.getMovimientosResumidoss()) {
				if(movimientosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosresumidosTotales=movimientosresumidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosResumidos movimientosresumidos:this.movimientosresumidoss) {
				if(movimientosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosresumidosTotales=movimientosresumidos;
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
			this.movimientosresumidosAux=new MovimientosResumidos();
			this.movimientosresumidosAux.setsType(Constantes2.S_TOTALES);
			this.movimientosresumidosAux.setIsNew(false);
			this.movimientosresumidosAux.setIsChanged(false);
			this.movimientosresumidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//MovimientosResumidosConstantesFunciones.TotalizarValoresFilaMovimientosResumidos(this.movimientosresumidosLogic.getMovimientosResumidoss(),this.movimientosresumidosAux);
				
				//this.movimientosresumidosLogic.getMovimientosResumidoss().add(this.movimientosresumidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MovimientosResumidosConstantesFunciones.TotalizarValoresFilaMovimientosResumidos(this.movimientosresumidoss,this.movimientosresumidosAux);
				
				this.movimientosresumidoss.add(this.movimientosresumidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		movimientosresumidosTotales=new MovimientosResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.movimientosresumidosLogic.getMovimientosResumidoss().remove(movimientosresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.movimientosresumidoss.remove(movimientosresumidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		movimientosresumidosTotales=new MovimientosResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosResumidos movimientosresumidos:movimientosresumidosLogic.getMovimientosResumidoss()) {
				if(movimientosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosresumidosTotales=movimientosresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MovimientosResumidosConstantesFunciones.TotalizarValoresFilaMovimientosResumidos(this.movimientosresumidosLogic.getMovimientosResumidoss(),movimientosresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosResumidos movimientosresumidos:this.movimientosresumidoss) {
				if(movimientosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosresumidosTotales=movimientosresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MovimientosResumidosConstantesFunciones.TotalizarValoresFilaMovimientosResumidos(this.movimientosresumidoss,movimientosresumidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMovimientosResumidossBusquedaMovimientosResumidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaMovimientosResumidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosResumidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosResumidossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosResumidossFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMovimientosResumidossBusquedaMovimientosResumidos(String sFinalQuery,Long id_transaccion,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosresumidosLogic.getMovimientosResumidossBusquedaMovimientosResumidos(sFinalQuery,this.pagination,id_transaccion,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosResumidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosresumidosLogic.getMovimientosResumidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosResumidossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosresumidosLogic.getMovimientosResumidossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosResumidossFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosresumidosLogic.getMovimientosResumidossFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosMovimientosResumidos() {
		this.isPermisoTodoMovimientosResumidos=false;
		this.isPermisoNuevoMovimientosResumidos=false;
		this.isPermisoActualizarMovimientosResumidos=false;
		this.isPermisoActualizarOriginalMovimientosResumidos=false;
		this.isPermisoEliminarMovimientosResumidos=false;
		this.isPermisoGuardarCambiosMovimientosResumidos=false;
		this.isPermisoConsultaMovimientosResumidos=true;
		this.isPermisoBusquedaMovimientosResumidos=true;
		this.isPermisoReporteMovimientosResumidos=true;
		this.isPermisoOrdenMovimientosResumidos=false;		
		this.isPermisoPaginacionMedioMovimientosResumidos=false;		
		this.isPermisoPaginacionAltoMovimientosResumidos=false;		
		this.isPermisoPaginacionTodoMovimientosResumidos=false;		
		this.isPermisoCopiarMovimientosResumidos=false;		
		this.isPermisoVerFormMovimientosResumidos=false;		
		this.isPermisoDuplicarMovimientosResumidos=false;
		this.isPermisoOrdenMovimientosResumidos=false;
	}
	
	public void setPermisosUsuarioMovimientosResumidos(Boolean isPermiso) {
		this.isPermisoTodoMovimientosResumidos=isPermiso;
		this.isPermisoNuevoMovimientosResumidos=isPermiso;
		this.isPermisoActualizarMovimientosResumidos=isPermiso;
		this.isPermisoActualizarOriginalMovimientosResumidos=isPermiso;
		this.isPermisoEliminarMovimientosResumidos=isPermiso;
		this.isPermisoGuardarCambiosMovimientosResumidos=isPermiso;
		this.isPermisoConsultaMovimientosResumidos=isPermiso;
		this.isPermisoBusquedaMovimientosResumidos=isPermiso;
		this.isPermisoReporteMovimientosResumidos=isPermiso;
		this.isPermisoOrdenMovimientosResumidos=isPermiso;		
		this.isPermisoPaginacionMedioMovimientosResumidos=isPermiso;		
		this.isPermisoPaginacionAltoMovimientosResumidos=isPermiso;		
		this.isPermisoPaginacionTodoMovimientosResumidos=isPermiso;		
		this.isPermisoCopiarMovimientosResumidos=isPermiso;		
		this.isPermisoVerFormMovimientosResumidos=isPermiso;		
		this.isPermisoDuplicarMovimientosResumidos=isPermiso;
		this.isPermisoOrdenMovimientosResumidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMovimientosResumidos(Boolean isPermiso) {
		//this.isPermisoTodoMovimientosResumidos=isPermiso;
		this.isPermisoNuevoMovimientosResumidos=isPermiso;
		this.isPermisoActualizarMovimientosResumidos=isPermiso;
		this.isPermisoActualizarOriginalMovimientosResumidos=isPermiso;
		this.isPermisoEliminarMovimientosResumidos=isPermiso;
		this.isPermisoGuardarCambiosMovimientosResumidos=isPermiso;
		//this.isPermisoConsultaMovimientosResumidos=isPermiso;
		//this.isPermisoBusquedaMovimientosResumidos=isPermiso;
		//this.isPermisoReporteMovimientosResumidos=isPermiso;
		//this.isPermisoOrdenMovimientosResumidos=isPermiso;		
		//this.isPermisoPaginacionMedioMovimientosResumidos=isPermiso;		
		//this.isPermisoPaginacionAltoMovimientosResumidos=isPermiso;		
		//this.isPermisoPaginacionTodoMovimientosResumidos=isPermiso;		
		//this.isPermisoCopiarMovimientosResumidos=isPermiso;		
		//this.isPermisoDuplicarMovimientosResumidos=isPermiso;
		//this.isPermisoOrdenMovimientosResumidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMovimientosResumidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MovimientosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMovimientosResumidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMovimientosResumidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMovimientosResumidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMovimientosResumidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMovimientosResumidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMovimientosResumidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MovimientosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MovimientosResumidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMovimientosResumidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMovimientosResumidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMovimientosResumidos=this.isPermisoActualizarMovimientosResumidos;
			this.isPermisoEliminarMovimientosResumidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMovimientosResumidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMovimientosResumidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMovimientosResumidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMovimientosResumidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMovimientosResumidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMovimientosResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMovimientosResumidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMovimientosResumidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMovimientosResumidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMovimientosResumidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMovimientosResumidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMovimientosResumidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMovimientosResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMovimientosResumidos.setToolTipText(this.jTableDatosMovimientosResumidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMovimientosResumidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMovimientosResumidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MovimientosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MovimientosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMovimientosResumidos() throws Exception {
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
	public void inicializarCombosForeignKeyMovimientosResumidosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMovimientosResumidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MovimientosResumidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyMovimientosResumidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTransaccion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.movimientosresumidosSessionBean==null) {
				this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean();
			}

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.movimientosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
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
	
	public void initActionsCombosTodosForeignKeyMovimientosResumidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMovimientosResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMovimientosResumidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosResumidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMovimientosResumidos(MovimientosResumidos movimientosresumidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMovimientosResumidos(MovimientosResumidos movimientosresumidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMovimientosResumidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosResumidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMovimientosResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMovimientosResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMovimientosResumidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMovimientosResumidos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMovimientosResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMovimientosResumidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public MovimientosResumidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MovimientosResumidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MovimientosResumidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.movimientosresumidosSessionBean=new MovimientosResumidosSessionBean(); 
		this.movimientosresumidosConstantesFunciones=new MovimientosResumidosConstantesFunciones(); 
		this.movimientosresumidosBean=new MovimientosResumidos();//(this.movimientosresumidosConstantesFunciones); 		
		this.movimientosresumidosReturnGeneral=new MovimientosResumidosParameterReturnGeneral(); 
		
		this.movimientosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MovimientosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MovimientosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MovimientosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMovimientosResumidos(true);
			
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
			
			this.movimientosresumidosConstantesFunciones=new MovimientosResumidosConstantesFunciones(); 
			this.movimientosresumidosBean=new MovimientosResumidos();//this.movimientosresumidosConstantesFunciones); 			
			this.movimientosresumidosReturnGeneral=new MovimientosResumidosParameterReturnGeneral(); 
		
			MovimientosResumidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimientos Resumidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.movimientosresumidos=new MovimientosResumidos();
			this.movimientosresumidoss = new ArrayList<MovimientosResumidos>();
			this.movimientosresumidossAux = new ArrayList<MovimientosResumidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic=new MovimientosResumidosLogic();
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.movimientosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.movimientosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMovimientosResumidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMovimientosResumidos);	
					}
					
					if(this.jInternalFrameImportacionMovimientosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMovimientosResumidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMovimientosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMovimientosResumidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMovimientosResumidos);
				this.jInternalFrameDetalleFormMovimientosResumidos.setVisible(false);
				this.jInternalFrameDetalleFormMovimientosResumidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMovimientosResumidos);
					this.jInternalFrameReporteDinamicoMovimientosResumidos.setVisible(false);
					this.jInternalFrameReporteDinamicoMovimientosResumidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMovimientosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMovimientosResumidos);
					this.jInternalFrameImportacionMovimientosResumidos.setVisible(false);
					this.jInternalFrameImportacionMovimientosResumidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMovimientosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMovimientosResumidos);
					this.jInternalFrameOrderByMovimientosResumidos.setVisible(false);
					this.jInternalFrameOrderByMovimientosResumidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMovimientosResumidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MovimientosResumidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.movimientosresumidosReturnGeneral=new MovimientosResumidosParameterReturnGeneral();
			
			this.movimientosresumidosParameterGeneral=new MovimientosResumidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.movimientosresumidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MovimientosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MovimientosResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),this.movimientosresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MovimientosResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),this.movimientosresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaDuplicarMovimientosResumidos=true;
			this.isVisibilidadCeldaCopiarMovimientosResumidos=true;
			this.isVisibilidadCeldaVerFormMovimientosResumidos=true;
			this.isVisibilidadCeldaOrdenMovimientosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			
			
			this.isVisibilidadBusquedaMovimientosResumidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMovimientosResumidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMovimientosResumidos(false);
			
			this.setPermisosUsuarioMovimientosResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado() 
				|| (this.movimientosresumidosSessionBean.getEsGuardarRelacionado() && this.movimientosresumidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMovimientosResumidosClasesRelacionadas();
			}
			
			if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMovimientosResumidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMovimientosResumidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMovimientosResumidos();
			}
			
			if(!this.isPermisoBusquedaMovimientosResumidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MovimientosResumidosConstantesFunciones.getTiposSeleccionarMovimientosResumidos());
				
				this.tiposColumnasSelect=MovimientosResumidosConstantesFunciones.getTiposSeleccionarMovimientosResumidos(true);
				
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
			//if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMovimientosResumidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioMovimientosResumidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioMovimientosResumidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosResumidos() ;
			
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
			this.transaccionLogic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				movimientosresumidosImplementable= (MovimientosResumidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MovimientosResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				movimientosresumidosImplementableHome= (MovimientosResumidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MovimientosResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.movimientosresumidoss= new ArrayList<MovimientosResumidos>();
			this.movimientosresumidossEliminados= new ArrayList<MovimientosResumidos>();
						
			this.isEsNuevoMovimientosResumidos=false;
			this.esParaAccionDesdeFormularioMovimientosResumidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMovimientosResumidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMovimientosResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MovimientosResumidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MovimientosResumidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMovimientosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMovimientosResumidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMovimientosResumidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMovimientosResumidos();
			}
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMovimientosResumidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMovimientosResumidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMovimientosResumidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMovimientosResumidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MovimientosResumidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMovimientosResumidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMovimientosResumidos")) {
				iIndex=this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMovimientosResumidos();	
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
	
	public void cargarCombosForeignKeyMovimientosResumidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMovimientosResumidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMovimientosResumidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMovimientosResumidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMovimientosResumidos();
		
		this.cargarCombosFrameForeignKeyMovimientosResumidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMovimientosResumidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMovimientosResumidos();
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
	
	public void jButtonNuevoMovimientosResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			
			if(jTableDatosMovimientosResumidos.getRowCount()>=1) {
				jTableDatosMovimientosResumidos.removeRowSelectionInterval(0, jTableDatosMovimientosResumidos.getRowCount()-1);						
			}
			
			this.isEsNuevoMovimientosResumidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMovimientosResumidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMovimientosResumidos(true);			
			//this.movimientosresumidos=new MovimientosResumidos();
			//this.movimientosresumidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosResumidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosResumidos() ;
			
			if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosResumidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.movimientosresumidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);				
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MovimientosResumidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMovimientosResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMovimientosResumidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMovimientosResumidos.getSelectedRows().length;			
			}
			
			movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMovimientosResumidos--;			
				//MovimientosResumidos movimientosresumidosAux= new MovimientosResumidos();			
				//movimientosresumidosAux.setId(this.iIdNuevoMovimientosResumidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MovimientosResumidos movimientosresumidosOrigen=new MovimientosResumidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MovimientosResumidos movimientosresumidosOrigen : movimientosresumidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							movimientosresumidosOrigen =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosresumidosOrigen =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMovimientosResumidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.movimientosresumidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMovimientosResumidos(movimientosresumidosOrigen,this.movimientosresumidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.movimientosresumidosLogic.getMovimientosResumidoss().add(this.movimientosresumidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.movimientosresumidoss.add(this.movimientosresumidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
				
				this.jTableDatosMovimientosResumidos.setRowSelectionInterval(this.getIndiceNuevoMovimientosResumidos(), this.getIndiceNuevoMovimientosResumidos());
				
				int iLastRow =  this.jTableDatosMovimientosResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMovimientosResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMovimientosResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosResumidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();									
		
			MovimientosResumidos movimientosresumidosOrigen=new MovimientosResumidos();
			MovimientosResumidos movimientosresumidosDestino=new MovimientosResumidos();
				
			movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMovimientosResumidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || movimientosresumidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMovimientosResumidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosresumidosOrigen =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						movimientosresumidosOrigen =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosresumidosDestino =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						movimientosresumidosDestino =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				movimientosresumidosOrigen =movimientosresumidossSeleccionados.get(0);
				movimientosresumidosDestino =movimientosresumidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMovimientosResumidos(movimientosresumidosOrigen,movimientosresumidosDestino,true,false);
				
				movimientosresumidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(movimientosresumidosDestino,movimientosresumidosLogic.getMovimientosResumidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(movimientosresumidosDestino,movimientosresumidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
				
				//this.jTableDatosMovimientosResumidos.setRowSelectionInterval(this.getIndiceNuevoMovimientosResumidos(), this.getIndiceNuevoMovimientosResumidos());
				
				int iLastRow =  this.jTableDatosMovimientosResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMovimientosResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMovimientosResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosResumidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMovimientosResumidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMovimientosResumidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMovimientosResumidos.setVisible(!isVisible);
			this.jPanelPaginacionMovimientosResumidos.setVisible(!isVisible);
			this.jPanelAccionesMovimientosResumidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMovimientosResumidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMovimientosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMovimientosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMovimientosResumidos();
			
			this.abrirFrameOrderByMovimientosResumidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMovimientosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMovimientosResumidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMovimientosResumidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMovimientosResumidos.isMaximum()) {
					this.jInternalFrameDetalleFormMovimientosResumidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMovimientosResumidos.setSize(this.jInternalFrameDetalleFormMovimientosResumidos.iWidthFormulario,this.jInternalFrameDetalleFormMovimientosResumidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMovimientosResumidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMovimientosResumidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMovimientosResumidos.isMaximum()) {
						this.jInternalFrameDetalleFormMovimientosResumidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMovimientosResumidos.jContentPaneDetalleMovimientosResumidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMovimientosResumidos.jContentPaneDetalleMovimientosResumidos.getWidth(),MovimientosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMovimientosResumidos.jContentPaneDetalleMovimientosResumidos.getWidth(),MovimientosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMovimientosResumidos.jContentPaneDetalleMovimientosResumidos.getWidth(),MovimientosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMovimientosResumidos.setVisible(true);
	        this.jInternalFrameDetalleFormMovimientosResumidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMovimientosResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMovimientosResumidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMovimientosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosResumidos,false,this);
				} else {
					this.jInternalFrameOrderByMovimientosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosResumidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMovimientosResumidos);
				this.jInternalFrameOrderByMovimientosResumidos.setVisible(false);
				this.jInternalFrameOrderByMovimientosResumidos.setSelected(false);
				
				this.jInternalFrameOrderByMovimientosResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMovimientosResumidos"));
				
				this.inicializarActualizarBindingTablaOrderByMovimientosResumidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMovimientosResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMovimientosResumidos==null) {
				
				this.jInternalFrameImportacionMovimientosResumidos=new ImportacionJInternalFrame(MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMovimientosResumidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMovimientosResumidos);
				this.jInternalFrameImportacionMovimientosResumidos.setVisible(false);
				this.jInternalFrameImportacionMovimientosResumidos.setSelected(false);


				this.jInternalFrameImportacionMovimientosResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMovimientosResumidos"));
				this.jInternalFrameImportacionMovimientosResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMovimientosResumidos"));
				this.jInternalFrameImportacionMovimientosResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMovimientosResumidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMovimientosResumidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMovimientosResumidos==null) {
				this.jInternalFrameReporteDinamicoMovimientosResumidos=new ReporteDinamicoJInternalFrame(MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMovimientosResumidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMovimientosResumidos);
				this.jInternalFrameReporteDinamicoMovimientosResumidos.setVisible(false);
				this.jInternalFrameReporteDinamicoMovimientosResumidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosResumidos"));
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosResumidos"));
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosResumidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosResumidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMovimientosResumidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMovimientosResumidos);
			
	       	this.jInternalFrameDetalleFormMovimientosResumidos.setVisible(false);
	        this.jInternalFrameDetalleFormMovimientosResumidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormMovimientosResumidos.dispose();
			//this.jInternalFrameDetalleFormMovimientosResumidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMovimientosResumidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMovimientosResumidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoMovimientosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMovimientosResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMovimientosResumidos.setVisible(true);
	        this.jInternalFrameImportacionMovimientosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMovimientosResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMovimientosResumidos.setVisible(true);
	        this.jInternalFrameOrderByMovimientosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMovimientosResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMovimientosResumidos.setVisible(false);
	        this.jInternalFrameOrderByMovimientosResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMovimientosResumidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMovimientosResumidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoMovimientosResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMovimientosResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMovimientosResumidos.setVisible(false);
	        this.jInternalFrameImportacionMovimientosResumidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMovimientosResumidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMovimientosResumidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMovimientosResumidos(true);
			//this.isEsNuevoMovimientosResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMovimientosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosResumidos(false) ;
			
			if(movimientosresumidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosResumidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMovimientosResumidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMovimientosResumidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMovimientosResumidos(true);
			//this.isEsNuevoMovimientosResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.movimientosresumidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMovimientosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMovimientosResumidos(false) ;
			
			if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosResumidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMovimientosResumidos(false);
			
			//if(!this.isEsNuevoMovimientosResumidos) {								
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				
			}
			
			if(this.permiteMantenimiento(this.movimientosresumidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMovimientosResumidos=true;
					this.inicializarActualizarBindingTablaMovimientosResumidos(false);
					this.isEsNuevoMovimientosResumidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMovimientosResumidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMovimientosResumidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMovimientosResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosResumidos(false);
				
				this.habilitarDeshabilitarControlesMovimientosResumidos(false);
			
												
				
				if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMovimientosResumidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMovimientosResumidosActionPerformed(evt,movimientosresumidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMovimientosResumidos(this.movimientosresumidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMovimientosResumidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,movimientosresumidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.movimientosresumidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				this.movimientosresumidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				this.movimientosresumidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.movimientosresumidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MovimientosResumidosModel) this.jTableDatosMovimientosResumidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMovimientosResumidos=true;
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
				this.isEsNuevoMovimientosResumidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMovimientosResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosResumidos(false);
				
				this.habilitarDeshabilitarControlesMovimientosResumidos(false);
				
				
				
				if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMovimientosResumidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMovimientosResumidos.getRowCount()>=1) {
				jTableDatosMovimientosResumidos.removeRowSelectionInterval(0, jTableDatosMovimientosResumidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMovimientosResumidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosResumidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosResumidos(false) ;
			
			this.isEsNuevoMovimientosResumidos=false;
			
			if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMovimientosResumidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMovimientosResumidos(false);
				
				//SI ES MANUAL
				if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMovimientosResumidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMovimientosResumidos--;			
			//MovimientosResumidos movimientosresumidosAux= new MovimientosResumidos();			
			//movimientosresumidosAux.setId(this.iIdNuevoMovimientosResumidos);
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMovimientosResumidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
			
			this.movimientosresumidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.movimientosresumidosLogic.getMovimientosResumidoss().add(this.movimientosresumidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.movimientosresumidoss.add(this.movimientosresumidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			
			this.jTableDatosMovimientosResumidos.setRowSelectionInterval(this.getIndiceNuevoMovimientosResumidos(), this.getIndiceNuevoMovimientosResumidos());
			
			int iLastRow =  this.jTableDatosMovimientosResumidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMovimientosResumidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMovimientosResumidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosResumidos(false);
			
			//SI ES MANUAL
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosResumidos();
			}
			
			//this.abrirFrameTreeMovimientosResumidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMovimientosResumidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMovimientosResumidos.setFileImportacion(this.jInternalFrameImportacionMovimientosResumidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMovimientosResumidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMovimientosResumidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMovimientosResumidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMovimientosResumidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		

		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MovimientosResumidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MovimientosResumidosBaseDesign.jrxml";
			
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
			
			this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_RETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talOtro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talOtro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talOtro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talOtro_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoria="numero_secuencial";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoria="total_descuento";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_RETENCION:
					sNombreCampoCategoria="retencion";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoria="total_otro";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoriaValor="numero_secuencial";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoriaValor="total_descuento";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_RETENCION:
					sNombreCampoCategoriaValor="retencion";
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoriaValor="total_otro";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuencial");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_descuento");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_RETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"retencion");
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_otro");
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
	
	public void jButtonGenerarExcelReporteDinamicoMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MovimientosResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getnumero_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.gettotal_descuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_ICE);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_RETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_RETENCION);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.getretencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO);
					iRow++;

					for(MovimientosResumidos movimientosresumidos:movimientosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosresumidos.gettotal_otro());
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
			//	this.getFilaCabeceraExportarExcelMovimientosResumidos(row);				
			//	iRow++;
			//}				
			
			//for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMovimientosResumidos(movimientosresumidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosResumidos(false);
			
			//SI ES MANUAL
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosResumidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosResumidos(false);
			
			//SI ES MANUAL
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMovimientosResumidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosResumidos(false);
			
			//SI ES MANUAL
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMovimientosResumidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMovimientosResumidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMovimientosResumidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMovimientosResumidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMovimientosResumidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMovimientosResumidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMovimientosResumidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosMovimientosResumidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosMovimientosResumidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMovimientosResumidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMovimientosResumidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMovimientosResumidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMovimientosResumidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMovimientosResumidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMovimientosResumidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosResumidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMovimientosResumidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMovimientosResumidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMovimientosResumidos();
		
		this.inicializarActualizarBindingBotonesManualMovimientosResumidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMovimientosResumidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosResumidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosResumidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosResumidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMovimientosResumidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMovimientosResumidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMovimientosResumidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionNuevoMovimientosResumidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionSinCerrarMovimientosResumidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionSinMensajeMovimientosResumidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMovimientosResumidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMovimientosResumidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMovimientosResumidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
				this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionNuevoMovimientosResumidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionSinCerrarMovimientosResumidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMovimientosResumidos.jCheckBoxPostAccionSinMensajeMovimientosResumidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMovimientosResumidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMovimientosResumidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMovimientosResumidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMovimientosResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMovimientosResumidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMovimientosResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMovimientosResumidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMovimientosResumidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMovimientosResumidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMovimientosResumidos(Boolean esInicializar) throws Exception {
		try	{	
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosResumidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosResumidos() throws Exception {
		try	{
			if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMovimientosResumidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMovimientosResumidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMovimientosResumidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMovimientosResumidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMovimientosResumidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMovimientosResumidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMovimientosResumidos.addItem(reporte);
			}
			
			
			if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMovimientosResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMovimientosResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMovimientosResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMovimientosResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMovimientosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMovimientosResumidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMovimientosResumidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosResumidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosResumidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MovimientosResumidosConstantesFunciones.getTiposSeleccionarMovimientosResumidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MovimientosResumidosConstantesFunciones.getTiposSeleccionarMovimientosResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MovimientosResumidosConstantesFunciones.getTiposSeleccionarMovimientosResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMovimientosResumidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMovimientosResumidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.getSelectedItem()!=null){this.id_transaccionBusquedaMovimientosResumidos=((Transaccion)this.jComboBoxid_transaccionBusquedaMovimientosResumidosMovimientosResumidos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaMovimientosResumidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaMovimientosResumidosMovimientosResumidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaMovimientosResumidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaMovimientosResumidosMovimientosResumidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMovimientosResumidos(Boolean esInicializar) throws Exception {				
		if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMovimientosResumidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMovimientosResumidos() throws Exception {
		this.inicializarActualizarBindingTablaMovimientosResumidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMovimientosResumidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMovimientosResumidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMovimientosResumidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=movimientosresumidosLogic.getMovimientosResumidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=movimientosresumidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMovimientosResumidos.setModel(new MovimientosResumidosModel(this.movimientosresumidosLogic.getMovimientosResumidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMovimientosResumidos.setModel(new MovimientosResumidosModel(this.movimientosresumidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMovimientosResumidos!=null && this.jInternalFrameOrderByMovimientosResumidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMovimientosResumidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,movimientosresumidosConstantesFunciones.resaltarSeleccionarMovimientosResumidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MovimientosResumidosConstantesFunciones.SCLASSWEBTITULO,movimientosresumidosConstantesFunciones.resaltarSeleccionarMovimientosResumidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_ID));

		if(this.movimientosresumidosConstantesFunciones.mostraridMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltaridMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activaridMovimientosResumidos,iSizeTabla,this,true,"idMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltaridMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activaridMovimientosResumidos,this,true,"idMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.movimientosresumidosConstantesFunciones.mostrarnombre_sucursalMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_sucursalMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_sucursalMovimientosResumidos,iSizeTabla,this,true,"nombre_sucursalMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_sucursalMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_sucursalMovimientosResumidos,this,true,"nombre_sucursalMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.movimientosresumidosConstantesFunciones.mostrarnombre_completo_clienteMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_completo_clienteMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_completo_clienteMovimientosResumidos,iSizeTabla,this,true,"nombre_completo_clienteMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_completo_clienteMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_completo_clienteMovimientosResumidos,this,true,"nombre_completo_clienteMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.movimientosresumidosConstantesFunciones.mostrarnombre_transaccionMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_transaccionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_transaccionMovimientosResumidos,iSizeTabla,this,true,"nombre_transaccionMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnombre_transaccionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnombre_transaccionMovimientosResumidos,this,true,"nombre_transaccionMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.movimientosresumidosConstantesFunciones.mostrarnumero_comprobanteMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_comprobanteMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_comprobanteMovimientosResumidos,iSizeTabla,this,true,"numero_comprobanteMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_comprobanteMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_comprobanteMovimientosResumidos,this,true,"numero_comprobanteMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.movimientosresumidosConstantesFunciones.mostrarnumero_facturaMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_facturaMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_facturaMovimientosResumidos,iSizeTabla,this,true,"numero_facturaMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_facturaMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_facturaMovimientosResumidos,this,true,"numero_facturaMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_TOTAL));

		if(this.movimientosresumidosConstantesFunciones.mostrartotalMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltartotalMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotalMovimientosResumidos,iSizeTabla,this,true,"totalMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltartotalMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotalMovimientosResumidos,this,true,"totalMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_IVA));

		if(this.movimientosresumidosConstantesFunciones.mostrarivaMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltarivaMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarivaMovimientosResumidos,iSizeTabla,this,true,"ivaMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarivaMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarivaMovimientosResumidos,this,true,"ivaMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL));

		if(this.movimientosresumidosConstantesFunciones.mostrarnumero_secuencialMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_secuencialMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_secuencialMovimientosResumidos,iSizeTabla,this,true,"numero_secuencialMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarnumero_secuencialMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarnumero_secuencialMovimientosResumidos,this,true,"numero_secuencialMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.movimientosresumidosConstantesFunciones.mostrarfecha_emisionMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.movimientosresumidosConstantesFunciones.resaltarfecha_emisionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarfecha_emisionMovimientosResumidos,iSizeTabla,this,true,"fecha_emisionMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarfecha_emisionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarfecha_emisionMovimientosResumidos,this,true,"fecha_emisionMovimientosResumidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO));

		if(this.movimientosresumidosConstantesFunciones.mostrartotal_descuentoMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltartotal_descuentoMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotal_descuentoMovimientosResumidos,iSizeTabla,this,true,"total_descuentoMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltartotal_descuentoMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotal_descuentoMovimientosResumidos,this,true,"total_descuentoMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_ICE));

		if(this.movimientosresumidosConstantesFunciones.mostrariceMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltariceMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activariceMovimientosResumidos,iSizeTabla,this,true,"iceMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltariceMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activariceMovimientosResumidos,this,true,"iceMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_RETENCION));

		if(this.movimientosresumidosConstantesFunciones.mostrarretencionMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_RETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltarretencionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarretencionMovimientosResumidos,iSizeTabla,this,true,"retencionMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltarretencionMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activarretencionMovimientosResumidos,this,true,"retencionMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO));

		if(this.movimientosresumidosConstantesFunciones.mostrartotal_otroMovimientosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosresumidosConstantesFunciones.resaltartotal_otroMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotal_otroMovimientosResumidos,iSizeTabla,this,true,"total_otroMovimientosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosresumidosConstantesFunciones.resaltartotal_otroMovimientosResumidos,this.movimientosresumidosConstantesFunciones.activartotal_otroMovimientosResumidos,this,true,"total_otroMovimientosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMovimientosResumidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMovimientosResumidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMovimientosResumidos.addColumn(tableColumn);
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
			
			this.jTableDatosMovimientosResumidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMovimientosResumidos.moveColumn(this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMovimientosResumidos.moveColumn(this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMovimientosResumidos.moveColumn(this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMovimientosResumidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMovimientosResumidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMovimientosResumidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMovimientosResumidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMovimientosResumidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMovimientosResumidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMovimientosResumidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=movimientosresumidosLogic.getMovimientosResumidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=movimientosresumidoss.size()-1;
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
		//this.jTableDatosMovimientosResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMovimientosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMovimientosResumidos();
			
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
				
				//this.isEsNuevoMovimientosResumidos=false;
					
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
				if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMovimientosResumidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMovimientosResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMovimientosResumidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.movimientosresumidos.getsType().equals("DUPLICADO")
				   || this.movimientosresumidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMovimientosResumidos=true;
				
				} else {
					this.isEsNuevoMovimientosResumidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
					if(this.movimientosresumidos.getId()>=0 && !this.movimientosresumidos.getIsNew()) {						
						this.isEsNuevoMovimientosResumidos=false;
						
					} else {
						this.isEsNuevoMovimientosResumidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMovimientosResumidos(esRelaciones);						
				
				this.seleccionarMovimientosResumidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.movimientosresumidos.getId()<0) {
					this.isEsNuevoMovimientosResumidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMovimientosResumidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMovimientosResumidos(evt,rowIndex);
				}	
				
				if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MovimientosResumidos: " + this.dDif); 
					}
				}								
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMovimientosResumidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.movimientosresumidos)) {
					if(this.movimientosresumidos.getId()>0) {
						this.movimientosresumidos.setIsDeleted(true);
						
						this.movimientosresumidossEliminados.add(this.movimientosresumidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.movimientosresumidosLogic.getMovimientosResumidoss().remove(this.movimientosresumidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.movimientosresumidoss.remove(this.movimientosresumidos);				
					}
					
					
					((MovimientosResumidosModel) this.jTableDatosMovimientosResumidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosResumidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMovimientosResumidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMovimientosResumidos) {
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMovimientosResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMovimientosResumidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMovimientosResumidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMovimientosResumidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosResumidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMovimientosResumidos(MovimientosResumidos movimientosresumidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMovimientosResumidos(movimientosresumidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMovimientosResumidos(MovimientosResumidos movimientosresumidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMovimientosResumidos(movimientosresumidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMovimientosResumidos(movimientosresumidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMovimientosResumidos(movimientosresumidos);
	}
	
	public void setVariablesObjetoActualToFormularioMovimientosResumidos(MovimientosResumidos movimientosresumidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setText(movimientosresumidos.getId().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setText(movimientosresumidos.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setText(movimientosresumidos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setText(movimientosresumidos.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setText(movimientosresumidos.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setText(movimientosresumidos.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setText(movimientosresumidos.gettotal().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setText(movimientosresumidos.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setText(movimientosresumidos.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setDate(movimientosresumidos.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setText(movimientosresumidos.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setText(movimientosresumidos.getice().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setText(movimientosresumidos.getretencion().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setText(movimientosresumidos.gettotal_otro().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MovimientosResumidos movimientosresumidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,movimientosresumidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MovimientosResumidos movimientosresumidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				movimientosresumidosLocal=this.movimientosresumidos;
			} else {
				movimientosresumidosLocal=this.movimientosresumidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(movimientosresumidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMovimientosResumidos(movimientosresumidosLocal,true);
					
					if(movimientosresumidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(movimientosresumidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(movimientosresumidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMovimientosResumidos(MovimientosResumidos movimientosresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMovimientosResumidos(movimientosresumidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(movimientosresumidos);
	}
	
	public void setVariablesFormularioToObjetoActualMovimientosResumidos(MovimientosResumidos movimientosresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMovimientosResumidos(movimientosresumidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMovimientosResumidos(MovimientosResumidos movimientosresumidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.getText()==null || this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.getText()=="" || this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.getText()=="Id") {
				this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setText("0");
			}

			if(conColumnasBase) {movimientosresumidos.setId(Long.parseLong(this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelIdMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnombre_sucursal(this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_sucursalMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnombre_completo_cliente(this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_completo_clienteMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnombre_transaccion(this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnombre_transaccionMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnumero_comprobante(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_comprobanteMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnumero_factura(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_facturaMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotalMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setiva(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelivaMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setnumero_secuencial(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelnumero_secuencialMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setfecha_emision(this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelfecha_emisionMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.settotal_descuento(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_descuentoMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setice(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeliceMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.setretencion(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_RETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabelretencionMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosresumidos.settotal_otro(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosResumidos.jLabeltotal_otroMovimientosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMovimientosResumidos(MovimientosResumidos movimientosresumidosBean,MovimientosResumidos movimientosresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMovimientosResumidos(MovimientosResumidos movimientosresumidosOrigen,MovimientosResumidos movimientosresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && movimientosresumidosOrigen.getId()!=null && !movimientosresumidosOrigen.getId().equals(0L))) {movimientosresumidos.setId(movimientosresumidosOrigen.getId());}}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getfecha_emision_desde()!=null && !movimientosresumidosOrigen.getfecha_emision_desde().equals(new Date()))) {movimientosresumidos.setfecha_emision_desde(movimientosresumidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getfecha_emision_hasta()!=null && !movimientosresumidosOrigen.getfecha_emision_hasta().equals(new Date()))) {movimientosresumidos.setfecha_emision_hasta(movimientosresumidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnombre_sucursal()!=null && !movimientosresumidosOrigen.getnombre_sucursal().equals(""))) {movimientosresumidos.setnombre_sucursal(movimientosresumidosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnombre_completo_cliente()!=null && !movimientosresumidosOrigen.getnombre_completo_cliente().equals(""))) {movimientosresumidos.setnombre_completo_cliente(movimientosresumidosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnombre_transaccion()!=null && !movimientosresumidosOrigen.getnombre_transaccion().equals(""))) {movimientosresumidos.setnombre_transaccion(movimientosresumidosOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnumero_comprobante()!=null && !movimientosresumidosOrigen.getnumero_comprobante().equals(""))) {movimientosresumidos.setnumero_comprobante(movimientosresumidosOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnumero_factura()!=null && !movimientosresumidosOrigen.getnumero_factura().equals(""))) {movimientosresumidos.setnumero_factura(movimientosresumidosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.gettotal()!=null && !movimientosresumidosOrigen.gettotal().equals(0.0))) {movimientosresumidos.settotal(movimientosresumidosOrigen.gettotal());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getiva()!=null && !movimientosresumidosOrigen.getiva().equals(0.0))) {movimientosresumidos.setiva(movimientosresumidosOrigen.getiva());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getnumero_secuencial()!=null && !movimientosresumidosOrigen.getnumero_secuencial().equals(""))) {movimientosresumidos.setnumero_secuencial(movimientosresumidosOrigen.getnumero_secuencial());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getfecha_emision()!=null && !movimientosresumidosOrigen.getfecha_emision().equals(new Date()))) {movimientosresumidos.setfecha_emision(movimientosresumidosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.gettotal_descuento()!=null && !movimientosresumidosOrigen.gettotal_descuento().equals(0.0))) {movimientosresumidos.settotal_descuento(movimientosresumidosOrigen.gettotal_descuento());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getice()!=null && !movimientosresumidosOrigen.getice().equals(0.0))) {movimientosresumidos.setice(movimientosresumidosOrigen.getice());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.getretencion()!=null && !movimientosresumidosOrigen.getretencion().equals(0.0))) {movimientosresumidos.setretencion(movimientosresumidosOrigen.getretencion());}
			if(conDefault || (!conDefault && movimientosresumidosOrigen.gettotal_otro()!=null && !movimientosresumidosOrigen.gettotal_otro().equals(0.0))) {movimientosresumidos.settotal_otro(movimientosresumidosOrigen.gettotal_otro());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMovimientosResumidos(MovimientosResumidos movimientosresumidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setText(movimientosresumidos.getId().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setText(movimientosresumidos.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setText(movimientosresumidos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setText(movimientosresumidos.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setText(movimientosresumidos.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setText(movimientosresumidos.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setText(movimientosresumidos.gettotal().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setText(movimientosresumidos.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setText(movimientosresumidos.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setDate(movimientosresumidos.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setText(movimientosresumidos.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setText(movimientosresumidos.getice().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setText(movimientosresumidos.getretencion().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setText(movimientosresumidos.gettotal_otro().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMovimientosResumidos(MovimientosResumidosBean movimientosresumidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setText(movimientosresumidosBean.getId().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setText(movimientosresumidosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setText(movimientosresumidosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setText(movimientosresumidosBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setText(movimientosresumidosBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setText(movimientosresumidosBean.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setText(movimientosresumidosBean.gettotal().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setText(movimientosresumidosBean.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setText(movimientosresumidosBean.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setDate(movimientosresumidosBean.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setText(movimientosresumidosBean.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setText(movimientosresumidosBean.getice().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setText(movimientosresumidosBean.getretencion().toString());
			this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setText(movimientosresumidosBean.gettotal_otro().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMovimientosResumidos(MovimientosResumidosParameterReturnGeneral movimientosresumidosReturnGeneral,MovimientosResumidosBean movimientosresumidosBean,Boolean conDefault) throws Exception { 
		try {
			MovimientosResumidos movimientosresumidosLocal=new MovimientosResumidos();
			
			movimientosresumidosLocal=movimientosresumidosReturnGeneral.getMovimientosResumidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && movimientosresumidosLocal.getId()!=null && !movimientosresumidosLocal.getId().equals(0L))) {movimientosresumidosBean.setId(movimientosresumidosLocal.getId());}}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnombre_sucursal()!=null && !movimientosresumidosLocal.getnombre_sucursal().equals(""))) {movimientosresumidosBean.setnombre_sucursal(movimientosresumidosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnombre_completo_cliente()!=null && !movimientosresumidosLocal.getnombre_completo_cliente().equals(""))) {movimientosresumidosBean.setnombre_completo_cliente(movimientosresumidosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnombre_transaccion()!=null && !movimientosresumidosLocal.getnombre_transaccion().equals(""))) {movimientosresumidosBean.setnombre_transaccion(movimientosresumidosLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnumero_comprobante()!=null && !movimientosresumidosLocal.getnumero_comprobante().equals(""))) {movimientosresumidosBean.setnumero_comprobante(movimientosresumidosLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnumero_factura()!=null && !movimientosresumidosLocal.getnumero_factura().equals(""))) {movimientosresumidosBean.setnumero_factura(movimientosresumidosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.gettotal()!=null && !movimientosresumidosLocal.gettotal().equals(0.0))) {movimientosresumidosBean.settotal(movimientosresumidosLocal.gettotal());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getiva()!=null && !movimientosresumidosLocal.getiva().equals(0.0))) {movimientosresumidosBean.setiva(movimientosresumidosLocal.getiva());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getnumero_secuencial()!=null && !movimientosresumidosLocal.getnumero_secuencial().equals(""))) {movimientosresumidosBean.setnumero_secuencial(movimientosresumidosLocal.getnumero_secuencial());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getfecha_emision()!=null && !movimientosresumidosLocal.getfecha_emision().equals(new Date()))) {movimientosresumidosBean.setfecha_emision(movimientosresumidosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.gettotal_descuento()!=null && !movimientosresumidosLocal.gettotal_descuento().equals(0.0))) {movimientosresumidosBean.settotal_descuento(movimientosresumidosLocal.gettotal_descuento());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getice()!=null && !movimientosresumidosLocal.getice().equals(0.0))) {movimientosresumidosBean.setice(movimientosresumidosLocal.getice());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.getretencion()!=null && !movimientosresumidosLocal.getretencion().equals(0.0))) {movimientosresumidosBean.setretencion(movimientosresumidosLocal.getretencion());}
			if(conDefault || (!conDefault && movimientosresumidosLocal.gettotal_otro()!=null && !movimientosresumidosLocal.gettotal_otro().equals(0.0))) {movimientosresumidosBean.settotal_otro(movimientosresumidosLocal.gettotal_otro());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMovimientosResumidosGenerico(Long idMovimientosResumidosSeleccionado,JComboBox jComboBoxMovimientosResumidos,List<MovimientosResumidos> movimientosresumidossLocal)throws Exception {
		try {
			MovimientosResumidos  movimientosresumidosTemp=null;

			for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossLocal) {
				if(movimientosresumidosAux.getId()!=null && movimientosresumidosAux.getId().equals(idMovimientosResumidosSeleccionado)) {
					movimientosresumidosTemp=movimientosresumidosAux;
					break;
				}
			}

			jComboBoxMovimientosResumidos.setSelectedItem(movimientosresumidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMovimientosResumidosGenerico(JComboBox jComboBoxMovimientosResumidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMovimientosResumidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMovimientosResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMovimientosResumidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMovimientosResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMovimientosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMovimientosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosresumidos=(MovimientosResumidos) movimientosresumidosLogic.getMovimientosResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			movimientosresumidos =(MovimientosResumidos) movimientosresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!movimientosresumidos.getIsNew() && !movimientosresumidos.getIsChanged() && !movimientosresumidos.getIsDeleted()) {
				sDescripcion=movimientosresumidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosresumidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!movimientosresumidos.getIsNew() && !movimientosresumidos.getIsChanged() && !movimientosresumidos.getIsDeleted()) {
				sDescripcion=movimientosresumidos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosresumidos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!movimientosresumidos.getIsNew() && !movimientosresumidos.getIsChanged() && !movimientosresumidos.getIsDeleted()) {
				sDescripcion=movimientosresumidos.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosresumidos.gettransaccion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MovimientosResumidos movimientosresumidosRow=new MovimientosResumidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosresumidosRow=(MovimientosResumidos) movimientosresumidosLogic.getMovimientosResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			movimientosresumidosRow=(MovimientosResumidos) movimientosresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMovimientosResumidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));			
			this.jButtonDuplicarMovimientosResumidos.setVisible((this.isVisibilidadCeldaDuplicarMovimientosResumidos && this.isPermisoDuplicarMovimientosResumidos));			
			this.jButtonCopiarMovimientosResumidos.setVisible((this.isVisibilidadCeldaCopiarMovimientosResumidos && this.isPermisoCopiarMovimientosResumidos));
			this.jButtonVerFormMovimientosResumidos.setVisible((this.isVisibilidadCeldaVerFormMovimientosResumidos && this.isPermisoVerFormMovimientosResumidos));
			
			this.jButtonAbrirOrderByMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));			
			
			this.jButtonNuevoRelacionesMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));			
			this.jButtonNuevoGuardarCambiosMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarMovimientosResumidos.setVisible((this.isVisibilidadCeldaModificarMovimientosResumidos && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.setVisible((this.isVisibilidadCeldaActualizarMovimientosResumidos && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.setVisible((this.isVisibilidadCeldaEliminarMovimientosResumidos && this.isPermisoEliminarMovimientosResumidos));
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.setVisible(this.isVisibilidadCeldaCancelarMovimientosResumidos);							
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));						
			this.jButtonDuplicarToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaDuplicarMovimientosResumidos && this.isPermisoDuplicarMovimientosResumidos));						
			this.jButtonCopiarToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaCopiarMovimientosResumidos && this.isPermisoCopiarMovimientosResumidos));			
			this.jButtonVerFormToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaVerFormMovimientosResumidos && this.isPermisoVerFormMovimientosResumidos));			
			this.jButtonAbrirOrderByToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));
			this.jButtonNuevoRelacionesToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));			
			this.jButtonNuevoGuardarCambiosToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));			
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaModificarMovimientosResumidos && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaActualizarMovimientosResumidos  && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaEliminarMovimientosResumidos && this.isPermisoEliminarMovimientosResumidos));
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarToolBarMovimientosResumidos.setVisible(this.isVisibilidadCeldaCancelarMovimientosResumidos);				
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));			
			this.jMenuItemDuplicarMovimientosResumidos.setVisible((this.isVisibilidadCeldaDuplicarMovimientosResumidos && this.isPermisoDuplicarMovimientosResumidos));			
			this.jMenuItemCopiarMovimientosResumidos.setVisible((this.isVisibilidadCeldaCopiarMovimientosResumidos && this.isPermisoCopiarMovimientosResumidos));			
			this.jMenuItemVerFormMovimientosResumidos.setVisible((this.isVisibilidadCeldaVerFormMovimientosResumidos && this.isPermisoVerFormMovimientosResumidos));			
			this.jMenuItemAbrirOrderByMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));			
			//this.jMenuItemMostrarOcultarMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));
			this.jMenuItemDetalleAbrirOrderByMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));			
			//this.jMenuItemDetalleMostrarOcultarMovimientosResumidos.setVisible((this.isVisibilidadCeldaOrdenMovimientosResumidos && this.isPermisoOrdenMovimientosResumidos));			
			this.jMenuItemNuevoRelacionesMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos));			
			this.jMenuItemNuevoGuardarCambiosMovimientosResumidos.setVisible((this.isVisibilidadCeldaNuevoMovimientosResumidos && this.isPermisoNuevoMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));									
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemModificarMovimientosResumidos.setVisible((this.isVisibilidadCeldaModificarMovimientosResumidos && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemActualizarMovimientosResumidos.setVisible((this.isVisibilidadCeldaActualizarMovimientosResumidos && this.isPermisoActualizarMovimientosResumidos));	
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemEliminarMovimientosResumidos.setVisible((this.isVisibilidadCeldaEliminarMovimientosResumidos && this.isPermisoEliminarMovimientosResumidos));
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemCancelarMovimientosResumidos.setVisible(this.isVisibilidadCeldaCancelarMovimientosResumidos);				
			}
			
			this.jMenuItemGuardarCambiosMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));						
			this.jMenuItemGuardarCambiosTablaMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=this.jButtonNuevoMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaDuplicarMovimientosResumidos=this.jButtonDuplicarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaCopiarMovimientosResumidos=this.jButtonCopiarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaVerFormMovimientosResumidos=this.jButtonVerFormMovimientosResumidos.isVisible();
			
			this.isVisibilidadCeldaOrdenMovimientosResumidos=this.jButtonAbrirOrderByMovimientosResumidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=this.jButtonNuevoRelacionesMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaModificarMovimientosResumidos=this.jButtonModificarMovimientosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.isVisibilidadCeldaActualizarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=this.jButtonGuardarCambiosTablaMovimientosResumidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMovimientosResumidos=this.jButtonNuevoToolBarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=this.jButtonNuevoRelacionesToolBarMovimientosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.isVisibilidadCeldaModificarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarToolBarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaActualizarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarToolBarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarToolBarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarToolBarMovimientosResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMovimientosResumidos=this.jButtonGuardarCambiosToolBarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMovimientosResumidos=this.jMenuItemNuevoMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=this.jMenuItemNuevoRelacionesMovimientosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.isVisibilidadCeldaModificarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemModificarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaActualizarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemActualizarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemEliminarMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosResumidos=this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemCancelarMovimientosResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMovimientosResumidos=this.jMenuItemGuardarCambiosMovimientosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=this.jMenuItemGuardarCambiosTablaMovimientosResumidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMovimientosResumidos(Boolean esInicializar) {
		if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
				//if(this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMovimientosResumidos();
			}
			
			this.inicializarActualizarBindingBotonesManualMovimientosResumidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMovimientosResumidos() {
		this.jButtonNuevoMovimientosResumidos.setVisible(this.isPermisoNuevoMovimientosResumidos);			
		this.jButtonDuplicarMovimientosResumidos.setVisible(this.isPermisoDuplicarMovimientosResumidos);			
		this.jButtonCopiarMovimientosResumidos.setVisible(this.isPermisoCopiarMovimientosResumidos);			
		this.jButtonVerFormMovimientosResumidos.setVisible(this.isPermisoVerFormMovimientosResumidos);			
		
		this.jButtonAbrirOrderByMovimientosResumidos.setVisible(this.isPermisoOrdenMovimientosResumidos);					
		
		this.jButtonNuevoRelacionesMovimientosResumidos.setVisible(this.isPermisoNuevoMovimientosResumidos);			
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarMovimientosResumidos.setVisible(this.isPermisoActualizarMovimientosResumidos);	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.setVisible(this.isPermisoActualizarMovimientosResumidos);	
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.setVisible(this.isPermisoEliminarMovimientosResumidos);
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.setVisible(this.isVisibilidadCeldaCancelarMovimientosResumidos);						
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.setVisible(this.isPermisoGuardarCambiosMovimientosResumidos);							
		}
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.setVisible(this.isPermisoActualizarMovimientosResumidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMovimientosResumidos() {
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarMovimientosResumidos.setVisible(this.isPermisoActualizarMovimientosResumidos);	
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.setVisible(this.isPermisoActualizarMovimientosResumidos);	
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.setVisible(this.isPermisoEliminarMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.setVisible(this.isVisibilidadCeldaCancelarMovimientosResumidos);							
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.setVisible((this.isVisibilidadCeldaGuardarMovimientosResumidos && this.isPermisoGuardarCambiosMovimientosResumidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMovimientosResumidos() {
		if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMovimientosResumidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMovimientosResumidos() {
	}
	
	public void jTableDatosMovimientosResumidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMovimientosResumidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.movimientosresumidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMovimientosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMovimientosResumidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.movimientosresumidosLogic.getConnexion());

				if(this.movimientosresumidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.movimientosresumidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosResumidos=(TitledBorder)this.jScrollPanelDatosMovimientosResumidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMovimientosResumidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.movimientosresumidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMovimientosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMovimientosResumidos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.movimientosresumidosLogic.getConnexion());

				if(this.movimientosresumidos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.movimientosresumidos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosResumidos=(TitledBorder)this.jScrollPanelDatosMovimientosResumidos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMovimientosResumidos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.movimientosresumidos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionMovimientosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebMovimientosResumidos(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.movimientosresumidosLogic.getConnexion());

				if(this.movimientosresumidos.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.movimientosresumidos.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosResumidos=(TitledBorder)this.jScrollPanelDatosMovimientosResumidos.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderMovimientosResumidos.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.movimientosresumidos.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.movimientosresumidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.movimientosresumidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.movimientosresumidos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.movimientosresumidos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.movimientosresumidos.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.movimientosresumidos.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.movimientosresumidos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.movimientosresumidos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.movimientosresumidos.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getnumero_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuencial like '%"+this.movimientosresumidos.getnumero_secuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.movimientosresumidos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_descuentoMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.gettotal_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_descuento = "+this.movimientosresumidos.gettotal_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.movimientosresumidos.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonretencionMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.getretencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where retencion = "+this.movimientosresumidos.getretencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_otroMovimientosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.getmovimientosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosresumidos==null) {
						this.movimientosresumidos = new MovimientosResumidos();
					}

					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);
				}

				if(this.movimientosresumidos.gettotal_otro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_otro = "+this.movimientosresumidos.gettotal_otro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaMovimientosResumidosMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosResumidos(false,false);

			this.getMovimientosResumidossBusquedaMovimientosResumidos();

			this.inicializarActualizarBindingMovimientosResumidos(false);

			//if(MovimientosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosResumidos(false,false);

			this.getMovimientosResumidossFK_IdEmpresa();

			this.inicializarActualizarBindingMovimientosResumidos(false);

			//if(MovimientosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosResumidos(false,false);

			this.getMovimientosResumidossFK_IdSucursal();

			this.inicializarActualizarBindingMovimientosResumidos(false);

			//if(MovimientosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionMovimientosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosResumidos(false,false);

			this.getMovimientosResumidossFK_IdTransaccion();

			this.inicializarActualizarBindingMovimientosResumidos(false);

			//if(MovimientosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMovimientosResumidos() {
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
			this.jInternalFrameDetalleFormMovimientosResumidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormMovimientosResumidos.dispose();
			this.jInternalFrameDetalleFormMovimientosResumidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
			this.jInternalFrameReporteDinamicoMovimientosResumidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMovimientosResumidos.dispose();
			this.jInternalFrameReporteDinamicoMovimientosResumidos=null;
		}
		
		if(this.jInternalFrameImportacionMovimientosResumidos!=null) {
			this.jInternalFrameImportacionMovimientosResumidos.setVisible(false);	    			
			this.jInternalFrameImportacionMovimientosResumidos.dispose();
			this.jInternalFrameImportacionMovimientosResumidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMovimientosResumidos();
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMovimientosResumidos")) {
				jButtonDuplicarMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMovimientosResumidos")) {
				jButtonCopiarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormMovimientosResumidos")) {
				jButtonVerFormMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMovimientosResumidos")) {
				jButtonDuplicarMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMovimientosResumidos")) {
				jButtonDuplicarMovimientosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMovimientosResumidos")) {
				jButtonModificarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMovimientosResumidos")) {
				jButtonModificarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMovimientosResumidos")) {
				jButtonModificarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMovimientosResumidos")) {
				jButtonActualizarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMovimientosResumidos")) {
				jButtonActualizarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMovimientosResumidos")) {
				jButtonActualizarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarMovimientosResumidos")) {
				jButtonEliminarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMovimientosResumidos")) {
				jButtonEliminarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMovimientosResumidos")) {
				jButtonEliminarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarMovimientosResumidos")) {
				jButtonCancelarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMovimientosResumidos")) {
				jButtonCancelarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMovimientosResumidos")) {
				jButtonCancelarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarMovimientosResumidos")) {
				jButtonCerrarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMovimientosResumidos")) {
				jButtonCerrarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMovimientosResumidos")) {
				jButtonCerrarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMovimientosResumidos")) {
				jButtonMostrarOcultarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMovimientosResumidos")) {
				jButtonCancelarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMovimientosResumidos")) {
				jButtonCopiarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMovimientosResumidos")) {
				jButtonVerFormMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMovimientosResumidos")) {
				jButtonCopiarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMovimientosResumidos")) {
				jButtonVerFormMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMovimientosResumidos")) {
				jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMovimientosResumidos")) {
				jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMovimientosResumidos")) {
				jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMovimientosResumidos")) {
				jButtonAnterioresMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMovimientosResumidos")) {
				jButtonAnterioresMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMovimientosResumidos")) {
				jButtonAnterioresMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMovimientosResumidos")) {
				jButtonSiguientesMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMovimientosResumidos")) {
				jButtonSiguientesMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMovimientosResumidos")) {
				jButtonSiguientesMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMovimientosResumidos") || sTipo.equals("MenuItemDetalleAbrirOrderByMovimientosResumidos")) {
				jButtonAbrirOrderByMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMovimientosResumidos") || sTipo.equals("MenuItemDetalleMostrarOcultarMovimientosResumidos")) {
				jButtonMostrarOcultarMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMovimientosResumidos")) {
				jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMovimientosResumidos")) {
				jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMovimientosResumidos")) {
				jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMovimientosResumidos")) {
				jButtonCerrarReporteDinamicoMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMovimientosResumidos")) {
				jButtonGenerarReporteDinamicoMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMovimientosResumidos")) {
				
				jButtonGenerarExcelReporteDinamicoMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMovimientosResumidos")) {
				jButtonCerrarImportacionMovimientosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMovimientosResumidos")) {
				
				jButtonGenerarImportacionMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMovimientosResumidos")) {
				
				jButtonAbrirImportacionMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMovimientosResumidos")) {
				jComboBoxTiposAccionesMovimientosResumidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMovimientosResumidos")) {
				jComboBoxTiposRelacionesMovimientosResumidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMovimientosResumidos")) {
				jComboBoxTiposAccionesMovimientosResumidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMovimientosResumidos")) {
				
				jComboBoxTiposSeleccionarMovimientosResumidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMovimientosResumidos")) {
				jTextFieldValorCampoGeneralMovimientosResumidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMovimientosResumidos")) {
				jButtonAbrirOrderByMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMovimientosResumidos")) {
				jButtonAbrirOrderByMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMovimientosResumidos")) {
				jButtonCerrarOrderByMovimientosResumidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMovimientosResumidosBusqueda")) {
				this.jButtonidMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMovimientosResumidosUpdate")) {
				this.jButtonid_empresaMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMovimientosResumidosBusqueda")) {
				this.jButtonid_empresaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMovimientosResumidosUpdate")) {
				this.jButtonid_sucursalMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMovimientosResumidosBusqueda")) {
				this.jButtonid_sucursalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionMovimientosResumidosUpdate")) {
				this.jButtonid_transaccionMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionMovimientosResumidosBusqueda")) {
				this.jButtonid_transaccionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMovimientosResumidosBusqueda")) {
				this.jButtonnombre_sucursalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteMovimientosResumidosBusqueda")) {
				this.jButtonnombre_completo_clienteMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionMovimientosResumidosBusqueda")) {
				this.jButtonnombre_transaccionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteMovimientosResumidosBusqueda")) {
				this.jButtonnumero_comprobanteMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaMovimientosResumidosBusqueda")) {
				this.jButtonnumero_facturaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalMovimientosResumidosBusqueda")) {
				this.jButtontotalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaMovimientosResumidosBusqueda")) {
				this.jButtonivaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialMovimientosResumidosBusqueda")) {
				this.jButtonnumero_secuencialMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emisionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoMovimientosResumidosBusqueda")) {
				this.jButtontotal_descuentoMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceMovimientosResumidosBusqueda")) {
				this.jButtoniceMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("retencionMovimientosResumidosBusqueda")) {
				this.jButtonretencionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroMovimientosResumidosBusqueda")) {
				this.jButtontotal_otroMovimientosResumidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaMovimientosResumidosMovimientosResumidos")) {
				this.jButtonBusquedaMovimientosResumidosMovimientosResumidosActionPerformed(evt);
			}
			
			;
			
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMovimientosResumidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MovimientosResumidos movimientosresumidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				movimientosresumidosLocal=this.movimientosresumidos;
			} else {
				movimientosresumidosLocal=this.movimientosresumidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
							
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
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
			
			


			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
								
						
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
								
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
							
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
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
			
			


			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
								
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMovimientosResumidos")) {
					jCheckBoxSeleccionarTodosMovimientosResumidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMovimientosResumidos")) {
					jCheckBoxSeleccionadosMovimientosResumidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMovimientosResumidos")) {
					
				}
				
				


				
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
												
				
				


				
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
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
			
			


			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosresumidos);
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
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
				
				


				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosResumidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosresumidosAnterior =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMovimientosResumidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMovimientosResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMovimientosResumidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.movimientosresumidos =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.movimientosresumidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMovimientosResumidos")) {
				
				}
				
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMovimientosResumidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMovimientosResumidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMovimientosResumidos")) {
			
			}
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMovimientosResumidos();
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			if(sTipo.equals("NuevoMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMovimientosResumidos")) {
				jButtonDuplicarMovimientosResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMovimientosResumidos")) {
				jButtonCopiarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMovimientosResumidos")) {
				jButtonVerFormMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMovimientosResumidos")) {
				jButtonNuevoMovimientosResumidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMovimientosResumidos")) {
				jButtonModificarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMovimientosResumidos")) {
				jButtonActualizarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMovimientosResumidos")) {
				jButtonEliminarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMovimientosResumidos")) {
				jButtonCancelarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMovimientosResumidos")) {
				jButtonCerrarMovimientosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMovimientosResumidos")) {
				jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMovimientosResumidos")) {
				jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMovimientosResumidos")) {
				jButtonAbrirOrderByMovimientosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMovimientosResumidos")) {
				jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMovimientosResumidos")) {
				jButtonAnterioresMovimientosResumidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMovimientosResumidos")) {
				jButtonSiguientesMovimientosResumidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMovimientosResumidosBusqueda")) {
				this.jButtonidMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMovimientosResumidosUpdate")) {
				this.jButtonid_empresaMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMovimientosResumidosBusqueda")) {
				this.jButtonid_empresaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMovimientosResumidosUpdate")) {
				this.jButtonid_sucursalMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMovimientosResumidosBusqueda")) {
				this.jButtonid_sucursalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionMovimientosResumidosUpdate")) {
				this.jButtonid_transaccionMovimientosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionMovimientosResumidosBusqueda")) {
				this.jButtonid_transaccionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMovimientosResumidosBusqueda")) {
				this.jButtonnombre_sucursalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteMovimientosResumidosBusqueda")) {
				this.jButtonnombre_completo_clienteMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionMovimientosResumidosBusqueda")) {
				this.jButtonnombre_transaccionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteMovimientosResumidosBusqueda")) {
				this.jButtonnumero_comprobanteMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaMovimientosResumidosBusqueda")) {
				this.jButtonnumero_facturaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalMovimientosResumidosBusqueda")) {
				this.jButtontotalMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaMovimientosResumidosBusqueda")) {
				this.jButtonivaMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialMovimientosResumidosBusqueda")) {
				this.jButtonnumero_secuencialMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMovimientosResumidosBusqueda")) {
				this.jButtonfecha_emisionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoMovimientosResumidosBusqueda")) {
				this.jButtontotal_descuentoMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceMovimientosResumidosBusqueda")) {
				this.jButtoniceMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("retencionMovimientosResumidosBusqueda")) {
				this.jButtonretencionMovimientosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroMovimientosResumidosBusqueda")) {
				this.jButtontotal_otroMovimientosResumidosBusquedaActionPerformed(evt);
			}
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMovimientosResumidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMovimientosResumidos")) {
				closingInternalFrameMovimientosResumidos();
				
			} else if(sTipo.equals("jButtonCancelarMovimientosResumidos")) {
				JInternalFrameBase jInternalFrameDetalleFormMovimientosResumidos = (JInternalFrameBase)evt.getSource();
	            	
	            MovimientosResumidosBeanSwingJInternalFrame jInternalFrameParent=(MovimientosResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormMovimientosResumidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMovimientosResumidosActionPerformed(null);
			}
			
			MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.movimientosresumidos,new Object(),this.movimientosresumidosParameterGeneral,this.movimientosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMovimientosResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMovimientosResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMovimientosResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.movimientosresumidos)) {
			if(!esControlTabla) {
				if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);			
				}
				
				if(this.movimientosresumidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMovimientosResumidos(this.movimientosresumidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMovimientosResumidos(this.movimientosresumidosReturnGeneral,this.movimientosresumidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.movimientosresumidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMovimientosResumidos(classes,this.movimientosresumidosReturnGeneral,this.movimientosresumidosBean,false);
					}
						
					if(this.movimientosresumidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos());	
					}
						
					if(this.movimientosresumidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidosReturnGeneral.getMovimientosResumidos(),classes);//this.movimientosresumidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMovimientosResumidos(this.movimientosresumidos,classes);//this.movimientosresumidosBean);									
				}
			
				if(MovimientosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMovimientosResumidos(this.movimientosresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosResumidos(this.movimientosresumidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.movimientosresumidosAnterior!=null) {
						this.movimientosresumidos=this.movimientosresumidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.movimientosresumidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.movimientosresumidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.movimientosresumidosReturnGeneral.getMovimientosResumidos(),movimientosresumidosLogic.getMovimientosResumidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.movimientosresumidosReturnGeneral.getMovimientosResumidos(),this.movimientosresumidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMovimientosResumidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosMovimientosResumidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMovimientosResumidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosMovimientosResumidos() throws Exception {
		
		MovimientosResumidosModel movimientosresumidosModel=(MovimientosResumidosModel)this.jTableDatosMovimientosResumidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosresumidosModel.movimientosresumidoss=this.movimientosresumidosLogic.getMovimientosResumidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			movimientosresumidosModel.movimientosresumidoss=this.movimientosresumidoss;
		}
		
		
		((MovimientosResumidosModel) this.jTableDatosMovimientosResumidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMovimientosResumidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmovimientosresumidosAnterior(),this.movimientosresumidosLogic.getMovimientosResumidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmovimientosresumidosAnterior(),this.movimientosresumidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMovimientosResumidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMovimientosResumidos(MovimientosResumidos movimientosresumidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
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
										
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.movimientosresumidos,new Object(),generalEntityParameterGeneral,this.movimientosresumidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.movimientosresumidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MovimientosResumidosConstantesFunciones.getClassesRelationshipsOfMovimientosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MovimientosResumidosConstantesFunciones.getClassesRelationshipsFromStringsOfMovimientosResumidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMovimientosResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MovimientosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.movimientosresumidos,new Object(),generalEntityParameterGeneral,this.movimientosresumidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMovimientosResumidos(MovimientosResumidosBean movimientosresumidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMovimientosResumidos(ArrayList<Classe> classes,MovimientosResumidosReturnGeneral movimientosresumidosReturnGeneral,MovimientosResumidosBean movimientosresumidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMovimientosResumidos(MovimientosResumidos movimientosresumidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.movimientosresumidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMovimientosResumidos = new MovimientosResumidosDetalleFormJInternalFrame(jDesktopPane,this.movimientosresumidosSessionBean.getConGuardarRelaciones(),this.movimientosresumidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.setVisible(false);
		this.jInternalFrameDetalleFormMovimientosResumidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormMovimientosResumidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMovimientosResumidos.movimientosresumidosLogic=this.movimientosresumidosLogic;
		
		this.cargarCombosFrameForeignKeyMovimientosResumidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMovimientosResumidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMovimientosResumidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMovimientosResumidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMovimientosResumidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMovimientosResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMovimientosResumidos"));
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ModificarMovimientosResumidos"));

		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarMovimientosResumidos"));
					
		this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemModificarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarMovimientosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"ActualizarMovimientosResumidos"));
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMovimientosResumidos"));
						
		this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemActualizarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMovimientosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"EliminarMovimientosResumidos"));
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarMovimientosResumidos"));
								
		this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemEliminarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMovimientosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CancelarMovimientosResumidos"));
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarMovimientosResumidos"));
					
		this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemCancelarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMovimientosResumidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemDetalleCerrarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMovimientosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosResumidos"));
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosResumidos"));
		
		
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMovimientosResumidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonidMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_comprobanteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_facturaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonivaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_secuencialMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emisionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_descuentoMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtoniceMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonretencionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"retencionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_otroMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroMovimientosResumidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMovimientosResumidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMovimientosResumidos"));
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMovimientosResumidos"));
		}
		
		this.jTableDatosMovimientosResumidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMovimientosResumidos"));
		
		this.jTableDatosMovimientosResumidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMovimientosResumidos"));
		
		this.jButtonNuevoMovimientosResumidos.addActionListener(new ButtonActionListener(this,"NuevoMovimientosResumidos"));
		
		this.jButtonDuplicarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"DuplicarMovimientosResumidos"));
		
		this.jButtonCopiarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"CopiarMovimientosResumidos"));
		
		this.jButtonVerFormMovimientosResumidos.addActionListener(new ButtonActionListener(this,"VerFormMovimientosResumidos"));
		
		
		this.jButtonNuevoToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarMovimientosResumidos"));
			
		this.jButtonDuplicarToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMovimientosResumidos"));
			
		this.jMenuItemNuevoMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMovimientosResumidos"));
			
		this.jMenuItemDuplicarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMovimientosResumidos"));		
		
		
		this.jButtonNuevoRelacionesMovimientosResumidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMovimientosResumidos"));
		
		
		this.jButtonNuevoRelacionesToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMovimientosResumidos"));
			
		this.jMenuItemNuevoRelacionesMovimientosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMovimientosResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ModificarMovimientosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonModificarToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarMovimientosResumidos"));
			
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemModificarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarMovimientosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"ActualizarMovimientosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonActualizarToolBarMovimientosResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMovimientosResumidos"));
				
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemActualizarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMovimientosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"EliminarMovimientosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonEliminarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarMovimientosResumidos"));
						
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemEliminarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMovimientosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CancelarMovimientosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonCancelarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarMovimientosResumidos"));
			
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemCancelarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMovimientosResumidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMovimientosResumidos"));		
		
		
		this.jButtonCerrarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CerrarMovimientosResumidos"));
		
		
		this.jButtonCerrarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarMovimientosResumidos"));
			
		this.jMenuItemCerrarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMovimientosResumidos"));
			
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jMenuItemDetalleCerrarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMovimientosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosMovimientosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosResumidos"));
		}
		
		this.jButtonCopiarToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarMovimientosResumidos"));
			
		this.jButtonVerFormToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarMovimientosResumidos"));
		
		this.jMenuItemGuardarCambiosMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMovimientosResumidos"));
			
		this.jMenuItemCopiarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMovimientosResumidos"));		
		
		this.jMenuItemVerFormMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMovimientosResumidos"));		
		
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMovimientosResumidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMovimientosResumidos"));
			
		this.jMenuItemGuardarCambiosTablaMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMovimientosResumidos"));		
		
		
		
		this.jButtonRecargarInformacionMovimientosResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionMovimientosResumidos"));
					
		this.jButtonRecargarInformacionToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMovimientosResumidos"));
		
		this.jMenuItemRecargarInformacionMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMovimientosResumidos"));		
		
		
		
		this.jButtonAnterioresMovimientosResumidos.addActionListener (new ButtonActionListener(this,"AnterioresMovimientosResumidos"));
		
		
		this.jButtonAnterioresToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMovimientosResumidos"));
		
		this.jMenuItemAnterioresMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMovimientosResumidos"));		
		
		
		this.jButtonSiguientesMovimientosResumidos.addActionListener (new ButtonActionListener(this,"SiguientesMovimientosResumidos"));
		
		
		this.jButtonSiguientesToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMovimientosResumidos"));
			
		this.jMenuItemSiguientesMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMovimientosResumidos"));
			
		this.jMenuItemAbrirOrderByMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMovimientosResumidos"));
			
		this.jMenuItemMostrarOcultarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMovimientosResumidos"));
			
		this.jMenuItemDetalleAbrirOrderByMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMovimientosResumidos"));
			
		this.jMenuItemDetalleMostarOcultarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMovimientosResumidos"));		
		
		
		this.jButtonNuevoGuardarCambiosMovimientosResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMovimientosResumidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMovimientosResumidos"));
			
		this.jMenuItemNuevoGuardarCambiosMovimientosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMovimientosResumidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMovimientosResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMovimientosResumidos"));

		this.jCheckBoxSeleccionadosMovimientosResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMovimientosResumidos"));
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMovimientosResumidos"));
		}
		
		
		this.jComboBoxTiposRelacionesMovimientosResumidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesMovimientosResumidos"));
			
		this.jComboBoxTiposAccionesMovimientosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesMovimientosResumidos"));
					
		this.jComboBoxTiposSeleccionarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMovimientosResumidos"));
			
		this.jTextFieldValorCampoGeneralMovimientosResumidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMovimientosResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonidMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_comprobanteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_facturaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonivaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_secuencialMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emisionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_descuentoMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtoniceMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonretencionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"retencionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_otroMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroMovimientosResumidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaMovimientosResumidosMovimientosResumidos.addActionListener(new ButtonActionListener(this,"BusquedaMovimientosResumidosMovimientosResumidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMovimientosResumidos!=null) {
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosResumidos"));
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosResumidos"));
				this.jInternalFrameReporteDinamicoMovimientosResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosResumidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoMovimientosResumidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosResumidos"));				
			//this.jButtonGenerarReporteDinamicoMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosResumidos"));
			//this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosResumidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMovimientosResumidos!=null) {
				this.jInternalFrameImportacionMovimientosResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMovimientosResumidos"));
				this.jInternalFrameImportacionMovimientosResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMovimientosResumidos"));
				this.jInternalFrameImportacionMovimientosResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMovimientosResumidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMovimientosResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByMovimientosResumidos"));
			
			this.jButtonAbrirOrderByToolBarMovimientosResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMovimientosResumidos"));			
			
			if(this.jInternalFrameOrderByMovimientosResumidos!=null) {
				this.jInternalFrameOrderByMovimientosResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMovimientosResumidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosResumidos.jTabbedPaneRelacionesMovimientosResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMovimientosResumidos"));
		
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
            		closingInternalFrameMovimientosResumidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMovimientosResumidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMovimientosResumidos = (JInternalFrameBase)event.getSource();
	            	
	            MovimientosResumidosBeanSwingJInternalFrame jInternalFrameParent=(MovimientosResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormMovimientosResumidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMovimientosResumidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMovimientosResumidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMovimientosResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMovimientosResumidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMovimientosResumidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMovimientosResumidos";
		inputMap = this.jButtonNuevoMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMovimientosResumidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMovimientosResumidos";
		inputMap = this.jButtonNuevoRelacionesMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMovimientosResumidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMovimientosResumidos";
		inputMap = this.jButtonModificarMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMovimientosResumidos";
		inputMap = this.jButtonActualizarMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMovimientosResumidos";
		inputMap = this.jButtonEliminarMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMovimientosResumidos";
		inputMap = this.jButtonCancelarMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMovimientosResumidos";
		inputMap = this.jButtonCerrarMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMovimientosResumidos";
		inputMap = this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonGuardarCambiosMovimientosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMovimientosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMovimientosResumidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMovimientosResumidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMovimientosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMovimientosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMovimientosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMovimientosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMovimientosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMovimientosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonidMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_empresaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonid_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_desdeMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emision_hastaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_sucursalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_completo_clienteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnombre_transaccionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_comprobanteMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_facturaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotalMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonivaMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonnumero_secuencialMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonfecha_emisionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_descuentoMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtoniceMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtonretencionMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"retencionMovimientosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosResumidos.jButtontotal_otroMovimientosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroMovimientosResumidosBusqueda"));
		
		
		this.jButtonBusquedaMovimientosResumidosMovimientosResumidos.addActionListener(new ButtonActionListener(this,"BusquedaMovimientosResumidosMovimientosResumidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMovimientosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMovimientosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMovimientosResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMovimientosResumidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMovimientosResumidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
					movimientosresumidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosResumidos movimientosresumidosAux:movimientosresumidoss) {
					movimientosresumidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMovimientosResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
						movimientosresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosResumidos movimientosresumidosAux:movimientosresumidoss) {
						movimientosresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosResumidos movimientosresumidosAux:movimientosresumidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMovimientosResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMovimientosResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMovimientosResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMovimientosResumidos.getSelectedRows();
			
			MovimientosResumidos movimientosresumidosLocal=new MovimientosResumidos();
			
			//this.seleccionarTodosMovimientosResumidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					movimientosresumidosLocal =(MovimientosResumidos) this.movimientosresumidosLogic.getMovimientosResumidoss().toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					movimientosresumidosLocal =(MovimientosResumidos) this.movimientosresumidoss.toArray()[this.jTableDatosMovimientosResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				movimientosresumidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
						movimientosresumidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosResumidos movimientosresumidosAux:movimientosresumidoss) {
						movimientosresumidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMovimientosResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMovimientosResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMovimientosResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMovimientosResumidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMovimientosResumidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMovimientosResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMovimientosResumidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidosLogic.getMovimientosResumidoss()) {
				
						if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							movimientosresumidosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							movimientosresumidosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							movimientosresumidosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							movimientosresumidosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							movimientosresumidosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							movimientosresumidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							movimientosresumidosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							movimientosresumidosAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							movimientosresumidosAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_ICE)) {
							existe=true;
							movimientosresumidosAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_RETENCION)) {
							existe=true;
							movimientosresumidosAux.setretencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							movimientosresumidosAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosResumidos movimientosresumidosAux:movimientosresumidoss) {
					
						if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							movimientosresumidosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							movimientosresumidosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							movimientosresumidosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							movimientosresumidosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							movimientosresumidosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							movimientosresumidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							movimientosresumidosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							movimientosresumidosAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							movimientosresumidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							movimientosresumidosAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_ICE)) {
							existe=true;
							movimientosresumidosAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_RETENCION)) {
							existe=true;
							movimientosresumidosAux.setretencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							movimientosresumidosAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMovimientosResumidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMovimientosResumidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMovimientosResumidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMovimientosResumidos) {				
					conSplash=true;//false;										
					
					//this.startProcessMovimientosResumidos(conSplash);
				
					this.generarReporteMovimientosResumidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMovimientosResumidossSeleccionados();
				//this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMovimientosResumidossSeleccionados(false);
				//this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMovimientosResumidossSeleccionados(true);
				//this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMovimientosResumidos();
				
				this.exportarMovimientosResumidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMovimientosResumidoss();
				//this.importarMovimientosResumidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMovimientosResumidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMovimientosResumidossSeleccionados();
				//this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Movimientos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMovimientosResumidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMovimientosResumidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMovimientosResumidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
				}	
			} 			
			else if(MovimientosResumidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMovimientosResumidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMovimientosResumidos(conSplash);
					
						//this.actualizarParametrosGeneralMovimientosResumidos();
						
						this.generarReporteProcesoAccionMovimientosResumidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MovimientosResumidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Movimientos ResumidosES SELECCIONADOS?", "MANTENIMIENTO DE Movimientos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMovimientosResumidos();
				
						this.actualizarParametrosGeneralMovimientosResumidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.movimientosresumidosReturnGeneral=movimientosresumidosLogic.procesarAccionMovimientosResumidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.movimientosresumidosLogic.getMovimientosResumidoss(),this.movimientosresumidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMovimientosResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMovimientosResumidos();
					
					MovimientosResumidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMovimientosResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMovimientosResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxTiposAccionesFormularioMovimientosResumidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMovimientosResumidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMovimientosResumidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMovimientosResumidos();
			
			if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
			MovimientosResumidos movimientosresumidos=new MovimientosResumidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMovimientosResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMovimientosResumidos.getSelectedItem();
			
			
			
			
			movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(movimientosresumidossSeleccionados.size()==1) {
				for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
					movimientosresumidos=movimientosresumidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMovimientosResumidos();
			
      		//this.finishProcessMovimientosResumidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMovimientosResumidosReturnGeneral() throws Exception {
		if(this.movimientosresumidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.movimientosresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.movimientosresumidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.movimientosresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.movimientosresumidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.movimientosresumidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMovimientosResumidos(false);
		}
		
		if(this.movimientosresumidosReturnGeneral.getConRetornoLista() || this.movimientosresumidosReturnGeneral.getConRetornoObjeto()) {
			if(this.movimientosresumidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.movimientosresumidosLogic.setMovimientosResumidoss(this.movimientosresumidosReturnGeneral.getMovimientosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingMovimientosResumidos(false);
		}
	}
	
	public void actualizarParametrosGeneralMovimientosResumidos() throws Exception {
		
		
	}
	
	public ArrayList<MovimientosResumidos> getMovimientosResumidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMovimientosResumidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MovimientosResumidos movimientosresumidosAux:movimientosresumidosLogic.getMovimientosResumidoss()) {
					if(movimientosresumidosAux.getIsSelected()) {
						movimientosresumidossSeleccionados.add(movimientosresumidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosResumidos movimientosresumidosAux:this.movimientosresumidoss) {
					if(movimientosresumidosAux.getIsSelected()) {
						movimientosresumidossSeleccionados.add(movimientosresumidosAux);				
					}
				}
			}
			
			if(movimientosresumidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						movimientosresumidossSeleccionados.addAll(this.movimientosresumidosLogic.getMovimientosResumidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						movimientosresumidossSeleccionados.addAll(this.movimientosresumidoss);				
					}
				}
			}
		} else {
			movimientosresumidossSeleccionados.add(this.movimientosresumidos);
		}
		
		return movimientosresumidossSeleccionados;
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
	
	public void generarReporteMovimientosResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMovimientosResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMovimientosResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMovimientosResumidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMovimientosResumidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Movimientos Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados);
		
	}	
	
	public void generarReporteNormalMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMovimientosResumidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMovimientosResumidos();
		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMovimientosResumidos();
		
		
		//this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados ,movimientosresumidosImplementable,movimientosresumidosImplementableHome);
	}
	
	public void mostrarImportacionMovimientosResumidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMovimientosResumidos();
		
		this.abrirFrameImportacionMovimientosResumidos();		
		
			
		//this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados ,movimientosresumidosImplementable,movimientosresumidosImplementableHome);
	}
	
	public void importarMovimientosResumidoss() throws Exception {		
	
	}
	
	public void exportarMovimientosResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMovimientosResumidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMovimientosResumidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMovimientosResumidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Movimientos Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMovimientosResumidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMovimientosResumidos(movimientosresumidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//movimientosresumidosAux.setsDetalleGeneralEntityReporte(movimientosresumidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMovimientosResumidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_RETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMovimientosResumidos(MovimientosResumidos movimientosresumidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=movimientosresumidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getnumero_secuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.gettotal_descuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.getretencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosresumidos.gettotal_otro().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MovimientosResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMovimientosResumidos(row);				
				iRow++;
			}				
			
			for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMovimientosResumidos(movimientosresumidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMovimientosResumidossSeleccionados() throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();		
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosresumidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("movimientosresumidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("movimientosresumidos");
			//elementRoot.appendChild(element);
		
			for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
				element = document.createElement("movimientosresumidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMovimientosResumidos(movimientosresumidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMovimientosResumidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_RETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosResumidosConstantesFunciones.LABEL_TOTALOTRO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMovimientosResumidos(MovimientosResumidos movimientosresumidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getnumero_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.gettotal_descuento());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.getretencion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosresumidos.gettotal_otro());				
	}
	
	public void setFilaDatosExportarXmlMovimientosResumidos(MovimientosResumidos movimientosresumidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MovimientosResumidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(movimientosresumidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MovimientosResumidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(movimientosresumidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MovimientosResumidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(movimientosresumidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MovimientosResumidosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(movimientosresumidos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtransaccion_descripcion = document.createElement(MovimientosResumidosConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(movimientosresumidos.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementfecha_emision_desde = document.createElement(MovimientosResumidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(movimientosresumidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(MovimientosResumidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(movimientosresumidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_sucursal = document.createElement(MovimientosResumidosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(movimientosresumidos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_completo_cliente = document.createElement(MovimientosResumidosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(movimientosresumidos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_transaccion = document.createElement(MovimientosResumidosConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(movimientosresumidos.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementnumero_comprobante = document.createElement(MovimientosResumidosConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(movimientosresumidos.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_factura = document.createElement(MovimientosResumidosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(movimientosresumidos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementtotal = document.createElement(MovimientosResumidosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(movimientosresumidos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementiva = document.createElement(MovimientosResumidosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(movimientosresumidos.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementnumero_secuencial = document.createElement(MovimientosResumidosConstantesFunciones.NUMEROSECUENCIAL);
		elementnumero_secuencial.appendChild(document.createTextNode(movimientosresumidos.getnumero_secuencial().trim()));
		element.appendChild(elementnumero_secuencial);

		Element elementfecha_emision = document.createElement(MovimientosResumidosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(movimientosresumidos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementtotal_descuento = document.createElement(MovimientosResumidosConstantesFunciones.TOTALDESCUENTO);
		elementtotal_descuento.appendChild(document.createTextNode(movimientosresumidos.gettotal_descuento().toString().trim()));
		element.appendChild(elementtotal_descuento);

		Element elementice = document.createElement(MovimientosResumidosConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(movimientosresumidos.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementretencion = document.createElement(MovimientosResumidosConstantesFunciones.RETENCION);
		elementretencion.appendChild(document.createTextNode(movimientosresumidos.getretencion().toString().trim()));
		element.appendChild(elementretencion);

		Element elementtotal_otro = document.createElement(MovimientosResumidosConstantesFunciones.TOTALOTRO);
		elementtotal_otro.appendChild(document.createTextNode(movimientosresumidos.gettotal_otro().toString().trim()));
		element.appendChild(elementtotal_otro);
	}
	
	public void generarReporteGroupGenericoMovimientosResumidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados=new ArrayList<MovimientosResumidos>();
		
		movimientosresumidossSeleccionados=this.getMovimientosResumidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMovimientosResumidos(movimientosresumidossSeleccionados);
		
		this.generarReporteMovimientosResumidoss("Todos",movimientosresumidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMovimientosResumidos(ArrayList<MovimientosResumidos> movimientosresumidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MovimientosResumidos movimientosresumidosAux:movimientosresumidossSeleccionados) {
				movimientosresumidosAux.setsDetalleGeneralEntityReporte(movimientosresumidosAux.toString());
			
				if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosresumidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosresumidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(movimientosresumidosAux.getnumero_secuencial());
				}
				 else if(sTipoSeleccionar.equals(MovimientosResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					movimientosresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosresumidosAux.getfecha_emision()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMovimientosResumidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMovimientosResumidos=true;
				this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=true;
				this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=true;
			}
			
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=true;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=true;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=true;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=true;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=true;
			this.isVisibilidadCeldaModificarMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
			this.isVisibilidadCeldaModificarMovimientosResumidos=true;
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
			this.isVisibilidadCeldaCancelarMovimientosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MovimientosResumidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMovimientosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=true;
		} else {
			this.actualizarEstadoPanelsMovimientosResumidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMovimientosResumidos=false;
			//this.isVisibilidadCeldaVerFormMovimientosResumidos=false;
			this.isVisibilidadCeldaDuplicarMovimientosResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!movimientosresumidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
		} else {
			this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!movimientosresumidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;												
			}
			
			this.jButtonCerrarMovimientosResumidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
		}
		
		if(!this.permiteMantenimiento(this.movimientosresumidos)) {
			this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
			this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoMovimientosResumidos=false;
		this.isVisibilidadCeldaNuevoRelacionesMovimientosResumidos=false;
		this.isVisibilidadCeldaGuardarCambiosMovimientosResumidos=false;
		//this.isVisibilidadCeldaModificarMovimientosResumidos=true;
		this.isVisibilidadCeldaActualizarMovimientosResumidos=false;
		this.isVisibilidadCeldaEliminarMovimientosResumidos=false;
		//this.isVisibilidadCeldaCancelarMovimientosResumidos=true;			
		this.isVisibilidadCeldaGuardarMovimientosResumidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMovimientosResumidos() {
	}
	
	public void actualizarEstadoPanelsMovimientosResumidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMovimientosResumidos!=null) {
				this.jScrollPanelDatosEdicionMovimientosResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosResumidos!=null) {
				this.jScrollPanelDatosMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosResumidos!=null) {
				this.jPanelPaginacionMovimientosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
					this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.movimientosresumidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosResumidos!=null) {
				this.jTabbedPaneBusquedasMovimientosResumidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMovimientosResumidos!=null) {
				this.jPanelParametrosReportesMovimientosResumidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaMovimientosResumidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaMovimientosResumidos) {this.jTabbedPaneBusquedasMovimientosResumidos.remove(jPanelBusquedaMovimientosResumidosMovimientosResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaMovimientosResumidos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaMovimientosResumidos) {this.jTabbedPaneBusquedasMovimientosResumidos.remove(jPanelBusquedaMovimientosResumidosMovimientosResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaMovimientosResumidos=isParaTransaccion;
			if(!this.isVisibilidadBusquedaMovimientosResumidos) {this.jTabbedPaneBusquedasMovimientosResumidos.remove(jPanelBusquedaMovimientosResumidosMovimientosResumidos);}
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
			
			this.inicializarActualizarBindingTablaMovimientosResumidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMovimientosResumidos() {
		this.updateBorderResaltarBusquedasFormularioMovimientosResumidos();
		this.updateVisibilidadBusquedasFormularioMovimientosResumidos();
		this.updateHabilitarBusquedasFormularioMovimientosResumidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioMovimientosResumidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMovimientosResumidos.getComponents().length>0) {
	

		if(this.movimientosresumidosConstantesFunciones.resaltarBusquedaMovimientosResumidosMovimientosResumidos!=null) {
			index= this.jTabbedPaneBusquedasMovimientosResumidos.indexOfComponent(this.jPanelBusquedaMovimientosResumidosMovimientosResumidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosResumidos.getComponent(index);
				jPanel.setBorder(this.movimientosresumidosConstantesFunciones.resaltarBusquedaMovimientosResumidosMovimientosResumidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMovimientosResumidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMovimientosResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMovimientosResumidos.indexOfComponent(this.jPanelBusquedaMovimientosResumidosMovimientosResumidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosResumidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.movimientosresumidosConstantesFunciones.mostrarBusquedaMovimientosResumidosMovimientosResumidos);
			if(!this.movimientosresumidosConstantesFunciones.mostrarBusquedaMovimientosResumidosMovimientosResumidos && index>-1) {
				this.jTabbedPaneBusquedasMovimientosResumidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMovimientosResumidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMovimientosResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMovimientosResumidos.indexOfComponent(this.jPanelBusquedaMovimientosResumidosMovimientosResumidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosResumidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.movimientosresumidosConstantesFunciones.activarBusquedaMovimientosResumidosMovimientosResumidos);
				this.jTabbedPaneBusquedasMovimientosResumidos.setEnabledAt(index,this.movimientosresumidosConstantesFunciones.activarBusquedaMovimientosResumidosMovimientosResumidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMovimientosResumidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaMovimientosResumidos")) {
			index= this.jTabbedPaneBusquedasMovimientosResumidos.indexOfComponent(this.jPanelBusquedaMovimientosResumidosMovimientosResumidos);

			this.jTabbedPaneBusquedasMovimientosResumidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosResumidos.getComponent(index);

			this.movimientosresumidosConstantesFunciones.setResaltarBusquedaMovimientosResumidosMovimientosResumidos(resaltar);

			jPanel.setBorder(this.movimientosresumidosConstantesFunciones.resaltarBusquedaMovimientosResumidosMovimientosResumidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMovimientosResumidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMovimientosResumidos() throws Exception {

		if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMovimientosResumidos();
		this.updateVisibilidadResaltarControlesFormularioMovimientosResumidos();
		this.updateHabilitarResaltarControlesFormularioMovimientosResumidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioMovimientosResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.movimientosresumidosConstantesFunciones.resaltaridMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltaridMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarid_empresaMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarid_empresaMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarid_sucursalMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarid_sucursalMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarid_transaccionMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarid_transaccionMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarfecha_emision_desdeMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_desdeMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarfecha_emision_desdeMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarfecha_emision_hastaMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_hastaMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarfecha_emision_hastaMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnombre_sucursalMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnombre_sucursalMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnombre_completo_clienteMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnombre_completo_clienteMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnombre_transaccionMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnombre_transaccionMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnumero_comprobanteMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnumero_comprobanteMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnumero_facturaMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnumero_facturaMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltartotalMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltartotalMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarivaMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarivaMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarnumero_secuencialMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarnumero_secuencialMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarfecha_emisionMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarfecha_emisionMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltartotal_descuentoMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltartotal_descuentoMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltariceMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltariceMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltarretencionMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltarretencionMovimientosResumidos);}
		if(this.movimientosresumidosConstantesFunciones.resaltartotal_otroMovimientosResumidos!=null && this.jInternalFrameDetalleFormMovimientosResumidos!=null) {this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setBorder(this.movimientosresumidosConstantesFunciones.resaltartotal_otroMovimientosResumidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMovimientosResumidos() throws Exception {		
		if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
	
		//this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostraridMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelidMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostraridMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_empresaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelid_empresaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_empresaMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelid_sucursalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_sucursalMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_transaccionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelid_transaccionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarid_transaccionMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_desdeMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emision_desdeMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelfecha_emision_desdeMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emision_desdeMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_hastaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emision_hastaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelfecha_emision_hastaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emision_hastaMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnombre_sucursalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_sucursalMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_completo_clienteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnombre_completo_clienteMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_completo_clienteMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_transaccionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnombre_transaccionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnombre_transaccionMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_comprobanteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnumero_comprobanteMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_comprobanteMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_facturaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnumero_facturaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_facturaMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPaneltotalMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotalMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarivaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelivaMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarivaMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_secuencialMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelnumero_secuencialMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarnumero_secuencialMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emisionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelfecha_emisionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarfecha_emisionMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotal_descuentoMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPaneltotal_descuentoMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotal_descuentoMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrariceMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPaneliceMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrariceMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarretencionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPanelretencionMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrarretencionMovimientosResumidos);
		//this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotal_otroMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jPaneltotal_otroMovimientosResumidos.setVisible(this.movimientosresumidosConstantesFunciones.mostrartotal_otroMovimientosResumidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMovimientosResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormMovimientosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMovimientosResumidos!=null) {
	
		this.jInternalFrameDetalleFormMovimientosResumidos.jLabelidMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activaridMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_empresaMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarid_empresaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_sucursalMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarid_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jComboBoxid_transaccionMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarid_transaccionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_desdeMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarfecha_emision_desdeMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emision_hastaMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarfecha_emision_hastaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_sucursalMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnombre_sucursalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_completo_clienteMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnombre_completo_clienteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextAreanombre_transaccionMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnombre_transaccionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_comprobanteMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnumero_comprobanteMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_facturaMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnumero_facturaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotalMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activartotalMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldivaMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarivaMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldnumero_secuencialMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarnumero_secuencialMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jDateChooserfecha_emisionMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarfecha_emisionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_descuentoMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activartotal_descuentoMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldiceMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activariceMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldretencionMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activarretencionMovimientosResumidos);
		this.jInternalFrameDetalleFormMovimientosResumidos.jTextFieldtotal_otroMovimientosResumidos.setEnabled(this.movimientosresumidosConstantesFunciones.activartotal_otroMovimientosResumidos);
		}
	}
	
		
}