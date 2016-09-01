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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.VentasCajasResumidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasCajasResumidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasCajasResumidosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasCajasResumidosBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
public class VentasCajasResumidosBeanSwingJInternalFrame extends VentasCajasResumidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasCajasResumidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasCajasResumidos> ventascajasresumidosValidator = new ClassValidator<VentasCajasResumidos>(VentasCajasResumidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasCajasResumidos ventascajasresumidos;	
	public VentasCajasResumidos ventascajasresumidosAux;
	public VentasCajasResumidos ventascajasresumidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasCajasResumidos ventascajasresumidosTotales;
	public Long idVentasCajasResumidosActual;
	public Long iIdNuevoVentasCajasResumidos=0L;
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
	
	public Boolean isPermisoTodoVentasCajasResumidos;
	public Boolean isPermisoNuevoVentasCajasResumidos;
	public Boolean isPermisoActualizarVentasCajasResumidos;
	public Boolean isPermisoActualizarOriginalVentasCajasResumidos;
	public Boolean isPermisoEliminarVentasCajasResumidos;
	public Boolean isPermisoGuardarCambiosVentasCajasResumidos;
	public Boolean isPermisoConsultaVentasCajasResumidos;
	public Boolean isPermisoBusquedaVentasCajasResumidos;
	public Boolean isPermisoReporteVentasCajasResumidos;
	public Boolean isPermisoPaginacionMedioVentasCajasResumidos;
	public Boolean isPermisoPaginacionAltoVentasCajasResumidos;
	public Boolean isPermisoPaginacionTodoVentasCajasResumidos;
	public Boolean isPermisoCopiarVentasCajasResumidos;
	public Boolean isPermisoVerFormVentasCajasResumidos;
	public Boolean isPermisoDuplicarVentasCajasResumidos;
	public Boolean isPermisoOrdenVentasCajasResumidos;
	
	
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
	
	public VentasCajasResumidosParameterReturnGeneral ventascajasresumidosReturnGeneral;
	public VentasCajasResumidosParameterReturnGeneral ventascajasresumidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasCajasResumidos=false;
	public Boolean esParaAccionDesdeFormularioVentasCajasResumidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasCajasResumidosSessionBeanAdditional ventascajasresumidosSessionBeanAdditional=null;
	
	public VentasCajasResumidosSessionBeanAdditional getVentasCajasResumidosSessionBeanAdditional() {
		return this.ventascajasresumidosSessionBeanAdditional;
	}
	
	public void setVentasCajasResumidosSessionBeanAdditional(VentasCajasResumidosSessionBeanAdditional ventascajasresumidosSessionBeanAdditional) {
		try {
			this.ventascajasresumidosSessionBeanAdditional=ventascajasresumidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasCajasResumidosBeanSwingJInternalFrameAdditional ventascajasresumidosBeanSwingJInternalFrameAdditional=null;
	//public class VentasCajasResumidosBeanSwingJInternalFrame
	
	public VentasCajasResumidosBeanSwingJInternalFrameAdditional getVentasCajasResumidosBeanSwingJInternalFrameAdditional() {
		return this.ventascajasresumidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasCajasResumidosBeanSwingJInternalFrameAdditional(VentasCajasResumidosBeanSwingJInternalFrameAdditional ventascajasresumidosBeanSwingJInternalFrameAdditional) {
		try {
			this.ventascajasresumidosBeanSwingJInternalFrameAdditional=ventascajasresumidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasCajasResumidosLogic ventascajasresumidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasCajasResumidos ventascajasresumidosBean;
	public VentasCajasResumidosConstantesFunciones ventascajasresumidosConstantesFunciones;
	//public VentasCajasResumidosParameterReturnGeneral ventascajasresumidosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<VentasCajasResumidos> ventascajasresumidoss;	
	//public List<VentasCajasResumidos> ventascajasresumidossEliminados;
	//public List<VentasCajasResumidos> ventascajasresumidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaDuplicarVentasCajasResumidos=true;
	public Boolean isVisibilidadCeldaCopiarVentasCajasResumidos=true;
	public Boolean isVisibilidadCeldaVerFormVentasCajasResumidos=true;
	public Boolean isVisibilidadCeldaOrdenVentasCajasResumidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaModificarVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaActualizarVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaEliminarVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaCancelarVentasCajasResumidos=false;
	public Boolean isVisibilidadCeldaGuardarVentasCajasResumidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasCajasResumidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVentasCajasResumidos() {
		return this.iIdNuevoVentasCajasResumidos;
	}

	public void setiIdNuevoVentasCajasResumidos(Long iIdNuevoVentasCajasResumidos) {
		this.iIdNuevoVentasCajasResumidos = iIdNuevoVentasCajasResumidos;
	}
	
	public Long getidVentasCajasResumidosActual() {
		return this.idVentasCajasResumidosActual;
	}

	public void setidVentasCajasResumidosActual(Long idVentasCajasResumidosActual) {
		this.idVentasCajasResumidosActual = idVentasCajasResumidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasCajasResumidos getventascajasresumidos() {
		return this.ventascajasresumidos;
	}

	public void setventascajasresumidos(VentasCajasResumidos ventascajasresumidos) {
		this.ventascajasresumidos = ventascajasresumidos;
	}
	
	public VentasCajasResumidos getventascajasresumidosAux() {
		return this.ventascajasresumidosAux;
	}

	public void setventascajasresumidosAux(VentasCajasResumidos ventascajasresumidosAux) {
		this.ventascajasresumidosAux = ventascajasresumidosAux;
	}				
	
	public VentasCajasResumidos getventascajasresumidosAnterior() {
		return this.ventascajasresumidosAnterior;
	}

	public void setventascajasresumidosAnterior(VentasCajasResumidos ventascajasresumidosAnterior) {
		this.ventascajasresumidosAnterior = ventascajasresumidosAnterior;
	}	
	
	public VentasCajasResumidos getventascajasresumidosTotales() {
		return this.ventascajasresumidosTotales;
	}

	public void setventascajasresumidosTotales(VentasCajasResumidos ventascajasresumidosTotales) {
		this.ventascajasresumidosTotales = ventascajasresumidosTotales;
	}	
	
	public VentasCajasResumidos getventascajasresumidosBean() {
		return this.ventascajasresumidosBean;
	}

	public void setventascajasresumidosBean(VentasCajasResumidos ventascajasresumidosBean) {
		this.ventascajasresumidosBean = ventascajasresumidosBean;
	}	
	
	public VentasCajasResumidosParameterReturnGeneral getventascajasresumidosReturnGeneral() {
		return this.ventascajasresumidosReturnGeneral;
	}

	public void setventascajasresumidosReturnGeneral(VentasCajasResumidosParameterReturnGeneral ventascajasresumidosReturnGeneral) {
		this.ventascajasresumidosReturnGeneral = ventascajasresumidosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaVentasCajasResumidos=new Date();

	public Date getfecha_emision_desdeBusquedaVentasCajasResumidos() {
		return this.fecha_emision_desdeBusquedaVentasCajasResumidos;
	}

	public void setfecha_emision_desdeBusquedaVentasCajasResumidos(Date fecha_emision_desdeBusquedaVentasCajasResumidos) {
		this.fecha_emision_desdeBusquedaVentasCajasResumidos = fecha_emision_desdeBusquedaVentasCajasResumidos;
	}

;
	public Date fecha_emision_hastaBusquedaVentasCajasResumidos=new Date();

	public Date getfecha_emision_hastaBusquedaVentasCajasResumidos() {
		return this.fecha_emision_hastaBusquedaVentasCajasResumidos;
	}

	public void setfecha_emision_hastaBusquedaVentasCajasResumidos(Date fecha_emision_hastaBusquedaVentasCajasResumidos) {
		this.fecha_emision_hastaBusquedaVentasCajasResumidos = fecha_emision_hastaBusquedaVentasCajasResumidos;
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
	
	
	public VentasCajasResumidosLogic getVentasCajasResumidosLogic()	{		
		return ventascajasresumidosLogic;
	}

	public void setVentasCajasResumidosLogic(VentasCajasResumidosLogic ventascajasresumidosLogic) {
		this.ventascajasresumidosLogic = ventascajasresumidosLogic;
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
	
	public Boolean getIsEsNuevoVentasCajasResumidos() {
		return isEsNuevoVentasCajasResumidos;
	}

	public void setIsEsNuevoVentasCajasResumidos(Boolean isEsNuevoVentasCajasResumidos) {
		this.isEsNuevoVentasCajasResumidos = isEsNuevoVentasCajasResumidos;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasCajasResumidos() {
		return esParaAccionDesdeFormularioVentasCajasResumidos;
	}
	
	public void setEsParaAccionDesdeFormularioVentasCajasResumidos(Boolean esParaAccionDesdeFormularioVentasCajasResumidos) {
		this.esParaAccionDesdeFormularioVentasCajasResumidos = esParaAccionDesdeFormularioVentasCajasResumidos;
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

			if(this.ventascajasresumidosSessionBean==null) {
				this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
			}

			if(!this.ventascajasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventascajasresumidosSessionBean.getlidEmpresaActual());
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

			if(this.ventascajasresumidosSessionBean==null) {
				this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
			}

			if(!this.ventascajasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventascajasresumidosSessionBean.getlidSucursalActual());
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

					if(this.ventascajasresumidos!=null) {
						this.ventascajasresumidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
						this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasCajasResumidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasCajasResumidosGenerico)throws Exception
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
				jComboBoxid_empresaVentasCajasResumidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasCajasResumidosGenerico!=null && jComboBoxid_empresaVentasCajasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasCajasResumidosGenerico.setSelectedIndex(0);
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

					if(this.ventascajasresumidos!=null) {
						this.ventascajasresumidos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
						this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentasCajasResumidos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentasCajasResumidosGenerico)throws Exception
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
				jComboBoxid_sucursalVentasCajasResumidosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentasCajasResumidosGenerico!=null && jComboBoxid_sucursalVentasCajasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentasCajasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasCajasResumidos ventascajasresumidos,JComboBox jComboBoxid_empresaVentasCajasResumidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasCajasResumidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasCajasResumidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventascajasresumidos.setid_empresa(empresaAux.getId());
				ventascajasresumidos.setempresa_descripcion(VentasCajasResumidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventascajasresumidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentasCajasResumidos ventascajasresumidos,JComboBox jComboBoxid_sucursalVentasCajasResumidosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentasCajasResumidosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentasCajasResumidosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventascajasresumidos.setid_sucursal(sucursalAux.getId());
				ventascajasresumidos.setsucursal_descripcion(VentasCajasResumidosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventascajasresumidos.setSucursal(sucursalAux);			}
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

					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { 
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { 
					}

					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { 
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { 
					}

					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentasCajasResumidos() throws Exception {
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
		
	public VentasCajasResumidosParameterReturnGeneral getVentasCajasResumidosParameterGeneral() {
		return this.ventascajasresumidosParameterGeneral;
	}
	
	public void setVentasCajasResumidosParameterGeneral(VentasCajasResumidosParameterReturnGeneral ventascajasresumidosParameterGeneral) {
		this.ventascajasresumidosParameterGeneral = ventascajasresumidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasCajasResumidos() {
		return isPermisoTodoVentasCajasResumidos;
	}

	public void setIsPermisoTodoVentasCajasResumidos(Boolean isPermisoTodoVentasCajasResumidos) {
		this.isPermisoTodoVentasCajasResumidos = isPermisoTodoVentasCajasResumidos;
	}

	public Boolean getIsPermisoNuevoVentasCajasResumidos() {
		return isPermisoNuevoVentasCajasResumidos;
	}

	public void setIsPermisoNuevoVentasCajasResumidos(Boolean isPermisoNuevoVentasCajasResumidos) {
		this.isPermisoNuevoVentasCajasResumidos = isPermisoNuevoVentasCajasResumidos;
	}

	public Boolean getIsPermisoActualizarVentasCajasResumidos() {
		return isPermisoActualizarVentasCajasResumidos;
	}

	public void setIsPermisoActualizarVentasCajasResumidos(Boolean isPermisoActualizarVentasCajasResumidos) {
		this.isPermisoActualizarVentasCajasResumidos = isPermisoActualizarVentasCajasResumidos;
	}

	public Boolean getIsPermisoEliminarVentasCajasResumidos() {
		return isPermisoEliminarVentasCajasResumidos;
	}

	public void setIsPermisoEliminarVentasCajasResumidos(Boolean isPermisoEliminarVentasCajasResumidos) {
		this.isPermisoEliminarVentasCajasResumidos = isPermisoEliminarVentasCajasResumidos;
	}

	public Boolean getIsPermisoGuardarCambiosVentasCajasResumidos() {
		return isPermisoGuardarCambiosVentasCajasResumidos;
	}

	public void setIsPermisoGuardarCambiosVentasCajasResumidos(Boolean isPermisoGuardarCambiosVentasCajasResumidos) {
		this.isPermisoGuardarCambiosVentasCajasResumidos = isPermisoGuardarCambiosVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoConsultaVentasCajasResumidos() {
		return isPermisoConsultaVentasCajasResumidos;
	}

	public void setIsPermisoConsultaVentasCajasResumidos(Boolean isPermisoConsultaVentasCajasResumidos) {
		this.isPermisoConsultaVentasCajasResumidos = isPermisoConsultaVentasCajasResumidos;
	}

	public Boolean getIsPermisoBusquedaVentasCajasResumidos() {
		return isPermisoBusquedaVentasCajasResumidos;
	}

	public void setIsPermisoBusquedaVentasCajasResumidos(Boolean isPermisoBusquedaVentasCajasResumidos) {
		this.isPermisoBusquedaVentasCajasResumidos = isPermisoBusquedaVentasCajasResumidos;
	}

	public Boolean getIsPermisoReporteVentasCajasResumidos() {
		return isPermisoReporteVentasCajasResumidos;
	}

	public void setIsPermisoReporteVentasCajasResumidos(Boolean isPermisoReporteVentasCajasResumidos) {
		this.isPermisoReporteVentasCajasResumidos = isPermisoReporteVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasCajasResumidos() {
		return isPermisoPaginacionMedioVentasCajasResumidos;
	}

	public void setIsPermisoPaginacionMedioVentasCajasResumidos(Boolean isPermisoPaginacionMedioVentasCajasResumidos) {
		this.isPermisoPaginacionMedioVentasCajasResumidos = isPermisoPaginacionMedioVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasCajasResumidos() {
		return isPermisoPaginacionTodoVentasCajasResumidos;
	}

	public void setIsPermisoPaginacionTodoVentasCajasResumidos(Boolean isPermisoPaginacionTodoVentasCajasResumidos) {
		this.isPermisoPaginacionTodoVentasCajasResumidos = isPermisoPaginacionTodoVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasCajasResumidos() {
		return isPermisoPaginacionAltoVentasCajasResumidos;
	}

	public void setIsPermisoPaginacionAltoVentasCajasResumidos(Boolean isPermisoPaginacionAltoVentasCajasResumidos) {
		this.isPermisoPaginacionAltoVentasCajasResumidos = isPermisoPaginacionAltoVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoCopiarVentasCajasResumidos() {
		return isPermisoCopiarVentasCajasResumidos;
	}

	public void setIsPermisoCopiarVentasCajasResumidos(Boolean isPermisoCopiarVentasCajasResumidos) {
		this.isPermisoCopiarVentasCajasResumidos = isPermisoCopiarVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoVerFormVentasCajasResumidos() {
		return isPermisoVerFormVentasCajasResumidos;
	}

	public void setIsPermisoVerFormVentasCajasResumidos(Boolean isPermisoVerFormVentasCajasResumidos) {
		this.isPermisoVerFormVentasCajasResumidos = isPermisoVerFormVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoDuplicarVentasCajasResumidos() {
		return isPermisoDuplicarVentasCajasResumidos;
	}

	public void setIsPermisoDuplicarVentasCajasResumidos(Boolean isPermisoDuplicarVentasCajasResumidos) {
		this.isPermisoDuplicarVentasCajasResumidos = isPermisoDuplicarVentasCajasResumidos;
	}
	
	public Boolean getIsPermisoOrdenVentasCajasResumidos() {
		return isPermisoOrdenVentasCajasResumidos;
	}

	public void setIsPermisoOrdenVentasCajasResumidos(Boolean isPermisoOrdenVentasCajasResumidos) {
		this.isPermisoOrdenVentasCajasResumidos = isPermisoOrdenVentasCajasResumidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasCajasResumidos() {
		return isVisibilidadCeldaNuevoVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoVentasCajasResumidos(Boolean isVisibilidadCeldaNuevoVentasCajasResumidos) {
		this.isVisibilidadCeldaNuevoVentasCajasResumidos = isVisibilidadCeldaNuevoVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasCajasResumidos() {
		return isVisibilidadCeldaDuplicarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaDuplicarVentasCajasResumidos(Boolean isVisibilidadCeldaDuplicarVentasCajasResumidos) {
		this.isVisibilidadCeldaDuplicarVentasCajasResumidos = isVisibilidadCeldaDuplicarVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasCajasResumidos() {
		return isVisibilidadCeldaCopiarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaCopiarVentasCajasResumidos(Boolean isVisibilidadCeldaCopiarVentasCajasResumidos) {
		this.isVisibilidadCeldaCopiarVentasCajasResumidos = isVisibilidadCeldaCopiarVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasCajasResumidos() {
		return isVisibilidadCeldaVerFormVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaVerFormVentasCajasResumidos(Boolean isVisibilidadCeldaVerFormVentasCajasResumidos) {
		this.isVisibilidadCeldaVerFormVentasCajasResumidos = isVisibilidadCeldaVerFormVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasCajasResumidos() {
		return isVisibilidadCeldaOrdenVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaOrdenVentasCajasResumidos(Boolean isVisibilidadCeldaOrdenVentasCajasResumidos) {
		this.isVisibilidadCeldaOrdenVentasCajasResumidos = isVisibilidadCeldaOrdenVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasCajasResumidos() {
		return isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasCajasResumidos(Boolean isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos) {
		this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos = isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasCajasResumidos() {
		return isVisibilidadCeldaModificarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaModificarVentasCajasResumidos(Boolean isVisibilidadCeldaModificarVentasCajasResumidos) {
		this.isVisibilidadCeldaModificarVentasCajasResumidos = isVisibilidadCeldaModificarVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasCajasResumidos() {
		return isVisibilidadCeldaActualizarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaActualizarVentasCajasResumidos(Boolean isVisibilidadCeldaActualizarVentasCajasResumidos) {
		this.isVisibilidadCeldaActualizarVentasCajasResumidos = isVisibilidadCeldaActualizarVentasCajasResumidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasCajasResumidos() {
		return isVisibilidadCeldaEliminarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaEliminarVentasCajasResumidos(Boolean isVisibilidadCeldaEliminarVentasCajasResumidos) {
		this.isVisibilidadCeldaEliminarVentasCajasResumidos = isVisibilidadCeldaEliminarVentasCajasResumidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasCajasResumidos() {
		return isVisibilidadCeldaCancelarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaCancelarVentasCajasResumidos(Boolean isVisibilidadCeldaCancelarVentasCajasResumidos) {
		this.isVisibilidadCeldaCancelarVentasCajasResumidos = isVisibilidadCeldaCancelarVentasCajasResumidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasCajasResumidos() {
		return isVisibilidadCeldaGuardarVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarVentasCajasResumidos(Boolean isVisibilidadCeldaGuardarVentasCajasResumidos) {
		this.isVisibilidadCeldaGuardarVentasCajasResumidos = isVisibilidadCeldaGuardarVentasCajasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasCajasResumidos() {
		return isVisibilidadCeldaGuardarCambiosVentasCajasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasCajasResumidos(Boolean isVisibilidadCeldaGuardarCambiosVentasCajasResumidos) {
		this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos = isVisibilidadCeldaGuardarCambiosVentasCajasResumidos;
	}
		
	public VentasCajasResumidosSessionBean getventascajasresumidosSessionBean() {
		return this.ventascajasresumidosSessionBean;
	}
	
	public void setventascajasresumidosSessionBean(VentasCajasResumidosSessionBean ventascajasresumidosSessionBean) {
		this.ventascajasresumidosSessionBean=ventascajasresumidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasCajasResumidos() {
		return this.isVisibilidadBusquedaVentasCajasResumidos;
	}

	public void setisVisibilidadBusquedaVentasCajasResumidos(Boolean isVisibilidadBusquedaVentasCajasResumidos) {
		this.isVisibilidadBusquedaVentasCajasResumidos=isVisibilidadBusquedaVentasCajasResumidos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventascajasresumidos,null);
				this.setActualParaGuardarSucursalForeignKey(ventascajasresumidos,null);
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
	
	public void bugActualizarReferenciaActual(VentasCajasResumidos ventascajasresumidos,VentasCajasResumidos ventascajasresumidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasCajasResumidos(ventascajasresumidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventascajasresumidosAux.setId(ventascajasresumidos.getId());
		ventascajasresumidosAux.setVersionRow(ventascajasresumidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasCajasResumidos ventascajasresumidosLocal) throws Exception {
		
		if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasCajasResumidos ventascajasresumidosLocal) throws Exception {	
		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventascajasresumidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventascajasresumidosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasCajasResumidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventascajasresumidosValidator.getInvalidValues(this.ventascajasresumidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasCajasResumidos ventascajasresumidos,List<VentasCajasResumidos> ventascajasresumidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasCajasResumidos ventascajasresumidos,List<VentasCajasResumidos> ventascajasresumidoss) throws Exception {
		try	{			
			VentasCajasResumidosConstantesFunciones.actualizarSelectedLista(ventascajasresumidos,ventascajasresumidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasCajasResumidos> ventascajasresumidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventascajasresumidossLocal=this.ventascajasresumidosLogic.getVentasCajasResumidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventascajasresumidossLocal=this.ventascajasresumidoss;
			}
			//ARCHITECTURE
		
			for(VentasCajasResumidos ventascajasresumidosLocal:ventascajasresumidossLocal) {
				if(this.permiteMantenimiento(ventascajasresumidosLocal) && ventascajasresumidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasCajasResumidosConstantesFunciones.getVentasCajasResumidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcodigoVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnombre_completoVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelfecha_emisionVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_pre_impresoVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_documentoVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltotalVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.EFECTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelefectivoVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.TARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltarjetaVentasCajasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCajasResumidosConstantesFunciones.CREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcreditoVentasCajasResumidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcodigoVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnombre_completoVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelfecha_emisionVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_pre_impresoVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_documentoVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltotalVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelefectivoVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltarjetaVentasCajasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcreditoVentasCajasResumidos,"");
		
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
		this.iIdNuevoVentasCajasResumidos--;	
		
		
		this.ventascajasresumidosAux=new VentasCajasResumidos();
		
		this.ventascajasresumidosAux.setId(this.iIdNuevoVentasCajasResumidos);
		this.ventascajasresumidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventascajasresumidosLogic.getVentasCajasResumidoss().add(this.ventascajasresumidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventascajasresumidoss.add(this.ventascajasresumidosAux);
		}
		//ARCHITECTURE
		
		this.ventascajasresumidos=this.ventascajasresumidosAux;
		
		if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidos);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasCajasResumidos(this.ventascajasresumidos);
		}
				
		//this.setDefaultControlesVentasCajasResumidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasCajasResumidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasCajasResumidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCajasResumidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasCajasResumidos(this.ventascajasresumidosBean,this.ventascajasresumidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasCajasResumidos(this.ventascajasresumidosReturnGeneral,this.ventascajasresumidosBean,false);
		
		if(this.ventascajasresumidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos());
		}
		
		if(this.ventascajasresumidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos(),classes);//this.ventascajasresumidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasCajasResumidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasCajasResumidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.RecargarFormVentasCajasResumidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasCajasResumidos(false);
						
			if(ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCajasResumidos();
			}
			
			this.actualizarVisualTableDatosVentasCajasResumidos();
			
			this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasCajasResumidos(), this.getIndiceNuevoVentasCajasResumidos());
			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
						
			this.actualizarEstadoCeldasBotonesVentasCajasResumidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasCajasResumidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_desdeVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarfecha_emision_desdeVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_hastaVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarfecha_emision_hastaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarcodigoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarnombre_completoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarfecha_emisionVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarnumero_pre_impresoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarnumero_documentoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activartotalVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarefectivoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activartarjetaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarcreditoVentasCajasResumidos);	
		//
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarid_empresaVentasCajasResumidos);//
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setEnabled(isHabilitar && this.ventascajasresumidosConstantesFunciones.activarid_sucursalVentasCajasResumidos);
	};
	
	public void setDefaultControlesVentasCajasResumidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasCajasResumidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventascajasresumidosSessionBean.setConGuardarRelaciones(true);			
			this.ventascajasresumidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.setVisible(true);
			
					
		} else {
			//this.ventascajasresumidosSessionBean.setConGuardarRelaciones(false);			
			this.ventascajasresumidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasCajasResumidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				if(ventascajasresumidosAux.getId().equals(this.iIdNuevoVentasCajasResumidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidoss) {
				if(ventascajasresumidosAux.getId().equals(this.iIdNuevoVentasCajasResumidos)) {
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
	
	public int getIndiceActualVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				if(ventascajasresumidosAux.getId().equals(ventascajasresumidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidoss) {
				if(ventascajasresumidosAux.getId().equals(ventascajasresumidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasCajasResumidos(VentasCajasResumidos ventascajasresumidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				if(ventascajasresumidosAux.getVentasCajasResumidosOriginal().getId().equals(ventascajasresumidosOriginal.getId())) {
					existe=true;
					ventascajasresumidosOriginal.setId(ventascajasresumidosAux.getId());
					ventascajasresumidosOriginal.setVersionRow(ventascajasresumidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidoss) {
				if(ventascajasresumidosAux.getVentasCajasResumidosOriginal().getId().equals(ventascajasresumidosOriginal.getId())) {
					existe=true;
					ventascajasresumidosOriginal.setId(ventascajasresumidosAux.getId());
					ventascajasresumidosOriginal.setVersionRow(ventascajasresumidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasCajasResumidos(Boolean esParaCancelar) throws Exception {
		ventascajasresumidossAux=new ArrayList<VentasCajasResumidos>();
		ventascajasresumidosAux=new VentasCajasResumidos();
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
					if(ventascajasresumidosAux.getId()<0) {
						ventascajasresumidossAux.add(ventascajasresumidosAux);
					}		
				}
				this.iIdNuevoVentasCajasResumidos=0L;
				this.ventascajasresumidosLogic.getVentasCajasResumidoss().removeAll(ventascajasresumidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidoss) {
					if(ventascajasresumidosAux.getId()<0) {
						ventascajasresumidossAux.add(ventascajasresumidosAux);
					}		
				}
				this.iIdNuevoVentasCajasResumidos=0L;
				this.ventascajasresumidoss.removeAll(ventascajasresumidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasCajasResumidos 
					&& this.ventascajasresumidosLogic.getVentasCajasResumidoss().size()>0
					) {
					ventascajasresumidosAux=this.ventascajasresumidosLogic.getVentasCajasResumidoss().get(this.ventascajasresumidosLogic.getVentasCajasResumidoss().size() - 1);
				
					if(ventascajasresumidosAux.getId()<0) {
						this.ventascajasresumidosLogic.getVentasCajasResumidoss().remove(ventascajasresumidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasCajasResumidos && this.ventascajasresumidoss.size()>0) {
					ventascajasresumidosAux=this.ventascajasresumidoss.get(this.ventascajasresumidoss.size() - 1);
				
					if(ventascajasresumidosAux.getId()<0) {
						this.ventascajasresumidoss.remove(ventascajasresumidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasCajasResumidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventascajasresumidos.getId()<0) {
				this.ventascajasresumidosLogic.getVentasCajasResumidoss().remove(this.ventascajasresumidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventascajasresumidos.getId()<0) {
				this.ventascajasresumidoss.remove(this.ventascajasresumidos);
			}
		}			
	}
	
	public void setEstadosInicialesVentasCajasResumidos(List<VentasCajasResumidos> ventascajasresumidossAux) throws Exception {
		VentasCajasResumidosConstantesFunciones.setEstadosInicialesVentasCajasResumidos(ventascajasresumidossAux);
	}
	
	public void setEstadosInicialesVentasCajasResumidos(VentasCajasResumidos ventascajasresumidosAux) throws Exception {
		VentasCajasResumidosConstantesFunciones.setEstadosInicialesVentasCajasResumidos(ventascajasresumidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasCajasResumidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasCajasResumidosActual()) {
				if(!this.isEsNuevoVentasCajasResumidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasCajasResumidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasCajasResumidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Cajas Resumidos ?", "MANTENIMIENTO DE Ventas Cajas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasCajasResumidos ventascajasresumidos) throws Exception {
		VentasCajasResumidosConstantesFunciones.seleccionarAsignar(this.ventascajasresumidos,ventascajasresumidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasCajasResumidos=this.isPermisoActualizarOriginalVentasCajasResumidos;
			
			
			this.seleccionarAsignar(ventascajasresumidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasCajasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventascajasresumidosSessionBean.setsFuncionBusquedaRapida(this.ventascajasresumidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasCajasResumidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasCajasResumidos(esParaCancelar);				
				this.cancelarNuevoVentasCajasResumidos(esParaCancelar);								
			}
			
			this.ventascajasresumidos=new VentasCajasResumidos();
			
			this.inicializarVentasCajasResumidos();
			
			this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasCajasResumidos() throws Exception {
		try {
			VentasCajasResumidosConstantesFunciones.inicializarVentasCajasResumidos(this.ventascajasresumidos);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventascajasresumidosLogic.getVentasCajasResumidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasCajasResumidoss(String sAccionBusqueda,List<VentasCajasResumidos> ventascajasresumidossParaReportes) throws Exception {
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
					sPathReporteFinal="VentasCajasResumidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasCajasResumidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasCajasResumidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasCajasResumidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Cajas Resumidoses");		
		parameters.put("busquedapor", VentasCajasResumidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasCajasResumidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasCajasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasCajasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasCajasResumidos=new JRBeanArrayDataSource(VentasCajasResumidosJInternalFrame.TraerVentasCajasResumidosBeans(ventascajasresumidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasCajasResumidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasCajasResumidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasCajasResumidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasCajasResumidosBean.TraerVentasCajasResumidosBeans(ventascajasresumidossParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidosActionPerformed(null);
					//this.generarExcelReporteVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasCajasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventascajasresumidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasCajasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCajasResumidos> ventascajasresumidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCajasResumidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasCajasResumidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasCajasResumidos ventascajasresumidos : ventascajasresumidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasCajasResumidosConstantesFunciones.generarExcelReporteDataVentasCajasResumidos("NORMAL",row,workbook,ventascajasresumidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasCajasResumidos(String sTipo,Row row,Workbook workbook) {
		
		VentasCajasResumidosConstantesFunciones.generarExcelReporteHeaderVentasCajasResumidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasCajasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCajasResumidos> ventascajasresumidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCajasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasCajasResumidos ventascajasresumidos : ventascajasresumidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasCajasResumidosConstantesFunciones.getVentasCajasResumidosDescripcion(ventascajasresumidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getefectivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.gettarjeta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascajasresumidos.getcredito());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasCajasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCajasResumidos> ventascajasresumidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasCajasResumidos> ventascajasresumidossRespaldo=null;
		
		classes=VentasCajasResumidosConstantesFunciones.getClassesRelationshipsOfVentasCajasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventascajasresumidosLogic.setDatosCliente(this.datosCliente);
		this.ventascajasresumidosLogic.setDatosDeep(this.datosDeep);
		this.ventascajasresumidosLogic.setIsConDeep(true);
		
		ventascajasresumidossRespaldo=this.ventascajasresumidosLogic.getVentasCajasResumidoss();
		
		this.ventascajasresumidosLogic.setVentasCajasResumidoss(ventascajasresumidossParaReportes);	
		this.ventascajasresumidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventascajasresumidossParaReportes=this.ventascajasresumidosLogic.getVentasCajasResumidoss();
		this.ventascajasresumidosLogic.setVentasCajasResumidoss(ventascajasresumidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCajasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasCajasResumidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasCajasResumidos ventascajasresumidos : ventascajasresumidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasCajasResumidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasCajasResumidosConstantesFunciones.generarExcelReporteDataVentasCajasResumidos("NORMAL",row,workbook,ventascajasresumidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasCajasResumidosConstantesFunciones.getVentasCajasResumidosDescripcion(ventascajasresumidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasCajasResumidos() throws Exception {		
		this.startProcessVentasCajasResumidos(true);
	}
	
	public void startProcessVentasCajasResumidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasCajasResumidos ,this.jPanelParametrosReportesVentasCajasResumidos, this.jScrollPanelDatosVentasCajasResumidos,this.jPanelPaginacionVentasCajasResumidos, this.jScrollPanelDatosEdicionVentasCajasResumidos, this.jPanelAccionesVentasCajasResumidos,this.jPanelAccionesFormularioVentasCajasResumidos,this.jmenuBarVentasCajasResumidos,this.jmenuBarDetalleVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasCajasResumidos=this.jTabbedPaneBusquedasVentasCajasResumidos; 
		
		final JPanel jPanelParametrosReportesVentasCajasResumidos=this.jPanelParametrosReportesVentasCajasResumidos;
		//final JScrollPane jScrollPanelDatosVentasCajasResumidos=this.jScrollPanelDatosVentasCajasResumidos;
		final JTable jTableDatosVentasCajasResumidos=this.jTableDatosVentasCajasResumidos;		
		final JPanel jPanelPaginacionVentasCajasResumidos=this.jPanelPaginacionVentasCajasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionVentasCajasResumidos=this.jScrollPanelDatosEdicionVentasCajasResumidos;
		final JPanel jPanelAccionesVentasCajasResumidos=this.jPanelAccionesVentasCajasResumidos;
		
		JPanel jPanelCamposAuxiliarVentasCajasResumidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasCajasResumidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			jPanelCamposAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelCamposVentasCajasResumidos;
			jPanelAccionesFormularioAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelAccionesFormularioVentasCajasResumidos;
		}
		
		final JPanel jPanelCamposVentasCajasResumidos=jPanelCamposAuxiliarVentasCajasResumidos;
		final JPanel jPanelAccionesFormularioVentasCajasResumidos=jPanelAccionesFormularioAuxiliarVentasCajasResumidos;
		
		
		final JMenuBar jmenuBarVentasCajasResumidos=this.jmenuBarVentasCajasResumidos;
		final JToolBar jTtoolBarVentasCajasResumidos=this.jTtoolBarVentasCajasResumidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasCajasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasCajasResumidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			jmenuBarDetalleAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jmenuBarDetalleVentasCajasResumidos;
			jTtoolBarDetalleAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jTtoolBarDetalleVentasCajasResumidos;
		}
		
		final JMenuBar jmenuBarDetalleVentasCajasResumidos=jmenuBarDetalleAuxiliarVentasCajasResumidos;
		final JToolBar jTtoolBarDetalleVentasCajasResumidos=jTtoolBarDetalleAuxiliarVentasCajasResumidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasCajasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasCajasResumidos;
			processRunnable.jTableDatos=jTableDatosVentasCajasResumidos;
			processRunnable.jPanelCampos=jPanelCamposVentasCajasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasCajasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasCajasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasCajasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasCajasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasCajasResumidos;
			processRunnable.jTtoolBar=jTtoolBarVentasCajasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasCajasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasCajasResumidos ,jPanelParametrosReportesVentasCajasResumidos,jTableDatosVentasCajasResumidos, /*jScrollPanelDatosVentasCajasResumidos,*/jPanelCamposVentasCajasResumidos,jPanelPaginacionVentasCajasResumidos, /*jScrollPanelDatosEdicionVentasCajasResumidos,*/ jPanelAccionesVentasCajasResumidos,jPanelAccionesFormularioVentasCajasResumidos,jmenuBarVentasCajasResumidos,jmenuBarDetalleVentasCajasResumidos,jTtoolBarVentasCajasResumidos,jTtoolBarDetalleVentasCajasResumidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasCajasResumidos ,jPanelParametrosReportesVentasCajasResumidos, jScrollPanelDatosVentasCajasResumidos,jPanelPaginacionVentasCajasResumidos, jScrollPanelDatosEdicionVentasCajasResumidos, jPanelAccionesVentasCajasResumidos,jPanelAccionesFormularioVentasCajasResumidos,jmenuBarVentasCajasResumidos,jmenuBarDetalleVentasCajasResumidos,jTtoolBarVentasCajasResumidos,jTtoolBarDetalleVentasCajasResumidos);
						
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
	
	public void finishProcessVentasCajasResumidos() {// throws Exception 
		this.finishProcessVentasCajasResumidos(true);
	}
	
	public void finishProcessVentasCajasResumidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasCajasResumidos ,this.jPanelParametrosReportesVentasCajasResumidos, this.jScrollPanelDatosVentasCajasResumidos,this.jPanelPaginacionVentasCajasResumidos, this.jScrollPanelDatosEdicionVentasCajasResumidos, this.jPanelAccionesVentasCajasResumidos,this.jPanelAccionesFormularioVentasCajasResumidos,this.jmenuBarVentasCajasResumidos,this.jmenuBarDetalleVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasCajasResumidos=this.jTabbedPaneBusquedasVentasCajasResumidos; 
		
		final JPanel jPanelParametrosReportesVentasCajasResumidos=this.jPanelParametrosReportesVentasCajasResumidos;
		//final JScrollPane jScrollPanelDatosVentasCajasResumidos=this.jScrollPanelDatosVentasCajasResumidos;
		final JTable jTableDatosVentasCajasResumidos=this.jTableDatosVentasCajasResumidos;		
		final JPanel jPanelPaginacionVentasCajasResumidos=this.jPanelPaginacionVentasCajasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionVentasCajasResumidos=this.jScrollPanelDatosEdicionVentasCajasResumidos;
		final JPanel jPanelAccionesVentasCajasResumidos=this.jPanelAccionesVentasCajasResumidos;
		
		JPanel jPanelCamposAuxiliarVentasCajasResumidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasCajasResumidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			jPanelCamposAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelCamposVentasCajasResumidos;
			jPanelAccionesFormularioAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelAccionesFormularioVentasCajasResumidos;
		}
		
		final JPanel jPanelCamposVentasCajasResumidos=jPanelCamposAuxiliarVentasCajasResumidos;
		final JPanel jPanelAccionesFormularioVentasCajasResumidos=jPanelAccionesFormularioAuxiliarVentasCajasResumidos;
		
		
		final JMenuBar jmenuBarVentasCajasResumidos=this.jmenuBarVentasCajasResumidos;		
		final JToolBar jTtoolBarVentasCajasResumidos=this.jTtoolBarVentasCajasResumidos;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasCajasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasCajasResumidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			jmenuBarDetalleAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jmenuBarDetalleVentasCajasResumidos;
			jTtoolBarDetalleAuxiliarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jTtoolBarDetalleVentasCajasResumidos;		
		}
		
		final JMenuBar jmenuBarDetalleVentasCajasResumidos=jmenuBarDetalleAuxiliarVentasCajasResumidos;
		final JToolBar jTtoolBarDetalleVentasCajasResumidos=jTtoolBarDetalleAuxiliarVentasCajasResumidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasCajasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasCajasResumidos;
			processRunnable.jTableDatos=jTableDatosVentasCajasResumidos;
			processRunnable.jPanelCampos=jPanelCamposVentasCajasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasCajasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasCajasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasCajasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasCajasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasCajasResumidos;
			processRunnable.jTtoolBar=jTtoolBarVentasCajasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasCajasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasCajasResumidos ,jPanelParametrosReportesVentasCajasResumidos, jTableDatosVentasCajasResumidos,/*jScrollPanelDatosVentasCajasResumidos,*/jPanelCamposVentasCajasResumidos,jPanelPaginacionVentasCajasResumidos, /*jScrollPanelDatosEdicionVentasCajasResumidos,*/ jPanelAccionesVentasCajasResumidos,jPanelAccionesFormularioVentasCajasResumidos,jmenuBarVentasCajasResumidos,jmenuBarDetalleVentasCajasResumidos,jTtoolBarVentasCajasResumidos,jTtoolBarDetalleVentasCajasResumidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasCajasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasCajasResumidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasCajasResumidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasCajasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasCajasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasCajasResumidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasCajasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasCajasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasCajasResumidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventascajasresumidosConstantesFunciones.getsFinalQueryVentasCajasResumidos();
		String  finalQueryPaginacionTodos=this.ventascajasresumidosConstantesFunciones.getsFinalQueryVentasCajasResumidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasCajasResumidosConstantesFunciones.getArrayColumnasGlobalesNoVentasCajasResumidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasCajasResumidosConstantesFunciones.getArrayColumnasGlobalesVentasCajasResumidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasCajasResumidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventascajasresumidossEliminados= new ArrayList<VentasCajasResumidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasCajasResumidos();
		
				///*VentasCajasResumidosSessionBean*/this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
			
			if(this.ventascajasresumidosSessionBean==null) {
				this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
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
					this.iNumeroPaginacion=VentasCajasResumidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasCajasResumidosConstantesFunciones.getClassesForeignKeysOfVentasCajasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventascajasresumidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventascajasresumidossAux= new ArrayList<VentasCajasResumidos>();
			
				
			ventascajasresumidosLogic.setDatosCliente(this.datosCliente);
			ventascajasresumidosLogic.setDatosDeep(this.datosDeep);
			ventascajasresumidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasCajasResumidos")) {
				this.sDetalleReporte=VentasCajasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasCajasResumidos(fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventascajasresumidosLogic.getVentasCajasResumidossBusquedaVentasCajasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasCajasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasCajasResumidos(fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasCajasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasCajasResumidos(fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventascajasresumidosLogic.getVentasCajasResumidoss()==null||ventascajasresumidosLogic.getVentasCajasResumidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventascajasresumidoss==null|| ventascajasresumidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascajasresumidossAux=new ArrayList<VentasCajasResumidos>();
						ventascajasresumidossAux.addAll(ventascajasresumidosLogic.getVentasCajasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascajasresumidossAux=new ArrayList<VentasCajasResumidos>();
							ventascajasresumidossAux.addAll(ventascajasresumidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventascajasresumidosLogic.getVentasCajasResumidossBusquedaVentasCajasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasCajasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasCajasResumidos(fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasCajasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasCajasResumidos(fecha_emision_desdeBusquedaVentasCajasResumidos,fecha_emision_hastaBusquedaVentasCajasResumidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasCajasResumidoss("BusquedaVentasCajasResumidos",ventascajasresumidosLogic.getVentasCajasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasCajasResumidoss("BusquedaVentasCajasResumidos",ventascajasresumidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascajasresumidosLogic.setVentasCajasResumidoss(new ArrayList<VentasCajasResumidos>());
						ventascajasresumidosLogic.getVentasCajasResumidoss().addAll(ventascajasresumidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascajasresumidoss=new ArrayList<VentasCajasResumidos>();
							ventascajasresumidoss.addAll(ventascajasresumidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasCajasResumidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasCajasResumidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventascajasresumidosLogic.getVentasCajasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascajasresumidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventascajasresumidosLogic.getVentasCajasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascajasresumidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasCajasResumidos ventascajasresumidos) {
		Boolean permite=true;
		
		if(this.ventascajasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasCajasResumidosConstantesFunciones.getOrderByListaVentasCajasResumidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasCajasResumidosConstantesFunciones.getOrderByListaVentasCajasResumidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				if(ventascajasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventascajasresumidosTotales=ventascajasresumidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCajasResumidos ventascajasresumidos:this.ventascajasresumidoss) {
				if(ventascajasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventascajasresumidosTotales=ventascajasresumidos;
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
			this.ventascajasresumidosAux=new VentasCajasResumidos();
			this.ventascajasresumidosAux.setsType(Constantes2.S_TOTALES);
			this.ventascajasresumidosAux.setIsNew(false);
			this.ventascajasresumidosAux.setIsChanged(false);
			this.ventascajasresumidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasCajasResumidosConstantesFunciones.TotalizarValoresFilaVentasCajasResumidos(this.ventascajasresumidosLogic.getVentasCajasResumidoss(),this.ventascajasresumidosAux);
				
				//this.ventascajasresumidosLogic.getVentasCajasResumidoss().add(this.ventascajasresumidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasCajasResumidosConstantesFunciones.TotalizarValoresFilaVentasCajasResumidos(this.ventascajasresumidoss,this.ventascajasresumidosAux);
				
				this.ventascajasresumidoss.add(this.ventascajasresumidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventascajasresumidosTotales=new VentasCajasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventascajasresumidosLogic.getVentasCajasResumidoss().remove(ventascajasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventascajasresumidoss.remove(ventascajasresumidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventascajasresumidosTotales=new VentasCajasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				if(ventascajasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventascajasresumidosTotales=ventascajasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasCajasResumidosConstantesFunciones.TotalizarValoresFilaVentasCajasResumidos(this.ventascajasresumidosLogic.getVentasCajasResumidoss(),ventascajasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCajasResumidos ventascajasresumidos:this.ventascajasresumidoss) {
				if(ventascajasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventascajasresumidosTotales=ventascajasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasCajasResumidosConstantesFunciones.TotalizarValoresFilaVentasCajasResumidos(this.ventascajasresumidoss,ventascajasresumidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasCajasResumidossBusquedaVentasCajasResumidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasCajasResumidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasCajasResumidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasCajasResumidossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasCajasResumidossBusquedaVentasCajasResumidos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascajasresumidosLogic.getVentasCajasResumidossBusquedaVentasCajasResumidos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasCajasResumidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascajasresumidosLogic.getVentasCajasResumidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasCajasResumidossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascajasresumidosLogic.getVentasCajasResumidossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVentasCajasResumidos() {
		this.isPermisoTodoVentasCajasResumidos=false;
		this.isPermisoNuevoVentasCajasResumidos=false;
		this.isPermisoActualizarVentasCajasResumidos=false;
		this.isPermisoActualizarOriginalVentasCajasResumidos=false;
		this.isPermisoEliminarVentasCajasResumidos=false;
		this.isPermisoGuardarCambiosVentasCajasResumidos=false;
		this.isPermisoConsultaVentasCajasResumidos=true;
		this.isPermisoBusquedaVentasCajasResumidos=true;
		this.isPermisoReporteVentasCajasResumidos=true;
		this.isPermisoOrdenVentasCajasResumidos=false;		
		this.isPermisoPaginacionMedioVentasCajasResumidos=false;		
		this.isPermisoPaginacionAltoVentasCajasResumidos=false;		
		this.isPermisoPaginacionTodoVentasCajasResumidos=false;		
		this.isPermisoCopiarVentasCajasResumidos=false;		
		this.isPermisoVerFormVentasCajasResumidos=false;		
		this.isPermisoDuplicarVentasCajasResumidos=false;
		this.isPermisoOrdenVentasCajasResumidos=false;
	}
	
	public void setPermisosUsuarioVentasCajasResumidos(Boolean isPermiso) {
		this.isPermisoTodoVentasCajasResumidos=isPermiso;
		this.isPermisoNuevoVentasCajasResumidos=isPermiso;
		this.isPermisoActualizarVentasCajasResumidos=isPermiso;
		this.isPermisoActualizarOriginalVentasCajasResumidos=isPermiso;
		this.isPermisoEliminarVentasCajasResumidos=isPermiso;
		this.isPermisoGuardarCambiosVentasCajasResumidos=isPermiso;
		this.isPermisoConsultaVentasCajasResumidos=isPermiso;
		this.isPermisoBusquedaVentasCajasResumidos=isPermiso;
		this.isPermisoReporteVentasCajasResumidos=isPermiso;
		this.isPermisoOrdenVentasCajasResumidos=isPermiso;		
		this.isPermisoPaginacionMedioVentasCajasResumidos=isPermiso;		
		this.isPermisoPaginacionAltoVentasCajasResumidos=isPermiso;		
		this.isPermisoPaginacionTodoVentasCajasResumidos=isPermiso;		
		this.isPermisoCopiarVentasCajasResumidos=isPermiso;		
		this.isPermisoVerFormVentasCajasResumidos=isPermiso;		
		this.isPermisoDuplicarVentasCajasResumidos=isPermiso;
		this.isPermisoOrdenVentasCajasResumidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasCajasResumidos(Boolean isPermiso) {
		//this.isPermisoTodoVentasCajasResumidos=isPermiso;
		this.isPermisoNuevoVentasCajasResumidos=isPermiso;
		this.isPermisoActualizarVentasCajasResumidos=isPermiso;
		this.isPermisoActualizarOriginalVentasCajasResumidos=isPermiso;
		this.isPermisoEliminarVentasCajasResumidos=isPermiso;
		this.isPermisoGuardarCambiosVentasCajasResumidos=isPermiso;
		//this.isPermisoConsultaVentasCajasResumidos=isPermiso;
		//this.isPermisoBusquedaVentasCajasResumidos=isPermiso;
		//this.isPermisoReporteVentasCajasResumidos=isPermiso;
		//this.isPermisoOrdenVentasCajasResumidos=isPermiso;		
		//this.isPermisoPaginacionMedioVentasCajasResumidos=isPermiso;		
		//this.isPermisoPaginacionAltoVentasCajasResumidos=isPermiso;		
		//this.isPermisoPaginacionTodoVentasCajasResumidos=isPermiso;		
		//this.isPermisoCopiarVentasCajasResumidos=isPermiso;		
		//this.isPermisoDuplicarVentasCajasResumidos=isPermiso;
		//this.isPermisoOrdenVentasCajasResumidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasCajasResumidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasCajasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasCajasResumidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasCajasResumidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasCajasResumidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasCajasResumidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasCajasResumidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasCajasResumidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasCajasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasCajasResumidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasCajasResumidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasCajasResumidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasCajasResumidos=this.isPermisoActualizarVentasCajasResumidos;
			this.isPermisoEliminarVentasCajasResumidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasCajasResumidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasCajasResumidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasCajasResumidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasCajasResumidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasCajasResumidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasCajasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasCajasResumidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasCajasResumidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasCajasResumidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasCajasResumidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasCajasResumidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasCajasResumidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasCajasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasCajasResumidos.setToolTipText(this.jTableDatosVentasCajasResumidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasCajasResumidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasCajasResumidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasCajasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasCajasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasCajasResumidos() throws Exception {
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
	public void inicializarCombosForeignKeyVentasCajasResumidosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasCajasResumidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasCajasResumidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasCajasResumidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventascajasresumidosSessionBean==null) {
				this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
			}

			if(!this.ventascajasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventascajasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyVentasCajasResumidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasCajasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasCajasResumidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCajasResumidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasCajasResumidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCajasResumidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasCajasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasCajasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasCajasResumidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasCajasResumidos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasCajasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasCajasResumidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VentasCajasResumidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasCajasResumidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasCajasResumidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean(); 
		this.ventascajasresumidosConstantesFunciones=new VentasCajasResumidosConstantesFunciones(); 
		this.ventascajasresumidosBean=new VentasCajasResumidos();//(this.ventascajasresumidosConstantesFunciones); 		
		this.ventascajasresumidosReturnGeneral=new VentasCajasResumidosParameterReturnGeneral(); 
		
		this.ventascajasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascajasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasCajasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasCajasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasCajasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasCajasResumidos(true);
			
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
			
			this.ventascajasresumidosConstantesFunciones=new VentasCajasResumidosConstantesFunciones(); 
			this.ventascajasresumidosBean=new VentasCajasResumidos();//this.ventascajasresumidosConstantesFunciones); 			
			this.ventascajasresumidosReturnGeneral=new VentasCajasResumidosParameterReturnGeneral(); 
		
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Cajas Resumidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventascajasresumidos=new VentasCajasResumidos();
			this.ventascajasresumidoss = new ArrayList<VentasCajasResumidos>();
			this.ventascajasresumidossAux = new ArrayList<VentasCajasResumidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic=new VentasCajasResumidosLogic();
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.ventascajasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventascajasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasCajasResumidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasCajasResumidos);	
					}
					
					if(this.jInternalFrameImportacionVentasCajasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasCajasResumidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasCajasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasCajasResumidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasCajasResumidos);
				this.jInternalFrameDetalleFormVentasCajasResumidos.setVisible(false);
				this.jInternalFrameDetalleFormVentasCajasResumidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasCajasResumidos);
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasCajasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasCajasResumidos);
					this.jInternalFrameImportacionVentasCajasResumidos.setVisible(false);
					this.jInternalFrameImportacionVentasCajasResumidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasCajasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasCajasResumidos);
					this.jInternalFrameOrderByVentasCajasResumidos.setVisible(false);
					this.jInternalFrameOrderByVentasCajasResumidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasCajasResumidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasCajasResumidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventascajasresumidosReturnGeneral=new VentasCajasResumidosParameterReturnGeneral();
			
			this.ventascajasresumidosParameterGeneral=new VentasCajasResumidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventascajasresumidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasCajasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasCajasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),this.ventascajasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasCajasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),this.ventascajasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaDuplicarVentasCajasResumidos=true;
			this.isVisibilidadCeldaCopiarVentasCajasResumidos=true;
			this.isVisibilidadCeldaVerFormVentasCajasResumidos=true;
			this.isVisibilidadCeldaOrdenVentasCajasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			
			
			this.isVisibilidadBusquedaVentasCajasResumidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasCajasResumidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasCajasResumidos(false);
			
			this.setPermisosUsuarioVentasCajasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() 
				|| (this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() && this.ventascajasresumidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasCajasResumidosClasesRelacionadas();
			}
			
			if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasCajasResumidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasCajasResumidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasCajasResumidos();
			}
			
			if(!this.isPermisoBusquedaVentasCajasResumidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasCajasResumidosConstantesFunciones.getTiposSeleccionarVentasCajasResumidos());
				
				this.tiposColumnasSelect=VentasCajasResumidosConstantesFunciones.getTiposSeleccionarVentasCajasResumidos(true);
				
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
			//if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasCajasResumidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasCajasResumidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasCajasResumidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCajasResumidos() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventascajasresumidosImplementable= (VentasCajasResumidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasCajasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventascajasresumidosImplementableHome= (VentasCajasResumidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasCajasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventascajasresumidoss= new ArrayList<VentasCajasResumidos>();
			this.ventascajasresumidossEliminados= new ArrayList<VentasCajasResumidos>();
						
			this.isEsNuevoVentasCajasResumidos=false;
			this.esParaAccionDesdeFormularioVentasCajasResumidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasCajasResumidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasCajasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasCajasResumidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasCajasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasCajasResumidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasCajasResumidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasCajasResumidos();
			}
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasCajasResumidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasCajasResumidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasCajasResumidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasCajasResumidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasCajasResumidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasCajasResumidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasCajasResumidos")) {
				iIndex=this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasCajasResumidos();	
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
	
	public void cargarCombosForeignKeyVentasCajasResumidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasCajasResumidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasCajasResumidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasCajasResumidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasCajasResumidos();
		
		this.cargarCombosFrameForeignKeyVentasCajasResumidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasCajasResumidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasCajasResumidos();
		}
	}
	
	
	
	public void jButtonNuevoVentasCajasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			
			if(jTableDatosVentasCajasResumidos.getRowCount()>=1) {
				jTableDatosVentasCajasResumidos.removeRowSelectionInterval(0, jTableDatosVentasCajasResumidos.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasCajasResumidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasCajasResumidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasCajasResumidos(true);			
			//this.ventascajasresumidos=new VentasCajasResumidos();
			//this.ventascajasresumidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCajasResumidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos() ;
			
			if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCajasResumidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventascajasresumidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);				
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasCajasResumidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasCajasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasCajasResumidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasCajasResumidos.getSelectedRows().length;			
			}
			
			ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasCajasResumidos--;			
				//VentasCajasResumidos ventascajasresumidosAux= new VentasCajasResumidos();			
				//ventascajasresumidosAux.setId(this.iIdNuevoVentasCajasResumidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasCajasResumidos ventascajasresumidosOrigen=new VentasCajasResumidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasCajasResumidos ventascajasresumidosOrigen : ventascajasresumidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventascajasresumidosOrigen =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascajasresumidosOrigen =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasCajasResumidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventascajasresumidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasCajasResumidos(ventascajasresumidosOrigen,this.ventascajasresumidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventascajasresumidosLogic.getVentasCajasResumidoss().add(this.ventascajasresumidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidoss.add(this.ventascajasresumidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
				
				this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasCajasResumidos(), this.getIndiceNuevoVentasCajasResumidos());
				
				int iLastRow =  this.jTableDatosVentasCajasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasCajasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasCajasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();									
		
			VentasCajasResumidos ventascajasresumidosOrigen=new VentasCajasResumidos();
			VentasCajasResumidos ventascajasresumidosDestino=new VentasCajasResumidos();
				
			ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasCajasResumidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventascajasresumidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasCajasResumidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascajasresumidosOrigen =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventascajasresumidosOrigen =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascajasresumidosDestino =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventascajasresumidosDestino =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventascajasresumidosOrigen =ventascajasresumidossSeleccionados.get(0);
				ventascajasresumidosDestino =ventascajasresumidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasCajasResumidos(ventascajasresumidosOrigen,ventascajasresumidosDestino,true,false);
				
				ventascajasresumidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventascajasresumidosDestino,ventascajasresumidosLogic.getVentasCajasResumidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventascajasresumidosDestino,ventascajasresumidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
				
				//this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasCajasResumidos(), this.getIndiceNuevoVentasCajasResumidos());
				
				int iLastRow =  this.jTableDatosVentasCajasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasCajasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasCajasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasCajasResumidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasCajasResumidos.setVisible(!isVisible);
			this.jPanelPaginacionVentasCajasResumidos.setVisible(!isVisible);
			this.jPanelAccionesVentasCajasResumidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasCajasResumidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasCajasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasCajasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasCajasResumidos();
			
			this.abrirFrameOrderByVentasCajasResumidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasCajasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasCajasResumidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasCajasResumidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasCajasResumidos.isMaximum()) {
					this.jInternalFrameDetalleFormVentasCajasResumidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasCajasResumidos.setSize(this.jInternalFrameDetalleFormVentasCajasResumidos.iWidthFormulario,this.jInternalFrameDetalleFormVentasCajasResumidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasCajasResumidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasCajasResumidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasCajasResumidos.isMaximum()) {
						this.jInternalFrameDetalleFormVentasCajasResumidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasCajasResumidos.jContentPaneDetalleVentasCajasResumidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasCajasResumidos.jContentPaneDetalleVentasCajasResumidos.getWidth(),VentasCajasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasCajasResumidos.jContentPaneDetalleVentasCajasResumidos.getWidth(),VentasCajasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasCajasResumidos.jContentPaneDetalleVentasCajasResumidos.getWidth(),VentasCajasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasCajasResumidos.setVisible(true);
	        this.jInternalFrameDetalleFormVentasCajasResumidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasCajasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasCajasResumidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasCajasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCajasResumidos,false,this);
				} else {
					this.jInternalFrameOrderByVentasCajasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCajasResumidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasCajasResumidos);
				this.jInternalFrameOrderByVentasCajasResumidos.setVisible(false);
				this.jInternalFrameOrderByVentasCajasResumidos.setSelected(false);
				
				this.jInternalFrameOrderByVentasCajasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasCajasResumidos"));
				
				this.inicializarActualizarBindingTablaOrderByVentasCajasResumidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasCajasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasCajasResumidos==null) {
				
				this.jInternalFrameImportacionVentasCajasResumidos=new ImportacionJInternalFrame(VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasCajasResumidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasCajasResumidos);
				this.jInternalFrameImportacionVentasCajasResumidos.setVisible(false);
				this.jInternalFrameImportacionVentasCajasResumidos.setSelected(false);


				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasCajasResumidos"));
				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasCajasResumidos"));
				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasCajasResumidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasCajasResumidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasCajasResumidos==null) {
				this.jInternalFrameReporteDinamicoVentasCajasResumidos=new ReporteDinamicoJInternalFrame(VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasCajasResumidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasCajasResumidos);
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCajasResumidos"));
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCajasResumidos"));
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCajasResumidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCajasResumidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasCajasResumidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasCajasResumidos);
			
	       	this.jInternalFrameDetalleFormVentasCajasResumidos.setVisible(false);
	        this.jInternalFrameDetalleFormVentasCajasResumidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasCajasResumidos.dispose();
			//this.jInternalFrameDetalleFormVentasCajasResumidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasCajasResumidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasCajasResumidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasCajasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasCajasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasCajasResumidos.setVisible(true);
	        this.jInternalFrameImportacionVentasCajasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasCajasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasCajasResumidos.setVisible(true);
	        this.jInternalFrameOrderByVentasCajasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasCajasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasCajasResumidos.setVisible(false);
	        this.jInternalFrameOrderByVentasCajasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasCajasResumidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasCajasResumidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasCajasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasCajasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasCajasResumidos.setVisible(false);
	        this.jInternalFrameImportacionVentasCajasResumidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasCajasResumidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasCajasResumidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasCajasResumidos(true);
			//this.isEsNuevoVentasCajasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasCajasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCajasResumidos(false) ;
			
			if(ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCajasResumidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasCajasResumidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasCajasResumidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasCajasResumidos(true);
			//this.isEsNuevoVentasCajasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventascajasresumidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasCajasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasCajasResumidos(false) ;
			
			if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCajasResumidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasCajasResumidos(false);
			
			//if(!this.isEsNuevoVentasCajasResumidos) {								
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				
			}
			
			if(this.permiteMantenimiento(this.ventascajasresumidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasCajasResumidos=true;
					this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
					this.isEsNuevoVentasCajasResumidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasCajasResumidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasCajasResumidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasCajasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(false);
				
				this.habilitarDeshabilitarControlesVentasCajasResumidos(false);
			
												
				
				if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasCajasResumidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasCajasResumidosActionPerformed(evt,ventascajasresumidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasCajasResumidos(this.ventascajasresumidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventascajasresumidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventascajasresumidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.ventascajasresumidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.ventascajasresumidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventascajasresumidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasCajasResumidosModel) this.jTableDatosVentasCajasResumidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasCajasResumidos=true;
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
				this.isEsNuevoVentasCajasResumidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasCajasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(false);
				
				this.habilitarDeshabilitarControlesVentasCajasResumidos(false);
				
				
				
				if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasCajasResumidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasCajasResumidos.getRowCount()>=1) {
				jTableDatosVentasCajasResumidos.removeRowSelectionInterval(0, jTableDatosVentasCajasResumidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasCajasResumidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCajasResumidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(false) ;
			
			this.isEsNuevoVentasCajasResumidos=false;
			
			if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasCajasResumidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasCajasResumidos(false);
				
				//SI ES MANUAL
				if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasCajasResumidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasCajasResumidos--;			
			//VentasCajasResumidos ventascajasresumidosAux= new VentasCajasResumidos();			
			//ventascajasresumidosAux.setId(this.iIdNuevoVentasCajasResumidos);
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasCajasResumidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
			
			this.ventascajasresumidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventascajasresumidosLogic.getVentasCajasResumidoss().add(this.ventascajasresumidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventascajasresumidoss.add(this.ventascajasresumidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			
			this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasCajasResumidos(), this.getIndiceNuevoVentasCajasResumidos());
			
			int iLastRow =  this.jTableDatosVentasCajasResumidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasCajasResumidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasCajasResumidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCajasResumidos(false);
			
			//SI ES MANUAL
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCajasResumidos();
			}
			
			//this.abrirFrameTreeVentasCajasResumidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasCajasResumidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasCajasResumidos.setFileImportacion(this.jInternalFrameImportacionVentasCajasResumidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasCajasResumidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasCajasResumidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasCajasResumidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasCajasResumidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		

		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasCajasResumidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasCajasResumidosBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasCajasResumidosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ectivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ectivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ectivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ectivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TARJETA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rjeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_edito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_edito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_edito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_edito_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasCajasResumidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO:
					sNombreCampoCategoria="efectivo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TARJETA:
					sNombreCampoCategoria="tarjeta";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CREDITO:
					sNombreCampoCategoria="credito";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasCajasResumidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO:
					sNombreCampoCategoriaValor="efectivo";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TARJETA:
					sNombreCampoCategoriaValor="tarjeta";
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CREDITO:
					sNombreCampoCategoriaValor="credito";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasCajasResumidosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Efectivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"efectivo");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tarjeta");
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasCajasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getefectivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_TARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.gettarjeta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCajasResumidosConstantesFunciones.LABEL_CREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO);
					iRow++;

					for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascajasresumidos.getcredito());
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
			//	this.getFilaCabeceraExportarExcelVentasCajasResumidos(row);				
			//	iRow++;
			//}				
			
			//for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasCajasResumidos(ventascajasresumidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCajasResumidos(false);
			
			//SI ES MANUAL
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCajasResumidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCajasResumidos(false);
			
			//SI ES MANUAL
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasCajasResumidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCajasResumidos(false);
			
			//SI ES MANUAL
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasCajasResumidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasCajasResumidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasCajasResumidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasCajasResumidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasCajasResumidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasCajasResumidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasCajasResumidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasCajasResumidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasCajasResumidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasCajasResumidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasCajasResumidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasCajasResumidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasCajasResumidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasCajasResumidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasCajasResumidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCajasResumidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasCajasResumidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasCajasResumidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasCajasResumidos();
		
		this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasCajasResumidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCajasResumidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCajasResumidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCajasResumidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasCajasResumidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasCajasResumidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasCajasResumidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionNuevoVentasCajasResumidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionSinCerrarVentasCajasResumidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionSinMensajeVentasCajasResumidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasCajasResumidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasCajasResumidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
				this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionNuevoVentasCajasResumidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionSinCerrarVentasCajasResumidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasCajasResumidos.jCheckBoxPostAccionSinMensajeVentasCajasResumidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasCajasResumidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasCajasResumidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasCajasResumidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasCajasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasCajasResumidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasCajasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasCajasResumidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasCajasResumidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasCajasResumidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasCajasResumidos(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCajasResumidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasCajasResumidos() throws Exception {
		try	{
			if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasCajasResumidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasCajasResumidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasCajasResumidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasCajasResumidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasCajasResumidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasCajasResumidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasCajasResumidos.addItem(reporte);
			}
			
			
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasCajasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasCajasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasCajasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasCajasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasCajasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasCajasResumidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasCajasResumidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCajasResumidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCajasResumidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasCajasResumidosConstantesFunciones.getTiposSeleccionarVentasCajasResumidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasCajasResumidosConstantesFunciones.getTiposSeleccionarVentasCajasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasCajasResumidosConstantesFunciones.getTiposSeleccionarVentasCajasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasCajasResumidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaVentasCajasResumidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasCajasResumidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasCajasResumidos(Boolean esInicializar) throws Exception {				
		if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasCajasResumidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasCajasResumidos() throws Exception {
		this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasCajasResumidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasCajasResumidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasCajasResumidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventascajasresumidosLogic.getVentasCajasResumidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventascajasresumidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasCajasResumidos.setModel(new VentasCajasResumidosModel(this.ventascajasresumidosLogic.getVentasCajasResumidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasCajasResumidos.setModel(new VentasCajasResumidosModel(this.ventascajasresumidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasCajasResumidos!=null && this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasCajasResumidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,ventascajasresumidosConstantesFunciones.resaltarSeleccionarVentasCajasResumidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,ventascajasresumidosConstantesFunciones.resaltarSeleccionarVentasCajasResumidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_ID));

		if(this.ventascajasresumidosConstantesFunciones.mostraridVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascajasresumidosConstantesFunciones.resaltaridVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activaridVentasCajasResumidos,iSizeTabla,this,true,"idVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltaridVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activaridVentasCajasResumidos,this,true,"idVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_CODIGO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarcodigoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascajasresumidosConstantesFunciones.resaltarcodigoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarcodigoVentasCajasResumidos,iSizeTabla,this,true,"codigoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarcodigoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarcodigoVentasCajasResumidos,this,true,"codigoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarnombre_completoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnombre_completoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnombre_completoVentasCajasResumidos,iSizeTabla,this,true,"nombre_completoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnombre_completoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnombre_completoVentasCajasResumidos,this,true,"nombre_completoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emisionVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emisionVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarfecha_emisionVentasCajasResumidos,iSizeTabla,this,true,"fecha_emisionVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emisionVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarfecha_emisionVentasCajasResumidos,this,true,"fecha_emisionVentasCajasResumidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarnumero_pre_impresoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnumero_pre_impresoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnumero_pre_impresoVentasCajasResumidos,iSizeTabla,this,true,"numero_pre_impresoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnumero_pre_impresoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnumero_pre_impresoVentasCajasResumidos,this,true,"numero_pre_impresoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarnumero_documentoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnumero_documentoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnumero_documentoVentasCajasResumidos,iSizeTabla,this,true,"numero_documentoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarnumero_documentoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarnumero_documentoVentasCajasResumidos,this,true,"numero_documentoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_TOTAL));

		if(this.ventascajasresumidosConstantesFunciones.mostrartotalVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascajasresumidosConstantesFunciones.resaltartotalVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activartotalVentasCajasResumidos,iSizeTabla,this,true,"totalVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltartotalVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activartotalVentasCajasResumidos,this,true,"totalVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarefectivoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascajasresumidosConstantesFunciones.resaltarefectivoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarefectivoVentasCajasResumidos,iSizeTabla,this,true,"efectivoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarefectivoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarefectivoVentasCajasResumidos,this,true,"efectivoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_TARJETA));

		if(this.ventascajasresumidosConstantesFunciones.mostrartarjetaVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_TARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascajasresumidosConstantesFunciones.resaltartarjetaVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activartarjetaVentasCajasResumidos,iSizeTabla,this,true,"tarjetaVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltartarjetaVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activartarjetaVentasCajasResumidos,this,true,"tarjetaVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,VentasCajasResumidosConstantesFunciones.LABEL_CREDITO));

		if(this.ventascajasresumidosConstantesFunciones.mostrarcreditoVentasCajasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCajasResumidosConstantesFunciones.LABEL_CREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascajasresumidosConstantesFunciones.resaltarcreditoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarcreditoVentasCajasResumidos,iSizeTabla,this,true,"creditoVentasCajasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascajasresumidosConstantesFunciones.resaltarcreditoVentasCajasResumidos,this.ventascajasresumidosConstantesFunciones.activarcreditoVentasCajasResumidos,this,true,"creditoVentasCajasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCajasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasCajasResumidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasCajasResumidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasCajasResumidos.addColumn(tableColumn);
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
			
			this.jTableDatosVentasCajasResumidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasCajasResumidos.moveColumn(this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasCajasResumidos.moveColumn(this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasCajasResumidos.moveColumn(this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasCajasResumidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasCajasResumidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasCajasResumidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasCajasResumidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasCajasResumidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasCajasResumidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventascajasresumidosLogic.getVentasCajasResumidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventascajasresumidoss.size()-1;
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
		//this.jTableDatosVentasCajasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasCajasResumidos();
			
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
				
				//this.isEsNuevoVentasCajasResumidos=false;
					
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
				if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasCajasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasCajasResumidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventascajasresumidos.getsType().equals("DUPLICADO")
				   || this.ventascajasresumidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasCajasResumidos=true;
				
				} else {
					this.isEsNuevoVentasCajasResumidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
					if(this.ventascajasresumidos.getId()>=0 && !this.ventascajasresumidos.getIsNew()) {						
						this.isEsNuevoVentasCajasResumidos=false;
						
					} else {
						this.isEsNuevoVentasCajasResumidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasCajasResumidos(esRelaciones);						
				
				this.seleccionarVentasCajasResumidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventascajasresumidos.getId()<0) {
					this.isEsNuevoVentasCajasResumidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasCajasResumidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasCajasResumidos(evt,rowIndex);
				}	
				
				if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasCajasResumidos: " + this.dDif); 
					}
				}								
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasCajasResumidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventascajasresumidos)) {
					if(this.ventascajasresumidos.getId()>0) {
						this.ventascajasresumidos.setIsDeleted(true);
						
						this.ventascajasresumidossEliminados.add(this.ventascajasresumidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventascajasresumidosLogic.getVentasCajasResumidoss().remove(this.ventascajasresumidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidoss.remove(this.ventascajasresumidos);				
					}
					
					
					((VentasCajasResumidosModel) this.jTableDatosVentasCajasResumidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCajasResumidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasCajasResumidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasCajasResumidos) {
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasCajasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasCajasResumidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasCajasResumidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasCajasResumidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCajasResumidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasCajasResumidos(ventascajasresumidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasCajasResumidos(ventascajasresumidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasCajasResumidos(ventascajasresumidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasCajasResumidos(ventascajasresumidos);
	}
	
	public void setVariablesObjetoActualToFormularioVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setText(ventascajasresumidos.getId().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setText(ventascajasresumidos.getcodigo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setText(ventascajasresumidos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setDate(ventascajasresumidos.getfecha_emision());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setText(ventascajasresumidos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setText(ventascajasresumidos.getnumero_documento());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setText(ventascajasresumidos.gettotal().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setText(ventascajasresumidos.getefectivo().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setText(ventascajasresumidos.gettarjeta().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setText(ventascajasresumidos.getcredito().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasCajasResumidos ventascajasresumidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventascajasresumidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasCajasResumidos ventascajasresumidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventascajasresumidosLocal=this.ventascajasresumidos;
			} else {
				ventascajasresumidosLocal=this.ventascajasresumidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventascajasresumidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasCajasResumidos(ventascajasresumidosLocal,true);
					
					if(ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventascajasresumidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventascajasresumidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasCajasResumidos(ventascajasresumidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(ventascajasresumidos);
	}
	
	public void setVariablesFormularioToObjetoActualVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasCajasResumidos(ventascajasresumidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.getText()==null || this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.getText()=="" || this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setText("0");
			}

			if(conColumnasBase) {ventascajasresumidos.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelIdVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setcodigo(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcodigoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setnombre_completo(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnombre_completoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setfecha_emision(this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelfecha_emisionVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setnumero_pre_impreso(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_pre_impresoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setnumero_documento(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelnumero_documentoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltotalVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setefectivo(Double.parseDouble(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelefectivoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.settarjeta(Double.parseDouble(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_TARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabeltarjetaVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascajasresumidos.setcredito(Double.parseDouble(this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCajasResumidosConstantesFunciones.LABEL_CREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelcreditoVentasCajasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasCajasResumidos(VentasCajasResumidos ventascajasresumidosBean,VentasCajasResumidos ventascajasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasCajasResumidos(VentasCajasResumidos ventascajasresumidosOrigen,VentasCajasResumidos ventascajasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventascajasresumidosOrigen.getId()!=null && !ventascajasresumidosOrigen.getId().equals(0L))) {ventascajasresumidos.setId(ventascajasresumidosOrigen.getId());}}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getfecha_emision_desde()!=null && !ventascajasresumidosOrigen.getfecha_emision_desde().equals(new Date()))) {ventascajasresumidos.setfecha_emision_desde(ventascajasresumidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getfecha_emision_hasta()!=null && !ventascajasresumidosOrigen.getfecha_emision_hasta().equals(new Date()))) {ventascajasresumidos.setfecha_emision_hasta(ventascajasresumidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getcodigo()!=null && !ventascajasresumidosOrigen.getcodigo().equals(""))) {ventascajasresumidos.setcodigo(ventascajasresumidosOrigen.getcodigo());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getnombre_completo()!=null && !ventascajasresumidosOrigen.getnombre_completo().equals(""))) {ventascajasresumidos.setnombre_completo(ventascajasresumidosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getfecha_emision()!=null && !ventascajasresumidosOrigen.getfecha_emision().equals(new Date()))) {ventascajasresumidos.setfecha_emision(ventascajasresumidosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getnumero_pre_impreso()!=null && !ventascajasresumidosOrigen.getnumero_pre_impreso().equals(""))) {ventascajasresumidos.setnumero_pre_impreso(ventascajasresumidosOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getnumero_documento()!=null && !ventascajasresumidosOrigen.getnumero_documento().equals(""))) {ventascajasresumidos.setnumero_documento(ventascajasresumidosOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.gettotal()!=null && !ventascajasresumidosOrigen.gettotal().equals(0.0))) {ventascajasresumidos.settotal(ventascajasresumidosOrigen.gettotal());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getefectivo()!=null && !ventascajasresumidosOrigen.getefectivo().equals(0.0))) {ventascajasresumidos.setefectivo(ventascajasresumidosOrigen.getefectivo());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.gettarjeta()!=null && !ventascajasresumidosOrigen.gettarjeta().equals(0.0))) {ventascajasresumidos.settarjeta(ventascajasresumidosOrigen.gettarjeta());}
			if(conDefault || (!conDefault && ventascajasresumidosOrigen.getcredito()!=null && !ventascajasresumidosOrigen.getcredito().equals(0.0))) {ventascajasresumidos.setcredito(ventascajasresumidosOrigen.getcredito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setText(ventascajasresumidos.getId().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setText(ventascajasresumidos.getcodigo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setText(ventascajasresumidos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setDate(ventascajasresumidos.getfecha_emision());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setText(ventascajasresumidos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setText(ventascajasresumidos.getnumero_documento());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setText(ventascajasresumidos.gettotal().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setText(ventascajasresumidos.getefectivo().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setText(ventascajasresumidos.gettarjeta().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setText(ventascajasresumidos.getcredito().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasCajasResumidos(VentasCajasResumidosBean ventascajasresumidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setText(ventascajasresumidosBean.getId().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setText(ventascajasresumidosBean.getcodigo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setText(ventascajasresumidosBean.getnombre_completo());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setDate(ventascajasresumidosBean.getfecha_emision());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setText(ventascajasresumidosBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setText(ventascajasresumidosBean.getnumero_documento());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setText(ventascajasresumidosBean.gettotal().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setText(ventascajasresumidosBean.getefectivo().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setText(ventascajasresumidosBean.gettarjeta().toString());
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setText(ventascajasresumidosBean.getcredito().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasCajasResumidos(VentasCajasResumidosParameterReturnGeneral ventascajasresumidosReturnGeneral,VentasCajasResumidosBean ventascajasresumidosBean,Boolean conDefault) throws Exception { 
		try {
			VentasCajasResumidos ventascajasresumidosLocal=new VentasCajasResumidos();
			
			ventascajasresumidosLocal=ventascajasresumidosReturnGeneral.getVentasCajasResumidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventascajasresumidosLocal.getId()!=null && !ventascajasresumidosLocal.getId().equals(0L))) {ventascajasresumidosBean.setId(ventascajasresumidosLocal.getId());}}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getcodigo()!=null && !ventascajasresumidosLocal.getcodigo().equals(""))) {ventascajasresumidosBean.setcodigo(ventascajasresumidosLocal.getcodigo());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getnombre_completo()!=null && !ventascajasresumidosLocal.getnombre_completo().equals(""))) {ventascajasresumidosBean.setnombre_completo(ventascajasresumidosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getfecha_emision()!=null && !ventascajasresumidosLocal.getfecha_emision().equals(new Date()))) {ventascajasresumidosBean.setfecha_emision(ventascajasresumidosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getnumero_pre_impreso()!=null && !ventascajasresumidosLocal.getnumero_pre_impreso().equals(""))) {ventascajasresumidosBean.setnumero_pre_impreso(ventascajasresumidosLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getnumero_documento()!=null && !ventascajasresumidosLocal.getnumero_documento().equals(""))) {ventascajasresumidosBean.setnumero_documento(ventascajasresumidosLocal.getnumero_documento());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.gettotal()!=null && !ventascajasresumidosLocal.gettotal().equals(0.0))) {ventascajasresumidosBean.settotal(ventascajasresumidosLocal.gettotal());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getefectivo()!=null && !ventascajasresumidosLocal.getefectivo().equals(0.0))) {ventascajasresumidosBean.setefectivo(ventascajasresumidosLocal.getefectivo());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.gettarjeta()!=null && !ventascajasresumidosLocal.gettarjeta().equals(0.0))) {ventascajasresumidosBean.settarjeta(ventascajasresumidosLocal.gettarjeta());}
			if(conDefault || (!conDefault && ventascajasresumidosLocal.getcredito()!=null && !ventascajasresumidosLocal.getcredito().equals(0.0))) {ventascajasresumidosBean.setcredito(ventascajasresumidosLocal.getcredito());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasCajasResumidosGenerico(Long idVentasCajasResumidosSeleccionado,JComboBox jComboBoxVentasCajasResumidos,List<VentasCajasResumidos> ventascajasresumidossLocal)throws Exception {
		try {
			VentasCajasResumidos  ventascajasresumidosTemp=null;

			for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossLocal) {
				if(ventascajasresumidosAux.getId()!=null && ventascajasresumidosAux.getId().equals(idVentasCajasResumidosSeleccionado)) {
					ventascajasresumidosTemp=ventascajasresumidosAux;
					break;
				}
			}

			jComboBoxVentasCajasResumidos.setSelectedItem(ventascajasresumidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasCajasResumidosGenerico(JComboBox jComboBoxVentasCajasResumidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasCajasResumidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasCajasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasCajasResumidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasCajasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascajasresumidos=(VentasCajasResumidos) ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventascajasresumidos =(VentasCajasResumidos) ventascajasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventascajasresumidos.getIsNew() && !ventascajasresumidos.getIsChanged() && !ventascajasresumidos.getIsDeleted()) {
				sDescripcion=ventascajasresumidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventascajasresumidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventascajasresumidos.getIsNew() && !ventascajasresumidos.getIsChanged() && !ventascajasresumidos.getIsDeleted()) {
				sDescripcion=ventascajasresumidos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventascajasresumidos.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasCajasResumidos ventascajasresumidosRow=new VentasCajasResumidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascajasresumidosRow=(VentasCajasResumidos) ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventascajasresumidosRow=(VentasCajasResumidos) ventascajasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasCajasResumidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));			
			this.jButtonDuplicarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasCajasResumidos && this.isPermisoDuplicarVentasCajasResumidos));			
			this.jButtonCopiarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasCajasResumidos && this.isPermisoCopiarVentasCajasResumidos));
			this.jButtonVerFormVentasCajasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasCajasResumidos && this.isPermisoVerFormVentasCajasResumidos));
			
			this.jButtonAbrirOrderByVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));			
			
			this.jButtonNuevoRelacionesVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));			
			this.jButtonNuevoGuardarCambiosVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasCajasResumidos && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasCajasResumidos && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasCajasResumidos && this.isPermisoEliminarVentasCajasResumidos));
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasCajasResumidos);							
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));						
			this.jButtonDuplicarToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasCajasResumidos && this.isPermisoDuplicarVentasCajasResumidos));						
			this.jButtonCopiarToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasCajasResumidos && this.isPermisoCopiarVentasCajasResumidos));			
			this.jButtonVerFormToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasCajasResumidos && this.isPermisoVerFormVentasCajasResumidos));			
			this.jButtonAbrirOrderByToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));
			this.jButtonNuevoRelacionesToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));			
			this.jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));			
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasCajasResumidos && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasCajasResumidos  && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasCajasResumidos && this.isPermisoEliminarVentasCajasResumidos));
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarToolBarVentasCajasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasCajasResumidos);				
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));			
			this.jMenuItemDuplicarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasCajasResumidos && this.isPermisoDuplicarVentasCajasResumidos));			
			this.jMenuItemCopiarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasCajasResumidos && this.isPermisoCopiarVentasCajasResumidos));			
			this.jMenuItemVerFormVentasCajasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasCajasResumidos && this.isPermisoVerFormVentasCajasResumidos));			
			this.jMenuItemAbrirOrderByVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));			
			//this.jMenuItemMostrarOcultarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));
			this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));			
			//this.jMenuItemDetalleMostrarOcultarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasCajasResumidos && this.isPermisoOrdenVentasCajasResumidos));			
			this.jMenuItemNuevoRelacionesVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos));			
			this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasCajasResumidos && this.isPermisoNuevoVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));									
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemModificarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasCajasResumidos && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemActualizarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasCajasResumidos && this.isPermisoActualizarVentasCajasResumidos));	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemEliminarVentasCajasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasCajasResumidos && this.isPermisoEliminarVentasCajasResumidos));
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemCancelarVentasCajasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasCajasResumidos);				
			}
			
			this.jMenuItemGuardarCambiosVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));						
			this.jMenuItemGuardarCambiosTablaVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=this.jButtonNuevoVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaDuplicarVentasCajasResumidos=this.jButtonDuplicarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaCopiarVentasCajasResumidos=this.jButtonCopiarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaVerFormVentasCajasResumidos=this.jButtonVerFormVentasCajasResumidos.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasCajasResumidos=this.jButtonAbrirOrderByVentasCajasResumidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=this.jButtonNuevoRelacionesVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaModificarVentasCajasResumidos=this.jButtonModificarVentasCajasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=this.jButtonGuardarCambiosTablaVentasCajasResumidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=this.jButtonNuevoToolBarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=this.jButtonNuevoRelacionesToolBarVentasCajasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.isVisibilidadCeldaModificarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarToolBarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarToolBarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarToolBarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarToolBarVentasCajasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasCajasResumidos=this.jButtonGuardarCambiosToolBarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=this.jMenuItemNuevoVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=this.jMenuItemNuevoRelacionesVentasCajasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.isVisibilidadCeldaModificarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemModificarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemActualizarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemEliminarVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemCancelarVentasCajasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasCajasResumidos=this.jMenuItemGuardarCambiosVentasCajasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=this.jMenuItemGuardarCambiosTablaVentasCajasResumidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasCajasResumidos(Boolean esInicializar) {
		if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
				//if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasCajasResumidos();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasCajasResumidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasCajasResumidos() {
		this.jButtonNuevoVentasCajasResumidos.setVisible(this.isPermisoNuevoVentasCajasResumidos);			
		this.jButtonDuplicarVentasCajasResumidos.setVisible(this.isPermisoDuplicarVentasCajasResumidos);			
		this.jButtonCopiarVentasCajasResumidos.setVisible(this.isPermisoCopiarVentasCajasResumidos);			
		this.jButtonVerFormVentasCajasResumidos.setVisible(this.isPermisoVerFormVentasCajasResumidos);			
		
		this.jButtonAbrirOrderByVentasCajasResumidos.setVisible(this.isPermisoOrdenVentasCajasResumidos);					
		
		this.jButtonNuevoRelacionesVentasCajasResumidos.setVisible(this.isPermisoNuevoVentasCajasResumidos);			
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarVentasCajasResumidos.setVisible(this.isPermisoActualizarVentasCajasResumidos);	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.setVisible(this.isPermisoActualizarVentasCajasResumidos);	
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.setVisible(this.isPermisoEliminarVentasCajasResumidos);
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasCajasResumidos);						
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.setVisible(this.isPermisoGuardarCambiosVentasCajasResumidos);							
		}
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.setVisible(this.isPermisoActualizarVentasCajasResumidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasCajasResumidos() {
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarVentasCajasResumidos.setVisible(this.isPermisoActualizarVentasCajasResumidos);	
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.setVisible(this.isPermisoActualizarVentasCajasResumidos);	
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.setVisible(this.isPermisoEliminarVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasCajasResumidos);							
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasCajasResumidos && this.isPermisoGuardarCambiosVentasCajasResumidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasCajasResumidos() {
		if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasCajasResumidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasCajasResumidos() {
	}
	
	public void jTableDatosVentasCajasResumidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasCajasResumidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventascajasresumidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasCajasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasCajasResumidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasCajasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventascajasresumidosLogic.getConnexion());

				if(this.ventascajasresumidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventascajasresumidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasCajasResumidos=(TitledBorder)this.jScrollPanelDatosVentasCajasResumidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasCajasResumidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventascajasresumidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentasCajasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentasCajasResumidos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasCajasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasCajasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventascajasresumidosLogic.getConnexion());

				if(this.ventascajasresumidos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventascajasresumidos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasCajasResumidos=(TitledBorder)this.jScrollPanelDatosVentasCajasResumidos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentasCajasResumidos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventascajasresumidos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventascajasresumidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventascajasresumidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.ventascajasresumidos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.ventascajasresumidos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.ventascajasresumidos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.ventascajasresumidos.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.ventascajasresumidos.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.ventascajasresumidos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonefectivoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getefectivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where efectivo = "+this.ventascajasresumidos.getefectivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontarjetaVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.gettarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tarjeta = "+this.ventascajasresumidos.gettarjeta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncreditoVentasCajasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.getventascajasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascajasresumidos==null) {
						this.ventascajasresumidos = new VentasCajasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);
				}

				if(this.ventascajasresumidos.getcredito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito = "+this.ventascajasresumidos.getcredito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCajasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasCajasResumidosVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);

			this.getVentasCajasResumidossBusquedaVentasCajasResumidos();

			this.inicializarActualizarBindingVentasCajasResumidos(false);

			//if(VentasCajasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);

			this.getVentasCajasResumidossFK_IdEmpresa();

			this.inicializarActualizarBindingVentasCajasResumidos(false);

			//if(VentasCajasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentasCajasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);

			this.getVentasCajasResumidossFK_IdSucursal();

			this.inicializarActualizarBindingVentasCajasResumidos(false);

			//if(VentasCajasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascajasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasCajasResumidos() {
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasCajasResumidos.dispose();
			this.jInternalFrameDetalleFormVentasCajasResumidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
			this.jInternalFrameReporteDinamicoVentasCajasResumidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasCajasResumidos.dispose();
			this.jInternalFrameReporteDinamicoVentasCajasResumidos=null;
		}
		
		if(this.jInternalFrameImportacionVentasCajasResumidos!=null) {
			this.jInternalFrameImportacionVentasCajasResumidos.setVisible(false);	    			
			this.jInternalFrameImportacionVentasCajasResumidos.dispose();
			this.jInternalFrameImportacionVentasCajasResumidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasCajasResumidos();
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasCajasResumidos")) {
				jButtonDuplicarVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasCajasResumidos")) {
				jButtonCopiarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasCajasResumidos")) {
				jButtonVerFormVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasCajasResumidos")) {
				jButtonDuplicarVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasCajasResumidos")) {
				jButtonDuplicarVentasCajasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasCajasResumidos")) {
				jButtonModificarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasCajasResumidos")) {
				jButtonModificarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasCajasResumidos")) {
				jButtonModificarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasCajasResumidos")) {
				jButtonActualizarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasCajasResumidos")) {
				jButtonActualizarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasCajasResumidos")) {
				jButtonActualizarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasCajasResumidos")) {
				jButtonEliminarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasCajasResumidos")) {
				jButtonEliminarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasCajasResumidos")) {
				jButtonEliminarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasCajasResumidos")) {
				jButtonCancelarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasCajasResumidos")) {
				jButtonCancelarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasCajasResumidos")) {
				jButtonCancelarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasCajasResumidos")) {
				jButtonCerrarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasCajasResumidos")) {
				jButtonCerrarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasCajasResumidos")) {
				jButtonCerrarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasCajasResumidos")) {
				jButtonMostrarOcultarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasCajasResumidos")) {
				jButtonCancelarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasCajasResumidos")) {
				jButtonCopiarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasCajasResumidos")) {
				jButtonVerFormVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasCajasResumidos")) {
				jButtonCopiarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasCajasResumidos")) {
				jButtonVerFormVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasCajasResumidos")) {
				jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasCajasResumidos")) {
				jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasCajasResumidos")) {
				jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasCajasResumidos")) {
				jButtonAnterioresVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasCajasResumidos")) {
				jButtonAnterioresVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasCajasResumidos")) {
				jButtonAnterioresVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasCajasResumidos")) {
				jButtonSiguientesVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasCajasResumidos")) {
				jButtonSiguientesVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasCajasResumidos")) {
				jButtonSiguientesVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasCajasResumidos") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasCajasResumidos")) {
				jButtonAbrirOrderByVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasCajasResumidos") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasCajasResumidos")) {
				jButtonMostrarOcultarVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasCajasResumidos")) {
				jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasCajasResumidos")) {
				jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasCajasResumidos")) {
				jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasCajasResumidos")) {
				jButtonCerrarReporteDinamicoVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasCajasResumidos")) {
				jButtonGenerarReporteDinamicoVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasCajasResumidos")) {
				
				jButtonGenerarExcelReporteDinamicoVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasCajasResumidos")) {
				jButtonCerrarImportacionVentasCajasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasCajasResumidos")) {
				
				jButtonGenerarImportacionVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasCajasResumidos")) {
				
				jButtonAbrirImportacionVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasCajasResumidos")) {
				jComboBoxTiposAccionesVentasCajasResumidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasCajasResumidos")) {
				jComboBoxTiposRelacionesVentasCajasResumidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasCajasResumidos")) {
				jComboBoxTiposAccionesVentasCajasResumidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasCajasResumidos")) {
				
				jComboBoxTiposSeleccionarVentasCajasResumidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasCajasResumidos")) {
				jTextFieldValorCampoGeneralVentasCajasResumidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasCajasResumidos")) {
				jButtonAbrirOrderByVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasCajasResumidos")) {
				jButtonAbrirOrderByVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasCajasResumidos")) {
				jButtonCerrarOrderByVentasCajasResumidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasCajasResumidosBusqueda")) {
				this.jButtonidVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasCajasResumidosUpdate")) {
				this.jButtonid_empresaVentasCajasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasCajasResumidosBusqueda")) {
				this.jButtonid_empresaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasCajasResumidosUpdate")) {
				this.jButtonid_sucursalVentasCajasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasCajasResumidosBusqueda")) {
				this.jButtonid_sucursalVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVentasCajasResumidosBusqueda")) {
				this.jButtoncodigoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasCajasResumidosBusqueda")) {
				this.jButtonnombre_completoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emisionVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasCajasResumidosBusqueda")) {
				this.jButtonnumero_pre_impresoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoVentasCajasResumidosBusqueda")) {
				this.jButtonnumero_documentoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasCajasResumidosBusqueda")) {
				this.jButtontotalVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("efectivoVentasCajasResumidosBusqueda")) {
				this.jButtonefectivoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tarjetaVentasCajasResumidosBusqueda")) {
				this.jButtontarjetaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("creditoVentasCajasResumidosBusqueda")) {
				this.jButtoncreditoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasCajasResumidosVentasCajasResumidos")) {
				this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidosActionPerformed(evt);
			}
			
			;
			
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasCajasResumidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasCajasResumidos ventascajasresumidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventascajasresumidosLocal=this.ventascajasresumidos;
			} else {
				ventascajasresumidosLocal=this.ventascajasresumidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
							
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
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
			
			


			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
								
						
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
								
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
							
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
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
			
			


			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
								
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasCajasResumidos")) {
					jCheckBoxSeleccionarTodosVentasCajasResumidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasCajasResumidos")) {
					jCheckBoxSeleccionadosVentasCajasResumidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasCajasResumidos")) {
					
				}
				
				


				
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
												
				
				


				
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
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
			
			


			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCajasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascajasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascajasresumidos);
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
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
				
				


				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCajasResumidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCajasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCajasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascajasresumidosAnterior =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasCajasResumidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasCajasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasCajasResumidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventascajasresumidos =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventascajasresumidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasCajasResumidos")) {
				
				}
				
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasCajasResumidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasCajasResumidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasCajasResumidos")) {
			
			}
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasCajasResumidos();
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			if(sTipo.equals("NuevoVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasCajasResumidos")) {
				jButtonDuplicarVentasCajasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasCajasResumidos")) {
				jButtonCopiarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasCajasResumidos")) {
				jButtonVerFormVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasCajasResumidos")) {
				jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasCajasResumidos")) {
				jButtonModificarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasCajasResumidos")) {
				jButtonActualizarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasCajasResumidos")) {
				jButtonEliminarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasCajasResumidos")) {
				jButtonCancelarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasCajasResumidos")) {
				jButtonCerrarVentasCajasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasCajasResumidos")) {
				jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasCajasResumidos")) {
				jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasCajasResumidos")) {
				jButtonAbrirOrderByVentasCajasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasCajasResumidos")) {
				jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasCajasResumidos")) {
				jButtonAnterioresVentasCajasResumidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasCajasResumidos")) {
				jButtonSiguientesVentasCajasResumidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasCajasResumidosBusqueda")) {
				this.jButtonidVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasCajasResumidosUpdate")) {
				this.jButtonid_empresaVentasCajasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasCajasResumidosBusqueda")) {
				this.jButtonid_empresaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasCajasResumidosUpdate")) {
				this.jButtonid_sucursalVentasCajasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasCajasResumidosBusqueda")) {
				this.jButtonid_sucursalVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVentasCajasResumidosBusqueda")) {
				this.jButtoncodigoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasCajasResumidosBusqueda")) {
				this.jButtonnombre_completoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasCajasResumidosBusqueda")) {
				this.jButtonfecha_emisionVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasCajasResumidosBusqueda")) {
				this.jButtonnumero_pre_impresoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoVentasCajasResumidosBusqueda")) {
				this.jButtonnumero_documentoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasCajasResumidosBusqueda")) {
				this.jButtontotalVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("efectivoVentasCajasResumidosBusqueda")) {
				this.jButtonefectivoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tarjetaVentasCajasResumidosBusqueda")) {
				this.jButtontarjetaVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("creditoVentasCajasResumidosBusqueda")) {
				this.jButtoncreditoVentasCajasResumidosBusquedaActionPerformed(evt);
			}
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasCajasResumidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasCajasResumidos")) {
				closingInternalFrameVentasCajasResumidos();
				
			} else if(sTipo.equals("jButtonCancelarVentasCajasResumidos")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasCajasResumidos = (JInternalFrameBase)evt.getSource();
	            	
	            VentasCajasResumidosBeanSwingJInternalFrame jInternalFrameParent=(VentasCajasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasCajasResumidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasCajasResumidosActionPerformed(null);
			}
			
			VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventascajasresumidos,new Object(),this.ventascajasresumidosParameterGeneral,this.ventascajasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasCajasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasCajasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasCajasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventascajasresumidos)) {
			if(!esControlTabla) {
				if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);			
				}
				
				if(this.ventascajasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasCajasResumidos(this.ventascajasresumidosReturnGeneral,this.ventascajasresumidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventascajasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasCajasResumidos(classes,this.ventascajasresumidosReturnGeneral,this.ventascajasresumidosBean,false);
					}
						
					if(this.ventascajasresumidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos());	
					}
						
					if(this.ventascajasresumidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos(),classes);//this.ventascajasresumidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasCajasResumidos(this.ventascajasresumidos,classes);//this.ventascajasresumidosBean);									
				}
			
				if(VentasCajasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasCajasResumidos(this.ventascajasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCajasResumidos(this.ventascajasresumidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventascajasresumidosAnterior!=null) {
						this.ventascajasresumidos=this.ventascajasresumidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventascajasresumidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventascajasresumidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos(),ventascajasresumidosLogic.getVentasCajasResumidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidos(),this.ventascajasresumidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasCajasResumidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasCajasResumidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasCajasResumidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasCajasResumidos() throws Exception {
		
		VentasCajasResumidosModel ventascajasresumidosModel=(VentasCajasResumidosModel)this.jTableDatosVentasCajasResumidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascajasresumidosModel.ventascajasresumidoss=this.ventascajasresumidosLogic.getVentasCajasResumidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventascajasresumidosModel.ventascajasresumidoss=this.ventascajasresumidoss;
		}
		
		
		((VentasCajasResumidosModel) this.jTableDatosVentasCajasResumidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasCajasResumidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventascajasresumidosAnterior(),this.ventascajasresumidosLogic.getVentasCajasResumidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventascajasresumidosAnterior(),this.ventascajasresumidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasCajasResumidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
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
										
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventascajasresumidos,new Object(),generalEntityParameterGeneral,this.ventascajasresumidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasCajasResumidosConstantesFunciones.getClassesRelationshipsOfVentasCajasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasCajasResumidosConstantesFunciones.getClassesRelationshipsFromStringsOfVentasCajasResumidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasCajasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasCajasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventascajasresumidos,new Object(),generalEntityParameterGeneral,this.ventascajasresumidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasCajasResumidos(VentasCajasResumidosBean ventascajasresumidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasCajasResumidos(ArrayList<Classe> classes,VentasCajasResumidosReturnGeneral ventascajasresumidosReturnGeneral,VentasCajasResumidosBean ventascajasresumidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventascajasresumidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasCajasResumidos = new VentasCajasResumidosDetalleFormJInternalFrame(jDesktopPane,this.ventascajasresumidosSessionBean.getConGuardarRelaciones(),this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.setVisible(false);
		this.jInternalFrameDetalleFormVentasCajasResumidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.ventascajasresumidosLogic=this.ventascajasresumidosLogic;
		
		this.cargarCombosFrameForeignKeyVentasCajasResumidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasCajasResumidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasCajasResumidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasCajasResumidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasCajasResumidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasCajasResumidos"));
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ModificarVentasCajasResumidos"));

		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasCajasResumidos"));
					
		this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemModificarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasCajasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarVentasCajasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasCajasResumidos"));
						
		this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemActualizarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasCajasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"EliminarVentasCajasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasCajasResumidos"));
								
		this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemEliminarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasCajasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CancelarVentasCajasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasCajasResumidos"));
					
		this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemCancelarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasCajasResumidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemDetalleCerrarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasCajasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCajasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCajasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasCajasResumidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonidVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncodigoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnombre_completoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emisionVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_documentoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontotalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonefectivoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontarjetaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tarjetaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncreditoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"creditoVentasCajasResumidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasCajasResumidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasCajasResumidos"));
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasCajasResumidos"));
		}
		
		this.jTableDatosVentasCajasResumidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasCajasResumidos"));
		
		this.jTableDatosVentasCajasResumidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasCajasResumidos"));
		
		this.jButtonNuevoVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"NuevoVentasCajasResumidos"));
		
		this.jButtonDuplicarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarVentasCajasResumidos"));
		
		this.jButtonCopiarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"CopiarVentasCajasResumidos"));
		
		this.jButtonVerFormVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"VerFormVentasCajasResumidos"));
		
		
		this.jButtonNuevoToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasCajasResumidos"));
			
		this.jButtonDuplicarToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasCajasResumidos"));
			
		this.jMenuItemNuevoVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasCajasResumidos"));
			
		this.jMenuItemDuplicarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasCajasResumidos"));		
		
		
		this.jButtonNuevoRelacionesVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasCajasResumidos"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasCajasResumidos"));
			
		this.jMenuItemNuevoRelacionesVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasCajasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ModificarVentasCajasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonModificarToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasCajasResumidos"));
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemModificarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasCajasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarVentasCajasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonActualizarToolBarVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasCajasResumidos"));
				
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemActualizarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasCajasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"EliminarVentasCajasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonEliminarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasCajasResumidos"));
						
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemEliminarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasCajasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CancelarVentasCajasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonCancelarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasCajasResumidos"));
			
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemCancelarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasCajasResumidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasCajasResumidos"));		
		
		
		this.jButtonCerrarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CerrarVentasCajasResumidos"));
		
		
		this.jButtonCerrarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasCajasResumidos"));
			
		this.jMenuItemCerrarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasCajasResumidos"));
			
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jMenuItemDetalleCerrarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasCajasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasCajasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCajasResumidos"));
		}
		
		this.jButtonCopiarToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasCajasResumidos"));
			
		this.jButtonVerFormToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasCajasResumidos"));
		
		this.jMenuItemGuardarCambiosVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasCajasResumidos"));
			
		this.jMenuItemCopiarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasCajasResumidos"));		
		
		this.jMenuItemVerFormVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasCajasResumidos"));		
		
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasCajasResumidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasCajasResumidos"));
			
		this.jMenuItemGuardarCambiosTablaVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasCajasResumidos"));		
		
		
		
		this.jButtonRecargarInformacionVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasCajasResumidos"));
					
		this.jButtonRecargarInformacionToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasCajasResumidos"));
		
		this.jMenuItemRecargarInformacionVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasCajasResumidos"));		
		
		
		
		this.jButtonAnterioresVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresVentasCajasResumidos"));
		
		
		this.jButtonAnterioresToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasCajasResumidos"));
		
		this.jMenuItemAnterioresVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasCajasResumidos"));		
		
		
		this.jButtonSiguientesVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesVentasCajasResumidos"));
		
		
		this.jButtonSiguientesToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasCajasResumidos"));
			
		this.jMenuItemSiguientesVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasCajasResumidos"));
			
		this.jMenuItemAbrirOrderByVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasCajasResumidos"));
			
		this.jMenuItemMostrarOcultarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasCajasResumidos"));
			
		this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasCajasResumidos"));
			
		this.jMenuItemDetalleMostarOcultarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasCajasResumidos"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasCajasResumidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasCajasResumidos"));
			
		this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasCajasResumidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasCajasResumidos"));

		this.jCheckBoxSeleccionadosVentasCajasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasCajasResumidos"));
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasCajasResumidos"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasCajasResumidos"));
			
		this.jComboBoxTiposAccionesVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasCajasResumidos"));
					
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasCajasResumidos"));
			
		this.jTextFieldValorCampoGeneralVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasCajasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonidVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncodigoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnombre_completoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emisionVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_documentoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontotalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonefectivoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontarjetaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tarjetaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncreditoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"creditoVentasCajasResumidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaVentasCajasResumidosVentasCajasResumidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasCajasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCajasResumidos"));
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCajasResumidos"));
				this.jInternalFrameReporteDinamicoVentasCajasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCajasResumidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCajasResumidos"));				
			//this.jButtonGenerarReporteDinamicoVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCajasResumidos"));
			//this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCajasResumidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasCajasResumidos!=null) {
				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasCajasResumidos"));
				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasCajasResumidos"));
				this.jInternalFrameImportacionVentasCajasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasCajasResumidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasCajasResumidos"));
			
			this.jButtonAbrirOrderByToolBarVentasCajasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasCajasResumidos"));			
			
			if(this.jInternalFrameOrderByVentasCajasResumidos!=null) {
				this.jInternalFrameOrderByVentasCajasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasCajasResumidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCajasResumidos.jTabbedPaneRelacionesVentasCajasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasCajasResumidos"));
		
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
            		closingInternalFrameVentasCajasResumidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasCajasResumidos = (JInternalFrameBase)event.getSource();
	            	
	            VentasCajasResumidosBeanSwingJInternalFrame jInternalFrameParent=(VentasCajasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasCajasResumidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasCajasResumidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasCajasResumidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasCajasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasCajasResumidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasCajasResumidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasCajasResumidos";
		inputMap = this.jButtonNuevoVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasCajasResumidos";
		inputMap = this.jButtonNuevoRelacionesVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasCajasResumidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasCajasResumidos";
		inputMap = this.jButtonModificarVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasCajasResumidos";
		inputMap = this.jButtonActualizarVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasCajasResumidos";
		inputMap = this.jButtonEliminarVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasCajasResumidos";
		inputMap = this.jButtonCancelarVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasCajasResumidos";
		inputMap = this.jButtonCerrarVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasCajasResumidos";
		inputMap = this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonGuardarCambiosVentasCajasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasCajasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasCajasResumidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasCajasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasCajasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasCajasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasCajasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasCajasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonidVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_empresaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCajasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonid_sucursalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncodigoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnombre_completoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonfecha_emisionVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonnumero_documentoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontotalVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtonefectivoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtontarjetaVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tarjetaVentasCajasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCajasResumidos.jButtoncreditoVentasCajasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"creditoVentasCajasResumidosBusqueda"));
		
		
		this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaVentasCajasResumidosVentasCajasResumidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasCajasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasCajasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasCajasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasCajasResumidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasCajasResumidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
					ventascajasresumidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidoss) {
					ventascajasresumidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasCajasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
						ventascajasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidoss) {
						ventascajasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasCajasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasCajasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasCajasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasCajasResumidos.getSelectedRows();
			
			VentasCajasResumidos ventascajasresumidosLocal=new VentasCajasResumidos();
			
			//this.seleccionarTodosVentasCajasResumidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventascajasresumidosLocal =(VentasCajasResumidos) this.ventascajasresumidosLogic.getVentasCajasResumidoss().toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventascajasresumidosLocal =(VentasCajasResumidos) this.ventascajasresumidoss.toArray()[this.jTableDatosVentasCajasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventascajasresumidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
						ventascajasresumidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidoss) {
						ventascajasresumidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasCajasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasCajasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasCajasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasCajasResumidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasCajasResumidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasCajasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasCajasResumidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidosLogic.getVentasCajasResumidoss()) {
				
						if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ventascajasresumidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventascajasresumidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventascajasresumidosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							ventascajasresumidosAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventascajasresumidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO)) {
							existe=true;
							ventascajasresumidosAux.setefectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA)) {
							existe=true;
							ventascajasresumidosAux.settarjeta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO)) {
							existe=true;
							ventascajasresumidosAux.setcredito(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidoss) {
					
						if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ventascajasresumidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventascajasresumidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventascajasresumidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventascajasresumidosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							ventascajasresumidosAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventascajasresumidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO)) {
							existe=true;
							ventascajasresumidosAux.setefectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA)) {
							existe=true;
							ventascajasresumidosAux.settarjeta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO)) {
							existe=true;
							ventascajasresumidosAux.setcredito(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasCajasResumidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasCajasResumidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasCajasResumidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasCajasResumidos) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasCajasResumidos(conSplash);
				
					this.generarReporteVentasCajasResumidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasCajasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasCajasResumidossSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasCajasResumidossSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasCajasResumidos();
				
				this.exportarVentasCajasResumidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasCajasResumidoss();
				//this.importarVentasCajasResumidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasCajasResumidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasCajasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Cajas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasCajasResumidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasCajasResumidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasCajasResumidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasCajasResumidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasCajasResumidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasCajasResumidos(conSplash);
					
						//this.actualizarParametrosGeneralVentasCajasResumidos();
						
						this.generarReporteProcesoAccionVentasCajasResumidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasCajasResumidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas Cajas ResumidosES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Cajas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasCajasResumidos();
				
						this.actualizarParametrosGeneralVentasCajasResumidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventascajasresumidosReturnGeneral=ventascajasresumidosLogic.procesarAccionVentasCajasResumidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventascajasresumidosLogic.getVentasCajasResumidoss(),this.ventascajasresumidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasCajasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasCajasResumidos();
					
					VentasCajasResumidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasCajasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasCajasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasCajasResumidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasCajasResumidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasCajasResumidos();
			
			if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
			VentasCajasResumidos ventascajasresumidos=new VentasCajasResumidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasCajasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasCajasResumidos.getSelectedItem();
			
			
			
			
			ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventascajasresumidossSeleccionados.size()==1) {
				for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
					ventascajasresumidos=ventascajasresumidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasCajasResumidos();
			
      		//this.finishProcessVentasCajasResumidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasCajasResumidosReturnGeneral() throws Exception {
		if(this.ventascajasresumidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventascajasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventascajasresumidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventascajasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventascajasresumidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventascajasresumidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasCajasResumidos(false);
		}
		
		if(this.ventascajasresumidosReturnGeneral.getConRetornoLista() || this.ventascajasresumidosReturnGeneral.getConRetornoObjeto()) {
			if(this.ventascajasresumidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventascajasresumidosLogic.setVentasCajasResumidoss(this.ventascajasresumidosReturnGeneral.getVentasCajasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasCajasResumidos(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasCajasResumidos() throws Exception {
		
		
	}
	
	public ArrayList<VentasCajasResumidos> getVentasCajasResumidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasCajasResumidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidosLogic.getVentasCajasResumidoss()) {
					if(ventascajasresumidosAux.getIsSelected()) {
						ventascajasresumidossSeleccionados.add(ventascajasresumidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCajasResumidos ventascajasresumidosAux:this.ventascajasresumidoss) {
					if(ventascajasresumidosAux.getIsSelected()) {
						ventascajasresumidossSeleccionados.add(ventascajasresumidosAux);				
					}
				}
			}
			
			if(ventascajasresumidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventascajasresumidossSeleccionados.addAll(this.ventascajasresumidosLogic.getVentasCajasResumidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventascajasresumidossSeleccionados.addAll(this.ventascajasresumidoss);				
					}
				}
			}
		} else {
			ventascajasresumidossSeleccionados.add(this.ventascajasresumidos);
		}
		
		return ventascajasresumidossSeleccionados;
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
	
	public void generarReporteVentasCajasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasCajasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasCajasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasCajasResumidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasCajasResumidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Cajas Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasCajasResumidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasCajasResumidos();
		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasCajasResumidos();
		
		
		//this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados ,ventascajasresumidosImplementable,ventascajasresumidosImplementableHome);
	}
	
	public void mostrarImportacionVentasCajasResumidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasCajasResumidos();
		
		this.abrirFrameImportacionVentasCajasResumidos();		
		
			
		//this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados ,ventascajasresumidosImplementable,ventascajasresumidosImplementableHome);
	}
	
	public void importarVentasCajasResumidoss() throws Exception {		
	
	}
	
	public void exportarVentasCajasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasCajasResumidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasCajasResumidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasCajasResumidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Cajas Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasCajasResumidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasCajasResumidos(ventascajasresumidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventascajasresumidosAux.setsDetalleGeneralEntityReporte(ventascajasresumidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasCajasResumidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_TARJETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCajasResumidosConstantesFunciones.LABEL_CREDITO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventascajasresumidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getefectivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.gettarjeta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascajasresumidos.getcredito().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasCajasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasCajasResumidos(row);				
				iRow++;
			}				
			
			for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasCajasResumidos(ventascajasresumidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasCajasResumidossSeleccionados() throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();		
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascajasresumidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventascajasresumidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventascajasresumidos");
			//elementRoot.appendChild(element);
		
			for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
				element = document.createElement("ventascajasresumidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasCajasResumidos(ventascajasresumidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Cajas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasCajasResumidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getefectivo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.gettarjeta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascajasresumidos.getcredito());				
	}
	
	public void setFilaDatosExportarXmlVentasCajasResumidos(VentasCajasResumidos ventascajasresumidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasCajasResumidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventascajasresumidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasCajasResumidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventascajasresumidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasCajasResumidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventascajasresumidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentasCajasResumidosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventascajasresumidos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasCajasResumidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventascajasresumidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasCajasResumidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventascajasresumidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(VentasCajasResumidosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(ventascajasresumidos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(VentasCajasResumidosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(ventascajasresumidos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementfecha_emision = document.createElement(VentasCajasResumidosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(ventascajasresumidos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_pre_impreso = document.createElement(VentasCajasResumidosConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(ventascajasresumidos.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementnumero_documento = document.createElement(VentasCajasResumidosConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(ventascajasresumidos.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementtotal = document.createElement(VentasCajasResumidosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(ventascajasresumidos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementefectivo = document.createElement(VentasCajasResumidosConstantesFunciones.EFECTIVO);
		elementefectivo.appendChild(document.createTextNode(ventascajasresumidos.getefectivo().toString().trim()));
		element.appendChild(elementefectivo);

		Element elementtarjeta = document.createElement(VentasCajasResumidosConstantesFunciones.TARJETA);
		elementtarjeta.appendChild(document.createTextNode(ventascajasresumidos.gettarjeta().toString().trim()));
		element.appendChild(elementtarjeta);

		Element elementcredito = document.createElement(VentasCajasResumidosConstantesFunciones.CREDITO);
		elementcredito.appendChild(document.createTextNode(ventascajasresumidos.getcredito().toString().trim()));
		element.appendChild(elementcredito);
	}
	
	public void generarReporteGroupGenericoVentasCajasResumidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados=new ArrayList<VentasCajasResumidos>();
		
		ventascajasresumidossSeleccionados=this.getVentasCajasResumidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasCajasResumidos(ventascajasresumidossSeleccionados);
		
		this.generarReporteVentasCajasResumidoss("Todos",ventascajasresumidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasCajasResumidos(ArrayList<VentasCajasResumidos> ventascajasresumidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasCajasResumidos ventascajasresumidosAux:ventascajasresumidossSeleccionados) {
				ventascajasresumidosAux.setsDetalleGeneralEntityReporte(ventascajasresumidosAux.toString());
			
				if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventascajasresumidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventascajasresumidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventascajasresumidosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					ventascajasresumidosAux.setsDescripcionGeneralEntityReporte1(ventascajasresumidosAux.getnumero_documento());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCajasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasCajasResumidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasCajasResumidos=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=true;
				this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=true;
			}
			
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=true;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=true;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
			this.isVisibilidadCeldaModificarVentasCajasResumidos=true;
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasCajasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=true;
		} else {
			this.actualizarEstadoPanelsVentasCajasResumidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasCajasResumidos=false;
			//this.isVisibilidadCeldaVerFormVentasCajasResumidos=false;
			this.isVisibilidadCeldaDuplicarVentasCajasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!ventascajasresumidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;												
			}
			
			this.jButtonCerrarVentasCajasResumidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
		}
		
		if(!this.permiteMantenimiento(this.ventascajasresumidos)) {
			this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasCajasResumidos=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasCajasResumidos=false;
		this.isVisibilidadCeldaGuardarCambiosVentasCajasResumidos=false;
		//this.isVisibilidadCeldaModificarVentasCajasResumidos=true;
		this.isVisibilidadCeldaActualizarVentasCajasResumidos=false;
		this.isVisibilidadCeldaEliminarVentasCajasResumidos=false;
		//this.isVisibilidadCeldaCancelarVentasCajasResumidos=true;			
		this.isVisibilidadCeldaGuardarVentasCajasResumidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasCajasResumidos() {
	}
	
	public void actualizarEstadoPanelsVentasCajasResumidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasCajasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasCajasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCajasResumidos!=null) {
				this.jScrollPanelDatosVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCajasResumidos!=null) {
				this.jPanelPaginacionVentasCajasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
					this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCajasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasCajasResumidos!=null) {
				this.jPanelParametrosReportesVentasCajasResumidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasCajasResumidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasCajasResumidos) {this.jTabbedPaneBusquedasVentasCajasResumidos.remove(jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentasCajasResumidos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentasCajasResumidos) {this.jTabbedPaneBusquedasVentasCajasResumidos.remove(jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);}
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
			
			this.inicializarActualizarBindingTablaVentasCajasResumidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasCajasResumidos() {
		this.updateBorderResaltarBusquedasFormularioVentasCajasResumidos();
		this.updateVisibilidadBusquedasFormularioVentasCajasResumidos();
		this.updateHabilitarBusquedasFormularioVentasCajasResumidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasCajasResumidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasCajasResumidos.getComponents().length>0) {
	

		if(this.ventascajasresumidosConstantesFunciones.resaltarBusquedaVentasCajasResumidosVentasCajasResumidos!=null) {
			index= this.jTabbedPaneBusquedasVentasCajasResumidos.indexOfComponent(this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCajasResumidos.getComponent(index);
				jPanel.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarBusquedaVentasCajasResumidosVentasCajasResumidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasCajasResumidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasCajasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasCajasResumidos.indexOfComponent(this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCajasResumidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarBusquedaVentasCajasResumidosVentasCajasResumidos);
			if(!this.ventascajasresumidosConstantesFunciones.mostrarBusquedaVentasCajasResumidosVentasCajasResumidos && index>-1) {
				this.jTabbedPaneBusquedasVentasCajasResumidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasCajasResumidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasCajasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasCajasResumidos.indexOfComponent(this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCajasResumidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventascajasresumidosConstantesFunciones.activarBusquedaVentasCajasResumidosVentasCajasResumidos);
				this.jTabbedPaneBusquedasVentasCajasResumidos.setEnabledAt(index,this.ventascajasresumidosConstantesFunciones.activarBusquedaVentasCajasResumidosVentasCajasResumidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasCajasResumidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasCajasResumidos")) {
			index= this.jTabbedPaneBusquedasVentasCajasResumidos.indexOfComponent(this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);

			this.jTabbedPaneBusquedasVentasCajasResumidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCajasResumidos.getComponent(index);

			this.ventascajasresumidosConstantesFunciones.setResaltarBusquedaVentasCajasResumidosVentasCajasResumidos(resaltar);

			jPanel.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarBusquedaVentasCajasResumidosVentasCajasResumidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasCajasResumidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasCajasResumidos() throws Exception {

		if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasCajasResumidos();
		this.updateVisibilidadResaltarControlesFormularioVentasCajasResumidos();
		this.updateHabilitarResaltarControlesFormularioVentasCajasResumidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasCajasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventascajasresumidosConstantesFunciones.resaltaridVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltaridVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarid_empresaVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarid_empresaVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarid_sucursalVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarid_sucursalVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emision_desdeVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_desdeVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emision_desdeVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emision_hastaVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_hastaVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emision_hastaVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarcodigoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarcodigoVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarnombre_completoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarnombre_completoVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emisionVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarfecha_emisionVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarnumero_pre_impresoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarnumero_pre_impresoVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarnumero_documentoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarnumero_documentoVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltartotalVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltartotalVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarefectivoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarefectivoVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltartarjetaVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltartarjetaVentasCajasResumidos);}
		if(this.ventascajasresumidosConstantesFunciones.resaltarcreditoVentasCajasResumidos!=null && this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setBorder(this.ventascajasresumidosConstantesFunciones.resaltarcreditoVentasCajasResumidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasCajasResumidos() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
	
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostraridVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelidVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostraridVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarid_empresaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelid_empresaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarid_empresaVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarid_sucursalVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelid_sucursalVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarid_sucursalVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_desdeVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emision_desdeVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelfecha_emision_desdeVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emision_desdeVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_hastaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emision_hastaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelfecha_emision_hastaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emision_hastaVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarcodigoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelcodigoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarcodigoVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnombre_completoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelnombre_completoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnombre_completoVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emisionVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelfecha_emisionVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarfecha_emisionVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnumero_pre_impresoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelnumero_pre_impresoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnumero_pre_impresoVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnumero_documentoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelnumero_documentoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarnumero_documentoVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrartotalVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPaneltotalVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrartotalVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarefectivoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelefectivoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarefectivoVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrartarjetaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPaneltarjetaVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrartarjetaVentasCajasResumidos);
		//this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarcreditoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jPanelcreditoVentasCajasResumidos.setVisible(this.ventascajasresumidosConstantesFunciones.mostrarcreditoVentasCajasResumidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasCajasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasCajasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasCajasResumidos!=null) {
	
		this.jInternalFrameDetalleFormVentasCajasResumidos.jLabelidVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activaridVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_empresaVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarid_empresaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jComboBoxid_sucursalVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarid_sucursalVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_desdeVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarfecha_emision_desdeVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emision_hastaVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarfecha_emision_hastaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcodigoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarcodigoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextAreanombre_completoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarnombre_completoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jDateChooserfecha_emisionVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarfecha_emisionVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_pre_impresoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarnumero_pre_impresoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldnumero_documentoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarnumero_documentoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtotalVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activartotalVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldefectivoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarefectivoVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldtarjetaVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activartarjetaVentasCajasResumidos);
		this.jInternalFrameDetalleFormVentasCajasResumidos.jTextFieldcreditoVentasCajasResumidos.setEnabled(this.ventascajasresumidosConstantesFunciones.activarcreditoVentasCajasResumidos);
		}
	}
	
		
}