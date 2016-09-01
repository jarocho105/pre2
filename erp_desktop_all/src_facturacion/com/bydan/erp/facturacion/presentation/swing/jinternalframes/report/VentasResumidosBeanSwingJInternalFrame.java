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

//import com.bydan.erp.facturacion.util.VentasResumidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasResumidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasResumidosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasResumidosBean;
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
public class VentasResumidosBeanSwingJInternalFrame extends VentasResumidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasResumidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasResumidos> ventasresumidosValidator = new ClassValidator<VentasResumidos>(VentasResumidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasResumidos ventasresumidos;	
	public VentasResumidos ventasresumidosAux;
	public VentasResumidos ventasresumidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasResumidos ventasresumidosTotales;
	public Long idVentasResumidosActual;
	public Long iIdNuevoVentasResumidos=0L;
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
	
	public Boolean isPermisoTodoVentasResumidos;
	public Boolean isPermisoNuevoVentasResumidos;
	public Boolean isPermisoActualizarVentasResumidos;
	public Boolean isPermisoActualizarOriginalVentasResumidos;
	public Boolean isPermisoEliminarVentasResumidos;
	public Boolean isPermisoGuardarCambiosVentasResumidos;
	public Boolean isPermisoConsultaVentasResumidos;
	public Boolean isPermisoBusquedaVentasResumidos;
	public Boolean isPermisoReporteVentasResumidos;
	public Boolean isPermisoPaginacionMedioVentasResumidos;
	public Boolean isPermisoPaginacionAltoVentasResumidos;
	public Boolean isPermisoPaginacionTodoVentasResumidos;
	public Boolean isPermisoCopiarVentasResumidos;
	public Boolean isPermisoVerFormVentasResumidos;
	public Boolean isPermisoDuplicarVentasResumidos;
	public Boolean isPermisoOrdenVentasResumidos;
	
	
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
	
	public VentasResumidosParameterReturnGeneral ventasresumidosReturnGeneral;
	public VentasResumidosParameterReturnGeneral ventasresumidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasResumidos=false;
	public Boolean esParaAccionDesdeFormularioVentasResumidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasResumidosSessionBeanAdditional ventasresumidosSessionBeanAdditional=null;
	
	public VentasResumidosSessionBeanAdditional getVentasResumidosSessionBeanAdditional() {
		return this.ventasresumidosSessionBeanAdditional;
	}
	
	public void setVentasResumidosSessionBeanAdditional(VentasResumidosSessionBeanAdditional ventasresumidosSessionBeanAdditional) {
		try {
			this.ventasresumidosSessionBeanAdditional=ventasresumidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasResumidosBeanSwingJInternalFrameAdditional ventasresumidosBeanSwingJInternalFrameAdditional=null;
	//public class VentasResumidosBeanSwingJInternalFrame
	
	public VentasResumidosBeanSwingJInternalFrameAdditional getVentasResumidosBeanSwingJInternalFrameAdditional() {
		return this.ventasresumidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasResumidosBeanSwingJInternalFrameAdditional(VentasResumidosBeanSwingJInternalFrameAdditional ventasresumidosBeanSwingJInternalFrameAdditional) {
		try {
			this.ventasresumidosBeanSwingJInternalFrameAdditional=ventasresumidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasResumidosLogic ventasresumidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasResumidos ventasresumidosBean;
	public VentasResumidosConstantesFunciones ventasresumidosConstantesFunciones;
	//public VentasResumidosParameterReturnGeneral ventasresumidosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<VentasResumidos> ventasresumidoss;	
	//public List<VentasResumidos> ventasresumidossEliminados;
	//public List<VentasResumidos> ventasresumidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasResumidos=false;
	public Boolean isVisibilidadCeldaDuplicarVentasResumidos=true;
	public Boolean isVisibilidadCeldaCopiarVentasResumidos=true;
	public Boolean isVisibilidadCeldaVerFormVentasResumidos=true;
	public Boolean isVisibilidadCeldaOrdenVentasResumidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
	public Boolean isVisibilidadCeldaModificarVentasResumidos=false;
	public Boolean isVisibilidadCeldaActualizarVentasResumidos=false;
	public Boolean isVisibilidadCeldaEliminarVentasResumidos=false;
	public Boolean isVisibilidadCeldaCancelarVentasResumidos=false;
	public Boolean isVisibilidadCeldaGuardarVentasResumidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasResumidos=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasResumidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVentasResumidos() {
		return this.iIdNuevoVentasResumidos;
	}

	public void setiIdNuevoVentasResumidos(Long iIdNuevoVentasResumidos) {
		this.iIdNuevoVentasResumidos = iIdNuevoVentasResumidos;
	}
	
	public Long getidVentasResumidosActual() {
		return this.idVentasResumidosActual;
	}

	public void setidVentasResumidosActual(Long idVentasResumidosActual) {
		this.idVentasResumidosActual = idVentasResumidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasResumidos getventasresumidos() {
		return this.ventasresumidos;
	}

	public void setventasresumidos(VentasResumidos ventasresumidos) {
		this.ventasresumidos = ventasresumidos;
	}
	
	public VentasResumidos getventasresumidosAux() {
		return this.ventasresumidosAux;
	}

	public void setventasresumidosAux(VentasResumidos ventasresumidosAux) {
		this.ventasresumidosAux = ventasresumidosAux;
	}				
	
	public VentasResumidos getventasresumidosAnterior() {
		return this.ventasresumidosAnterior;
	}

	public void setventasresumidosAnterior(VentasResumidos ventasresumidosAnterior) {
		this.ventasresumidosAnterior = ventasresumidosAnterior;
	}	
	
	public VentasResumidos getventasresumidosTotales() {
		return this.ventasresumidosTotales;
	}

	public void setventasresumidosTotales(VentasResumidos ventasresumidosTotales) {
		this.ventasresumidosTotales = ventasresumidosTotales;
	}	
	
	public VentasResumidos getventasresumidosBean() {
		return this.ventasresumidosBean;
	}

	public void setventasresumidosBean(VentasResumidos ventasresumidosBean) {
		this.ventasresumidosBean = ventasresumidosBean;
	}	
	
	public VentasResumidosParameterReturnGeneral getventasresumidosReturnGeneral() {
		return this.ventasresumidosReturnGeneral;
	}

	public void setventasresumidosReturnGeneral(VentasResumidosParameterReturnGeneral ventasresumidosReturnGeneral) {
		this.ventasresumidosReturnGeneral = ventasresumidosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaVentasResumidos=new Date();

	public Date getfecha_emision_desdeBusquedaVentasResumidos() {
		return this.fecha_emision_desdeBusquedaVentasResumidos;
	}

	public void setfecha_emision_desdeBusquedaVentasResumidos(Date fecha_emision_desdeBusquedaVentasResumidos) {
		this.fecha_emision_desdeBusquedaVentasResumidos = fecha_emision_desdeBusquedaVentasResumidos;
	}

;
	public Date fecha_emision_hastaBusquedaVentasResumidos=new Date();

	public Date getfecha_emision_hastaBusquedaVentasResumidos() {
		return this.fecha_emision_hastaBusquedaVentasResumidos;
	}

	public void setfecha_emision_hastaBusquedaVentasResumidos(Date fecha_emision_hastaBusquedaVentasResumidos) {
		this.fecha_emision_hastaBusquedaVentasResumidos = fecha_emision_hastaBusquedaVentasResumidos;
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
	
	
	public VentasResumidosLogic getVentasResumidosLogic()	{		
		return ventasresumidosLogic;
	}

	public void setVentasResumidosLogic(VentasResumidosLogic ventasresumidosLogic) {
		this.ventasresumidosLogic = ventasresumidosLogic;
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
	
	public Boolean getIsEsNuevoVentasResumidos() {
		return isEsNuevoVentasResumidos;
	}

	public void setIsEsNuevoVentasResumidos(Boolean isEsNuevoVentasResumidos) {
		this.isEsNuevoVentasResumidos = isEsNuevoVentasResumidos;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasResumidos() {
		return esParaAccionDesdeFormularioVentasResumidos;
	}
	
	public void setEsParaAccionDesdeFormularioVentasResumidos(Boolean esParaAccionDesdeFormularioVentasResumidos) {
		this.esParaAccionDesdeFormularioVentasResumidos = esParaAccionDesdeFormularioVentasResumidos;
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

			if(this.ventasresumidosSessionBean==null) {
				this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
			}

			if(!this.ventasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventasresumidosSessionBean.getlidEmpresaActual());
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

			if(this.ventasresumidosSessionBean==null) {
				this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
			}

			if(!this.ventasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventasresumidosSessionBean.getlidSucursalActual());
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

					if(this.ventasresumidos!=null) {
						this.ventasresumidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
						this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasResumidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasResumidosGenerico)throws Exception
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
				jComboBoxid_empresaVentasResumidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasResumidosGenerico!=null && jComboBoxid_empresaVentasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasResumidosGenerico.setSelectedIndex(0);
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

					if(this.ventasresumidos!=null) {
						this.ventasresumidos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
						this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentasResumidos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentasResumidosGenerico)throws Exception
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
				jComboBoxid_sucursalVentasResumidosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentasResumidosGenerico!=null && jComboBoxid_sucursalVentasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasResumidos ventasresumidos,JComboBox jComboBoxid_empresaVentasResumidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasResumidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasResumidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventasresumidos.setid_empresa(empresaAux.getId());
				ventasresumidos.setempresa_descripcion(VentasResumidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventasresumidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentasResumidos ventasresumidos,JComboBox jComboBoxid_sucursalVentasResumidosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentasResumidosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentasResumidosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventasresumidos.setid_sucursal(sucursalAux.getId());
				ventasresumidos.setsucursal_descripcion(VentasResumidosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventasresumidos.setSucursal(sucursalAux);			}
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

					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) { 
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidos!=null) { 
					}

					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) { 
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidos!=null) { 
					}

					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentasResumidos() throws Exception {
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
		
	public VentasResumidosParameterReturnGeneral getVentasResumidosParameterGeneral() {
		return this.ventasresumidosParameterGeneral;
	}
	
	public void setVentasResumidosParameterGeneral(VentasResumidosParameterReturnGeneral ventasresumidosParameterGeneral) {
		this.ventasresumidosParameterGeneral = ventasresumidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasResumidos() {
		return isPermisoTodoVentasResumidos;
	}

	public void setIsPermisoTodoVentasResumidos(Boolean isPermisoTodoVentasResumidos) {
		this.isPermisoTodoVentasResumidos = isPermisoTodoVentasResumidos;
	}

	public Boolean getIsPermisoNuevoVentasResumidos() {
		return isPermisoNuevoVentasResumidos;
	}

	public void setIsPermisoNuevoVentasResumidos(Boolean isPermisoNuevoVentasResumidos) {
		this.isPermisoNuevoVentasResumidos = isPermisoNuevoVentasResumidos;
	}

	public Boolean getIsPermisoActualizarVentasResumidos() {
		return isPermisoActualizarVentasResumidos;
	}

	public void setIsPermisoActualizarVentasResumidos(Boolean isPermisoActualizarVentasResumidos) {
		this.isPermisoActualizarVentasResumidos = isPermisoActualizarVentasResumidos;
	}

	public Boolean getIsPermisoEliminarVentasResumidos() {
		return isPermisoEliminarVentasResumidos;
	}

	public void setIsPermisoEliminarVentasResumidos(Boolean isPermisoEliminarVentasResumidos) {
		this.isPermisoEliminarVentasResumidos = isPermisoEliminarVentasResumidos;
	}

	public Boolean getIsPermisoGuardarCambiosVentasResumidos() {
		return isPermisoGuardarCambiosVentasResumidos;
	}

	public void setIsPermisoGuardarCambiosVentasResumidos(Boolean isPermisoGuardarCambiosVentasResumidos) {
		this.isPermisoGuardarCambiosVentasResumidos = isPermisoGuardarCambiosVentasResumidos;
	}
	
	public Boolean getIsPermisoConsultaVentasResumidos() {
		return isPermisoConsultaVentasResumidos;
	}

	public void setIsPermisoConsultaVentasResumidos(Boolean isPermisoConsultaVentasResumidos) {
		this.isPermisoConsultaVentasResumidos = isPermisoConsultaVentasResumidos;
	}

	public Boolean getIsPermisoBusquedaVentasResumidos() {
		return isPermisoBusquedaVentasResumidos;
	}

	public void setIsPermisoBusquedaVentasResumidos(Boolean isPermisoBusquedaVentasResumidos) {
		this.isPermisoBusquedaVentasResumidos = isPermisoBusquedaVentasResumidos;
	}

	public Boolean getIsPermisoReporteVentasResumidos() {
		return isPermisoReporteVentasResumidos;
	}

	public void setIsPermisoReporteVentasResumidos(Boolean isPermisoReporteVentasResumidos) {
		this.isPermisoReporteVentasResumidos = isPermisoReporteVentasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasResumidos() {
		return isPermisoPaginacionMedioVentasResumidos;
	}

	public void setIsPermisoPaginacionMedioVentasResumidos(Boolean isPermisoPaginacionMedioVentasResumidos) {
		this.isPermisoPaginacionMedioVentasResumidos = isPermisoPaginacionMedioVentasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasResumidos() {
		return isPermisoPaginacionTodoVentasResumidos;
	}

	public void setIsPermisoPaginacionTodoVentasResumidos(Boolean isPermisoPaginacionTodoVentasResumidos) {
		this.isPermisoPaginacionTodoVentasResumidos = isPermisoPaginacionTodoVentasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasResumidos() {
		return isPermisoPaginacionAltoVentasResumidos;
	}

	public void setIsPermisoPaginacionAltoVentasResumidos(Boolean isPermisoPaginacionAltoVentasResumidos) {
		this.isPermisoPaginacionAltoVentasResumidos = isPermisoPaginacionAltoVentasResumidos;
	}
	
	public Boolean getIsPermisoCopiarVentasResumidos() {
		return isPermisoCopiarVentasResumidos;
	}

	public void setIsPermisoCopiarVentasResumidos(Boolean isPermisoCopiarVentasResumidos) {
		this.isPermisoCopiarVentasResumidos = isPermisoCopiarVentasResumidos;
	}
	
	public Boolean getIsPermisoVerFormVentasResumidos() {
		return isPermisoVerFormVentasResumidos;
	}

	public void setIsPermisoVerFormVentasResumidos(Boolean isPermisoVerFormVentasResumidos) {
		this.isPermisoVerFormVentasResumidos = isPermisoVerFormVentasResumidos;
	}
	
	public Boolean getIsPermisoDuplicarVentasResumidos() {
		return isPermisoDuplicarVentasResumidos;
	}

	public void setIsPermisoDuplicarVentasResumidos(Boolean isPermisoDuplicarVentasResumidos) {
		this.isPermisoDuplicarVentasResumidos = isPermisoDuplicarVentasResumidos;
	}
	
	public Boolean getIsPermisoOrdenVentasResumidos() {
		return isPermisoOrdenVentasResumidos;
	}

	public void setIsPermisoOrdenVentasResumidos(Boolean isPermisoOrdenVentasResumidos) {
		this.isPermisoOrdenVentasResumidos = isPermisoOrdenVentasResumidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasResumidos() {
		return isVisibilidadCeldaNuevoVentasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoVentasResumidos(Boolean isVisibilidadCeldaNuevoVentasResumidos) {
		this.isVisibilidadCeldaNuevoVentasResumidos = isVisibilidadCeldaNuevoVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasResumidos() {
		return isVisibilidadCeldaDuplicarVentasResumidos;
	}

	public void setIsVisibilidadCeldaDuplicarVentasResumidos(Boolean isVisibilidadCeldaDuplicarVentasResumidos) {
		this.isVisibilidadCeldaDuplicarVentasResumidos = isVisibilidadCeldaDuplicarVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasResumidos() {
		return isVisibilidadCeldaCopiarVentasResumidos;
	}

	public void setIsVisibilidadCeldaCopiarVentasResumidos(Boolean isVisibilidadCeldaCopiarVentasResumidos) {
		this.isVisibilidadCeldaCopiarVentasResumidos = isVisibilidadCeldaCopiarVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasResumidos() {
		return isVisibilidadCeldaVerFormVentasResumidos;
	}

	public void setIsVisibilidadCeldaVerFormVentasResumidos(Boolean isVisibilidadCeldaVerFormVentasResumidos) {
		this.isVisibilidadCeldaVerFormVentasResumidos = isVisibilidadCeldaVerFormVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasResumidos() {
		return isVisibilidadCeldaOrdenVentasResumidos;
	}

	public void setIsVisibilidadCeldaOrdenVentasResumidos(Boolean isVisibilidadCeldaOrdenVentasResumidos) {
		this.isVisibilidadCeldaOrdenVentasResumidos = isVisibilidadCeldaOrdenVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasResumidos() {
		return isVisibilidadCeldaNuevoRelacionesVentasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasResumidos(Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidos) {
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidos = isVisibilidadCeldaNuevoRelacionesVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasResumidos() {
		return isVisibilidadCeldaModificarVentasResumidos;
	}

	public void setIsVisibilidadCeldaModificarVentasResumidos(Boolean isVisibilidadCeldaModificarVentasResumidos) {
		this.isVisibilidadCeldaModificarVentasResumidos = isVisibilidadCeldaModificarVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasResumidos() {
		return isVisibilidadCeldaActualizarVentasResumidos;
	}

	public void setIsVisibilidadCeldaActualizarVentasResumidos(Boolean isVisibilidadCeldaActualizarVentasResumidos) {
		this.isVisibilidadCeldaActualizarVentasResumidos = isVisibilidadCeldaActualizarVentasResumidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasResumidos() {
		return isVisibilidadCeldaEliminarVentasResumidos;
	}

	public void setIsVisibilidadCeldaEliminarVentasResumidos(Boolean isVisibilidadCeldaEliminarVentasResumidos) {
		this.isVisibilidadCeldaEliminarVentasResumidos = isVisibilidadCeldaEliminarVentasResumidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasResumidos() {
		return isVisibilidadCeldaCancelarVentasResumidos;
	}

	public void setIsVisibilidadCeldaCancelarVentasResumidos(Boolean isVisibilidadCeldaCancelarVentasResumidos) {
		this.isVisibilidadCeldaCancelarVentasResumidos = isVisibilidadCeldaCancelarVentasResumidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasResumidos() {
		return isVisibilidadCeldaGuardarVentasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarVentasResumidos(Boolean isVisibilidadCeldaGuardarVentasResumidos) {
		this.isVisibilidadCeldaGuardarVentasResumidos = isVisibilidadCeldaGuardarVentasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasResumidos() {
		return isVisibilidadCeldaGuardarCambiosVentasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasResumidos(Boolean isVisibilidadCeldaGuardarCambiosVentasResumidos) {
		this.isVisibilidadCeldaGuardarCambiosVentasResumidos = isVisibilidadCeldaGuardarCambiosVentasResumidos;
	}
		
	public VentasResumidosSessionBean getventasresumidosSessionBean() {
		return this.ventasresumidosSessionBean;
	}
	
	public void setventasresumidosSessionBean(VentasResumidosSessionBean ventasresumidosSessionBean) {
		this.ventasresumidosSessionBean=ventasresumidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasResumidos() {
		return this.isVisibilidadBusquedaVentasResumidos;
	}

	public void setisVisibilidadBusquedaVentasResumidos(Boolean isVisibilidadBusquedaVentasResumidos) {
		this.isVisibilidadBusquedaVentasResumidos=isVisibilidadBusquedaVentasResumidos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(VentasResumidos ventasresumidos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventasresumidos,null);
				this.setActualParaGuardarSucursalForeignKey(ventasresumidos,null);
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
	
	public void bugActualizarReferenciaActual(VentasResumidos ventasresumidos,VentasResumidos ventasresumidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasResumidos(ventasresumidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventasresumidosAux.setId(ventasresumidos.getId());
		ventasresumidosAux.setVersionRow(ventasresumidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasResumidos ventasresumidosLocal) throws Exception {
		
		if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasResumidos ventasresumidosLocal) throws Exception {	
		if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventasresumidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventasresumidosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasResumidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventasresumidosValidator.getInvalidValues(this.ventasresumidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasResumidos ventasresumidos,List<VentasResumidos> ventasresumidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasResumidos ventasresumidos,List<VentasResumidos> ventasresumidoss) throws Exception {
		try	{			
			VentasResumidosConstantesFunciones.actualizarSelectedLista(ventasresumidos,ventasresumidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasResumidos> ventasresumidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventasresumidossLocal=this.ventasresumidosLogic.getVentasResumidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventasresumidossLocal=this.ventasresumidoss;
			}
			//ARCHITECTURE
		
			for(VentasResumidos ventasresumidosLocal:ventasresumidossLocal) {
				if(this.permiteMantenimiento(ventasresumidosLocal) && ventasresumidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasResumidosConstantesFunciones.getVentasResumidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_completoVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelrucVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_productoVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelcantidadVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelprecioVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelmontoVentasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelcodigo_productoVentasResumidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_completoVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelrucVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_productoVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelcantidadVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelprecioVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelmontoVentasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidos.jLabelcodigo_productoVentasResumidos,"");
		
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
		this.iIdNuevoVentasResumidos--;	
		
		
		this.ventasresumidosAux=new VentasResumidos();
		
		this.ventasresumidosAux.setId(this.iIdNuevoVentasResumidos);
		this.ventasresumidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidosLogic.getVentasResumidoss().add(this.ventasresumidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventasresumidoss.add(this.ventasresumidosAux);
		}
		//ARCHITECTURE
		
		this.ventasresumidos=this.ventasresumidosAux;
		
		if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasResumidos(this.ventasresumidos);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidos(this.ventasresumidos);
		}
				
		//this.setDefaultControlesVentasResumidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasResumidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasResumidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidos(this.ventasresumidosBean,this.ventasresumidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasResumidos(this.ventasresumidosReturnGeneral,this.ventasresumidosBean,false);
		
		if(this.ventasresumidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos());
		}
		
		if(this.ventasresumidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos(),classes);//this.ventasresumidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasResumidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasResumidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasResumidosBeanSwingJInternalFrameAdditional.RecargarFormVentasResumidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasResumidos(false);
						
			if(ventasresumidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidos();
			}
			
			this.actualizarVisualTableDatosVentasResumidos();
			
			this.jTableDatosVentasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidos(), this.getIndiceNuevoVentasResumidos());
			
			this.seleccionarFilaTablaVentasResumidosActual();
						
			this.actualizarEstadoCeldasBotonesVentasResumidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasResumidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_desdeVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarfecha_emision_desdeVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_hastaVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarfecha_emision_hastaVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarnombre_completoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarrucVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarnombre_productoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarcantidadVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarprecioVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarmontoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarcodigo_productoVentasResumidos);	
		//
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarid_empresaVentasResumidos);//
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setEnabled(isHabilitar && this.ventasresumidosConstantesFunciones.activarid_sucursalVentasResumidos);
	};
	
	public void setDefaultControlesVentasResumidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasResumidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventasresumidosSessionBean.setConGuardarRelaciones(true);			
			this.ventasresumidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.setVisible(true);
			
					
		} else {
			//this.ventasresumidosSessionBean.setConGuardarRelaciones(false);			
			this.ventasresumidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasResumidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
				if(ventasresumidosAux.getId().equals(this.iIdNuevoVentasResumidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidoss) {
				if(ventasresumidosAux.getId().equals(this.iIdNuevoVentasResumidos)) {
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
	
	public int getIndiceActualVentasResumidos(VentasResumidos ventasresumidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
				if(ventasresumidosAux.getId().equals(ventasresumidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidoss) {
				if(ventasresumidosAux.getId().equals(ventasresumidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasResumidos(VentasResumidos ventasresumidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
				if(ventasresumidosAux.getVentasResumidosOriginal().getId().equals(ventasresumidosOriginal.getId())) {
					existe=true;
					ventasresumidosOriginal.setId(ventasresumidosAux.getId());
					ventasresumidosOriginal.setVersionRow(ventasresumidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidos ventasresumidosAux:this.ventasresumidoss) {
				if(ventasresumidosAux.getVentasResumidosOriginal().getId().equals(ventasresumidosOriginal.getId())) {
					existe=true;
					ventasresumidosOriginal.setId(ventasresumidosAux.getId());
					ventasresumidosOriginal.setVersionRow(ventasresumidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasResumidos(Boolean esParaCancelar) throws Exception {
		ventasresumidossAux=new ArrayList<VentasResumidos>();
		ventasresumidosAux=new VentasResumidos();
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
					if(ventasresumidosAux.getId()<0) {
						ventasresumidossAux.add(ventasresumidosAux);
					}		
				}
				this.iIdNuevoVentasResumidos=0L;
				this.ventasresumidosLogic.getVentasResumidoss().removeAll(ventasresumidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidos ventasresumidosAux:this.ventasresumidoss) {
					if(ventasresumidosAux.getId()<0) {
						ventasresumidossAux.add(ventasresumidosAux);
					}		
				}
				this.iIdNuevoVentasResumidos=0L;
				this.ventasresumidoss.removeAll(ventasresumidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasResumidos 
					&& this.ventasresumidosLogic.getVentasResumidoss().size()>0
					) {
					ventasresumidosAux=this.ventasresumidosLogic.getVentasResumidoss().get(this.ventasresumidosLogic.getVentasResumidoss().size() - 1);
				
					if(ventasresumidosAux.getId()<0) {
						this.ventasresumidosLogic.getVentasResumidoss().remove(ventasresumidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasResumidos && this.ventasresumidoss.size()>0) {
					ventasresumidosAux=this.ventasresumidoss.get(this.ventasresumidoss.size() - 1);
				
					if(ventasresumidosAux.getId()<0) {
						this.ventasresumidoss.remove(ventasresumidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasResumidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventasresumidos.getId()<0) {
				this.ventasresumidosLogic.getVentasResumidoss().remove(this.ventasresumidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventasresumidos.getId()<0) {
				this.ventasresumidoss.remove(this.ventasresumidos);
			}
		}			
	}
	
	public void setEstadosInicialesVentasResumidos(List<VentasResumidos> ventasresumidossAux) throws Exception {
		VentasResumidosConstantesFunciones.setEstadosInicialesVentasResumidos(ventasresumidossAux);
	}
	
	public void setEstadosInicialesVentasResumidos(VentasResumidos ventasresumidosAux) throws Exception {
		VentasResumidosConstantesFunciones.setEstadosInicialesVentasResumidos(ventasresumidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasResumidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasResumidosActual()) {
				if(!this.isEsNuevoVentasResumidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasResumidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasResumidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Resumidos ?", "MANTENIMIENTO DE Ventas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasResumidos ventasresumidos) throws Exception {
		VentasResumidosConstantesFunciones.seleccionarAsignar(this.ventasresumidos,ventasresumidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasResumidos=this.isPermisoActualizarOriginalVentasResumidos;
			
			
			this.seleccionarAsignar(ventasresumidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventasresumidosSessionBean.setsFuncionBusquedaRapida(this.ventasresumidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasResumidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasResumidos(esParaCancelar);				
				this.cancelarNuevoVentasResumidos(esParaCancelar);								
			}
			
			this.ventasresumidos=new VentasResumidos();
			
			this.inicializarVentasResumidos();
			
			this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasResumidos() throws Exception {
		try {
			VentasResumidosConstantesFunciones.inicializarVentasResumidos(this.ventasresumidos);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventasresumidosLogic.getVentasResumidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasResumidoss(String sAccionBusqueda,List<VentasResumidos> ventasresumidossParaReportes) throws Exception {
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
					sPathReporteFinal="VentasResumidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasResumidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasResumidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasResumidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Resumidoses");		
		parameters.put("busquedapor", VentasResumidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasResumidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasResumidos=new JRBeanArrayDataSource(VentasResumidosJInternalFrame.TraerVentasResumidosBeans(ventasresumidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasResumidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasResumidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasResumidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasResumidosBean.TraerVentasResumidosBeans(ventasresumidossParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasResumidosActionPerformed(null);
					//this.generarExcelReporteVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasResumidoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidos> ventasresumidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasResumidos ventasresumidos : ventasresumidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasResumidosConstantesFunciones.generarExcelReporteDataVentasResumidos("NORMAL",row,workbook,ventasresumidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasResumidos(String sTipo,Row row,Workbook workbook) {
		
		VentasResumidosConstantesFunciones.generarExcelReporteHeaderVentasResumidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidos> ventasresumidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasResumidos ventasresumidos : ventasresumidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasResumidosConstantesFunciones.getVentasResumidosDescripcion(ventasresumidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidos.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidos> ventasresumidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasResumidos> ventasresumidossRespaldo=null;
		
		classes=VentasResumidosConstantesFunciones.getClassesRelationshipsOfVentasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventasresumidosLogic.setDatosCliente(this.datosCliente);
		this.ventasresumidosLogic.setDatosDeep(this.datosDeep);
		this.ventasresumidosLogic.setIsConDeep(true);
		
		ventasresumidossRespaldo=this.ventasresumidosLogic.getVentasResumidoss();
		
		this.ventasresumidosLogic.setVentasResumidoss(ventasresumidossParaReportes);	
		this.ventasresumidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventasresumidossParaReportes=this.ventasresumidosLogic.getVentasResumidoss();
		this.ventasresumidosLogic.setVentasResumidoss(ventasresumidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasResumidos ventasresumidos : ventasresumidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasResumidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasResumidosConstantesFunciones.generarExcelReporteDataVentasResumidos("NORMAL",row,workbook,ventasresumidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasResumidosConstantesFunciones.getVentasResumidosDescripcion(ventasresumidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasResumidos() throws Exception {		
		this.startProcessVentasResumidos(true);
	}
	
	public void startProcessVentasResumidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasResumidos ,this.jPanelParametrosReportesVentasResumidos, this.jScrollPanelDatosVentasResumidos,this.jPanelPaginacionVentasResumidos, this.jScrollPanelDatosEdicionVentasResumidos, this.jPanelAccionesVentasResumidos,this.jPanelAccionesFormularioVentasResumidos,this.jmenuBarVentasResumidos,this.jmenuBarDetalleVentasResumidos,this.jTtoolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidos=this.jTabbedPaneBusquedasVentasResumidos; 
		
		final JPanel jPanelParametrosReportesVentasResumidos=this.jPanelParametrosReportesVentasResumidos;
		//final JScrollPane jScrollPanelDatosVentasResumidos=this.jScrollPanelDatosVentasResumidos;
		final JTable jTableDatosVentasResumidos=this.jTableDatosVentasResumidos;		
		final JPanel jPanelPaginacionVentasResumidos=this.jPanelPaginacionVentasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidos=this.jScrollPanelDatosEdicionVentasResumidos;
		final JPanel jPanelAccionesVentasResumidos=this.jPanelAccionesVentasResumidos;
		
		JPanel jPanelCamposAuxiliarVentasResumidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			jPanelCamposAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jPanelCamposVentasResumidos;
			jPanelAccionesFormularioAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jPanelAccionesFormularioVentasResumidos;
		}
		
		final JPanel jPanelCamposVentasResumidos=jPanelCamposAuxiliarVentasResumidos;
		final JPanel jPanelAccionesFormularioVentasResumidos=jPanelAccionesFormularioAuxiliarVentasResumidos;
		
		
		final JMenuBar jmenuBarVentasResumidos=this.jmenuBarVentasResumidos;
		final JToolBar jTtoolBarVentasResumidos=this.jTtoolBarVentasResumidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			jmenuBarDetalleAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jmenuBarDetalleVentasResumidos;
			jTtoolBarDetalleAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jTtoolBarDetalleVentasResumidos;
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidos=jmenuBarDetalleAuxiliarVentasResumidos;
		final JToolBar jTtoolBarDetalleVentasResumidos=jTtoolBarDetalleAuxiliarVentasResumidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidos;
			processRunnable.jTableDatos=jTableDatosVentasResumidos;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidos;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidos ,jPanelParametrosReportesVentasResumidos,jTableDatosVentasResumidos, /*jScrollPanelDatosVentasResumidos,*/jPanelCamposVentasResumidos,jPanelPaginacionVentasResumidos, /*jScrollPanelDatosEdicionVentasResumidos,*/ jPanelAccionesVentasResumidos,jPanelAccionesFormularioVentasResumidos,jmenuBarVentasResumidos,jmenuBarDetalleVentasResumidos,jTtoolBarVentasResumidos,jTtoolBarDetalleVentasResumidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidos ,jPanelParametrosReportesVentasResumidos, jScrollPanelDatosVentasResumidos,jPanelPaginacionVentasResumidos, jScrollPanelDatosEdicionVentasResumidos, jPanelAccionesVentasResumidos,jPanelAccionesFormularioVentasResumidos,jmenuBarVentasResumidos,jmenuBarDetalleVentasResumidos,jTtoolBarVentasResumidos,jTtoolBarDetalleVentasResumidos);
						
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
	
	public void finishProcessVentasResumidos() {// throws Exception 
		this.finishProcessVentasResumidos(true);
	}
	
	public void finishProcessVentasResumidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasResumidos ,this.jPanelParametrosReportesVentasResumidos, this.jScrollPanelDatosVentasResumidos,this.jPanelPaginacionVentasResumidos, this.jScrollPanelDatosEdicionVentasResumidos, this.jPanelAccionesVentasResumidos,this.jPanelAccionesFormularioVentasResumidos,this.jmenuBarVentasResumidos,this.jmenuBarDetalleVentasResumidos,this.jTtoolBarVentasResumidos,this.jTtoolBarDetalleVentasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidos=this.jTabbedPaneBusquedasVentasResumidos; 
		
		final JPanel jPanelParametrosReportesVentasResumidos=this.jPanelParametrosReportesVentasResumidos;
		//final JScrollPane jScrollPanelDatosVentasResumidos=this.jScrollPanelDatosVentasResumidos;
		final JTable jTableDatosVentasResumidos=this.jTableDatosVentasResumidos;		
		final JPanel jPanelPaginacionVentasResumidos=this.jPanelPaginacionVentasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidos=this.jScrollPanelDatosEdicionVentasResumidos;
		final JPanel jPanelAccionesVentasResumidos=this.jPanelAccionesVentasResumidos;
		
		JPanel jPanelCamposAuxiliarVentasResumidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			jPanelCamposAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jPanelCamposVentasResumidos;
			jPanelAccionesFormularioAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jPanelAccionesFormularioVentasResumidos;
		}
		
		final JPanel jPanelCamposVentasResumidos=jPanelCamposAuxiliarVentasResumidos;
		final JPanel jPanelAccionesFormularioVentasResumidos=jPanelAccionesFormularioAuxiliarVentasResumidos;
		
		
		final JMenuBar jmenuBarVentasResumidos=this.jmenuBarVentasResumidos;		
		final JToolBar jTtoolBarVentasResumidos=this.jTtoolBarVentasResumidos;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			jmenuBarDetalleAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jmenuBarDetalleVentasResumidos;
			jTtoolBarDetalleAuxiliarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jTtoolBarDetalleVentasResumidos;		
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidos=jmenuBarDetalleAuxiliarVentasResumidos;
		final JToolBar jTtoolBarDetalleVentasResumidos=jTtoolBarDetalleAuxiliarVentasResumidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidos;
			processRunnable.jTableDatos=jTableDatosVentasResumidos;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidos;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasResumidos ,jPanelParametrosReportesVentasResumidos, jTableDatosVentasResumidos,/*jScrollPanelDatosVentasResumidos,*/jPanelCamposVentasResumidos,jPanelPaginacionVentasResumidos, /*jScrollPanelDatosEdicionVentasResumidos,*/ jPanelAccionesVentasResumidos,jPanelAccionesFormularioVentasResumidos,jmenuBarVentasResumidos,jmenuBarDetalleVentasResumidos,jTtoolBarVentasResumidos,jTtoolBarDetalleVentasResumidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasResumidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasResumidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasResumidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasResumidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventasresumidosConstantesFunciones.getsFinalQueryVentasResumidos();
		String  finalQueryPaginacionTodos=this.ventasresumidosConstantesFunciones.getsFinalQueryVentasResumidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasResumidosConstantesFunciones.getArrayColumnasGlobalesNoVentasResumidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasResumidosConstantesFunciones.getArrayColumnasGlobalesVentasResumidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasResumidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventasresumidossEliminados= new ArrayList<VentasResumidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasResumidos();
		
				///*VentasResumidosSessionBean*/this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
			
			if(this.ventasresumidosSessionBean==null) {
				this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
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
					this.iNumeroPaginacion=VentasResumidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasResumidosConstantesFunciones.getClassesForeignKeysOfVentasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventasresumidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventasresumidossAux= new ArrayList<VentasResumidos>();
			
				
			ventasresumidosLogic.setDatosCliente(this.datosCliente);
			ventasresumidosLogic.setDatosDeep(this.datosDeep);
			ventasresumidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasResumidos")) {
				this.sDetalleReporte=VentasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidos(fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventasresumidosLogic.getVentasResumidossBusquedaVentasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidos(fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidos(fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventasresumidosLogic.getVentasResumidoss()==null||ventasresumidosLogic.getVentasResumidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventasresumidoss==null|| ventasresumidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidossAux=new ArrayList<VentasResumidos>();
						ventasresumidossAux.addAll(ventasresumidosLogic.getVentasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidossAux=new ArrayList<VentasResumidos>();
							ventasresumidossAux.addAll(ventasresumidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventasresumidosLogic.getVentasResumidossBusquedaVentasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidos(fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidos(fecha_emision_desdeBusquedaVentasResumidos,fecha_emision_hastaBusquedaVentasResumidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasResumidoss("BusquedaVentasResumidos",ventasresumidosLogic.getVentasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasResumidoss("BusquedaVentasResumidos",ventasresumidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosLogic.setVentasResumidoss(new ArrayList<VentasResumidos>());
						ventasresumidosLogic.getVentasResumidoss().addAll(ventasresumidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidoss=new ArrayList<VentasResumidos>();
							ventasresumidoss.addAll(ventasresumidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasResumidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasResumidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidosLogic.getVentasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidosLogic.getVentasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasResumidos ventasresumidos) {
		Boolean permite=true;
		
		if(this.ventasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasResumidosConstantesFunciones.getOrderByListaVentasResumidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasResumidosConstantesFunciones.getOrderByListaVentasResumidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidos ventasresumidos:ventasresumidosLogic.getVentasResumidoss()) {
				if(ventasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosTotales=ventasresumidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidos ventasresumidos:this.ventasresumidoss) {
				if(ventasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosTotales=ventasresumidos;
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
			this.ventasresumidosAux=new VentasResumidos();
			this.ventasresumidosAux.setsType(Constantes2.S_TOTALES);
			this.ventasresumidosAux.setIsNew(false);
			this.ventasresumidosAux.setIsChanged(false);
			this.ventasresumidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasResumidosConstantesFunciones.TotalizarValoresFilaVentasResumidos(this.ventasresumidosLogic.getVentasResumidoss(),this.ventasresumidosAux);
				
				//this.ventasresumidosLogic.getVentasResumidoss().add(this.ventasresumidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasResumidosConstantesFunciones.TotalizarValoresFilaVentasResumidos(this.ventasresumidoss,this.ventasresumidosAux);
				
				this.ventasresumidoss.add(this.ventasresumidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventasresumidosTotales=new VentasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidosLogic.getVentasResumidoss().remove(ventasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidoss.remove(ventasresumidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventasresumidosTotales=new VentasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidos ventasresumidos:ventasresumidosLogic.getVentasResumidoss()) {
				if(ventasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosTotales=ventasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidosConstantesFunciones.TotalizarValoresFilaVentasResumidos(this.ventasresumidosLogic.getVentasResumidoss(),ventasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidos ventasresumidos:this.ventasresumidoss) {
				if(ventasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosTotales=ventasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidosConstantesFunciones.TotalizarValoresFilaVentasResumidos(this.ventasresumidoss,ventasresumidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasResumidossBusquedaVentasResumidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasResumidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasResumidossBusquedaVentasResumidos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidosLogic.getVentasResumidossBusquedaVentasResumidos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidosLogic.getVentasResumidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidosLogic.getVentasResumidossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVentasResumidos() {
		this.isPermisoTodoVentasResumidos=false;
		this.isPermisoNuevoVentasResumidos=false;
		this.isPermisoActualizarVentasResumidos=false;
		this.isPermisoActualizarOriginalVentasResumidos=false;
		this.isPermisoEliminarVentasResumidos=false;
		this.isPermisoGuardarCambiosVentasResumidos=false;
		this.isPermisoConsultaVentasResumidos=true;
		this.isPermisoBusquedaVentasResumidos=true;
		this.isPermisoReporteVentasResumidos=true;
		this.isPermisoOrdenVentasResumidos=false;		
		this.isPermisoPaginacionMedioVentasResumidos=false;		
		this.isPermisoPaginacionAltoVentasResumidos=false;		
		this.isPermisoPaginacionTodoVentasResumidos=false;		
		this.isPermisoCopiarVentasResumidos=false;		
		this.isPermisoVerFormVentasResumidos=false;		
		this.isPermisoDuplicarVentasResumidos=false;
		this.isPermisoOrdenVentasResumidos=false;
	}
	
	public void setPermisosUsuarioVentasResumidos(Boolean isPermiso) {
		this.isPermisoTodoVentasResumidos=isPermiso;
		this.isPermisoNuevoVentasResumidos=isPermiso;
		this.isPermisoActualizarVentasResumidos=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidos=isPermiso;
		this.isPermisoEliminarVentasResumidos=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidos=isPermiso;
		this.isPermisoConsultaVentasResumidos=isPermiso;
		this.isPermisoBusquedaVentasResumidos=isPermiso;
		this.isPermisoReporteVentasResumidos=isPermiso;
		this.isPermisoOrdenVentasResumidos=isPermiso;		
		this.isPermisoPaginacionMedioVentasResumidos=isPermiso;		
		this.isPermisoPaginacionAltoVentasResumidos=isPermiso;		
		this.isPermisoPaginacionTodoVentasResumidos=isPermiso;		
		this.isPermisoCopiarVentasResumidos=isPermiso;		
		this.isPermisoVerFormVentasResumidos=isPermiso;		
		this.isPermisoDuplicarVentasResumidos=isPermiso;
		this.isPermisoOrdenVentasResumidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasResumidos(Boolean isPermiso) {
		//this.isPermisoTodoVentasResumidos=isPermiso;
		this.isPermisoNuevoVentasResumidos=isPermiso;
		this.isPermisoActualizarVentasResumidos=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidos=isPermiso;
		this.isPermisoEliminarVentasResumidos=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidos=isPermiso;
		//this.isPermisoConsultaVentasResumidos=isPermiso;
		//this.isPermisoBusquedaVentasResumidos=isPermiso;
		//this.isPermisoReporteVentasResumidos=isPermiso;
		//this.isPermisoOrdenVentasResumidos=isPermiso;		
		//this.isPermisoPaginacionMedioVentasResumidos=isPermiso;		
		//this.isPermisoPaginacionAltoVentasResumidos=isPermiso;		
		//this.isPermisoPaginacionTodoVentasResumidos=isPermiso;		
		//this.isPermisoCopiarVentasResumidos=isPermiso;		
		//this.isPermisoDuplicarVentasResumidos=isPermiso;
		//this.isPermisoOrdenVentasResumidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasResumidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasResumidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasResumidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasResumidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasResumidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasResumidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasResumidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasResumidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasResumidos=this.isPermisoActualizarVentasResumidos;
			this.isPermisoEliminarVentasResumidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasResumidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasResumidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasResumidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasResumidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasResumidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasResumidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasResumidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasResumidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasResumidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasResumidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasResumidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasResumidos.setToolTipText(this.jTableDatosVentasResumidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasResumidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasResumidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasResumidos() throws Exception {
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
	public void inicializarCombosForeignKeyVentasResumidosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasResumidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasResumidosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasResumidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventasresumidosSessionBean==null) {
				this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
			}

			if(!this.ventasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyVentasResumidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasResumidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasResumidos(VentasResumidos ventasresumidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasResumidos(VentasResumidos ventasresumidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasResumidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasResumidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasResumidos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasResumidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VentasResumidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasResumidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasResumidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventasresumidosSessionBean=new VentasResumidosSessionBean(); 
		this.ventasresumidosConstantesFunciones=new VentasResumidosConstantesFunciones(); 
		this.ventasresumidosBean=new VentasResumidos();//(this.ventasresumidosConstantesFunciones); 		
		this.ventasresumidosReturnGeneral=new VentasResumidosParameterReturnGeneral(); 
		
		this.ventasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasResumidos(true);
			
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
			
			this.ventasresumidosConstantesFunciones=new VentasResumidosConstantesFunciones(); 
			this.ventasresumidosBean=new VentasResumidos();//this.ventasresumidosConstantesFunciones); 			
			this.ventasresumidosReturnGeneral=new VentasResumidosParameterReturnGeneral(); 
		
			VentasResumidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventasresumidos=new VentasResumidos();
			this.ventasresumidoss = new ArrayList<VentasResumidos>();
			this.ventasresumidossAux = new ArrayList<VentasResumidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic=new VentasResumidosLogic();
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.ventasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasResumidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidos);	
					}
					
					if(this.jInternalFrameImportacionVentasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasResumidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidos);
				this.jInternalFrameDetalleFormVentasResumidos.setVisible(false);
				this.jInternalFrameDetalleFormVentasResumidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidos);
					this.jInternalFrameReporteDinamicoVentasResumidos.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasResumidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidos);
					this.jInternalFrameImportacionVentasResumidos.setVisible(false);
					this.jInternalFrameImportacionVentasResumidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidos);
					this.jInternalFrameOrderByVentasResumidos.setVisible(false);
					this.jInternalFrameOrderByVentasResumidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasResumidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasResumidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventasresumidosReturnGeneral=new VentasResumidosParameterReturnGeneral();
			
			this.ventasresumidosParameterGeneral=new VentasResumidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventasresumidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),this.ventasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),this.ventasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaDuplicarVentasResumidos=true;
			this.isVisibilidadCeldaCopiarVentasResumidos=true;
			this.isVisibilidadCeldaVerFormVentasResumidos=true;
			this.isVisibilidadCeldaOrdenVentasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=false;
			this.isVisibilidadCeldaGuardarVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			
			
			this.isVisibilidadBusquedaVentasResumidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasResumidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasResumidos(false);
			
			this.setPermisosUsuarioVentasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado() 
				|| (this.ventasresumidosSessionBean.getEsGuardarRelacionado() && this.ventasresumidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasResumidosClasesRelacionadas();
			}
			
			if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasResumidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasResumidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasResumidos();
			}
			
			if(!this.isPermisoBusquedaVentasResumidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasResumidosConstantesFunciones.getTiposSeleccionarVentasResumidos());
				
				this.tiposColumnasSelect=VentasResumidosConstantesFunciones.getTiposSeleccionarVentasResumidos(true);
				
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
			//if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasResumidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasResumidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasResumidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidos() ;
			
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
				ventasresumidosImplementable= (VentasResumidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventasresumidosImplementableHome= (VentasResumidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventasresumidoss= new ArrayList<VentasResumidos>();
			this.ventasresumidossEliminados= new ArrayList<VentasResumidos>();
						
			this.isEsNuevoVentasResumidos=false;
			this.esParaAccionDesdeFormularioVentasResumidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasResumidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasResumidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasResumidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasResumidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasResumidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasResumidos();
			}
			
			VentasResumidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasResumidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasResumidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasResumidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasResumidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasResumidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasResumidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasResumidos")) {
				iIndex=this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasResumidos();	
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
	
	public void cargarCombosForeignKeyVentasResumidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasResumidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasResumidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasResumidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasResumidos();
		
		this.cargarCombosFrameForeignKeyVentasResumidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasResumidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasResumidos();
		}
	}
	
	
	
	public void jButtonNuevoVentasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			
			if(jTableDatosVentasResumidos.getRowCount()>=1) {
				jTableDatosVentasResumidos.removeRowSelectionInterval(0, jTableDatosVentasResumidos.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasResumidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasResumidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasResumidos(true);			
			//this.ventasresumidos=new VentasResumidos();
			//this.ventasresumidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidos() ;
			
			if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventasresumidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);				
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasResumidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasResumidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasResumidos.getSelectedRows().length;			
			}
			
			ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasResumidos--;			
				//VentasResumidos ventasresumidosAux= new VentasResumidos();			
				//ventasresumidosAux.setId(this.iIdNuevoVentasResumidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasResumidos ventasresumidosOrigen=new VentasResumidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasResumidos ventasresumidosOrigen : ventasresumidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventasresumidosOrigen =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidosOrigen =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasResumidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventasresumidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasResumidos(ventasresumidosOrigen,this.ventasresumidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidosLogic.getVentasResumidoss().add(this.ventasresumidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidoss.add(this.ventasresumidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasResumidos(false);
				
				this.jTableDatosVentasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidos(), this.getIndiceNuevoVentasResumidos());
				
				int iLastRow =  this.jTableDatosVentasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();									
		
			VentasResumidos ventasresumidosOrigen=new VentasResumidos();
			VentasResumidos ventasresumidosDestino=new VentasResumidos();
				
			ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasResumidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventasresumidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasResumidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosOrigen =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidosOrigen =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosDestino =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidosDestino =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventasresumidosOrigen =ventasresumidossSeleccionados.get(0);
				ventasresumidosDestino =ventasresumidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasResumidos(ventasresumidosOrigen,ventasresumidosDestino,true,false);
				
				ventasresumidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventasresumidosDestino,ventasresumidosLogic.getVentasResumidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventasresumidosDestino,ventasresumidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasResumidos(false);
				
				//this.jTableDatosVentasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidos(), this.getIndiceNuevoVentasResumidos());
				
				int iLastRow =  this.jTableDatosVentasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasResumidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasResumidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasResumidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasResumidos.setVisible(!isVisible);
			this.jPanelPaginacionVentasResumidos.setVisible(!isVisible);
			this.jPanelAccionesVentasResumidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasResumidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasResumidos();
			
			this.abrirFrameOrderByVentasResumidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasResumidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasResumidos.isMaximum()) {
					this.jInternalFrameDetalleFormVentasResumidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasResumidos.setSize(this.jInternalFrameDetalleFormVentasResumidos.iWidthFormulario,this.jInternalFrameDetalleFormVentasResumidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasResumidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasResumidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasResumidos.isMaximum()) {
						this.jInternalFrameDetalleFormVentasResumidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidos.jContentPaneDetalleVentasResumidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidos.jContentPaneDetalleVentasResumidos.getWidth(),VentasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidos.jContentPaneDetalleVentasResumidos.getWidth(),VentasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidos.jContentPaneDetalleVentasResumidos.getWidth(),VentasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasResumidos.setVisible(true);
	        this.jInternalFrameDetalleFormVentasResumidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasResumidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidos,false,this);
				} else {
					this.jInternalFrameOrderByVentasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidos);
				this.jInternalFrameOrderByVentasResumidos.setVisible(false);
				this.jInternalFrameOrderByVentasResumidos.setSelected(false);
				
				this.jInternalFrameOrderByVentasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidos"));
				
				this.inicializarActualizarBindingTablaOrderByVentasResumidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasResumidos==null) {
				
				this.jInternalFrameImportacionVentasResumidos=new ImportacionJInternalFrame(VentasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidos);
				this.jInternalFrameImportacionVentasResumidos.setVisible(false);
				this.jInternalFrameImportacionVentasResumidos.setSelected(false);


				this.jInternalFrameImportacionVentasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidos"));
				this.jInternalFrameImportacionVentasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidos"));
				this.jInternalFrameImportacionVentasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasResumidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasResumidos==null) {
				this.jInternalFrameReporteDinamicoVentasResumidos=new ReporteDinamicoJInternalFrame(VentasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidos);
				this.jInternalFrameReporteDinamicoVentasResumidos.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasResumidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidos"));
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidos"));
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasResumidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidos);
			
	       	this.jInternalFrameDetalleFormVentasResumidos.setVisible(false);
	        this.jInternalFrameDetalleFormVentasResumidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasResumidos.dispose();
			//this.jInternalFrameDetalleFormVentasResumidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasResumidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasResumidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasResumidos.setVisible(true);
	        this.jInternalFrameImportacionVentasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasResumidos.setVisible(true);
	        this.jInternalFrameOrderByVentasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasResumidos.setVisible(false);
	        this.jInternalFrameOrderByVentasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasResumidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasResumidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasResumidos.setVisible(false);
	        this.jInternalFrameImportacionVentasResumidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasResumidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasResumidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasResumidos(true);
			//this.isEsNuevoVentasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidos(false) ;
			
			if(ventasresumidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasResumidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasResumidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasResumidos(true);
			//this.isEsNuevoVentasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventasresumidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasResumidos(false) ;
			
			if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidos(false);
			
			//if(!this.isEsNuevoVentasResumidos) {								
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				
			}
			
			if(this.permiteMantenimiento(this.ventasresumidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasResumidos=true;
					this.inicializarActualizarBindingTablaVentasResumidos(false);
					this.isEsNuevoVentasResumidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasResumidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasResumidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidos(false);
				
				this.habilitarDeshabilitarControlesVentasResumidos(false);
			
												
				
				if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasResumidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasResumidosActionPerformed(evt,ventasresumidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasResumidos(this.ventasresumidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasResumidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventasresumidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventasresumidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventasresumidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasResumidosModel) this.jTableDatosVentasResumidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasResumidos=true;
				this.inicializarActualizarBindingTablaVentasResumidos(false);
				this.isEsNuevoVentasResumidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidos(false);
				
				this.habilitarDeshabilitarControlesVentasResumidos(false);
				
				
				
				if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasResumidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasResumidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasResumidos.getRowCount()>=1) {
				jTableDatosVentasResumidos.removeRowSelectionInterval(0, jTableDatosVentasResumidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasResumidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasResumidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidos(false) ;
			
			this.isEsNuevoVentasResumidos=false;
			
			if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasResumidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasResumidos(false);
				
				//SI ES MANUAL
				if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasResumidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasResumidos--;			
			//VentasResumidos ventasresumidosAux= new VentasResumidos();			
			//ventasresumidosAux.setId(this.iIdNuevoVentasResumidos);
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasResumidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
			
			this.ventasresumidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventasresumidosLogic.getVentasResumidoss().add(this.ventasresumidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventasresumidoss.add(this.ventasresumidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasResumidos(false);
			
			this.jTableDatosVentasResumidos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidos(), this.getIndiceNuevoVentasResumidos());
			
			int iLastRow =  this.jTableDatosVentasResumidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasResumidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasResumidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasResumidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidos(false);
			
			//SI ES MANUAL
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidos();
			}
			
			//this.abrirFrameTreeVentasResumidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasResumidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasResumidos.setFileImportacion(this.jInternalFrameImportacionVentasResumidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasResumidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasResumidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasResumidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasResumidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		

		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasResumidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasResumidosBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
		
		if(this.jInternalFrameReporteDinamicoVentasResumidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case VentasResumidosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case VentasResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case VentasResumidosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case VentasResumidosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case VentasResumidosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case VentasResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case VentasResumidosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case VentasResumidosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case VentasResumidosConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case VentasResumidosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case VentasResumidosConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case VentasResumidosConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasResumidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasResumidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_RUC);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(VentasResumidos ventasresumidos:ventasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidos.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelVentasResumidos(row);				
			//	iRow++;
			//}				
			
			//for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasResumidos(ventasresumidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidos(false);
			
			//SI ES MANUAL
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidos(false);
			
			//SI ES MANUAL
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidos(false);
			
			//SI ES MANUAL
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasResumidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasResumidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasResumidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasResumidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasResumidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasResumidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasResumidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasResumidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasResumidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasResumidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasResumidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasResumidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasResumidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasResumidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasResumidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasResumidos();
		
		this.inicializarActualizarBindingBotonesManualVentasResumidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasResumidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasResumidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasResumidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionNuevoVentasResumidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionSinCerrarVentasResumidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionSinMensajeVentasResumidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasResumidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasResumidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasResumidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
				this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionNuevoVentasResumidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionSinCerrarVentasResumidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasResumidos.jCheckBoxPostAccionSinMensajeVentasResumidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasResumidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasResumidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasResumidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasResumidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasResumidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasResumidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasResumidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasResumidos(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidos() throws Exception {
		try	{
			if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasResumidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasResumidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasResumidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasResumidos.addItem(reporte);
			}
			
			
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasResumidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasResumidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasResumidosConstantesFunciones.getTiposSeleccionarVentasResumidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasResumidosConstantesFunciones.getTiposSeleccionarVentasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasResumidosConstantesFunciones.getTiposSeleccionarVentasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasResumidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasResumidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaVentasResumidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasResumidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasResumidos(Boolean esInicializar) throws Exception {				
		if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasResumidos() throws Exception {
		this.inicializarActualizarBindingTablaVentasResumidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasResumidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasResumidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasResumidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventasresumidosLogic.getVentasResumidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventasresumidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasResumidos.setModel(new VentasResumidosModel(this.ventasresumidosLogic.getVentasResumidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasResumidos.setModel(new VentasResumidosModel(this.ventasresumidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasResumidos!=null && this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasResumidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO,ventasresumidosConstantesFunciones.resaltarSeleccionarVentasResumidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO,ventasresumidosConstantesFunciones.resaltarSeleccionarVentasResumidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_ID));

		if(this.ventasresumidosConstantesFunciones.mostraridVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosConstantesFunciones.resaltaridVentasResumidos,this.ventasresumidosConstantesFunciones.activaridVentasResumidos,iSizeTabla,this,true,"idVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltaridVentasResumidos,this.ventasresumidosConstantesFunciones.activaridVentasResumidos,this,true,"idVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.ventasresumidosConstantesFunciones.mostrarnombre_completoVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosConstantesFunciones.resaltarnombre_completoVentasResumidos,this.ventasresumidosConstantesFunciones.activarnombre_completoVentasResumidos,iSizeTabla,this,true,"nombre_completoVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarnombre_completoVentasResumidos,this.ventasresumidosConstantesFunciones.activarnombre_completoVentasResumidos,this,true,"nombre_completoVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_RUC));

		if(this.ventasresumidosConstantesFunciones.mostrarrucVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosConstantesFunciones.resaltarrucVentasResumidos,this.ventasresumidosConstantesFunciones.activarrucVentasResumidos,iSizeTabla,this,true,"rucVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarrucVentasResumidos,this.ventasresumidosConstantesFunciones.activarrucVentasResumidos,this,true,"rucVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.ventasresumidosConstantesFunciones.mostrarnombre_productoVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosConstantesFunciones.resaltarnombre_productoVentasResumidos,this.ventasresumidosConstantesFunciones.activarnombre_productoVentasResumidos,iSizeTabla,this,true,"nombre_productoVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarnombre_productoVentasResumidos,this.ventasresumidosConstantesFunciones.activarnombre_productoVentasResumidos,this,true,"nombre_productoVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_CANTIDAD));

		if(this.ventasresumidosConstantesFunciones.mostrarcantidadVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosConstantesFunciones.resaltarcantidadVentasResumidos,this.ventasresumidosConstantesFunciones.activarcantidadVentasResumidos,iSizeTabla,this,true,"cantidadVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarcantidadVentasResumidos,this.ventasresumidosConstantesFunciones.activarcantidadVentasResumidos,this,true,"cantidadVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_PRECIO));

		if(this.ventasresumidosConstantesFunciones.mostrarprecioVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosConstantesFunciones.resaltarprecioVentasResumidos,this.ventasresumidosConstantesFunciones.activarprecioVentasResumidos,iSizeTabla,this,true,"precioVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarprecioVentasResumidos,this.ventasresumidosConstantesFunciones.activarprecioVentasResumidos,this,true,"precioVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_MONTO));

		if(this.ventasresumidosConstantesFunciones.mostrarmontoVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosConstantesFunciones.resaltarmontoVentasResumidos,this.ventasresumidosConstantesFunciones.activarmontoVentasResumidos,iSizeTabla,this,true,"montoVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarmontoVentasResumidos,this.ventasresumidosConstantesFunciones.activarmontoVentasResumidos,this,true,"montoVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.ventasresumidosConstantesFunciones.mostrarcodigo_productoVentasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosConstantesFunciones.resaltarcodigo_productoVentasResumidos,this.ventasresumidosConstantesFunciones.activarcodigo_productoVentasResumidos,iSizeTabla,this,true,"codigo_productoVentasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosConstantesFunciones.resaltarcodigo_productoVentasResumidos,this.ventasresumidosConstantesFunciones.activarcodigo_productoVentasResumidos,this,true,"codigo_productoVentasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasResumidos.addColumn(tableColumn);
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
			
			this.jTableDatosVentasResumidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasResumidos.moveColumn(this.jTableDatosVentasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasResumidos.moveColumn(this.jTableDatosVentasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasResumidos.moveColumn(this.jTableDatosVentasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasResumidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasResumidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasResumidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasResumidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasResumidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasResumidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasResumidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasResumidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventasresumidosLogic.getVentasResumidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventasresumidoss.size()-1;
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
		//this.jTableDatosVentasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasResumidos();
			
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
				
				//this.isEsNuevoVentasResumidos=false;
					
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
				if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventasresumidos.getsType().equals("DUPLICADO")
				   || this.ventasresumidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasResumidos=true;
				
				} else {
					this.isEsNuevoVentasResumidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
					if(this.ventasresumidos.getId()>=0 && !this.ventasresumidos.getIsNew()) {						
						this.isEsNuevoVentasResumidos=false;
						
					} else {
						this.isEsNuevoVentasResumidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasResumidos(esRelaciones);						
				
				this.seleccionarVentasResumidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventasresumidos.getId()<0) {
					this.isEsNuevoVentasResumidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasResumidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasResumidos(evt,rowIndex);
				}	
				
				if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasResumidos: " + this.dDif); 
					}
				}								
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasResumidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventasresumidos)) {
					if(this.ventasresumidos.getId()>0) {
						this.ventasresumidos.setIsDeleted(true);
						
						this.ventasresumidossEliminados.add(this.ventasresumidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidosLogic.getVentasResumidoss().remove(this.ventasresumidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidoss.remove(this.ventasresumidos);				
					}
					
					
					((VentasResumidosModel) this.jTableDatosVentasResumidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasResumidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasResumidos) {
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasResumidos(this.ventasresumidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasResumidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasResumidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidos(VentasResumidos ventasresumidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasResumidos(ventasresumidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidos(VentasResumidos ventasresumidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasResumidos(ventasresumidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasResumidos(ventasresumidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidos(ventasresumidos);
	}
	
	public void setVariablesObjetoActualToFormularioVentasResumidos(VentasResumidos ventasresumidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setText(ventasresumidos.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setText(ventasresumidos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setText(ventasresumidos.getruc());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setText(ventasresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setText(ventasresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setText(ventasresumidos.getprecio().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setText(ventasresumidos.getmonto().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setText(ventasresumidos.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasResumidos ventasresumidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventasresumidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasResumidos ventasresumidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventasresumidosLocal=this.ventasresumidos;
			} else {
				ventasresumidosLocal=this.ventasresumidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventasresumidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasResumidos(ventasresumidosLocal,true);
					
					if(ventasresumidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventasresumidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventasresumidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasResumidos(VentasResumidos ventasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidos(ventasresumidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(ventasresumidos);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidos(VentasResumidos ventasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidos(ventasresumidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidos(VentasResumidos ventasresumidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.getText()==null || this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.getText()=="" || this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setText("0");
			}

			if(conColumnasBase) {ventasresumidos.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelIdVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setnombre_completo(this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_completoVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setruc(this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelrucVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setnombre_producto(this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelnombre_productoVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelcantidadVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelprecioVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelmontoVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidos.setcodigo_producto(this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidos.jLabelcodigo_productoVentasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidos(VentasResumidos ventasresumidosBean,VentasResumidos ventasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasResumidos(VentasResumidos ventasresumidosOrigen,VentasResumidos ventasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidosOrigen.getId()!=null && !ventasresumidosOrigen.getId().equals(0L))) {ventasresumidos.setId(ventasresumidosOrigen.getId());}}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getfecha_emision_desde()!=null && !ventasresumidosOrigen.getfecha_emision_desde().equals(new Date()))) {ventasresumidos.setfecha_emision_desde(ventasresumidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getfecha_emision_hasta()!=null && !ventasresumidosOrigen.getfecha_emision_hasta().equals(new Date()))) {ventasresumidos.setfecha_emision_hasta(ventasresumidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getnombre_completo()!=null && !ventasresumidosOrigen.getnombre_completo().equals(""))) {ventasresumidos.setnombre_completo(ventasresumidosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getruc()!=null && !ventasresumidosOrigen.getruc().equals(""))) {ventasresumidos.setruc(ventasresumidosOrigen.getruc());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getnombre_producto()!=null && !ventasresumidosOrigen.getnombre_producto().equals(""))) {ventasresumidos.setnombre_producto(ventasresumidosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getcantidad()!=null && !ventasresumidosOrigen.getcantidad().equals(0))) {ventasresumidos.setcantidad(ventasresumidosOrigen.getcantidad());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getprecio()!=null && !ventasresumidosOrigen.getprecio().equals(0.0))) {ventasresumidos.setprecio(ventasresumidosOrigen.getprecio());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getmonto()!=null && !ventasresumidosOrigen.getmonto().equals(0.0))) {ventasresumidos.setmonto(ventasresumidosOrigen.getmonto());}
			if(conDefault || (!conDefault && ventasresumidosOrigen.getcodigo_producto()!=null && !ventasresumidosOrigen.getcodigo_producto().equals(""))) {ventasresumidos.setcodigo_producto(ventasresumidosOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidos(VentasResumidos ventasresumidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setText(ventasresumidos.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setText(ventasresumidos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setText(ventasresumidos.getruc());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setText(ventasresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setText(ventasresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setText(ventasresumidos.getprecio().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setText(ventasresumidos.getmonto().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setText(ventasresumidos.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidos(VentasResumidosBean ventasresumidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setText(ventasresumidosBean.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setText(ventasresumidosBean.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setText(ventasresumidosBean.getruc());
			this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setText(ventasresumidosBean.getnombre_producto());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setText(ventasresumidosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setText(ventasresumidosBean.getprecio().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setText(ventasresumidosBean.getmonto().toString());
			this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setText(ventasresumidosBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasResumidos(VentasResumidosParameterReturnGeneral ventasresumidosReturnGeneral,VentasResumidosBean ventasresumidosBean,Boolean conDefault) throws Exception { 
		try {
			VentasResumidos ventasresumidosLocal=new VentasResumidos();
			
			ventasresumidosLocal=ventasresumidosReturnGeneral.getVentasResumidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidosLocal.getId()!=null && !ventasresumidosLocal.getId().equals(0L))) {ventasresumidosBean.setId(ventasresumidosLocal.getId());}}
			if(conDefault || (!conDefault && ventasresumidosLocal.getnombre_completo()!=null && !ventasresumidosLocal.getnombre_completo().equals(""))) {ventasresumidosBean.setnombre_completo(ventasresumidosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getruc()!=null && !ventasresumidosLocal.getruc().equals(""))) {ventasresumidosBean.setruc(ventasresumidosLocal.getruc());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getnombre_producto()!=null && !ventasresumidosLocal.getnombre_producto().equals(""))) {ventasresumidosBean.setnombre_producto(ventasresumidosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getcantidad()!=null && !ventasresumidosLocal.getcantidad().equals(0))) {ventasresumidosBean.setcantidad(ventasresumidosLocal.getcantidad());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getprecio()!=null && !ventasresumidosLocal.getprecio().equals(0.0))) {ventasresumidosBean.setprecio(ventasresumidosLocal.getprecio());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getmonto()!=null && !ventasresumidosLocal.getmonto().equals(0.0))) {ventasresumidosBean.setmonto(ventasresumidosLocal.getmonto());}
			if(conDefault || (!conDefault && ventasresumidosLocal.getcodigo_producto()!=null && !ventasresumidosLocal.getcodigo_producto().equals(""))) {ventasresumidosBean.setcodigo_producto(ventasresumidosLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasResumidosGenerico(Long idVentasResumidosSeleccionado,JComboBox jComboBoxVentasResumidos,List<VentasResumidos> ventasresumidossLocal)throws Exception {
		try {
			VentasResumidos  ventasresumidosTemp=null;

			for(VentasResumidos ventasresumidosAux:ventasresumidossLocal) {
				if(ventasresumidosAux.getId()!=null && ventasresumidosAux.getId().equals(idVentasResumidosSeleccionado)) {
					ventasresumidosTemp=ventasresumidosAux;
					break;
				}
			}

			jComboBoxVentasResumidos.setSelectedItem(ventasresumidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasResumidosGenerico(JComboBox jComboBoxVentasResumidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidos=(VentasResumidos) ventasresumidosLogic.getVentasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidos =(VentasResumidos) ventasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventasresumidos.getIsNew() && !ventasresumidos.getIsChanged() && !ventasresumidos.getIsDeleted()) {
				sDescripcion=ventasresumidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventasresumidos.getIsNew() && !ventasresumidos.getIsChanged() && !ventasresumidos.getIsDeleted()) {
				sDescripcion=ventasresumidos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidos.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasResumidos ventasresumidosRow=new VentasResumidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidosRow=(VentasResumidos) ventasresumidosLogic.getVentasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidosRow=(VentasResumidos) ventasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasResumidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos));			
			this.jButtonDuplicarVentasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidos && this.isPermisoDuplicarVentasResumidos));			
			this.jButtonCopiarVentasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidos && this.isPermisoCopiarVentasResumidos));
			this.jButtonVerFormVentasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidos && this.isPermisoVerFormVentasResumidos));
			
			this.jButtonAbrirOrderByVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));			
			
			this.jButtonNuevoRelacionesVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidos && this.isPermisoNuevoVentasResumidos));			
			this.jButtonNuevoGuardarCambiosVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarVentasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasResumidos && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidos && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidos && this.isPermisoEliminarVentasResumidos));
			this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidos);							
			this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos));						
			this.jButtonDuplicarToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidos && this.isPermisoDuplicarVentasResumidos));						
			this.jButtonCopiarToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidos && this.isPermisoCopiarVentasResumidos));			
			this.jButtonVerFormToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidos && this.isPermisoVerFormVentasResumidos));			
			this.jButtonAbrirOrderByToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));
			this.jButtonNuevoRelacionesToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidos && this.isPermisoNuevoVentasResumidos));			
			this.jButtonNuevoGuardarCambiosToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));			
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasResumidos && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidos  && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidos && this.isPermisoEliminarVentasResumidos));
			this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarToolBarVentasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidos);				
			this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos));			
			this.jMenuItemDuplicarVentasResumidos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidos && this.isPermisoDuplicarVentasResumidos));			
			this.jMenuItemCopiarVentasResumidos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidos && this.isPermisoCopiarVentasResumidos));			
			this.jMenuItemVerFormVentasResumidos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidos && this.isPermisoVerFormVentasResumidos));			
			this.jMenuItemAbrirOrderByVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));			
			//this.jMenuItemMostrarOcultarVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));
			this.jMenuItemDetalleAbrirOrderByVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));			
			//this.jMenuItemDetalleMostrarOcultarVentasResumidos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidos && this.isPermisoOrdenVentasResumidos));			
			this.jMenuItemNuevoRelacionesVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidos && this.isPermisoNuevoVentasResumidos));			
			this.jMenuItemNuevoGuardarCambiosVentasResumidos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidos && this.isPermisoNuevoVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));									
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemModificarVentasResumidos.setVisible((this.isVisibilidadCeldaModificarVentasResumidos && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemActualizarVentasResumidos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidos && this.isPermisoActualizarVentasResumidos));	
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemEliminarVentasResumidos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidos && this.isPermisoEliminarVentasResumidos));
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemCancelarVentasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidos);				
			}
			
			this.jMenuItemGuardarCambiosVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));						
			this.jMenuItemGuardarCambiosTablaVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidos=this.jButtonNuevoVentasResumidos.isVisible();
			this.isVisibilidadCeldaDuplicarVentasResumidos=this.jButtonDuplicarVentasResumidos.isVisible();
			this.isVisibilidadCeldaCopiarVentasResumidos=this.jButtonCopiarVentasResumidos.isVisible();
			this.isVisibilidadCeldaVerFormVentasResumidos=this.jButtonVerFormVentasResumidos.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasResumidos=this.jButtonAbrirOrderByVentasResumidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=this.jButtonNuevoRelacionesVentasResumidos.isVisible();
			this.isVisibilidadCeldaModificarVentasResumidos=this.jButtonModificarVentasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.isVisibilidadCeldaActualizarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=this.jButtonGuardarCambiosTablaVentasResumidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasResumidos=this.jButtonNuevoToolBarVentasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=this.jButtonNuevoRelacionesToolBarVentasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.isVisibilidadCeldaModificarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarToolBarVentasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarToolBarVentasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarToolBarVentasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarToolBarVentasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidos=this.jButtonGuardarCambiosToolBarVentasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=this.jButtonGuardarCambiosTablaToolBarVentasResumidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasResumidos=this.jMenuItemNuevoVentasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=this.jMenuItemNuevoRelacionesVentasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.isVisibilidadCeldaModificarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jMenuItemModificarVentasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jMenuItemActualizarVentasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jMenuItemEliminarVentasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidos=this.jInternalFrameDetalleFormVentasResumidos.jMenuItemCancelarVentasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidos=this.jMenuItemGuardarCambiosVentasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=this.jMenuItemGuardarCambiosTablaVentasResumidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasResumidos(Boolean esInicializar) {
		if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
				//if(this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidos();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasResumidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasResumidos() {
		this.jButtonNuevoVentasResumidos.setVisible(this.isPermisoNuevoVentasResumidos);			
		this.jButtonDuplicarVentasResumidos.setVisible(this.isPermisoDuplicarVentasResumidos);			
		this.jButtonCopiarVentasResumidos.setVisible(this.isPermisoCopiarVentasResumidos);			
		this.jButtonVerFormVentasResumidos.setVisible(this.isPermisoVerFormVentasResumidos);			
		
		this.jButtonAbrirOrderByVentasResumidos.setVisible(this.isPermisoOrdenVentasResumidos);					
		
		this.jButtonNuevoRelacionesVentasResumidos.setVisible(this.isPermisoNuevoVentasResumidos);			
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarVentasResumidos.setVisible(this.isPermisoActualizarVentasResumidos);	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.setVisible(this.isPermisoActualizarVentasResumidos);	
			this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.setVisible(this.isPermisoEliminarVentasResumidos);
			this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidos);						
			this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.setVisible(this.isPermisoGuardarCambiosVentasResumidos);							
		}
		
		this.jButtonGuardarCambiosTablaVentasResumidos.setVisible(this.isPermisoActualizarVentasResumidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidos() {
		this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarVentasResumidos.setVisible(this.isPermisoActualizarVentasResumidos);	
		this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.setVisible(this.isPermisoActualizarVentasResumidos);	
		this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.setVisible(this.isPermisoEliminarVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidos);							
		this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidos && this.isPermisoGuardarCambiosVentasResumidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasResumidos() {
		if(VentasResumidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasResumidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasResumidos() {
	}
	
	public void jTableDatosVentasResumidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasResumidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventasresumidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasResumidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventasresumidosLogic.getConnexion());

				if(this.ventasresumidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventasresumidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidos=(TitledBorder)this.jScrollPanelDatosVentasResumidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasResumidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventasresumidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentasResumidos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventasresumidosLogic.getConnexion());

				if(this.ventasresumidos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventasresumidos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidos=(TitledBorder)this.jScrollPanelDatosVentasResumidos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentasResumidos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventasresumidos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventasresumidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventasresumidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.ventasresumidos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.ventasresumidos.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.ventasresumidos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.ventasresumidos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.ventasresumidos.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.ventasresumidos.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoVentasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.getventasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidos==null) {
						this.ventasresumidos = new VentasResumidos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);
				}

				if(this.ventasresumidos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.ventasresumidos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasResumidosVentasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidos(false,false);

			this.getVentasResumidossBusquedaVentasResumidos();

			this.inicializarActualizarBindingVentasResumidos(false);

			//if(VentasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidos(false,false);

			this.getVentasResumidossFK_IdEmpresa();

			this.inicializarActualizarBindingVentasResumidos(false);

			//if(VentasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidos(false,false);

			this.getVentasResumidossFK_IdSucursal();

			this.inicializarActualizarBindingVentasResumidos(false);

			//if(VentasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasResumidos() {
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
			this.jInternalFrameDetalleFormVentasResumidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasResumidos.dispose();
			this.jInternalFrameDetalleFormVentasResumidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
			this.jInternalFrameReporteDinamicoVentasResumidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasResumidos.dispose();
			this.jInternalFrameReporteDinamicoVentasResumidos=null;
		}
		
		if(this.jInternalFrameImportacionVentasResumidos!=null) {
			this.jInternalFrameImportacionVentasResumidos.setVisible(false);	    			
			this.jInternalFrameImportacionVentasResumidos.dispose();
			this.jInternalFrameImportacionVentasResumidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasResumidos();
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasResumidos")) {
				jButtonDuplicarVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasResumidos")) {
				jButtonCopiarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasResumidos")) {
				jButtonVerFormVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasResumidos")) {
				jButtonDuplicarVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasResumidos")) {
				jButtonDuplicarVentasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasResumidos")) {
				jButtonModificarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasResumidos")) {
				jButtonModificarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasResumidos")) {
				jButtonModificarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasResumidos")) {
				jButtonActualizarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasResumidos")) {
				jButtonActualizarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasResumidos")) {
				jButtonActualizarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasResumidos")) {
				jButtonEliminarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasResumidos")) {
				jButtonEliminarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasResumidos")) {
				jButtonEliminarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasResumidos")) {
				jButtonCancelarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasResumidos")) {
				jButtonCancelarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasResumidos")) {
				jButtonCancelarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasResumidos")) {
				jButtonCerrarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasResumidos")) {
				jButtonCerrarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasResumidos")) {
				jButtonCerrarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasResumidos")) {
				jButtonMostrarOcultarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasResumidos")) {
				jButtonCancelarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasResumidos")) {
				jButtonCopiarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasResumidos")) {
				jButtonVerFormVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasResumidos")) {
				jButtonCopiarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasResumidos")) {
				jButtonVerFormVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasResumidos")) {
				jButtonRecargarInformacionVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasResumidos")) {
				jButtonRecargarInformacionVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasResumidos")) {
				jButtonRecargarInformacionVentasResumidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasResumidos")) {
				jButtonAnterioresVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasResumidos")) {
				jButtonAnterioresVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasResumidos")) {
				jButtonAnterioresVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasResumidos")) {
				jButtonSiguientesVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasResumidos")) {
				jButtonSiguientesVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasResumidos")) {
				jButtonSiguientesVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasResumidos") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasResumidos")) {
				jButtonAbrirOrderByVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasResumidos") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasResumidos")) {
				jButtonMostrarOcultarVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidos")) {
				jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasResumidos")) {
				jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasResumidos")) {
				jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasResumidos")) {
				jButtonCerrarReporteDinamicoVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasResumidos")) {
				jButtonGenerarReporteDinamicoVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasResumidos")) {
				
				jButtonGenerarExcelReporteDinamicoVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasResumidos")) {
				jButtonCerrarImportacionVentasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasResumidos")) {
				
				jButtonGenerarImportacionVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasResumidos")) {
				
				jButtonAbrirImportacionVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasResumidos")) {
				jComboBoxTiposAccionesVentasResumidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasResumidos")) {
				jComboBoxTiposRelacionesVentasResumidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasResumidos")) {
				jComboBoxTiposAccionesVentasResumidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasResumidos")) {
				
				jComboBoxTiposSeleccionarVentasResumidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasResumidos")) {
				jTextFieldValorCampoGeneralVentasResumidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasResumidos")) {
				jButtonAbrirOrderByVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasResumidos")) {
				jButtonAbrirOrderByVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasResumidos")) {
				jButtonCerrarOrderByVentasResumidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidosBusqueda")) {
				this.jButtonidVentasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosUpdate")) {
				this.jButtonid_empresaVentasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosBusqueda")) {
				this.jButtonid_empresaVentasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidosUpdate")) {
				this.jButtonid_sucursalVentasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidosBusqueda")) {
				this.jButtonid_sucursalVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasResumidosBusqueda")) {
				this.jButtonnombre_completoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucVentasResumidosBusqueda")) {
				this.jButtonrucVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentasResumidosBusqueda")) {
				this.jButtonnombre_productoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentasResumidosBusqueda")) {
				this.jButtoncantidadVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentasResumidosBusqueda")) {
				this.jButtonprecioVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasResumidosBusqueda")) {
				this.jButtonmontoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoVentasResumidosBusqueda")) {
				this.jButtoncodigo_productoVentasResumidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasResumidosVentasResumidos")) {
				this.jButtonBusquedaVentasResumidosVentasResumidosActionPerformed(evt);
			}
			
			;
			
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasResumidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasResumidos ventasresumidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventasresumidosLocal=this.ventasresumidos;
			} else {
				ventasresumidosLocal=this.ventasresumidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
							
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
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
			
			


			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
								
						
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
								
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
							
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
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
			
			


			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
								
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasResumidos")) {
					jCheckBoxSeleccionarTodosVentasResumidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasResumidos")) {
					jCheckBoxSeleccionadosVentasResumidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasResumidos")) {
					
				}
				
				


				
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
												
				
				


				
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
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
			
			


			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidos);
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
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
				
				


				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosAnterior =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasResumidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasResumidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventasresumidos =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventasresumidos =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventasresumidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasResumidos")) {
				
				}
				
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasResumidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasResumidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasResumidos")) {
			
			}
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasResumidos();
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			if(sTipo.equals("NuevoVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasResumidos")) {
				jButtonDuplicarVentasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasResumidos")) {
				jButtonCopiarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasResumidos")) {
				jButtonVerFormVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasResumidos")) {
				jButtonNuevoVentasResumidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasResumidos")) {
				jButtonModificarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasResumidos")) {
				jButtonActualizarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasResumidos")) {
				jButtonEliminarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasResumidos")) {
				jButtonCancelarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasResumidos")) {
				jButtonCerrarVentasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasResumidos")) {
				jButtonGuardarCambiosVentasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidos")) {
				jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasResumidos")) {
				jButtonAbrirOrderByVentasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasResumidos")) {
				jButtonRecargarInformacionVentasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasResumidos")) {
				jButtonAnterioresVentasResumidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasResumidos")) {
				jButtonSiguientesVentasResumidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidosBusqueda")) {
				this.jButtonidVentasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosUpdate")) {
				this.jButtonid_empresaVentasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosBusqueda")) {
				this.jButtonid_empresaVentasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidosUpdate")) {
				this.jButtonid_sucursalVentasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidosBusqueda")) {
				this.jButtonid_sucursalVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasResumidosBusqueda")) {
				this.jButtonnombre_completoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucVentasResumidosBusqueda")) {
				this.jButtonrucVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentasResumidosBusqueda")) {
				this.jButtonnombre_productoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentasResumidosBusqueda")) {
				this.jButtoncantidadVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentasResumidosBusqueda")) {
				this.jButtonprecioVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasResumidosBusqueda")) {
				this.jButtonmontoVentasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoVentasResumidosBusqueda")) {
				this.jButtoncodigo_productoVentasResumidosBusquedaActionPerformed(evt);
			}
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasResumidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasResumidos")) {
				closingInternalFrameVentasResumidos();
				
			} else if(sTipo.equals("jButtonCancelarVentasResumidos")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasResumidos = (JInternalFrameBase)evt.getSource();
	            	
	            VentasResumidosBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasResumidosActionPerformed(null);
			}
			
			VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidos,new Object(),this.ventasresumidosParameterGeneral,this.ventasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventasresumidos)) {
			if(!esControlTabla) {
				if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);			
				}
				
				if(this.ventasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasResumidos(this.ventasresumidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasResumidos(this.ventasresumidosReturnGeneral,this.ventasresumidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidos(classes,this.ventasresumidosReturnGeneral,this.ventasresumidosBean,false);
					}
						
					if(this.ventasresumidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos());	
					}
						
					if(this.ventasresumidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasResumidos(this.ventasresumidosReturnGeneral.getVentasResumidos(),classes);//this.ventasresumidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasResumidos(this.ventasresumidos,classes);//this.ventasresumidosBean);									
				}
			
				if(VentasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasResumidos(this.ventasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidos(this.ventasresumidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventasresumidosAnterior!=null) {
						this.ventasresumidos=this.ventasresumidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventasresumidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventasresumidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventasresumidosReturnGeneral.getVentasResumidos(),ventasresumidosLogic.getVentasResumidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventasresumidosReturnGeneral.getVentasResumidos(),this.ventasresumidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasResumidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasResumidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasResumidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasResumidos() throws Exception {
		
		VentasResumidosModel ventasresumidosModel=(VentasResumidosModel)this.jTableDatosVentasResumidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidosModel.ventasresumidoss=this.ventasresumidosLogic.getVentasResumidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventasresumidosModel.ventasresumidoss=this.ventasresumidoss;
		}
		
		
		((VentasResumidosModel) this.jTableDatosVentasResumidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasResumidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventasresumidosAnterior(),this.ventasresumidosLogic.getVentasResumidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventasresumidosAnterior(),this.ventasresumidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasResumidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasResumidos(VentasResumidos ventasresumidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
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
										
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidos,new Object(),generalEntityParameterGeneral,this.ventasresumidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventasresumidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasResumidosConstantesFunciones.getClassesRelationshipsOfVentasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasResumidosConstantesFunciones.getClassesRelationshipsFromStringsOfVentasResumidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidos,new Object(),generalEntityParameterGeneral,this.ventasresumidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasResumidos(VentasResumidosBean ventasresumidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidos(ArrayList<Classe> classes,VentasResumidosReturnGeneral ventasresumidosReturnGeneral,VentasResumidosBean ventasresumidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasResumidos(VentasResumidos ventasresumidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventasresumidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidos = new VentasResumidosDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidosSessionBean.getConGuardarRelaciones(),this.ventasresumidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.setVisible(false);
		this.jInternalFrameDetalleFormVentasResumidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasResumidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasResumidos.ventasresumidosLogic=this.ventasresumidosLogic;
		
		this.cargarCombosFrameForeignKeyVentasResumidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasResumidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasResumidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidos"));
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarVentasResumidos.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidos"));

		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidos"));
					
		this.jInternalFrameDetalleFormVentasResumidos.jMenuItemModificarVentasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidos"));
						
		this.jInternalFrameDetalleFormVentasResumidos.jMenuItemActualizarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidos"));
								
		this.jInternalFrameDetalleFormVentasResumidos.jMenuItemEliminarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidos"));
					
		this.jInternalFrameDetalleFormVentasResumidos.jMenuItemCancelarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jMenuItemDetalleCerrarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonidVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_desdeVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_hastaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_completoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonrucVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"rucVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncantidadVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonprecioVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"precioVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonmontoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncodigo_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasResumidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasResumidos"));
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidos"));
		}
		
		this.jTableDatosVentasResumidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasResumidos"));
		
		this.jTableDatosVentasResumidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasResumidos"));
		
		this.jButtonNuevoVentasResumidos.addActionListener(new ButtonActionListener(this,"NuevoVentasResumidos"));
		
		this.jButtonDuplicarVentasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarVentasResumidos"));
		
		this.jButtonCopiarVentasResumidos.addActionListener(new ButtonActionListener(this,"CopiarVentasResumidos"));
		
		this.jButtonVerFormVentasResumidos.addActionListener(new ButtonActionListener(this,"VerFormVentasResumidos"));
		
		
		this.jButtonNuevoToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasResumidos"));
			
		this.jButtonDuplicarToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasResumidos"));
			
		this.jMenuItemNuevoVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasResumidos"));
			
		this.jMenuItemDuplicarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasResumidos"));		
		
		
		this.jButtonNuevoRelacionesVentasResumidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasResumidos"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasResumidos"));
			
		this.jMenuItemNuevoRelacionesVentasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarVentasResumidos.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonModificarToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidos"));
			
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemModificarVentasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarVentasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonActualizarToolBarVentasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidos"));
				
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemActualizarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarVentasResumidos.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonEliminarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidos"));
						
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemEliminarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarVentasResumidos.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonCancelarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidos"));
			
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemCancelarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasResumidos"));		
		
		
		this.jButtonCerrarVentasResumidos.addActionListener (new ButtonActionListener(this,"CerrarVentasResumidos"));
		
		
		this.jButtonCerrarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasResumidos"));
			
		this.jMenuItemCerrarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasResumidos"));
			
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jMenuItemDetalleCerrarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidos"));
		}
		
		this.jButtonCopiarToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasResumidos"));
			
		this.jButtonVerFormToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasResumidos"));
		
		this.jMenuItemGuardarCambiosVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasResumidos"));
			
		this.jMenuItemCopiarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasResumidos"));		
		
		this.jMenuItemVerFormVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasResumidos"));		
		
		
		this.jButtonGuardarCambiosTablaVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasResumidos"));
			
		this.jMenuItemGuardarCambiosTablaVentasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidos"));		
		
		
		
		this.jButtonRecargarInformacionVentasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasResumidos"));
					
		this.jButtonRecargarInformacionToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasResumidos"));
		
		this.jMenuItemRecargarInformacionVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasResumidos"));		
		
		
		
		this.jButtonAnterioresVentasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresVentasResumidos"));
		
		
		this.jButtonAnterioresToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasResumidos"));
		
		this.jMenuItemAnterioresVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasResumidos"));		
		
		
		this.jButtonSiguientesVentasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesVentasResumidos"));
		
		
		this.jButtonSiguientesToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasResumidos"));
			
		this.jMenuItemSiguientesVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasResumidos"));
			
		this.jMenuItemAbrirOrderByVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasResumidos"));
			
		this.jMenuItemMostrarOcultarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasResumidos"));
			
		this.jMenuItemDetalleAbrirOrderByVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasResumidos"));
			
		this.jMenuItemDetalleMostarOcultarVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasResumidos"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasResumidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasResumidos"));
			
		this.jMenuItemNuevoGuardarCambiosVentasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasResumidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasResumidos"));

		this.jCheckBoxSeleccionadosVentasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasResumidos"));
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidos"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasResumidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasResumidos"));
			
		this.jComboBoxTiposAccionesVentasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasResumidos"));
					
		this.jComboBoxTiposSeleccionarVentasResumidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasResumidos"));
			
		this.jTextFieldValorCampoGeneralVentasResumidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonidVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_desdeVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_hastaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_completoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonrucVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"rucVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncantidadVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonprecioVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"precioVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonmontoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncodigo_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasResumidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasResumidosVentasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidosVentasResumidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasResumidos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidos"));
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidos"));
				this.jInternalFrameReporteDinamicoVentasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasResumidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidos"));				
			//this.jButtonGenerarReporteDinamicoVentasResumidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidos"));
			//this.jButtonGenerarExcelReporteDinamicoVentasResumidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasResumidos!=null) {
				this.jInternalFrameImportacionVentasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidos"));
				this.jInternalFrameImportacionVentasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidos"));
				this.jInternalFrameImportacionVentasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasResumidos"));
			
			this.jButtonAbrirOrderByToolBarVentasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasResumidos"));			
			
			if(this.jInternalFrameOrderByVentasResumidos!=null) {
				this.jInternalFrameOrderByVentasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidos.jTabbedPaneRelacionesVentasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidos"));
		
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
            		closingInternalFrameVentasResumidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasResumidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasResumidos = (JInternalFrameBase)event.getSource();
	            	
	            VentasResumidosBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasResumidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasResumidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasResumidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasResumidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasResumidos";
		inputMap = this.jButtonNuevoVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasResumidos";
		inputMap = this.jButtonNuevoRelacionesVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasResumidos";
		inputMap = this.jButtonModificarVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasResumidos";
		inputMap = this.jButtonActualizarVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasResumidos";
		inputMap = this.jButtonEliminarVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasResumidos";
		inputMap = this.jButtonCancelarVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasResumidos";
		inputMap = this.jButtonCerrarVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasResumidos";
		inputMap = this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasResumidos.jButtonGuardarCambiosVentasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasResumidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasResumidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonidVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_empresaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonid_sucursalVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_desdeVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonfecha_emision_hastaVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_completoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonrucVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"rucVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonnombre_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncantidadVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonprecioVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"precioVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtonmontoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidos.jButtoncodigo_productoVentasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasResumidosBusqueda"));
		
		
		this.jButtonBusquedaVentasResumidosVentasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidosVentasResumidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasResumidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasResumidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
					ventasresumidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidos ventasresumidosAux:ventasresumidoss) {
					ventasresumidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
						ventasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidos ventasresumidosAux:ventasresumidoss) {
						ventasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidos ventasresumidosAux:ventasresumidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasResumidos.getSelectedRows();
			
			VentasResumidos ventasresumidosLocal=new VentasResumidos();
			
			//this.seleccionarTodosVentasResumidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventasresumidosLocal =(VentasResumidos) this.ventasresumidosLogic.getVentasResumidoss().toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventasresumidosLocal =(VentasResumidos) this.ventasresumidoss.toArray()[this.jTableDatosVentasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventasresumidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
						ventasresumidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidos ventasresumidosAux:ventasresumidoss) {
						ventasresumidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasResumidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasResumidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasResumidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidos ventasresumidosAux:this.ventasresumidosLogic.getVentasResumidoss()) {
				
						if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasresumidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							ventasresumidosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventasresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventasresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventasresumidosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventasresumidosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							ventasresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidos ventasresumidosAux:ventasresumidoss) {
					
						if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasresumidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							ventasresumidosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventasresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventasresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventasresumidosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventasresumidosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							ventasresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasResumidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasResumidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasResumidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasResumidos) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasResumidos(conSplash);
				
					this.generarReporteVentasResumidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidossSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidossSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidos();
				
				this.exportarVentasResumidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasResumidoss();
				//this.importarVentasResumidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasResumidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasResumidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasResumidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasResumidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasResumidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasResumidos(conSplash);
					
						//this.actualizarParametrosGeneralVentasResumidos();
						
						this.generarReporteProcesoAccionVentasResumidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasResumidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas ResumidosES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasResumidos();
				
						this.actualizarParametrosGeneralVentasResumidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventasresumidosReturnGeneral=ventasresumidosLogic.procesarAccionVentasResumidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventasresumidosLogic.getVentasResumidoss(),this.ventasresumidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasResumidos();
					
					VentasResumidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidos.jComboBoxTiposAccionesFormularioVentasResumidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasResumidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasResumidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasResumidos();
			
			if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
			VentasResumidos ventasresumidos=new VentasResumidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasResumidos.getSelectedItem();
			
			
			
			
			ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventasresumidossSeleccionados.size()==1) {
				for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
					ventasresumidos=ventasresumidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasResumidos();
			
      		//this.finishProcessVentasResumidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasResumidosReturnGeneral() throws Exception {
		if(this.ventasresumidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventasresumidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventasresumidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventasresumidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasResumidos(false);
		}
		
		if(this.ventasresumidosReturnGeneral.getConRetornoLista() || this.ventasresumidosReturnGeneral.getConRetornoObjeto()) {
			if(this.ventasresumidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventasresumidosLogic.setVentasResumidoss(this.ventasresumidosReturnGeneral.getVentasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasResumidos(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasResumidos() throws Exception {
		
		
	}
	
	public ArrayList<VentasResumidos> getVentasResumidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasResumidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasResumidos ventasresumidosAux:ventasresumidosLogic.getVentasResumidoss()) {
					if(ventasresumidosAux.getIsSelected()) {
						ventasresumidossSeleccionados.add(ventasresumidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidos ventasresumidosAux:this.ventasresumidoss) {
					if(ventasresumidosAux.getIsSelected()) {
						ventasresumidossSeleccionados.add(ventasresumidosAux);				
					}
				}
			}
			
			if(ventasresumidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventasresumidossSeleccionados.addAll(this.ventasresumidosLogic.getVentasResumidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventasresumidossSeleccionados.addAll(this.ventasresumidoss);				
					}
				}
			}
		} else {
			ventasresumidossSeleccionados.add(this.ventasresumidos);
		}
		
		return ventasresumidossSeleccionados;
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
	
	public void generarReporteVentasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasResumidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasResumidos();
		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasResumidos();
		
		
		//this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados ,ventasresumidosImplementable,ventasresumidosImplementableHome);
	}
	
	public void mostrarImportacionVentasResumidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasResumidos();
		
		this.abrirFrameImportacionVentasResumidos();		
		
			
		//this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados ,ventasresumidosImplementable,ventasresumidosImplementableHome);
	}
	
	public void importarVentasResumidoss() throws Exception {		
	
	}
	
	public void exportarVentasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasResumidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasResumidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasResumidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasResumidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasResumidos(ventasresumidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventasresumidosAux.setsDetalleGeneralEntityReporte(ventasresumidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasResumidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasResumidos(VentasResumidos ventasresumidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventasresumidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidos.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasResumidos(row);				
				iRow++;
			}				
			
			for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasResumidos(ventasresumidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasResumidossSeleccionados() throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();		
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventasresumidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventasresumidos");
			//elementRoot.appendChild(element);
		
			for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
				element = document.createElement("ventasresumidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasResumidos(ventasresumidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasResumidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasResumidos(VentasResumidos ventasresumidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidos.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlVentasResumidos(VentasResumidos ventasresumidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasResumidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventasresumidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasResumidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventasresumidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasResumidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventasresumidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentasResumidosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventasresumidos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasResumidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventasresumidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasResumidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventasresumidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo = document.createElement(VentasResumidosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(ventasresumidos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementruc = document.createElement(VentasResumidosConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(ventasresumidos.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_producto = document.createElement(VentasResumidosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(ventasresumidos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(VentasResumidosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(ventasresumidos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(VentasResumidosConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(ventasresumidos.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementmonto = document.createElement(VentasResumidosConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(ventasresumidos.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementcodigo_producto = document.createElement(VentasResumidosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(ventasresumidos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoVentasResumidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasResumidos> ventasresumidossSeleccionados=new ArrayList<VentasResumidos>();
		
		ventasresumidossSeleccionados=this.getVentasResumidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasResumidos(ventasresumidossSeleccionados);
		
		this.generarReporteVentasResumidoss("Todos",ventasresumidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasResumidos(ArrayList<VentasResumidos> ventasresumidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasResumidos ventasresumidosAux:ventasresumidossSeleccionados) {
				ventasresumidosAux.setsDetalleGeneralEntityReporte(ventasresumidosAux.toString());
			
				if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_RUC)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					ventasresumidosAux.setsDescripcionGeneralEntityReporte1(ventasresumidosAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasResumidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasResumidos=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=true;
				this.isVisibilidadCeldaGuardarCambiosVentasResumidos=true;
			}
			
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasResumidos=true;
			this.isVisibilidadCeldaCancelarVentasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=true;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=true;
			this.isVisibilidadCeldaModificarVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
			this.isVisibilidadCeldaModificarVentasResumidos=true;
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
			this.isVisibilidadCeldaCancelarVentasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasResumidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=true;
		} else {
			this.actualizarEstadoPanelsVentasResumidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasResumidos=false;
			//this.isVisibilidadCeldaVerFormVentasResumidos=false;
			this.isVisibilidadCeldaDuplicarVentasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventasresumidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!ventasresumidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;												
			}
			
			this.jButtonCerrarVentasResumidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
		}
		
		if(!this.permiteMantenimiento(this.ventasresumidos)) {
			this.isVisibilidadCeldaActualizarVentasResumidos=false;
			this.isVisibilidadCeldaEliminarVentasResumidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasResumidos=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidos=false;
		this.isVisibilidadCeldaGuardarCambiosVentasResumidos=false;
		//this.isVisibilidadCeldaModificarVentasResumidos=true;
		this.isVisibilidadCeldaActualizarVentasResumidos=false;
		this.isVisibilidadCeldaEliminarVentasResumidos=false;
		//this.isVisibilidadCeldaCancelarVentasResumidos=true;			
		this.isVisibilidadCeldaGuardarVentasResumidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidos() {
	}
	
	public void actualizarEstadoPanelsVentasResumidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasResumidos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidos!=null) {
				this.jScrollPanelDatosVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidos!=null) {
				this.jPanelPaginacionVentasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
					this.jTabbedPaneBusquedasVentasResumidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidos!=null) {
				this.jTabbedPaneBusquedasVentasResumidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasResumidos!=null) {
				this.jPanelParametrosReportesVentasResumidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasResumidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasResumidos) {this.jTabbedPaneBusquedasVentasResumidos.remove(jPanelBusquedaVentasResumidosVentasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentasResumidos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentasResumidos) {this.jTabbedPaneBusquedasVentasResumidos.remove(jPanelBusquedaVentasResumidosVentasResumidos);}
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
			
			this.inicializarActualizarBindingTablaVentasResumidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasResumidos() {
		this.updateBorderResaltarBusquedasFormularioVentasResumidos();
		this.updateVisibilidadBusquedasFormularioVentasResumidos();
		this.updateHabilitarBusquedasFormularioVentasResumidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasResumidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasResumidos.getComponents().length>0) {
	

		if(this.ventasresumidosConstantesFunciones.resaltarBusquedaVentasResumidosVentasResumidos!=null) {
			index= this.jTabbedPaneBusquedasVentasResumidos.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasResumidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidos.getComponent(index);
				jPanel.setBorder(this.ventasresumidosConstantesFunciones.resaltarBusquedaVentasResumidosVentasResumidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasResumidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidos.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasResumidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventasresumidosConstantesFunciones.mostrarBusquedaVentasResumidosVentasResumidos);
			if(!this.ventasresumidosConstantesFunciones.mostrarBusquedaVentasResumidosVentasResumidos && index>-1) {
				this.jTabbedPaneBusquedasVentasResumidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasResumidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidos.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasResumidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventasresumidosConstantesFunciones.activarBusquedaVentasResumidosVentasResumidos);
				this.jTabbedPaneBusquedasVentasResumidos.setEnabledAt(index,this.ventasresumidosConstantesFunciones.activarBusquedaVentasResumidosVentasResumidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasResumidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasResumidos")) {
			index= this.jTabbedPaneBusquedasVentasResumidos.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasResumidos);

			this.jTabbedPaneBusquedasVentasResumidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidos.getComponent(index);

			this.ventasresumidosConstantesFunciones.setResaltarBusquedaVentasResumidosVentasResumidos(resaltar);

			jPanel.setBorder(this.ventasresumidosConstantesFunciones.resaltarBusquedaVentasResumidosVentasResumidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasResumidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasResumidos() throws Exception {

		if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasResumidos();
		this.updateVisibilidadResaltarControlesFormularioVentasResumidos();
		this.updateHabilitarResaltarControlesFormularioVentasResumidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventasresumidosConstantesFunciones.resaltaridVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltaridVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarid_empresaVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarid_empresaVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarid_sucursalVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarid_sucursalVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarfecha_emision_desdeVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_desdeVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarfecha_emision_desdeVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarfecha_emision_hastaVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_hastaVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarfecha_emision_hastaVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarnombre_completoVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarnombre_completoVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarrucVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarrucVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarnombre_productoVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarnombre_productoVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarcantidadVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarcantidadVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarprecioVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarprecioVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarmontoVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarmontoVentasResumidos);}
		if(this.ventasresumidosConstantesFunciones.resaltarcodigo_productoVentasResumidos!=null && this.jInternalFrameDetalleFormVentasResumidos!=null) {this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setBorder(this.ventasresumidosConstantesFunciones.resaltarcodigo_productoVentasResumidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasResumidos() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
	
		//this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostraridVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelidVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostraridVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarid_empresaVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelid_empresaVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarid_empresaVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarid_sucursalVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelid_sucursalVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarid_sucursalVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_desdeVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarfecha_emision_desdeVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelfecha_emision_desdeVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarfecha_emision_desdeVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_hastaVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarfecha_emision_hastaVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelfecha_emision_hastaVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarfecha_emision_hastaVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarnombre_completoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelnombre_completoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarnombre_completoVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarrucVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelrucVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarrucVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarnombre_productoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelnombre_productoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarnombre_productoVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarcantidadVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelcantidadVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarcantidadVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarprecioVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelprecioVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarprecioVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarmontoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelmontoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarmontoVentasResumidos);
		//this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarcodigo_productoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jPanelcodigo_productoVentasResumidos.setVisible(this.ventasresumidosConstantesFunciones.mostrarcodigo_productoVentasResumidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidos!=null) {
	
		this.jInternalFrameDetalleFormVentasResumidos.jLabelidVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activaridVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_empresaVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarid_empresaVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jComboBoxid_sucursalVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarid_sucursalVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_desdeVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarfecha_emision_desdeVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jDateChooserfecha_emision_hastaVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarfecha_emision_hastaVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_completoVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarnombre_completoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldrucVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarrucVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextAreanombre_productoVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarnombre_productoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcantidadVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarcantidadVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldprecioVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarprecioVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldmontoVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarmontoVentasResumidos);
		this.jInternalFrameDetalleFormVentasResumidos.jTextFieldcodigo_productoVentasResumidos.setEnabled(this.ventasresumidosConstantesFunciones.activarcodigo_productoVentasResumidos);
		}
	}
	
		
}