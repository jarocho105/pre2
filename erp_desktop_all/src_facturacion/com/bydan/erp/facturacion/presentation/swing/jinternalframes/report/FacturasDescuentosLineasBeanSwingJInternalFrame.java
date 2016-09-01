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

//import com.bydan.erp.facturacion.util.FacturasDescuentosLineasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.FacturasDescuentosLineasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.FacturasDescuentosLineasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.FacturasDescuentosLineasBean;
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
public class FacturasDescuentosLineasBeanSwingJInternalFrame extends FacturasDescuentosLineasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturasDescuentosLineasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturasDescuentosLineas> facturasdescuentoslineasValidator = new ClassValidator<FacturasDescuentosLineas>(FacturasDescuentosLineas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturasDescuentosLineas facturasdescuentoslineas;	
	public FacturasDescuentosLineas facturasdescuentoslineasAux;
	public FacturasDescuentosLineas facturasdescuentoslineasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturasDescuentosLineas facturasdescuentoslineasTotales;
	public Long idFacturasDescuentosLineasActual;
	public Long iIdNuevoFacturasDescuentosLineas=0L;
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
	
	public Boolean isPermisoTodoFacturasDescuentosLineas;
	public Boolean isPermisoNuevoFacturasDescuentosLineas;
	public Boolean isPermisoActualizarFacturasDescuentosLineas;
	public Boolean isPermisoActualizarOriginalFacturasDescuentosLineas;
	public Boolean isPermisoEliminarFacturasDescuentosLineas;
	public Boolean isPermisoGuardarCambiosFacturasDescuentosLineas;
	public Boolean isPermisoConsultaFacturasDescuentosLineas;
	public Boolean isPermisoBusquedaFacturasDescuentosLineas;
	public Boolean isPermisoReporteFacturasDescuentosLineas;
	public Boolean isPermisoPaginacionMedioFacturasDescuentosLineas;
	public Boolean isPermisoPaginacionAltoFacturasDescuentosLineas;
	public Boolean isPermisoPaginacionTodoFacturasDescuentosLineas;
	public Boolean isPermisoCopiarFacturasDescuentosLineas;
	public Boolean isPermisoVerFormFacturasDescuentosLineas;
	public Boolean isPermisoDuplicarFacturasDescuentosLineas;
	public Boolean isPermisoOrdenFacturasDescuentosLineas;
	
	
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
	
	public FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasReturnGeneral;
	public FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturasDescuentosLineas=false;
	public Boolean esParaAccionDesdeFormularioFacturasDescuentosLineas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturasDescuentosLineasSessionBeanAdditional facturasdescuentoslineasSessionBeanAdditional=null;
	
	public FacturasDescuentosLineasSessionBeanAdditional getFacturasDescuentosLineasSessionBeanAdditional() {
		return this.facturasdescuentoslineasSessionBeanAdditional;
	}
	
	public void setFacturasDescuentosLineasSessionBeanAdditional(FacturasDescuentosLineasSessionBeanAdditional facturasdescuentoslineasSessionBeanAdditional) {
		try {
			this.facturasdescuentoslineasSessionBeanAdditional=facturasdescuentoslineasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturasDescuentosLineasBeanSwingJInternalFrameAdditional facturasdescuentoslineasBeanSwingJInternalFrameAdditional=null;
	//public class FacturasDescuentosLineasBeanSwingJInternalFrame
	
	public FacturasDescuentosLineasBeanSwingJInternalFrameAdditional getFacturasDescuentosLineasBeanSwingJInternalFrameAdditional() {
		return this.facturasdescuentoslineasBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturasDescuentosLineasBeanSwingJInternalFrameAdditional(FacturasDescuentosLineasBeanSwingJInternalFrameAdditional facturasdescuentoslineasBeanSwingJInternalFrameAdditional) {
		try {
			this.facturasdescuentoslineasBeanSwingJInternalFrameAdditional=facturasdescuentoslineasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturasDescuentosLineasLogic facturasdescuentoslineasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturasDescuentosLineas facturasdescuentoslineasBean;
	public FacturasDescuentosLineasConstantesFunciones facturasdescuentoslineasConstantesFunciones;
	//public FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<FacturasDescuentosLineas> facturasdescuentoslineass;	
	//public List<FacturasDescuentosLineas> facturasdescuentoslineassEliminados;
	//public List<FacturasDescuentosLineas> facturasdescuentoslineassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaDuplicarFacturasDescuentosLineas=true;
	public Boolean isVisibilidadCeldaCopiarFacturasDescuentosLineas=true;
	public Boolean isVisibilidadCeldaVerFormFacturasDescuentosLineas=true;
	public Boolean isVisibilidadCeldaOrdenFacturasDescuentosLineas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaCancelarFacturasDescuentosLineas=false;
	public Boolean isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturasDescuentosLineas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoFacturasDescuentosLineas() {
		return this.iIdNuevoFacturasDescuentosLineas;
	}

	public void setiIdNuevoFacturasDescuentosLineas(Long iIdNuevoFacturasDescuentosLineas) {
		this.iIdNuevoFacturasDescuentosLineas = iIdNuevoFacturasDescuentosLineas;
	}
	
	public Long getidFacturasDescuentosLineasActual() {
		return this.idFacturasDescuentosLineasActual;
	}

	public void setidFacturasDescuentosLineasActual(Long idFacturasDescuentosLineasActual) {
		this.idFacturasDescuentosLineasActual = idFacturasDescuentosLineasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturasDescuentosLineas getfacturasdescuentoslineas() {
		return this.facturasdescuentoslineas;
	}

	public void setfacturasdescuentoslineas(FacturasDescuentosLineas facturasdescuentoslineas) {
		this.facturasdescuentoslineas = facturasdescuentoslineas;
	}
	
	public FacturasDescuentosLineas getfacturasdescuentoslineasAux() {
		return this.facturasdescuentoslineasAux;
	}

	public void setfacturasdescuentoslineasAux(FacturasDescuentosLineas facturasdescuentoslineasAux) {
		this.facturasdescuentoslineasAux = facturasdescuentoslineasAux;
	}				
	
	public FacturasDescuentosLineas getfacturasdescuentoslineasAnterior() {
		return this.facturasdescuentoslineasAnterior;
	}

	public void setfacturasdescuentoslineasAnterior(FacturasDescuentosLineas facturasdescuentoslineasAnterior) {
		this.facturasdescuentoslineasAnterior = facturasdescuentoslineasAnterior;
	}	
	
	public FacturasDescuentosLineas getfacturasdescuentoslineasTotales() {
		return this.facturasdescuentoslineasTotales;
	}

	public void setfacturasdescuentoslineasTotales(FacturasDescuentosLineas facturasdescuentoslineasTotales) {
		this.facturasdescuentoslineasTotales = facturasdescuentoslineasTotales;
	}	
	
	public FacturasDescuentosLineas getfacturasdescuentoslineasBean() {
		return this.facturasdescuentoslineasBean;
	}

	public void setfacturasdescuentoslineasBean(FacturasDescuentosLineas facturasdescuentoslineasBean) {
		this.facturasdescuentoslineasBean = facturasdescuentoslineasBean;
	}	
	
	public FacturasDescuentosLineasParameterReturnGeneral getfacturasdescuentoslineasReturnGeneral() {
		return this.facturasdescuentoslineasReturnGeneral;
	}

	public void setfacturasdescuentoslineasReturnGeneral(FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasReturnGeneral) {
		this.facturasdescuentoslineasReturnGeneral = facturasdescuentoslineasReturnGeneral;
	}	
	
	
	public Long id_vendedorBusquedaFacturasDescuentosLineas=-1L;

	public Long getid_vendedorBusquedaFacturasDescuentosLineas() {
		return this.id_vendedorBusquedaFacturasDescuentosLineas;
	}

	public void setid_vendedorBusquedaFacturasDescuentosLineas(Long id_vendedorBusquedaFacturasDescuentosLineas) {
		this.id_vendedorBusquedaFacturasDescuentosLineas = id_vendedorBusquedaFacturasDescuentosLineas;
	}

;
	public Date fecha_emision_desdeBusquedaFacturasDescuentosLineas=new Date();

	public Date getfecha_emision_desdeBusquedaFacturasDescuentosLineas() {
		return this.fecha_emision_desdeBusquedaFacturasDescuentosLineas;
	}

	public void setfecha_emision_desdeBusquedaFacturasDescuentosLineas(Date fecha_emision_desdeBusquedaFacturasDescuentosLineas) {
		this.fecha_emision_desdeBusquedaFacturasDescuentosLineas = fecha_emision_desdeBusquedaFacturasDescuentosLineas;
	}

;
	public Date fecha_emision_hastaBusquedaFacturasDescuentosLineas=new Date();

	public Date getfecha_emision_hastaBusquedaFacturasDescuentosLineas() {
		return this.fecha_emision_hastaBusquedaFacturasDescuentosLineas;
	}

	public void setfecha_emision_hastaBusquedaFacturasDescuentosLineas(Date fecha_emision_hastaBusquedaFacturasDescuentosLineas) {
		this.fecha_emision_hastaBusquedaFacturasDescuentosLineas = fecha_emision_hastaBusquedaFacturasDescuentosLineas;
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
	
	
	public FacturasDescuentosLineasLogic getFacturasDescuentosLineasLogic()	{		
		return facturasdescuentoslineasLogic;
	}

	public void setFacturasDescuentosLineasLogic(FacturasDescuentosLineasLogic facturasdescuentoslineasLogic) {
		this.facturasdescuentoslineasLogic = facturasdescuentoslineasLogic;
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
	
	public Boolean getIsEsNuevoFacturasDescuentosLineas() {
		return isEsNuevoFacturasDescuentosLineas;
	}

	public void setIsEsNuevoFacturasDescuentosLineas(Boolean isEsNuevoFacturasDescuentosLineas) {
		this.isEsNuevoFacturasDescuentosLineas = isEsNuevoFacturasDescuentosLineas;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturasDescuentosLineas() {
		return esParaAccionDesdeFormularioFacturasDescuentosLineas;
	}
	
	public void setEsParaAccionDesdeFormularioFacturasDescuentosLineas(Boolean esParaAccionDesdeFormularioFacturasDescuentosLineas) {
		this.esParaAccionDesdeFormularioFacturasDescuentosLineas = esParaAccionDesdeFormularioFacturasDescuentosLineas;
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

			if(this.facturasdescuentoslineasSessionBean==null) {
				this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
			}

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturasdescuentoslineasSessionBean.getlidEmpresaActual());
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

			if(this.facturasdescuentoslineasSessionBean==null) {
				this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
			}

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(facturasdescuentoslineasSessionBean.getlidSucursalActual());
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

			if(this.facturasdescuentoslineasSessionBean==null) {
				this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
			}

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(facturasdescuentoslineasSessionBean.getlidVendedorActual());
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

					if(this.facturasdescuentoslineas!=null) {
						this.facturasdescuentoslineas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturasDescuentosLineas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturasDescuentosLineasGenerico)throws Exception
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
				jComboBoxid_empresaFacturasDescuentosLineasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturasDescuentosLineasGenerico!=null && jComboBoxid_empresaFacturasDescuentosLineasGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturasDescuentosLineasGenerico.setSelectedIndex(0);
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

					if(this.facturasdescuentoslineas!=null) {
						this.facturasdescuentoslineas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFacturasDescuentosLineasGenerico)throws Exception
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
				jComboBoxid_sucursalFacturasDescuentosLineasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFacturasDescuentosLineasGenerico!=null && jComboBoxid_sucursalFacturasDescuentosLineasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFacturasDescuentosLineasGenerico.setSelectedIndex(0);
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

					if(this.facturasdescuentoslineas!=null) {
						this.facturasdescuentoslineas.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaFacturasDescuentosLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas!=null) {
						jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas!=null) {
							//jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorFacturasDescuentosLineasGenerico)throws Exception
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
				jComboBoxid_vendedorFacturasDescuentosLineasGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorFacturasDescuentosLineasGenerico!=null && jComboBoxid_vendedorFacturasDescuentosLineasGenerico.getItemCount()>0) {
					jComboBoxid_vendedorFacturasDescuentosLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturasDescuentosLineas facturasdescuentoslineas,JComboBox jComboBoxid_empresaFacturasDescuentosLineasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturasDescuentosLineasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturasDescuentosLineasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturasdescuentoslineas.setid_empresa(empresaAux.getId());
				facturasdescuentoslineas.setempresa_descripcion(FacturasDescuentosLineasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturasdescuentoslineas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FacturasDescuentosLineas facturasdescuentoslineas,JComboBox jComboBoxid_sucursalFacturasDescuentosLineasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFacturasDescuentosLineasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFacturasDescuentosLineasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				facturasdescuentoslineas.setid_sucursal(sucursalAux.getId());
				facturasdescuentoslineas.setsucursal_descripcion(FacturasDescuentosLineasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				facturasdescuentoslineas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(FacturasDescuentosLineas facturasdescuentoslineas,JComboBox jComboBoxid_vendedorFacturasDescuentosLineasGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorFacturasDescuentosLineasGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorFacturasDescuentosLineasGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				facturasdescuentoslineas.setid_vendedor(vendedorAux.getId());
				facturasdescuentoslineas.setvendedor_descripcion(FacturasDescuentosLineasConstantesFunciones.getVendedorDescripcion(vendedorAux));
				facturasdescuentoslineas.setVendedor(vendedorAux);			}
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

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
					}

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
					}

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { 
					}

					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaFacturasDescuentosLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.addItem(vendedor);
							}
						}

						if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturasDescuentosLineas() throws Exception {
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
		
	public FacturasDescuentosLineasParameterReturnGeneral getFacturasDescuentosLineasParameterGeneral() {
		return this.facturasdescuentoslineasParameterGeneral;
	}
	
	public void setFacturasDescuentosLineasParameterGeneral(FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasParameterGeneral) {
		this.facturasdescuentoslineasParameterGeneral = facturasdescuentoslineasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturasDescuentosLineas() {
		return isPermisoTodoFacturasDescuentosLineas;
	}

	public void setIsPermisoTodoFacturasDescuentosLineas(Boolean isPermisoTodoFacturasDescuentosLineas) {
		this.isPermisoTodoFacturasDescuentosLineas = isPermisoTodoFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoNuevoFacturasDescuentosLineas() {
		return isPermisoNuevoFacturasDescuentosLineas;
	}

	public void setIsPermisoNuevoFacturasDescuentosLineas(Boolean isPermisoNuevoFacturasDescuentosLineas) {
		this.isPermisoNuevoFacturasDescuentosLineas = isPermisoNuevoFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoActualizarFacturasDescuentosLineas() {
		return isPermisoActualizarFacturasDescuentosLineas;
	}

	public void setIsPermisoActualizarFacturasDescuentosLineas(Boolean isPermisoActualizarFacturasDescuentosLineas) {
		this.isPermisoActualizarFacturasDescuentosLineas = isPermisoActualizarFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoEliminarFacturasDescuentosLineas() {
		return isPermisoEliminarFacturasDescuentosLineas;
	}

	public void setIsPermisoEliminarFacturasDescuentosLineas(Boolean isPermisoEliminarFacturasDescuentosLineas) {
		this.isPermisoEliminarFacturasDescuentosLineas = isPermisoEliminarFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoGuardarCambiosFacturasDescuentosLineas() {
		return isPermisoGuardarCambiosFacturasDescuentosLineas;
	}

	public void setIsPermisoGuardarCambiosFacturasDescuentosLineas(Boolean isPermisoGuardarCambiosFacturasDescuentosLineas) {
		this.isPermisoGuardarCambiosFacturasDescuentosLineas = isPermisoGuardarCambiosFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoConsultaFacturasDescuentosLineas() {
		return isPermisoConsultaFacturasDescuentosLineas;
	}

	public void setIsPermisoConsultaFacturasDescuentosLineas(Boolean isPermisoConsultaFacturasDescuentosLineas) {
		this.isPermisoConsultaFacturasDescuentosLineas = isPermisoConsultaFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoBusquedaFacturasDescuentosLineas() {
		return isPermisoBusquedaFacturasDescuentosLineas;
	}

	public void setIsPermisoBusquedaFacturasDescuentosLineas(Boolean isPermisoBusquedaFacturasDescuentosLineas) {
		this.isPermisoBusquedaFacturasDescuentosLineas = isPermisoBusquedaFacturasDescuentosLineas;
	}

	public Boolean getIsPermisoReporteFacturasDescuentosLineas() {
		return isPermisoReporteFacturasDescuentosLineas;
	}

	public void setIsPermisoReporteFacturasDescuentosLineas(Boolean isPermisoReporteFacturasDescuentosLineas) {
		this.isPermisoReporteFacturasDescuentosLineas = isPermisoReporteFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturasDescuentosLineas() {
		return isPermisoPaginacionMedioFacturasDescuentosLineas;
	}

	public void setIsPermisoPaginacionMedioFacturasDescuentosLineas(Boolean isPermisoPaginacionMedioFacturasDescuentosLineas) {
		this.isPermisoPaginacionMedioFacturasDescuentosLineas = isPermisoPaginacionMedioFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturasDescuentosLineas() {
		return isPermisoPaginacionTodoFacturasDescuentosLineas;
	}

	public void setIsPermisoPaginacionTodoFacturasDescuentosLineas(Boolean isPermisoPaginacionTodoFacturasDescuentosLineas) {
		this.isPermisoPaginacionTodoFacturasDescuentosLineas = isPermisoPaginacionTodoFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturasDescuentosLineas() {
		return isPermisoPaginacionAltoFacturasDescuentosLineas;
	}

	public void setIsPermisoPaginacionAltoFacturasDescuentosLineas(Boolean isPermisoPaginacionAltoFacturasDescuentosLineas) {
		this.isPermisoPaginacionAltoFacturasDescuentosLineas = isPermisoPaginacionAltoFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoCopiarFacturasDescuentosLineas() {
		return isPermisoCopiarFacturasDescuentosLineas;
	}

	public void setIsPermisoCopiarFacturasDescuentosLineas(Boolean isPermisoCopiarFacturasDescuentosLineas) {
		this.isPermisoCopiarFacturasDescuentosLineas = isPermisoCopiarFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoVerFormFacturasDescuentosLineas() {
		return isPermisoVerFormFacturasDescuentosLineas;
	}

	public void setIsPermisoVerFormFacturasDescuentosLineas(Boolean isPermisoVerFormFacturasDescuentosLineas) {
		this.isPermisoVerFormFacturasDescuentosLineas = isPermisoVerFormFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoDuplicarFacturasDescuentosLineas() {
		return isPermisoDuplicarFacturasDescuentosLineas;
	}

	public void setIsPermisoDuplicarFacturasDescuentosLineas(Boolean isPermisoDuplicarFacturasDescuentosLineas) {
		this.isPermisoDuplicarFacturasDescuentosLineas = isPermisoDuplicarFacturasDescuentosLineas;
	}
	
	public Boolean getIsPermisoOrdenFacturasDescuentosLineas() {
		return isPermisoOrdenFacturasDescuentosLineas;
	}

	public void setIsPermisoOrdenFacturasDescuentosLineas(Boolean isPermisoOrdenFacturasDescuentosLineas) {
		this.isPermisoOrdenFacturasDescuentosLineas = isPermisoOrdenFacturasDescuentosLineas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturasDescuentosLineas() {
		return isVisibilidadCeldaNuevoFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaNuevoFacturasDescuentosLineas(Boolean isVisibilidadCeldaNuevoFacturasDescuentosLineas) {
		this.isVisibilidadCeldaNuevoFacturasDescuentosLineas = isVisibilidadCeldaNuevoFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturasDescuentosLineas() {
		return isVisibilidadCeldaDuplicarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaDuplicarFacturasDescuentosLineas(Boolean isVisibilidadCeldaDuplicarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas = isVisibilidadCeldaDuplicarFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturasDescuentosLineas() {
		return isVisibilidadCeldaCopiarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaCopiarFacturasDescuentosLineas(Boolean isVisibilidadCeldaCopiarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaCopiarFacturasDescuentosLineas = isVisibilidadCeldaCopiarFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturasDescuentosLineas() {
		return isVisibilidadCeldaVerFormFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaVerFormFacturasDescuentosLineas(Boolean isVisibilidadCeldaVerFormFacturasDescuentosLineas) {
		this.isVisibilidadCeldaVerFormFacturasDescuentosLineas = isVisibilidadCeldaVerFormFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturasDescuentosLineas() {
		return isVisibilidadCeldaOrdenFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaOrdenFacturasDescuentosLineas(Boolean isVisibilidadCeldaOrdenFacturasDescuentosLineas) {
		this.isVisibilidadCeldaOrdenFacturasDescuentosLineas = isVisibilidadCeldaOrdenFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas() {
		return isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas(Boolean isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas) {
		this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas = isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturasDescuentosLineas() {
		return isVisibilidadCeldaModificarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaModificarFacturasDescuentosLineas(Boolean isVisibilidadCeldaModificarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaModificarFacturasDescuentosLineas = isVisibilidadCeldaModificarFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturasDescuentosLineas() {
		return isVisibilidadCeldaActualizarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaActualizarFacturasDescuentosLineas(Boolean isVisibilidadCeldaActualizarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaActualizarFacturasDescuentosLineas = isVisibilidadCeldaActualizarFacturasDescuentosLineas;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturasDescuentosLineas() {
		return isVisibilidadCeldaEliminarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaEliminarFacturasDescuentosLineas(Boolean isVisibilidadCeldaEliminarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaEliminarFacturasDescuentosLineas = isVisibilidadCeldaEliminarFacturasDescuentosLineas;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturasDescuentosLineas() {
		return isVisibilidadCeldaCancelarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaCancelarFacturasDescuentosLineas(Boolean isVisibilidadCeldaCancelarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaCancelarFacturasDescuentosLineas = isVisibilidadCeldaCancelarFacturasDescuentosLineas;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturasDescuentosLineas() {
		return isVisibilidadCeldaGuardarFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaGuardarFacturasDescuentosLineas(Boolean isVisibilidadCeldaGuardarFacturasDescuentosLineas) {
		this.isVisibilidadCeldaGuardarFacturasDescuentosLineas = isVisibilidadCeldaGuardarFacturasDescuentosLineas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas() {
		return isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas(Boolean isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas) {
		this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas = isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas;
	}
		
	public FacturasDescuentosLineasSessionBean getfacturasdescuentoslineasSessionBean() {
		return this.facturasdescuentoslineasSessionBean;
	}
	
	public void setfacturasdescuentoslineasSessionBean(FacturasDescuentosLineasSessionBean facturasdescuentoslineasSessionBean) {
		this.facturasdescuentoslineasSessionBean=facturasdescuentoslineasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturasDescuentosLineas() {
		return this.isVisibilidadBusquedaFacturasDescuentosLineas;
	}

	public void setisVisibilidadBusquedaFacturasDescuentosLineas(Boolean isVisibilidadBusquedaFacturasDescuentosLineas) {
		this.isVisibilidadBusquedaFacturasDescuentosLineas=isVisibilidadBusquedaFacturasDescuentosLineas;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturasdescuentoslineas,null);
				this.setActualParaGuardarSucursalForeignKey(facturasdescuentoslineas,null);
				this.setActualParaGuardarVendedorForeignKey(facturasdescuentoslineas,null);
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
	
	public void bugActualizarReferenciaActual(FacturasDescuentosLineas facturasdescuentoslineas,FacturasDescuentosLineas facturasdescuentoslineasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturasDescuentosLineas(facturasdescuentoslineas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturasdescuentoslineasAux.setId(facturasdescuentoslineas.getId());
		facturasdescuentoslineasAux.setVersionRow(facturasdescuentoslineas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturasDescuentosLineas facturasdescuentoslineasLocal) throws Exception {
		
		if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturasDescuentosLineas facturasdescuentoslineasLocal) throws Exception {	
		if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturasdescuentoslineasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				facturasdescuentoslineasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				facturasdescuentoslineasLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturasDescuentosLineasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturasdescuentoslineasValidator.getInvalidValues(this.facturasdescuentoslineas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturasDescuentosLineas facturasdescuentoslineas,List<FacturasDescuentosLineas> facturasdescuentoslineass) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturasDescuentosLineas facturasdescuentoslineas,List<FacturasDescuentosLineas> facturasdescuentoslineass) throws Exception {
		try	{			
			FacturasDescuentosLineasConstantesFunciones.actualizarSelectedLista(facturasdescuentoslineas,facturasdescuentoslineass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturasDescuentosLineas> facturasdescuentoslineassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturasdescuentoslineassLocal=this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturasdescuentoslineassLocal=this.facturasdescuentoslineass;
			}
			//ARCHITECTURE
		
			for(FacturasDescuentosLineas facturasdescuentoslineasLocal:facturasdescuentoslineassLocal) {
				if(this.permiteMantenimiento(facturasdescuentoslineasLocal) && facturasdescuentoslineasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturasDescuentosLineasConstantesFunciones.getFacturasDescuentosLineasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombreFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_completo_clienteFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.NOMBRETIPOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_tipo_facturaFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_emisionFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_vencimientoFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnumero_pre_impresoFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.TOTALDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_descuentoFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.TOTALOTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_otroFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelsub_totalFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotalFacturasDescuentosLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasDescuentosLineasConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelivaFacturasDescuentosLineas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombreFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_completo_clienteFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_tipo_facturaFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_emisionFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_vencimientoFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnumero_pre_impresoFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_descuentoFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_otroFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelsub_totalFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotalFacturasDescuentosLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelivaFacturasDescuentosLineas,"");
		
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
		this.iIdNuevoFacturasDescuentosLineas--;	
		
		
		this.facturasdescuentoslineasAux=new FacturasDescuentosLineas();
		
		this.facturasdescuentoslineasAux.setId(this.iIdNuevoFacturasDescuentosLineas);
		this.facturasdescuentoslineasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().add(this.facturasdescuentoslineasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturasdescuentoslineass.add(this.facturasdescuentoslineasAux);
		}
		//ARCHITECTURE
		
		this.facturasdescuentoslineas=this.facturasdescuentoslineasAux;
		
		if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineas);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasDescuentosLineas(this.facturasdescuentoslineas);
		}
				
		//this.setDefaultControlesFacturasDescuentosLineas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturasDescuentosLineas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturasDescuentosLineas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasDescuentosLineas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineasBean,this.facturasdescuentoslineas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral,this.facturasdescuentoslineasBean,false);
		
		if(this.facturasdescuentoslineasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas());
		}
		
		if(this.facturasdescuentoslineasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas(),classes);//this.facturasdescuentoslineasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturasDescuentosLineas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturasDescuentosLineas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.RecargarFormFacturasDescuentosLineas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
						
			if(facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasDescuentosLineas();
			}
			
			this.actualizarVisualTableDatosFacturasDescuentosLineas();
			
			this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(this.getIndiceNuevoFacturasDescuentosLineas(), this.getIndiceNuevoFacturasDescuentosLineas());
			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
						
			this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturasDescuentosLineas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarfecha_emision_desdeFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarfecha_emision_hastaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarnombreFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarnombre_completo_clienteFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarnombre_tipo_facturaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarfecha_emisionFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarfecha_vencimientoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarnumero_pre_impresoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activartotal_descuentoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activartotal_otroFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarsub_totalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activartotalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarivaFacturasDescuentosLineas);	
		//
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarid_empresaFacturasDescuentosLineas);//
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarid_sucursalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setEnabled(isHabilitar && this.facturasdescuentoslineasConstantesFunciones.activarid_vendedorFacturasDescuentosLineas);
	};
	
	public void setDefaultControlesFacturasDescuentosLineas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturasDescuentosLineas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(true);			
			this.facturasdescuentoslineasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.setVisible(true);
			
					
		} else {
			//this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(false);			
			this.facturasdescuentoslineasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturasDescuentosLineas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				if(facturasdescuentoslineasAux.getId().equals(this.iIdNuevoFacturasDescuentosLineas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineass) {
				if(facturasdescuentoslineasAux.getId().equals(this.iIdNuevoFacturasDescuentosLineas)) {
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
	
	public int getIndiceActualFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				if(facturasdescuentoslineasAux.getId().equals(facturasdescuentoslineas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineass) {
				if(facturasdescuentoslineasAux.getId().equals(facturasdescuentoslineas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				if(facturasdescuentoslineasAux.getFacturasDescuentosLineasOriginal().getId().equals(facturasdescuentoslineasOriginal.getId())) {
					existe=true;
					facturasdescuentoslineasOriginal.setId(facturasdescuentoslineasAux.getId());
					facturasdescuentoslineasOriginal.setVersionRow(facturasdescuentoslineasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineass) {
				if(facturasdescuentoslineasAux.getFacturasDescuentosLineasOriginal().getId().equals(facturasdescuentoslineasOriginal.getId())) {
					existe=true;
					facturasdescuentoslineasOriginal.setId(facturasdescuentoslineasAux.getId());
					facturasdescuentoslineasOriginal.setVersionRow(facturasdescuentoslineasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturasDescuentosLineas(Boolean esParaCancelar) throws Exception {
		facturasdescuentoslineassAux=new ArrayList<FacturasDescuentosLineas>();
		facturasdescuentoslineasAux=new FacturasDescuentosLineas();
		
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
					if(facturasdescuentoslineasAux.getId()<0) {
						facturasdescuentoslineassAux.add(facturasdescuentoslineasAux);
					}		
				}
				this.iIdNuevoFacturasDescuentosLineas=0L;
				this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().removeAll(facturasdescuentoslineassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineass) {
					if(facturasdescuentoslineasAux.getId()<0) {
						facturasdescuentoslineassAux.add(facturasdescuentoslineasAux);
					}		
				}
				this.iIdNuevoFacturasDescuentosLineas=0L;
				this.facturasdescuentoslineass.removeAll(facturasdescuentoslineassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturasDescuentosLineas 
					&& this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size()>0
					) {
					facturasdescuentoslineasAux=this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().get(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size() - 1);
				
					if(facturasdescuentoslineasAux.getId()<0) {
						this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().remove(facturasdescuentoslineasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturasDescuentosLineas && this.facturasdescuentoslineass.size()>0) {
					facturasdescuentoslineasAux=this.facturasdescuentoslineass.get(this.facturasdescuentoslineass.size() - 1);
				
					if(facturasdescuentoslineasAux.getId()<0) {
						this.facturasdescuentoslineass.remove(facturasdescuentoslineasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturasDescuentosLineas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturasdescuentoslineas.getId()<0) {
				this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().remove(this.facturasdescuentoslineas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturasdescuentoslineas.getId()<0) {
				this.facturasdescuentoslineass.remove(this.facturasdescuentoslineas);
			}
		}			
	}
	
	public void setEstadosInicialesFacturasDescuentosLineas(List<FacturasDescuentosLineas> facturasdescuentoslineassAux) throws Exception {
		FacturasDescuentosLineasConstantesFunciones.setEstadosInicialesFacturasDescuentosLineas(facturasdescuentoslineassAux);
	}
	
	public void setEstadosInicialesFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineasAux) throws Exception {
		FacturasDescuentosLineasConstantesFunciones.setEstadosInicialesFacturasDescuentosLineas(facturasdescuentoslineasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturasDescuentosLineasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturasDescuentosLineasActual()) {
				if(!this.isEsNuevoFacturasDescuentosLineas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturasDescuentosLineas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturasDescuentosLineasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturas Descuentos Lineas ?", "MANTENIMIENTO DE Facturas Descuentos Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturasDescuentosLineas facturasdescuentoslineas) throws Exception {
		FacturasDescuentosLineasConstantesFunciones.seleccionarAsignar(this.facturasdescuentoslineas,facturasdescuentoslineas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturasDescuentosLineas=this.isPermisoActualizarOriginalFacturasDescuentosLineas;
			
			
			this.seleccionarAsignar(facturasdescuentoslineas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturasdescuentoslineasSessionBean.setsFuncionBusquedaRapida(this.facturasdescuentoslineasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturasDescuentosLineas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturasDescuentosLineas(esParaCancelar);				
				this.cancelarNuevoFacturasDescuentosLineas(esParaCancelar);								
			}
			
			this.facturasdescuentoslineas=new FacturasDescuentosLineas();
			
			this.inicializarFacturasDescuentosLineas();
			
			this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturasDescuentosLineas() throws Exception {
		try {
			FacturasDescuentosLineasConstantesFunciones.inicializarFacturasDescuentosLineas(this.facturasdescuentoslineas);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturasDescuentosLineass(String sAccionBusqueda,List<FacturasDescuentosLineas> facturasdescuentoslineassParaReportes) throws Exception {
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
					sPathReporteFinal="FacturasDescuentosLineas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturasDescuentosLineasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturasDescuentosLineasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturasDescuentosLineas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturas Descuentos Lineases");		
		parameters.put("busquedapor", FacturasDescuentosLineasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturasDescuentosLineas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturasDescuentosLineasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturasDescuentosLineasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturasDescuentosLineas=new JRBeanArrayDataSource(FacturasDescuentosLineasJInternalFrame.TraerFacturasDescuentosLineasBeans(facturasdescuentoslineassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturasDescuentosLineas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturasDescuentosLineasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturasDescuentosLineasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturasDescuentosLineasBean.TraerFacturasDescuentosLineasBeans(facturasdescuentoslineassParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineasActionPerformed(null);
					//this.generarExcelReporteFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturasDescuentosLineass(sAccionBusqueda,sTipoArchivoReporte,facturasdescuentoslineassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturasDescuentosLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasDescuentosLineas> facturasdescuentoslineassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasDescuentosLineass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasDescuentosLineas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturasDescuentosLineas facturasdescuentoslineas : facturasdescuentoslineassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturasDescuentosLineasConstantesFunciones.generarExcelReporteDataFacturasDescuentosLineas("NORMAL",row,workbook,facturasdescuentoslineas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturasDescuentosLineas(String sTipo,Row row,Workbook workbook) {
		
		FacturasDescuentosLineasConstantesFunciones.generarExcelReporteHeaderFacturasDescuentosLineas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturasDescuentosLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasDescuentosLineas> facturasdescuentoslineassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasDescuentosLineass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturasDescuentosLineas facturasdescuentoslineas : facturasdescuentoslineassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.getFacturasDescuentosLineasDescripcion(facturasdescuentoslineas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getnombre_tipo_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.gettotal_descuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.gettotal_otro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasdescuentoslineas.getiva());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturasDescuentosLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasDescuentosLineas> facturasdescuentoslineassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturasDescuentosLineas> facturasdescuentoslineassRespaldo=null;
		
		classes=FacturasDescuentosLineasConstantesFunciones.getClassesRelationshipsOfFacturasDescuentosLineas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturasdescuentoslineasLogic.setDatosCliente(this.datosCliente);
		this.facturasdescuentoslineasLogic.setDatosDeep(this.datosDeep);
		this.facturasdescuentoslineasLogic.setIsConDeep(true);
		
		facturasdescuentoslineassRespaldo=this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass();
		
		this.facturasdescuentoslineasLogic.setFacturasDescuentosLineass(facturasdescuentoslineassParaReportes);	
		this.facturasdescuentoslineasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturasdescuentoslineassParaReportes=this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass();
		this.facturasdescuentoslineasLogic.setFacturasDescuentosLineass(facturasdescuentoslineassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasDescuentosLineass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasDescuentosLineas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturasDescuentosLineas facturasdescuentoslineas : facturasdescuentoslineassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturasDescuentosLineas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturasDescuentosLineasConstantesFunciones.generarExcelReporteDataFacturasDescuentosLineas("NORMAL",row,workbook,facturasdescuentoslineas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.getFacturasDescuentosLineasDescripcion(facturasdescuentoslineas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturasDescuentosLineas() throws Exception {		
		this.startProcessFacturasDescuentosLineas(true);
	}
	
	public void startProcessFacturasDescuentosLineas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturasDescuentosLineas ,this.jPanelParametrosReportesFacturasDescuentosLineas, this.jScrollPanelDatosFacturasDescuentosLineas,this.jPanelPaginacionFacturasDescuentosLineas, this.jScrollPanelDatosEdicionFacturasDescuentosLineas, this.jPanelAccionesFacturasDescuentosLineas,this.jPanelAccionesFormularioFacturasDescuentosLineas,this.jmenuBarFacturasDescuentosLineas,this.jmenuBarDetalleFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasDescuentosLineas=this.jTabbedPaneBusquedasFacturasDescuentosLineas; 
		
		final JPanel jPanelParametrosReportesFacturasDescuentosLineas=this.jPanelParametrosReportesFacturasDescuentosLineas;
		//final JScrollPane jScrollPanelDatosFacturasDescuentosLineas=this.jScrollPanelDatosFacturasDescuentosLineas;
		final JTable jTableDatosFacturasDescuentosLineas=this.jTableDatosFacturasDescuentosLineas;		
		final JPanel jPanelPaginacionFacturasDescuentosLineas=this.jPanelPaginacionFacturasDescuentosLineas;
		//final JScrollPane jScrollPanelDatosEdicionFacturasDescuentosLineas=this.jScrollPanelDatosEdicionFacturasDescuentosLineas;
		final JPanel jPanelAccionesFacturasDescuentosLineas=this.jPanelAccionesFacturasDescuentosLineas;
		
		JPanel jPanelCamposAuxiliarFacturasDescuentosLineas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			jPanelCamposAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelCamposFacturasDescuentosLineas;
			jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelAccionesFormularioFacturasDescuentosLineas;
		}
		
		final JPanel jPanelCamposFacturasDescuentosLineas=jPanelCamposAuxiliarFacturasDescuentosLineas;
		final JPanel jPanelAccionesFormularioFacturasDescuentosLineas=jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas;
		
		
		final JMenuBar jmenuBarFacturasDescuentosLineas=this.jmenuBarFacturasDescuentosLineas;
		final JToolBar jTtoolBarFacturasDescuentosLineas=this.jTtoolBarFacturasDescuentosLineas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturasDescuentosLineas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasDescuentosLineas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			jmenuBarDetalleAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jmenuBarDetalleFacturasDescuentosLineas;
			jTtoolBarDetalleAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTtoolBarDetalleFacturasDescuentosLineas;
		}
		
		final JMenuBar jmenuBarDetalleFacturasDescuentosLineas=jmenuBarDetalleAuxiliarFacturasDescuentosLineas;
		final JToolBar jTtoolBarDetalleFacturasDescuentosLineas=jTtoolBarDetalleAuxiliarFacturasDescuentosLineas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasDescuentosLineas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasDescuentosLineas;
			processRunnable.jTableDatos=jTableDatosFacturasDescuentosLineas;
			processRunnable.jPanelCampos=jPanelCamposFacturasDescuentosLineas;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasDescuentosLineas;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasDescuentosLineas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasDescuentosLineas;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasDescuentosLineas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasDescuentosLineas;
			processRunnable.jTtoolBar=jTtoolBarFacturasDescuentosLineas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasDescuentosLineas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasDescuentosLineas ,jPanelParametrosReportesFacturasDescuentosLineas,jTableDatosFacturasDescuentosLineas, /*jScrollPanelDatosFacturasDescuentosLineas,*/jPanelCamposFacturasDescuentosLineas,jPanelPaginacionFacturasDescuentosLineas, /*jScrollPanelDatosEdicionFacturasDescuentosLineas,*/ jPanelAccionesFacturasDescuentosLineas,jPanelAccionesFormularioFacturasDescuentosLineas,jmenuBarFacturasDescuentosLineas,jmenuBarDetalleFacturasDescuentosLineas,jTtoolBarFacturasDescuentosLineas,jTtoolBarDetalleFacturasDescuentosLineas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasDescuentosLineas ,jPanelParametrosReportesFacturasDescuentosLineas, jScrollPanelDatosFacturasDescuentosLineas,jPanelPaginacionFacturasDescuentosLineas, jScrollPanelDatosEdicionFacturasDescuentosLineas, jPanelAccionesFacturasDescuentosLineas,jPanelAccionesFormularioFacturasDescuentosLineas,jmenuBarFacturasDescuentosLineas,jmenuBarDetalleFacturasDescuentosLineas,jTtoolBarFacturasDescuentosLineas,jTtoolBarDetalleFacturasDescuentosLineas);
						
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
	
	public void finishProcessFacturasDescuentosLineas() {// throws Exception 
		this.finishProcessFacturasDescuentosLineas(true);
	}
	
	public void finishProcessFacturasDescuentosLineas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturasDescuentosLineas ,this.jPanelParametrosReportesFacturasDescuentosLineas, this.jScrollPanelDatosFacturasDescuentosLineas,this.jPanelPaginacionFacturasDescuentosLineas, this.jScrollPanelDatosEdicionFacturasDescuentosLineas, this.jPanelAccionesFacturasDescuentosLineas,this.jPanelAccionesFormularioFacturasDescuentosLineas,this.jmenuBarFacturasDescuentosLineas,this.jmenuBarDetalleFacturasDescuentosLineas,this.jTtoolBarFacturasDescuentosLineas,this.jTtoolBarDetalleFacturasDescuentosLineas);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasDescuentosLineas=this.jTabbedPaneBusquedasFacturasDescuentosLineas; 
		
		final JPanel jPanelParametrosReportesFacturasDescuentosLineas=this.jPanelParametrosReportesFacturasDescuentosLineas;
		//final JScrollPane jScrollPanelDatosFacturasDescuentosLineas=this.jScrollPanelDatosFacturasDescuentosLineas;
		final JTable jTableDatosFacturasDescuentosLineas=this.jTableDatosFacturasDescuentosLineas;		
		final JPanel jPanelPaginacionFacturasDescuentosLineas=this.jPanelPaginacionFacturasDescuentosLineas;
		//final JScrollPane jScrollPanelDatosEdicionFacturasDescuentosLineas=this.jScrollPanelDatosEdicionFacturasDescuentosLineas;
		final JPanel jPanelAccionesFacturasDescuentosLineas=this.jPanelAccionesFacturasDescuentosLineas;
		
		JPanel jPanelCamposAuxiliarFacturasDescuentosLineas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			jPanelCamposAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelCamposFacturasDescuentosLineas;
			jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelAccionesFormularioFacturasDescuentosLineas;
		}
		
		final JPanel jPanelCamposFacturasDescuentosLineas=jPanelCamposAuxiliarFacturasDescuentosLineas;
		final JPanel jPanelAccionesFormularioFacturasDescuentosLineas=jPanelAccionesFormularioAuxiliarFacturasDescuentosLineas;
		
		
		final JMenuBar jmenuBarFacturasDescuentosLineas=this.jmenuBarFacturasDescuentosLineas;		
		final JToolBar jTtoolBarFacturasDescuentosLineas=this.jTtoolBarFacturasDescuentosLineas;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturasDescuentosLineas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasDescuentosLineas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			jmenuBarDetalleAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jmenuBarDetalleFacturasDescuentosLineas;
			jTtoolBarDetalleAuxiliarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTtoolBarDetalleFacturasDescuentosLineas;		
		}
		
		final JMenuBar jmenuBarDetalleFacturasDescuentosLineas=jmenuBarDetalleAuxiliarFacturasDescuentosLineas;
		final JToolBar jTtoolBarDetalleFacturasDescuentosLineas=jTtoolBarDetalleAuxiliarFacturasDescuentosLineas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasDescuentosLineas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasDescuentosLineas;
			processRunnable.jTableDatos=jTableDatosFacturasDescuentosLineas;
			processRunnable.jPanelCampos=jPanelCamposFacturasDescuentosLineas;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasDescuentosLineas;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasDescuentosLineas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasDescuentosLineas;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasDescuentosLineas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasDescuentosLineas;
			processRunnable.jTtoolBar=jTtoolBarFacturasDescuentosLineas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasDescuentosLineas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturasDescuentosLineas ,jPanelParametrosReportesFacturasDescuentosLineas, jTableDatosFacturasDescuentosLineas,/*jScrollPanelDatosFacturasDescuentosLineas,*/jPanelCamposFacturasDescuentosLineas,jPanelPaginacionFacturasDescuentosLineas, /*jScrollPanelDatosEdicionFacturasDescuentosLineas,*/ jPanelAccionesFacturasDescuentosLineas,jPanelAccionesFormularioFacturasDescuentosLineas,jmenuBarFacturasDescuentosLineas,jmenuBarDetalleFacturasDescuentosLineas,jTtoolBarFacturasDescuentosLineas,jTtoolBarDetalleFacturasDescuentosLineas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturasDescuentosLineas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturasDescuentosLineas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturasDescuentosLineas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturasDescuentosLineas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturasDescuentosLineas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturasDescuentosLineas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturasDescuentosLineas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturasDescuentosLineas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturasDescuentosLineas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturasdescuentoslineasConstantesFunciones.getsFinalQueryFacturasDescuentosLineas();
		String  finalQueryPaginacionTodos=this.facturasdescuentoslineasConstantesFunciones.getsFinalQueryFacturasDescuentosLineas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturasDescuentosLineasConstantesFunciones.getArrayColumnasGlobalesNoFacturasDescuentosLineas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturasDescuentosLineasConstantesFunciones.getArrayColumnasGlobalesFacturasDescuentosLineas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturasDescuentosLineasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturasdescuentoslineassEliminados= new ArrayList<FacturasDescuentosLineas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturasDescuentosLineas();
		
				///*FacturasDescuentosLineasSessionBean*/this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
			
			if(this.facturasdescuentoslineasSessionBean==null) {
				this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
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
					this.iNumeroPaginacion=FacturasDescuentosLineasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturasDescuentosLineasConstantesFunciones.getClassesForeignKeysOfFacturasDescuentosLineas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturasdescuentoslineas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturasdescuentoslineassAux= new ArrayList<FacturasDescuentosLineas>();
			
				
			facturasdescuentoslineasLogic.setDatosCliente(this.datosCliente);
			facturasdescuentoslineasLogic.setDatosDeep(this.datosDeep);
			facturasdescuentoslineasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturasDescuentosLineas")) {
				this.sDetalleReporte=FacturasDescuentosLineasConstantesFunciones.getDetalleIndiceBusquedaFacturasDescuentosLineas(id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturasdescuentoslineasLogic.getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasDescuentosLineasConstantesFunciones.getDetalleIndiceBusquedaFacturasDescuentosLineas(id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasDescuentosLineasConstantesFunciones.getDetalleIndiceBusquedaFacturasDescuentosLineas(id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturasdescuentoslineasLogic.getFacturasDescuentosLineass()==null||facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturasdescuentoslineass==null|| facturasdescuentoslineass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasdescuentoslineassAux=new ArrayList<FacturasDescuentosLineas>();
						facturasdescuentoslineassAux.addAll(facturasdescuentoslineasLogic.getFacturasDescuentosLineass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasdescuentoslineassAux=new ArrayList<FacturasDescuentosLineas>();
							facturasdescuentoslineassAux.addAll(facturasdescuentoslineass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturasdescuentoslineasLogic.getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasDescuentosLineasConstantesFunciones.getDetalleIndiceBusquedaFacturasDescuentosLineas(id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasDescuentosLineasConstantesFunciones.getDetalleIndiceBusquedaFacturasDescuentosLineas(id_vendedorBusquedaFacturasDescuentosLineas,fecha_emision_desdeBusquedaFacturasDescuentosLineas,fecha_emision_hastaBusquedaFacturasDescuentosLineas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturasDescuentosLineass("BusquedaFacturasDescuentosLineas",facturasdescuentoslineasLogic.getFacturasDescuentosLineass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturasDescuentosLineass("BusquedaFacturasDescuentosLineas",facturasdescuentoslineass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasdescuentoslineasLogic.setFacturasDescuentosLineass(new ArrayList<FacturasDescuentosLineas>());
						facturasdescuentoslineasLogic.getFacturasDescuentosLineass().addAll(facturasdescuentoslineassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasdescuentoslineass=new ArrayList<FacturasDescuentosLineas>();
							facturasdescuentoslineass.addAll(facturasdescuentoslineassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturasDescuentosLineas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturasDescuentosLineas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasdescuentoslineass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasdescuentoslineass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturasDescuentosLineas facturasdescuentoslineas) {
		Boolean permite=true;
		
		if(this.facturasdescuentoslineas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturasDescuentosLineasConstantesFunciones.getOrderByListaFacturasDescuentosLineas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturasDescuentosLineasConstantesFunciones.getOrderByListaFacturasDescuentosLineas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				if(facturasdescuentoslineas.getsType().equals(Constantes2.S_TOTALES)) {
					facturasdescuentoslineasTotales=facturasdescuentoslineas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasDescuentosLineas facturasdescuentoslineas:this.facturasdescuentoslineass) {
				if(facturasdescuentoslineas.getsType().equals(Constantes2.S_TOTALES)) {
					facturasdescuentoslineasTotales=facturasdescuentoslineas;
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
			this.facturasdescuentoslineasAux=new FacturasDescuentosLineas();
			this.facturasdescuentoslineasAux.setsType(Constantes2.S_TOTALES);
			this.facturasdescuentoslineasAux.setIsNew(false);
			this.facturasdescuentoslineasAux.setIsChanged(false);
			this.facturasdescuentoslineasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturasDescuentosLineasConstantesFunciones.TotalizarValoresFilaFacturasDescuentosLineas(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass(),this.facturasdescuentoslineasAux);
				
				//this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().add(this.facturasdescuentoslineasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturasDescuentosLineasConstantesFunciones.TotalizarValoresFilaFacturasDescuentosLineas(this.facturasdescuentoslineass,this.facturasdescuentoslineasAux);
				
				this.facturasdescuentoslineass.add(this.facturasdescuentoslineasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturasdescuentoslineasTotales=new FacturasDescuentosLineas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().remove(facturasdescuentoslineasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasdescuentoslineass.remove(facturasdescuentoslineasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturasdescuentoslineasTotales=new FacturasDescuentosLineas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				if(facturasdescuentoslineas.getsType().equals(Constantes2.S_TOTALES)) {
					facturasdescuentoslineasTotales=facturasdescuentoslineas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasDescuentosLineasConstantesFunciones.TotalizarValoresFilaFacturasDescuentosLineas(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass(),facturasdescuentoslineasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasDescuentosLineas facturasdescuentoslineas:this.facturasdescuentoslineass) {
				if(facturasdescuentoslineas.getsType().equals(Constantes2.S_TOTALES)) {
					facturasdescuentoslineasTotales=facturasdescuentoslineas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasDescuentosLineasConstantesFunciones.TotalizarValoresFilaFacturasDescuentosLineas(this.facturasdescuentoslineass,facturasdescuentoslineasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturasDescuentosLineas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasDescuentosLineassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasDescuentosLineassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasDescuentosLineassFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas(String sFinalQuery,Long id_vendedor,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasdescuentoslineasLogic.getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas(sFinalQuery,this.pagination,id_vendedor,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasDescuentosLineassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasdescuentoslineasLogic.getFacturasDescuentosLineassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasDescuentosLineassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasdescuentoslineasLogic.getFacturasDescuentosLineassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasDescuentosLineassFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasdescuentoslineasLogic.getFacturasDescuentosLineassFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosFacturasDescuentosLineas() {
		this.isPermisoTodoFacturasDescuentosLineas=false;
		this.isPermisoNuevoFacturasDescuentosLineas=false;
		this.isPermisoActualizarFacturasDescuentosLineas=false;
		this.isPermisoActualizarOriginalFacturasDescuentosLineas=false;
		this.isPermisoEliminarFacturasDescuentosLineas=false;
		this.isPermisoGuardarCambiosFacturasDescuentosLineas=false;
		this.isPermisoConsultaFacturasDescuentosLineas=true;
		this.isPermisoBusquedaFacturasDescuentosLineas=true;
		this.isPermisoReporteFacturasDescuentosLineas=true;
		this.isPermisoOrdenFacturasDescuentosLineas=false;		
		this.isPermisoPaginacionMedioFacturasDescuentosLineas=false;		
		this.isPermisoPaginacionAltoFacturasDescuentosLineas=false;		
		this.isPermisoPaginacionTodoFacturasDescuentosLineas=false;		
		this.isPermisoCopiarFacturasDescuentosLineas=false;		
		this.isPermisoVerFormFacturasDescuentosLineas=false;		
		this.isPermisoDuplicarFacturasDescuentosLineas=false;
		this.isPermisoOrdenFacturasDescuentosLineas=false;
	}
	
	public void setPermisosUsuarioFacturasDescuentosLineas(Boolean isPermiso) {
		this.isPermisoTodoFacturasDescuentosLineas=isPermiso;
		this.isPermisoNuevoFacturasDescuentosLineas=isPermiso;
		this.isPermisoActualizarFacturasDescuentosLineas=isPermiso;
		this.isPermisoActualizarOriginalFacturasDescuentosLineas=isPermiso;
		this.isPermisoEliminarFacturasDescuentosLineas=isPermiso;
		this.isPermisoGuardarCambiosFacturasDescuentosLineas=isPermiso;
		this.isPermisoConsultaFacturasDescuentosLineas=isPermiso;
		this.isPermisoBusquedaFacturasDescuentosLineas=isPermiso;
		this.isPermisoReporteFacturasDescuentosLineas=isPermiso;
		this.isPermisoOrdenFacturasDescuentosLineas=isPermiso;		
		this.isPermisoPaginacionMedioFacturasDescuentosLineas=isPermiso;		
		this.isPermisoPaginacionAltoFacturasDescuentosLineas=isPermiso;		
		this.isPermisoPaginacionTodoFacturasDescuentosLineas=isPermiso;		
		this.isPermisoCopiarFacturasDescuentosLineas=isPermiso;		
		this.isPermisoVerFormFacturasDescuentosLineas=isPermiso;		
		this.isPermisoDuplicarFacturasDescuentosLineas=isPermiso;
		this.isPermisoOrdenFacturasDescuentosLineas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturasDescuentosLineas(Boolean isPermiso) {
		//this.isPermisoTodoFacturasDescuentosLineas=isPermiso;
		this.isPermisoNuevoFacturasDescuentosLineas=isPermiso;
		this.isPermisoActualizarFacturasDescuentosLineas=isPermiso;
		this.isPermisoActualizarOriginalFacturasDescuentosLineas=isPermiso;
		this.isPermisoEliminarFacturasDescuentosLineas=isPermiso;
		this.isPermisoGuardarCambiosFacturasDescuentosLineas=isPermiso;
		//this.isPermisoConsultaFacturasDescuentosLineas=isPermiso;
		//this.isPermisoBusquedaFacturasDescuentosLineas=isPermiso;
		//this.isPermisoReporteFacturasDescuentosLineas=isPermiso;
		//this.isPermisoOrdenFacturasDescuentosLineas=isPermiso;		
		//this.isPermisoPaginacionMedioFacturasDescuentosLineas=isPermiso;		
		//this.isPermisoPaginacionAltoFacturasDescuentosLineas=isPermiso;		
		//this.isPermisoPaginacionTodoFacturasDescuentosLineas=isPermiso;		
		//this.isPermisoCopiarFacturasDescuentosLineas=isPermiso;		
		//this.isPermisoDuplicarFacturasDescuentosLineas=isPermiso;
		//this.isPermisoOrdenFacturasDescuentosLineas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturasDescuentosLineasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturasDescuentosLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturasDescuentosLineas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturasDescuentosLineasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturasDescuentosLineasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturasDescuentosLineasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturasDescuentosLineasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturasDescuentosLineas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturasDescuentosLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturasDescuentosLineasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturasDescuentosLineas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturasDescuentosLineas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturasDescuentosLineas=this.isPermisoActualizarFacturasDescuentosLineas;
			this.isPermisoEliminarFacturasDescuentosLineas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturasDescuentosLineas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturasDescuentosLineas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturasDescuentosLineas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturasDescuentosLineas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturasDescuentosLineas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasDescuentosLineas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturasDescuentosLineas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturasDescuentosLineas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturasDescuentosLineas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturasDescuentosLineas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturasDescuentosLineas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturasDescuentosLineas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasDescuentosLineas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturasDescuentosLineas.setToolTipText(this.jTableDatosFacturasDescuentosLineas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturasDescuentosLineas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturasDescuentosLineas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturasDescuentosLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturasDescuentosLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturasDescuentosLineas() throws Exception {
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
	public void inicializarCombosForeignKeyFacturasDescuentosLineasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturasDescuentosLineasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturasDescuentosLineasJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturasDescuentosLineas()throws Exception {
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
			if(this.facturasdescuentoslineasSessionBean==null) {
				this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean();
			}

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.facturasdescuentoslineasSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
	
	public void initActionsCombosTodosForeignKeyFacturasDescuentosLineas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturasDescuentosLineas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturasDescuentosLineas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasDescuentosLineas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturasDescuentosLineas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasDescuentosLineas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturasDescuentosLineas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturasDescuentosLineas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturasDescuentosLineas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturasDescuentosLineas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturasDescuentosLineas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturasDescuentosLineas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public FacturasDescuentosLineasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturasDescuentosLineasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturasDescuentosLineasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturasdescuentoslineasSessionBean=new FacturasDescuentosLineasSessionBean(); 
		this.facturasdescuentoslineasConstantesFunciones=new FacturasDescuentosLineasConstantesFunciones(); 
		this.facturasdescuentoslineasBean=new FacturasDescuentosLineas();//(this.facturasdescuentoslineasConstantesFunciones); 		
		this.facturasdescuentoslineasReturnGeneral=new FacturasDescuentosLineasParameterReturnGeneral(); 
		
		this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasdescuentoslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturasDescuentosLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturasDescuentosLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturasDescuentosLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturasDescuentosLineas(true);
			
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
			
			this.facturasdescuentoslineasConstantesFunciones=new FacturasDescuentosLineasConstantesFunciones(); 
			this.facturasdescuentoslineasBean=new FacturasDescuentosLineas();//this.facturasdescuentoslineasConstantesFunciones); 			
			this.facturasdescuentoslineasReturnGeneral=new FacturasDescuentosLineasParameterReturnGeneral(); 
		
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Descuentos Lineas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturasdescuentoslineas=new FacturasDescuentosLineas();
			this.facturasdescuentoslineass = new ArrayList<FacturasDescuentosLineas>();
			this.facturasdescuentoslineassAux = new ArrayList<FacturasDescuentosLineas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic=new FacturasDescuentosLineasLogic();
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			//this.facturasdescuentoslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturasdescuentoslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturasDescuentosLineas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasDescuentosLineas);	
					}
					
					if(this.jInternalFrameImportacionFacturasDescuentosLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasDescuentosLineas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturasDescuentosLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturasDescuentosLineas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasDescuentosLineas);
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.setVisible(false);
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas);
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturasDescuentosLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturasDescuentosLineas);
					this.jInternalFrameImportacionFacturasDescuentosLineas.setVisible(false);
					this.jInternalFrameImportacionFacturasDescuentosLineas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturasDescuentosLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturasDescuentosLineas);
					this.jInternalFrameOrderByFacturasDescuentosLineas.setVisible(false);
					this.jInternalFrameOrderByFacturasDescuentosLineas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturasDescuentosLineasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturasDescuentosLineasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturasdescuentoslineasReturnGeneral=new FacturasDescuentosLineasParameterReturnGeneral();
			
			this.facturasdescuentoslineasParameterGeneral=new FacturasDescuentosLineasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturasdescuentoslineasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturasDescuentosLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasDescuentosLineasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasDescuentosLineasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaCopiarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaVerFormFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaOrdenFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			
			
			this.isVisibilidadBusquedaFacturasDescuentosLineas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturasDescuentosLineas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturasDescuentosLineas(false);
			
			this.setPermisosUsuarioFacturasDescuentosLineas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() 
				|| (this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado() && this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturasDescuentosLineasClasesRelacionadas();
			}
			
			if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturasDescuentosLineasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturasDescuentosLineas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturasDescuentosLineas();
			}
			
			if(!this.isPermisoBusquedaFacturasDescuentosLineas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturasDescuentosLineasConstantesFunciones.getTiposSeleccionarFacturasDescuentosLineas());
				
				this.tiposColumnasSelect=FacturasDescuentosLineasConstantesFunciones.getTiposSeleccionarFacturasDescuentosLineas(true);
				
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
			//if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturasDescuentosLineas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturasDescuentosLineas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturasDescuentosLineas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasDescuentosLineas() ;
			
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
				facturasdescuentoslineasImplementable= (FacturasDescuentosLineasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasDescuentosLineasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturasdescuentoslineasImplementableHome= (FacturasDescuentosLineasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasDescuentosLineasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturasdescuentoslineass= new ArrayList<FacturasDescuentosLineas>();
			this.facturasdescuentoslineassEliminados= new ArrayList<FacturasDescuentosLineas>();
						
			this.isEsNuevoFacturasDescuentosLineas=false;
			this.esParaAccionDesdeFormularioFacturasDescuentosLineas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturasDescuentosLineas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturasDescuentosLineas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturasDescuentosLineasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturasDescuentosLineas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturasDescuentosLineas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturasDescuentosLineas();
			}
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturasDescuentosLineas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturasDescuentosLineas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturasDescuentosLineas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturasDescuentosLineas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturasDescuentosLineas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturasDescuentosLineas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturasDescuentosLineas")) {
				iIndex=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturasDescuentosLineas();	
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
	
	public void cargarCombosForeignKeyFacturasDescuentosLineas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturasDescuentosLineas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturasDescuentosLineas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturasDescuentosLineasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturasDescuentosLineas();
		
		this.cargarCombosFrameForeignKeyFacturasDescuentosLineas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturasDescuentosLineas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturasDescuentosLineas();
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
	
	public void jButtonNuevoFacturasDescuentosLineasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			
			if(jTableDatosFacturasDescuentosLineas.getRowCount()>=1) {
				jTableDatosFacturasDescuentosLineas.removeRowSelectionInterval(0, jTableDatosFacturasDescuentosLineas.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturasDescuentosLineas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturasDescuentosLineas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturasDescuentosLineas(true);			
			//this.facturasdescuentoslineas=new FacturasDescuentosLineas();
			//this.facturasdescuentoslineas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas() ;
			
			if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasDescuentosLineas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturasdescuentoslineas);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);				
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturasDescuentosLineas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturasDescuentosLineasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturasDescuentosLineas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturasDescuentosLineas.getSelectedRows().length;			
			}
			
			facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturasDescuentosLineas--;			
				//FacturasDescuentosLineas facturasdescuentoslineasAux= new FacturasDescuentosLineas();			
				//facturasdescuentoslineasAux.setId(this.iIdNuevoFacturasDescuentosLineas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturasDescuentosLineas facturasdescuentoslineasOrigen=new FacturasDescuentosLineas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturasDescuentosLineas facturasdescuentoslineasOrigen : facturasdescuentoslineassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturasdescuentoslineasOrigen =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasdescuentoslineasOrigen =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturasDescuentosLineas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturasdescuentoslineas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturasDescuentosLineas(facturasdescuentoslineasOrigen,this.facturasdescuentoslineas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().add(this.facturasdescuentoslineasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineass.add(this.facturasdescuentoslineasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
				
				this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(this.getIndiceNuevoFacturasDescuentosLineas(), this.getIndiceNuevoFacturasDescuentosLineas());
				
				int iLastRow =  this.jTableDatosFacturasDescuentosLineas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasDescuentosLineas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasDescuentosLineas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();									
		
			FacturasDescuentosLineas facturasdescuentoslineasOrigen=new FacturasDescuentosLineas();
			FacturasDescuentosLineas facturasdescuentoslineasDestino=new FacturasDescuentosLineas();
				
			facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturasDescuentosLineas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturasdescuentoslineassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturasDescuentosLineas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasdescuentoslineasOrigen =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasdescuentoslineasOrigen =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasdescuentoslineasDestino =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasdescuentoslineasDestino =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturasdescuentoslineasOrigen =facturasdescuentoslineassSeleccionados.get(0);
				facturasdescuentoslineasDestino =facturasdescuentoslineassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturasDescuentosLineas(facturasdescuentoslineasOrigen,facturasdescuentoslineasDestino,true,false);
				
				facturasdescuentoslineasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturasdescuentoslineasDestino,facturasdescuentoslineasLogic.getFacturasDescuentosLineass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturasdescuentoslineasDestino,facturasdescuentoslineass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
				
				//this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(this.getIndiceNuevoFacturasDescuentosLineas(), this.getIndiceNuevoFacturasDescuentosLineas());
				
				int iLastRow =  this.jTableDatosFacturasDescuentosLineas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasDescuentosLineas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasDescuentosLineas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturasDescuentosLineas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(!isVisible);
			this.jPanelPaginacionFacturasDescuentosLineas.setVisible(!isVisible);
			this.jPanelAccionesFacturasDescuentosLineas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturasDescuentosLineas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturasDescuentosLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturasDescuentosLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturasDescuentosLineas();
			
			this.abrirFrameOrderByFacturasDescuentosLineas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturasDescuentosLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturasDescuentosLineas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasDescuentosLineas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.isMaximum()) {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSize(this.jInternalFrameDetalleFormFacturasDescuentosLineas.iWidthFormulario,this.jInternalFrameDetalleFormFacturasDescuentosLineas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturasDescuentosLineas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturasDescuentosLineas.isMaximum()) {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jContentPaneDetalleFacturasDescuentosLineas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jContentPaneDetalleFacturasDescuentosLineas.getWidth(),FacturasDescuentosLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jContentPaneDetalleFacturasDescuentosLineas.getWidth(),FacturasDescuentosLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jContentPaneDetalleFacturasDescuentosLineas.getWidth(),FacturasDescuentosLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturasDescuentosLineas.setVisible(true);
	        this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturasDescuentosLineas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturasDescuentosLineas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturasDescuentosLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasDescuentosLineas,false,this);
				} else {
					this.jInternalFrameOrderByFacturasDescuentosLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasDescuentosLineas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturasDescuentosLineas);
				this.jInternalFrameOrderByFacturasDescuentosLineas.setVisible(false);
				this.jInternalFrameOrderByFacturasDescuentosLineas.setSelected(false);
				
				this.jInternalFrameOrderByFacturasDescuentosLineas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasDescuentosLineas"));
				
				this.inicializarActualizarBindingTablaOrderByFacturasDescuentosLineas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturasDescuentosLineas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturasDescuentosLineas==null) {
				
				this.jInternalFrameImportacionFacturasDescuentosLineas=new ImportacionJInternalFrame(FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasDescuentosLineas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturasDescuentosLineas);
				this.jInternalFrameImportacionFacturasDescuentosLineas.setVisible(false);
				this.jInternalFrameImportacionFacturasDescuentosLineas.setSelected(false);


				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasDescuentosLineas"));
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasDescuentosLineas"));
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasDescuentosLineas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturasDescuentosLineas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas==null) {
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas=new ReporteDinamicoJInternalFrame(FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasDescuentosLineas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas);
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasDescuentosLineas"));
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasDescuentosLineas"));
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasDescuentosLineas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasDescuentosLineas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturasDescuentosLineas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasDescuentosLineas);
			
	       	this.jInternalFrameDetalleFormFacturasDescuentosLineas.setVisible(false);
	        this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturasDescuentosLineas.dispose();
			//this.jInternalFrameDetalleFormFacturasDescuentosLineas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturasDescuentosLineas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturasDescuentosLineas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturasDescuentosLineas.setVisible(true);
	        this.jInternalFrameImportacionFacturasDescuentosLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturasDescuentosLineas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturasDescuentosLineas.setVisible(true);
	        this.jInternalFrameOrderByFacturasDescuentosLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturasDescuentosLineas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturasDescuentosLineas.setVisible(false);
	        this.jInternalFrameOrderByFacturasDescuentosLineas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturasDescuentosLineas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturasDescuentosLineas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturasDescuentosLineas.setVisible(false);
	        this.jInternalFrameImportacionFacturasDescuentosLineas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturasDescuentosLineas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturasDescuentosLineas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturasDescuentosLineas(true);
			//this.isEsNuevoFacturasDescuentosLineas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false) ;
			
			if(facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasDescuentosLineas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturasDescuentosLineasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturasDescuentosLineas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturasDescuentosLineas(true);
			//this.isEsNuevoFacturasDescuentosLineas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturasdescuentoslineas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false) ;
			
			if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasDescuentosLineas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturasDescuentosLineas(false);
			
			//if(!this.isEsNuevoFacturasDescuentosLineas) {								
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				
			}
			
			if(this.permiteMantenimiento(this.facturasdescuentoslineas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturasDescuentosLineas=true;
					this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
					this.isEsNuevoFacturasDescuentosLineas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturasDescuentosLineas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturasDescuentosLineas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(false);
				
				this.habilitarDeshabilitarControlesFacturasDescuentosLineas(false);
			
												
				
				if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturasDescuentosLineas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,facturasdescuentoslineasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturasDescuentosLineas(this.facturasdescuentoslineas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturasdescuentoslineasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturasdescuentoslineas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				this.facturasdescuentoslineas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				this.facturasdescuentoslineas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturasdescuentoslineas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturasDescuentosLineasModel) this.jTableDatosFacturasDescuentosLineas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturasDescuentosLineas=true;
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
				this.isEsNuevoFacturasDescuentosLineas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(false);
				
				this.habilitarDeshabilitarControlesFacturasDescuentosLineas(false);
				
				
				
				if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturasDescuentosLineas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturasDescuentosLineas.getRowCount()>=1) {
				jTableDatosFacturasDescuentosLineas.removeRowSelectionInterval(0, jTableDatosFacturasDescuentosLineas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturasDescuentosLineas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(false) ;
			
			this.isEsNuevoFacturasDescuentosLineas=false;
			
			if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturasDescuentosLineas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				
				//SI ES MANUAL
				if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturasDescuentosLineas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturasDescuentosLineas--;			
			//FacturasDescuentosLineas facturasdescuentoslineasAux= new FacturasDescuentosLineas();			
			//facturasdescuentoslineasAux.setId(this.iIdNuevoFacturasDescuentosLineas);
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturasDescuentosLineas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
			
			this.facturasdescuentoslineas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().add(this.facturasdescuentoslineasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturasdescuentoslineass.add(this.facturasdescuentoslineasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			
			this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(this.getIndiceNuevoFacturasDescuentosLineas(), this.getIndiceNuevoFacturasDescuentosLineas());
			
			int iLastRow =  this.jTableDatosFacturasDescuentosLineas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturasDescuentosLineas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturasDescuentosLineas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
			
			//SI ES MANUAL
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasDescuentosLineas();
			}
			
			//this.abrirFrameTreeFacturasDescuentosLineas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturasDescuentosLineas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturasDescuentosLineas.setFileImportacion(this.jInternalFrameImportacionFacturasDescuentosLineas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturasDescuentosLineas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturasDescuentosLineas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		

		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturasDescuentosLineasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturasDescuentosLineasBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talOtro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talOtro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talOtro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talOtro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoria="nombre_tipo_factura";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoria="total_descuento";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoria="total_otro";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoriaValor="nombre_tipo_factura";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoriaValor="total_descuento";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoriaValor="total_otro";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_factura");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_descuento");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_otro");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturasDescuentosLineass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getnombre_tipo_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.gettotal_descuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.gettotal_otro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasDescuentosLineasConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA);
					iRow++;

					for(FacturasDescuentosLineas facturasdescuentoslineas:facturasdescuentoslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasdescuentoslineas.getiva());
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
			//	this.getFilaCabeceraExportarExcelFacturasDescuentosLineas(row);				
			//	iRow++;
			//}				
			
			//for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturasDescuentosLineas(facturasdescuentoslineasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
			
			//SI ES MANUAL
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasDescuentosLineas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
			
			//SI ES MANUAL
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasDescuentosLineas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
			
			//SI ES MANUAL
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasDescuentosLineas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturasDescuentosLineas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturasDescuentosLineas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturasDescuentosLineas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturasDescuentosLineas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturasDescuentosLineas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturasDescuentosLineas.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturasDescuentosLineas.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturasDescuentosLineas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturasDescuentosLineas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturasDescuentosLineas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturasDescuentosLineas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturasDescuentosLineas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturasDescuentosLineas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasDescuentosLineas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturasDescuentosLineas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturasDescuentosLineas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturasDescuentosLineas();
		
		this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasDescuentosLineas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasDescuentosLineas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasDescuentosLineas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasDescuentosLineas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturasDescuentosLineas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionNuevoFacturasDescuentosLineas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturasDescuentosLineas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturasDescuentosLineas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionNuevoFacturasDescuentosLineas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionSinCerrarFacturasDescuentosLineas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jCheckBoxPostAccionSinMensajeFacturasDescuentosLineas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturasDescuentosLineas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturasDescuentosLineas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturasDescuentosLineas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturasDescuentosLineas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturasDescuentosLineas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturasDescuentosLineas(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasDescuentosLineas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturasDescuentosLineas() throws Exception {
		try	{
			if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasDescuentosLineas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasDescuentosLineas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasDescuentosLineas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturasDescuentosLineas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturasDescuentosLineas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturasDescuentosLineas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturasDescuentosLineas.addItem(reporte);
			}
			
			
			if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturasDescuentosLineas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturasDescuentosLineas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturasDescuentosLineas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasDescuentosLineas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasDescuentosLineas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturasDescuentosLineasConstantesFunciones.getTiposSeleccionarFacturasDescuentosLineas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturasDescuentosLineasConstantesFunciones.getTiposSeleccionarFacturasDescuentosLineas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturasDescuentosLineasConstantesFunciones.getTiposSeleccionarFacturasDescuentosLineas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturasDescuentosLineas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.getSelectedItem()!=null){this.id_vendedorBusquedaFacturasDescuentosLineas=((Vendedor)this.jComboBoxid_vendedorBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaFacturasDescuentosLineas=new Date(this.jDateChooserfecha_emision_desdeBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.getDate().getTime());
		this.fecha_emision_hastaBusquedaFacturasDescuentosLineas=new Date(this.jDateChooserfecha_emision_hastaBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturasDescuentosLineas(Boolean esInicializar) throws Exception {				
		if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasDescuentosLineas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturasDescuentosLineas() throws Exception {
		this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturasDescuentosLineas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturasDescuentosLineasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturasDescuentosLineas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturasdescuentoslineass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturasDescuentosLineas.setModel(new FacturasDescuentosLineasModel(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturasDescuentosLineas.setModel(new FacturasDescuentosLineasModel(this.facturasdescuentoslineass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturasDescuentosLineas!=null && this.jInternalFrameOrderByFacturasDescuentosLineas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturasDescuentosLineas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,facturasdescuentoslineasConstantesFunciones.resaltarSeleccionarFacturasDescuentosLineas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturasDescuentosLineasConstantesFunciones.SCLASSWEBTITULO,facturasdescuentoslineasConstantesFunciones.resaltarSeleccionarFacturasDescuentosLineas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_ID));

		if(this.facturasdescuentoslineasConstantesFunciones.mostraridFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltaridFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activaridFacturasDescuentosLineas,iSizeTabla,this,true,"idFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltaridFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activaridFacturasDescuentosLineas,this,true,"idFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarnombreFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombreFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombreFacturasDescuentosLineas,iSizeTabla,this,true,"nombreFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombreFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombreFacturasDescuentosLineas,this,true,"nombreFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_completo_clienteFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_completo_clienteFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombre_completo_clienteFacturasDescuentosLineas,iSizeTabla,this,true,"nombre_completo_clienteFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_completo_clienteFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombre_completo_clienteFacturasDescuentosLineas,this,true,"nombre_completo_clienteFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_tipo_facturaFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_tipo_facturaFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombre_tipo_facturaFacturasDescuentosLineas,iSizeTabla,this,true,"nombre_tipo_facturaFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_tipo_facturaFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnombre_tipo_facturaFacturasDescuentosLineas,this,true,"nombre_tipo_facturaFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emisionFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emisionFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarfecha_emisionFacturasDescuentosLineas,iSizeTabla,this,true,"fecha_emisionFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emisionFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarfecha_emisionFacturasDescuentosLineas,this,true,"fecha_emisionFacturasDescuentosLineas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_vencimientoFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_vencimientoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarfecha_vencimientoFacturasDescuentosLineas,iSizeTabla,this,true,"fecha_vencimientoFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_vencimientoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarfecha_vencimientoFacturasDescuentosLineas,this,true,"fecha_vencimientoFacturasDescuentosLineas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarnumero_pre_impresoFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnumero_pre_impresoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnumero_pre_impresoFacturasDescuentosLineas,iSizeTabla,this,true,"numero_pre_impresoFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarnumero_pre_impresoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarnumero_pre_impresoFacturasDescuentosLineas,this,true,"numero_pre_impresoFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_descuentoFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_descuentoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotal_descuentoFacturasDescuentosLineas,iSizeTabla,this,true,"total_descuentoFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_descuentoFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotal_descuentoFacturasDescuentosLineas,this,true,"total_descuentoFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_otroFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_otroFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotal_otroFacturasDescuentosLineas,iSizeTabla,this,true,"total_otroFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_otroFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotal_otroFacturasDescuentosLineas,this,true,"total_otroFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarsub_totalFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarsub_totalFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarsub_totalFacturasDescuentosLineas,iSizeTabla,this,true,"sub_totalFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarsub_totalFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarsub_totalFacturasDescuentosLineas,this,true,"sub_totalFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrartotalFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotalFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotalFacturasDescuentosLineas,iSizeTabla,this,true,"totalFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltartotalFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activartotalFacturasDescuentosLineas,this,true,"totalFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,FacturasDescuentosLineasConstantesFunciones.LABEL_IVA));

		if(this.facturasdescuentoslineasConstantesFunciones.mostrarivaFacturasDescuentosLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasDescuentosLineasConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarivaFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarivaFacturasDescuentosLineas,iSizeTabla,this,true,"ivaFacturasDescuentosLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasdescuentoslineasConstantesFunciones.resaltarivaFacturasDescuentosLineas,this.facturasdescuentoslineasConstantesFunciones.activarivaFacturasDescuentosLineas,this,true,"ivaFacturasDescuentosLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasDescuentosLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasDescuentosLineas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasDescuentosLineas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturasDescuentosLineas.addColumn(tableColumn);
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
			
			this.jTableDatosFacturasDescuentosLineas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturasDescuentosLineas.moveColumn(this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturasDescuentosLineas.moveColumn(this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturasDescuentosLineas.moveColumn(this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturasDescuentosLineas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturasDescuentosLineas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturasDescuentosLineas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturasDescuentosLineas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturasDescuentosLineas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturasDescuentosLineas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturasdescuentoslineasLogic.getFacturasDescuentosLineass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturasdescuentoslineass.size()-1;
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
		//this.jTableDatosFacturasDescuentosLineas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturasDescuentosLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturasDescuentosLineas();
			
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
				
				//this.isEsNuevoFacturasDescuentosLineas=false;
					
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
				if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasDescuentosLineas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasDescuentosLineas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturasdescuentoslineas.getsType().equals("DUPLICADO")
				   || this.facturasdescuentoslineas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturasDescuentosLineas=true;
				
				} else {
					this.isEsNuevoFacturasDescuentosLineas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
					if(this.facturasdescuentoslineas.getId()>=0 && !this.facturasdescuentoslineas.getIsNew()) {						
						this.isEsNuevoFacturasDescuentosLineas=false;
						
					} else {
						this.isEsNuevoFacturasDescuentosLineas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturasDescuentosLineas(esRelaciones);						
				
				this.seleccionarFacturasDescuentosLineas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturasdescuentoslineas.getId()<0) {
					this.isEsNuevoFacturasDescuentosLineas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturasDescuentosLineas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturasDescuentosLineas(evt,rowIndex);
				}	
				
				if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturasDescuentosLineas: " + this.dDif); 
					}
				}								
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturasDescuentosLineas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturasdescuentoslineas)) {
					if(this.facturasdescuentoslineas.getId()>0) {
						this.facturasdescuentoslineas.setIsDeleted(true);
						
						this.facturasdescuentoslineassEliminados.add(this.facturasdescuentoslineas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().remove(this.facturasdescuentoslineas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineass.remove(this.facturasdescuentoslineas);				
					}
					
					
					((FacturasDescuentosLineasModel) this.jTableDatosFacturasDescuentosLineas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturasDescuentosLineas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturasDescuentosLineas) {
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasDescuentosLineas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasDescuentosLineas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturasDescuentosLineas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturasDescuentosLineas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturasDescuentosLineas(facturasdescuentoslineas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturasDescuentosLineas(facturasdescuentoslineas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturasDescuentosLineas(facturasdescuentoslineas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturasDescuentosLineas(facturasdescuentoslineas);
	}
	
	public void setVariablesObjetoActualToFormularioFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setText(facturasdescuentoslineas.getId().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setDate(facturasdescuentoslineas.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setDate(facturasdescuentoslineas.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setText(facturasdescuentoslineas.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setText(facturasdescuentoslineas.getiva().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturasDescuentosLineas facturasdescuentoslineasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturasdescuentoslineasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturasDescuentosLineas facturasdescuentoslineasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturasdescuentoslineasLocal=this.facturasdescuentoslineas;
			} else {
				facturasdescuentoslineasLocal=this.facturasdescuentoslineasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturasdescuentoslineasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturasDescuentosLineas(facturasdescuentoslineasLocal,true);
					
					if(facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturasdescuentoslineasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturasdescuentoslineasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(facturasdescuentoslineas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(facturasdescuentoslineas);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(facturasdescuentoslineas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.getText()==null || this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.getText()=="" || this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setText("0");
			}

			if(conColumnasBase) {facturasdescuentoslineas.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelIdFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setnombre(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombreFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setnombre_completo_cliente(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_completo_clienteFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setnombre_tipo_factura(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnombre_tipo_facturaFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setfecha_emision(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_emisionFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setfecha_vencimiento(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelfecha_vencimientoFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setnumero_pre_impreso(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelnumero_pre_impresoFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.settotal_descuento(Double.parseDouble(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_descuentoFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.settotal_otro(Double.parseDouble(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotal_otroFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelsub_totalFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.settotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabeltotalFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasdescuentoslineas.setiva(Double.parseDouble(this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasDescuentosLineasConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelivaFacturasDescuentosLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineasBean,FacturasDescuentosLineas facturasdescuentoslineas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineasOrigen,FacturasDescuentosLineas facturasdescuentoslineas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getId()!=null && !facturasdescuentoslineasOrigen.getId().equals(0L))) {facturasdescuentoslineas.setId(facturasdescuentoslineasOrigen.getId());}}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getfecha_emision_desde()!=null && !facturasdescuentoslineasOrigen.getfecha_emision_desde().equals(new Date()))) {facturasdescuentoslineas.setfecha_emision_desde(facturasdescuentoslineasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getfecha_emision_hasta()!=null && !facturasdescuentoslineasOrigen.getfecha_emision_hasta().equals(new Date()))) {facturasdescuentoslineas.setfecha_emision_hasta(facturasdescuentoslineasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getnombre()!=null && !facturasdescuentoslineasOrigen.getnombre().equals(""))) {facturasdescuentoslineas.setnombre(facturasdescuentoslineasOrigen.getnombre());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getnombre_completo_cliente()!=null && !facturasdescuentoslineasOrigen.getnombre_completo_cliente().equals(""))) {facturasdescuentoslineas.setnombre_completo_cliente(facturasdescuentoslineasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getnombre_tipo_factura()!=null && !facturasdescuentoslineasOrigen.getnombre_tipo_factura().equals(""))) {facturasdescuentoslineas.setnombre_tipo_factura(facturasdescuentoslineasOrigen.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getfecha_emision()!=null && !facturasdescuentoslineasOrigen.getfecha_emision().equals(new Date()))) {facturasdescuentoslineas.setfecha_emision(facturasdescuentoslineasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getfecha_vencimiento()!=null && !facturasdescuentoslineasOrigen.getfecha_vencimiento().equals(new Date()))) {facturasdescuentoslineas.setfecha_vencimiento(facturasdescuentoslineasOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getnumero_pre_impreso()!=null && !facturasdescuentoslineasOrigen.getnumero_pre_impreso().equals(""))) {facturasdescuentoslineas.setnumero_pre_impreso(facturasdescuentoslineasOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.gettotal_descuento()!=null && !facturasdescuentoslineasOrigen.gettotal_descuento().equals(0.0))) {facturasdescuentoslineas.settotal_descuento(facturasdescuentoslineasOrigen.gettotal_descuento());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.gettotal_otro()!=null && !facturasdescuentoslineasOrigen.gettotal_otro().equals(0.0))) {facturasdescuentoslineas.settotal_otro(facturasdescuentoslineasOrigen.gettotal_otro());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getsub_total()!=null && !facturasdescuentoslineasOrigen.getsub_total().equals(0.0))) {facturasdescuentoslineas.setsub_total(facturasdescuentoslineasOrigen.getsub_total());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.gettotal()!=null && !facturasdescuentoslineasOrigen.gettotal().equals(0.0))) {facturasdescuentoslineas.settotal(facturasdescuentoslineasOrigen.gettotal());}
			if(conDefault || (!conDefault && facturasdescuentoslineasOrigen.getiva()!=null && !facturasdescuentoslineasOrigen.getiva().equals(0.0))) {facturasdescuentoslineas.setiva(facturasdescuentoslineasOrigen.getiva());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setText(facturasdescuentoslineas.getId().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setDate(facturasdescuentoslineas.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setDate(facturasdescuentoslineas.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setText(facturasdescuentoslineas.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setText(facturasdescuentoslineas.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setText(facturasdescuentoslineas.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setText(facturasdescuentoslineas.getiva().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasDescuentosLineas(FacturasDescuentosLineasBean facturasdescuentoslineasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getId().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getnombre());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setDate(facturasdescuentoslineasBean.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setDate(facturasdescuentoslineasBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setText(facturasdescuentoslineasBean.getiva().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturasDescuentosLineas(FacturasDescuentosLineasParameterReturnGeneral facturasdescuentoslineasReturnGeneral,FacturasDescuentosLineasBean facturasdescuentoslineasBean,Boolean conDefault) throws Exception { 
		try {
			FacturasDescuentosLineas facturasdescuentoslineasLocal=new FacturasDescuentosLineas();
			
			facturasdescuentoslineasLocal=facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getId()!=null && !facturasdescuentoslineasLocal.getId().equals(0L))) {facturasdescuentoslineasBean.setId(facturasdescuentoslineasLocal.getId());}}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getnombre()!=null && !facturasdescuentoslineasLocal.getnombre().equals(""))) {facturasdescuentoslineasBean.setnombre(facturasdescuentoslineasLocal.getnombre());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getnombre_completo_cliente()!=null && !facturasdescuentoslineasLocal.getnombre_completo_cliente().equals(""))) {facturasdescuentoslineasBean.setnombre_completo_cliente(facturasdescuentoslineasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getnombre_tipo_factura()!=null && !facturasdescuentoslineasLocal.getnombre_tipo_factura().equals(""))) {facturasdescuentoslineasBean.setnombre_tipo_factura(facturasdescuentoslineasLocal.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getfecha_emision()!=null && !facturasdescuentoslineasLocal.getfecha_emision().equals(new Date()))) {facturasdescuentoslineasBean.setfecha_emision(facturasdescuentoslineasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getfecha_vencimiento()!=null && !facturasdescuentoslineasLocal.getfecha_vencimiento().equals(new Date()))) {facturasdescuentoslineasBean.setfecha_vencimiento(facturasdescuentoslineasLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getnumero_pre_impreso()!=null && !facturasdescuentoslineasLocal.getnumero_pre_impreso().equals(""))) {facturasdescuentoslineasBean.setnumero_pre_impreso(facturasdescuentoslineasLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.gettotal_descuento()!=null && !facturasdescuentoslineasLocal.gettotal_descuento().equals(0.0))) {facturasdescuentoslineasBean.settotal_descuento(facturasdescuentoslineasLocal.gettotal_descuento());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.gettotal_otro()!=null && !facturasdescuentoslineasLocal.gettotal_otro().equals(0.0))) {facturasdescuentoslineasBean.settotal_otro(facturasdescuentoslineasLocal.gettotal_otro());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getsub_total()!=null && !facturasdescuentoslineasLocal.getsub_total().equals(0.0))) {facturasdescuentoslineasBean.setsub_total(facturasdescuentoslineasLocal.getsub_total());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.gettotal()!=null && !facturasdescuentoslineasLocal.gettotal().equals(0.0))) {facturasdescuentoslineasBean.settotal(facturasdescuentoslineasLocal.gettotal());}
			if(conDefault || (!conDefault && facturasdescuentoslineasLocal.getiva()!=null && !facturasdescuentoslineasLocal.getiva().equals(0.0))) {facturasdescuentoslineasBean.setiva(facturasdescuentoslineasLocal.getiva());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturasDescuentosLineasGenerico(Long idFacturasDescuentosLineasSeleccionado,JComboBox jComboBoxFacturasDescuentosLineas,List<FacturasDescuentosLineas> facturasdescuentoslineassLocal)throws Exception {
		try {
			FacturasDescuentosLineas  facturasdescuentoslineasTemp=null;

			for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassLocal) {
				if(facturasdescuentoslineasAux.getId()!=null && facturasdescuentoslineasAux.getId().equals(idFacturasDescuentosLineasSeleccionado)) {
					facturasdescuentoslineasTemp=facturasdescuentoslineasAux;
					break;
				}
			}

			jComboBoxFacturasDescuentosLineas.setSelectedItem(facturasdescuentoslineasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturasDescuentosLineasGenerico(JComboBox jComboBoxFacturasDescuentosLineas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasDescuentosLineas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturasDescuentosLineas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasDescuentosLineas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturasDescuentosLineas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturasDescuentosLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturasDescuentosLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasdescuentoslineas=(FacturasDescuentosLineas) facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasdescuentoslineas =(FacturasDescuentosLineas) facturasdescuentoslineass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturasdescuentoslineas.getIsNew() && !facturasdescuentoslineas.getIsChanged() && !facturasdescuentoslineas.getIsDeleted()) {
				sDescripcion=facturasdescuentoslineas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturasdescuentoslineas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!facturasdescuentoslineas.getIsNew() && !facturasdescuentoslineas.getIsChanged() && !facturasdescuentoslineas.getIsDeleted()) {
				sDescripcion=facturasdescuentoslineas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=facturasdescuentoslineas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!facturasdescuentoslineas.getIsNew() && !facturasdescuentoslineas.getIsChanged() && !facturasdescuentoslineas.getIsDeleted()) {
				sDescripcion=facturasdescuentoslineas.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=facturasdescuentoslineas.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturasDescuentosLineas facturasdescuentoslineasRow=new FacturasDescuentosLineas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasdescuentoslineasRow=(FacturasDescuentosLineas) facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasdescuentoslineasRow=(FacturasDescuentosLineas) facturasdescuentoslineass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));			
			this.jButtonDuplicarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas && this.isPermisoDuplicarFacturasDescuentosLineas));			
			this.jButtonCopiarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaCopiarFacturasDescuentosLineas && this.isPermisoCopiarFacturasDescuentosLineas));
			this.jButtonVerFormFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaVerFormFacturasDescuentosLineas && this.isPermisoVerFormFacturasDescuentosLineas));
			
			this.jButtonAbrirOrderByFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));			
			
			this.jButtonNuevoRelacionesFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));			
			this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaModificarFacturasDescuentosLineas && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaActualizarFacturasDescuentosLineas && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaEliminarFacturasDescuentosLineas && this.isPermisoEliminarFacturasDescuentosLineas));
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.setVisible(this.isVisibilidadCeldaCancelarFacturasDescuentosLineas);							
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));						
			this.jButtonDuplicarToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas && this.isPermisoDuplicarFacturasDescuentosLineas));						
			this.jButtonCopiarToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaCopiarFacturasDescuentosLineas && this.isPermisoCopiarFacturasDescuentosLineas));			
			this.jButtonVerFormToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaVerFormFacturasDescuentosLineas && this.isPermisoVerFormFacturasDescuentosLineas));			
			this.jButtonAbrirOrderByToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));
			this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));			
			this.jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));			
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaModificarFacturasDescuentosLineas && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaActualizarFacturasDescuentosLineas  && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaEliminarFacturasDescuentosLineas && this.isPermisoEliminarFacturasDescuentosLineas));
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarToolBarFacturasDescuentosLineas.setVisible(this.isVisibilidadCeldaCancelarFacturasDescuentosLineas);				
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));			
			this.jMenuItemDuplicarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas && this.isPermisoDuplicarFacturasDescuentosLineas));			
			this.jMenuItemCopiarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaCopiarFacturasDescuentosLineas && this.isPermisoCopiarFacturasDescuentosLineas));			
			this.jMenuItemVerFormFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaVerFormFacturasDescuentosLineas && this.isPermisoVerFormFacturasDescuentosLineas));			
			this.jMenuItemAbrirOrderByFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));			
			//this.jMenuItemMostrarOcultarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));
			this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));			
			//this.jMenuItemDetalleMostrarOcultarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaOrdenFacturasDescuentosLineas && this.isPermisoOrdenFacturasDescuentosLineas));			
			this.jMenuItemNuevoRelacionesFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas));			
			this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaNuevoFacturasDescuentosLineas && this.isPermisoNuevoFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));									
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemModificarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaModificarFacturasDescuentosLineas && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemActualizarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaActualizarFacturasDescuentosLineas && this.isPermisoActualizarFacturasDescuentosLineas));	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemEliminarFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaEliminarFacturasDescuentosLineas && this.isPermisoEliminarFacturasDescuentosLineas));
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemCancelarFacturasDescuentosLineas.setVisible(this.isVisibilidadCeldaCancelarFacturasDescuentosLineas);				
			}
			
			this.jMenuItemGuardarCambiosFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));						
			this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=this.jButtonNuevoFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas=this.jButtonDuplicarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaCopiarFacturasDescuentosLineas=this.jButtonCopiarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaVerFormFacturasDescuentosLineas=this.jButtonVerFormFacturasDescuentosLineas.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturasDescuentosLineas=this.jButtonAbrirOrderByFacturasDescuentosLineas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=this.jButtonNuevoRelacionesFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=this.jButtonModificarFacturasDescuentosLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=this.jButtonNuevoToolBarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarToolBarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarToolBarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarToolBarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarToolBarFacturasDescuentosLineas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=this.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=this.jMenuItemNuevoFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=this.jMenuItemNuevoRelacionesFacturasDescuentosLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemModificarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemActualizarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemEliminarFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemCancelarFacturasDescuentosLineas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=this.jMenuItemGuardarCambiosFacturasDescuentosLineas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturasDescuentosLineas(Boolean esInicializar) {
		if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
				//if(this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasDescuentosLineas();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturasDescuentosLineas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturasDescuentosLineas() {
		this.jButtonNuevoFacturasDescuentosLineas.setVisible(this.isPermisoNuevoFacturasDescuentosLineas);			
		this.jButtonDuplicarFacturasDescuentosLineas.setVisible(this.isPermisoDuplicarFacturasDescuentosLineas);			
		this.jButtonCopiarFacturasDescuentosLineas.setVisible(this.isPermisoCopiarFacturasDescuentosLineas);			
		this.jButtonVerFormFacturasDescuentosLineas.setVisible(this.isPermisoVerFormFacturasDescuentosLineas);			
		
		this.jButtonAbrirOrderByFacturasDescuentosLineas.setVisible(this.isPermisoOrdenFacturasDescuentosLineas);					
		
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.setVisible(this.isPermisoNuevoFacturasDescuentosLineas);			
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarFacturasDescuentosLineas.setVisible(this.isPermisoActualizarFacturasDescuentosLineas);	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.setVisible(this.isPermisoActualizarFacturasDescuentosLineas);	
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.setVisible(this.isPermisoEliminarFacturasDescuentosLineas);
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.setVisible(this.isVisibilidadCeldaCancelarFacturasDescuentosLineas);						
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.setVisible(this.isPermisoGuardarCambiosFacturasDescuentosLineas);							
		}
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.setVisible(this.isPermisoActualizarFacturasDescuentosLineas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasDescuentosLineas() {
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarFacturasDescuentosLineas.setVisible(this.isPermisoActualizarFacturasDescuentosLineas);	
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.setVisible(this.isPermisoActualizarFacturasDescuentosLineas);	
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.setVisible(this.isPermisoEliminarFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.setVisible(this.isVisibilidadCeldaCancelarFacturasDescuentosLineas);							
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.setVisible((this.isVisibilidadCeldaGuardarFacturasDescuentosLineas && this.isPermisoGuardarCambiosFacturasDescuentosLineas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturasDescuentosLineas() {
		if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturasDescuentosLineas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturasDescuentosLineas() {
	}
	
	public void jTableDatosFacturasDescuentosLineasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturasDescuentosLineas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturasdescuentoslineas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturasDescuentosLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturasDescuentosLineas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasDescuentosLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturasdescuentoslineasLogic.getConnexion());

				if(this.facturasdescuentoslineas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturasdescuentoslineas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasDescuentosLineas=(TitledBorder)this.jScrollPanelDatosFacturasDescuentosLineas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturasDescuentosLineas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturasdescuentoslineas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFacturasDescuentosLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFacturasDescuentosLineas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasDescuentosLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.facturasdescuentoslineasLogic.getConnexion());

				if(this.facturasdescuentoslineas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.facturasdescuentoslineas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasDescuentosLineas=(TitledBorder)this.jScrollPanelDatosFacturasDescuentosLineas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFacturasDescuentosLineas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.facturasdescuentoslineas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorFacturasDescuentosLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebFacturasDescuentosLineas(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasDescuentosLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasDescuentosLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.facturasdescuentoslineasLogic.getConnexion());

				if(this.facturasdescuentoslineas.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.facturasdescuentoslineas.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasDescuentosLineas=(TitledBorder)this.jScrollPanelDatosFacturasDescuentosLineas.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderFacturasDescuentosLineas.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.facturasdescuentoslineas.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.facturasdescuentoslineas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.facturasdescuentoslineas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.facturasdescuentoslineas.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.facturasdescuentoslineas.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_facturaFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getnombre_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_factura like '%"+this.facturasdescuentoslineas.getnombre_tipo_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.facturasdescuentoslineas.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.facturasdescuentoslineas.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.facturasdescuentoslineas.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_descuentoFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.gettotal_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_descuento = "+this.facturasdescuentoslineas.gettotal_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_otroFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.gettotal_otro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_otro = "+this.facturasdescuentoslineas.gettotal_otro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.facturasdescuentoslineas.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.facturasdescuentoslineas.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaFacturasDescuentosLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.getfacturasdescuentoslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasdescuentoslineas==null) {
						this.facturasdescuentoslineas = new FacturasDescuentosLineas();
					}

					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);
				}

				if(this.facturasdescuentoslineas.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.facturasdescuentoslineas.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasDescuentosLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);

			this.getFacturasDescuentosLineassBusquedaFacturasDescuentosLineas();

			this.inicializarActualizarBindingFacturasDescuentosLineas(false);

			//if(FacturasDescuentosLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);

			this.getFacturasDescuentosLineassFK_IdEmpresa();

			this.inicializarActualizarBindingFacturasDescuentosLineas(false);

			//if(FacturasDescuentosLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);

			this.getFacturasDescuentosLineassFK_IdSucursal();

			this.inicializarActualizarBindingFacturasDescuentosLineas(false);

			//if(FacturasDescuentosLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorFacturasDescuentosLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);

			this.getFacturasDescuentosLineassFK_IdVendedor();

			this.inicializarActualizarBindingFacturasDescuentosLineas(false);

			//if(FacturasDescuentosLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasdescuentoslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturasDescuentosLineas() {
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.dispose();
			this.jInternalFrameDetalleFormFacturasDescuentosLineas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
			this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.dispose();
			this.jInternalFrameReporteDinamicoFacturasDescuentosLineas=null;
		}
		
		if(this.jInternalFrameImportacionFacturasDescuentosLineas!=null) {
			this.jInternalFrameImportacionFacturasDescuentosLineas.setVisible(false);	    			
			this.jInternalFrameImportacionFacturasDescuentosLineas.dispose();
			this.jInternalFrameImportacionFacturasDescuentosLineas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturasDescuentosLineas();
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturasDescuentosLineas")) {
				jButtonDuplicarFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturasDescuentosLineas")) {
				jButtonCopiarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturasDescuentosLineas")) {
				jButtonVerFormFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturasDescuentosLineas")) {
				jButtonDuplicarFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturasDescuentosLineas")) {
				jButtonDuplicarFacturasDescuentosLineasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturasDescuentosLineas")) {
				jButtonModificarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturasDescuentosLineas")) {
				jButtonModificarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturasDescuentosLineas")) {
				jButtonModificarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturasDescuentosLineas")) {
				jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturasDescuentosLineas")) {
				jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturasDescuentosLineas")) {
				jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturasDescuentosLineas")) {
				jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturasDescuentosLineas")) {
				jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturasDescuentosLineas")) {
				jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturasDescuentosLineas")) {
				jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturasDescuentosLineas")) {
				jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturasDescuentosLineas")) {
				jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturasDescuentosLineas")) {
				jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturasDescuentosLineas")) {
				jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturasDescuentosLineas")) {
				jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturasDescuentosLineas")) {
				jButtonMostrarOcultarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturasDescuentosLineas")) {
				jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturasDescuentosLineas")) {
				jButtonCopiarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturasDescuentosLineas")) {
				jButtonVerFormFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturasDescuentosLineas")) {
				jButtonCopiarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturasDescuentosLineas")) {
				jButtonVerFormFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturasDescuentosLineas")) {
				jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturasDescuentosLineas")) {
				jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturasDescuentosLineas")) {
				jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturasDescuentosLineas")) {
				jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturasDescuentosLineas")) {
				jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturasDescuentosLineas")) {
				jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturasDescuentosLineas")) {
				jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturasDescuentosLineas")) {
				jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturasDescuentosLineas")) {
				jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturasDescuentosLineas") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturasDescuentosLineas")) {
				jButtonAbrirOrderByFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturasDescuentosLineas") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturasDescuentosLineas")) {
				jButtonMostrarOcultarFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasDescuentosLineas")) {
				jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturasDescuentosLineas")) {
				jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturasDescuentosLineas")) {
				jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturasDescuentosLineas")) {
				jButtonCerrarReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturasDescuentosLineas")) {
				jButtonGenerarReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturasDescuentosLineas")) {
				
				jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturasDescuentosLineas")) {
				jButtonCerrarImportacionFacturasDescuentosLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturasDescuentosLineas")) {
				
				jButtonGenerarImportacionFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturasDescuentosLineas")) {
				
				jButtonAbrirImportacionFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturasDescuentosLineas")) {
				jComboBoxTiposAccionesFacturasDescuentosLineasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturasDescuentosLineas")) {
				jComboBoxTiposRelacionesFacturasDescuentosLineasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturasDescuentosLineas")) {
				jComboBoxTiposAccionesFacturasDescuentosLineasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturasDescuentosLineas")) {
				
				jComboBoxTiposSeleccionarFacturasDescuentosLineasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturasDescuentosLineas")) {
				jTextFieldValorCampoGeneralFacturasDescuentosLineasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturasDescuentosLineas")) {
				jButtonAbrirOrderByFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturasDescuentosLineas")) {
				jButtonAbrirOrderByFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturasDescuentosLineas")) {
				jButtonCerrarOrderByFacturasDescuentosLineasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasDescuentosLineasBusqueda")) {
				this.jButtonidFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasDescuentosLineasUpdate")) {
				this.jButtonid_empresaFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_empresaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturasDescuentosLineasUpdate")) {
				this.jButtonid_sucursalFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_sucursalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorFacturasDescuentosLineasUpdate")) {
				this.jButtonid_vendedorFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_vendedorFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombreFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emisionFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_vencimientoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasDescuentosLineasBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoFacturasDescuentosLineasBusqueda")) {
				this.jButtontotal_descuentoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroFacturasDescuentosLineasBusqueda")) {
				this.jButtontotal_otroFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalFacturasDescuentosLineasBusqueda")) {
				this.jButtonsub_totalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasDescuentosLineasBusqueda")) {
				this.jButtontotalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasDescuentosLineasBusqueda")) {
				this.jButtonivaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturasDescuentosLineasFacturasDescuentosLineas")) {
				this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineasActionPerformed(evt);
			}
			
			;
			
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturasDescuentosLineas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturasDescuentosLineas facturasdescuentoslineasLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturasdescuentoslineasLocal=this.facturasdescuentoslineas;
			} else {
				facturasdescuentoslineasLocal=this.facturasdescuentoslineasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
							
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
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
			
			


			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
								
						
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
								
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
							
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
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
			
			


			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
								
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturasDescuentosLineas")) {
					jCheckBoxSeleccionarTodosFacturasDescuentosLineasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturasDescuentosLineas")) {
					jCheckBoxSeleccionadosFacturasDescuentosLineasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturasDescuentosLineas")) {
					
				}
				
				


				
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
												
				
				


				
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
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
			
			


			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasdescuentoslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasdescuentoslineas);
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
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
				
				


				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasDescuentosLineas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasDescuentosLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasDescuentosLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasdescuentoslineasAnterior =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturasDescuentosLineas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturasDescuentosLineasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturasDescuentosLineas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturasdescuentoslineas =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturasdescuentoslineas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturasDescuentosLineas")) {
				
				}
				
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturasDescuentosLineas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturasDescuentosLineas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturasDescuentosLineas")) {
			
			}
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturasDescuentosLineas();
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			if(sTipo.equals("NuevoFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturasDescuentosLineas")) {
				jButtonDuplicarFacturasDescuentosLineasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturasDescuentosLineas")) {
				jButtonCopiarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturasDescuentosLineas")) {
				jButtonVerFormFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturasDescuentosLineas")) {
				jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturasDescuentosLineas")) {
				jButtonModificarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturasDescuentosLineas")) {
				jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturasDescuentosLineas")) {
				jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturasDescuentosLineas")) {
				jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturasDescuentosLineas")) {
				jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturasDescuentosLineas")) {
				jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasDescuentosLineas")) {
				jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturasDescuentosLineas")) {
				jButtonAbrirOrderByFacturasDescuentosLineasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturasDescuentosLineas")) {
				jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturasDescuentosLineas")) {
				jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturasDescuentosLineas")) {
				jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasDescuentosLineasBusqueda")) {
				this.jButtonidFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasDescuentosLineasUpdate")) {
				this.jButtonid_empresaFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_empresaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturasDescuentosLineasUpdate")) {
				this.jButtonid_sucursalFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_sucursalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorFacturasDescuentosLineasUpdate")) {
				this.jButtonid_vendedorFacturasDescuentosLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorFacturasDescuentosLineasBusqueda")) {
				this.jButtonid_vendedorFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emision_desdeFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emision_hastaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombreFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaFacturasDescuentosLineasBusqueda")) {
				this.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_emisionFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturasDescuentosLineasBusqueda")) {
				this.jButtonfecha_vencimientoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasDescuentosLineasBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoFacturasDescuentosLineasBusqueda")) {
				this.jButtontotal_descuentoFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroFacturasDescuentosLineasBusqueda")) {
				this.jButtontotal_otroFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalFacturasDescuentosLineasBusqueda")) {
				this.jButtonsub_totalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasDescuentosLineasBusqueda")) {
				this.jButtontotalFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasDescuentosLineasBusqueda")) {
				this.jButtonivaFacturasDescuentosLineasBusquedaActionPerformed(evt);
			}
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturasDescuentosLineas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturasDescuentosLineas")) {
				closingInternalFrameFacturasDescuentosLineas();
				
			} else if(sTipo.equals("jButtonCancelarFacturasDescuentosLineas")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturasDescuentosLineas = (JInternalFrameBase)evt.getSource();
	            	
	            FacturasDescuentosLineasBeanSwingJInternalFrame jInternalFrameParent=(FacturasDescuentosLineasBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasDescuentosLineas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturasDescuentosLineasActionPerformed(null);
			}
			
			FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasdescuentoslineas,new Object(),this.facturasdescuentoslineasParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturasDescuentosLineas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturasDescuentosLineas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturasDescuentosLineas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturasdescuentoslineas)) {
			if(!esControlTabla) {
				if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);			
				}
				
				if(this.facturasdescuentoslineasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral,this.facturasdescuentoslineasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturasdescuentoslineasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturasDescuentosLineas(classes,this.facturasdescuentoslineasReturnGeneral,this.facturasdescuentoslineasBean,false);
					}
						
					if(this.facturasdescuentoslineasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas());	
					}
						
					if(this.facturasdescuentoslineasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas(),classes);//this.facturasdescuentoslineasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturasDescuentosLineas(this.facturasdescuentoslineas,classes);//this.facturasdescuentoslineasBean);									
				}
			
				if(FacturasDescuentosLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturasDescuentosLineas(this.facturasdescuentoslineas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasDescuentosLineas(this.facturasdescuentoslineas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturasdescuentoslineasAnterior!=null) {
						this.facturasdescuentoslineas=this.facturasdescuentoslineasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturasdescuentoslineasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas(),facturasdescuentoslineasLogic.getFacturasDescuentosLineass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineas(),this.facturasdescuentoslineass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturasDescuentosLineas.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturasDescuentosLineas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturasDescuentosLineas();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturasDescuentosLineas() throws Exception {
		
		FacturasDescuentosLineasModel facturasdescuentoslineasModel=(FacturasDescuentosLineasModel)this.jTableDatosFacturasDescuentosLineas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasdescuentoslineasModel.facturasdescuentoslineass=this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturasdescuentoslineasModel.facturasdescuentoslineass=this.facturasdescuentoslineass;
		}
		
		
		((FacturasDescuentosLineasModel) this.jTableDatosFacturasDescuentosLineas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturasDescuentosLineas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturasdescuentoslineasAnterior(),this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturasdescuentoslineasAnterior(),this.facturasdescuentoslineass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturasDescuentosLineas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
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
										
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasdescuentoslineas,new Object(),generalEntityParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturasDescuentosLineasConstantesFunciones.getClassesRelationshipsOfFacturasDescuentosLineas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturasDescuentosLineasConstantesFunciones.getClassesRelationshipsFromStringsOfFacturasDescuentosLineas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturasDescuentosLineas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasdescuentoslineas,new Object(),generalEntityParameterGeneral,this.facturasdescuentoslineasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturasDescuentosLineas(FacturasDescuentosLineasBean facturasdescuentoslineasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturasDescuentosLineas(ArrayList<Classe> classes,FacturasDescuentosLineasReturnGeneral facturasdescuentoslineasReturnGeneral,FacturasDescuentosLineasBean facturasdescuentoslineasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturasdescuentoslineas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas = new FacturasDescuentosLineasDetalleFormJInternalFrame(jDesktopPane,this.facturasdescuentoslineasSessionBean.getConGuardarRelaciones(),this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.setVisible(false);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.facturasdescuentoslineasLogic=this.facturasdescuentoslineasLogic;
		
		this.cargarCombosFrameForeignKeyFacturasDescuentosLineas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasDescuentosLineas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasDescuentosLineas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturasDescuentosLineas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturasDescuentosLineas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasDescuentosLineas"));
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ModificarFacturasDescuentosLineas"));

		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasDescuentosLineas"));
					
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemModificarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasDescuentosLineas"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"ActualizarFacturasDescuentosLineas"));
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasDescuentosLineas"));
						
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemActualizarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasDescuentosLineas"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"EliminarFacturasDescuentosLineas"));
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasDescuentosLineas"));
								
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemEliminarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasDescuentosLineas"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CancelarFacturasDescuentosLineas"));
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasDescuentosLineas"));
					
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemCancelarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasDescuentosLineas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemDetalleCerrarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasDescuentosLineas"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasDescuentosLineas"));
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasDescuentosLineas"));
		
		
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasDescuentosLineas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonidFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombreFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombreFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_otroFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonsub_totalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonivaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasDescuentosLineasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasDescuentosLineas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturasDescuentosLineas"));
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasDescuentosLineas"));
		}
		
		this.jTableDatosFacturasDescuentosLineas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturasDescuentosLineas"));
		
		this.jTableDatosFacturasDescuentosLineas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturasDescuentosLineas"));
		
		this.jButtonNuevoFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"NuevoFacturasDescuentosLineas"));
		
		this.jButtonDuplicarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"DuplicarFacturasDescuentosLineas"));
		
		this.jButtonCopiarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"CopiarFacturasDescuentosLineas"));
		
		this.jButtonVerFormFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"VerFormFacturasDescuentosLineas"));
		
		
		this.jButtonNuevoToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturasDescuentosLineas"));
			
		this.jButtonDuplicarToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemNuevoFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturasDescuentosLineas"));
			
		this.jMenuItemDuplicarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturasDescuentosLineas"));		
		
		
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturasDescuentosLineas"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemNuevoRelacionesFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturasDescuentosLineas"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ModificarFacturasDescuentosLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonModificarToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasDescuentosLineas"));
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemModificarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasDescuentosLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"ActualizarFacturasDescuentosLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonActualizarToolBarFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasDescuentosLineas"));
				
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemActualizarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasDescuentosLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"EliminarFacturasDescuentosLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonEliminarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasDescuentosLineas"));
						
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemEliminarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasDescuentosLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CancelarFacturasDescuentosLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonCancelarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasDescuentosLineas"));
			
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemCancelarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasDescuentosLineas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturasDescuentosLineas"));		
		
		
		this.jButtonCerrarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CerrarFacturasDescuentosLineas"));
		
		
		this.jButtonCerrarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemCerrarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturasDescuentosLineas"));
			
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jMenuItemDetalleCerrarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasDescuentosLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturasDescuentosLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasDescuentosLineas"));
		}
		
		this.jButtonCopiarToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturasDescuentosLineas"));
			
		this.jButtonVerFormToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturasDescuentosLineas"));
		
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturasDescuentosLineas"));
			
		this.jMenuItemCopiarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturasDescuentosLineas"));		
		
		this.jMenuItemVerFormFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturasDescuentosLineas"));		
		
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasDescuentosLineas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasDescuentosLineas"));		
		
		
		
		this.jButtonRecargarInformacionFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturasDescuentosLineas"));
					
		this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturasDescuentosLineas"));
		
		this.jMenuItemRecargarInformacionFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturasDescuentosLineas"));		
		
		
		
		this.jButtonAnterioresFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"AnterioresFacturasDescuentosLineas"));
		
		
		this.jButtonAnterioresToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturasDescuentosLineas"));
		
		this.jMenuItemAnterioresFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturasDescuentosLineas"));		
		
		
		this.jButtonSiguientesFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"SiguientesFacturasDescuentosLineas"));
		
		
		this.jButtonSiguientesToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemSiguientesFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturasDescuentosLineas"));
			
		this.jMenuItemAbrirOrderByFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturasDescuentosLineas"));
			
		this.jMenuItemMostrarOcultarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturasDescuentosLineas"));
			
		this.jMenuItemDetalleAbrirOrderByFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturasDescuentosLineas"));
			
		this.jMenuItemDetalleMostarOcultarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturasDescuentosLineas"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturasDescuentosLineas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturasDescuentosLineas"));
			
		this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturasDescuentosLineas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturasDescuentosLineas"));

		this.jCheckBoxSeleccionadosFacturasDescuentosLineas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturasDescuentosLineas"));
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasDescuentosLineas"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturasDescuentosLineas"));
			
		this.jComboBoxTiposAccionesFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturasDescuentosLineas"));
					
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturasDescuentosLineas"));
			
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturasDescuentosLineas"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonidFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombreFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombreFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_otroFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonsub_totalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonivaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasDescuentosLineasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"BusquedaFacturasDescuentosLineasFacturasDescuentosLineas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturasDescuentosLineas!=null) {
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasDescuentosLineas"));
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasDescuentosLineas"));
				this.jInternalFrameReporteDinamicoFacturasDescuentosLineas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasDescuentosLineas"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasDescuentosLineas"));				
			//this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasDescuentosLineas"));
			//this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasDescuentosLineas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturasDescuentosLineas!=null) {
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasDescuentosLineas"));
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasDescuentosLineas"));
				this.jInternalFrameImportacionFacturasDescuentosLineas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasDescuentosLineas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturasDescuentosLineas"));
			
			this.jButtonAbrirOrderByToolBarFacturasDescuentosLineas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturasDescuentosLineas"));			
			
			if(this.jInternalFrameOrderByFacturasDescuentosLineas!=null) {
				this.jInternalFrameOrderByFacturasDescuentosLineas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasDescuentosLineas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTabbedPaneRelacionesFacturasDescuentosLineas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasDescuentosLineas"));
		
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
            		closingInternalFrameFacturasDescuentosLineas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturasDescuentosLineas = (JInternalFrameBase)event.getSource();
	            	
	            FacturasDescuentosLineasBeanSwingJInternalFrame jInternalFrameParent=(FacturasDescuentosLineasBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasDescuentosLineas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturasDescuentosLineasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturasDescuentosLineas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturasDescuentosLineasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturasDescuentosLineas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturasDescuentosLineas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturasDescuentosLineas";
		inputMap = this.jButtonNuevoRelacionesFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasDescuentosLineasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturasDescuentosLineas";
		inputMap = this.jButtonModificarFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturasDescuentosLineas";
		inputMap = this.jButtonActualizarFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturasDescuentosLineas";
		inputMap = this.jButtonEliminarFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturasDescuentosLineas";
		inputMap = this.jButtonCancelarFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturasDescuentosLineas";
		inputMap = this.jButtonCerrarFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturasDescuentosLineas";
		inputMap = this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonGuardarCambiosFacturasDescuentosLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturasDescuentosLineas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturasDescuentosLineasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturasDescuentosLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturasDescuentosLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturasDescuentosLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturasDescuentosLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonidFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_empresaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_sucursalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasDescuentosLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonid_vendedorFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_desdeFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emision_hastaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombreFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombreFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_completo_clienteFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnombre_tipo_facturaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_emisionFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonfecha_vencimientoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonnumero_pre_impresoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_descuentoFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotal_otroFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonsub_totalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtontotalFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasDescuentosLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jButtonivaFacturasDescuentosLineasBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasDescuentosLineasBusqueda"));
		
		
		this.jButtonBusquedaFacturasDescuentosLineasFacturasDescuentosLineas.addActionListener(new ButtonActionListener(this,"BusquedaFacturasDescuentosLineasFacturasDescuentosLineas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturasDescuentosLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturasDescuentosLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturasDescuentosLineasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturasDescuentosLineas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturasDescuentosLineas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
					facturasdescuentoslineasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineass) {
					facturasdescuentoslineasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturasDescuentosLineasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
						facturasdescuentoslineasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineass) {
						facturasdescuentoslineasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasDescuentosLineas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasDescuentosLineas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturasDescuentosLineasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturasDescuentosLineas.getSelectedRows();
			
			FacturasDescuentosLineas facturasdescuentoslineasLocal=new FacturasDescuentosLineas();
			
			//this.seleccionarTodosFacturasDescuentosLineas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturasdescuentoslineasLocal =(FacturasDescuentosLineas) this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass().toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturasdescuentoslineasLocal =(FacturasDescuentosLineas) this.facturasdescuentoslineass.toArray()[this.jTableDatosFacturasDescuentosLineas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturasdescuentoslineasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
						facturasdescuentoslineasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineass) {
						facturasdescuentoslineasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasDescuentosLineas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasDescuentosLineas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasDescuentosLineas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturasDescuentosLineasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturasDescuentosLineasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturasDescuentosLineasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturasDescuentosLineas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
				
						if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasdescuentoslineasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							facturasdescuentoslineasAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							facturasdescuentoslineasAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturasdescuentoslineasAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasdescuentoslineasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturasdescuentoslineasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineass) {
					
						if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							facturasdescuentoslineasAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturasdescuentoslineasAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasdescuentoslineasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							facturasdescuentoslineasAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							facturasdescuentoslineasAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturasdescuentoslineasAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasdescuentoslineasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturasdescuentoslineasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturasDescuentosLineasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturasDescuentosLineas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturasDescuentosLineas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturasDescuentosLineas) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturasDescuentosLineas(conSplash);
				
					this.generarReporteFacturasDescuentosLineassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturasDescuentosLineassSeleccionados();
				//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasDescuentosLineassSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasDescuentosLineassSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasDescuentosLineas();
				
				this.exportarFacturasDescuentosLineassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturasDescuentosLineass();
				//this.importarFacturasDescuentosLineass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasDescuentosLineas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturasDescuentosLineassSeleccionados();
				//this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturas Descuentos Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturasDescuentosLineas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturasDescuentosLineas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturasDescuentosLineas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturasDescuentosLineasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturasDescuentosLineas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturasDescuentosLineas(conSplash);
					
						//this.actualizarParametrosGeneralFacturasDescuentosLineas();
						
						this.generarReporteProcesoAccionFacturasDescuentosLineassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Facturas Descuentos LineasES SELECCIONADOS?", "MANTENIMIENTO DE Facturas Descuentos Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturasDescuentosLineas();
				
						this.actualizarParametrosGeneralFacturasDescuentosLineas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturasdescuentoslineasReturnGeneral=facturasdescuentoslineasLogic.procesarAccionFacturasDescuentosLineassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass(),this.facturasdescuentoslineasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturasDescuentosLineasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturasDescuentosLineas();
					
					FacturasDescuentosLineasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturasDescuentosLineasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasDescuentosLineas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxTiposAccionesFormularioFacturasDescuentosLineas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturasDescuentosLineas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturasDescuentosLineasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturasDescuentosLineas();
			
			if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
			FacturasDescuentosLineas facturasdescuentoslineas=new FacturasDescuentosLineas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturasDescuentosLineas.getSelectedItem();
			
			
			
			
			facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturasdescuentoslineassSeleccionados.size()==1) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
					facturasdescuentoslineas=facturasdescuentoslineasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturasDescuentosLineas();
			
      		//this.finishProcessFacturasDescuentosLineas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturasDescuentosLineasReturnGeneral() throws Exception {
		if(this.facturasdescuentoslineasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturasdescuentoslineasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturasdescuentoslineasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturasdescuentoslineasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturasdescuentoslineasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturasdescuentoslineasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
		}
		
		if(this.facturasdescuentoslineasReturnGeneral.getConRetornoLista() || this.facturasdescuentoslineasReturnGeneral.getConRetornoObjeto()) {
			if(this.facturasdescuentoslineasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturasdescuentoslineasLogic.setFacturasDescuentosLineass(this.facturasdescuentoslineasReturnGeneral.getFacturasDescuentosLineass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturasDescuentosLineas(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturasDescuentosLineas() throws Exception {
		
		
	}
	
	public ArrayList<FacturasDescuentosLineas> getFacturasDescuentosLineassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturasDescuentosLineas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineasLogic.getFacturasDescuentosLineass()) {
					if(facturasdescuentoslineasAux.getIsSelected()) {
						facturasdescuentoslineassSeleccionados.add(facturasdescuentoslineasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasDescuentosLineas facturasdescuentoslineasAux:this.facturasdescuentoslineass) {
					if(facturasdescuentoslineasAux.getIsSelected()) {
						facturasdescuentoslineassSeleccionados.add(facturasdescuentoslineasAux);				
					}
				}
			}
			
			if(facturasdescuentoslineassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturasdescuentoslineassSeleccionados.addAll(this.facturasdescuentoslineasLogic.getFacturasDescuentosLineass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturasdescuentoslineassSeleccionados.addAll(this.facturasdescuentoslineass);				
					}
				}
			}
		} else {
			facturasdescuentoslineassSeleccionados.add(this.facturasdescuentoslineas);
		}
		
		return facturasdescuentoslineassSeleccionados;
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
	
	public void generarReporteFacturasDescuentosLineassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturasDescuentosLineassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturasDescuentosLineassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasDescuentosLineassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasDescuentosLineassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturas Descuentos Lineas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturasDescuentosLineassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturasDescuentosLineas();
		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturasDescuentosLineas();
		
		
		//this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados ,facturasdescuentoslineasImplementable,facturasdescuentoslineasImplementableHome);
	}
	
	public void mostrarImportacionFacturasDescuentosLineass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturasDescuentosLineas();
		
		this.abrirFrameImportacionFacturasDescuentosLineas();		
		
			
		//this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados ,facturasdescuentoslineasImplementable,facturasdescuentoslineasImplementableHome);
	}
	
	public void importarFacturasDescuentosLineass() throws Exception {		
	
	}
	
	public void exportarFacturasDescuentosLineassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturasDescuentosLineassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturasDescuentosLineassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturasDescuentosLineassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturas Descuentos Lineas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturasDescuentosLineas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturasDescuentosLineas(facturasdescuentoslineasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturasdescuentoslineasAux.setsDetalleGeneralEntityReporte(facturasdescuentoslineasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturasDescuentosLineas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasDescuentosLineasConstantesFunciones.LABEL_IVA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturasdescuentoslineas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getnombre_tipo_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.gettotal_descuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.gettotal_otro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasdescuentoslineas.getiva().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturasDescuentosLineass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturasDescuentosLineas(row);				
				iRow++;
			}				
			
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturasDescuentosLineas(facturasdescuentoslineasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturasDescuentosLineassSeleccionados() throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();		
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasdescuentoslineas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturasdescuentoslineass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturasdescuentoslineas");
			//elementRoot.appendChild(element);
		
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
				element = document.createElement("facturasdescuentoslineas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturasDescuentosLineas(facturasdescuentoslineasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Descuentos Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturasDescuentosLineas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTALOTRO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasDescuentosLineasConstantesFunciones.LABEL_IVA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getnombre_tipo_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.gettotal_descuento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.gettotal_otro());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasdescuentoslineas.getiva());				
	}
	
	public void setFilaDatosExportarXmlFacturasDescuentosLineas(FacturasDescuentosLineas facturasdescuentoslineas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturasDescuentosLineasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturasdescuentoslineas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturasDescuentosLineasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturasdescuentoslineas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturasDescuentosLineasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturasdescuentoslineas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FacturasDescuentosLineasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(facturasdescuentoslineas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementvendedor_descripcion = document.createElement(FacturasDescuentosLineasConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(facturasdescuentoslineas.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementfecha_emision_desde = document.createElement(FacturasDescuentosLineasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(facturasdescuentoslineas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(FacturasDescuentosLineasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(facturasdescuentoslineas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre = document.createElement(FacturasDescuentosLineasConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(facturasdescuentoslineas.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_completo_cliente = document.createElement(FacturasDescuentosLineasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(facturasdescuentoslineas.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_tipo_factura = document.createElement(FacturasDescuentosLineasConstantesFunciones.NOMBRETIPOFACTURA);
		elementnombre_tipo_factura.appendChild(document.createTextNode(facturasdescuentoslineas.getnombre_tipo_factura().trim()));
		element.appendChild(elementnombre_tipo_factura);

		Element elementfecha_emision = document.createElement(FacturasDescuentosLineasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(facturasdescuentoslineas.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(FacturasDescuentosLineasConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(facturasdescuentoslineas.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnumero_pre_impreso = document.createElement(FacturasDescuentosLineasConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(facturasdescuentoslineas.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementtotal_descuento = document.createElement(FacturasDescuentosLineasConstantesFunciones.TOTALDESCUENTO);
		elementtotal_descuento.appendChild(document.createTextNode(facturasdescuentoslineas.gettotal_descuento().toString().trim()));
		element.appendChild(elementtotal_descuento);

		Element elementtotal_otro = document.createElement(FacturasDescuentosLineasConstantesFunciones.TOTALOTRO);
		elementtotal_otro.appendChild(document.createTextNode(facturasdescuentoslineas.gettotal_otro().toString().trim()));
		element.appendChild(elementtotal_otro);

		Element elementsub_total = document.createElement(FacturasDescuentosLineasConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(facturasdescuentoslineas.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(FacturasDescuentosLineasConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(facturasdescuentoslineas.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementiva = document.createElement(FacturasDescuentosLineasConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(facturasdescuentoslineas.getiva().toString().trim()));
		element.appendChild(elementiva);
	}
	
	public void generarReporteGroupGenericoFacturasDescuentosLineassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados=new ArrayList<FacturasDescuentosLineas>();
		
		facturasdescuentoslineassSeleccionados=this.getFacturasDescuentosLineassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturasDescuentosLineas(facturasdescuentoslineassSeleccionados);
		
		this.generarReporteFacturasDescuentosLineass("Todos",facturasdescuentoslineassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturasDescuentosLineas(ArrayList<FacturasDescuentosLineas> facturasdescuentoslineassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturasDescuentosLineas facturasdescuentoslineasAux:facturasdescuentoslineassSeleccionados) {
				facturasdescuentoslineasAux.setsDetalleGeneralEntityReporte(facturasdescuentoslineasAux.toString());
			
				if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasdescuentoslineasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasdescuentoslineasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getnombre_tipo_factura());
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasdescuentoslineasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasdescuentoslineasAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(FacturasDescuentosLineasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					facturasdescuentoslineasAux.setsDescripcionGeneralEntityReporte1(facturasdescuentoslineasAux.getnumero_pre_impreso());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasDescuentosLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturasDescuentosLineas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=true;
				this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=true;
			}
			
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaModificarFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturasDescuentosLineasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=true;
		} else {
			this.actualizarEstadoPanelsFacturasDescuentosLineas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturasDescuentosLineas=false;
			//this.isVisibilidadCeldaVerFormFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaDuplicarFacturasDescuentosLineas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			if(!facturasdescuentoslineasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;												
			}
			
			this.jButtonCerrarFacturasDescuentosLineas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
		}
		
		if(!this.permiteMantenimiento(this.facturasdescuentoslineas)) {
			this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
			this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturasDescuentosLineas=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturasDescuentosLineas=false;
		this.isVisibilidadCeldaGuardarCambiosFacturasDescuentosLineas=false;
		//this.isVisibilidadCeldaModificarFacturasDescuentosLineas=true;
		this.isVisibilidadCeldaActualizarFacturasDescuentosLineas=false;
		this.isVisibilidadCeldaEliminarFacturasDescuentosLineas=false;
		//this.isVisibilidadCeldaCancelarFacturasDescuentosLineas=true;			
		this.isVisibilidadCeldaGuardarFacturasDescuentosLineas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasDescuentosLineas() {
	}
	
	public void actualizarEstadoPanelsFacturasDescuentosLineas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosEdicionFacturasDescuentosLineas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasDescuentosLineas!=null) {
				this.jScrollPanelDatosFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasDescuentosLineas!=null) {
				this.jPanelPaginacionFacturasDescuentosLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
					this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturasdescuentoslineasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasDescuentosLineas!=null) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturasDescuentosLineas!=null) {
				this.jPanelParametrosReportesFacturasDescuentosLineas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturasDescuentosLineas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturasDescuentosLineas) {this.jTabbedPaneBusquedasFacturasDescuentosLineas.remove(jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaFacturasDescuentosLineas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaFacturasDescuentosLineas) {this.jTabbedPaneBusquedasFacturasDescuentosLineas.remove(jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaFacturasDescuentosLineas=isParaVendedor;
			if(!this.isVisibilidadBusquedaFacturasDescuentosLineas) {this.jTabbedPaneBusquedasFacturasDescuentosLineas.remove(jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);}
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
			
			this.inicializarActualizarBindingTablaFacturasDescuentosLineas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturasDescuentosLineas() {
		this.updateBorderResaltarBusquedasFormularioFacturasDescuentosLineas();
		this.updateVisibilidadBusquedasFormularioFacturasDescuentosLineas();
		this.updateHabilitarBusquedasFormularioFacturasDescuentosLineas();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturasDescuentosLineas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponents().length>0) {
	

		if(this.facturasdescuentoslineasConstantesFunciones.resaltarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas!=null) {
			index= this.jTabbedPaneBusquedasFacturasDescuentosLineas.indexOfComponent(this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponent(index);
				jPanel.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturasDescuentosLineas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasDescuentosLineas.indexOfComponent(this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			if(!this.facturasdescuentoslineasConstantesFunciones.mostrarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas && index>-1) {
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturasDescuentosLineas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasDescuentosLineas.indexOfComponent(this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
				this.jTabbedPaneBusquedasFacturasDescuentosLineas.setEnabledAt(index,this.facturasdescuentoslineasConstantesFunciones.activarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturasDescuentosLineas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturasDescuentosLineas")) {
			index= this.jTabbedPaneBusquedasFacturasDescuentosLineas.indexOfComponent(this.jPanelBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);

			this.jTabbedPaneBusquedasFacturasDescuentosLineas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasDescuentosLineas.getComponent(index);

			this.facturasdescuentoslineasConstantesFunciones.setResaltarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas(resaltar);

			jPanel.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarBusquedaFacturasDescuentosLineasFacturasDescuentosLineas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturasDescuentosLineas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturasDescuentosLineas() throws Exception {

		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturasDescuentosLineas();
		this.updateVisibilidadResaltarControlesFormularioFacturasDescuentosLineas();
		this.updateHabilitarResaltarControlesFormularioFacturasDescuentosLineas();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturasDescuentosLineas() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturasdescuentoslineasConstantesFunciones.resaltaridFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltaridFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarid_empresaFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarid_empresaFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarid_sucursalFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarid_sucursalFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarid_vendedorFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarid_vendedorFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emision_desdeFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emision_desdeFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emision_hastaFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emision_hastaFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarnombreFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarnombreFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_completo_clienteFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_completo_clienteFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_tipo_facturaFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarnombre_tipo_facturaFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emisionFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_emisionFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_vencimientoFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarfecha_vencimientoFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarnumero_pre_impresoFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarnumero_pre_impresoFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_descuentoFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_descuentoFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_otroFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltartotal_otroFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarsub_totalFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarsub_totalFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltartotalFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltartotalFacturasDescuentosLineas);}
		if(this.facturasdescuentoslineasConstantesFunciones.resaltarivaFacturasDescuentosLineas!=null && this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setBorder(this.facturasdescuentoslineasConstantesFunciones.resaltarivaFacturasDescuentosLineas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturasDescuentosLineas() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
	
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostraridFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelidFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostraridFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_empresaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelid_empresaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_empresaFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_sucursalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelid_sucursalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_sucursalFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_vendedorFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelid_vendedorFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarid_vendedorFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emision_desdeFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelfecha_emision_desdeFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emision_desdeFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emision_hastaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelfecha_emision_hastaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emision_hastaFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombreFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelnombreFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombreFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_completo_clienteFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelnombre_completo_clienteFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_completo_clienteFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_tipo_facturaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelnombre_tipo_facturaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnombre_tipo_facturaFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emisionFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelfecha_emisionFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_emisionFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_vencimientoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelfecha_vencimientoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarfecha_vencimientoFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnumero_pre_impresoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelnumero_pre_impresoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarnumero_pre_impresoFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_descuentoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPaneltotal_descuentoFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_descuentoFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_otroFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPaneltotal_otroFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotal_otroFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarsub_totalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelsub_totalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarsub_totalFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPaneltotalFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrartotalFacturasDescuentosLineas);
		//this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarivaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jPanelivaFacturasDescuentosLineas.setVisible(this.facturasdescuentoslineasConstantesFunciones.mostrarivaFacturasDescuentosLineas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturasDescuentosLineas() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasDescuentosLineas!=null) {
	
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jLabelidFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activaridFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_empresaFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarid_empresaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_sucursalFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarid_sucursalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jComboBoxid_vendedorFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarid_vendedorFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_desdeFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarfecha_emision_desdeFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emision_hastaFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarfecha_emision_hastaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombreFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarnombreFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_completo_clienteFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarnombre_completo_clienteFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextAreanombre_tipo_facturaFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarnombre_tipo_facturaFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_emisionFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarfecha_emisionFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jDateChooserfecha_vencimientoFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarfecha_vencimientoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldnumero_pre_impresoFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarnumero_pre_impresoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_descuentoFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activartotal_descuentoFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotal_otroFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activartotal_otroFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldsub_totalFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarsub_totalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldtotalFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activartotalFacturasDescuentosLineas);
		this.jInternalFrameDetalleFormFacturasDescuentosLineas.jTextFieldivaFacturasDescuentosLineas.setEnabled(this.facturasdescuentoslineasConstantesFunciones.activarivaFacturasDescuentosLineas);
		}
	}
	
		
}