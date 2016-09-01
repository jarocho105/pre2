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

//import com.bydan.erp.facturacion.util.VentasResumidasMontosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasResumidasMontosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasResumidasMontosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasResumidasMontosBean;
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
import com.bydan.erp.comisiones.business.logic.*;

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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VentasResumidasMontosBeanSwingJInternalFrame extends VentasResumidasMontosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasResumidasMontosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasResumidasMontos> ventasresumidasmontosValidator = new ClassValidator<VentasResumidasMontos>(VentasResumidasMontos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasResumidasMontos ventasresumidasmontos;	
	public VentasResumidasMontos ventasresumidasmontosAux;
	public VentasResumidasMontos ventasresumidasmontosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasResumidasMontos ventasresumidasmontosTotales;
	public Long idVentasResumidasMontosActual;
	public Long iIdNuevoVentasResumidasMontos=0L;
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

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
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
	
	public Boolean isPermisoTodoVentasResumidasMontos;
	public Boolean isPermisoNuevoVentasResumidasMontos;
	public Boolean isPermisoActualizarVentasResumidasMontos;
	public Boolean isPermisoActualizarOriginalVentasResumidasMontos;
	public Boolean isPermisoEliminarVentasResumidasMontos;
	public Boolean isPermisoGuardarCambiosVentasResumidasMontos;
	public Boolean isPermisoConsultaVentasResumidasMontos;
	public Boolean isPermisoBusquedaVentasResumidasMontos;
	public Boolean isPermisoReporteVentasResumidasMontos;
	public Boolean isPermisoPaginacionMedioVentasResumidasMontos;
	public Boolean isPermisoPaginacionAltoVentasResumidasMontos;
	public Boolean isPermisoPaginacionTodoVentasResumidasMontos;
	public Boolean isPermisoCopiarVentasResumidasMontos;
	public Boolean isPermisoVerFormVentasResumidasMontos;
	public Boolean isPermisoDuplicarVentasResumidasMontos;
	public Boolean isPermisoOrdenVentasResumidasMontos;
	
	
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
	
	public VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosReturnGeneral;
	public VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasResumidasMontos=false;
	public Boolean esParaAccionDesdeFormularioVentasResumidasMontos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasResumidasMontosSessionBeanAdditional ventasresumidasmontosSessionBeanAdditional=null;
	
	public VentasResumidasMontosSessionBeanAdditional getVentasResumidasMontosSessionBeanAdditional() {
		return this.ventasresumidasmontosSessionBeanAdditional;
	}
	
	public void setVentasResumidasMontosSessionBeanAdditional(VentasResumidasMontosSessionBeanAdditional ventasresumidasmontosSessionBeanAdditional) {
		try {
			this.ventasresumidasmontosSessionBeanAdditional=ventasresumidasmontosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasResumidasMontosBeanSwingJInternalFrameAdditional ventasresumidasmontosBeanSwingJInternalFrameAdditional=null;
	//public class VentasResumidasMontosBeanSwingJInternalFrame
	
	public VentasResumidasMontosBeanSwingJInternalFrameAdditional getVentasResumidasMontosBeanSwingJInternalFrameAdditional() {
		return this.ventasresumidasmontosBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasResumidasMontosBeanSwingJInternalFrameAdditional(VentasResumidasMontosBeanSwingJInternalFrameAdditional ventasresumidasmontosBeanSwingJInternalFrameAdditional) {
		try {
			this.ventasresumidasmontosBeanSwingJInternalFrameAdditional=ventasresumidasmontosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasResumidasMontosLogic ventasresumidasmontosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasResumidasMontos ventasresumidasmontosBean;
	public VentasResumidasMontosConstantesFunciones ventasresumidasmontosConstantesFunciones;
	//public VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<VentasResumidasMontos> ventasresumidasmontoss;	
	//public List<VentasResumidasMontos> ventasresumidasmontossEliminados;
	//public List<VentasResumidasMontos> ventasresumidasmontossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaDuplicarVentasResumidasMontos=true;
	public Boolean isVisibilidadCeldaCopiarVentasResumidasMontos=true;
	public Boolean isVisibilidadCeldaVerFormVentasResumidasMontos=true;
	public Boolean isVisibilidadCeldaOrdenVentasResumidasMontos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaModificarVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaActualizarVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaEliminarVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaCancelarVentasResumidasMontos=false;
	public Boolean isVisibilidadCeldaGuardarVentasResumidasMontos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasResumidasMontos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoVentasResumidasMontos() {
		return this.iIdNuevoVentasResumidasMontos;
	}

	public void setiIdNuevoVentasResumidasMontos(Long iIdNuevoVentasResumidasMontos) {
		this.iIdNuevoVentasResumidasMontos = iIdNuevoVentasResumidasMontos;
	}
	
	public Long getidVentasResumidasMontosActual() {
		return this.idVentasResumidasMontosActual;
	}

	public void setidVentasResumidasMontosActual(Long idVentasResumidasMontosActual) {
		this.idVentasResumidasMontosActual = idVentasResumidasMontosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasResumidasMontos getventasresumidasmontos() {
		return this.ventasresumidasmontos;
	}

	public void setventasresumidasmontos(VentasResumidasMontos ventasresumidasmontos) {
		this.ventasresumidasmontos = ventasresumidasmontos;
	}
	
	public VentasResumidasMontos getventasresumidasmontosAux() {
		return this.ventasresumidasmontosAux;
	}

	public void setventasresumidasmontosAux(VentasResumidasMontos ventasresumidasmontosAux) {
		this.ventasresumidasmontosAux = ventasresumidasmontosAux;
	}				
	
	public VentasResumidasMontos getventasresumidasmontosAnterior() {
		return this.ventasresumidasmontosAnterior;
	}

	public void setventasresumidasmontosAnterior(VentasResumidasMontos ventasresumidasmontosAnterior) {
		this.ventasresumidasmontosAnterior = ventasresumidasmontosAnterior;
	}	
	
	public VentasResumidasMontos getventasresumidasmontosTotales() {
		return this.ventasresumidasmontosTotales;
	}

	public void setventasresumidasmontosTotales(VentasResumidasMontos ventasresumidasmontosTotales) {
		this.ventasresumidasmontosTotales = ventasresumidasmontosTotales;
	}	
	
	public VentasResumidasMontos getventasresumidasmontosBean() {
		return this.ventasresumidasmontosBean;
	}

	public void setventasresumidasmontosBean(VentasResumidasMontos ventasresumidasmontosBean) {
		this.ventasresumidasmontosBean = ventasresumidasmontosBean;
	}	
	
	public VentasResumidasMontosParameterReturnGeneral getventasresumidasmontosReturnGeneral() {
		return this.ventasresumidasmontosReturnGeneral;
	}

	public void setventasresumidasmontosReturnGeneral(VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosReturnGeneral) {
		this.ventasresumidasmontosReturnGeneral = ventasresumidasmontosReturnGeneral;
	}	
	
	
	public Long id_vendedorBusquedaVentasResumidasMontos=-1L;

	public Long getid_vendedorBusquedaVentasResumidasMontos() {
		return this.id_vendedorBusquedaVentasResumidasMontos;
	}

	public void setid_vendedorBusquedaVentasResumidasMontos(Long id_vendedorBusquedaVentasResumidasMontos) {
		this.id_vendedorBusquedaVentasResumidasMontos = id_vendedorBusquedaVentasResumidasMontos;
	}

;
	public Date fecha_emision_desdeBusquedaVentasResumidasMontos=new Date();

	public Date getfecha_emision_desdeBusquedaVentasResumidasMontos() {
		return this.fecha_emision_desdeBusquedaVentasResumidasMontos;
	}

	public void setfecha_emision_desdeBusquedaVentasResumidasMontos(Date fecha_emision_desdeBusquedaVentasResumidasMontos) {
		this.fecha_emision_desdeBusquedaVentasResumidasMontos = fecha_emision_desdeBusquedaVentasResumidasMontos;
	}

;
	public Date fecha_emision_hastaBusquedaVentasResumidasMontos=new Date();

	public Date getfecha_emision_hastaBusquedaVentasResumidasMontos() {
		return this.fecha_emision_hastaBusquedaVentasResumidasMontos;
	}

	public void setfecha_emision_hastaBusquedaVentasResumidasMontos(Date fecha_emision_hastaBusquedaVentasResumidasMontos) {
		this.fecha_emision_hastaBusquedaVentasResumidasMontos = fecha_emision_hastaBusquedaVentasResumidasMontos;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentasResumidasMontosLogic getVentasResumidasMontosLogic()	{		
		return ventasresumidasmontosLogic;
	}

	public void setVentasResumidasMontosLogic(VentasResumidasMontosLogic ventasresumidasmontosLogic) {
		this.ventasresumidasmontosLogic = ventasresumidasmontosLogic;
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
	
	public Boolean getIsEsNuevoVentasResumidasMontos() {
		return isEsNuevoVentasResumidasMontos;
	}

	public void setIsEsNuevoVentasResumidasMontos(Boolean isEsNuevoVentasResumidasMontos) {
		this.isEsNuevoVentasResumidasMontos = isEsNuevoVentasResumidasMontos;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasResumidasMontos() {
		return esParaAccionDesdeFormularioVentasResumidasMontos;
	}
	
	public void setEsParaAccionDesdeFormularioVentasResumidasMontos(Boolean esParaAccionDesdeFormularioVentasResumidasMontos) {
		this.esParaAccionDesdeFormularioVentasResumidasMontos = esParaAccionDesdeFormularioVentasResumidasMontos;
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

			if(this.ventasresumidasmontosSessionBean==null) {
				this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
			}

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventasresumidasmontosSessionBean.getlidEmpresaActual());
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

			if(this.ventasresumidasmontosSessionBean==null) {
				this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
			}

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventasresumidasmontosSessionBean.getlidSucursalActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.ventasresumidasmontosSessionBean==null) {
				this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
			}

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(ventasresumidasmontosSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

					if(this.ventasresumidasmontos!=null) {
						this.ventasresumidasmontos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasResumidasMontos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasResumidasMontosGenerico)throws Exception
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
				jComboBoxid_empresaVentasResumidasMontosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasResumidasMontosGenerico!=null && jComboBoxid_empresaVentasResumidasMontosGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasResumidasMontosGenerico.setSelectedIndex(0);
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

					if(this.ventasresumidasmontos!=null) {
						this.ventasresumidasmontos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentasResumidasMontos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentasResumidasMontosGenerico)throws Exception
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
				jComboBoxid_sucursalVentasResumidasMontosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentasResumidasMontosGenerico!=null && jComboBoxid_sucursalVentasResumidasMontosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentasResumidasMontosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.ventasresumidasmontos!=null) {
						this.ventasresumidasmontos.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorVentasResumidasMontos.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasResumidasMontos") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos!=null) {
						jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos!=null) {
							//jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorVentasResumidasMontosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorVentasResumidasMontosGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorVentasResumidasMontosGenerico!=null && jComboBoxid_vendedorVentasResumidasMontosGenerico.getItemCount()>0) {
					jComboBoxid_vendedorVentasResumidasMontosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasResumidasMontos ventasresumidasmontos,JComboBox jComboBoxid_empresaVentasResumidasMontosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasResumidasMontosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasResumidasMontosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventasresumidasmontos.setid_empresa(empresaAux.getId());
				ventasresumidasmontos.setempresa_descripcion(VentasResumidasMontosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventasresumidasmontos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentasResumidasMontos ventasresumidasmontos,JComboBox jComboBoxid_sucursalVentasResumidasMontosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentasResumidasMontosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentasResumidasMontosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventasresumidasmontos.setid_sucursal(sucursalAux.getId());
				ventasresumidasmontos.setsucursal_descripcion(VentasResumidasMontosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventasresumidasmontos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(VentasResumidasMontos ventasresumidasmontos,JComboBox jComboBoxid_vendedorVentasResumidasMontosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorVentasResumidasMontosGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorVentasResumidasMontosGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				ventasresumidasmontos.setid_vendedor(vendedorAux.getId());
				ventasresumidasmontos.setvendedor_descripcion(VentasResumidasMontosConstantesFunciones.getVendedorDescripcion(vendedorAux));
				ventasresumidasmontos.setVendedor(vendedorAux);			}
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

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
					}

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
					}

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { 
					}

					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasResumidasMontos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.addItem(vendedor);
							}
						}

						if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVentasResumidasMontos() throws Exception {
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
		
	public VentasResumidasMontosParameterReturnGeneral getVentasResumidasMontosParameterGeneral() {
		return this.ventasresumidasmontosParameterGeneral;
	}
	
	public void setVentasResumidasMontosParameterGeneral(VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosParameterGeneral) {
		this.ventasresumidasmontosParameterGeneral = ventasresumidasmontosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasResumidasMontos() {
		return isPermisoTodoVentasResumidasMontos;
	}

	public void setIsPermisoTodoVentasResumidasMontos(Boolean isPermisoTodoVentasResumidasMontos) {
		this.isPermisoTodoVentasResumidasMontos = isPermisoTodoVentasResumidasMontos;
	}

	public Boolean getIsPermisoNuevoVentasResumidasMontos() {
		return isPermisoNuevoVentasResumidasMontos;
	}

	public void setIsPermisoNuevoVentasResumidasMontos(Boolean isPermisoNuevoVentasResumidasMontos) {
		this.isPermisoNuevoVentasResumidasMontos = isPermisoNuevoVentasResumidasMontos;
	}

	public Boolean getIsPermisoActualizarVentasResumidasMontos() {
		return isPermisoActualizarVentasResumidasMontos;
	}

	public void setIsPermisoActualizarVentasResumidasMontos(Boolean isPermisoActualizarVentasResumidasMontos) {
		this.isPermisoActualizarVentasResumidasMontos = isPermisoActualizarVentasResumidasMontos;
	}

	public Boolean getIsPermisoEliminarVentasResumidasMontos() {
		return isPermisoEliminarVentasResumidasMontos;
	}

	public void setIsPermisoEliminarVentasResumidasMontos(Boolean isPermisoEliminarVentasResumidasMontos) {
		this.isPermisoEliminarVentasResumidasMontos = isPermisoEliminarVentasResumidasMontos;
	}

	public Boolean getIsPermisoGuardarCambiosVentasResumidasMontos() {
		return isPermisoGuardarCambiosVentasResumidasMontos;
	}

	public void setIsPermisoGuardarCambiosVentasResumidasMontos(Boolean isPermisoGuardarCambiosVentasResumidasMontos) {
		this.isPermisoGuardarCambiosVentasResumidasMontos = isPermisoGuardarCambiosVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoConsultaVentasResumidasMontos() {
		return isPermisoConsultaVentasResumidasMontos;
	}

	public void setIsPermisoConsultaVentasResumidasMontos(Boolean isPermisoConsultaVentasResumidasMontos) {
		this.isPermisoConsultaVentasResumidasMontos = isPermisoConsultaVentasResumidasMontos;
	}

	public Boolean getIsPermisoBusquedaVentasResumidasMontos() {
		return isPermisoBusquedaVentasResumidasMontos;
	}

	public void setIsPermisoBusquedaVentasResumidasMontos(Boolean isPermisoBusquedaVentasResumidasMontos) {
		this.isPermisoBusquedaVentasResumidasMontos = isPermisoBusquedaVentasResumidasMontos;
	}

	public Boolean getIsPermisoReporteVentasResumidasMontos() {
		return isPermisoReporteVentasResumidasMontos;
	}

	public void setIsPermisoReporteVentasResumidasMontos(Boolean isPermisoReporteVentasResumidasMontos) {
		this.isPermisoReporteVentasResumidasMontos = isPermisoReporteVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasResumidasMontos() {
		return isPermisoPaginacionMedioVentasResumidasMontos;
	}

	public void setIsPermisoPaginacionMedioVentasResumidasMontos(Boolean isPermisoPaginacionMedioVentasResumidasMontos) {
		this.isPermisoPaginacionMedioVentasResumidasMontos = isPermisoPaginacionMedioVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasResumidasMontos() {
		return isPermisoPaginacionTodoVentasResumidasMontos;
	}

	public void setIsPermisoPaginacionTodoVentasResumidasMontos(Boolean isPermisoPaginacionTodoVentasResumidasMontos) {
		this.isPermisoPaginacionTodoVentasResumidasMontos = isPermisoPaginacionTodoVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasResumidasMontos() {
		return isPermisoPaginacionAltoVentasResumidasMontos;
	}

	public void setIsPermisoPaginacionAltoVentasResumidasMontos(Boolean isPermisoPaginacionAltoVentasResumidasMontos) {
		this.isPermisoPaginacionAltoVentasResumidasMontos = isPermisoPaginacionAltoVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoCopiarVentasResumidasMontos() {
		return isPermisoCopiarVentasResumidasMontos;
	}

	public void setIsPermisoCopiarVentasResumidasMontos(Boolean isPermisoCopiarVentasResumidasMontos) {
		this.isPermisoCopiarVentasResumidasMontos = isPermisoCopiarVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoVerFormVentasResumidasMontos() {
		return isPermisoVerFormVentasResumidasMontos;
	}

	public void setIsPermisoVerFormVentasResumidasMontos(Boolean isPermisoVerFormVentasResumidasMontos) {
		this.isPermisoVerFormVentasResumidasMontos = isPermisoVerFormVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoDuplicarVentasResumidasMontos() {
		return isPermisoDuplicarVentasResumidasMontos;
	}

	public void setIsPermisoDuplicarVentasResumidasMontos(Boolean isPermisoDuplicarVentasResumidasMontos) {
		this.isPermisoDuplicarVentasResumidasMontos = isPermisoDuplicarVentasResumidasMontos;
	}
	
	public Boolean getIsPermisoOrdenVentasResumidasMontos() {
		return isPermisoOrdenVentasResumidasMontos;
	}

	public void setIsPermisoOrdenVentasResumidasMontos(Boolean isPermisoOrdenVentasResumidasMontos) {
		this.isPermisoOrdenVentasResumidasMontos = isPermisoOrdenVentasResumidasMontos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasResumidasMontos() {
		return isVisibilidadCeldaNuevoVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaNuevoVentasResumidasMontos(Boolean isVisibilidadCeldaNuevoVentasResumidasMontos) {
		this.isVisibilidadCeldaNuevoVentasResumidasMontos = isVisibilidadCeldaNuevoVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasResumidasMontos() {
		return isVisibilidadCeldaDuplicarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaDuplicarVentasResumidasMontos(Boolean isVisibilidadCeldaDuplicarVentasResumidasMontos) {
		this.isVisibilidadCeldaDuplicarVentasResumidasMontos = isVisibilidadCeldaDuplicarVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasResumidasMontos() {
		return isVisibilidadCeldaCopiarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaCopiarVentasResumidasMontos(Boolean isVisibilidadCeldaCopiarVentasResumidasMontos) {
		this.isVisibilidadCeldaCopiarVentasResumidasMontos = isVisibilidadCeldaCopiarVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasResumidasMontos() {
		return isVisibilidadCeldaVerFormVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaVerFormVentasResumidasMontos(Boolean isVisibilidadCeldaVerFormVentasResumidasMontos) {
		this.isVisibilidadCeldaVerFormVentasResumidasMontos = isVisibilidadCeldaVerFormVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasResumidasMontos() {
		return isVisibilidadCeldaOrdenVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaOrdenVentasResumidasMontos(Boolean isVisibilidadCeldaOrdenVentasResumidasMontos) {
		this.isVisibilidadCeldaOrdenVentasResumidasMontos = isVisibilidadCeldaOrdenVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasResumidasMontos() {
		return isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasResumidasMontos(Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos) {
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos = isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasResumidasMontos() {
		return isVisibilidadCeldaModificarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaModificarVentasResumidasMontos(Boolean isVisibilidadCeldaModificarVentasResumidasMontos) {
		this.isVisibilidadCeldaModificarVentasResumidasMontos = isVisibilidadCeldaModificarVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasResumidasMontos() {
		return isVisibilidadCeldaActualizarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaActualizarVentasResumidasMontos(Boolean isVisibilidadCeldaActualizarVentasResumidasMontos) {
		this.isVisibilidadCeldaActualizarVentasResumidasMontos = isVisibilidadCeldaActualizarVentasResumidasMontos;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasResumidasMontos() {
		return isVisibilidadCeldaEliminarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaEliminarVentasResumidasMontos(Boolean isVisibilidadCeldaEliminarVentasResumidasMontos) {
		this.isVisibilidadCeldaEliminarVentasResumidasMontos = isVisibilidadCeldaEliminarVentasResumidasMontos;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasResumidasMontos() {
		return isVisibilidadCeldaCancelarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaCancelarVentasResumidasMontos(Boolean isVisibilidadCeldaCancelarVentasResumidasMontos) {
		this.isVisibilidadCeldaCancelarVentasResumidasMontos = isVisibilidadCeldaCancelarVentasResumidasMontos;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasResumidasMontos() {
		return isVisibilidadCeldaGuardarVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaGuardarVentasResumidasMontos(Boolean isVisibilidadCeldaGuardarVentasResumidasMontos) {
		this.isVisibilidadCeldaGuardarVentasResumidasMontos = isVisibilidadCeldaGuardarVentasResumidasMontos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasResumidasMontos() {
		return isVisibilidadCeldaGuardarCambiosVentasResumidasMontos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasResumidasMontos(Boolean isVisibilidadCeldaGuardarCambiosVentasResumidasMontos) {
		this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos = isVisibilidadCeldaGuardarCambiosVentasResumidasMontos;
	}
		
	public VentasResumidasMontosSessionBean getventasresumidasmontosSessionBean() {
		return this.ventasresumidasmontosSessionBean;
	}
	
	public void setventasresumidasmontosSessionBean(VentasResumidasMontosSessionBean ventasresumidasmontosSessionBean) {
		this.ventasresumidasmontosSessionBean=ventasresumidasmontosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasResumidasMontos() {
		return this.isVisibilidadBusquedaVentasResumidasMontos;
	}

	public void setisVisibilidadBusquedaVentasResumidasMontos(Boolean isVisibilidadBusquedaVentasResumidasMontos) {
		this.isVisibilidadBusquedaVentasResumidasMontos=isVisibilidadBusquedaVentasResumidasMontos;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventasresumidasmontos,null);
				this.setActualParaGuardarSucursalForeignKey(ventasresumidasmontos,null);
				this.setActualParaGuardarVendedorForeignKey(ventasresumidasmontos,null);
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
	
	public void bugActualizarReferenciaActual(VentasResumidasMontos ventasresumidasmontos,VentasResumidasMontos ventasresumidasmontosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasResumidasMontos(ventasresumidasmontos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventasresumidasmontosAux.setId(ventasresumidasmontos.getId());
		ventasresumidasmontosAux.setVersionRow(ventasresumidasmontos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasResumidasMontos ventasresumidasmontosLocal) throws Exception {
		
		if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasResumidasMontos ventasresumidasmontosLocal) throws Exception {	
		if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventasresumidasmontosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventasresumidasmontosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				ventasresumidasmontosLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasResumidasMontosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventasresumidasmontosValidator.getInvalidValues(this.ventasresumidasmontos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasResumidasMontos ventasresumidasmontos,List<VentasResumidasMontos> ventasresumidasmontoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasResumidasMontos ventasresumidasmontos,List<VentasResumidasMontos> ventasresumidasmontoss) throws Exception {
		try	{			
			VentasResumidasMontosConstantesFunciones.actualizarSelectedLista(ventasresumidasmontos,ventasresumidasmontoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasResumidasMontos> ventasresumidasmontossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventasresumidasmontossLocal=this.ventasresumidasmontosLogic.getVentasResumidasMontoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventasresumidasmontossLocal=this.ventasresumidasmontoss;
			}
			//ARCHITECTURE
		
			for(VentasResumidasMontos ventasresumidasmontosLocal:ventasresumidasmontossLocal) {
				if(this.permiteMantenimiento(ventasresumidasmontosLocal) && ventasresumidasmontosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasResumidasMontosConstantesFunciones.getVentasResumidasMontosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_completoVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_vendedorVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.NOMBRETIPOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_tipo_facturaVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_emisionVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_vencimientoVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnumero_pre_impresoVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_ivaVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_sin_ivaVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.TOTALDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_descuentoVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.TOTALOTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_otroVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelsub_totalVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotalVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelivaVentasResumidasMontos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidasMontosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeldescripcionVentasResumidasMontos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_completoVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_vendedorVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_tipo_facturaVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_emisionVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_vencimientoVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnumero_pre_impresoVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_ivaVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_sin_ivaVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_descuentoVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_otroVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelsub_totalVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotalVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelivaVentasResumidasMontos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeldescripcionVentasResumidasMontos,"");
		
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
		this.iIdNuevoVentasResumidasMontos--;	
		
		
		this.ventasresumidasmontosAux=new VentasResumidasMontos();
		
		this.ventasresumidasmontosAux.setId(this.iIdNuevoVentasResumidasMontos);
		this.ventasresumidasmontosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidasmontosLogic.getVentasResumidasMontoss().add(this.ventasresumidasmontosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventasresumidasmontoss.add(this.ventasresumidasmontosAux);
		}
		//ARCHITECTURE
		
		this.ventasresumidasmontos=this.ventasresumidasmontosAux;
		
		if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontos);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidasMontos(this.ventasresumidasmontos);
		}
				
		//this.setDefaultControlesVentasResumidasMontos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasResumidasMontos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasResumidasMontos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidasMontos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidasMontos(this.ventasresumidasmontosBean,this.ventasresumidasmontos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral,this.ventasresumidasmontosBean,false);
		
		if(this.ventasresumidasmontosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos());
		}
		
		if(this.ventasresumidasmontosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos(),classes);//this.ventasresumidasmontosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasResumidasMontos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasResumidasMontos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.RecargarFormVentasResumidasMontos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasResumidasMontos(false);
						
			if(ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidasMontos();
			}
			
			this.actualizarVisualTableDatosVentasResumidasMontos();
			
			this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidasMontos(), this.getIndiceNuevoVentasResumidasMontos());
			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
						
			this.actualizarEstadoCeldasBotonesVentasResumidasMontos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasResumidasMontos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_desdeVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarfecha_emision_desdeVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_hastaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarfecha_emision_hastaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarnombre_completoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarnombre_vendedorVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarnombre_tipo_facturaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarfecha_emisionVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarfecha_vencimientoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarnumero_pre_impresoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activartotal_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activartotal_sin_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activartotal_descuentoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activartotal_otroVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarsub_totalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activartotalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activardescripcionVentasResumidasMontos);	
		//
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarid_empresaVentasResumidasMontos);//
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarid_sucursalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setEnabled(isHabilitar && this.ventasresumidasmontosConstantesFunciones.activarid_vendedorVentasResumidasMontos);
	};
	
	public void setDefaultControlesVentasResumidasMontos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasResumidasMontos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(true);			
			this.ventasresumidasmontosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.setVisible(true);
			
					
		} else {
			//this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(false);			
			this.ventasresumidasmontosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasResumidasMontos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				if(ventasresumidasmontosAux.getId().equals(this.iIdNuevoVentasResumidasMontos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontoss) {
				if(ventasresumidasmontosAux.getId().equals(this.iIdNuevoVentasResumidasMontos)) {
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
	
	public int getIndiceActualVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				if(ventasresumidasmontosAux.getId().equals(ventasresumidasmontos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontoss) {
				if(ventasresumidasmontosAux.getId().equals(ventasresumidasmontos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				if(ventasresumidasmontosAux.getVentasResumidasMontosOriginal().getId().equals(ventasresumidasmontosOriginal.getId())) {
					existe=true;
					ventasresumidasmontosOriginal.setId(ventasresumidasmontosAux.getId());
					ventasresumidasmontosOriginal.setVersionRow(ventasresumidasmontosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontoss) {
				if(ventasresumidasmontosAux.getVentasResumidasMontosOriginal().getId().equals(ventasresumidasmontosOriginal.getId())) {
					existe=true;
					ventasresumidasmontosOriginal.setId(ventasresumidasmontosAux.getId());
					ventasresumidasmontosOriginal.setVersionRow(ventasresumidasmontosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasResumidasMontos(Boolean esParaCancelar) throws Exception {
		ventasresumidasmontossAux=new ArrayList<VentasResumidasMontos>();
		ventasresumidasmontosAux=new VentasResumidasMontos();
		
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
					if(ventasresumidasmontosAux.getId()<0) {
						ventasresumidasmontossAux.add(ventasresumidasmontosAux);
					}		
				}
				this.iIdNuevoVentasResumidasMontos=0L;
				this.ventasresumidasmontosLogic.getVentasResumidasMontoss().removeAll(ventasresumidasmontossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontoss) {
					if(ventasresumidasmontosAux.getId()<0) {
						ventasresumidasmontossAux.add(ventasresumidasmontosAux);
					}		
				}
				this.iIdNuevoVentasResumidasMontos=0L;
				this.ventasresumidasmontoss.removeAll(ventasresumidasmontossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasResumidasMontos 
					&& this.ventasresumidasmontosLogic.getVentasResumidasMontoss().size()>0
					) {
					ventasresumidasmontosAux=this.ventasresumidasmontosLogic.getVentasResumidasMontoss().get(this.ventasresumidasmontosLogic.getVentasResumidasMontoss().size() - 1);
				
					if(ventasresumidasmontosAux.getId()<0) {
						this.ventasresumidasmontosLogic.getVentasResumidasMontoss().remove(ventasresumidasmontosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasResumidasMontos && this.ventasresumidasmontoss.size()>0) {
					ventasresumidasmontosAux=this.ventasresumidasmontoss.get(this.ventasresumidasmontoss.size() - 1);
				
					if(ventasresumidasmontosAux.getId()<0) {
						this.ventasresumidasmontoss.remove(ventasresumidasmontosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasResumidasMontos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventasresumidasmontos.getId()<0) {
				this.ventasresumidasmontosLogic.getVentasResumidasMontoss().remove(this.ventasresumidasmontos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventasresumidasmontos.getId()<0) {
				this.ventasresumidasmontoss.remove(this.ventasresumidasmontos);
			}
		}			
	}
	
	public void setEstadosInicialesVentasResumidasMontos(List<VentasResumidasMontos> ventasresumidasmontossAux) throws Exception {
		VentasResumidasMontosConstantesFunciones.setEstadosInicialesVentasResumidasMontos(ventasresumidasmontossAux);
	}
	
	public void setEstadosInicialesVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontosAux) throws Exception {
		VentasResumidasMontosConstantesFunciones.setEstadosInicialesVentasResumidasMontos(ventasresumidasmontosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasResumidasMontosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasResumidasMontosActual()) {
				if(!this.isEsNuevoVentasResumidasMontos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasResumidasMontos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasResumidasMontosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Resumidas Montos ?", "MANTENIMIENTO DE Ventas Resumidas Montos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasResumidasMontos ventasresumidasmontos) throws Exception {
		VentasResumidasMontosConstantesFunciones.seleccionarAsignar(this.ventasresumidasmontos,ventasresumidasmontos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasResumidasMontos=this.isPermisoActualizarOriginalVentasResumidasMontos;
			
			
			this.seleccionarAsignar(ventasresumidasmontos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasResumidasMontos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventasresumidasmontosSessionBean.setsFuncionBusquedaRapida(this.ventasresumidasmontosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasResumidasMontos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasResumidasMontos(esParaCancelar);				
				this.cancelarNuevoVentasResumidasMontos(esParaCancelar);								
			}
			
			this.ventasresumidasmontos=new VentasResumidasMontos();
			
			this.inicializarVentasResumidasMontos();
			
			this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasResumidasMontos() throws Exception {
		try {
			VentasResumidasMontosConstantesFunciones.inicializarVentasResumidasMontos(this.ventasresumidasmontos);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventasresumidasmontosLogic.getVentasResumidasMontoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasResumidasMontoss(String sAccionBusqueda,List<VentasResumidasMontos> ventasresumidasmontossParaReportes) throws Exception {
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
					sPathReporteFinal="VentasResumidasMontos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasResumidasMontosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasResumidasMontosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasResumidasMontos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Resumidas Montoses");		
		parameters.put("busquedapor", VentasResumidasMontosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasResumidasMontos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasResumidasMontosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasResumidasMontosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasResumidasMontos=new JRBeanArrayDataSource(VentasResumidasMontosJInternalFrame.TraerVentasResumidasMontosBeans(ventasresumidasmontossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasResumidasMontos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasResumidasMontosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasResumidasMontosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasResumidasMontosBean.TraerVentasResumidasMontosBeans(ventasresumidasmontossParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontosActionPerformed(null);
					//this.generarExcelReporteVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasResumidasMontoss(sAccionBusqueda,sTipoArchivoReporte,ventasresumidasmontossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasResumidasMontoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidasMontos> ventasresumidasmontossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidasMontoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidasMontos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasResumidasMontos ventasresumidasmontos : ventasresumidasmontossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasResumidasMontosConstantesFunciones.generarExcelReporteDataVentasResumidasMontos("NORMAL",row,workbook,ventasresumidasmontos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasResumidasMontos(String sTipo,Row row,Workbook workbook) {
		
		VentasResumidasMontosConstantesFunciones.generarExcelReporteHeaderVentasResumidasMontos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasResumidasMontoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidasMontos> ventasresumidasmontossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidasMontoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasResumidasMontos ventasresumidasmontos : ventasresumidasmontossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasResumidasMontosConstantesFunciones.getVentasResumidasMontosDescripcion(ventasresumidasmontos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getnombre_tipo_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.gettotal_descuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.gettotal_otro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidasmontos.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasResumidasMontoss(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidasMontos> ventasresumidasmontossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasResumidasMontos> ventasresumidasmontossRespaldo=null;
		
		classes=VentasResumidasMontosConstantesFunciones.getClassesRelationshipsOfVentasResumidasMontos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventasresumidasmontosLogic.setDatosCliente(this.datosCliente);
		this.ventasresumidasmontosLogic.setDatosDeep(this.datosDeep);
		this.ventasresumidasmontosLogic.setIsConDeep(true);
		
		ventasresumidasmontossRespaldo=this.ventasresumidasmontosLogic.getVentasResumidasMontoss();
		
		this.ventasresumidasmontosLogic.setVentasResumidasMontoss(ventasresumidasmontossParaReportes);	
		this.ventasresumidasmontosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventasresumidasmontossParaReportes=this.ventasresumidasmontosLogic.getVentasResumidasMontoss();
		this.ventasresumidasmontosLogic.setVentasResumidasMontoss(ventasresumidasmontossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidasMontoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidasMontos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasResumidasMontos ventasresumidasmontos : ventasresumidasmontossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasResumidasMontos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasResumidasMontosConstantesFunciones.generarExcelReporteDataVentasResumidasMontos("NORMAL",row,workbook,ventasresumidasmontos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasResumidasMontosConstantesFunciones.getVentasResumidasMontosDescripcion(ventasresumidasmontos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasResumidasMontos() throws Exception {		
		this.startProcessVentasResumidasMontos(true);
	}
	
	public void startProcessVentasResumidasMontos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasResumidasMontos ,this.jPanelParametrosReportesVentasResumidasMontos, this.jScrollPanelDatosVentasResumidasMontos,this.jPanelPaginacionVentasResumidasMontos, this.jScrollPanelDatosEdicionVentasResumidasMontos, this.jPanelAccionesVentasResumidasMontos,this.jPanelAccionesFormularioVentasResumidasMontos,this.jmenuBarVentasResumidasMontos,this.jmenuBarDetalleVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidasMontos=this.jTabbedPaneBusquedasVentasResumidasMontos; 
		
		final JPanel jPanelParametrosReportesVentasResumidasMontos=this.jPanelParametrosReportesVentasResumidasMontos;
		//final JScrollPane jScrollPanelDatosVentasResumidasMontos=this.jScrollPanelDatosVentasResumidasMontos;
		final JTable jTableDatosVentasResumidasMontos=this.jTableDatosVentasResumidasMontos;		
		final JPanel jPanelPaginacionVentasResumidasMontos=this.jPanelPaginacionVentasResumidasMontos;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidasMontos=this.jScrollPanelDatosEdicionVentasResumidasMontos;
		final JPanel jPanelAccionesVentasResumidasMontos=this.jPanelAccionesVentasResumidasMontos;
		
		JPanel jPanelCamposAuxiliarVentasResumidasMontos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidasMontos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			jPanelCamposAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelCamposVentasResumidasMontos;
			jPanelAccionesFormularioAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelAccionesFormularioVentasResumidasMontos;
		}
		
		final JPanel jPanelCamposVentasResumidasMontos=jPanelCamposAuxiliarVentasResumidasMontos;
		final JPanel jPanelAccionesFormularioVentasResumidasMontos=jPanelAccionesFormularioAuxiliarVentasResumidasMontos;
		
		
		final JMenuBar jmenuBarVentasResumidasMontos=this.jmenuBarVentasResumidasMontos;
		final JToolBar jTtoolBarVentasResumidasMontos=this.jTtoolBarVentasResumidasMontos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidasMontos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidasMontos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			jmenuBarDetalleAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jmenuBarDetalleVentasResumidasMontos;
			jTtoolBarDetalleAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jTtoolBarDetalleVentasResumidasMontos;
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidasMontos=jmenuBarDetalleAuxiliarVentasResumidasMontos;
		final JToolBar jTtoolBarDetalleVentasResumidasMontos=jTtoolBarDetalleAuxiliarVentasResumidasMontos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidasMontos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidasMontos;
			processRunnable.jTableDatos=jTableDatosVentasResumidasMontos;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidasMontos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidasMontos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidasMontos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidasMontos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidasMontos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidasMontos;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidasMontos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidasMontos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidasMontos ,jPanelParametrosReportesVentasResumidasMontos,jTableDatosVentasResumidasMontos, /*jScrollPanelDatosVentasResumidasMontos,*/jPanelCamposVentasResumidasMontos,jPanelPaginacionVentasResumidasMontos, /*jScrollPanelDatosEdicionVentasResumidasMontos,*/ jPanelAccionesVentasResumidasMontos,jPanelAccionesFormularioVentasResumidasMontos,jmenuBarVentasResumidasMontos,jmenuBarDetalleVentasResumidasMontos,jTtoolBarVentasResumidasMontos,jTtoolBarDetalleVentasResumidasMontos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidasMontos ,jPanelParametrosReportesVentasResumidasMontos, jScrollPanelDatosVentasResumidasMontos,jPanelPaginacionVentasResumidasMontos, jScrollPanelDatosEdicionVentasResumidasMontos, jPanelAccionesVentasResumidasMontos,jPanelAccionesFormularioVentasResumidasMontos,jmenuBarVentasResumidasMontos,jmenuBarDetalleVentasResumidasMontos,jTtoolBarVentasResumidasMontos,jTtoolBarDetalleVentasResumidasMontos);
						
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
	
	public void finishProcessVentasResumidasMontos() {// throws Exception 
		this.finishProcessVentasResumidasMontos(true);
	}
	
	public void finishProcessVentasResumidasMontos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasResumidasMontos ,this.jPanelParametrosReportesVentasResumidasMontos, this.jScrollPanelDatosVentasResumidasMontos,this.jPanelPaginacionVentasResumidasMontos, this.jScrollPanelDatosEdicionVentasResumidasMontos, this.jPanelAccionesVentasResumidasMontos,this.jPanelAccionesFormularioVentasResumidasMontos,this.jmenuBarVentasResumidasMontos,this.jmenuBarDetalleVentasResumidasMontos,this.jTtoolBarVentasResumidasMontos,this.jTtoolBarDetalleVentasResumidasMontos);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidasMontos=this.jTabbedPaneBusquedasVentasResumidasMontos; 
		
		final JPanel jPanelParametrosReportesVentasResumidasMontos=this.jPanelParametrosReportesVentasResumidasMontos;
		//final JScrollPane jScrollPanelDatosVentasResumidasMontos=this.jScrollPanelDatosVentasResumidasMontos;
		final JTable jTableDatosVentasResumidasMontos=this.jTableDatosVentasResumidasMontos;		
		final JPanel jPanelPaginacionVentasResumidasMontos=this.jPanelPaginacionVentasResumidasMontos;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidasMontos=this.jScrollPanelDatosEdicionVentasResumidasMontos;
		final JPanel jPanelAccionesVentasResumidasMontos=this.jPanelAccionesVentasResumidasMontos;
		
		JPanel jPanelCamposAuxiliarVentasResumidasMontos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidasMontos=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			jPanelCamposAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelCamposVentasResumidasMontos;
			jPanelAccionesFormularioAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelAccionesFormularioVentasResumidasMontos;
		}
		
		final JPanel jPanelCamposVentasResumidasMontos=jPanelCamposAuxiliarVentasResumidasMontos;
		final JPanel jPanelAccionesFormularioVentasResumidasMontos=jPanelAccionesFormularioAuxiliarVentasResumidasMontos;
		
		
		final JMenuBar jmenuBarVentasResumidasMontos=this.jmenuBarVentasResumidasMontos;		
		final JToolBar jTtoolBarVentasResumidasMontos=this.jTtoolBarVentasResumidasMontos;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidasMontos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidasMontos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			jmenuBarDetalleAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jmenuBarDetalleVentasResumidasMontos;
			jTtoolBarDetalleAuxiliarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jTtoolBarDetalleVentasResumidasMontos;		
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidasMontos=jmenuBarDetalleAuxiliarVentasResumidasMontos;
		final JToolBar jTtoolBarDetalleVentasResumidasMontos=jTtoolBarDetalleAuxiliarVentasResumidasMontos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidasMontos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidasMontos;
			processRunnable.jTableDatos=jTableDatosVentasResumidasMontos;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidasMontos;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidasMontos;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidasMontos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidasMontos;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidasMontos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidasMontos;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidasMontos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidasMontos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasResumidasMontos ,jPanelParametrosReportesVentasResumidasMontos, jTableDatosVentasResumidasMontos,/*jScrollPanelDatosVentasResumidasMontos,*/jPanelCamposVentasResumidasMontos,jPanelPaginacionVentasResumidasMontos, /*jScrollPanelDatosEdicionVentasResumidasMontos,*/ jPanelAccionesVentasResumidasMontos,jPanelAccionesFormularioVentasResumidasMontos,jmenuBarVentasResumidasMontos,jmenuBarDetalleVentasResumidasMontos,jTtoolBarVentasResumidasMontos,jTtoolBarDetalleVentasResumidasMontos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasResumidasMontos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasResumidasMontos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasResumidasMontos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasResumidasMontos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasResumidasMontos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasResumidasMontos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasResumidasMontos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasResumidasMontos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasResumidasMontos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventasresumidasmontosConstantesFunciones.getsFinalQueryVentasResumidasMontos();
		String  finalQueryPaginacionTodos=this.ventasresumidasmontosConstantesFunciones.getsFinalQueryVentasResumidasMontos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasResumidasMontosConstantesFunciones.getArrayColumnasGlobalesNoVentasResumidasMontos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasResumidasMontosConstantesFunciones.getArrayColumnasGlobalesVentasResumidasMontos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasResumidasMontosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventasresumidasmontossEliminados= new ArrayList<VentasResumidasMontos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasResumidasMontos();
		
				///*VentasResumidasMontosSessionBean*/this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
			
			if(this.ventasresumidasmontosSessionBean==null) {
				this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
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
					this.iNumeroPaginacion=VentasResumidasMontosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasResumidasMontosConstantesFunciones.getClassesForeignKeysOfVentasResumidasMontos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventasresumidasmontos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventasresumidasmontossAux= new ArrayList<VentasResumidasMontos>();
			
				
			ventasresumidasmontosLogic.setDatosCliente(this.datosCliente);
			ventasresumidasmontosLogic.setDatosDeep(this.datosDeep);
			ventasresumidasmontosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasResumidasMontos")) {
				this.sDetalleReporte=VentasResumidasMontosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidasMontos(id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventasresumidasmontosLogic.getVentasResumidasMontossBusquedaVentasResumidasMontos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidasMontosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidasMontos(id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidasMontosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidasMontos(id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventasresumidasmontosLogic.getVentasResumidasMontoss()==null||ventasresumidasmontosLogic.getVentasResumidasMontoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventasresumidasmontoss==null|| ventasresumidasmontoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidasmontossAux=new ArrayList<VentasResumidasMontos>();
						ventasresumidasmontossAux.addAll(ventasresumidasmontosLogic.getVentasResumidasMontoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidasmontossAux=new ArrayList<VentasResumidasMontos>();
							ventasresumidasmontossAux.addAll(ventasresumidasmontoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventasresumidasmontosLogic.getVentasResumidasMontossBusquedaVentasResumidasMontos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidasMontosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidasMontos(id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidasMontosConstantesFunciones.getDetalleIndiceBusquedaVentasResumidasMontos(id_vendedorBusquedaVentasResumidasMontos,fecha_emision_desdeBusquedaVentasResumidasMontos,fecha_emision_hastaBusquedaVentasResumidasMontos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasResumidasMontoss("BusquedaVentasResumidasMontos",ventasresumidasmontosLogic.getVentasResumidasMontoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasResumidasMontoss("BusquedaVentasResumidasMontos",ventasresumidasmontoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidasmontosLogic.setVentasResumidasMontoss(new ArrayList<VentasResumidasMontos>());
						ventasresumidasmontosLogic.getVentasResumidasMontoss().addAll(ventasresumidasmontossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidasmontoss=new ArrayList<VentasResumidasMontos>();
							ventasresumidasmontoss.addAll(ventasresumidasmontossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasResumidasMontos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasResumidasMontos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidasmontosLogic.getVentasResumidasMontoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidasmontoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidasmontosLogic.getVentasResumidasMontoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidasmontoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasResumidasMontos ventasresumidasmontos) {
		Boolean permite=true;
		
		if(this.ventasresumidasmontos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasResumidasMontosConstantesFunciones.getOrderByListaVentasResumidasMontos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasResumidasMontosConstantesFunciones.getOrderByListaVentasResumidasMontos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				if(ventasresumidasmontos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidasmontosTotales=ventasresumidasmontos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidasMontos ventasresumidasmontos:this.ventasresumidasmontoss) {
				if(ventasresumidasmontos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidasmontosTotales=ventasresumidasmontos;
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
			this.ventasresumidasmontosAux=new VentasResumidasMontos();
			this.ventasresumidasmontosAux.setsType(Constantes2.S_TOTALES);
			this.ventasresumidasmontosAux.setIsNew(false);
			this.ventasresumidasmontosAux.setIsChanged(false);
			this.ventasresumidasmontosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasResumidasMontosConstantesFunciones.TotalizarValoresFilaVentasResumidasMontos(this.ventasresumidasmontosLogic.getVentasResumidasMontoss(),this.ventasresumidasmontosAux);
				
				//this.ventasresumidasmontosLogic.getVentasResumidasMontoss().add(this.ventasresumidasmontosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasResumidasMontosConstantesFunciones.TotalizarValoresFilaVentasResumidasMontos(this.ventasresumidasmontoss,this.ventasresumidasmontosAux);
				
				this.ventasresumidasmontoss.add(this.ventasresumidasmontosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventasresumidasmontosTotales=new VentasResumidasMontos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidasmontosLogic.getVentasResumidasMontoss().remove(ventasresumidasmontosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidasmontoss.remove(ventasresumidasmontosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventasresumidasmontosTotales=new VentasResumidasMontos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				if(ventasresumidasmontos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidasmontosTotales=ventasresumidasmontos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidasMontosConstantesFunciones.TotalizarValoresFilaVentasResumidasMontos(this.ventasresumidasmontosLogic.getVentasResumidasMontoss(),ventasresumidasmontosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidasMontos ventasresumidasmontos:this.ventasresumidasmontoss) {
				if(ventasresumidasmontos.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidasmontosTotales=ventasresumidasmontos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidasMontosConstantesFunciones.TotalizarValoresFilaVentasResumidasMontos(this.ventasresumidasmontoss,ventasresumidasmontosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasResumidasMontossBusquedaVentasResumidasMontos()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasResumidasMontos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidasMontossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidasMontossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidasMontossFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasResumidasMontossBusquedaVentasResumidasMontos(String sFinalQuery,Long id_vendedor,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidasmontosLogic.getVentasResumidasMontossBusquedaVentasResumidasMontos(sFinalQuery,this.pagination,id_vendedor,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidasMontossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidasmontosLogic.getVentasResumidasMontossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidasMontossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidasmontosLogic.getVentasResumidasMontossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidasMontossFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidasmontosLogic.getVentasResumidasMontossFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosVentasResumidasMontos() {
		this.isPermisoTodoVentasResumidasMontos=false;
		this.isPermisoNuevoVentasResumidasMontos=false;
		this.isPermisoActualizarVentasResumidasMontos=false;
		this.isPermisoActualizarOriginalVentasResumidasMontos=false;
		this.isPermisoEliminarVentasResumidasMontos=false;
		this.isPermisoGuardarCambiosVentasResumidasMontos=false;
		this.isPermisoConsultaVentasResumidasMontos=true;
		this.isPermisoBusquedaVentasResumidasMontos=true;
		this.isPermisoReporteVentasResumidasMontos=true;
		this.isPermisoOrdenVentasResumidasMontos=false;		
		this.isPermisoPaginacionMedioVentasResumidasMontos=false;		
		this.isPermisoPaginacionAltoVentasResumidasMontos=false;		
		this.isPermisoPaginacionTodoVentasResumidasMontos=false;		
		this.isPermisoCopiarVentasResumidasMontos=false;		
		this.isPermisoVerFormVentasResumidasMontos=false;		
		this.isPermisoDuplicarVentasResumidasMontos=false;
		this.isPermisoOrdenVentasResumidasMontos=false;
	}
	
	public void setPermisosUsuarioVentasResumidasMontos(Boolean isPermiso) {
		this.isPermisoTodoVentasResumidasMontos=isPermiso;
		this.isPermisoNuevoVentasResumidasMontos=isPermiso;
		this.isPermisoActualizarVentasResumidasMontos=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidasMontos=isPermiso;
		this.isPermisoEliminarVentasResumidasMontos=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidasMontos=isPermiso;
		this.isPermisoConsultaVentasResumidasMontos=isPermiso;
		this.isPermisoBusquedaVentasResumidasMontos=isPermiso;
		this.isPermisoReporteVentasResumidasMontos=isPermiso;
		this.isPermisoOrdenVentasResumidasMontos=isPermiso;		
		this.isPermisoPaginacionMedioVentasResumidasMontos=isPermiso;		
		this.isPermisoPaginacionAltoVentasResumidasMontos=isPermiso;		
		this.isPermisoPaginacionTodoVentasResumidasMontos=isPermiso;		
		this.isPermisoCopiarVentasResumidasMontos=isPermiso;		
		this.isPermisoVerFormVentasResumidasMontos=isPermiso;		
		this.isPermisoDuplicarVentasResumidasMontos=isPermiso;
		this.isPermisoOrdenVentasResumidasMontos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasResumidasMontos(Boolean isPermiso) {
		//this.isPermisoTodoVentasResumidasMontos=isPermiso;
		this.isPermisoNuevoVentasResumidasMontos=isPermiso;
		this.isPermisoActualizarVentasResumidasMontos=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidasMontos=isPermiso;
		this.isPermisoEliminarVentasResumidasMontos=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidasMontos=isPermiso;
		//this.isPermisoConsultaVentasResumidasMontos=isPermiso;
		//this.isPermisoBusquedaVentasResumidasMontos=isPermiso;
		//this.isPermisoReporteVentasResumidasMontos=isPermiso;
		//this.isPermisoOrdenVentasResumidasMontos=isPermiso;		
		//this.isPermisoPaginacionMedioVentasResumidasMontos=isPermiso;		
		//this.isPermisoPaginacionAltoVentasResumidasMontos=isPermiso;		
		//this.isPermisoPaginacionTodoVentasResumidasMontos=isPermiso;		
		//this.isPermisoCopiarVentasResumidasMontos=isPermiso;		
		//this.isPermisoDuplicarVentasResumidasMontos=isPermiso;
		//this.isPermisoOrdenVentasResumidasMontos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidasMontosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasResumidasMontosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasResumidasMontos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidasMontosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasResumidasMontosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasResumidasMontosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasResumidasMontosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasResumidasMontos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasResumidasMontosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasResumidasMontosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasResumidasMontos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasResumidasMontos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasResumidasMontos=this.isPermisoActualizarVentasResumidasMontos;
			this.isPermisoEliminarVentasResumidasMontos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasResumidasMontos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasResumidasMontos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasResumidasMontos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasResumidasMontos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasResumidasMontos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidasMontos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasResumidasMontos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasResumidasMontos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasResumidasMontos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasResumidasMontos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasResumidasMontos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasResumidasMontos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidasMontos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasResumidasMontos.setToolTipText(this.jTableDatosVentasResumidasMontos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasResumidasMontos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasResumidasMontos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasResumidasMontosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasResumidasMontosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasResumidasMontos() throws Exception {
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
	public void inicializarCombosForeignKeyVentasResumidasMontosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasResumidasMontosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasResumidasMontosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasResumidasMontos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyVendedor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventasresumidasmontosSessionBean==null) {
				this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean();
			}

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.ventasresumidasmontosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVentasResumidasMontos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasResumidasMontos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasResumidasMontos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidasMontos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasResumidasMontos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidasMontos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasResumidasMontos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasResumidasMontos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasResumidasMontos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasResumidasMontos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasResumidasMontos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasResumidasMontos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public VentasResumidasMontosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasResumidasMontosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasResumidasMontosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventasresumidasmontosSessionBean=new VentasResumidasMontosSessionBean(); 
		this.ventasresumidasmontosConstantesFunciones=new VentasResumidasMontosConstantesFunciones(); 
		this.ventasresumidasmontosBean=new VentasResumidasMontos();//(this.ventasresumidasmontosConstantesFunciones); 		
		this.ventasresumidasmontosReturnGeneral=new VentasResumidasMontosParameterReturnGeneral(); 
		
		this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidasmontosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasResumidasMontosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasResumidasMontosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasResumidasMontosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasResumidasMontos(true);
			
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
			
			this.ventasresumidasmontosConstantesFunciones=new VentasResumidasMontosConstantesFunciones(); 
			this.ventasresumidasmontosBean=new VentasResumidasMontos();//this.ventasresumidasmontosConstantesFunciones); 			
			this.ventasresumidasmontosReturnGeneral=new VentasResumidasMontosParameterReturnGeneral(); 
		
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidas Montos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventasresumidasmontos=new VentasResumidasMontos();
			this.ventasresumidasmontoss = new ArrayList<VentasResumidasMontos>();
			this.ventasresumidasmontossAux = new ArrayList<VentasResumidasMontos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic=new VentasResumidasMontosLogic();
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			//this.ventasresumidasmontosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventasresumidasmontosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasResumidasMontos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidasMontos);	
					}
					
					if(this.jInternalFrameImportacionVentasResumidasMontos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidasMontos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasResumidasMontos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasResumidasMontos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidasMontos);
				this.jInternalFrameDetalleFormVentasResumidasMontos.setVisible(false);
				this.jInternalFrameDetalleFormVentasResumidasMontos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidasMontos);
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasResumidasMontos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidasMontos);
					this.jInternalFrameImportacionVentasResumidasMontos.setVisible(false);
					this.jInternalFrameImportacionVentasResumidasMontos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasResumidasMontos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidasMontos);
					this.jInternalFrameOrderByVentasResumidasMontos.setVisible(false);
					this.jInternalFrameOrderByVentasResumidasMontos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasResumidasMontosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasResumidasMontosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventasresumidasmontosReturnGeneral=new VentasResumidasMontosParameterReturnGeneral();
			
			this.ventasresumidasmontosParameterGeneral=new VentasResumidasMontosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventasresumidasmontosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasResumidasMontosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidasMontosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),this.ventasresumidasmontosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidasMontosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),this.ventasresumidasmontosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaDuplicarVentasResumidasMontos=true;
			this.isVisibilidadCeldaCopiarVentasResumidasMontos=true;
			this.isVisibilidadCeldaVerFormVentasResumidasMontos=true;
			this.isVisibilidadCeldaOrdenVentasResumidasMontos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			
			
			this.isVisibilidadBusquedaVentasResumidasMontos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasResumidasMontos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasResumidasMontos(false);
			
			this.setPermisosUsuarioVentasResumidasMontos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() 
				|| (this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado() && this.ventasresumidasmontosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasResumidasMontosClasesRelacionadas();
			}
			
			if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasResumidasMontosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasResumidasMontos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasResumidasMontos();
			}
			
			if(!this.isPermisoBusquedaVentasResumidasMontos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasResumidasMontosConstantesFunciones.getTiposSeleccionarVentasResumidasMontos());
				
				this.tiposColumnasSelect=VentasResumidasMontosConstantesFunciones.getTiposSeleccionarVentasResumidasMontos(true);
				
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
			//if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasResumidasMontos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasResumidasMontos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasResumidasMontos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidasMontos() ;
			
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
			this.vendedorLogic=new VendedorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventasresumidasmontosImplementable= (VentasResumidasMontosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidasMontosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventasresumidasmontosImplementableHome= (VentasResumidasMontosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidasMontosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventasresumidasmontoss= new ArrayList<VentasResumidasMontos>();
			this.ventasresumidasmontossEliminados= new ArrayList<VentasResumidasMontos>();
						
			this.isEsNuevoVentasResumidasMontos=false;
			this.esParaAccionDesdeFormularioVentasResumidasMontos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasResumidasMontos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasResumidasMontos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasResumidasMontosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasResumidasMontos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasResumidasMontos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasResumidasMontos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasResumidasMontos();
			}
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasResumidasMontos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasResumidasMontos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasResumidasMontos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasResumidasMontos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasResumidasMontos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasResumidasMontos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasResumidasMontos")) {
				iIndex=this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasResumidasMontos();	
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
	
	public void cargarCombosForeignKeyVentasResumidasMontos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasResumidasMontos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasResumidasMontos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasResumidasMontosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasResumidasMontos();
		
		this.cargarCombosFrameForeignKeyVentasResumidasMontos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasResumidasMontos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasResumidasMontos();
		}
	}
	
	

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVentasResumidasMontosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			
			if(jTableDatosVentasResumidasMontos.getRowCount()>=1) {
				jTableDatosVentasResumidasMontos.removeRowSelectionInterval(0, jTableDatosVentasResumidasMontos.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasResumidasMontos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasResumidasMontos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasResumidasMontos(true);			
			//this.ventasresumidasmontos=new VentasResumidasMontos();
			//this.ventasresumidasmontos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidasMontos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos() ;
			
			if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidasMontos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventasresumidasmontos);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);				
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasResumidasMontos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasResumidasMontosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasResumidasMontos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasResumidasMontos.getSelectedRows().length;			
			}
			
			ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasResumidasMontos--;			
				//VentasResumidasMontos ventasresumidasmontosAux= new VentasResumidasMontos();			
				//ventasresumidasmontosAux.setId(this.iIdNuevoVentasResumidasMontos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasResumidasMontos ventasresumidasmontosOrigen=new VentasResumidasMontos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasResumidasMontos ventasresumidasmontosOrigen : ventasresumidasmontossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventasresumidasmontosOrigen =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidasmontosOrigen =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasResumidasMontos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventasresumidasmontos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasResumidasMontos(ventasresumidasmontosOrigen,this.ventasresumidasmontos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidasmontosLogic.getVentasResumidasMontoss().add(this.ventasresumidasmontosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontoss.add(this.ventasresumidasmontosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
				
				this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidasMontos(), this.getIndiceNuevoVentasResumidasMontos());
				
				int iLastRow =  this.jTableDatosVentasResumidasMontos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidasMontos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidasMontos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();									
		
			VentasResumidasMontos ventasresumidasmontosOrigen=new VentasResumidasMontos();
			VentasResumidasMontos ventasresumidasmontosDestino=new VentasResumidasMontos();
				
			ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasResumidasMontos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventasresumidasmontossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasResumidasMontos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidasmontosOrigen =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidasmontosOrigen =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidasmontosDestino =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidasmontosDestino =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventasresumidasmontosOrigen =ventasresumidasmontossSeleccionados.get(0);
				ventasresumidasmontosDestino =ventasresumidasmontossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasResumidasMontos(ventasresumidasmontosOrigen,ventasresumidasmontosDestino,true,false);
				
				ventasresumidasmontosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventasresumidasmontosDestino,ventasresumidasmontosLogic.getVentasResumidasMontoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventasresumidasmontosDestino,ventasresumidasmontoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
				
				//this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidasMontos(), this.getIndiceNuevoVentasResumidasMontos());
				
				int iLastRow =  this.jTableDatosVentasResumidasMontos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidasMontos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidasMontos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasResumidasMontos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasResumidasMontos.setVisible(!isVisible);
			this.jPanelPaginacionVentasResumidasMontos.setVisible(!isVisible);
			this.jPanelAccionesVentasResumidasMontos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasResumidasMontos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasResumidasMontos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasResumidasMontos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasResumidasMontos();
			
			this.abrirFrameOrderByVentasResumidasMontos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasResumidasMontos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasResumidasMontos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidasMontos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasResumidasMontos.isMaximum()) {
					this.jInternalFrameDetalleFormVentasResumidasMontos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasResumidasMontos.setSize(this.jInternalFrameDetalleFormVentasResumidasMontos.iWidthFormulario,this.jInternalFrameDetalleFormVentasResumidasMontos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasResumidasMontos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasResumidasMontos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasResumidasMontos.isMaximum()) {
						this.jInternalFrameDetalleFormVentasResumidasMontos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidasMontos.jContentPaneDetalleVentasResumidasMontos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidasMontos.jContentPaneDetalleVentasResumidasMontos.getWidth(),VentasResumidasMontosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidasMontos.jContentPaneDetalleVentasResumidasMontos.getWidth(),VentasResumidasMontosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidasMontos.jContentPaneDetalleVentasResumidasMontos.getWidth(),VentasResumidasMontosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasResumidasMontos.setVisible(true);
	        this.jInternalFrameDetalleFormVentasResumidasMontos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasResumidasMontos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasResumidasMontos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasResumidasMontos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidasMontos,false,this);
				} else {
					this.jInternalFrameOrderByVentasResumidasMontos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidasMontos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidasMontos);
				this.jInternalFrameOrderByVentasResumidasMontos.setVisible(false);
				this.jInternalFrameOrderByVentasResumidasMontos.setSelected(false);
				
				this.jInternalFrameOrderByVentasResumidasMontos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidasMontos"));
				
				this.inicializarActualizarBindingTablaOrderByVentasResumidasMontos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasResumidasMontos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasResumidasMontos==null) {
				
				this.jInternalFrameImportacionVentasResumidasMontos=new ImportacionJInternalFrame(VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidasMontos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidasMontos);
				this.jInternalFrameImportacionVentasResumidasMontos.setVisible(false);
				this.jInternalFrameImportacionVentasResumidasMontos.setSelected(false);


				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidasMontos"));
				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidasMontos"));
				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidasMontos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasResumidasMontos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasResumidasMontos==null) {
				this.jInternalFrameReporteDinamicoVentasResumidasMontos=new ReporteDinamicoJInternalFrame(VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidasMontos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidasMontos);
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidasMontos"));
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidasMontos"));
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidasMontos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidasMontos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasResumidasMontos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidasMontos);
			
	       	this.jInternalFrameDetalleFormVentasResumidasMontos.setVisible(false);
	        this.jInternalFrameDetalleFormVentasResumidasMontos.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasResumidasMontos.dispose();
			//this.jInternalFrameDetalleFormVentasResumidasMontos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasResumidasMontos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasResumidasMontos.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasResumidasMontos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasResumidasMontos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasResumidasMontos.setVisible(true);
	        this.jInternalFrameImportacionVentasResumidasMontos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasResumidasMontos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasResumidasMontos.setVisible(true);
	        this.jInternalFrameOrderByVentasResumidasMontos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasResumidasMontos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasResumidasMontos.setVisible(false);
	        this.jInternalFrameOrderByVentasResumidasMontos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasResumidasMontos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasResumidasMontos.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasResumidasMontos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasResumidasMontos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasResumidasMontos.setVisible(false);
	        this.jInternalFrameImportacionVentasResumidasMontos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasResumidasMontos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasResumidasMontos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasResumidasMontos(true);
			//this.isEsNuevoVentasResumidasMontos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasResumidasMontos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidasMontos(false) ;
			
			if(ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidasMontos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasResumidasMontosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasResumidasMontos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasResumidasMontos(true);
			//this.isEsNuevoVentasResumidasMontos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventasresumidasmontos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasResumidasMontos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasResumidasMontos(false) ;
			
			if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidasMontos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasResumidasMontos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidasMontos(false);
			
			//if(!this.isEsNuevoVentasResumidasMontos) {								
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				
			}
			
			if(this.permiteMantenimiento(this.ventasresumidasmontos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasResumidasMontos=true;
					this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
					this.isEsNuevoVentasResumidasMontos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasResumidasMontos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasResumidasMontos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidasMontos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(false);
				
				this.habilitarDeshabilitarControlesVentasResumidasMontos(false);
			
												
				
				if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasResumidasMontos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasResumidasMontosActionPerformed(evt,ventasresumidasmontosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasResumidasMontos(this.ventasresumidasmontos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventasresumidasmontosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventasresumidasmontos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidasmontos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidasmontos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventasresumidasmontos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasResumidasMontosModel) this.jTableDatosVentasResumidasMontos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasResumidasMontos=true;
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
				this.isEsNuevoVentasResumidasMontos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidasMontos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(false);
				
				this.habilitarDeshabilitarControlesVentasResumidasMontos(false);
				
				
				
				if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasResumidasMontos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasResumidasMontos.getRowCount()>=1) {
				jTableDatosVentasResumidasMontos.removeRowSelectionInterval(0, jTableDatosVentasResumidasMontos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasResumidasMontos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidasMontos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(false) ;
			
			this.isEsNuevoVentasResumidasMontos=false;
			
			if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasResumidasMontos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasResumidasMontos(false);
				
				//SI ES MANUAL
				if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasResumidasMontos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasResumidasMontos--;			
			//VentasResumidasMontos ventasresumidasmontosAux= new VentasResumidasMontos();			
			//ventasresumidasmontosAux.setId(this.iIdNuevoVentasResumidasMontos);
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasResumidasMontos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
			
			this.ventasresumidasmontos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventasresumidasmontosLogic.getVentasResumidasMontoss().add(this.ventasresumidasmontosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventasresumidasmontoss.add(this.ventasresumidasmontosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			
			this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(this.getIndiceNuevoVentasResumidasMontos(), this.getIndiceNuevoVentasResumidasMontos());
			
			int iLastRow =  this.jTableDatosVentasResumidasMontos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasResumidasMontos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasResumidasMontos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidasMontos(false);
			
			//SI ES MANUAL
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidasMontos();
			}
			
			//this.abrirFrameTreeVentasResumidasMontos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasResumidasMontos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasResumidasMontos.setFileImportacion(this.jInternalFrameImportacionVentasResumidasMontos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasResumidasMontos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasResumidasMontos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasResumidasMontos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasResumidasMontos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		

		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasResumidasMontosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasResumidasMontosBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talOtro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talOtro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talOtro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talOtro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoria="nombre_tipo_factura";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoria="total_descuento";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoria="total_otro";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoriaValor="nombre_tipo_factura";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoriaValor="total_descuento";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoriaValor="total_otro";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_factura");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_descuento");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_otro");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasResumidasMontoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getnombre_tipo_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.gettotal_descuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.gettotal_otro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(VentasResumidasMontos ventasresumidasmontos:ventasresumidasmontossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidasmontos.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelVentasResumidasMontos(row);				
			//	iRow++;
			//}				
			
			//for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasResumidasMontos(ventasresumidasmontosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidasMontos(false);
			
			//SI ES MANUAL
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidasMontos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidasMontos(false);
			
			//SI ES MANUAL
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidasMontos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidasMontos(false);
			
			//SI ES MANUAL
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidasMontos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasResumidasMontos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasResumidasMontos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasResumidasMontos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasResumidasMontos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasResumidasMontos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasResumidasMontos.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasResumidasMontos.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasResumidasMontos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasResumidasMontos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasResumidasMontos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasResumidasMontos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasResumidasMontos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasResumidasMontos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasResumidasMontos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidasMontos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidasMontos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasResumidasMontos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasResumidasMontos();
		
		this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidasMontos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidasMontos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidasMontos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidasMontos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasResumidasMontos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasResumidasMontos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasResumidasMontos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionNuevoVentasResumidasMontos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionSinCerrarVentasResumidasMontos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionSinMensajeVentasResumidasMontos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasResumidasMontos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasResumidasMontos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasResumidasMontos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionNuevoVentasResumidasMontos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionSinCerrarVentasResumidasMontos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasResumidasMontos.jCheckBoxPostAccionSinMensajeVentasResumidasMontos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasResumidasMontos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasResumidasMontos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasResumidasMontos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasResumidasMontos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasResumidasMontos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasResumidasMontos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasResumidasMontos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasResumidasMontos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasResumidasMontos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasResumidasMontos(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidasMontos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidasMontos() throws Exception {
		try	{
			if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidasMontos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidasMontos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidasMontos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasResumidasMontos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasResumidasMontos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasResumidasMontos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasResumidasMontos.addItem(reporte);
			}
			
			
			if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasResumidasMontos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasResumidasMontos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasResumidasMontos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasResumidasMontos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasResumidasMontos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasResumidasMontos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasResumidasMontos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidasMontos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidasMontos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasResumidasMontosConstantesFunciones.getTiposSeleccionarVentasResumidasMontos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasResumidasMontosConstantesFunciones.getTiposSeleccionarVentasResumidasMontos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasResumidasMontosConstantesFunciones.getTiposSeleccionarVentasResumidasMontos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasResumidasMontos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.getSelectedItem()!=null){this.id_vendedorBusquedaVentasResumidasMontos=((Vendedor)this.jComboBoxid_vendedorBusquedaVentasResumidasMontosVentasResumidasMontos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaVentasResumidasMontos=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasResumidasMontosVentasResumidasMontos.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasResumidasMontos=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasResumidasMontosVentasResumidasMontos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasResumidasMontos(Boolean esInicializar) throws Exception {				
		if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidasMontos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasResumidasMontos() throws Exception {
		this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasResumidasMontos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasResumidasMontosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasResumidasMontos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventasresumidasmontosLogic.getVentasResumidasMontoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventasresumidasmontoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasResumidasMontos.setModel(new VentasResumidasMontosModel(this.ventasresumidasmontosLogic.getVentasResumidasMontoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasResumidasMontos.setModel(new VentasResumidasMontosModel(this.ventasresumidasmontoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasResumidasMontos!=null && this.jInternalFrameOrderByVentasResumidasMontos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasResumidasMontos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,ventasresumidasmontosConstantesFunciones.resaltarSeleccionarVentasResumidasMontos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasResumidasMontosConstantesFunciones.SCLASSWEBTITULO,ventasresumidasmontosConstantesFunciones.resaltarSeleccionarVentasResumidasMontos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_ID));

		if(this.ventasresumidasmontosConstantesFunciones.mostraridVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltaridVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activaridVentasResumidasMontos,iSizeTabla,this,true,"idVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltaridVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activaridVentasResumidasMontos,this,true,"idVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_completoVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_completoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_completoVentasResumidasMontos,iSizeTabla,this,true,"nombre_completoVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_completoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_completoVentasResumidasMontos,this,true,"nombre_completoVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_vendedorVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_vendedorVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_vendedorVentasResumidasMontos,iSizeTabla,this,true,"nombre_vendedorVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_vendedorVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_vendedorVentasResumidasMontos,this,true,"nombre_vendedorVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_tipo_facturaVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_tipo_facturaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_tipo_facturaVentasResumidasMontos,iSizeTabla,this,true,"nombre_tipo_facturaVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_tipo_facturaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnombre_tipo_facturaVentasResumidasMontos,this,true,"nombre_tipo_facturaVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emisionVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emisionVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarfecha_emisionVentasResumidasMontos,iSizeTabla,this,true,"fecha_emisionVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emisionVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarfecha_emisionVentasResumidasMontos,this,true,"fecha_emisionVentasResumidasMontos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_vencimientoVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_vencimientoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarfecha_vencimientoVentasResumidasMontos,iSizeTabla,this,true,"fecha_vencimientoVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_vencimientoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarfecha_vencimientoVentasResumidasMontos,this,true,"fecha_vencimientoVentasResumidasMontos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarnumero_pre_impresoVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnumero_pre_impresoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnumero_pre_impresoVentasResumidasMontos,iSizeTabla,this,true,"numero_pre_impresoVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarnumero_pre_impresoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarnumero_pre_impresoVentasResumidasMontos,this,true,"numero_pre_impresoVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA));

		if(this.ventasresumidasmontosConstantesFunciones.mostrartotal_ivaVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_ivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_ivaVentasResumidasMontos,iSizeTabla,this,true,"total_ivaVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_ivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_ivaVentasResumidasMontos,this,true,"total_ivaVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.ventasresumidasmontosConstantesFunciones.mostrartotal_sin_ivaVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_sin_ivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_sin_ivaVentasResumidasMontos,iSizeTabla,this,true,"total_sin_ivaVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_sin_ivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_sin_ivaVentasResumidasMontos,this,true,"total_sin_ivaVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO));

		if(this.ventasresumidasmontosConstantesFunciones.mostrartotal_descuentoVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_descuentoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_descuentoVentasResumidasMontos,iSizeTabla,this,true,"total_descuentoVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_descuentoVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_descuentoVentasResumidasMontos,this,true,"total_descuentoVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO));

		if(this.ventasresumidasmontosConstantesFunciones.mostrartotal_otroVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_otroVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_otroVentasResumidasMontos,iSizeTabla,this,true,"total_otroVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotal_otroVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotal_otroVentasResumidasMontos,this,true,"total_otroVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarsub_totalVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarsub_totalVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarsub_totalVentasResumidasMontos,iSizeTabla,this,true,"sub_totalVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarsub_totalVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarsub_totalVentasResumidasMontos,this,true,"sub_totalVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_TOTAL));

		if(this.ventasresumidasmontosConstantesFunciones.mostrartotalVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotalVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotalVentasResumidasMontos,iSizeTabla,this,true,"totalVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltartotalVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activartotalVentasResumidasMontos,this,true,"totalVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_IVA));

		if(this.ventasresumidasmontosConstantesFunciones.mostrarivaVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarivaVentasResumidasMontos,iSizeTabla,this,true,"ivaVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltarivaVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activarivaVentasResumidasMontos,this,true,"ivaVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.ventasresumidasmontosConstantesFunciones.mostrardescripcionVentasResumidasMontos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidasmontosConstantesFunciones.resaltardescripcionVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activardescripcionVentasResumidasMontos,iSizeTabla,this,true,"descripcionVentasResumidasMontos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidasmontosConstantesFunciones.resaltardescripcionVentasResumidasMontos,this.ventasresumidasmontosConstantesFunciones.activardescripcionVentasResumidasMontos,this,true,"descripcionVentasResumidasMontos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidasMontosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidasMontos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidasMontos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasResumidasMontos.addColumn(tableColumn);
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
			
			this.jTableDatosVentasResumidasMontos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasResumidasMontos.moveColumn(this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasResumidasMontos.moveColumn(this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasResumidasMontos.moveColumn(this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasResumidasMontos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasResumidasMontos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasResumidasMontos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasResumidasMontos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasResumidasMontos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasResumidasMontos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasResumidasMontos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventasresumidasmontosLogic.getVentasResumidasMontoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventasresumidasmontoss.size()-1;
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
		//this.jTableDatosVentasResumidasMontos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasResumidasMontos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasResumidasMontos();
			
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
				
				//this.isEsNuevoVentasResumidasMontos=false;
					
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
				if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidasMontos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidasMontos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventasresumidasmontos.getsType().equals("DUPLICADO")
				   || this.ventasresumidasmontos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasResumidasMontos=true;
				
				} else {
					this.isEsNuevoVentasResumidasMontos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
					if(this.ventasresumidasmontos.getId()>=0 && !this.ventasresumidasmontos.getIsNew()) {						
						this.isEsNuevoVentasResumidasMontos=false;
						
					} else {
						this.isEsNuevoVentasResumidasMontos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasResumidasMontos(esRelaciones);						
				
				this.seleccionarVentasResumidasMontos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventasresumidasmontos.getId()<0) {
					this.isEsNuevoVentasResumidasMontos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasResumidasMontos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasResumidasMontos(evt,rowIndex);
				}	
				
				if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasResumidasMontos: " + this.dDif); 
					}
				}								
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasResumidasMontos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventasresumidasmontos)) {
					if(this.ventasresumidasmontos.getId()>0) {
						this.ventasresumidasmontos.setIsDeleted(true);
						
						this.ventasresumidasmontossEliminados.add(this.ventasresumidasmontos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidasmontosLogic.getVentasResumidasMontoss().remove(this.ventasresumidasmontos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontoss.remove(this.ventasresumidasmontos);				
					}
					
					
					((VentasResumidasMontosModel) this.jTableDatosVentasResumidasMontos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidasMontos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasResumidasMontos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasResumidasMontos) {
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidasMontos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidasMontos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasResumidasMontos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasResumidasMontos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidasMontos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasResumidasMontos(ventasresumidasmontos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasResumidasMontos(ventasresumidasmontos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasResumidasMontos(ventasresumidasmontos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidasMontos(ventasresumidasmontos);
	}
	
	public void setVariablesObjetoActualToFormularioVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setText(ventasresumidasmontos.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_vendedor());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setDate(ventasresumidasmontos.getfecha_emision());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setDate(ventasresumidasmontos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setText(ventasresumidasmontos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_otro().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setText(ventasresumidasmontos.getsub_total().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setText(ventasresumidasmontos.gettotal().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setText(ventasresumidasmontos.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setText(ventasresumidasmontos.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasResumidasMontos ventasresumidasmontosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventasresumidasmontosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasResumidasMontos ventasresumidasmontosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventasresumidasmontosLocal=this.ventasresumidasmontos;
			} else {
				ventasresumidasmontosLocal=this.ventasresumidasmontosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventasresumidasmontosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasResumidasMontos(ventasresumidasmontosLocal,true);
					
					if(ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventasresumidasmontosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventasresumidasmontosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidasMontos(ventasresumidasmontos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(ventasresumidasmontos);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidasMontos(ventasresumidasmontos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.getText()==null || this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.getText()=="" || this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setText("0");
			}

			if(conColumnasBase) {ventasresumidasmontos.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelIdVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setnombre_completo(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_completoVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setnombre_vendedor(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_vendedorVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setnombre_tipo_factura(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnombre_tipo_facturaVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setfecha_emision(this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_emisionVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setfecha_vencimiento(this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelfecha_vencimientoVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setnumero_pre_impreso(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelnumero_pre_impresoVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_ivaVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_sin_ivaVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.settotal_descuento(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_descuentoVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.settotal_otro(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotal_otroVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelsub_totalVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeltotalVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setiva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelivaVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidasmontos.setdescripcion(this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidasMontos.jLabeldescripcionVentasResumidasMontos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontosBean,VentasResumidasMontos ventasresumidasmontos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontosOrigen,VentasResumidasMontos ventasresumidasmontos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getId()!=null && !ventasresumidasmontosOrigen.getId().equals(0L))) {ventasresumidasmontos.setId(ventasresumidasmontosOrigen.getId());}}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getfecha_emision_desde()!=null && !ventasresumidasmontosOrigen.getfecha_emision_desde().equals(new Date()))) {ventasresumidasmontos.setfecha_emision_desde(ventasresumidasmontosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getfecha_emision_hasta()!=null && !ventasresumidasmontosOrigen.getfecha_emision_hasta().equals(new Date()))) {ventasresumidasmontos.setfecha_emision_hasta(ventasresumidasmontosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getnombre_completo()!=null && !ventasresumidasmontosOrigen.getnombre_completo().equals(""))) {ventasresumidasmontos.setnombre_completo(ventasresumidasmontosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getnombre_vendedor()!=null && !ventasresumidasmontosOrigen.getnombre_vendedor().equals(""))) {ventasresumidasmontos.setnombre_vendedor(ventasresumidasmontosOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getnombre_tipo_factura()!=null && !ventasresumidasmontosOrigen.getnombre_tipo_factura().equals(""))) {ventasresumidasmontos.setnombre_tipo_factura(ventasresumidasmontosOrigen.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getfecha_emision()!=null && !ventasresumidasmontosOrigen.getfecha_emision().equals(new Date()))) {ventasresumidasmontos.setfecha_emision(ventasresumidasmontosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getfecha_vencimiento()!=null && !ventasresumidasmontosOrigen.getfecha_vencimiento().equals(new Date()))) {ventasresumidasmontos.setfecha_vencimiento(ventasresumidasmontosOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getnumero_pre_impreso()!=null && !ventasresumidasmontosOrigen.getnumero_pre_impreso().equals(""))) {ventasresumidasmontos.setnumero_pre_impreso(ventasresumidasmontosOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.gettotal_iva()!=null && !ventasresumidasmontosOrigen.gettotal_iva().equals(0.0))) {ventasresumidasmontos.settotal_iva(ventasresumidasmontosOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.gettotal_sin_iva()!=null && !ventasresumidasmontosOrigen.gettotal_sin_iva().equals(0.0))) {ventasresumidasmontos.settotal_sin_iva(ventasresumidasmontosOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.gettotal_descuento()!=null && !ventasresumidasmontosOrigen.gettotal_descuento().equals(0.0))) {ventasresumidasmontos.settotal_descuento(ventasresumidasmontosOrigen.gettotal_descuento());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.gettotal_otro()!=null && !ventasresumidasmontosOrigen.gettotal_otro().equals(0.0))) {ventasresumidasmontos.settotal_otro(ventasresumidasmontosOrigen.gettotal_otro());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getsub_total()!=null && !ventasresumidasmontosOrigen.getsub_total().equals(0.0))) {ventasresumidasmontos.setsub_total(ventasresumidasmontosOrigen.getsub_total());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.gettotal()!=null && !ventasresumidasmontosOrigen.gettotal().equals(0.0))) {ventasresumidasmontos.settotal(ventasresumidasmontosOrigen.gettotal());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getiva()!=null && !ventasresumidasmontosOrigen.getiva().equals(0.0))) {ventasresumidasmontos.setiva(ventasresumidasmontosOrigen.getiva());}
			if(conDefault || (!conDefault && ventasresumidasmontosOrigen.getdescripcion()!=null && !ventasresumidasmontosOrigen.getdescripcion().equals(""))) {ventasresumidasmontos.setdescripcion(ventasresumidasmontosOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setText(ventasresumidasmontos.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_vendedor());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setText(ventasresumidasmontos.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setDate(ventasresumidasmontos.getfecha_emision());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setDate(ventasresumidasmontos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setText(ventasresumidasmontos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setText(ventasresumidasmontos.gettotal_otro().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setText(ventasresumidasmontos.getsub_total().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setText(ventasresumidasmontos.gettotal().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setText(ventasresumidasmontos.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setText(ventasresumidasmontos.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidasMontos(VentasResumidasMontosBean ventasresumidasmontosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setText(ventasresumidasmontosBean.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setText(ventasresumidasmontosBean.getnombre_completo());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setText(ventasresumidasmontosBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setText(ventasresumidasmontosBean.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setDate(ventasresumidasmontosBean.getfecha_emision());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setDate(ventasresumidasmontosBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setText(ventasresumidasmontosBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setText(ventasresumidasmontosBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setText(ventasresumidasmontosBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setText(ventasresumidasmontosBean.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setText(ventasresumidasmontosBean.gettotal_otro().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setText(ventasresumidasmontosBean.getsub_total().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setText(ventasresumidasmontosBean.gettotal().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setText(ventasresumidasmontosBean.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setText(ventasresumidasmontosBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasResumidasMontos(VentasResumidasMontosParameterReturnGeneral ventasresumidasmontosReturnGeneral,VentasResumidasMontosBean ventasresumidasmontosBean,Boolean conDefault) throws Exception { 
		try {
			VentasResumidasMontos ventasresumidasmontosLocal=new VentasResumidasMontos();
			
			ventasresumidasmontosLocal=ventasresumidasmontosReturnGeneral.getVentasResumidasMontos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidasmontosLocal.getId()!=null && !ventasresumidasmontosLocal.getId().equals(0L))) {ventasresumidasmontosBean.setId(ventasresumidasmontosLocal.getId());}}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getnombre_completo()!=null && !ventasresumidasmontosLocal.getnombre_completo().equals(""))) {ventasresumidasmontosBean.setnombre_completo(ventasresumidasmontosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getnombre_vendedor()!=null && !ventasresumidasmontosLocal.getnombre_vendedor().equals(""))) {ventasresumidasmontosBean.setnombre_vendedor(ventasresumidasmontosLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getnombre_tipo_factura()!=null && !ventasresumidasmontosLocal.getnombre_tipo_factura().equals(""))) {ventasresumidasmontosBean.setnombre_tipo_factura(ventasresumidasmontosLocal.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getfecha_emision()!=null && !ventasresumidasmontosLocal.getfecha_emision().equals(new Date()))) {ventasresumidasmontosBean.setfecha_emision(ventasresumidasmontosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getfecha_vencimiento()!=null && !ventasresumidasmontosLocal.getfecha_vencimiento().equals(new Date()))) {ventasresumidasmontosBean.setfecha_vencimiento(ventasresumidasmontosLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getnumero_pre_impreso()!=null && !ventasresumidasmontosLocal.getnumero_pre_impreso().equals(""))) {ventasresumidasmontosBean.setnumero_pre_impreso(ventasresumidasmontosLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.gettotal_iva()!=null && !ventasresumidasmontosLocal.gettotal_iva().equals(0.0))) {ventasresumidasmontosBean.settotal_iva(ventasresumidasmontosLocal.gettotal_iva());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.gettotal_sin_iva()!=null && !ventasresumidasmontosLocal.gettotal_sin_iva().equals(0.0))) {ventasresumidasmontosBean.settotal_sin_iva(ventasresumidasmontosLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.gettotal_descuento()!=null && !ventasresumidasmontosLocal.gettotal_descuento().equals(0.0))) {ventasresumidasmontosBean.settotal_descuento(ventasresumidasmontosLocal.gettotal_descuento());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.gettotal_otro()!=null && !ventasresumidasmontosLocal.gettotal_otro().equals(0.0))) {ventasresumidasmontosBean.settotal_otro(ventasresumidasmontosLocal.gettotal_otro());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getsub_total()!=null && !ventasresumidasmontosLocal.getsub_total().equals(0.0))) {ventasresumidasmontosBean.setsub_total(ventasresumidasmontosLocal.getsub_total());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.gettotal()!=null && !ventasresumidasmontosLocal.gettotal().equals(0.0))) {ventasresumidasmontosBean.settotal(ventasresumidasmontosLocal.gettotal());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getiva()!=null && !ventasresumidasmontosLocal.getiva().equals(0.0))) {ventasresumidasmontosBean.setiva(ventasresumidasmontosLocal.getiva());}
			if(conDefault || (!conDefault && ventasresumidasmontosLocal.getdescripcion()!=null && !ventasresumidasmontosLocal.getdescripcion().equals(""))) {ventasresumidasmontosBean.setdescripcion(ventasresumidasmontosLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasResumidasMontosGenerico(Long idVentasResumidasMontosSeleccionado,JComboBox jComboBoxVentasResumidasMontos,List<VentasResumidasMontos> ventasresumidasmontossLocal)throws Exception {
		try {
			VentasResumidasMontos  ventasresumidasmontosTemp=null;

			for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossLocal) {
				if(ventasresumidasmontosAux.getId()!=null && ventasresumidasmontosAux.getId().equals(idVentasResumidasMontosSeleccionado)) {
					ventasresumidasmontosTemp=ventasresumidasmontosAux;
					break;
				}
			}

			jComboBoxVentasResumidasMontos.setSelectedItem(ventasresumidasmontosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasResumidasMontosGenerico(JComboBox jComboBoxVentasResumidasMontos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidasMontos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasResumidasMontos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidasMontos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasResumidasMontos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasResumidasMontos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasResumidasMontos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidasmontos=(VentasResumidasMontos) ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidasmontos =(VentasResumidasMontos) ventasresumidasmontoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventasresumidasmontos.getIsNew() && !ventasresumidasmontos.getIsChanged() && !ventasresumidasmontos.getIsDeleted()) {
				sDescripcion=ventasresumidasmontos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidasmontos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventasresumidasmontos.getIsNew() && !ventasresumidasmontos.getIsChanged() && !ventasresumidasmontos.getIsDeleted()) {
				sDescripcion=ventasresumidasmontos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidasmontos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!ventasresumidasmontos.getIsNew() && !ventasresumidasmontos.getIsChanged() && !ventasresumidasmontos.getIsDeleted()) {
				sDescripcion=ventasresumidasmontos.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidasmontos.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasResumidasMontos ventasresumidasmontosRow=new VentasResumidasMontos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidasmontosRow=(VentasResumidasMontos) ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidasmontosRow=(VentasResumidasMontos) ventasresumidasmontoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasResumidasMontos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));			
			this.jButtonDuplicarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidasMontos && this.isPermisoDuplicarVentasResumidasMontos));			
			this.jButtonCopiarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidasMontos && this.isPermisoCopiarVentasResumidasMontos));
			this.jButtonVerFormVentasResumidasMontos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidasMontos && this.isPermisoVerFormVentasResumidasMontos));
			
			this.jButtonAbrirOrderByVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));			
			
			this.jButtonNuevoRelacionesVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));			
			this.jButtonNuevoGuardarCambiosVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaModificarVentasResumidasMontos && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidasMontos && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidasMontos && this.isPermisoEliminarVentasResumidasMontos));
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidasMontos);							
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));						
			this.jButtonDuplicarToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidasMontos && this.isPermisoDuplicarVentasResumidasMontos));						
			this.jButtonCopiarToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidasMontos && this.isPermisoCopiarVentasResumidasMontos));			
			this.jButtonVerFormToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidasMontos && this.isPermisoVerFormVentasResumidasMontos));			
			this.jButtonAbrirOrderByToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));
			this.jButtonNuevoRelacionesToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));			
			this.jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));			
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaModificarVentasResumidasMontos && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidasMontos  && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidasMontos && this.isPermisoEliminarVentasResumidasMontos));
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarToolBarVentasResumidasMontos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidasMontos);				
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));			
			this.jMenuItemDuplicarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidasMontos && this.isPermisoDuplicarVentasResumidasMontos));			
			this.jMenuItemCopiarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaCopiarVentasResumidasMontos && this.isPermisoCopiarVentasResumidasMontos));			
			this.jMenuItemVerFormVentasResumidasMontos.setVisible((this.isVisibilidadCeldaVerFormVentasResumidasMontos && this.isPermisoVerFormVentasResumidasMontos));			
			this.jMenuItemAbrirOrderByVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));			
			//this.jMenuItemMostrarOcultarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));
			this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));			
			//this.jMenuItemDetalleMostrarOcultarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaOrdenVentasResumidasMontos && this.isPermisoOrdenVentasResumidasMontos));			
			this.jMenuItemNuevoRelacionesVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos));			
			this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos.setVisible((this.isVisibilidadCeldaNuevoVentasResumidasMontos && this.isPermisoNuevoVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));									
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemModificarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaModificarVentasResumidasMontos && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemActualizarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaActualizarVentasResumidasMontos && this.isPermisoActualizarVentasResumidasMontos));	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemEliminarVentasResumidasMontos.setVisible((this.isVisibilidadCeldaEliminarVentasResumidasMontos && this.isPermisoEliminarVentasResumidasMontos));
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemCancelarVentasResumidasMontos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidasMontos);				
			}
			
			this.jMenuItemGuardarCambiosVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));						
			this.jMenuItemGuardarCambiosTablaVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=this.jButtonNuevoVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaDuplicarVentasResumidasMontos=this.jButtonDuplicarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaCopiarVentasResumidasMontos=this.jButtonCopiarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaVerFormVentasResumidasMontos=this.jButtonVerFormVentasResumidasMontos.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasResumidasMontos=this.jButtonAbrirOrderByVentasResumidasMontos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=this.jButtonNuevoRelacionesVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaModificarVentasResumidasMontos=this.jButtonModificarVentasResumidasMontos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaGuardarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=this.jButtonGuardarCambiosTablaVentasResumidasMontos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=this.jButtonNuevoToolBarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=this.jButtonNuevoRelacionesToolBarVentasResumidasMontos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.isVisibilidadCeldaModificarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarToolBarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarToolBarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarToolBarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarToolBarVentasResumidasMontos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidasMontos=this.jButtonGuardarCambiosToolBarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=this.jMenuItemNuevoVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=this.jMenuItemNuevoRelacionesVentasResumidasMontos.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.isVisibilidadCeldaModificarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemModificarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemActualizarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemEliminarVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemCancelarVentasResumidasMontos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidasMontos=this.jMenuItemGuardarCambiosVentasResumidasMontos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=this.jMenuItemGuardarCambiosTablaVentasResumidasMontos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasResumidasMontos(Boolean esInicializar) {
		if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
				//if(this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidasMontos();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasResumidasMontos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasResumidasMontos() {
		this.jButtonNuevoVentasResumidasMontos.setVisible(this.isPermisoNuevoVentasResumidasMontos);			
		this.jButtonDuplicarVentasResumidasMontos.setVisible(this.isPermisoDuplicarVentasResumidasMontos);			
		this.jButtonCopiarVentasResumidasMontos.setVisible(this.isPermisoCopiarVentasResumidasMontos);			
		this.jButtonVerFormVentasResumidasMontos.setVisible(this.isPermisoVerFormVentasResumidasMontos);			
		
		this.jButtonAbrirOrderByVentasResumidasMontos.setVisible(this.isPermisoOrdenVentasResumidasMontos);					
		
		this.jButtonNuevoRelacionesVentasResumidasMontos.setVisible(this.isPermisoNuevoVentasResumidasMontos);			
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarVentasResumidasMontos.setVisible(this.isPermisoActualizarVentasResumidasMontos);	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.setVisible(this.isPermisoActualizarVentasResumidasMontos);	
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.setVisible(this.isPermisoEliminarVentasResumidasMontos);
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidasMontos);						
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.setVisible(this.isPermisoGuardarCambiosVentasResumidasMontos);							
		}
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.setVisible(this.isPermisoActualizarVentasResumidasMontos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidasMontos() {
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarVentasResumidasMontos.setVisible(this.isPermisoActualizarVentasResumidasMontos);	
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.setVisible(this.isPermisoActualizarVentasResumidasMontos);	
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.setVisible(this.isPermisoEliminarVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.setVisible(this.isVisibilidadCeldaCancelarVentasResumidasMontos);							
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.setVisible((this.isVisibilidadCeldaGuardarVentasResumidasMontos && this.isPermisoGuardarCambiosVentasResumidasMontos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasResumidasMontos() {
		if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasResumidasMontos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasResumidasMontos() {
	}
	
	public void jTableDatosVentasResumidasMontosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasResumidasMontos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventasresumidasmontos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasResumidasMontosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasResumidasMontos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidasMontos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventasresumidasmontosLogic.getConnexion());

				if(this.ventasresumidasmontos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventasresumidasmontos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidasMontos=(TitledBorder)this.jScrollPanelDatosVentasResumidasMontos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasResumidasMontos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventasresumidasmontos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentasResumidasMontosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentasResumidasMontos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidasMontos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventasresumidasmontosLogic.getConnexion());

				if(this.ventasresumidasmontos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventasresumidasmontos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidasMontos=(TitledBorder)this.jScrollPanelDatosVentasResumidasMontos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentasResumidasMontos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventasresumidasmontos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorVentasResumidasMontosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebVentasResumidasMontos(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidasMontos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidasMontos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.ventasresumidasmontosLogic.getConnexion());

				if(this.ventasresumidasmontos.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.ventasresumidasmontos.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidasMontos=(TitledBorder)this.jScrollPanelDatosVentasResumidasMontos.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderVentasResumidasMontos.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.ventasresumidasmontos.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventasresumidasmontos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventasresumidasmontos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.ventasresumidasmontos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.ventasresumidasmontos.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_facturaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getnombre_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_factura like '%"+this.ventasresumidasmontos.getnombre_tipo_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.ventasresumidasmontos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.ventasresumidasmontos.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.ventasresumidasmontos.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.ventasresumidasmontos.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.ventasresumidasmontos.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_descuentoVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.gettotal_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_descuento = "+this.ventasresumidasmontos.gettotal_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_otroVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.gettotal_otro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_otro = "+this.ventasresumidasmontos.gettotal_otro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.ventasresumidasmontos.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.ventasresumidasmontos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.ventasresumidasmontos.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionVentasResumidasMontosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.getventasresumidasmontos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidasmontos==null) {
						this.ventasresumidasmontos = new VentasResumidasMontos();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);
				}

				if(this.ventasresumidasmontos.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.ventasresumidasmontos.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidasMontos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasResumidasMontosVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);

			this.getVentasResumidasMontossBusquedaVentasResumidasMontos();

			this.inicializarActualizarBindingVentasResumidasMontos(false);

			//if(VentasResumidasMontosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);

			this.getVentasResumidasMontossFK_IdEmpresa();

			this.inicializarActualizarBindingVentasResumidasMontos(false);

			//if(VentasResumidasMontosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);

			this.getVentasResumidasMontossFK_IdSucursal();

			this.inicializarActualizarBindingVentasResumidasMontos(false);

			//if(VentasResumidasMontosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorVentasResumidasMontosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);

			this.getVentasResumidasMontossFK_IdVendedor();

			this.inicializarActualizarBindingVentasResumidasMontos(false);

			//if(VentasResumidasMontosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidasmontosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasResumidasMontos() {
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasResumidasMontos.dispose();
			this.jInternalFrameDetalleFormVentasResumidasMontos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
			this.jInternalFrameReporteDinamicoVentasResumidasMontos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasResumidasMontos.dispose();
			this.jInternalFrameReporteDinamicoVentasResumidasMontos=null;
		}
		
		if(this.jInternalFrameImportacionVentasResumidasMontos!=null) {
			this.jInternalFrameImportacionVentasResumidasMontos.setVisible(false);	    			
			this.jInternalFrameImportacionVentasResumidasMontos.dispose();
			this.jInternalFrameImportacionVentasResumidasMontos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasResumidasMontos();
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasResumidasMontos")) {
				jButtonDuplicarVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasResumidasMontos")) {
				jButtonCopiarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasResumidasMontos")) {
				jButtonVerFormVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasResumidasMontos")) {
				jButtonDuplicarVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasResumidasMontos")) {
				jButtonDuplicarVentasResumidasMontosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasResumidasMontos")) {
				jButtonModificarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasResumidasMontos")) {
				jButtonModificarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasResumidasMontos")) {
				jButtonModificarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasResumidasMontos")) {
				jButtonActualizarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasResumidasMontos")) {
				jButtonActualizarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasResumidasMontos")) {
				jButtonActualizarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasResumidasMontos")) {
				jButtonEliminarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasResumidasMontos")) {
				jButtonEliminarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasResumidasMontos")) {
				jButtonEliminarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasResumidasMontos")) {
				jButtonCancelarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasResumidasMontos")) {
				jButtonCancelarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasResumidasMontos")) {
				jButtonCancelarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasResumidasMontos")) {
				jButtonCerrarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasResumidasMontos")) {
				jButtonCerrarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasResumidasMontos")) {
				jButtonCerrarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasResumidasMontos")) {
				jButtonMostrarOcultarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasResumidasMontos")) {
				jButtonCancelarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasResumidasMontos")) {
				jButtonCopiarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasResumidasMontos")) {
				jButtonVerFormVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasResumidasMontos")) {
				jButtonCopiarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasResumidasMontos")) {
				jButtonVerFormVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasResumidasMontos")) {
				jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasResumidasMontos")) {
				jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasResumidasMontos")) {
				jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasResumidasMontos")) {
				jButtonAnterioresVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasResumidasMontos")) {
				jButtonAnterioresVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasResumidasMontos")) {
				jButtonAnterioresVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasResumidasMontos")) {
				jButtonSiguientesVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasResumidasMontos")) {
				jButtonSiguientesVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasResumidasMontos")) {
				jButtonSiguientesVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasResumidasMontos") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasResumidasMontos")) {
				jButtonAbrirOrderByVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasResumidasMontos") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasResumidasMontos")) {
				jButtonMostrarOcultarVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidasMontos")) {
				jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasResumidasMontos")) {
				jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasResumidasMontos")) {
				jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasResumidasMontos")) {
				jButtonCerrarReporteDinamicoVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasResumidasMontos")) {
				jButtonGenerarReporteDinamicoVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasResumidasMontos")) {
				
				jButtonGenerarExcelReporteDinamicoVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasResumidasMontos")) {
				jButtonCerrarImportacionVentasResumidasMontosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasResumidasMontos")) {
				
				jButtonGenerarImportacionVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasResumidasMontos")) {
				
				jButtonAbrirImportacionVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasResumidasMontos")) {
				jComboBoxTiposAccionesVentasResumidasMontosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasResumidasMontos")) {
				jComboBoxTiposRelacionesVentasResumidasMontosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasResumidasMontos")) {
				jComboBoxTiposAccionesVentasResumidasMontosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasResumidasMontos")) {
				
				jComboBoxTiposSeleccionarVentasResumidasMontosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasResumidasMontos")) {
				jTextFieldValorCampoGeneralVentasResumidasMontosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasResumidasMontos")) {
				jButtonAbrirOrderByVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasResumidasMontos")) {
				jButtonAbrirOrderByVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasResumidasMontos")) {
				jButtonCerrarOrderByVentasResumidasMontosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidasMontosBusqueda")) {
				this.jButtonidVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidasMontosUpdate")) {
				this.jButtonid_empresaVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidasMontosBusqueda")) {
				this.jButtonid_empresaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidasMontosUpdate")) {
				this.jButtonid_sucursalVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidasMontosBusqueda")) {
				this.jButtonid_sucursalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVentasResumidasMontosUpdate")) {
				this.jButtonid_vendedorVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVentasResumidasMontosBusqueda")) {
				this.jButtonid_vendedorVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_completoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_vendedorVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_tipo_facturaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emisionVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_vencimientoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasResumidasMontosBusqueda")) {
				this.jButtonnumero_pre_impresoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaVentasResumidasMontosBusqueda")) {
				this.jButtontotal_ivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaVentasResumidasMontosBusqueda")) {
				this.jButtontotal_sin_ivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoVentasResumidasMontosBusqueda")) {
				this.jButtontotal_descuentoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroVentasResumidasMontosBusqueda")) {
				this.jButtontotal_otroVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalVentasResumidasMontosBusqueda")) {
				this.jButtonsub_totalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasResumidasMontosBusqueda")) {
				this.jButtontotalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentasResumidasMontosBusqueda")) {
				this.jButtonivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVentasResumidasMontosBusqueda")) {
				this.jButtondescripcionVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasResumidasMontosVentasResumidasMontos")) {
				this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontosActionPerformed(evt);
			}
			
			;
			
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasResumidasMontos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasResumidasMontos ventasresumidasmontosLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventasresumidasmontosLocal=this.ventasresumidasmontos;
			} else {
				ventasresumidasmontosLocal=this.ventasresumidasmontosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
							
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
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
			
			


			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
								
						
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
								
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
							
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
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
			
			


			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
								
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasResumidasMontos")) {
					jCheckBoxSeleccionarTodosVentasResumidasMontosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasResumidasMontos")) {
					jCheckBoxSeleccionadosVentasResumidasMontosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasResumidasMontos")) {
					
				}
				
				


				
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
												
				
				


				
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
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
			
			


			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidasMontosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidasmontos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidasmontos);
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
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
				
				


				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidasMontos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidasMontos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidasMontosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidasmontosAnterior =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasResumidasMontos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasResumidasMontosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasResumidasMontos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventasresumidasmontos =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventasresumidasmontos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasResumidasMontos")) {
				
				}
				
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasResumidasMontos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasResumidasMontos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasResumidasMontos")) {
			
			}
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasResumidasMontos();
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			if(sTipo.equals("NuevoVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasResumidasMontos")) {
				jButtonDuplicarVentasResumidasMontosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasResumidasMontos")) {
				jButtonCopiarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasResumidasMontos")) {
				jButtonVerFormVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasResumidasMontos")) {
				jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasResumidasMontos")) {
				jButtonModificarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasResumidasMontos")) {
				jButtonActualizarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasResumidasMontos")) {
				jButtonEliminarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasResumidasMontos")) {
				jButtonCancelarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasResumidasMontos")) {
				jButtonCerrarVentasResumidasMontosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasResumidasMontos")) {
				jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidasMontos")) {
				jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasResumidasMontos")) {
				jButtonAbrirOrderByVentasResumidasMontosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasResumidasMontos")) {
				jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasResumidasMontos")) {
				jButtonAnterioresVentasResumidasMontosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasResumidasMontos")) {
				jButtonSiguientesVentasResumidasMontosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidasMontosBusqueda")) {
				this.jButtonidVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidasMontosUpdate")) {
				this.jButtonid_empresaVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidasMontosBusqueda")) {
				this.jButtonid_empresaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidasMontosUpdate")) {
				this.jButtonid_sucursalVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasResumidasMontosBusqueda")) {
				this.jButtonid_sucursalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVentasResumidasMontosUpdate")) {
				this.jButtonid_vendedorVentasResumidasMontosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVentasResumidasMontosBusqueda")) {
				this.jButtonid_vendedorVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_completoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_vendedorVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaVentasResumidasMontosBusqueda")) {
				this.jButtonnombre_tipo_facturaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_emisionVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoVentasResumidasMontosBusqueda")) {
				this.jButtonfecha_vencimientoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasResumidasMontosBusqueda")) {
				this.jButtonnumero_pre_impresoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaVentasResumidasMontosBusqueda")) {
				this.jButtontotal_ivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaVentasResumidasMontosBusqueda")) {
				this.jButtontotal_sin_ivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoVentasResumidasMontosBusqueda")) {
				this.jButtontotal_descuentoVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroVentasResumidasMontosBusqueda")) {
				this.jButtontotal_otroVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalVentasResumidasMontosBusqueda")) {
				this.jButtonsub_totalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasResumidasMontosBusqueda")) {
				this.jButtontotalVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentasResumidasMontosBusqueda")) {
				this.jButtonivaVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVentasResumidasMontosBusqueda")) {
				this.jButtondescripcionVentasResumidasMontosBusquedaActionPerformed(evt);
			}
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasResumidasMontos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasResumidasMontos")) {
				closingInternalFrameVentasResumidasMontos();
				
			} else if(sTipo.equals("jButtonCancelarVentasResumidasMontos")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasResumidasMontos = (JInternalFrameBase)evt.getSource();
	            	
	            VentasResumidasMontosBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidasMontosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidasMontos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasResumidasMontosActionPerformed(null);
			}
			
			VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidasmontos,new Object(),this.ventasresumidasmontosParameterGeneral,this.ventasresumidasmontosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasResumidasMontos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasResumidasMontos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasResumidasMontos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventasresumidasmontos)) {
			if(!esControlTabla) {
				if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);			
				}
				
				if(this.ventasresumidasmontosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral,this.ventasresumidasmontosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventasresumidasmontosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidasMontos(classes,this.ventasresumidasmontosReturnGeneral,this.ventasresumidasmontosBean,false);
					}
						
					if(this.ventasresumidasmontosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos());	
					}
						
					if(this.ventasresumidasmontosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos(),classes);//this.ventasresumidasmontosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasResumidasMontos(this.ventasresumidasmontos,classes);//this.ventasresumidasmontosBean);									
				}
			
				if(VentasResumidasMontosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasResumidasMontos(this.ventasresumidasmontos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidasMontos(this.ventasresumidasmontos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventasresumidasmontosAnterior!=null) {
						this.ventasresumidasmontos=this.ventasresumidasmontosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventasresumidasmontosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos(),ventasresumidasmontosLogic.getVentasResumidasMontoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontos(),this.ventasresumidasmontoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasResumidasMontos.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasResumidasMontos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasResumidasMontos();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasResumidasMontos() throws Exception {
		
		VentasResumidasMontosModel ventasresumidasmontosModel=(VentasResumidasMontosModel)this.jTableDatosVentasResumidasMontos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidasmontosModel.ventasresumidasmontoss=this.ventasresumidasmontosLogic.getVentasResumidasMontoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventasresumidasmontosModel.ventasresumidasmontoss=this.ventasresumidasmontoss;
		}
		
		
		((VentasResumidasMontosModel) this.jTableDatosVentasResumidasMontos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasResumidasMontos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventasresumidasmontosAnterior(),this.ventasresumidasmontosLogic.getVentasResumidasMontoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventasresumidasmontosAnterior(),this.ventasresumidasmontoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasResumidasMontos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
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
										
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidasmontos,new Object(),generalEntityParameterGeneral,this.ventasresumidasmontosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasResumidasMontosConstantesFunciones.getClassesRelationshipsOfVentasResumidasMontos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasResumidasMontosConstantesFunciones.getClassesRelationshipsFromStringsOfVentasResumidasMontos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasResumidasMontos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasResumidasMontosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidasmontos,new Object(),generalEntityParameterGeneral,this.ventasresumidasmontosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasResumidasMontos(VentasResumidasMontosBean ventasresumidasmontosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidasMontos(ArrayList<Classe> classes,VentasResumidasMontosReturnGeneral ventasresumidasmontosReturnGeneral,VentasResumidasMontosBean ventasresumidasmontosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventasresumidasmontos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidasMontos = new VentasResumidasMontosDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidasmontosSessionBean.getConGuardarRelaciones(),this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.setVisible(false);
		this.jInternalFrameDetalleFormVentasResumidasMontos.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.ventasresumidasmontosLogic=this.ventasresumidasmontosLogic;
		
		this.cargarCombosFrameForeignKeyVentasResumidasMontos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidasMontos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidasMontos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasResumidasMontos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasResumidasMontos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidasMontos"));
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidasMontos"));

		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidasMontos"));
					
		this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemModificarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidasMontos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidasMontos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidasMontos"));
						
		this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemActualizarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidasMontos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidasMontos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidasMontos"));
								
		this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemEliminarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidasMontos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidasMontos"));
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidasMontos"));
					
		this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemCancelarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidasMontos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemDetalleCerrarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidasMontos"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidasMontos"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidasMontos"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidasMontos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonidVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_completoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emisionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_descuentoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_otroVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonsub_totalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtondescripcionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVentasResumidasMontosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidasMontos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasResumidasMontos"));
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidasMontos"));
		}
		
		this.jTableDatosVentasResumidasMontos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasResumidasMontos"));
		
		this.jTableDatosVentasResumidasMontos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasResumidasMontos"));
		
		this.jButtonNuevoVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"NuevoVentasResumidasMontos"));
		
		this.jButtonDuplicarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"DuplicarVentasResumidasMontos"));
		
		this.jButtonCopiarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"CopiarVentasResumidasMontos"));
		
		this.jButtonVerFormVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"VerFormVentasResumidasMontos"));
		
		
		this.jButtonNuevoToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasResumidasMontos"));
			
		this.jButtonDuplicarToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasResumidasMontos"));
			
		this.jMenuItemNuevoVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasResumidasMontos"));
			
		this.jMenuItemDuplicarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasResumidasMontos"));		
		
		
		this.jButtonNuevoRelacionesVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasResumidasMontos"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasResumidasMontos"));
			
		this.jMenuItemNuevoRelacionesVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasResumidasMontos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidasMontos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonModificarToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidasMontos"));
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemModificarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidasMontos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidasMontos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonActualizarToolBarVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidasMontos"));
				
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemActualizarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidasMontos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidasMontos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonEliminarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidasMontos"));
						
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemEliminarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidasMontos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidasMontos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonCancelarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidasMontos"));
			
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemCancelarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidasMontos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasResumidasMontos"));		
		
		
		this.jButtonCerrarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CerrarVentasResumidasMontos"));
		
		
		this.jButtonCerrarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasResumidasMontos"));
			
		this.jMenuItemCerrarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasResumidasMontos"));
			
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jMenuItemDetalleCerrarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidasMontos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasResumidasMontos"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidasMontos"));
		}
		
		this.jButtonCopiarToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasResumidasMontos"));
			
		this.jButtonVerFormToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasResumidasMontos"));
		
		this.jMenuItemGuardarCambiosVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasResumidasMontos"));
			
		this.jMenuItemCopiarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasResumidasMontos"));		
		
		this.jMenuItemVerFormVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasResumidasMontos"));		
		
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidasMontos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasResumidasMontos"));
			
		this.jMenuItemGuardarCambiosTablaVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidasMontos"));		
		
		
		
		this.jButtonRecargarInformacionVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasResumidasMontos"));
					
		this.jButtonRecargarInformacionToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasResumidasMontos"));
		
		this.jMenuItemRecargarInformacionVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasResumidasMontos"));		
		
		
		
		this.jButtonAnterioresVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"AnterioresVentasResumidasMontos"));
		
		
		this.jButtonAnterioresToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasResumidasMontos"));
		
		this.jMenuItemAnterioresVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasResumidasMontos"));		
		
		
		this.jButtonSiguientesVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"SiguientesVentasResumidasMontos"));
		
		
		this.jButtonSiguientesToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasResumidasMontos"));
			
		this.jMenuItemSiguientesVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasResumidasMontos"));
			
		this.jMenuItemAbrirOrderByVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasResumidasMontos"));
			
		this.jMenuItemMostrarOcultarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasResumidasMontos"));
			
		this.jMenuItemDetalleAbrirOrderByVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasResumidasMontos"));
			
		this.jMenuItemDetalleMostarOcultarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasResumidasMontos"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasResumidasMontos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasResumidasMontos"));
			
		this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasResumidasMontos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasResumidasMontos"));

		this.jCheckBoxSeleccionadosVentasResumidasMontos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasResumidasMontos"));
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidasMontos"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasResumidasMontos"));
			
		this.jComboBoxTiposAccionesVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasResumidasMontos"));
					
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasResumidasMontos"));
			
		this.jTextFieldValorCampoGeneralVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasResumidasMontos"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonidVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_completoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emisionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_descuentoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_otroVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonsub_totalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtondescripcionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVentasResumidasMontosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidasMontosVentasResumidasMontos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasResumidasMontos!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidasMontos"));
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidasMontos"));
				this.jInternalFrameReporteDinamicoVentasResumidasMontos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidasMontos"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidasMontos"));				
			//this.jButtonGenerarReporteDinamicoVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidasMontos"));
			//this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidasMontos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasResumidasMontos!=null) {
				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidasMontos"));
				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidasMontos"));
				this.jInternalFrameImportacionVentasResumidasMontos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidasMontos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasResumidasMontos"));
			
			this.jButtonAbrirOrderByToolBarVentasResumidasMontos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasResumidasMontos"));			
			
			if(this.jInternalFrameOrderByVentasResumidasMontos!=null) {
				this.jInternalFrameOrderByVentasResumidasMontos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidasMontos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidasMontos.jTabbedPaneRelacionesVentasResumidasMontos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidasMontos"));
		
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
            		closingInternalFrameVentasResumidasMontos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasResumidasMontos = (JInternalFrameBase)event.getSource();
	            	
	            VentasResumidasMontosBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidasMontosBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidasMontos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasResumidasMontosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasResumidasMontos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasResumidasMontosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasResumidasMontos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasResumidasMontos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasResumidasMontos";
		inputMap = this.jButtonNuevoVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasResumidasMontos";
		inputMap = this.jButtonNuevoRelacionesVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidasMontosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasResumidasMontos";
		inputMap = this.jButtonModificarVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasResumidasMontos";
		inputMap = this.jButtonActualizarVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasResumidasMontos";
		inputMap = this.jButtonEliminarVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasResumidasMontos";
		inputMap = this.jButtonCancelarVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasResumidasMontos";
		inputMap = this.jButtonCerrarVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasResumidasMontos";
		inputMap = this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonGuardarCambiosVentasResumidasMontos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasResumidasMontosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasResumidasMontos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasResumidasMontosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasResumidasMontos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasResumidasMontosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasResumidasMontos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasResumidasMontosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasResumidasMontos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasResumidasMontosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonidVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_empresaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_sucursalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasResumidasMontosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonid_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_desdeVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emision_hastaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_completoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_vendedorVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnombre_tipo_facturaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_emisionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonfecha_vencimientoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonnumero_pre_impresoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_sin_ivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_descuentoVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotal_otroVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"total_otroVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonsub_totalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtontotalVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtonivaVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidasMontosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidasMontos.jButtondescripcionVentasResumidasMontosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVentasResumidasMontosBusqueda"));
		
		
		this.jButtonBusquedaVentasResumidasMontosVentasResumidasMontos.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidasMontosVentasResumidasMontos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasResumidasMontos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasResumidasMontosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasResumidasMontosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasResumidasMontos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasResumidasMontos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
					ventasresumidasmontosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontoss) {
					ventasresumidasmontosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasResumidasMontosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
						ventasresumidasmontosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontoss) {
						ventasresumidasmontosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidasMontos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidasMontos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasResumidasMontosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasResumidasMontos.getSelectedRows();
			
			VentasResumidasMontos ventasresumidasmontosLocal=new VentasResumidasMontos();
			
			//this.seleccionarTodosVentasResumidasMontos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventasresumidasmontosLocal =(VentasResumidasMontos) this.ventasresumidasmontosLogic.getVentasResumidasMontoss().toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventasresumidasmontosLocal =(VentasResumidasMontos) this.ventasresumidasmontoss.toArray()[this.jTableDatosVentasResumidasMontos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventasresumidasmontosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
						ventasresumidasmontosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontoss) {
						ventasresumidasmontosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidasMontos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidasMontos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidasMontos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasResumidasMontosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasResumidasMontosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasResumidasMontosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasResumidasMontos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
				
						if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventasresumidasmontosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							ventasresumidasmontosAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							ventasresumidasmontosAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							ventasresumidasmontosAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							ventasresumidasmontosAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							ventasresumidasmontosAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventasresumidasmontosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventasresumidasmontosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							ventasresumidasmontosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontoss) {
					
						if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							ventasresumidasmontosAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							ventasresumidasmontosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventasresumidasmontosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							ventasresumidasmontosAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							ventasresumidasmontosAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							ventasresumidasmontosAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							ventasresumidasmontosAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							ventasresumidasmontosAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventasresumidasmontosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventasresumidasmontosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							ventasresumidasmontosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasResumidasMontosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasResumidasMontos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasResumidasMontos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasResumidasMontos) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasResumidasMontos(conSplash);
				
					this.generarReporteVentasResumidasMontossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasResumidasMontossSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidasMontossSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidasMontossSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidasMontos();
				
				this.exportarVentasResumidasMontossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasResumidasMontoss();
				//this.importarVentasResumidasMontoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidasMontos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasResumidasMontossSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Resumidas Montos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasResumidasMontos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasResumidasMontos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasResumidasMontos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasResumidasMontosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasResumidasMontos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasResumidasMontos(conSplash);
					
						//this.actualizarParametrosGeneralVentasResumidasMontos();
						
						this.generarReporteProcesoAccionVentasResumidasMontossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasResumidasMontosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas Resumidas MontosES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Resumidas Montos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasResumidasMontos();
				
						this.actualizarParametrosGeneralVentasResumidasMontos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventasresumidasmontosReturnGeneral=ventasresumidasmontosLogic.procesarAccionVentasResumidasMontossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventasresumidasmontosLogic.getVentasResumidasMontoss(),this.ventasresumidasmontosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasResumidasMontosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasResumidasMontos();
					
					VentasResumidasMontosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasResumidasMontosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidasMontos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxTiposAccionesFormularioVentasResumidasMontos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasResumidasMontos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasResumidasMontosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasResumidasMontos();
			
			if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
			VentasResumidasMontos ventasresumidasmontos=new VentasResumidasMontos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasResumidasMontos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasResumidasMontos.getSelectedItem();
			
			
			
			
			ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventasresumidasmontossSeleccionados.size()==1) {
				for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
					ventasresumidasmontos=ventasresumidasmontosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasResumidasMontos();
			
      		//this.finishProcessVentasResumidasMontos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasResumidasMontosReturnGeneral() throws Exception {
		if(this.ventasresumidasmontosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidasmontosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventasresumidasmontosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidasmontosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventasresumidasmontosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventasresumidasmontosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasResumidasMontos(false);
		}
		
		if(this.ventasresumidasmontosReturnGeneral.getConRetornoLista() || this.ventasresumidasmontosReturnGeneral.getConRetornoObjeto()) {
			if(this.ventasresumidasmontosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventasresumidasmontosLogic.setVentasResumidasMontoss(this.ventasresumidasmontosReturnGeneral.getVentasResumidasMontoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasResumidasMontos(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasResumidasMontos() throws Exception {
		
		
	}
	
	public ArrayList<VentasResumidasMontos> getVentasResumidasMontossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasResumidasMontos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontosLogic.getVentasResumidasMontoss()) {
					if(ventasresumidasmontosAux.getIsSelected()) {
						ventasresumidasmontossSeleccionados.add(ventasresumidasmontosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidasMontos ventasresumidasmontosAux:this.ventasresumidasmontoss) {
					if(ventasresumidasmontosAux.getIsSelected()) {
						ventasresumidasmontossSeleccionados.add(ventasresumidasmontosAux);				
					}
				}
			}
			
			if(ventasresumidasmontossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventasresumidasmontossSeleccionados.addAll(this.ventasresumidasmontosLogic.getVentasResumidasMontoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventasresumidasmontossSeleccionados.addAll(this.ventasresumidasmontoss);				
					}
				}
			}
		} else {
			ventasresumidasmontossSeleccionados.add(this.ventasresumidasmontos);
		}
		
		return ventasresumidasmontossSeleccionados;
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
	
	public void generarReporteVentasResumidasMontossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasResumidasMontossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasResumidasMontossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidasMontossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidasMontossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Resumidas Montos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasResumidasMontossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasResumidasMontos();
		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasResumidasMontos();
		
		
		//this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados ,ventasresumidasmontosImplementable,ventasresumidasmontosImplementableHome);
	}
	
	public void mostrarImportacionVentasResumidasMontoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasResumidasMontos();
		
		this.abrirFrameImportacionVentasResumidasMontos();		
		
			
		//this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados ,ventasresumidasmontosImplementable,ventasresumidasmontosImplementableHome);
	}
	
	public void importarVentasResumidasMontoss() throws Exception {		
	
	}
	
	public void exportarVentasResumidasMontossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasResumidasMontossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasResumidasMontossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasResumidasMontossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Resumidas Montos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasResumidasMontos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasResumidasMontos(ventasresumidasmontosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventasresumidasmontosAux.setsDetalleGeneralEntityReporte(ventasresumidasmontosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasResumidasMontos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventasresumidasmontos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getnombre_tipo_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.gettotal_descuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.gettotal_otro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidasmontos.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasResumidasMontoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasResumidasMontos(row);				
				iRow++;
			}				
			
			for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasResumidasMontos(ventasresumidasmontosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasResumidasMontossSeleccionados() throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();		
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidasmontos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventasresumidasmontoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventasresumidasmontos");
			//elementRoot.appendChild(element);
		
			for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
				element = document.createElement("ventasresumidasmontos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasResumidasMontos(ventasresumidasmontosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidas Montos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasResumidasMontos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTALOTRO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getnombre_tipo_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.gettotal_descuento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.gettotal_otro());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidasmontos.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlVentasResumidasMontos(VentasResumidasMontos ventasresumidasmontos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasResumidasMontosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventasresumidasmontos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasResumidasMontosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventasresumidasmontos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasResumidasMontosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventasresumidasmontos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentasResumidasMontosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventasresumidasmontos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementvendedor_descripcion = document.createElement(VentasResumidasMontosConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(ventasresumidasmontos.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasResumidasMontosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventasresumidasmontos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasResumidasMontosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventasresumidasmontos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo = document.createElement(VentasResumidasMontosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(ventasresumidasmontos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_vendedor = document.createElement(VentasResumidasMontosConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(ventasresumidasmontos.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementnombre_tipo_factura = document.createElement(VentasResumidasMontosConstantesFunciones.NOMBRETIPOFACTURA);
		elementnombre_tipo_factura.appendChild(document.createTextNode(ventasresumidasmontos.getnombre_tipo_factura().trim()));
		element.appendChild(elementnombre_tipo_factura);

		Element elementfecha_emision = document.createElement(VentasResumidasMontosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(ventasresumidasmontos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(VentasResumidasMontosConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(ventasresumidasmontos.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnumero_pre_impreso = document.createElement(VentasResumidasMontosConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(ventasresumidasmontos.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementtotal_iva = document.createElement(VentasResumidasMontosConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(ventasresumidasmontos.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(VentasResumidasMontosConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(ventasresumidasmontos.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementtotal_descuento = document.createElement(VentasResumidasMontosConstantesFunciones.TOTALDESCUENTO);
		elementtotal_descuento.appendChild(document.createTextNode(ventasresumidasmontos.gettotal_descuento().toString().trim()));
		element.appendChild(elementtotal_descuento);

		Element elementtotal_otro = document.createElement(VentasResumidasMontosConstantesFunciones.TOTALOTRO);
		elementtotal_otro.appendChild(document.createTextNode(ventasresumidasmontos.gettotal_otro().toString().trim()));
		element.appendChild(elementtotal_otro);

		Element elementsub_total = document.createElement(VentasResumidasMontosConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(ventasresumidasmontos.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(VentasResumidasMontosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(ventasresumidasmontos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementiva = document.createElement(VentasResumidasMontosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(ventasresumidasmontos.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescripcion = document.createElement(VentasResumidasMontosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(ventasresumidasmontos.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoVentasResumidasMontossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados=new ArrayList<VentasResumidasMontos>();
		
		ventasresumidasmontossSeleccionados=this.getVentasResumidasMontossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasResumidasMontos(ventasresumidasmontossSeleccionados);
		
		this.generarReporteVentasResumidasMontoss("Todos",ventasresumidasmontossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasResumidasMontos(ArrayList<VentasResumidasMontos> ventasresumidasmontossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasResumidasMontos ventasresumidasmontosAux:ventasresumidasmontossSeleccionados) {
				ventasresumidasmontosAux.setsDetalleGeneralEntityReporte(ventasresumidasmontosAux.toString());
			
				if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidasmontosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidasmontosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getnombre_tipo_factura());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidasmontosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidasmontosAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidasMontosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					ventasresumidasmontosAux.setsDescripcionGeneralEntityReporte1(ventasresumidasmontosAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidasMontosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasResumidasMontos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasResumidasMontos=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=true;
				this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=true;
			}
			
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=true;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=true;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=true;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=true;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=true;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
			this.isVisibilidadCeldaModificarVentasResumidasMontos=true;
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
			this.isVisibilidadCeldaCancelarVentasResumidasMontos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasResumidasMontosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=true;
		} else {
			this.actualizarEstadoPanelsVentasResumidasMontos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasResumidasMontos=false;
			//this.isVisibilidadCeldaVerFormVentasResumidasMontos=false;
			this.isVisibilidadCeldaDuplicarVentasResumidasMontos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			if(!ventasresumidasmontosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;												
			}
			
			this.jButtonCerrarVentasResumidasMontos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
		}
		
		if(!this.permiteMantenimiento(this.ventasresumidasmontos)) {
			this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
			this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasResumidasMontos=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidasMontos=false;
		this.isVisibilidadCeldaGuardarCambiosVentasResumidasMontos=false;
		//this.isVisibilidadCeldaModificarVentasResumidasMontos=true;
		this.isVisibilidadCeldaActualizarVentasResumidasMontos=false;
		this.isVisibilidadCeldaEliminarVentasResumidasMontos=false;
		//this.isVisibilidadCeldaCancelarVentasResumidasMontos=true;			
		this.isVisibilidadCeldaGuardarVentasResumidasMontos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidasMontos() {
	}
	
	public void actualizarEstadoPanelsVentasResumidasMontos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasResumidasMontos!=null) {
				this.jScrollPanelDatosEdicionVentasResumidasMontos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidasMontos!=null) {
				this.jScrollPanelDatosVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidasMontos!=null) {
				this.jPanelPaginacionVentasResumidasMontos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
					this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventasresumidasmontosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidasMontos!=null) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasResumidasMontos!=null) {
				this.jPanelParametrosReportesVentasResumidasMontos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasResumidasMontos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasResumidasMontos) {this.jTabbedPaneBusquedasVentasResumidasMontos.remove(jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentasResumidasMontos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentasResumidasMontos) {this.jTabbedPaneBusquedasVentasResumidasMontos.remove(jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaVentasResumidasMontos=isParaVendedor;
			if(!this.isVisibilidadBusquedaVentasResumidasMontos) {this.jTabbedPaneBusquedasVentasResumidasMontos.remove(jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);}
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
			
			this.inicializarActualizarBindingTablaVentasResumidasMontos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasResumidasMontos() {
		this.updateBorderResaltarBusquedasFormularioVentasResumidasMontos();
		this.updateVisibilidadBusquedasFormularioVentasResumidasMontos();
		this.updateHabilitarBusquedasFormularioVentasResumidasMontos();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasResumidasMontos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasResumidasMontos.getComponents().length>0) {
	

		if(this.ventasresumidasmontosConstantesFunciones.resaltarBusquedaVentasResumidasMontosVentasResumidasMontos!=null) {
			index= this.jTabbedPaneBusquedasVentasResumidasMontos.indexOfComponent(this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidasMontos.getComponent(index);
				jPanel.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarBusquedaVentasResumidasMontosVentasResumidasMontos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasResumidasMontos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasResumidasMontos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidasMontos.indexOfComponent(this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidasMontos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarBusquedaVentasResumidasMontosVentasResumidasMontos);
			if(!this.ventasresumidasmontosConstantesFunciones.mostrarBusquedaVentasResumidasMontosVentasResumidasMontos && index>-1) {
				this.jTabbedPaneBusquedasVentasResumidasMontos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasResumidasMontos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasResumidasMontos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidasMontos.indexOfComponent(this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidasMontos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarBusquedaVentasResumidasMontosVentasResumidasMontos);
				this.jTabbedPaneBusquedasVentasResumidasMontos.setEnabledAt(index,this.ventasresumidasmontosConstantesFunciones.activarBusquedaVentasResumidasMontosVentasResumidasMontos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasResumidasMontos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasResumidasMontos")) {
			index= this.jTabbedPaneBusquedasVentasResumidasMontos.indexOfComponent(this.jPanelBusquedaVentasResumidasMontosVentasResumidasMontos);

			this.jTabbedPaneBusquedasVentasResumidasMontos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidasMontos.getComponent(index);

			this.ventasresumidasmontosConstantesFunciones.setResaltarBusquedaVentasResumidasMontosVentasResumidasMontos(resaltar);

			jPanel.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarBusquedaVentasResumidasMontosVentasResumidasMontos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasResumidasMontos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasResumidasMontos() throws Exception {

		if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasResumidasMontos();
		this.updateVisibilidadResaltarControlesFormularioVentasResumidasMontos();
		this.updateHabilitarResaltarControlesFormularioVentasResumidasMontos();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasResumidasMontos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventasresumidasmontosConstantesFunciones.resaltaridVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltaridVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarid_empresaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarid_empresaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarid_sucursalVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarid_sucursalVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarid_vendedorVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarid_vendedorVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emision_desdeVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_desdeVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emision_desdeVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emision_hastaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_hastaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emision_hastaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_completoVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_completoVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_vendedorVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_vendedorVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_tipo_facturaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarnombre_tipo_facturaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emisionVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_emisionVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_vencimientoVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarfecha_vencimientoVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarnumero_pre_impresoVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarnumero_pre_impresoVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltartotal_ivaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltartotal_ivaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltartotal_sin_ivaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltartotal_sin_ivaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltartotal_descuentoVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltartotal_descuentoVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltartotal_otroVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltartotal_otroVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarsub_totalVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarsub_totalVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltartotalVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltartotalVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltarivaVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltarivaVentasResumidasMontos);}
		if(this.ventasresumidasmontosConstantesFunciones.resaltardescripcionVentasResumidasMontos!=null && this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setBorder(this.ventasresumidasmontosConstantesFunciones.resaltardescripcionVentasResumidasMontos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasResumidasMontos() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
	
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostraridVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelidVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostraridVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_empresaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelid_empresaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_empresaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_sucursalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelid_sucursalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_sucursalVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_vendedorVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelid_vendedorVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarid_vendedorVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_desdeVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emision_desdeVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelfecha_emision_desdeVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emision_desdeVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_hastaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emision_hastaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelfecha_emision_hastaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emision_hastaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_completoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelnombre_completoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_completoVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_vendedorVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelnombre_vendedorVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_vendedorVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_tipo_facturaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelnombre_tipo_facturaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnombre_tipo_facturaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emisionVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelfecha_emisionVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_emisionVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_vencimientoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelfecha_vencimientoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarfecha_vencimientoVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnumero_pre_impresoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelnumero_pre_impresoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarnumero_pre_impresoVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneltotal_ivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_ivaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_sin_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneltotal_sin_ivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_sin_ivaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_descuentoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneltotal_descuentoVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_descuentoVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_otroVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneltotal_otroVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotal_otroVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarsub_totalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelsub_totalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarsub_totalVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneltotalVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrartotalVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPanelivaVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrarivaVentasResumidasMontos);
		//this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrardescripcionVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jPaneldescripcionVentasResumidasMontos.setVisible(this.ventasresumidasmontosConstantesFunciones.mostrardescripcionVentasResumidasMontos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasResumidasMontos() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidasMontos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidasMontos!=null) {
	
		this.jInternalFrameDetalleFormVentasResumidasMontos.jLabelidVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activaridVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_empresaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarid_empresaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_sucursalVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarid_sucursalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jComboBoxid_vendedorVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarid_vendedorVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_desdeVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarfecha_emision_desdeVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emision_hastaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarfecha_emision_hastaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_completoVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarnombre_completoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_vendedorVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarnombre_vendedorVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreanombre_tipo_facturaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarnombre_tipo_facturaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_emisionVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarfecha_emisionVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jDateChooserfecha_vencimientoVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarfecha_vencimientoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldnumero_pre_impresoVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarnumero_pre_impresoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_ivaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activartotal_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_sin_ivaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activartotal_sin_ivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_descuentoVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activartotal_descuentoVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotal_otroVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activartotal_otroVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldsub_totalVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarsub_totalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldtotalVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activartotalVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextFieldivaVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activarivaVentasResumidasMontos);
		this.jInternalFrameDetalleFormVentasResumidasMontos.jTextAreadescripcionVentasResumidasMontos.setEnabled(this.ventasresumidasmontosConstantesFunciones.activardescripcionVentasResumidasMontos);
		}
	}
	
		
}