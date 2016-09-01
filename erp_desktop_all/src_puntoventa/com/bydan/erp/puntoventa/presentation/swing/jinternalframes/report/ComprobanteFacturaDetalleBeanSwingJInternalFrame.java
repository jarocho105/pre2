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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.ComprobanteFacturaDetalleConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaDetalleParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaDetalleParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ComprobanteFacturaDetalleBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComprobanteFacturaDetalleBeanSwingJInternalFrame extends ComprobanteFacturaDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComprobanteFacturaDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComprobanteFacturaDetalle> comprobantefacturadetalleValidator = new ClassValidator<ComprobanteFacturaDetalle>(ComprobanteFacturaDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComprobanteFacturaDetalle comprobantefacturadetalle;	
	public ComprobanteFacturaDetalle comprobantefacturadetalleAux;
	public ComprobanteFacturaDetalle comprobantefacturadetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComprobanteFacturaDetalle comprobantefacturadetalleTotales;
	public Long idComprobanteFacturaDetalleActual;
	public Long iIdNuevoComprobanteFacturaDetalle=0L;
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
	
	public Boolean isPermisoTodoComprobanteFacturaDetalle;
	public Boolean isPermisoNuevoComprobanteFacturaDetalle;
	public Boolean isPermisoActualizarComprobanteFacturaDetalle;
	public Boolean isPermisoActualizarOriginalComprobanteFacturaDetalle;
	public Boolean isPermisoEliminarComprobanteFacturaDetalle;
	public Boolean isPermisoGuardarCambiosComprobanteFacturaDetalle;
	public Boolean isPermisoConsultaComprobanteFacturaDetalle;
	public Boolean isPermisoBusquedaComprobanteFacturaDetalle;
	public Boolean isPermisoReporteComprobanteFacturaDetalle;
	public Boolean isPermisoPaginacionMedioComprobanteFacturaDetalle;
	public Boolean isPermisoPaginacionAltoComprobanteFacturaDetalle;
	public Boolean isPermisoPaginacionTodoComprobanteFacturaDetalle;
	public Boolean isPermisoCopiarComprobanteFacturaDetalle;
	public Boolean isPermisoVerFormComprobanteFacturaDetalle;
	public Boolean isPermisoDuplicarComprobanteFacturaDetalle;
	public Boolean isPermisoOrdenComprobanteFacturaDetalle;
	
	
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
	
	public ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleReturnGeneral;
	public ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComprobanteFacturaDetalle=false;
	public Boolean esParaAccionDesdeFormularioComprobanteFacturaDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComprobanteFacturaDetalleSessionBeanAdditional comprobantefacturadetalleSessionBeanAdditional=null;
	
	public ComprobanteFacturaDetalleSessionBeanAdditional getComprobanteFacturaDetalleSessionBeanAdditional() {
		return this.comprobantefacturadetalleSessionBeanAdditional;
	}
	
	public void setComprobanteFacturaDetalleSessionBeanAdditional(ComprobanteFacturaDetalleSessionBeanAdditional comprobantefacturadetalleSessionBeanAdditional) {
		try {
			this.comprobantefacturadetalleSessionBeanAdditional=comprobantefacturadetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional comprobantefacturadetalleBeanSwingJInternalFrameAdditional=null;
	//public class ComprobanteFacturaDetalleBeanSwingJInternalFrame
	
	public ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional getComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional() {
		return this.comprobantefacturadetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional(ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional comprobantefacturadetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.comprobantefacturadetalleBeanSwingJInternalFrameAdditional=comprobantefacturadetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComprobanteFacturaDetalleLogic comprobantefacturadetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComprobanteFacturaDetalle comprobantefacturadetalleBean;
	public ComprobanteFacturaDetalleConstantesFunciones comprobantefacturadetalleConstantesFunciones;
	//public ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ComprobanteFacturaDetalle> comprobantefacturadetalles;	
	//public List<ComprobanteFacturaDetalle> comprobantefacturadetallesEliminados;
	//public List<ComprobanteFacturaDetalle> comprobantefacturadetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarComprobanteFacturaDetalle=true;
	public Boolean isVisibilidadCeldaCopiarComprobanteFacturaDetalle=true;
	public Boolean isVisibilidadCeldaVerFormComprobanteFacturaDetalle=true;
	public Boolean isVisibilidadCeldaOrdenComprobanteFacturaDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaCancelarComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;	
	
	
	public Boolean isVisibilidadBusquedaComprobanteFacturaDetalle=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoComprobanteFacturaDetalle() {
		return this.iIdNuevoComprobanteFacturaDetalle;
	}

	public void setiIdNuevoComprobanteFacturaDetalle(Long iIdNuevoComprobanteFacturaDetalle) {
		this.iIdNuevoComprobanteFacturaDetalle = iIdNuevoComprobanteFacturaDetalle;
	}
	
	public Long getidComprobanteFacturaDetalleActual() {
		return this.idComprobanteFacturaDetalleActual;
	}

	public void setidComprobanteFacturaDetalleActual(Long idComprobanteFacturaDetalleActual) {
		this.idComprobanteFacturaDetalleActual = idComprobanteFacturaDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComprobanteFacturaDetalle getcomprobantefacturadetalle() {
		return this.comprobantefacturadetalle;
	}

	public void setcomprobantefacturadetalle(ComprobanteFacturaDetalle comprobantefacturadetalle) {
		this.comprobantefacturadetalle = comprobantefacturadetalle;
	}
	
	public ComprobanteFacturaDetalle getcomprobantefacturadetalleAux() {
		return this.comprobantefacturadetalleAux;
	}

	public void setcomprobantefacturadetalleAux(ComprobanteFacturaDetalle comprobantefacturadetalleAux) {
		this.comprobantefacturadetalleAux = comprobantefacturadetalleAux;
	}				
	
	public ComprobanteFacturaDetalle getcomprobantefacturadetalleAnterior() {
		return this.comprobantefacturadetalleAnterior;
	}

	public void setcomprobantefacturadetalleAnterior(ComprobanteFacturaDetalle comprobantefacturadetalleAnterior) {
		this.comprobantefacturadetalleAnterior = comprobantefacturadetalleAnterior;
	}	
	
	public ComprobanteFacturaDetalle getcomprobantefacturadetalleTotales() {
		return this.comprobantefacturadetalleTotales;
	}

	public void setcomprobantefacturadetalleTotales(ComprobanteFacturaDetalle comprobantefacturadetalleTotales) {
		this.comprobantefacturadetalleTotales = comprobantefacturadetalleTotales;
	}	
	
	public ComprobanteFacturaDetalle getcomprobantefacturadetalleBean() {
		return this.comprobantefacturadetalleBean;
	}

	public void setcomprobantefacturadetalleBean(ComprobanteFacturaDetalle comprobantefacturadetalleBean) {
		this.comprobantefacturadetalleBean = comprobantefacturadetalleBean;
	}	
	
	public ComprobanteFacturaDetalleParameterReturnGeneral getcomprobantefacturadetalleReturnGeneral() {
		return this.comprobantefacturadetalleReturnGeneral;
	}

	public void setcomprobantefacturadetalleReturnGeneral(ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleReturnGeneral) {
		this.comprobantefacturadetalleReturnGeneral = comprobantefacturadetalleReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaComprobanteFacturaDetalle=new Date();

	public Date getfecha_inicioBusquedaComprobanteFacturaDetalle() {
		return this.fecha_inicioBusquedaComprobanteFacturaDetalle;
	}

	public void setfecha_inicioBusquedaComprobanteFacturaDetalle(Date fecha_inicioBusquedaComprobanteFacturaDetalle) {
		this.fecha_inicioBusquedaComprobanteFacturaDetalle = fecha_inicioBusquedaComprobanteFacturaDetalle;
	}

;
	public Date fecha_finBusquedaComprobanteFacturaDetalle=new Date();

	public Date getfecha_finBusquedaComprobanteFacturaDetalle() {
		return this.fecha_finBusquedaComprobanteFacturaDetalle;
	}

	public void setfecha_finBusquedaComprobanteFacturaDetalle(Date fecha_finBusquedaComprobanteFacturaDetalle) {
		this.fecha_finBusquedaComprobanteFacturaDetalle = fecha_finBusquedaComprobanteFacturaDetalle;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComprobanteFacturaDetalleLogic getComprobanteFacturaDetalleLogic()	{		
		return comprobantefacturadetalleLogic;
	}

	public void setComprobanteFacturaDetalleLogic(ComprobanteFacturaDetalleLogic comprobantefacturadetalleLogic) {
		this.comprobantefacturadetalleLogic = comprobantefacturadetalleLogic;
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
	
	public Boolean getIsEsNuevoComprobanteFacturaDetalle() {
		return isEsNuevoComprobanteFacturaDetalle;
	}

	public void setIsEsNuevoComprobanteFacturaDetalle(Boolean isEsNuevoComprobanteFacturaDetalle) {
		this.isEsNuevoComprobanteFacturaDetalle = isEsNuevoComprobanteFacturaDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioComprobanteFacturaDetalle() {
		return esParaAccionDesdeFormularioComprobanteFacturaDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioComprobanteFacturaDetalle(Boolean esParaAccionDesdeFormularioComprobanteFacturaDetalle) {
		this.esParaAccionDesdeFormularioComprobanteFacturaDetalle = esParaAccionDesdeFormularioComprobanteFacturaDetalle;
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

			if(this.comprobantefacturadetalleSessionBean==null) {
				this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
			}

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comprobantefacturadetalleSessionBean.getlidEmpresaActual());
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

			if(this.comprobantefacturadetalleSessionBean==null) {
				this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
			}

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(comprobantefacturadetalleSessionBean.getlidSucursalActual());
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

			if(this.comprobantefacturadetalleSessionBean==null) {
				this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
			}

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(comprobantefacturadetalleSessionBean.getlidClienteActual());
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

					if(this.comprobantefacturadetalle!=null) {
						this.comprobantefacturadetalle.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComprobanteFacturaDetalleGenerico)throws Exception
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
				jComboBoxid_empresaComprobanteFacturaDetalleGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComprobanteFacturaDetalleGenerico!=null && jComboBoxid_empresaComprobanteFacturaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_empresaComprobanteFacturaDetalleGenerico.setSelectedIndex(0);
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

					if(this.comprobantefacturadetalle!=null) {
						this.comprobantefacturadetalle.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalComprobanteFacturaDetalleGenerico)throws Exception
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
				jComboBoxid_sucursalComprobanteFacturaDetalleGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalComprobanteFacturaDetalleGenerico!=null && jComboBoxid_sucursalComprobanteFacturaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_sucursalComprobanteFacturaDetalleGenerico.setSelectedIndex(0);
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

					if(this.comprobantefacturadetalle!=null) {
						this.comprobantefacturadetalle.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteComprobanteFacturaDetalleGenerico)throws Exception
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
				jComboBoxid_clienteComprobanteFacturaDetalleGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteComprobanteFacturaDetalleGenerico!=null && jComboBoxid_clienteComprobanteFacturaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_clienteComprobanteFacturaDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComprobanteFacturaDetalle comprobantefacturadetalle,JComboBox jComboBoxid_empresaComprobanteFacturaDetalleGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComprobanteFacturaDetalleGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComprobanteFacturaDetalleGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comprobantefacturadetalle.setid_empresa(empresaAux.getId());
				comprobantefacturadetalle.setempresa_descripcion(ComprobanteFacturaDetalleConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comprobantefacturadetalle.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ComprobanteFacturaDetalle comprobantefacturadetalle,JComboBox jComboBoxid_sucursalComprobanteFacturaDetalleGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalComprobanteFacturaDetalleGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalComprobanteFacturaDetalleGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				comprobantefacturadetalle.setid_sucursal(sucursalAux.getId());
				comprobantefacturadetalle.setsucursal_descripcion(ComprobanteFacturaDetalleConstantesFunciones.getSucursalDescripcion(sucursalAux));
				comprobantefacturadetalle.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ComprobanteFacturaDetalle comprobantefacturadetalle,JComboBox jComboBoxid_clienteComprobanteFacturaDetalleGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteComprobanteFacturaDetalleGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteComprobanteFacturaDetalleGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				comprobantefacturadetalle.setid_cliente(clienteAux.getId());
				comprobantefacturadetalle.setcliente_descripcion(ComprobanteFacturaDetalleConstantesFunciones.getClienteDescripcion(clienteAux));
				comprobantefacturadetalle.setCliente(clienteAux);			}
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

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
					}

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
					}

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { 
					}

					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComprobanteFacturaDetalle() throws Exception {
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
		
	public ComprobanteFacturaDetalleParameterReturnGeneral getComprobanteFacturaDetalleParameterGeneral() {
		return this.comprobantefacturadetalleParameterGeneral;
	}
	
	public void setComprobanteFacturaDetalleParameterGeneral(ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleParameterGeneral) {
		this.comprobantefacturadetalleParameterGeneral = comprobantefacturadetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComprobanteFacturaDetalle() {
		return isPermisoTodoComprobanteFacturaDetalle;
	}

	public void setIsPermisoTodoComprobanteFacturaDetalle(Boolean isPermisoTodoComprobanteFacturaDetalle) {
		this.isPermisoTodoComprobanteFacturaDetalle = isPermisoTodoComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoNuevoComprobanteFacturaDetalle() {
		return isPermisoNuevoComprobanteFacturaDetalle;
	}

	public void setIsPermisoNuevoComprobanteFacturaDetalle(Boolean isPermisoNuevoComprobanteFacturaDetalle) {
		this.isPermisoNuevoComprobanteFacturaDetalle = isPermisoNuevoComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoActualizarComprobanteFacturaDetalle() {
		return isPermisoActualizarComprobanteFacturaDetalle;
	}

	public void setIsPermisoActualizarComprobanteFacturaDetalle(Boolean isPermisoActualizarComprobanteFacturaDetalle) {
		this.isPermisoActualizarComprobanteFacturaDetalle = isPermisoActualizarComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoEliminarComprobanteFacturaDetalle() {
		return isPermisoEliminarComprobanteFacturaDetalle;
	}

	public void setIsPermisoEliminarComprobanteFacturaDetalle(Boolean isPermisoEliminarComprobanteFacturaDetalle) {
		this.isPermisoEliminarComprobanteFacturaDetalle = isPermisoEliminarComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosComprobanteFacturaDetalle() {
		return isPermisoGuardarCambiosComprobanteFacturaDetalle;
	}

	public void setIsPermisoGuardarCambiosComprobanteFacturaDetalle(Boolean isPermisoGuardarCambiosComprobanteFacturaDetalle) {
		this.isPermisoGuardarCambiosComprobanteFacturaDetalle = isPermisoGuardarCambiosComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoConsultaComprobanteFacturaDetalle() {
		return isPermisoConsultaComprobanteFacturaDetalle;
	}

	public void setIsPermisoConsultaComprobanteFacturaDetalle(Boolean isPermisoConsultaComprobanteFacturaDetalle) {
		this.isPermisoConsultaComprobanteFacturaDetalle = isPermisoConsultaComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoBusquedaComprobanteFacturaDetalle() {
		return isPermisoBusquedaComprobanteFacturaDetalle;
	}

	public void setIsPermisoBusquedaComprobanteFacturaDetalle(Boolean isPermisoBusquedaComprobanteFacturaDetalle) {
		this.isPermisoBusquedaComprobanteFacturaDetalle = isPermisoBusquedaComprobanteFacturaDetalle;
	}

	public Boolean getIsPermisoReporteComprobanteFacturaDetalle() {
		return isPermisoReporteComprobanteFacturaDetalle;
	}

	public void setIsPermisoReporteComprobanteFacturaDetalle(Boolean isPermisoReporteComprobanteFacturaDetalle) {
		this.isPermisoReporteComprobanteFacturaDetalle = isPermisoReporteComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioComprobanteFacturaDetalle() {
		return isPermisoPaginacionMedioComprobanteFacturaDetalle;
	}

	public void setIsPermisoPaginacionMedioComprobanteFacturaDetalle(Boolean isPermisoPaginacionMedioComprobanteFacturaDetalle) {
		this.isPermisoPaginacionMedioComprobanteFacturaDetalle = isPermisoPaginacionMedioComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoComprobanteFacturaDetalle() {
		return isPermisoPaginacionTodoComprobanteFacturaDetalle;
	}

	public void setIsPermisoPaginacionTodoComprobanteFacturaDetalle(Boolean isPermisoPaginacionTodoComprobanteFacturaDetalle) {
		this.isPermisoPaginacionTodoComprobanteFacturaDetalle = isPermisoPaginacionTodoComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoComprobanteFacturaDetalle() {
		return isPermisoPaginacionAltoComprobanteFacturaDetalle;
	}

	public void setIsPermisoPaginacionAltoComprobanteFacturaDetalle(Boolean isPermisoPaginacionAltoComprobanteFacturaDetalle) {
		this.isPermisoPaginacionAltoComprobanteFacturaDetalle = isPermisoPaginacionAltoComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoCopiarComprobanteFacturaDetalle() {
		return isPermisoCopiarComprobanteFacturaDetalle;
	}

	public void setIsPermisoCopiarComprobanteFacturaDetalle(Boolean isPermisoCopiarComprobanteFacturaDetalle) {
		this.isPermisoCopiarComprobanteFacturaDetalle = isPermisoCopiarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoVerFormComprobanteFacturaDetalle() {
		return isPermisoVerFormComprobanteFacturaDetalle;
	}

	public void setIsPermisoVerFormComprobanteFacturaDetalle(Boolean isPermisoVerFormComprobanteFacturaDetalle) {
		this.isPermisoVerFormComprobanteFacturaDetalle = isPermisoVerFormComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoDuplicarComprobanteFacturaDetalle() {
		return isPermisoDuplicarComprobanteFacturaDetalle;
	}

	public void setIsPermisoDuplicarComprobanteFacturaDetalle(Boolean isPermisoDuplicarComprobanteFacturaDetalle) {
		this.isPermisoDuplicarComprobanteFacturaDetalle = isPermisoDuplicarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsPermisoOrdenComprobanteFacturaDetalle() {
		return isPermisoOrdenComprobanteFacturaDetalle;
	}

	public void setIsPermisoOrdenComprobanteFacturaDetalle(Boolean isPermisoOrdenComprobanteFacturaDetalle) {
		this.isPermisoOrdenComprobanteFacturaDetalle = isPermisoOrdenComprobanteFacturaDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComprobanteFacturaDetalle() {
		return isVisibilidadCeldaNuevoComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoComprobanteFacturaDetalle(Boolean isVisibilidadCeldaNuevoComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle = isVisibilidadCeldaNuevoComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaDuplicarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaDuplicarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle = isVisibilidadCeldaDuplicarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaCopiarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaCopiarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaCopiarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle = isVisibilidadCeldaCopiarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComprobanteFacturaDetalle() {
		return isVisibilidadCeldaVerFormComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaVerFormComprobanteFacturaDetalle(Boolean isVisibilidadCeldaVerFormComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle = isVisibilidadCeldaVerFormComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComprobanteFacturaDetalle() {
		return isVisibilidadCeldaOrdenComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaOrdenComprobanteFacturaDetalle(Boolean isVisibilidadCeldaOrdenComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle = isVisibilidadCeldaOrdenComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle() {
		return isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle(Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle = isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaModificarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaModificarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaModificarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaModificarComprobanteFacturaDetalle = isVisibilidadCeldaModificarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaActualizarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaActualizarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaActualizarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle = isVisibilidadCeldaActualizarComprobanteFacturaDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaEliminarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaEliminarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaEliminarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle = isVisibilidadCeldaEliminarComprobanteFacturaDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaCancelarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaCancelarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaCancelarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle = isVisibilidadCeldaCancelarComprobanteFacturaDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarComprobanteFacturaDetalle() {
		return isVisibilidadCeldaGuardarComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarComprobanteFacturaDetalle(Boolean isVisibilidadCeldaGuardarComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle = isVisibilidadCeldaGuardarComprobanteFacturaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle() {
		return isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle(Boolean isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle) {
		this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle = isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle;
	}
		
	public ComprobanteFacturaDetalleSessionBean getcomprobantefacturadetalleSessionBean() {
		return this.comprobantefacturadetalleSessionBean;
	}
	
	public void setcomprobantefacturadetalleSessionBean(ComprobanteFacturaDetalleSessionBean comprobantefacturadetalleSessionBean) {
		this.comprobantefacturadetalleSessionBean=comprobantefacturadetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComprobanteFacturaDetalle() {
		return this.isVisibilidadBusquedaComprobanteFacturaDetalle;
	}

	public void setisVisibilidadBusquedaComprobanteFacturaDetalle(Boolean isVisibilidadBusquedaComprobanteFacturaDetalle) {
		this.isVisibilidadBusquedaComprobanteFacturaDetalle=isVisibilidadBusquedaComprobanteFacturaDetalle;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comprobantefacturadetalle,null);
				this.setActualParaGuardarSucursalForeignKey(comprobantefacturadetalle,null);
				this.setActualParaGuardarClienteForeignKey(comprobantefacturadetalle,null);
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
	
	public void bugActualizarReferenciaActual(ComprobanteFacturaDetalle comprobantefacturadetalle,ComprobanteFacturaDetalle comprobantefacturadetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComprobanteFacturaDetalle(comprobantefacturadetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comprobantefacturadetalleAux.setId(comprobantefacturadetalle.getId());
		comprobantefacturadetalleAux.setVersionRow(comprobantefacturadetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComprobanteFacturaDetalle comprobantefacturadetalleLocal) throws Exception {
		
		if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComprobanteFacturaDetalle comprobantefacturadetalleLocal) throws Exception {	
		if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comprobantefacturadetalleLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				comprobantefacturadetalleLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				comprobantefacturadetalleLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComprobanteFacturaDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comprobantefacturadetalleValidator.getInvalidValues(this.comprobantefacturadetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComprobanteFacturaDetalle comprobantefacturadetalle,List<ComprobanteFacturaDetalle> comprobantefacturadetalles) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComprobanteFacturaDetalle comprobantefacturadetalle,List<ComprobanteFacturaDetalle> comprobantefacturadetalles) throws Exception {
		try	{			
			ComprobanteFacturaDetalleConstantesFunciones.actualizarSelectedLista(comprobantefacturadetalle,comprobantefacturadetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComprobanteFacturaDetalle> comprobantefacturadetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comprobantefacturadetallesLocal=this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comprobantefacturadetallesLocal=this.comprobantefacturadetalles;
			}
			//ARCHITECTURE
		
			for(ComprobanteFacturaDetalle comprobantefacturadetalleLocal:comprobantefacturadetallesLocal) {
				if(this.permiteMantenimiento(comprobantefacturadetalleLocal) && comprobantefacturadetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.getComprobanteFacturaDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelid_clienteComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsecuencialComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelfechaComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_clienteComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuentoComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsubtotalComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeltotalComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_bodegaComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_productoComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelcantidadComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelprecioComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.DESCUENTOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuento_productoComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelivaComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelserieComprobanteFacturaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaDetalleConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescripcionComprobanteFacturaDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelid_clienteComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsecuencialComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelfechaComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_clienteComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuentoComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsubtotalComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeltotalComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_bodegaComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_productoComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelcantidadComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelprecioComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuento_productoComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelivaComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelserieComprobanteFacturaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescripcionComprobanteFacturaDetalle,"");
		
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
		this.iIdNuevoComprobanteFacturaDetalle--;	
		
		
		this.comprobantefacturadetalleAux=new ComprobanteFacturaDetalle();
		
		this.comprobantefacturadetalleAux.setId(this.iIdNuevoComprobanteFacturaDetalle);
		this.comprobantefacturadetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().add(this.comprobantefacturadetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comprobantefacturadetalles.add(this.comprobantefacturadetalleAux);
		}
		//ARCHITECTURE
		
		this.comprobantefacturadetalle=this.comprobantefacturadetalleAux;
		
		if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFacturaDetalle(this.comprobantefacturadetalle);
		}
				
		//this.setDefaultControlesComprobanteFacturaDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComprobanteFacturaDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComprobanteFacturaDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFacturaDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalleBean,this.comprobantefacturadetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral,this.comprobantefacturadetalleBean,false);
		
		if(this.comprobantefacturadetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle());
		}
		
		if(this.comprobantefacturadetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle(),classes);//this.comprobantefacturadetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComprobanteFacturaDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComprobanteFacturaDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.RecargarFormComprobanteFacturaDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
						
			if(comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();
			}
			
			this.actualizarVisualTableDatosComprobanteFacturaDetalle();
			
			this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(this.getIndiceNuevoComprobanteFacturaDetalle(), this.getIndiceNuevoComprobanteFacturaDetalle());
			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
						
			this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComprobanteFacturaDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_inicioComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarfecha_inicioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_finComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarfecha_finComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarsecuencialComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarfechaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarnombre_clienteComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activardescuentoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarsubtotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activartotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarnombre_bodegaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarnombre_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarcantidadComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarprecioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activardescuento_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarivaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarserieComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activardescripcionComprobanteFacturaDetalle);	
		//
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarid_empresaComprobanteFacturaDetalle);//
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarid_sucursalComprobanteFacturaDetalle);//
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setEnabled(isHabilitar && this.comprobantefacturadetalleConstantesFunciones.activarid_clienteComprobanteFacturaDetalle);
	};
	
	public void setDefaultControlesComprobanteFacturaDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComprobanteFacturaDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(true);			
			this.comprobantefacturadetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.setVisible(true);
			
					
		} else {
			//this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(false);			
			this.comprobantefacturadetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComprobanteFacturaDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				if(comprobantefacturadetalleAux.getId().equals(this.iIdNuevoComprobanteFacturaDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalles) {
				if(comprobantefacturadetalleAux.getId().equals(this.iIdNuevoComprobanteFacturaDetalle)) {
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
	
	public int getIndiceActualComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				if(comprobantefacturadetalleAux.getId().equals(comprobantefacturadetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalles) {
				if(comprobantefacturadetalleAux.getId().equals(comprobantefacturadetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				if(comprobantefacturadetalleAux.getComprobanteFacturaDetalleOriginal().getId().equals(comprobantefacturadetalleOriginal.getId())) {
					existe=true;
					comprobantefacturadetalleOriginal.setId(comprobantefacturadetalleAux.getId());
					comprobantefacturadetalleOriginal.setVersionRow(comprobantefacturadetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalles) {
				if(comprobantefacturadetalleAux.getComprobanteFacturaDetalleOriginal().getId().equals(comprobantefacturadetalleOriginal.getId())) {
					existe=true;
					comprobantefacturadetalleOriginal.setId(comprobantefacturadetalleAux.getId());
					comprobantefacturadetalleOriginal.setVersionRow(comprobantefacturadetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComprobanteFacturaDetalle(Boolean esParaCancelar) throws Exception {
		comprobantefacturadetallesAux=new ArrayList<ComprobanteFacturaDetalle>();
		comprobantefacturadetalleAux=new ComprobanteFacturaDetalle();
		
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
					if(comprobantefacturadetalleAux.getId()<0) {
						comprobantefacturadetallesAux.add(comprobantefacturadetalleAux);
					}		
				}
				this.iIdNuevoComprobanteFacturaDetalle=0L;
				this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().removeAll(comprobantefacturadetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalles) {
					if(comprobantefacturadetalleAux.getId()<0) {
						comprobantefacturadetallesAux.add(comprobantefacturadetalleAux);
					}		
				}
				this.iIdNuevoComprobanteFacturaDetalle=0L;
				this.comprobantefacturadetalles.removeAll(comprobantefacturadetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComprobanteFacturaDetalle 
					&& this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size()>0
					) {
					comprobantefacturadetalleAux=this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().get(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size() - 1);
				
					if(comprobantefacturadetalleAux.getId()<0) {
						this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().remove(comprobantefacturadetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComprobanteFacturaDetalle && this.comprobantefacturadetalles.size()>0) {
					comprobantefacturadetalleAux=this.comprobantefacturadetalles.get(this.comprobantefacturadetalles.size() - 1);
				
					if(comprobantefacturadetalleAux.getId()<0) {
						this.comprobantefacturadetalles.remove(comprobantefacturadetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComprobanteFacturaDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comprobantefacturadetalle.getId()<0) {
				this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().remove(this.comprobantefacturadetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comprobantefacturadetalle.getId()<0) {
				this.comprobantefacturadetalles.remove(this.comprobantefacturadetalle);
			}
		}			
	}
	
	public void setEstadosInicialesComprobanteFacturaDetalle(List<ComprobanteFacturaDetalle> comprobantefacturadetallesAux) throws Exception {
		ComprobanteFacturaDetalleConstantesFunciones.setEstadosInicialesComprobanteFacturaDetalle(comprobantefacturadetallesAux);
	}
	
	public void setEstadosInicialesComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalleAux) throws Exception {
		ComprobanteFacturaDetalleConstantesFunciones.setEstadosInicialesComprobanteFacturaDetalle(comprobantefacturadetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComprobanteFacturaDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComprobanteFacturaDetalleActual()) {
				if(!this.isEsNuevoComprobanteFacturaDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComprobanteFacturaDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComprobanteFacturaDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comprobante Factura Detalle ?", "MANTENIMIENTO DE Comprobante Factura Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComprobanteFacturaDetalle comprobantefacturadetalle) throws Exception {
		ComprobanteFacturaDetalleConstantesFunciones.seleccionarAsignar(this.comprobantefacturadetalle,comprobantefacturadetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComprobanteFacturaDetalle=this.isPermisoActualizarOriginalComprobanteFacturaDetalle;
			
			
			this.seleccionarAsignar(comprobantefacturadetalle);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comprobantefacturadetalleSessionBean.setsFuncionBusquedaRapida(this.comprobantefacturadetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComprobanteFacturaDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComprobanteFacturaDetalle(esParaCancelar);				
				this.cancelarNuevoComprobanteFacturaDetalle(esParaCancelar);								
			}
			
			this.comprobantefacturadetalle=new ComprobanteFacturaDetalle();
			
			this.inicializarComprobanteFacturaDetalle();
			
			this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComprobanteFacturaDetalle() throws Exception {
		try {
			ComprobanteFacturaDetalleConstantesFunciones.inicializarComprobanteFacturaDetalle(this.comprobantefacturadetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComprobanteFacturaDetalles(String sAccionBusqueda,List<ComprobanteFacturaDetalle> comprobantefacturadetallesParaReportes) throws Exception {
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
					sPathReporteFinal="ComprobanteFacturaDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComprobanteFacturaDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComprobanteFacturaDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComprobanteFacturaDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comprobante Factura Detalles");		
		parameters.put("busquedapor", ComprobanteFacturaDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComprobanteFacturaDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComprobanteFacturaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComprobanteFacturaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComprobanteFacturaDetalle=new JRBeanArrayDataSource(ComprobanteFacturaDetalleJInternalFrame.TraerComprobanteFacturaDetalleBeans(comprobantefacturadetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComprobanteFacturaDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComprobanteFacturaDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComprobanteFacturaDetalleBean.TraerComprobanteFacturaDetalleBeans(comprobantefacturadetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalleActionPerformed(null);
					//this.generarExcelReporteComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComprobanteFacturaDetalles(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturadetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComprobanteFacturaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFacturaDetalle> comprobantefacturadetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturaDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFacturaDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComprobanteFacturaDetalle comprobantefacturadetalle : comprobantefacturadetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComprobanteFacturaDetalleConstantesFunciones.generarExcelReporteDataComprobanteFacturaDetalle("NORMAL",row,workbook,comprobantefacturadetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComprobanteFacturaDetalle(String sTipo,Row row,Workbook workbook) {
		
		ComprobanteFacturaDetalleConstantesFunciones.generarExcelReporteHeaderComprobanteFacturaDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComprobanteFacturaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFacturaDetalle> comprobantefacturadetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComprobanteFacturaDetalle comprobantefacturadetalle : comprobantefacturadetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.getComprobanteFacturaDetalleDescripcion(comprobantefacturadetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getdescuento_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefacturadetalle.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComprobanteFacturaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFacturaDetalle> comprobantefacturadetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComprobanteFacturaDetalle> comprobantefacturadetallesRespaldo=null;
		
		classes=ComprobanteFacturaDetalleConstantesFunciones.getClassesRelationshipsOfComprobanteFacturaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comprobantefacturadetalleLogic.setDatosCliente(this.datosCliente);
		this.comprobantefacturadetalleLogic.setDatosDeep(this.datosDeep);
		this.comprobantefacturadetalleLogic.setIsConDeep(true);
		
		comprobantefacturadetallesRespaldo=this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles();
		
		this.comprobantefacturadetalleLogic.setComprobanteFacturaDetalles(comprobantefacturadetallesParaReportes);	
		this.comprobantefacturadetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comprobantefacturadetallesParaReportes=this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles();
		this.comprobantefacturadetalleLogic.setComprobanteFacturaDetalles(comprobantefacturadetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFacturaDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComprobanteFacturaDetalle comprobantefacturadetalle : comprobantefacturadetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComprobanteFacturaDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComprobanteFacturaDetalleConstantesFunciones.generarExcelReporteDataComprobanteFacturaDetalle("NORMAL",row,workbook,comprobantefacturadetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.getComprobanteFacturaDetalleDescripcion(comprobantefacturadetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComprobanteFacturaDetalle() throws Exception {		
		this.startProcessComprobanteFacturaDetalle(true);
	}
	
	public void startProcessComprobanteFacturaDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComprobanteFacturaDetalle ,this.jPanelParametrosReportesComprobanteFacturaDetalle, this.jScrollPanelDatosComprobanteFacturaDetalle,this.jPanelPaginacionComprobanteFacturaDetalle, this.jScrollPanelDatosEdicionComprobanteFacturaDetalle, this.jPanelAccionesComprobanteFacturaDetalle,this.jPanelAccionesFormularioComprobanteFacturaDetalle,this.jmenuBarComprobanteFacturaDetalle,this.jmenuBarDetalleComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFacturaDetalle=this.jTabbedPaneBusquedasComprobanteFacturaDetalle; 
		
		final JPanel jPanelParametrosReportesComprobanteFacturaDetalle=this.jPanelParametrosReportesComprobanteFacturaDetalle;
		//final JScrollPane jScrollPanelDatosComprobanteFacturaDetalle=this.jScrollPanelDatosComprobanteFacturaDetalle;
		final JTable jTableDatosComprobanteFacturaDetalle=this.jTableDatosComprobanteFacturaDetalle;		
		final JPanel jPanelPaginacionComprobanteFacturaDetalle=this.jPanelPaginacionComprobanteFacturaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFacturaDetalle=this.jScrollPanelDatosEdicionComprobanteFacturaDetalle;
		final JPanel jPanelAccionesComprobanteFacturaDetalle=this.jPanelAccionesComprobanteFacturaDetalle;
		
		JPanel jPanelCamposAuxiliarComprobanteFacturaDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			jPanelCamposAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelCamposComprobanteFacturaDetalle;
			jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelAccionesFormularioComprobanteFacturaDetalle;
		}
		
		final JPanel jPanelCamposComprobanteFacturaDetalle=jPanelCamposAuxiliarComprobanteFacturaDetalle;
		final JPanel jPanelAccionesFormularioComprobanteFacturaDetalle=jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle;
		
		
		final JMenuBar jmenuBarComprobanteFacturaDetalle=this.jmenuBarComprobanteFacturaDetalle;
		final JToolBar jTtoolBarComprobanteFacturaDetalle=this.jTtoolBarComprobanteFacturaDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFacturaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			jmenuBarDetalleAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jmenuBarDetalleComprobanteFacturaDetalle;
			jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTtoolBarDetalleComprobanteFacturaDetalle;
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFacturaDetalle=jmenuBarDetalleAuxiliarComprobanteFacturaDetalle;
		final JToolBar jTtoolBarDetalleComprobanteFacturaDetalle=jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFacturaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFacturaDetalle;
			processRunnable.jTableDatos=jTableDatosComprobanteFacturaDetalle;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFacturaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFacturaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFacturaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFacturaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFacturaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFacturaDetalle;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFacturaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFacturaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFacturaDetalle ,jPanelParametrosReportesComprobanteFacturaDetalle,jTableDatosComprobanteFacturaDetalle, /*jScrollPanelDatosComprobanteFacturaDetalle,*/jPanelCamposComprobanteFacturaDetalle,jPanelPaginacionComprobanteFacturaDetalle, /*jScrollPanelDatosEdicionComprobanteFacturaDetalle,*/ jPanelAccionesComprobanteFacturaDetalle,jPanelAccionesFormularioComprobanteFacturaDetalle,jmenuBarComprobanteFacturaDetalle,jmenuBarDetalleComprobanteFacturaDetalle,jTtoolBarComprobanteFacturaDetalle,jTtoolBarDetalleComprobanteFacturaDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFacturaDetalle ,jPanelParametrosReportesComprobanteFacturaDetalle, jScrollPanelDatosComprobanteFacturaDetalle,jPanelPaginacionComprobanteFacturaDetalle, jScrollPanelDatosEdicionComprobanteFacturaDetalle, jPanelAccionesComprobanteFacturaDetalle,jPanelAccionesFormularioComprobanteFacturaDetalle,jmenuBarComprobanteFacturaDetalle,jmenuBarDetalleComprobanteFacturaDetalle,jTtoolBarComprobanteFacturaDetalle,jTtoolBarDetalleComprobanteFacturaDetalle);
						
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
	
	public void finishProcessComprobanteFacturaDetalle() {// throws Exception 
		this.finishProcessComprobanteFacturaDetalle(true);
	}
	
	public void finishProcessComprobanteFacturaDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComprobanteFacturaDetalle ,this.jPanelParametrosReportesComprobanteFacturaDetalle, this.jScrollPanelDatosComprobanteFacturaDetalle,this.jPanelPaginacionComprobanteFacturaDetalle, this.jScrollPanelDatosEdicionComprobanteFacturaDetalle, this.jPanelAccionesComprobanteFacturaDetalle,this.jPanelAccionesFormularioComprobanteFacturaDetalle,this.jmenuBarComprobanteFacturaDetalle,this.jmenuBarDetalleComprobanteFacturaDetalle,this.jTtoolBarComprobanteFacturaDetalle,this.jTtoolBarDetalleComprobanteFacturaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFacturaDetalle=this.jTabbedPaneBusquedasComprobanteFacturaDetalle; 
		
		final JPanel jPanelParametrosReportesComprobanteFacturaDetalle=this.jPanelParametrosReportesComprobanteFacturaDetalle;
		//final JScrollPane jScrollPanelDatosComprobanteFacturaDetalle=this.jScrollPanelDatosComprobanteFacturaDetalle;
		final JTable jTableDatosComprobanteFacturaDetalle=this.jTableDatosComprobanteFacturaDetalle;		
		final JPanel jPanelPaginacionComprobanteFacturaDetalle=this.jPanelPaginacionComprobanteFacturaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFacturaDetalle=this.jScrollPanelDatosEdicionComprobanteFacturaDetalle;
		final JPanel jPanelAccionesComprobanteFacturaDetalle=this.jPanelAccionesComprobanteFacturaDetalle;
		
		JPanel jPanelCamposAuxiliarComprobanteFacturaDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			jPanelCamposAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelCamposComprobanteFacturaDetalle;
			jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelAccionesFormularioComprobanteFacturaDetalle;
		}
		
		final JPanel jPanelCamposComprobanteFacturaDetalle=jPanelCamposAuxiliarComprobanteFacturaDetalle;
		final JPanel jPanelAccionesFormularioComprobanteFacturaDetalle=jPanelAccionesFormularioAuxiliarComprobanteFacturaDetalle;
		
		
		final JMenuBar jmenuBarComprobanteFacturaDetalle=this.jmenuBarComprobanteFacturaDetalle;		
		final JToolBar jTtoolBarComprobanteFacturaDetalle=this.jTtoolBarComprobanteFacturaDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFacturaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			jmenuBarDetalleAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jmenuBarDetalleComprobanteFacturaDetalle;
			jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTtoolBarDetalleComprobanteFacturaDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFacturaDetalle=jmenuBarDetalleAuxiliarComprobanteFacturaDetalle;
		final JToolBar jTtoolBarDetalleComprobanteFacturaDetalle=jTtoolBarDetalleAuxiliarComprobanteFacturaDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFacturaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFacturaDetalle;
			processRunnable.jTableDatos=jTableDatosComprobanteFacturaDetalle;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFacturaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFacturaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFacturaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFacturaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFacturaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFacturaDetalle;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFacturaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFacturaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComprobanteFacturaDetalle ,jPanelParametrosReportesComprobanteFacturaDetalle, jTableDatosComprobanteFacturaDetalle,/*jScrollPanelDatosComprobanteFacturaDetalle,*/jPanelCamposComprobanteFacturaDetalle,jPanelPaginacionComprobanteFacturaDetalle, /*jScrollPanelDatosEdicionComprobanteFacturaDetalle,*/ jPanelAccionesComprobanteFacturaDetalle,jPanelAccionesFormularioComprobanteFacturaDetalle,jmenuBarComprobanteFacturaDetalle,jmenuBarDetalleComprobanteFacturaDetalle,jTtoolBarComprobanteFacturaDetalle,jTtoolBarDetalleComprobanteFacturaDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComprobanteFacturaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComprobanteFacturaDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComprobanteFacturaDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComprobanteFacturaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComprobanteFacturaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComprobanteFacturaDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComprobanteFacturaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComprobanteFacturaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComprobanteFacturaDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comprobantefacturadetalleConstantesFunciones.getsFinalQueryComprobanteFacturaDetalle();
		String  finalQueryPaginacionTodos=this.comprobantefacturadetalleConstantesFunciones.getsFinalQueryComprobanteFacturaDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComprobanteFacturaDetalleConstantesFunciones.getArrayColumnasGlobalesNoComprobanteFacturaDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComprobanteFacturaDetalleConstantesFunciones.getArrayColumnasGlobalesComprobanteFacturaDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComprobanteFacturaDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comprobantefacturadetallesEliminados= new ArrayList<ComprobanteFacturaDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComprobanteFacturaDetalle();
		
				///*ComprobanteFacturaDetalleSessionBean*/this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
			
			if(this.comprobantefacturadetalleSessionBean==null) {
				this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
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
					this.iNumeroPaginacion=ComprobanteFacturaDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComprobanteFacturaDetalleConstantesFunciones.getClassesForeignKeysOfComprobanteFacturaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comprobantefacturadetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comprobantefacturadetallesAux= new ArrayList<ComprobanteFacturaDetalle>();
			
				
			comprobantefacturadetalleLogic.setDatosCliente(this.datosCliente);
			comprobantefacturadetalleLogic.setDatosDeep(this.datosDeep);
			comprobantefacturadetalleLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComprobanteFacturaDetalle")) {
				this.sDetalleReporte=ComprobanteFacturaDetalleConstantesFunciones.getDetalleIndiceBusquedaComprobanteFacturaDetalle(fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comprobantefacturadetalleLogic.getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFacturaDetalleConstantesFunciones.getDetalleIndiceBusquedaComprobanteFacturaDetalle(fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFacturaDetalleConstantesFunciones.getDetalleIndiceBusquedaComprobanteFacturaDetalle(fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()==null||comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comprobantefacturadetalles==null|| comprobantefacturadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturadetallesAux=new ArrayList<ComprobanteFacturaDetalle>();
						comprobantefacturadetallesAux.addAll(comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturadetallesAux=new ArrayList<ComprobanteFacturaDetalle>();
							comprobantefacturadetallesAux.addAll(comprobantefacturadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comprobantefacturadetalleLogic.getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFacturaDetalleConstantesFunciones.getDetalleIndiceBusquedaComprobanteFacturaDetalle(fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFacturaDetalleConstantesFunciones.getDetalleIndiceBusquedaComprobanteFacturaDetalle(fecha_inicioBusquedaComprobanteFacturaDetalle,fecha_finBusquedaComprobanteFacturaDetalle);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComprobanteFacturaDetalles("BusquedaComprobanteFacturaDetalle",comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComprobanteFacturaDetalles("BusquedaComprobanteFacturaDetalle",comprobantefacturadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturadetalleLogic.setComprobanteFacturaDetalles(new ArrayList<ComprobanteFacturaDetalle>());
						comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().addAll(comprobantefacturadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturadetalles=new ArrayList<ComprobanteFacturaDetalle>();
							comprobantefacturadetalles.addAll(comprobantefacturadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComprobanteFacturaDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComprobanteFacturaDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturadetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturadetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComprobanteFacturaDetalle comprobantefacturadetalle) {
		Boolean permite=true;
		
		if(this.comprobantefacturadetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComprobanteFacturaDetalleConstantesFunciones.getOrderByListaComprobanteFacturaDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComprobanteFacturaDetalleConstantesFunciones.getOrderByListaComprobanteFacturaDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				if(comprobantefacturadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturadetalleTotales=comprobantefacturadetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalle:this.comprobantefacturadetalles) {
				if(comprobantefacturadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturadetalleTotales=comprobantefacturadetalle;
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
			this.comprobantefacturadetalleAux=new ComprobanteFacturaDetalle();
			this.comprobantefacturadetalleAux.setsType(Constantes2.S_TOTALES);
			this.comprobantefacturadetalleAux.setIsNew(false);
			this.comprobantefacturadetalleAux.setIsChanged(false);
			this.comprobantefacturadetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComprobanteFacturaDetalleConstantesFunciones.TotalizarValoresFilaComprobanteFacturaDetalle(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles(),this.comprobantefacturadetalleAux);
				
				//this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().add(this.comprobantefacturadetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComprobanteFacturaDetalleConstantesFunciones.TotalizarValoresFilaComprobanteFacturaDetalle(this.comprobantefacturadetalles,this.comprobantefacturadetalleAux);
				
				this.comprobantefacturadetalles.add(this.comprobantefacturadetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comprobantefacturadetalleTotales=new ComprobanteFacturaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().remove(comprobantefacturadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantefacturadetalles.remove(comprobantefacturadetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comprobantefacturadetalleTotales=new ComprobanteFacturaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				if(comprobantefacturadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturadetalleTotales=comprobantefacturadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFacturaDetalleConstantesFunciones.TotalizarValoresFilaComprobanteFacturaDetalle(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles(),comprobantefacturadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFacturaDetalle comprobantefacturadetalle:this.comprobantefacturadetalles) {
				if(comprobantefacturadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturadetalleTotales=comprobantefacturadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFacturaDetalleConstantesFunciones.TotalizarValoresFilaComprobanteFacturaDetalle(this.comprobantefacturadetalles,comprobantefacturadetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle()throws Exception {
		try {
			sAccionBusqueda="BusquedaComprobanteFacturaDetalle";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturaDetallesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturaDetallesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturaDetallesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturadetalleLogic.getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturaDetallesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturadetalleLogic.getComprobanteFacturaDetallesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturaDetallesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturadetalleLogic.getComprobanteFacturaDetallesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturaDetallesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturadetalleLogic.getComprobanteFacturaDetallesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosComprobanteFacturaDetalle() {
		this.isPermisoTodoComprobanteFacturaDetalle=false;
		this.isPermisoNuevoComprobanteFacturaDetalle=false;
		this.isPermisoActualizarComprobanteFacturaDetalle=false;
		this.isPermisoActualizarOriginalComprobanteFacturaDetalle=false;
		this.isPermisoEliminarComprobanteFacturaDetalle=false;
		this.isPermisoGuardarCambiosComprobanteFacturaDetalle=false;
		this.isPermisoConsultaComprobanteFacturaDetalle=true;
		this.isPermisoBusquedaComprobanteFacturaDetalle=true;
		this.isPermisoReporteComprobanteFacturaDetalle=true;
		this.isPermisoOrdenComprobanteFacturaDetalle=false;		
		this.isPermisoPaginacionMedioComprobanteFacturaDetalle=false;		
		this.isPermisoPaginacionAltoComprobanteFacturaDetalle=false;		
		this.isPermisoPaginacionTodoComprobanteFacturaDetalle=false;		
		this.isPermisoCopiarComprobanteFacturaDetalle=false;		
		this.isPermisoVerFormComprobanteFacturaDetalle=false;		
		this.isPermisoDuplicarComprobanteFacturaDetalle=false;
		this.isPermisoOrdenComprobanteFacturaDetalle=false;
	}
	
	public void setPermisosUsuarioComprobanteFacturaDetalle(Boolean isPermiso) {
		this.isPermisoTodoComprobanteFacturaDetalle=isPermiso;
		this.isPermisoNuevoComprobanteFacturaDetalle=isPermiso;
		this.isPermisoActualizarComprobanteFacturaDetalle=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFacturaDetalle=isPermiso;
		this.isPermisoEliminarComprobanteFacturaDetalle=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFacturaDetalle=isPermiso;
		this.isPermisoConsultaComprobanteFacturaDetalle=isPermiso;
		this.isPermisoBusquedaComprobanteFacturaDetalle=isPermiso;
		this.isPermisoReporteComprobanteFacturaDetalle=isPermiso;
		this.isPermisoOrdenComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoPaginacionMedioComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoPaginacionAltoComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoPaginacionTodoComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoCopiarComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoVerFormComprobanteFacturaDetalle=isPermiso;		
		this.isPermisoDuplicarComprobanteFacturaDetalle=isPermiso;
		this.isPermisoOrdenComprobanteFacturaDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComprobanteFacturaDetalle(Boolean isPermiso) {
		//this.isPermisoTodoComprobanteFacturaDetalle=isPermiso;
		this.isPermisoNuevoComprobanteFacturaDetalle=isPermiso;
		this.isPermisoActualizarComprobanteFacturaDetalle=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFacturaDetalle=isPermiso;
		this.isPermisoEliminarComprobanteFacturaDetalle=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFacturaDetalle=isPermiso;
		//this.isPermisoConsultaComprobanteFacturaDetalle=isPermiso;
		//this.isPermisoBusquedaComprobanteFacturaDetalle=isPermiso;
		//this.isPermisoReporteComprobanteFacturaDetalle=isPermiso;
		//this.isPermisoOrdenComprobanteFacturaDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioComprobanteFacturaDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoComprobanteFacturaDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoComprobanteFacturaDetalle=isPermiso;		
		//this.isPermisoCopiarComprobanteFacturaDetalle=isPermiso;		
		//this.isPermisoDuplicarComprobanteFacturaDetalle=isPermiso;
		//this.isPermisoOrdenComprobanteFacturaDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFacturaDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComprobanteFacturaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComprobanteFacturaDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFacturaDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComprobanteFacturaDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComprobanteFacturaDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComprobanteFacturaDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComprobanteFacturaDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComprobanteFacturaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComprobanteFacturaDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComprobanteFacturaDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComprobanteFacturaDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComprobanteFacturaDetalle=this.isPermisoActualizarComprobanteFacturaDetalle;
			this.isPermisoEliminarComprobanteFacturaDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComprobanteFacturaDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComprobanteFacturaDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComprobanteFacturaDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComprobanteFacturaDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComprobanteFacturaDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFacturaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComprobanteFacturaDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComprobanteFacturaDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComprobanteFacturaDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComprobanteFacturaDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComprobanteFacturaDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComprobanteFacturaDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFacturaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComprobanteFacturaDetalle.setToolTipText(this.jTableDatosComprobanteFacturaDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComprobanteFacturaDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComprobanteFacturaDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComprobanteFacturaDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyComprobanteFacturaDetalleListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComprobanteFacturaDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComprobanteFacturaDetalleJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyComprobanteFacturaDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comprobantefacturadetalleSessionBean==null) {
				this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean();
			}

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.comprobantefacturadetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyComprobanteFacturaDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteFacturaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComprobanteFacturaDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFacturaDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(comprobantefacturadetalle.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComprobanteFacturaDetalle()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.comprobantefacturadetalleConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFacturaDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComprobanteFacturaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComprobanteFacturaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComprobanteFacturaDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComprobanteFacturaDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComprobanteFacturaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComprobanteFacturaDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ComprobanteFacturaDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComprobanteFacturaDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComprobanteFacturaDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comprobantefacturadetalleSessionBean=new ComprobanteFacturaDetalleSessionBean(); 
		this.comprobantefacturadetalleConstantesFunciones=new ComprobanteFacturaDetalleConstantesFunciones(); 
		this.comprobantefacturadetalleBean=new ComprobanteFacturaDetalle();//(this.comprobantefacturadetalleConstantesFunciones); 		
		this.comprobantefacturadetalleReturnGeneral=new ComprobanteFacturaDetalleParameterReturnGeneral(); 
		
		this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComprobanteFacturaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComprobanteFacturaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComprobanteFacturaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComprobanteFacturaDetalle(true);
			
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
			
			this.comprobantefacturadetalleConstantesFunciones=new ComprobanteFacturaDetalleConstantesFunciones(); 
			this.comprobantefacturadetalleBean=new ComprobanteFacturaDetalle();//this.comprobantefacturadetalleConstantesFunciones); 			
			this.comprobantefacturadetalleReturnGeneral=new ComprobanteFacturaDetalleParameterReturnGeneral(); 
		
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Factura Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comprobantefacturadetalle=new ComprobanteFacturaDetalle();
			this.comprobantefacturadetalles = new ArrayList<ComprobanteFacturaDetalle>();
			this.comprobantefacturadetallesAux = new ArrayList<ComprobanteFacturaDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic=new ComprobanteFacturaDetalleLogic();
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.comprobantefacturadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comprobantefacturadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComprobanteFacturaDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle);	
					}
					
					if(this.jInternalFrameImportacionComprobanteFacturaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFacturaDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComprobanteFacturaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComprobanteFacturaDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFacturaDetalle);
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setVisible(false);
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle);
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComprobanteFacturaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFacturaDetalle);
					this.jInternalFrameImportacionComprobanteFacturaDetalle.setVisible(false);
					this.jInternalFrameImportacionComprobanteFacturaDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComprobanteFacturaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFacturaDetalle);
					this.jInternalFrameOrderByComprobanteFacturaDetalle.setVisible(false);
					this.jInternalFrameOrderByComprobanteFacturaDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComprobanteFacturaDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComprobanteFacturaDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comprobantefacturadetalleReturnGeneral=new ComprobanteFacturaDetalleParameterReturnGeneral();
			
			this.comprobantefacturadetalleParameterGeneral=new ComprobanteFacturaDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comprobantefacturadetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFacturaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFacturaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			
			
			this.isVisibilidadBusquedaComprobanteFacturaDetalle=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComprobanteFacturaDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComprobanteFacturaDetalle(false);
			
			this.setPermisosUsuarioComprobanteFacturaDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado() && this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComprobanteFacturaDetalleClasesRelacionadas();
			}
			
			if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComprobanteFacturaDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComprobanteFacturaDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComprobanteFacturaDetalle();
			}
			
			if(!this.isPermisoBusquedaComprobanteFacturaDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComprobanteFacturaDetalleConstantesFunciones.getTiposSeleccionarComprobanteFacturaDetalle());
				
				this.tiposColumnasSelect=ComprobanteFacturaDetalleConstantesFunciones.getTiposSeleccionarComprobanteFacturaDetalle(true);
				
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
			//if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComprobanteFacturaDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComprobanteFacturaDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComprobanteFacturaDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFacturaDetalle() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comprobantefacturadetalleImplementable= (ComprobanteFacturaDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFacturaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comprobantefacturadetalleImplementableHome= (ComprobanteFacturaDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFacturaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comprobantefacturadetalles= new ArrayList<ComprobanteFacturaDetalle>();
			this.comprobantefacturadetallesEliminados= new ArrayList<ComprobanteFacturaDetalle>();
						
			this.isEsNuevoComprobanteFacturaDetalle=false;
			this.esParaAccionDesdeFormularioComprobanteFacturaDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComprobanteFacturaDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComprobanteFacturaDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComprobanteFacturaDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComprobanteFacturaDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComprobanteFacturaDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComprobanteFacturaDetalle();
			}
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComprobanteFacturaDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComprobanteFacturaDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComprobanteFacturaDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComprobanteFacturaDetalle")) {
				iIndex=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComprobanteFacturaDetalle();	
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
	
	public void cargarCombosForeignKeyComprobanteFacturaDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComprobanteFacturaDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComprobanteFacturaDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComprobanteFacturaDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComprobanteFacturaDetalle();
		
		this.cargarCombosFrameForeignKeyComprobanteFacturaDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComprobanteFacturaDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComprobanteFacturaDetalle();
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
	
	public void jButtonNuevoComprobanteFacturaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			
			if(jTableDatosComprobanteFacturaDetalle.getRowCount()>=1) {
				jTableDatosComprobanteFacturaDetalle.removeRowSelectionInterval(0, jTableDatosComprobanteFacturaDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoComprobanteFacturaDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComprobanteFacturaDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(true);			
			//this.comprobantefacturadetalle=new ComprobanteFacturaDetalle();
			//this.comprobantefacturadetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle() ;
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFacturaDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comprobantefacturadetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);				
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComprobanteFacturaDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComprobanteFacturaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComprobanteFacturaDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComprobanteFacturaDetalle.getSelectedRows().length;			
			}
			
			comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComprobanteFacturaDetalle--;			
				//ComprobanteFacturaDetalle comprobantefacturadetalleAux= new ComprobanteFacturaDetalle();			
				//comprobantefacturadetalleAux.setId(this.iIdNuevoComprobanteFacturaDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComprobanteFacturaDetalle comprobantefacturadetalleOrigen=new ComprobanteFacturaDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComprobanteFacturaDetalle comprobantefacturadetalleOrigen : comprobantefacturadetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comprobantefacturadetalleOrigen =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturadetalleOrigen =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComprobanteFacturaDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comprobantefacturadetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComprobanteFacturaDetalle(comprobantefacturadetalleOrigen,this.comprobantefacturadetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().add(this.comprobantefacturadetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalles.add(this.comprobantefacturadetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
				
				this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(this.getIndiceNuevoComprobanteFacturaDetalle(), this.getIndiceNuevoComprobanteFacturaDetalle());
				
				int iLastRow =  this.jTableDatosComprobanteFacturaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFacturaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFacturaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();									
		
			ComprobanteFacturaDetalle comprobantefacturadetalleOrigen=new ComprobanteFacturaDetalle();
			ComprobanteFacturaDetalle comprobantefacturadetalleDestino=new ComprobanteFacturaDetalle();
				
			comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComprobanteFacturaDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comprobantefacturadetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComprobanteFacturaDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturadetalleOrigen =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantefacturadetalleOrigen =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturadetalleDestino =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantefacturadetalleDestino =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comprobantefacturadetalleOrigen =comprobantefacturadetallesSeleccionados.get(0);
				comprobantefacturadetalleDestino =comprobantefacturadetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComprobanteFacturaDetalle(comprobantefacturadetalleOrigen,comprobantefacturadetalleDestino,true,false);
				
				comprobantefacturadetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comprobantefacturadetalleDestino,comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comprobantefacturadetalleDestino,comprobantefacturadetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
				
				//this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(this.getIndiceNuevoComprobanteFacturaDetalle(), this.getIndiceNuevoComprobanteFacturaDetalle());
				
				int iLastRow =  this.jTableDatosComprobanteFacturaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFacturaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFacturaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComprobanteFacturaDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(!isVisible);
			this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(!isVisible);
			this.jPanelAccionesComprobanteFacturaDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComprobanteFacturaDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComprobanteFacturaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComprobanteFacturaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComprobanteFacturaDetalle();
			
			this.abrirFrameOrderByComprobanteFacturaDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComprobanteFacturaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComprobanteFacturaDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFacturaDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSize(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.iWidthFormulario,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComprobanteFacturaDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComprobanteFacturaDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jContentPaneDetalleComprobanteFacturaDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jContentPaneDetalleComprobanteFacturaDetalle.getWidth(),ComprobanteFacturaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jContentPaneDetalleComprobanteFacturaDetalle.getWidth(),ComprobanteFacturaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jContentPaneDetalleComprobanteFacturaDetalle.getWidth(),ComprobanteFacturaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComprobanteFacturaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComprobanteFacturaDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComprobanteFacturaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFacturaDetalle,false,this);
				} else {
					this.jInternalFrameOrderByComprobanteFacturaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFacturaDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFacturaDetalle);
				this.jInternalFrameOrderByComprobanteFacturaDetalle.setVisible(false);
				this.jInternalFrameOrderByComprobanteFacturaDetalle.setSelected(false);
				
				this.jInternalFrameOrderByComprobanteFacturaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFacturaDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByComprobanteFacturaDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComprobanteFacturaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComprobanteFacturaDetalle==null) {
				
				this.jInternalFrameImportacionComprobanteFacturaDetalle=new ImportacionJInternalFrame(ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFacturaDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFacturaDetalle);
				this.jInternalFrameImportacionComprobanteFacturaDetalle.setVisible(false);
				this.jInternalFrameImportacionComprobanteFacturaDetalle.setSelected(false);


				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFacturaDetalle"));
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFacturaDetalle"));
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFacturaDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComprobanteFacturaDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle==null) {
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle=new ReporteDinamicoJInternalFrame(ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle);
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFacturaDetalle"));
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFacturaDetalle"));
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFacturaDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFacturaDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComprobanteFacturaDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFacturaDetalle);
			
	       	this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.dispose();
			//this.jInternalFrameDetalleFormComprobanteFacturaDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComprobanteFacturaDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComprobanteFacturaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComprobanteFacturaDetalle.setVisible(true);
	        this.jInternalFrameImportacionComprobanteFacturaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComprobanteFacturaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setVisible(true);
	        this.jInternalFrameOrderByComprobanteFacturaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComprobanteFacturaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComprobanteFacturaDetalle.setVisible(false);
	        this.jInternalFrameOrderByComprobanteFacturaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComprobanteFacturaDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComprobanteFacturaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComprobanteFacturaDetalle.setVisible(false);
	        this.jInternalFrameImportacionComprobanteFacturaDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComprobanteFacturaDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComprobanteFacturaDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(true);
			//this.isEsNuevoComprobanteFacturaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false) ;
			
			if(comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFacturaDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComprobanteFacturaDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComprobanteFacturaDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(true);
			//this.isEsNuevoComprobanteFacturaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comprobantefacturadetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false) ;
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFacturaDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFacturaDetalle(false);
			
			//if(!this.isEsNuevoComprobanteFacturaDetalle) {								
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				
			}
			
			if(this.permiteMantenimiento(this.comprobantefacturadetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComprobanteFacturaDetalle=true;
					this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
					this.isEsNuevoComprobanteFacturaDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComprobanteFacturaDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComprobanteFacturaDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(false);
				
				this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(false);
			
												
				
				if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComprobanteFacturaDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,comprobantefacturadetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comprobantefacturadetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comprobantefacturadetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.comprobantefacturadetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.comprobantefacturadetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comprobantefacturadetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComprobanteFacturaDetalleModel) this.jTableDatosComprobanteFacturaDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComprobanteFacturaDetalle=true;
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
				this.isEsNuevoComprobanteFacturaDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(false);
				
				this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(false);
				
				
				
				if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComprobanteFacturaDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComprobanteFacturaDetalle.getRowCount()>=1) {
				jTableDatosComprobanteFacturaDetalle.removeRowSelectionInterval(0, jTableDatosComprobanteFacturaDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComprobanteFacturaDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(false) ;
			
			this.isEsNuevoComprobanteFacturaDetalle=false;
			
			if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComprobanteFacturaDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				
				//SI ES MANUAL
				if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComprobanteFacturaDetalle--;			
			//ComprobanteFacturaDetalle comprobantefacturadetalleAux= new ComprobanteFacturaDetalle();			
			//comprobantefacturadetalleAux.setId(this.iIdNuevoComprobanteFacturaDetalle);
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComprobanteFacturaDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
			
			this.comprobantefacturadetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().add(this.comprobantefacturadetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comprobantefacturadetalles.add(this.comprobantefacturadetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			
			this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(this.getIndiceNuevoComprobanteFacturaDetalle(), this.getIndiceNuevoComprobanteFacturaDetalle());
			
			int iLastRow =  this.jTableDatosComprobanteFacturaDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComprobanteFacturaDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComprobanteFacturaDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();
			}
			
			//this.abrirFrameTreeComprobanteFacturaDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComprobanteFacturaDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComprobanteFacturaDetalle.setFileImportacion(this.jInternalFrameImportacionComprobanteFacturaDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComprobanteFacturaDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComprobanteFacturaDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		

		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComprobanteFacturaDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComprobanteFacturaDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO:
					sNombreCampoCategoria="descuento_producto";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO:
					sNombreCampoCategoriaValor="descuento_producto";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_producto");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComprobanteFacturaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getdescuento_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComprobanteFacturaDetalle comprobantefacturadetalle:comprobantefacturadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefacturadetalle.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComprobanteFacturaDetalle(row);				
			//	iRow++;
			//}				
			
			//for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComprobanteFacturaDetalle(comprobantefacturadetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFacturaDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComprobanteFacturaDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComprobanteFacturaDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComprobanteFacturaDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComprobanteFacturaDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComprobanteFacturaDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComprobanteFacturaDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosComprobanteFacturaDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosComprobanteFacturaDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComprobanteFacturaDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComprobanteFacturaDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComprobanteFacturaDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComprobanteFacturaDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFacturaDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFacturaDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComprobanteFacturaDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComprobanteFacturaDetalle();
		
		this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFacturaDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFacturaDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFacturaDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFacturaDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComprobanteFacturaDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionNuevoComprobanteFacturaDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionSinCerrarComprobanteFacturaDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jCheckBoxPostAccionSinMensajeComprobanteFacturaDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComprobanteFacturaDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFacturaDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFacturaDetalle() throws Exception {
		try	{
			if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFacturaDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFacturaDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFacturaDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComprobanteFacturaDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComprobanteFacturaDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComprobanteFacturaDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.addItem(reporte);
			}
			
			
			if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComprobanteFacturaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComprobanteFacturaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFacturaDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFacturaDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComprobanteFacturaDetalleConstantesFunciones.getTiposSeleccionarComprobanteFacturaDetalle(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComprobanteFacturaDetalleConstantesFunciones.getTiposSeleccionarComprobanteFacturaDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComprobanteFacturaDetalleConstantesFunciones.getTiposSeleccionarComprobanteFacturaDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComprobanteFacturaDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaComprobanteFacturaDetalle=new Date(this.jDateChooserfecha_inicioBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.getDate().getTime());
		this.fecha_finBusquedaComprobanteFacturaDetalle=new Date(this.jDateChooserfecha_finBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComprobanteFacturaDetalle(Boolean esInicializar) throws Exception {				
		if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFacturaDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComprobanteFacturaDetalle() throws Exception {
		this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComprobanteFacturaDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComprobanteFacturaDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComprobanteFacturaDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comprobantefacturadetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComprobanteFacturaDetalle.setModel(new ComprobanteFacturaDetalleModel(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComprobanteFacturaDetalle.setModel(new ComprobanteFacturaDetalleModel(this.comprobantefacturadetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComprobanteFacturaDetalle!=null && this.jInternalFrameOrderByComprobanteFacturaDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComprobanteFacturaDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,comprobantefacturadetalleConstantesFunciones.resaltarSeleccionarComprobanteFacturaDetalle,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComprobanteFacturaDetalleConstantesFunciones.SCLASSWEBTITULO,comprobantefacturadetalleConstantesFunciones.resaltarSeleccionarComprobanteFacturaDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID));

		if(this.comprobantefacturadetalleConstantesFunciones.mostraridComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltaridComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activaridComprobanteFacturaDetalle,iSizeTabla,this,true,"idComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltaridComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activaridComprobanteFacturaDetalle,this,true,"idComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarsecuencialComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarsecuencialComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarsecuencialComprobanteFacturaDetalle,iSizeTabla,this,true,"secuencialComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarsecuencialComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarsecuencialComprobanteFacturaDetalle,this,true,"secuencialComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarfechaComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarfechaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarfechaComprobanteFacturaDetalle,iSizeTabla,this,true,"fechaComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarfechaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarfechaComprobanteFacturaDetalle,this,true,"fechaComprobanteFacturaDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_clienteComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_clienteComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_clienteComprobanteFacturaDetalle,iSizeTabla,this,true,"nombre_clienteComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_clienteComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_clienteComprobanteFacturaDetalle,this,true,"nombre_clienteComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrardescuentoComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescuentoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescuentoComprobanteFacturaDetalle,iSizeTabla,this,true,"descuentoComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescuentoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescuentoComprobanteFacturaDetalle,this,true,"descuentoComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarsubtotalComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarsubtotalComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarsubtotalComprobanteFacturaDetalle,iSizeTabla,this,true,"subtotalComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarsubtotalComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarsubtotalComprobanteFacturaDetalle,this,true,"subtotalComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrartotalComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltartotalComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activartotalComprobanteFacturaDetalle,iSizeTabla,this,true,"totalComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltartotalComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activartotalComprobanteFacturaDetalle,this,true,"totalComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_bodegaComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_bodegaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_bodegaComprobanteFacturaDetalle,iSizeTabla,this,true,"nombre_bodegaComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_bodegaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_bodegaComprobanteFacturaDetalle,this,true,"nombre_bodegaComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_productoComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_productoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_productoComprobanteFacturaDetalle,iSizeTabla,this,true,"nombre_productoComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_productoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarnombre_productoComprobanteFacturaDetalle,this,true,"nombre_productoComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarcantidadComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarcantidadComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarcantidadComprobanteFacturaDetalle,iSizeTabla,this,true,"cantidadComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarcantidadComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarcantidadComprobanteFacturaDetalle,this,true,"cantidadComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarprecioComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarprecioComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarprecioComprobanteFacturaDetalle,iSizeTabla,this,true,"precioComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarprecioComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarprecioComprobanteFacturaDetalle,this,true,"precioComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrardescuento_productoComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescuento_productoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescuento_productoComprobanteFacturaDetalle,iSizeTabla,this,true,"descuento_productoComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescuento_productoComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescuento_productoComprobanteFacturaDetalle,this,true,"descuento_productoComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarivaComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarivaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarivaComprobanteFacturaDetalle,iSizeTabla,this,true,"ivaComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarivaComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarivaComprobanteFacturaDetalle,this,true,"ivaComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrarserieComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarserieComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarserieComprobanteFacturaDetalle,iSizeTabla,this,true,"serieComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltarserieComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activarserieComprobanteFacturaDetalle,this,true,"serieComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comprobantefacturadetalleConstantesFunciones.mostrardescripcionComprobanteFacturaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescripcionComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescripcionComprobanteFacturaDetalle,iSizeTabla,this,true,"descripcionComprobanteFacturaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturadetalleConstantesFunciones.resaltardescripcionComprobanteFacturaDetalle,this.comprobantefacturadetalleConstantesFunciones.activardescripcionComprobanteFacturaDetalle,this,true,"descripcionComprobanteFacturaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFacturaDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFacturaDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComprobanteFacturaDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosComprobanteFacturaDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComprobanteFacturaDetalle.moveColumn(this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComprobanteFacturaDetalle.moveColumn(this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComprobanteFacturaDetalle.moveColumn(this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComprobanteFacturaDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComprobanteFacturaDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComprobanteFacturaDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComprobanteFacturaDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComprobanteFacturaDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComprobanteFacturaDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comprobantefacturadetalles.size()-1;
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
		//this.jTableDatosComprobanteFacturaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComprobanteFacturaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComprobanteFacturaDetalle();
			
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
				
				//this.isEsNuevoComprobanteFacturaDetalle=false;
					
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
				if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFacturaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comprobantefacturadetalle.getsType().equals("DUPLICADO")
				   || this.comprobantefacturadetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComprobanteFacturaDetalle=true;
				
				} else {
					this.isEsNuevoComprobanteFacturaDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.comprobantefacturadetalle.getId()>=0 && !this.comprobantefacturadetalle.getIsNew()) {						
						this.isEsNuevoComprobanteFacturaDetalle=false;
						
					} else {
						this.isEsNuevoComprobanteFacturaDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComprobanteFacturaDetalle(esRelaciones);						
				
				this.seleccionarComprobanteFacturaDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comprobantefacturadetalle.getId()<0) {
					this.isEsNuevoComprobanteFacturaDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComprobanteFacturaDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComprobanteFacturaDetalle(evt,rowIndex);
				}	
				
				if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComprobanteFacturaDetalle: " + this.dDif); 
					}
				}								
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComprobanteFacturaDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comprobantefacturadetalle)) {
					if(this.comprobantefacturadetalle.getId()>0) {
						this.comprobantefacturadetalle.setIsDeleted(true);
						
						this.comprobantefacturadetallesEliminados.add(this.comprobantefacturadetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().remove(this.comprobantefacturadetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalles.remove(this.comprobantefacturadetalle);				
					}
					
					
					((ComprobanteFacturaDetalleModel) this.jTableDatosComprobanteFacturaDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComprobanteFacturaDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComprobanteFacturaDetalle) {
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFacturaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.comprobantefacturadetalleConstantesFunciones.cargarid_clienteComprobanteFacturaDetalle || this.comprobantefacturadetalleConstantesFunciones.event_dependid_clienteComprobanteFacturaDetalle) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.comprobantefacturadetalle.getid_cliente());
									//this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(comprobantefacturadetalle.getCliente()!=null) {
							this.clientesForeignKey.add(comprobantefacturadetalle.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.comprobantefacturadetalle.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComprobanteFacturaDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComprobanteFacturaDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComprobanteFacturaDetalle(comprobantefacturadetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(comprobantefacturadetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComprobanteFacturaDetalle(comprobantefacturadetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFacturaDetalle(comprobantefacturadetalle);
	}
	
	public void setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setDate(comprobantefacturadetalle.getfecha());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalle.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_bodega());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_producto());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getcantidad().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getprecio().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescuento_producto().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getserie());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComprobanteFacturaDetalle comprobantefacturadetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comprobantefacturadetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComprobanteFacturaDetalle comprobantefacturadetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comprobantefacturadetalleLocal=this.comprobantefacturadetalle;
			} else {
				comprobantefacturadetalleLocal=this.comprobantefacturadetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comprobantefacturadetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComprobanteFacturaDetalle(comprobantefacturadetalleLocal,true);
					
					if(comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comprobantefacturadetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comprobantefacturadetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(comprobantefacturadetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(comprobantefacturadetalle);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(comprobantefacturadetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.getText()==null || this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.getText()=="" || this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setText("0");
			}

			if(conColumnasBase) {comprobantefacturadetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelIdComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setsecuencial(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsecuencialComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setfecha(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelfechaComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setnombre_cliente(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_clienteComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuentoComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelsubtotalComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.settotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeltotalComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setnombre_bodega(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_bodegaComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setnombre_producto(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelnombre_productoComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelcantidadComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelprecioComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setdescuento_producto(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescuento_productoComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setiva(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelivaComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setserie(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelserieComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefacturadetalle.setdescripcion(this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabeldescripcionComprobanteFacturaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalleBean,ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalleOrigen,ComprobanteFacturaDetalle comprobantefacturadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getId()!=null && !comprobantefacturadetalleOrigen.getId().equals(0L))) {comprobantefacturadetalle.setId(comprobantefacturadetalleOrigen.getId());}}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getid_cliente()!=null && !comprobantefacturadetalleOrigen.getid_cliente().equals(-1L))) {comprobantefacturadetalle.setid_cliente(comprobantefacturadetalleOrigen.getid_cliente());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getfecha_inicio()!=null && !comprobantefacturadetalleOrigen.getfecha_inicio().equals(new Date()))) {comprobantefacturadetalle.setfecha_inicio(comprobantefacturadetalleOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getfecha_fin()!=null && !comprobantefacturadetalleOrigen.getfecha_fin().equals(new Date()))) {comprobantefacturadetalle.setfecha_fin(comprobantefacturadetalleOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getsecuencial()!=null && !comprobantefacturadetalleOrigen.getsecuencial().equals(""))) {comprobantefacturadetalle.setsecuencial(comprobantefacturadetalleOrigen.getsecuencial());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getfecha()!=null && !comprobantefacturadetalleOrigen.getfecha().equals(new Date()))) {comprobantefacturadetalle.setfecha(comprobantefacturadetalleOrigen.getfecha());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getnombre_cliente()!=null && !comprobantefacturadetalleOrigen.getnombre_cliente().equals(""))) {comprobantefacturadetalle.setnombre_cliente(comprobantefacturadetalleOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getdescuento()!=null && !comprobantefacturadetalleOrigen.getdescuento().equals(0.0))) {comprobantefacturadetalle.setdescuento(comprobantefacturadetalleOrigen.getdescuento());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getsubtotal()!=null && !comprobantefacturadetalleOrigen.getsubtotal().equals(0.0))) {comprobantefacturadetalle.setsubtotal(comprobantefacturadetalleOrigen.getsubtotal());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.gettotal()!=null && !comprobantefacturadetalleOrigen.gettotal().equals(0.0))) {comprobantefacturadetalle.settotal(comprobantefacturadetalleOrigen.gettotal());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getnombre_bodega()!=null && !comprobantefacturadetalleOrigen.getnombre_bodega().equals(""))) {comprobantefacturadetalle.setnombre_bodega(comprobantefacturadetalleOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getnombre_producto()!=null && !comprobantefacturadetalleOrigen.getnombre_producto().equals(""))) {comprobantefacturadetalle.setnombre_producto(comprobantefacturadetalleOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getcantidad()!=null && !comprobantefacturadetalleOrigen.getcantidad().equals(0))) {comprobantefacturadetalle.setcantidad(comprobantefacturadetalleOrigen.getcantidad());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getprecio()!=null && !comprobantefacturadetalleOrigen.getprecio().equals(0.0))) {comprobantefacturadetalle.setprecio(comprobantefacturadetalleOrigen.getprecio());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getdescuento_producto()!=null && !comprobantefacturadetalleOrigen.getdescuento_producto().equals(0.0))) {comprobantefacturadetalle.setdescuento_producto(comprobantefacturadetalleOrigen.getdescuento_producto());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getiva()!=null && !comprobantefacturadetalleOrigen.getiva().equals(0.0))) {comprobantefacturadetalle.setiva(comprobantefacturadetalleOrigen.getiva());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getserie()!=null && !comprobantefacturadetalleOrigen.getserie().equals(""))) {comprobantefacturadetalle.setserie(comprobantefacturadetalleOrigen.getserie());}
			if(conDefault || (!conDefault && comprobantefacturadetalleOrigen.getdescripcion()!=null && !comprobantefacturadetalleOrigen.getdescripcion().equals(""))) {comprobantefacturadetalle.setdescripcion(comprobantefacturadetalleOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setDate(comprobantefacturadetalle.getfecha());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalle.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_bodega());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getnombre_producto());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getcantidad().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getprecio().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescuento_producto().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getserie());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setText(comprobantefacturadetalle.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFacturaDetalle(ComprobanteFacturaDetalleBean comprobantefacturadetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setDate(comprobantefacturadetalleBean.getfecha());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getnombre_bodega());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getnombre_producto());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getcantidad().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getprecio().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getdescuento_producto().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getserie());
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setText(comprobantefacturadetalleBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComprobanteFacturaDetalle(ComprobanteFacturaDetalleParameterReturnGeneral comprobantefacturadetalleReturnGeneral,ComprobanteFacturaDetalleBean comprobantefacturadetalleBean,Boolean conDefault) throws Exception { 
		try {
			ComprobanteFacturaDetalle comprobantefacturadetalleLocal=new ComprobanteFacturaDetalle();
			
			comprobantefacturadetalleLocal=comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getId()!=null && !comprobantefacturadetalleLocal.getId().equals(0L))) {comprobantefacturadetalleBean.setId(comprobantefacturadetalleLocal.getId());}}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getsecuencial()!=null && !comprobantefacturadetalleLocal.getsecuencial().equals(""))) {comprobantefacturadetalleBean.setsecuencial(comprobantefacturadetalleLocal.getsecuencial());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getfecha()!=null && !comprobantefacturadetalleLocal.getfecha().equals(new Date()))) {comprobantefacturadetalleBean.setfecha(comprobantefacturadetalleLocal.getfecha());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getnombre_cliente()!=null && !comprobantefacturadetalleLocal.getnombre_cliente().equals(""))) {comprobantefacturadetalleBean.setnombre_cliente(comprobantefacturadetalleLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getdescuento()!=null && !comprobantefacturadetalleLocal.getdescuento().equals(0.0))) {comprobantefacturadetalleBean.setdescuento(comprobantefacturadetalleLocal.getdescuento());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getsubtotal()!=null && !comprobantefacturadetalleLocal.getsubtotal().equals(0.0))) {comprobantefacturadetalleBean.setsubtotal(comprobantefacturadetalleLocal.getsubtotal());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.gettotal()!=null && !comprobantefacturadetalleLocal.gettotal().equals(0.0))) {comprobantefacturadetalleBean.settotal(comprobantefacturadetalleLocal.gettotal());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getnombre_bodega()!=null && !comprobantefacturadetalleLocal.getnombre_bodega().equals(""))) {comprobantefacturadetalleBean.setnombre_bodega(comprobantefacturadetalleLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getnombre_producto()!=null && !comprobantefacturadetalleLocal.getnombre_producto().equals(""))) {comprobantefacturadetalleBean.setnombre_producto(comprobantefacturadetalleLocal.getnombre_producto());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getcantidad()!=null && !comprobantefacturadetalleLocal.getcantidad().equals(0))) {comprobantefacturadetalleBean.setcantidad(comprobantefacturadetalleLocal.getcantidad());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getprecio()!=null && !comprobantefacturadetalleLocal.getprecio().equals(0.0))) {comprobantefacturadetalleBean.setprecio(comprobantefacturadetalleLocal.getprecio());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getdescuento_producto()!=null && !comprobantefacturadetalleLocal.getdescuento_producto().equals(0.0))) {comprobantefacturadetalleBean.setdescuento_producto(comprobantefacturadetalleLocal.getdescuento_producto());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getiva()!=null && !comprobantefacturadetalleLocal.getiva().equals(0.0))) {comprobantefacturadetalleBean.setiva(comprobantefacturadetalleLocal.getiva());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getserie()!=null && !comprobantefacturadetalleLocal.getserie().equals(""))) {comprobantefacturadetalleBean.setserie(comprobantefacturadetalleLocal.getserie());}
			if(conDefault || (!conDefault && comprobantefacturadetalleLocal.getdescripcion()!=null && !comprobantefacturadetalleLocal.getdescripcion().equals(""))) {comprobantefacturadetalleBean.setdescripcion(comprobantefacturadetalleLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComprobanteFacturaDetalleGenerico(Long idComprobanteFacturaDetalleSeleccionado,JComboBox jComboBoxComprobanteFacturaDetalle,List<ComprobanteFacturaDetalle> comprobantefacturadetallesLocal)throws Exception {
		try {
			ComprobanteFacturaDetalle  comprobantefacturadetalleTemp=null;

			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesLocal) {
				if(comprobantefacturadetalleAux.getId()!=null && comprobantefacturadetalleAux.getId().equals(idComprobanteFacturaDetalleSeleccionado)) {
					comprobantefacturadetalleTemp=comprobantefacturadetalleAux;
					break;
				}
			}

			jComboBoxComprobanteFacturaDetalle.setSelectedItem(comprobantefacturadetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComprobanteFacturaDetalleGenerico(JComboBox jComboBoxComprobanteFacturaDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFacturaDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComprobanteFacturaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFacturaDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComprobanteFacturaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComprobanteFacturaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComprobanteFacturaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefacturadetalle=(ComprobanteFacturaDetalle) comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantefacturadetalle =(ComprobanteFacturaDetalle) comprobantefacturadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comprobantefacturadetalle.getIsNew() && !comprobantefacturadetalle.getIsChanged() && !comprobantefacturadetalle.getIsDeleted()) {
				sDescripcion=comprobantefacturadetalle.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefacturadetalle.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!comprobantefacturadetalle.getIsNew() && !comprobantefacturadetalle.getIsChanged() && !comprobantefacturadetalle.getIsDeleted()) {
				sDescripcion=comprobantefacturadetalle.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefacturadetalle.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!comprobantefacturadetalle.getIsNew() && !comprobantefacturadetalle.getIsChanged() && !comprobantefacturadetalle.getIsDeleted()) {
				sDescripcion=comprobantefacturadetalle.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefacturadetalle.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComprobanteFacturaDetalle comprobantefacturadetalleRow=new ComprobanteFacturaDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefacturadetalleRow=(ComprobanteFacturaDetalle) comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantefacturadetalleRow=(ComprobanteFacturaDetalle) comprobantefacturadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));			
			this.jButtonDuplicarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle && this.isPermisoDuplicarComprobanteFacturaDetalle));			
			this.jButtonCopiarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle && this.isPermisoCopiarComprobanteFacturaDetalle));
			this.jButtonVerFormComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle && this.isPermisoVerFormComprobanteFacturaDetalle));
			
			this.jButtonAbrirOrderByComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));			
			
			this.jButtonNuevoRelacionesComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));			
			this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaModificarComprobanteFacturaDetalle && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle && this.isPermisoEliminarComprobanteFacturaDetalle));
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.setVisible(this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle);							
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));						
			this.jButtonDuplicarToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle && this.isPermisoDuplicarComprobanteFacturaDetalle));						
			this.jButtonCopiarToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle && this.isPermisoCopiarComprobanteFacturaDetalle));			
			this.jButtonVerFormToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle && this.isPermisoVerFormComprobanteFacturaDetalle));			
			this.jButtonAbrirOrderByToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));
			this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));			
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaModificarComprobanteFacturaDetalle && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle  && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle && this.isPermisoEliminarComprobanteFacturaDetalle));
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarToolBarComprobanteFacturaDetalle.setVisible(this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle);				
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));			
			this.jMenuItemDuplicarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle && this.isPermisoDuplicarComprobanteFacturaDetalle));			
			this.jMenuItemCopiarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle && this.isPermisoCopiarComprobanteFacturaDetalle));			
			this.jMenuItemVerFormComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle && this.isPermisoVerFormComprobanteFacturaDetalle));			
			this.jMenuItemAbrirOrderByComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));			
			//this.jMenuItemMostrarOcultarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));
			this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));			
			//this.jMenuItemDetalleMostrarOcultarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle && this.isPermisoOrdenComprobanteFacturaDetalle));			
			this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle));			
			this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle && this.isPermisoNuevoComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));									
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemModificarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaModificarComprobanteFacturaDetalle && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemActualizarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle && this.isPermisoActualizarComprobanteFacturaDetalle));	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemEliminarComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle && this.isPermisoEliminarComprobanteFacturaDetalle));
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemCancelarComprobanteFacturaDetalle.setVisible(this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle);				
			}
			
			this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));						
			this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=this.jButtonNuevoComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle=this.jButtonDuplicarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle=this.jButtonCopiarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle=this.jButtonVerFormComprobanteFacturaDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenComprobanteFacturaDetalle=this.jButtonAbrirOrderByComprobanteFacturaDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=this.jButtonNuevoRelacionesComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=this.jButtonModificarComprobanteFacturaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=this.jButtonNuevoToolBarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarToolBarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarToolBarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarToolBarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarToolBarComprobanteFacturaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=this.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=this.jMenuItemNuevoComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemModificarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemActualizarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemEliminarComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemCancelarComprobanteFacturaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComprobanteFacturaDetalle(Boolean esInicializar) {
		if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFacturaDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualComprobanteFacturaDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComprobanteFacturaDetalle() {
		this.jButtonNuevoComprobanteFacturaDetalle.setVisible(this.isPermisoNuevoComprobanteFacturaDetalle);			
		this.jButtonDuplicarComprobanteFacturaDetalle.setVisible(this.isPermisoDuplicarComprobanteFacturaDetalle);			
		this.jButtonCopiarComprobanteFacturaDetalle.setVisible(this.isPermisoCopiarComprobanteFacturaDetalle);			
		this.jButtonVerFormComprobanteFacturaDetalle.setVisible(this.isPermisoVerFormComprobanteFacturaDetalle);			
		
		this.jButtonAbrirOrderByComprobanteFacturaDetalle.setVisible(this.isPermisoOrdenComprobanteFacturaDetalle);					
		
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.setVisible(this.isPermisoNuevoComprobanteFacturaDetalle);			
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarComprobanteFacturaDetalle.setVisible(this.isPermisoActualizarComprobanteFacturaDetalle);	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.setVisible(this.isPermisoActualizarComprobanteFacturaDetalle);	
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.setVisible(this.isPermisoEliminarComprobanteFacturaDetalle);
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.setVisible(this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle);						
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.setVisible(this.isPermisoGuardarCambiosComprobanteFacturaDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.setVisible(this.isPermisoActualizarComprobanteFacturaDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFacturaDetalle() {
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarComprobanteFacturaDetalle.setVisible(this.isPermisoActualizarComprobanteFacturaDetalle);	
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.setVisible(this.isPermisoActualizarComprobanteFacturaDetalle);	
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.setVisible(this.isPermisoEliminarComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.setVisible(this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle);							
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.setVisible((this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle && this.isPermisoGuardarCambiosComprobanteFacturaDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComprobanteFacturaDetalle() {
		if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComprobanteFacturaDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComprobanteFacturaDetalle() {
	}
	
	public void jTableDatosComprobanteFacturaDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComprobanteFacturaDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comprobantefacturadetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComprobanteFacturaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComprobanteFacturaDetalle(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFacturaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comprobantefacturadetalleLogic.getConnexion());

				if(this.comprobantefacturadetalle.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comprobantefacturadetalle.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFacturaDetalle=(TitledBorder)this.jScrollPanelDatosComprobanteFacturaDetalle.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComprobanteFacturaDetalle.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comprobantefacturadetalle.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalComprobanteFacturaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebComprobanteFacturaDetalle(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFacturaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.comprobantefacturadetalleLogic.getConnexion());

				if(this.comprobantefacturadetalle.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.comprobantefacturadetalle.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFacturaDetalle=(TitledBorder)this.jScrollPanelDatosComprobanteFacturaDetalle.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderComprobanteFacturaDetalle.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.comprobantefacturadetalle.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteComprobanteFacturaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebComprobanteFacturaDetalle(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFacturaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFacturaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.comprobantefacturadetalleLogic.getConnexion());

				if(this.comprobantefacturadetalle.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.comprobantefacturadetalle.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFacturaDetalle=(TitledBorder)this.jScrollPanelDatosComprobanteFacturaDetalle.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderComprobanteFacturaDetalle.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.comprobantefacturadetalle.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.comprobantefacturadetalle.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.comprobantefacturadetalle.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.comprobantefacturadetalle.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.comprobantefacturadetalle.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.comprobantefacturadetalle.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.comprobantefacturadetalle.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.comprobantefacturadetalle.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.comprobantefacturadetalle.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.comprobantefacturadetalle.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.comprobantefacturadetalle.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.comprobantefacturadetalle.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.comprobantefacturadetalle.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_productoComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getdescuento_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_producto = "+this.comprobantefacturadetalle.getdescuento_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.comprobantefacturadetalle.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.comprobantefacturadetalle.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComprobanteFacturaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.getcomprobantefacturadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefacturadetalle==null) {
						this.comprobantefacturadetalle = new ComprobanteFacturaDetalle();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);
				}

				if(this.comprobantefacturadetalle.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comprobantefacturadetalle.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);

			this.getComprobanteFacturaDetallesBusquedaComprobanteFacturaDetalle();

			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);

			//if(ComprobanteFacturaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);

			this.getComprobanteFacturaDetallesFK_IdCliente();

			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);

			//if(ComprobanteFacturaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);

			this.getComprobanteFacturaDetallesFK_IdEmpresa();

			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);

			//if(ComprobanteFacturaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalComprobanteFacturaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);

			this.getComprobanteFacturaDetallesFK_IdSucursal();

			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);

			//if(ComprobanteFacturaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComprobanteFacturaDetalle() {
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.dispose();
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
			this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.dispose();
			this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle=null;
		}
		
		if(this.jInternalFrameImportacionComprobanteFacturaDetalle!=null) {
			this.jInternalFrameImportacionComprobanteFacturaDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionComprobanteFacturaDetalle.dispose();
			this.jInternalFrameImportacionComprobanteFacturaDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComprobanteFacturaDetalle();
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComprobanteFacturaDetalle")) {
				jButtonDuplicarComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComprobanteFacturaDetalle")) {
				jButtonCopiarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormComprobanteFacturaDetalle")) {
				jButtonVerFormComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComprobanteFacturaDetalle")) {
				jButtonDuplicarComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComprobanteFacturaDetalle")) {
				jButtonDuplicarComprobanteFacturaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComprobanteFacturaDetalle")) {
				jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComprobanteFacturaDetalle")) {
				jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComprobanteFacturaDetalle")) {
				jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComprobanteFacturaDetalle")) {
				jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComprobanteFacturaDetalle")) {
				jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComprobanteFacturaDetalle")) {
				jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarComprobanteFacturaDetalle")) {
				jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComprobanteFacturaDetalle")) {
				jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComprobanteFacturaDetalle")) {
				jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarComprobanteFacturaDetalle")) {
				jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComprobanteFacturaDetalle")) {
				jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComprobanteFacturaDetalle")) {
				jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarComprobanteFacturaDetalle")) {
				jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComprobanteFacturaDetalle")) {
				jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComprobanteFacturaDetalle")) {
				jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComprobanteFacturaDetalle")) {
				jButtonMostrarOcultarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComprobanteFacturaDetalle")) {
				jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComprobanteFacturaDetalle")) {
				jButtonCopiarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComprobanteFacturaDetalle")) {
				jButtonVerFormComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComprobanteFacturaDetalle")) {
				jButtonCopiarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComprobanteFacturaDetalle")) {
				jButtonVerFormComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComprobanteFacturaDetalle")) {
				jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComprobanteFacturaDetalle")) {
				jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComprobanteFacturaDetalle")) {
				jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComprobanteFacturaDetalle")) {
				jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComprobanteFacturaDetalle")) {
				jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComprobanteFacturaDetalle")) {
				jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComprobanteFacturaDetalle")) {
				jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComprobanteFacturaDetalle")) {
				jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComprobanteFacturaDetalle")) {
				jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComprobanteFacturaDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByComprobanteFacturaDetalle")) {
				jButtonAbrirOrderByComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComprobanteFacturaDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarComprobanteFacturaDetalle")) {
				jButtonMostrarOcultarComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFacturaDetalle")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComprobanteFacturaDetalle")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComprobanteFacturaDetalle")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComprobanteFacturaDetalle")) {
				jButtonCerrarReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComprobanteFacturaDetalle")) {
				jButtonGenerarReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComprobanteFacturaDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComprobanteFacturaDetalle")) {
				jButtonCerrarImportacionComprobanteFacturaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComprobanteFacturaDetalle")) {
				
				jButtonGenerarImportacionComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComprobanteFacturaDetalle")) {
				
				jButtonAbrirImportacionComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComprobanteFacturaDetalle")) {
				jComboBoxTiposAccionesComprobanteFacturaDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComprobanteFacturaDetalle")) {
				jComboBoxTiposRelacionesComprobanteFacturaDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComprobanteFacturaDetalle")) {
				jComboBoxTiposAccionesComprobanteFacturaDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComprobanteFacturaDetalle")) {
				
				jComboBoxTiposSeleccionarComprobanteFacturaDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComprobanteFacturaDetalle")) {
				jTextFieldValorCampoGeneralComprobanteFacturaDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComprobanteFacturaDetalle")) {
				jButtonAbrirOrderByComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComprobanteFacturaDetalle")) {
				jButtonAbrirOrderByComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComprobanteFacturaDetalle")) {
				jButtonCerrarOrderByComprobanteFacturaDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFacturaDetalleBusqueda")) {
				this.jButtonidComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_empresaComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_empresaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_sucursalComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_sucursalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_clienteComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_clienteComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfecha_inicioComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfecha_finComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFacturaDetalleBusqueda")) {
				this.jButtonsecuencialComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfechaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_clienteComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescuentoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFacturaDetalleBusqueda")) {
				this.jButtonsubtotalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFacturaDetalleBusqueda")) {
				this.jButtontotalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_bodegaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_productoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadComprobanteFacturaDetalleBusqueda")) {
				this.jButtoncantidadComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioComprobanteFacturaDetalleBusqueda")) {
				this.jButtonprecioComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_productoComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescuento_productoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonivaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieComprobanteFacturaDetalleBusqueda")) {
				this.jButtonserieComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescripcionComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle")) {
				this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalleActionPerformed(evt);
			}
			
			;
			
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComprobanteFacturaDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComprobanteFacturaDetalle comprobantefacturadetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				comprobantefacturadetalleLocal=this.comprobantefacturadetalle;
			} else {
				comprobantefacturadetalleLocal=this.comprobantefacturadetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
							
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
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
			
			


			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
								
						
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
								
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
							
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
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
			
			


			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
								
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComprobanteFacturaDetalle")) {
					jCheckBoxSeleccionarTodosComprobanteFacturaDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComprobanteFacturaDetalle")) {
					jCheckBoxSeleccionadosComprobanteFacturaDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComprobanteFacturaDetalle")) {
					
				}
				
				


				
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
												
				
				


				
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
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
			
			


			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefacturadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefacturadetalle);
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
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
				
				


				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFacturaDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFacturaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturadetalleAnterior =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComprobanteFacturaDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComprobanteFacturaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComprobanteFacturaDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comprobantefacturadetalle =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comprobantefacturadetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComprobanteFacturaDetalle")) {
				
				}
				
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComprobanteFacturaDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComprobanteFacturaDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComprobanteFacturaDetalle")) {
			
			}
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComprobanteFacturaDetalle();
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			if(sTipo.equals("NuevoComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComprobanteFacturaDetalle")) {
				jButtonDuplicarComprobanteFacturaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComprobanteFacturaDetalle")) {
				jButtonCopiarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComprobanteFacturaDetalle")) {
				jButtonVerFormComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComprobanteFacturaDetalle")) {
				jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComprobanteFacturaDetalle")) {
				jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComprobanteFacturaDetalle")) {
				jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComprobanteFacturaDetalle")) {
				jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComprobanteFacturaDetalle")) {
				jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComprobanteFacturaDetalle")) {
				jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComprobanteFacturaDetalle")) {
				jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFacturaDetalle")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComprobanteFacturaDetalle")) {
				jButtonAbrirOrderByComprobanteFacturaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComprobanteFacturaDetalle")) {
				jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComprobanteFacturaDetalle")) {
				jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComprobanteFacturaDetalle")) {
				jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFacturaDetalleBusqueda")) {
				this.jButtonidComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_empresaComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_empresaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_sucursalComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_sucursalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaDetalleUpdate")) {
				this.jButtonid_clienteComprobanteFacturaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaDetalleBusqueda")) {
				this.jButtonid_clienteComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfecha_inicioComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfecha_finComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFacturaDetalleBusqueda")) {
				this.jButtonsecuencialComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonfechaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_clienteComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescuentoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFacturaDetalleBusqueda")) {
				this.jButtonsubtotalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFacturaDetalleBusqueda")) {
				this.jButtontotalComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_bodegaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoComprobanteFacturaDetalleBusqueda")) {
				this.jButtonnombre_productoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadComprobanteFacturaDetalleBusqueda")) {
				this.jButtoncantidadComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioComprobanteFacturaDetalleBusqueda")) {
				this.jButtonprecioComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_productoComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescuento_productoComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFacturaDetalleBusqueda")) {
				this.jButtonivaComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieComprobanteFacturaDetalleBusqueda")) {
				this.jButtonserieComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComprobanteFacturaDetalleBusqueda")) {
				this.jButtondescripcionComprobanteFacturaDetalleBusquedaActionPerformed(evt);
			}
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComprobanteFacturaDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComprobanteFacturaDetalle")) {
				closingInternalFrameComprobanteFacturaDetalle();
				
			} else if(sTipo.equals("jButtonCancelarComprobanteFacturaDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormComprobanteFacturaDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            ComprobanteFacturaDetalleBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFacturaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFacturaDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComprobanteFacturaDetalleActionPerformed(null);
			}
			
			ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantefacturadetalle,new Object(),this.comprobantefacturadetalleParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComprobanteFacturaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComprobanteFacturaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComprobanteFacturaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comprobantefacturadetalle)) {
			if(!esControlTabla) {
				if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);			
				}
				
				if(this.comprobantefacturadetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral,this.comprobantefacturadetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comprobantefacturadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFacturaDetalle(classes,this.comprobantefacturadetalleReturnGeneral,this.comprobantefacturadetalleBean,false);
					}
						
					if(this.comprobantefacturadetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle());	
					}
						
					if(this.comprobantefacturadetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle(),classes);//this.comprobantefacturadetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComprobanteFacturaDetalle(this.comprobantefacturadetalle,classes);//this.comprobantefacturadetalleBean);									
				}
			
				if(ComprobanteFacturaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComprobanteFacturaDetalle(this.comprobantefacturadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFacturaDetalle(this.comprobantefacturadetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comprobantefacturadetalleAnterior!=null) {
						this.comprobantefacturadetalle=this.comprobantefacturadetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comprobantefacturadetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle(),comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalle(),this.comprobantefacturadetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComprobanteFacturaDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosComprobanteFacturaDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComprobanteFacturaDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosComprobanteFacturaDetalle() throws Exception {
		
		ComprobanteFacturaDetalleModel comprobantefacturadetalleModel=(ComprobanteFacturaDetalleModel)this.jTableDatosComprobanteFacturaDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefacturadetalleModel.comprobantefacturadetalles=this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comprobantefacturadetalleModel.comprobantefacturadetalles=this.comprobantefacturadetalles;
		}
		
		
		((ComprobanteFacturaDetalleModel) this.jTableDatosComprobanteFacturaDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComprobanteFacturaDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomprobantefacturadetalleAnterior(),this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomprobantefacturadetalleAnterior(),this.comprobantefacturadetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComprobanteFacturaDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
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
										
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantefacturadetalle,new Object(),generalEntityParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComprobanteFacturaDetalleConstantesFunciones.getClassesRelationshipsOfComprobanteFacturaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComprobanteFacturaDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfComprobanteFacturaDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComprobanteFacturaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantefacturadetalle,new Object(),generalEntityParameterGeneral,this.comprobantefacturadetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComprobanteFacturaDetalle(ComprobanteFacturaDetalleBean comprobantefacturadetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFacturaDetalle(ArrayList<Classe> classes,ComprobanteFacturaDetalleReturnGeneral comprobantefacturadetalleReturnGeneral,ComprobanteFacturaDetalleBean comprobantefacturadetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comprobantefacturadetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle = new ComprobanteFacturaDetalleDetalleFormJInternalFrame(jDesktopPane,this.comprobantefacturadetalleSessionBean.getConGuardarRelaciones(),this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setVisible(false);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.comprobantefacturadetalleLogic=this.comprobantefacturadetalleLogic;
		
		this.cargarCombosFrameForeignKeyComprobanteFacturaDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFacturaDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFacturaDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComprobanteFacturaDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComprobanteFacturaDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFacturaDetalle"));
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFacturaDetalle"));

		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFacturaDetalle"));
					
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemModificarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFacturaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFacturaDetalle"));
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFacturaDetalle"));
						
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemActualizarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFacturaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFacturaDetalle"));
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFacturaDetalle"));
								
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemEliminarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFacturaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFacturaDetalle"));
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFacturaDetalle"));
					
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemCancelarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFacturaDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemDetalleCerrarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFacturaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFacturaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFacturaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFacturaDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonidComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_finComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsecuencialComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfechaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuentoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsubtotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtontotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtoncantidadComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonprecioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"precioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuento_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonivaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonserieComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"serieComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescripcionComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComprobanteFacturaDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFacturaDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComprobanteFacturaDetalle"));
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFacturaDetalle"));
		}
		
		this.jTableDatosComprobanteFacturaDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComprobanteFacturaDetalle"));
		
		this.jTableDatosComprobanteFacturaDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComprobanteFacturaDetalle"));
		
		this.jButtonNuevoComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"NuevoComprobanteFacturaDetalle"));
		
		this.jButtonDuplicarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarComprobanteFacturaDetalle"));
		
		this.jButtonCopiarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"CopiarComprobanteFacturaDetalle"));
		
		this.jButtonVerFormComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"VerFormComprobanteFacturaDetalle"));
		
		
		this.jButtonNuevoToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarComprobanteFacturaDetalle"));
			
		this.jButtonDuplicarToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemNuevoComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComprobanteFacturaDetalle"));
			
		this.jMenuItemDuplicarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComprobanteFacturaDetalle"));		
		
		
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComprobanteFacturaDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComprobanteFacturaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFacturaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonModificarToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFacturaDetalle"));
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemModificarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFacturaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFacturaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonActualizarToolBarComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFacturaDetalle"));
				
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemActualizarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFacturaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFacturaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonEliminarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFacturaDetalle"));
						
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemEliminarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFacturaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFacturaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonCancelarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFacturaDetalle"));
			
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemCancelarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFacturaDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComprobanteFacturaDetalle"));		
		
		
		this.jButtonCerrarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CerrarComprobanteFacturaDetalle"));
		
		
		this.jButtonCerrarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemCerrarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComprobanteFacturaDetalle"));
			
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jMenuItemDetalleCerrarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFacturaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosComprobanteFacturaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFacturaDetalle"));
		}
		
		this.jButtonCopiarToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarComprobanteFacturaDetalle"));
			
		this.jButtonVerFormToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarComprobanteFacturaDetalle"));
		
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComprobanteFacturaDetalle"));
			
		this.jMenuItemCopiarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComprobanteFacturaDetalle"));		
		
		this.jMenuItemVerFormComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComprobanteFacturaDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFacturaDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFacturaDetalle"));		
		
		
		
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionComprobanteFacturaDetalle"));
					
		this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComprobanteFacturaDetalle"));
		
		this.jMenuItemRecargarInformacionComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComprobanteFacturaDetalle"));		
		
		
		
		this.jButtonAnterioresComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresComprobanteFacturaDetalle"));
		
		
		this.jButtonAnterioresToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComprobanteFacturaDetalle"));
		
		this.jMenuItemAnterioresComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComprobanteFacturaDetalle"));		
		
		
		this.jButtonSiguientesComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesComprobanteFacturaDetalle"));
		
		
		this.jButtonSiguientesToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemSiguientesComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComprobanteFacturaDetalle"));
			
		this.jMenuItemAbrirOrderByComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComprobanteFacturaDetalle"));
			
		this.jMenuItemMostrarOcultarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComprobanteFacturaDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComprobanteFacturaDetalle"));
			
		this.jMenuItemDetalleMostarOcultarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComprobanteFacturaDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComprobanteFacturaDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComprobanteFacturaDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComprobanteFacturaDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComprobanteFacturaDetalle"));

		this.jCheckBoxSeleccionadosComprobanteFacturaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComprobanteFacturaDetalle"));
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFacturaDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesComprobanteFacturaDetalle"));
			
		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesComprobanteFacturaDetalle"));
					
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComprobanteFacturaDetalle"));
			
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComprobanteFacturaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonidComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_finComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsecuencialComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfechaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuentoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsubtotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtontotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtoncantidadComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonprecioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"precioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuento_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonivaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonserieComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"serieComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescripcionComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComprobanteFacturaDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFacturaDetalle"));
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFacturaDetalle"));
				this.jInternalFrameReporteDinamicoComprobanteFacturaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFacturaDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFacturaDetalle"));				
			//this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFacturaDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFacturaDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComprobanteFacturaDetalle!=null) {
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFacturaDetalle"));
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFacturaDetalle"));
				this.jInternalFrameImportacionComprobanteFacturaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFacturaDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByComprobanteFacturaDetalle"));
			
			this.jButtonAbrirOrderByToolBarComprobanteFacturaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComprobanteFacturaDetalle"));			
			
			if(this.jInternalFrameOrderByComprobanteFacturaDetalle!=null) {
				this.jInternalFrameOrderByComprobanteFacturaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFacturaDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTabbedPaneRelacionesComprobanteFacturaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFacturaDetalle"));
		
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
            		closingInternalFrameComprobanteFacturaDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComprobanteFacturaDetalle = (JInternalFrameBase)event.getSource();
	            	
	            ComprobanteFacturaDetalleBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFacturaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFacturaDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComprobanteFacturaDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComprobanteFacturaDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComprobanteFacturaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComprobanteFacturaDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComprobanteFacturaDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComprobanteFacturaDetalle";
		inputMap = this.jButtonNuevoRelacionesComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFacturaDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComprobanteFacturaDetalle";
		inputMap = this.jButtonModificarComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComprobanteFacturaDetalle";
		inputMap = this.jButtonActualizarComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComprobanteFacturaDetalle";
		inputMap = this.jButtonEliminarComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComprobanteFacturaDetalle";
		inputMap = this.jButtonCancelarComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComprobanteFacturaDetalle";
		inputMap = this.jButtonCerrarComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComprobanteFacturaDetalle";
		inputMap = this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonGuardarCambiosComprobanteFacturaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComprobanteFacturaDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComprobanteFacturaDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComprobanteFacturaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComprobanteFacturaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComprobanteFacturaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComprobanteFacturaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonidComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_empresaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_sucursalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFacturaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonid_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_inicioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfecha_finComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsecuencialComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonfechaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_clienteComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuentoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonsubtotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtontotalComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_bodegaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonnombre_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtoncantidadComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"cantidadComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonprecioComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"precioComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescuento_productoComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descuento_productoComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonivaComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtonserieComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"serieComprobanteFacturaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jButtondescripcionComprobanteFacturaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComprobanteFacturaDetalleBusqueda"));
		
		
		this.jButtonBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComprobanteFacturaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComprobanteFacturaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComprobanteFacturaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComprobanteFacturaDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComprobanteFacturaDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
					comprobantefacturadetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalles) {
					comprobantefacturadetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComprobanteFacturaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
						comprobantefacturadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalles) {
						comprobantefacturadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFacturaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFacturaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComprobanteFacturaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComprobanteFacturaDetalle.getSelectedRows();
			
			ComprobanteFacturaDetalle comprobantefacturadetalleLocal=new ComprobanteFacturaDetalle();
			
			//this.seleccionarTodosComprobanteFacturaDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comprobantefacturadetalleLocal =(ComprobanteFacturaDetalle) this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles().toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comprobantefacturadetalleLocal =(ComprobanteFacturaDetalle) this.comprobantefacturadetalles.toArray()[this.jTableDatosComprobanteFacturaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comprobantefacturadetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
						comprobantefacturadetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalles) {
						comprobantefacturadetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFacturaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFacturaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComprobanteFacturaDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComprobanteFacturaDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComprobanteFacturaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComprobanteFacturaDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
				
						if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantefacturadetalleAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantefacturadetalleAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantefacturadetalleAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantefacturadetalleAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							comprobantefacturadetalleAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							comprobantefacturadetalleAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO)) {
							existe=true;
							comprobantefacturadetalleAux.setdescuento_producto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantefacturadetalleAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							comprobantefacturadetalleAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comprobantefacturadetalleAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalles) {
					
						if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantefacturadetalleAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantefacturadetalleAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantefacturadetalleAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantefacturadetalleAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantefacturadetalleAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							comprobantefacturadetalleAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							comprobantefacturadetalleAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							comprobantefacturadetalleAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO)) {
							existe=true;
							comprobantefacturadetalleAux.setdescuento_producto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantefacturadetalleAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							comprobantefacturadetalleAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comprobantefacturadetalleAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComprobanteFacturaDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComprobanteFacturaDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComprobanteFacturaDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComprobanteFacturaDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessComprobanteFacturaDetalle(conSplash);
				
					this.generarReporteComprobanteFacturaDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComprobanteFacturaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFacturaDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFacturaDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFacturaDetalle();
				
				this.exportarComprobanteFacturaDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComprobanteFacturaDetalles();
				//this.importarComprobanteFacturaDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFacturaDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComprobanteFacturaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comprobante Factura Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComprobanteFacturaDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComprobanteFacturaDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComprobanteFacturaDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(ComprobanteFacturaDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComprobanteFacturaDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComprobanteFacturaDetalle(conSplash);
					
						//this.actualizarParametrosGeneralComprobanteFacturaDetalle();
						
						this.generarReporteProcesoAccionComprobanteFacturaDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comprobante Factura DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Comprobante Factura Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComprobanteFacturaDetalle();
				
						this.actualizarParametrosGeneralComprobanteFacturaDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comprobantefacturadetalleReturnGeneral=comprobantefacturadetalleLogic.procesarAccionComprobanteFacturaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles(),this.comprobantefacturadetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComprobanteFacturaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComprobanteFacturaDetalle();
					
					ComprobanteFacturaDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComprobanteFacturaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFacturaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxTiposAccionesFormularioComprobanteFacturaDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComprobanteFacturaDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComprobanteFacturaDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComprobanteFacturaDetalle();
			
			if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
			ComprobanteFacturaDetalle comprobantefacturadetalle=new ComprobanteFacturaDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComprobanteFacturaDetalle.getSelectedItem();
			
			
			
			
			comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(comprobantefacturadetallesSeleccionados.size()==1) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
					comprobantefacturadetalle=comprobantefacturadetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComprobanteFacturaDetalle();
			
      		//this.finishProcessComprobanteFacturaDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComprobanteFacturaDetalleReturnGeneral() throws Exception {
		if(this.comprobantefacturadetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comprobantefacturadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comprobantefacturadetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comprobantefacturadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comprobantefacturadetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comprobantefacturadetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
		}
		
		if(this.comprobantefacturadetalleReturnGeneral.getConRetornoLista() || this.comprobantefacturadetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.comprobantefacturadetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comprobantefacturadetalleLogic.setComprobanteFacturaDetalles(this.comprobantefacturadetalleReturnGeneral.getComprobanteFacturaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComprobanteFacturaDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralComprobanteFacturaDetalle() throws Exception {
		
		
	}
	
	public ArrayList<ComprobanteFacturaDetalle> getComprobanteFacturaDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComprobanteFacturaDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetalleLogic.getComprobanteFacturaDetalles()) {
					if(comprobantefacturadetalleAux.getIsSelected()) {
						comprobantefacturadetallesSeleccionados.add(comprobantefacturadetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:this.comprobantefacturadetalles) {
					if(comprobantefacturadetalleAux.getIsSelected()) {
						comprobantefacturadetallesSeleccionados.add(comprobantefacturadetalleAux);				
					}
				}
			}
			
			if(comprobantefacturadetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comprobantefacturadetallesSeleccionados.addAll(this.comprobantefacturadetalleLogic.getComprobanteFacturaDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comprobantefacturadetallesSeleccionados.addAll(this.comprobantefacturadetalles);				
					}
				}
			}
		} else {
			comprobantefacturadetallesSeleccionados.add(this.comprobantefacturadetalle);
		}
		
		return comprobantefacturadetallesSeleccionados;
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
	
	public void generarReporteComprobanteFacturaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComprobanteFacturaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComprobanteFacturaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFacturaDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFacturaDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comprobante Factura Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComprobanteFacturaDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComprobanteFacturaDetalle();
		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComprobanteFacturaDetalle();
		
		
		//this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados ,comprobantefacturadetalleImplementable,comprobantefacturadetalleImplementableHome);
	}
	
	public void mostrarImportacionComprobanteFacturaDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComprobanteFacturaDetalle();
		
		this.abrirFrameImportacionComprobanteFacturaDetalle();		
		
			
		//this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados ,comprobantefacturadetalleImplementable,comprobantefacturadetalleImplementableHome);
	}
	
	public void importarComprobanteFacturaDetalles() throws Exception {		
	
	}
	
	public void exportarComprobanteFacturaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComprobanteFacturaDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComprobanteFacturaDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComprobanteFacturaDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comprobante Factura Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComprobanteFacturaDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComprobanteFacturaDetalle(comprobantefacturadetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comprobantefacturadetalleAux.setsDetalleGeneralEntityReporte(comprobantefacturadetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComprobanteFacturaDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comprobantefacturadetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getdescuento_producto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefacturadetalle.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComprobanteFacturaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComprobanteFacturaDetalle(row);				
				iRow++;
			}				
			
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComprobanteFacturaDetalle(comprobantefacturadetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComprobanteFacturaDetallesSeleccionados() throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();		
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefacturadetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comprobantefacturadetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comprobantefacturadetalle");
			//elementRoot.appendChild(element);
		
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
				element = document.createElement("comprobantefacturadetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComprobanteFacturaDetalle(comprobantefacturadetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComprobanteFacturaDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCUENTOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getdescuento_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefacturadetalle.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComprobanteFacturaDetalle(ComprobanteFacturaDetalle comprobantefacturadetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comprobantefacturadetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comprobantefacturadetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comprobantefacturadetalle.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(comprobantefacturadetalle.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(comprobantefacturadetalle.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha_inicio = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(comprobantefacturadetalle.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(comprobantefacturadetalle.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementsecuencial = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(comprobantefacturadetalle.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(comprobantefacturadetalle.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnombre_cliente = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(comprobantefacturadetalle.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementdescuento = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(comprobantefacturadetalle.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementsubtotal = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(comprobantefacturadetalle.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementtotal = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(comprobantefacturadetalle.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementnombre_bodega = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(comprobantefacturadetalle.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(comprobantefacturadetalle.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(comprobantefacturadetalle.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(comprobantefacturadetalle.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento_producto = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.DESCUENTOPRODUCTO);
		elementdescuento_producto.appendChild(document.createTextNode(comprobantefacturadetalle.getdescuento_producto().toString().trim()));
		element.appendChild(elementdescuento_producto);

		Element elementiva = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(comprobantefacturadetalle.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementserie = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(comprobantefacturadetalle.getserie().trim()));
		element.appendChild(elementserie);

		Element elementdescripcion = document.createElement(ComprobanteFacturaDetalleConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comprobantefacturadetalle.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComprobanteFacturaDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados=new ArrayList<ComprobanteFacturaDetalle>();
		
		comprobantefacturadetallesSeleccionados=this.getComprobanteFacturaDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComprobanteFacturaDetalle(comprobantefacturadetallesSeleccionados);
		
		this.generarReporteComprobanteFacturaDetalles("Todos",comprobantefacturadetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComprobanteFacturaDetalle(ArrayList<ComprobanteFacturaDetalle> comprobantefacturadetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComprobanteFacturaDetalle comprobantefacturadetalleAux:comprobantefacturadetallesSeleccionados) {
				comprobantefacturadetalleAux.setsDetalleGeneralEntityReporte(comprobantefacturadetalleAux.toString());
			
				if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturadetalleAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturadetalleAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturadetalleAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comprobantefacturadetalleAux.setsDescripcionGeneralEntityReporte1(comprobantefacturadetalleAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComprobanteFacturaDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComprobanteFacturaDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=true;
		} else {
			this.actualizarEstadoPanelsComprobanteFacturaDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComprobanteFacturaDetalle=false;
			//this.isVisibilidadCeldaVerFormComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaDuplicarComprobanteFacturaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!comprobantefacturadetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;												
			}
			
			this.jButtonCerrarComprobanteFacturaDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.comprobantefacturadetalle)) {
			this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
			this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComprobanteFacturaDetalle=false;
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFacturaDetalle=false;
		this.isVisibilidadCeldaGuardarCambiosComprobanteFacturaDetalle=false;
		//this.isVisibilidadCeldaModificarComprobanteFacturaDetalle=true;
		this.isVisibilidadCeldaActualizarComprobanteFacturaDetalle=false;
		this.isVisibilidadCeldaEliminarComprobanteFacturaDetalle=false;
		//this.isVisibilidadCeldaCancelarComprobanteFacturaDetalle=true;			
		this.isVisibilidadCeldaGuardarComprobanteFacturaDetalle=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFacturaDetalle() {
	}
	
	public void actualizarEstadoPanelsComprobanteFacturaDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosEdicionComprobanteFacturaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFacturaDetalle!=null) {
				this.jScrollPanelDatosComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFacturaDetalle!=null) {
				this.jPanelPaginacionComprobanteFacturaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
					this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comprobantefacturadetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle!=null) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComprobanteFacturaDetalle!=null) {
				this.jPanelParametrosReportesComprobanteFacturaDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComprobanteFacturaDetalle=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComprobanteFacturaDetalle) {this.jTabbedPaneBusquedasComprobanteFacturaDetalle.remove(jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaComprobanteFacturaDetalle=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaComprobanteFacturaDetalle) {this.jTabbedPaneBusquedasComprobanteFacturaDetalle.remove(jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaComprobanteFacturaDetalle=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaComprobanteFacturaDetalle) {this.jTabbedPaneBusquedasComprobanteFacturaDetalle.remove(jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);}
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
			
			this.inicializarActualizarBindingTablaComprobanteFacturaDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComprobanteFacturaDetalle() {
		this.updateBorderResaltarBusquedasFormularioComprobanteFacturaDetalle();
		this.updateVisibilidadBusquedasFormularioComprobanteFacturaDetalle();
		this.updateHabilitarBusquedasFormularioComprobanteFacturaDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioComprobanteFacturaDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponents().length>0) {
	

		if(this.comprobantefacturadetalleConstantesFunciones.resaltarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle!=null) {
			index= this.jTabbedPaneBusquedasComprobanteFacturaDetalle.indexOfComponent(this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponent(index);
				jPanel.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComprobanteFacturaDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFacturaDetalle.indexOfComponent(this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			if(!this.comprobantefacturadetalleConstantesFunciones.mostrarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle && index>-1) {
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComprobanteFacturaDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFacturaDetalle.indexOfComponent(this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
				this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setEnabledAt(index,this.comprobantefacturadetalleConstantesFunciones.activarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComprobanteFacturaDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComprobanteFacturaDetalle")) {
			index= this.jTabbedPaneBusquedasComprobanteFacturaDetalle.indexOfComponent(this.jPanelBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);

			this.jTabbedPaneBusquedasComprobanteFacturaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFacturaDetalle.getComponent(index);

			this.comprobantefacturadetalleConstantesFunciones.setResaltarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle(resaltar);

			jPanel.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarBusquedaComprobanteFacturaDetalleComprobanteFacturaDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComprobanteFacturaDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComprobanteFacturaDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComprobanteFacturaDetalle();
		this.updateVisibilidadResaltarControlesFormularioComprobanteFacturaDetalle();
		this.updateHabilitarResaltarControlesFormularioComprobanteFacturaDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioComprobanteFacturaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comprobantefacturadetalleConstantesFunciones.resaltaridComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltaridComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarid_empresaComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarid_empresaComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarid_sucursalComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarid_sucursalComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarid_clienteComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarid_clienteComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarfecha_inicioComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_inicioComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarfecha_inicioComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarfecha_finComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_finComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarfecha_finComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarsecuencialComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarsecuencialComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarfechaComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarfechaComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_clienteComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_clienteComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltardescuentoComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltardescuentoComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarsubtotalComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarsubtotalComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltartotalComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltartotalComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_bodegaComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_bodegaComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_productoComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarnombre_productoComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarcantidadComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarcantidadComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarprecioComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarprecioComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltardescuento_productoComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltardescuento_productoComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarivaComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarivaComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltarserieComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltarserieComprobanteFacturaDetalle);}
		if(this.comprobantefacturadetalleConstantesFunciones.resaltardescripcionComprobanteFacturaDetalle!=null && this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setBorder(this.comprobantefacturadetalleConstantesFunciones.resaltardescripcionComprobanteFacturaDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComprobanteFacturaDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
	
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostraridComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelidComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostraridComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_empresaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelid_empresaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_empresaComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_sucursalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelid_sucursalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_sucursalComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_clienteComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelid_clienteComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarid_clienteComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_inicioComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfecha_inicioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelfecha_inicioComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfecha_inicioComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_finComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfecha_finComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelfecha_finComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfecha_finComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarsecuencialComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelsecuencialComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarsecuencialComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfechaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelfechaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarfechaComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_clienteComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelnombre_clienteComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_clienteComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescuentoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPaneldescuentoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescuentoComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarsubtotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelsubtotalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarsubtotalComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrartotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPaneltotalComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrartotalComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_bodegaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelnombre_bodegaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_bodegaComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelnombre_productoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarnombre_productoComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarcantidadComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelcantidadComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarcantidadComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarprecioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelprecioComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarprecioComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescuento_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPaneldescuento_productoComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescuento_productoComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarivaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelivaComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarivaComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarserieComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPanelserieComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrarserieComprobanteFacturaDetalle);
		//this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescripcionComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jPaneldescripcionComprobanteFacturaDetalle.setVisible(this.comprobantefacturadetalleConstantesFunciones.mostrardescripcionComprobanteFacturaDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComprobanteFacturaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFacturaDetalle!=null) {
	
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jLabelidComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activaridComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_empresaComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarid_empresaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_sucursalComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarid_sucursalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jComboBoxid_clienteComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarid_clienteComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_inicioComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarfecha_inicioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfecha_finComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarfecha_finComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsecuencialComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarsecuencialComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jDateChooserfechaComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarfechaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_clienteComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarnombre_clienteComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuentoComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activardescuentoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldsubtotalComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarsubtotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldtotalComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activartotalComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_bodegaComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarnombre_bodegaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreanombre_productoComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarnombre_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldcantidadComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarcantidadComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldprecioComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarprecioComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFielddescuento_productoComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activardescuento_productoComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldivaComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarivaComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextFieldserieComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activarserieComprobanteFacturaDetalle);
		this.jInternalFrameDetalleFormComprobanteFacturaDetalle.jTextAreadescripcionComprobanteFacturaDetalle.setEnabled(this.comprobantefacturadetalleConstantesFunciones.activardescripcionComprobanteFacturaDetalle);
		}
	}
	
		
}