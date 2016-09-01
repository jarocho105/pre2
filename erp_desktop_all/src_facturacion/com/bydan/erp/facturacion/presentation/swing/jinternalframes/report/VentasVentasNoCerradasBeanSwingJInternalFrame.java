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

//import com.bydan.erp.facturacion.util.VentasVentasNoCerradasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasVentasNoCerradasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasVentasNoCerradasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasVentasNoCerradasBean;
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
public class VentasVentasNoCerradasBeanSwingJInternalFrame extends VentasVentasNoCerradasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasVentasNoCerradasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasVentasNoCerradas> ventasventasnocerradasValidator = new ClassValidator<VentasVentasNoCerradas>(VentasVentasNoCerradas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasVentasNoCerradas ventasventasnocerradas;	
	public VentasVentasNoCerradas ventasventasnocerradasAux;
	public VentasVentasNoCerradas ventasventasnocerradasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasVentasNoCerradas ventasventasnocerradasTotales;
	public Long idVentasVentasNoCerradasActual;
	public Long iIdNuevoVentasVentasNoCerradas=0L;
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
	
	public Boolean isPermisoTodoVentasVentasNoCerradas;
	public Boolean isPermisoNuevoVentasVentasNoCerradas;
	public Boolean isPermisoActualizarVentasVentasNoCerradas;
	public Boolean isPermisoActualizarOriginalVentasVentasNoCerradas;
	public Boolean isPermisoEliminarVentasVentasNoCerradas;
	public Boolean isPermisoGuardarCambiosVentasVentasNoCerradas;
	public Boolean isPermisoConsultaVentasVentasNoCerradas;
	public Boolean isPermisoBusquedaVentasVentasNoCerradas;
	public Boolean isPermisoReporteVentasVentasNoCerradas;
	public Boolean isPermisoPaginacionMedioVentasVentasNoCerradas;
	public Boolean isPermisoPaginacionAltoVentasVentasNoCerradas;
	public Boolean isPermisoPaginacionTodoVentasVentasNoCerradas;
	public Boolean isPermisoCopiarVentasVentasNoCerradas;
	public Boolean isPermisoVerFormVentasVentasNoCerradas;
	public Boolean isPermisoDuplicarVentasVentasNoCerradas;
	public Boolean isPermisoOrdenVentasVentasNoCerradas;
	
	
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
	
	public VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasReturnGeneral;
	public VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasVentasNoCerradas=false;
	public Boolean esParaAccionDesdeFormularioVentasVentasNoCerradas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasVentasNoCerradasSessionBeanAdditional ventasventasnocerradasSessionBeanAdditional=null;
	
	public VentasVentasNoCerradasSessionBeanAdditional getVentasVentasNoCerradasSessionBeanAdditional() {
		return this.ventasventasnocerradasSessionBeanAdditional;
	}
	
	public void setVentasVentasNoCerradasSessionBeanAdditional(VentasVentasNoCerradasSessionBeanAdditional ventasventasnocerradasSessionBeanAdditional) {
		try {
			this.ventasventasnocerradasSessionBeanAdditional=ventasventasnocerradasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasVentasNoCerradasBeanSwingJInternalFrameAdditional ventasventasnocerradasBeanSwingJInternalFrameAdditional=null;
	//public class VentasVentasNoCerradasBeanSwingJInternalFrame
	
	public VentasVentasNoCerradasBeanSwingJInternalFrameAdditional getVentasVentasNoCerradasBeanSwingJInternalFrameAdditional() {
		return this.ventasventasnocerradasBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasVentasNoCerradasBeanSwingJInternalFrameAdditional(VentasVentasNoCerradasBeanSwingJInternalFrameAdditional ventasventasnocerradasBeanSwingJInternalFrameAdditional) {
		try {
			this.ventasventasnocerradasBeanSwingJInternalFrameAdditional=ventasventasnocerradasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasVentasNoCerradasLogic ventasventasnocerradasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasVentasNoCerradas ventasventasnocerradasBean;
	public VentasVentasNoCerradasConstantesFunciones ventasventasnocerradasConstantesFunciones;
	//public VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<VentasVentasNoCerradas> ventasventasnocerradass;	
	//public List<VentasVentasNoCerradas> ventasventasnocerradassEliminados;
	//public List<VentasVentasNoCerradas> ventasventasnocerradassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaDuplicarVentasVentasNoCerradas=true;
	public Boolean isVisibilidadCeldaCopiarVentasVentasNoCerradas=true;
	public Boolean isVisibilidadCeldaVerFormVentasVentasNoCerradas=true;
	public Boolean isVisibilidadCeldaOrdenVentasVentasNoCerradas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaCancelarVentasVentasNoCerradas=false;
	public Boolean isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasVentasNoCerradas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVentasVentasNoCerradas() {
		return this.iIdNuevoVentasVentasNoCerradas;
	}

	public void setiIdNuevoVentasVentasNoCerradas(Long iIdNuevoVentasVentasNoCerradas) {
		this.iIdNuevoVentasVentasNoCerradas = iIdNuevoVentasVentasNoCerradas;
	}
	
	public Long getidVentasVentasNoCerradasActual() {
		return this.idVentasVentasNoCerradasActual;
	}

	public void setidVentasVentasNoCerradasActual(Long idVentasVentasNoCerradasActual) {
		this.idVentasVentasNoCerradasActual = idVentasVentasNoCerradasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasVentasNoCerradas getventasventasnocerradas() {
		return this.ventasventasnocerradas;
	}

	public void setventasventasnocerradas(VentasVentasNoCerradas ventasventasnocerradas) {
		this.ventasventasnocerradas = ventasventasnocerradas;
	}
	
	public VentasVentasNoCerradas getventasventasnocerradasAux() {
		return this.ventasventasnocerradasAux;
	}

	public void setventasventasnocerradasAux(VentasVentasNoCerradas ventasventasnocerradasAux) {
		this.ventasventasnocerradasAux = ventasventasnocerradasAux;
	}				
	
	public VentasVentasNoCerradas getventasventasnocerradasAnterior() {
		return this.ventasventasnocerradasAnterior;
	}

	public void setventasventasnocerradasAnterior(VentasVentasNoCerradas ventasventasnocerradasAnterior) {
		this.ventasventasnocerradasAnterior = ventasventasnocerradasAnterior;
	}	
	
	public VentasVentasNoCerradas getventasventasnocerradasTotales() {
		return this.ventasventasnocerradasTotales;
	}

	public void setventasventasnocerradasTotales(VentasVentasNoCerradas ventasventasnocerradasTotales) {
		this.ventasventasnocerradasTotales = ventasventasnocerradasTotales;
	}	
	
	public VentasVentasNoCerradas getventasventasnocerradasBean() {
		return this.ventasventasnocerradasBean;
	}

	public void setventasventasnocerradasBean(VentasVentasNoCerradas ventasventasnocerradasBean) {
		this.ventasventasnocerradasBean = ventasventasnocerradasBean;
	}	
	
	public VentasVentasNoCerradasParameterReturnGeneral getventasventasnocerradasReturnGeneral() {
		return this.ventasventasnocerradasReturnGeneral;
	}

	public void setventasventasnocerradasReturnGeneral(VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasReturnGeneral) {
		this.ventasventasnocerradasReturnGeneral = ventasventasnocerradasReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaVentasVentasNoCerradas=new Date();

	public Date getfecha_emision_desdeBusquedaVentasVentasNoCerradas() {
		return this.fecha_emision_desdeBusquedaVentasVentasNoCerradas;
	}

	public void setfecha_emision_desdeBusquedaVentasVentasNoCerradas(Date fecha_emision_desdeBusquedaVentasVentasNoCerradas) {
		this.fecha_emision_desdeBusquedaVentasVentasNoCerradas = fecha_emision_desdeBusquedaVentasVentasNoCerradas;
	}

;
	public Date fecha_emision_hastaBusquedaVentasVentasNoCerradas=new Date();

	public Date getfecha_emision_hastaBusquedaVentasVentasNoCerradas() {
		return this.fecha_emision_hastaBusquedaVentasVentasNoCerradas;
	}

	public void setfecha_emision_hastaBusquedaVentasVentasNoCerradas(Date fecha_emision_hastaBusquedaVentasVentasNoCerradas) {
		this.fecha_emision_hastaBusquedaVentasVentasNoCerradas = fecha_emision_hastaBusquedaVentasVentasNoCerradas;
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
	
	
	public VentasVentasNoCerradasLogic getVentasVentasNoCerradasLogic()	{		
		return ventasventasnocerradasLogic;
	}

	public void setVentasVentasNoCerradasLogic(VentasVentasNoCerradasLogic ventasventasnocerradasLogic) {
		this.ventasventasnocerradasLogic = ventasventasnocerradasLogic;
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
	
	public Boolean getIsEsNuevoVentasVentasNoCerradas() {
		return isEsNuevoVentasVentasNoCerradas;
	}

	public void setIsEsNuevoVentasVentasNoCerradas(Boolean isEsNuevoVentasVentasNoCerradas) {
		this.isEsNuevoVentasVentasNoCerradas = isEsNuevoVentasVentasNoCerradas;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasVentasNoCerradas() {
		return esParaAccionDesdeFormularioVentasVentasNoCerradas;
	}
	
	public void setEsParaAccionDesdeFormularioVentasVentasNoCerradas(Boolean esParaAccionDesdeFormularioVentasVentasNoCerradas) {
		this.esParaAccionDesdeFormularioVentasVentasNoCerradas = esParaAccionDesdeFormularioVentasVentasNoCerradas;
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

			if(this.ventasventasnocerradasSessionBean==null) {
				this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
			}

			if(!this.ventasventasnocerradasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventasventasnocerradasSessionBean.getlidEmpresaActual());
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

			if(this.ventasventasnocerradasSessionBean==null) {
				this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
			}

			if(!this.ventasventasnocerradasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventasventasnocerradasSessionBean.getlidSucursalActual());
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

					if(this.ventasventasnocerradas!=null) {
						this.ventasventasnocerradas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
						this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasVentasNoCerradas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasVentasNoCerradasGenerico)throws Exception
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
				jComboBoxid_empresaVentasVentasNoCerradasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasVentasNoCerradasGenerico!=null && jComboBoxid_empresaVentasVentasNoCerradasGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasVentasNoCerradasGenerico.setSelectedIndex(0);
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

					if(this.ventasventasnocerradas!=null) {
						this.ventasventasnocerradas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
						this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentasVentasNoCerradasGenerico)throws Exception
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
				jComboBoxid_sucursalVentasVentasNoCerradasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentasVentasNoCerradasGenerico!=null && jComboBoxid_sucursalVentasVentasNoCerradasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentasVentasNoCerradasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasVentasNoCerradas ventasventasnocerradas,JComboBox jComboBoxid_empresaVentasVentasNoCerradasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasVentasNoCerradasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasVentasNoCerradasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventasventasnocerradas.setid_empresa(empresaAux.getId());
				ventasventasnocerradas.setempresa_descripcion(VentasVentasNoCerradasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventasventasnocerradas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentasVentasNoCerradas ventasventasnocerradas,JComboBox jComboBoxid_sucursalVentasVentasNoCerradasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentasVentasNoCerradasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentasVentasNoCerradasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventasventasnocerradas.setid_sucursal(sucursalAux.getId());
				ventasventasnocerradas.setsucursal_descripcion(VentasVentasNoCerradasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventasventasnocerradas.setSucursal(sucursalAux);			}
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

					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { 
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { 
					}

					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { 
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { 
					}

					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentasVentasNoCerradas() throws Exception {
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
		
	public VentasVentasNoCerradasParameterReturnGeneral getVentasVentasNoCerradasParameterGeneral() {
		return this.ventasventasnocerradasParameterGeneral;
	}
	
	public void setVentasVentasNoCerradasParameterGeneral(VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasParameterGeneral) {
		this.ventasventasnocerradasParameterGeneral = ventasventasnocerradasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasVentasNoCerradas() {
		return isPermisoTodoVentasVentasNoCerradas;
	}

	public void setIsPermisoTodoVentasVentasNoCerradas(Boolean isPermisoTodoVentasVentasNoCerradas) {
		this.isPermisoTodoVentasVentasNoCerradas = isPermisoTodoVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoNuevoVentasVentasNoCerradas() {
		return isPermisoNuevoVentasVentasNoCerradas;
	}

	public void setIsPermisoNuevoVentasVentasNoCerradas(Boolean isPermisoNuevoVentasVentasNoCerradas) {
		this.isPermisoNuevoVentasVentasNoCerradas = isPermisoNuevoVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoActualizarVentasVentasNoCerradas() {
		return isPermisoActualizarVentasVentasNoCerradas;
	}

	public void setIsPermisoActualizarVentasVentasNoCerradas(Boolean isPermisoActualizarVentasVentasNoCerradas) {
		this.isPermisoActualizarVentasVentasNoCerradas = isPermisoActualizarVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoEliminarVentasVentasNoCerradas() {
		return isPermisoEliminarVentasVentasNoCerradas;
	}

	public void setIsPermisoEliminarVentasVentasNoCerradas(Boolean isPermisoEliminarVentasVentasNoCerradas) {
		this.isPermisoEliminarVentasVentasNoCerradas = isPermisoEliminarVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoGuardarCambiosVentasVentasNoCerradas() {
		return isPermisoGuardarCambiosVentasVentasNoCerradas;
	}

	public void setIsPermisoGuardarCambiosVentasVentasNoCerradas(Boolean isPermisoGuardarCambiosVentasVentasNoCerradas) {
		this.isPermisoGuardarCambiosVentasVentasNoCerradas = isPermisoGuardarCambiosVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoConsultaVentasVentasNoCerradas() {
		return isPermisoConsultaVentasVentasNoCerradas;
	}

	public void setIsPermisoConsultaVentasVentasNoCerradas(Boolean isPermisoConsultaVentasVentasNoCerradas) {
		this.isPermisoConsultaVentasVentasNoCerradas = isPermisoConsultaVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoBusquedaVentasVentasNoCerradas() {
		return isPermisoBusquedaVentasVentasNoCerradas;
	}

	public void setIsPermisoBusquedaVentasVentasNoCerradas(Boolean isPermisoBusquedaVentasVentasNoCerradas) {
		this.isPermisoBusquedaVentasVentasNoCerradas = isPermisoBusquedaVentasVentasNoCerradas;
	}

	public Boolean getIsPermisoReporteVentasVentasNoCerradas() {
		return isPermisoReporteVentasVentasNoCerradas;
	}

	public void setIsPermisoReporteVentasVentasNoCerradas(Boolean isPermisoReporteVentasVentasNoCerradas) {
		this.isPermisoReporteVentasVentasNoCerradas = isPermisoReporteVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasVentasNoCerradas() {
		return isPermisoPaginacionMedioVentasVentasNoCerradas;
	}

	public void setIsPermisoPaginacionMedioVentasVentasNoCerradas(Boolean isPermisoPaginacionMedioVentasVentasNoCerradas) {
		this.isPermisoPaginacionMedioVentasVentasNoCerradas = isPermisoPaginacionMedioVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasVentasNoCerradas() {
		return isPermisoPaginacionTodoVentasVentasNoCerradas;
	}

	public void setIsPermisoPaginacionTodoVentasVentasNoCerradas(Boolean isPermisoPaginacionTodoVentasVentasNoCerradas) {
		this.isPermisoPaginacionTodoVentasVentasNoCerradas = isPermisoPaginacionTodoVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasVentasNoCerradas() {
		return isPermisoPaginacionAltoVentasVentasNoCerradas;
	}

	public void setIsPermisoPaginacionAltoVentasVentasNoCerradas(Boolean isPermisoPaginacionAltoVentasVentasNoCerradas) {
		this.isPermisoPaginacionAltoVentasVentasNoCerradas = isPermisoPaginacionAltoVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoCopiarVentasVentasNoCerradas() {
		return isPermisoCopiarVentasVentasNoCerradas;
	}

	public void setIsPermisoCopiarVentasVentasNoCerradas(Boolean isPermisoCopiarVentasVentasNoCerradas) {
		this.isPermisoCopiarVentasVentasNoCerradas = isPermisoCopiarVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoVerFormVentasVentasNoCerradas() {
		return isPermisoVerFormVentasVentasNoCerradas;
	}

	public void setIsPermisoVerFormVentasVentasNoCerradas(Boolean isPermisoVerFormVentasVentasNoCerradas) {
		this.isPermisoVerFormVentasVentasNoCerradas = isPermisoVerFormVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoDuplicarVentasVentasNoCerradas() {
		return isPermisoDuplicarVentasVentasNoCerradas;
	}

	public void setIsPermisoDuplicarVentasVentasNoCerradas(Boolean isPermisoDuplicarVentasVentasNoCerradas) {
		this.isPermisoDuplicarVentasVentasNoCerradas = isPermisoDuplicarVentasVentasNoCerradas;
	}
	
	public Boolean getIsPermisoOrdenVentasVentasNoCerradas() {
		return isPermisoOrdenVentasVentasNoCerradas;
	}

	public void setIsPermisoOrdenVentasVentasNoCerradas(Boolean isPermisoOrdenVentasVentasNoCerradas) {
		this.isPermisoOrdenVentasVentasNoCerradas = isPermisoOrdenVentasVentasNoCerradas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasVentasNoCerradas() {
		return isVisibilidadCeldaNuevoVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaNuevoVentasVentasNoCerradas(Boolean isVisibilidadCeldaNuevoVentasVentasNoCerradas) {
		this.isVisibilidadCeldaNuevoVentasVentasNoCerradas = isVisibilidadCeldaNuevoVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasVentasNoCerradas() {
		return isVisibilidadCeldaDuplicarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaDuplicarVentasVentasNoCerradas(Boolean isVisibilidadCeldaDuplicarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas = isVisibilidadCeldaDuplicarVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasVentasNoCerradas() {
		return isVisibilidadCeldaCopiarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaCopiarVentasVentasNoCerradas(Boolean isVisibilidadCeldaCopiarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaCopiarVentasVentasNoCerradas = isVisibilidadCeldaCopiarVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasVentasNoCerradas() {
		return isVisibilidadCeldaVerFormVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaVerFormVentasVentasNoCerradas(Boolean isVisibilidadCeldaVerFormVentasVentasNoCerradas) {
		this.isVisibilidadCeldaVerFormVentasVentasNoCerradas = isVisibilidadCeldaVerFormVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasVentasNoCerradas() {
		return isVisibilidadCeldaOrdenVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaOrdenVentasVentasNoCerradas(Boolean isVisibilidadCeldaOrdenVentasVentasNoCerradas) {
		this.isVisibilidadCeldaOrdenVentasVentasNoCerradas = isVisibilidadCeldaOrdenVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas() {
		return isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas(Boolean isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas) {
		this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas = isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasVentasNoCerradas() {
		return isVisibilidadCeldaModificarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaModificarVentasVentasNoCerradas(Boolean isVisibilidadCeldaModificarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaModificarVentasVentasNoCerradas = isVisibilidadCeldaModificarVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasVentasNoCerradas() {
		return isVisibilidadCeldaActualizarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaActualizarVentasVentasNoCerradas(Boolean isVisibilidadCeldaActualizarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaActualizarVentasVentasNoCerradas = isVisibilidadCeldaActualizarVentasVentasNoCerradas;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasVentasNoCerradas() {
		return isVisibilidadCeldaEliminarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaEliminarVentasVentasNoCerradas(Boolean isVisibilidadCeldaEliminarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaEliminarVentasVentasNoCerradas = isVisibilidadCeldaEliminarVentasVentasNoCerradas;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasVentasNoCerradas() {
		return isVisibilidadCeldaCancelarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaCancelarVentasVentasNoCerradas(Boolean isVisibilidadCeldaCancelarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaCancelarVentasVentasNoCerradas = isVisibilidadCeldaCancelarVentasVentasNoCerradas;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasVentasNoCerradas() {
		return isVisibilidadCeldaGuardarVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaGuardarVentasVentasNoCerradas(Boolean isVisibilidadCeldaGuardarVentasVentasNoCerradas) {
		this.isVisibilidadCeldaGuardarVentasVentasNoCerradas = isVisibilidadCeldaGuardarVentasVentasNoCerradas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas() {
		return isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas(Boolean isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas) {
		this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas = isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas;
	}
		
	public VentasVentasNoCerradasSessionBean getventasventasnocerradasSessionBean() {
		return this.ventasventasnocerradasSessionBean;
	}
	
	public void setventasventasnocerradasSessionBean(VentasVentasNoCerradasSessionBean ventasventasnocerradasSessionBean) {
		this.ventasventasnocerradasSessionBean=ventasventasnocerradasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasVentasNoCerradas() {
		return this.isVisibilidadBusquedaVentasVentasNoCerradas;
	}

	public void setisVisibilidadBusquedaVentasVentasNoCerradas(Boolean isVisibilidadBusquedaVentasVentasNoCerradas) {
		this.isVisibilidadBusquedaVentasVentasNoCerradas=isVisibilidadBusquedaVentasVentasNoCerradas;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventasventasnocerradas,null);
				this.setActualParaGuardarSucursalForeignKey(ventasventasnocerradas,null);
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
	
	public void bugActualizarReferenciaActual(VentasVentasNoCerradas ventasventasnocerradas,VentasVentasNoCerradas ventasventasnocerradasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasVentasNoCerradas(ventasventasnocerradas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventasventasnocerradasAux.setId(ventasventasnocerradas.getId());
		ventasventasnocerradasAux.setVersionRow(ventasventasnocerradas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasVentasNoCerradas ventasventasnocerradasLocal) throws Exception {
		
		if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasVentasNoCerradas ventasventasnocerradasLocal) throws Exception {	
		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventasventasnocerradasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventasventasnocerradasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasVentasNoCerradasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventasventasnocerradasValidator.getInvalidValues(this.ventasventasnocerradas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasVentasNoCerradas ventasventasnocerradas,List<VentasVentasNoCerradas> ventasventasnocerradass) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasVentasNoCerradas ventasventasnocerradas,List<VentasVentasNoCerradas> ventasventasnocerradass) throws Exception {
		try	{			
			VentasVentasNoCerradasConstantesFunciones.actualizarSelectedLista(ventasventasnocerradas,ventasventasnocerradass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasVentasNoCerradas> ventasventasnocerradassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventasventasnocerradassLocal=this.ventasventasnocerradasLogic.getVentasVentasNoCerradass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventasventasnocerradassLocal=this.ventasventasnocerradass;
			}
			//ARCHITECTURE
		
			for(VentasVentasNoCerradas ventasventasnocerradasLocal:ventasventasnocerradassLocal) {
				if(this.permiteMantenimiento(ventasventasnocerradasLocal) && ventasventasnocerradasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasVentasNoCerradasConstantesFunciones.getVentasVentasNoCerradasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelcodigoVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnombre_completoVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelfecha_emisionVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_pre_impresoVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_documentoVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabeltotalVentasVentasNoCerradas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasVentasNoCerradasConstantesFunciones.EFECTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelefectivoVentasVentasNoCerradas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelcodigoVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnombre_completoVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelfecha_emisionVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_pre_impresoVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_documentoVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabeltotalVentasVentasNoCerradas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelefectivoVentasVentasNoCerradas,"");
		
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
		this.iIdNuevoVentasVentasNoCerradas--;	
		
		
		this.ventasventasnocerradasAux=new VentasVentasNoCerradas();
		
		this.ventasventasnocerradasAux.setId(this.iIdNuevoVentasVentasNoCerradas);
		this.ventasventasnocerradasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().add(this.ventasventasnocerradasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventasventasnocerradass.add(this.ventasventasnocerradasAux);
		}
		//ARCHITECTURE
		
		this.ventasventasnocerradas=this.ventasventasnocerradasAux;
		
		if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradas);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasVentasNoCerradas(this.ventasventasnocerradas);
		}
				
		//this.setDefaultControlesVentasVentasNoCerradas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasVentasNoCerradas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasVentasNoCerradas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasVentasNoCerradas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradasBean,this.ventasventasnocerradas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral,this.ventasventasnocerradasBean,false);
		
		if(this.ventasventasnocerradasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas());
		}
		
		if(this.ventasventasnocerradasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas(),classes);//this.ventasventasnocerradasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasVentasNoCerradas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasVentasNoCerradas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.RecargarFormVentasVentasNoCerradas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
						
			if(ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasVentasNoCerradas();
			}
			
			this.actualizarVisualTableDatosVentasVentasNoCerradas();
			
			this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(this.getIndiceNuevoVentasVentasNoCerradas(), this.getIndiceNuevoVentasVentasNoCerradas());
			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
						
			this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasVentasNoCerradas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarfecha_emision_desdeVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarfecha_emision_hastaVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarcodigoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarnombre_completoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarfecha_emisionVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarnumero_pre_impresoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarnumero_documentoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activartotalVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarefectivoVentasVentasNoCerradas);	
		//
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarid_empresaVentasVentasNoCerradas);//
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setEnabled(isHabilitar && this.ventasventasnocerradasConstantesFunciones.activarid_sucursalVentasVentasNoCerradas);
	};
	
	public void setDefaultControlesVentasVentasNoCerradas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasVentasNoCerradas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(true);			
			this.ventasventasnocerradasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.setVisible(true);
			
					
		} else {
			//this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(false);			
			this.ventasventasnocerradasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasVentasNoCerradas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				if(ventasventasnocerradasAux.getId().equals(this.iIdNuevoVentasVentasNoCerradas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradass) {
				if(ventasventasnocerradasAux.getId().equals(this.iIdNuevoVentasVentasNoCerradas)) {
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
	
	public int getIndiceActualVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				if(ventasventasnocerradasAux.getId().equals(ventasventasnocerradas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradass) {
				if(ventasventasnocerradasAux.getId().equals(ventasventasnocerradas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				if(ventasventasnocerradasAux.getVentasVentasNoCerradasOriginal().getId().equals(ventasventasnocerradasOriginal.getId())) {
					existe=true;
					ventasventasnocerradasOriginal.setId(ventasventasnocerradasAux.getId());
					ventasventasnocerradasOriginal.setVersionRow(ventasventasnocerradasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradass) {
				if(ventasventasnocerradasAux.getVentasVentasNoCerradasOriginal().getId().equals(ventasventasnocerradasOriginal.getId())) {
					existe=true;
					ventasventasnocerradasOriginal.setId(ventasventasnocerradasAux.getId());
					ventasventasnocerradasOriginal.setVersionRow(ventasventasnocerradasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasVentasNoCerradas(Boolean esParaCancelar) throws Exception {
		ventasventasnocerradassAux=new ArrayList<VentasVentasNoCerradas>();
		ventasventasnocerradasAux=new VentasVentasNoCerradas();
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
					if(ventasventasnocerradasAux.getId()<0) {
						ventasventasnocerradassAux.add(ventasventasnocerradasAux);
					}		
				}
				this.iIdNuevoVentasVentasNoCerradas=0L;
				this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().removeAll(ventasventasnocerradassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradass) {
					if(ventasventasnocerradasAux.getId()<0) {
						ventasventasnocerradassAux.add(ventasventasnocerradasAux);
					}		
				}
				this.iIdNuevoVentasVentasNoCerradas=0L;
				this.ventasventasnocerradass.removeAll(ventasventasnocerradassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasVentasNoCerradas 
					&& this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().size()>0
					) {
					ventasventasnocerradasAux=this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().get(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().size() - 1);
				
					if(ventasventasnocerradasAux.getId()<0) {
						this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().remove(ventasventasnocerradasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasVentasNoCerradas && this.ventasventasnocerradass.size()>0) {
					ventasventasnocerradasAux=this.ventasventasnocerradass.get(this.ventasventasnocerradass.size() - 1);
				
					if(ventasventasnocerradasAux.getId()<0) {
						this.ventasventasnocerradass.remove(ventasventasnocerradasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasVentasNoCerradas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventasventasnocerradas.getId()<0) {
				this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().remove(this.ventasventasnocerradas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventasventasnocerradas.getId()<0) {
				this.ventasventasnocerradass.remove(this.ventasventasnocerradas);
			}
		}			
	}
	
	public void setEstadosInicialesVentasVentasNoCerradas(List<VentasVentasNoCerradas> ventasventasnocerradassAux) throws Exception {
		VentasVentasNoCerradasConstantesFunciones.setEstadosInicialesVentasVentasNoCerradas(ventasventasnocerradassAux);
	}
	
	public void setEstadosInicialesVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradasAux) throws Exception {
		VentasVentasNoCerradasConstantesFunciones.setEstadosInicialesVentasVentasNoCerradas(ventasventasnocerradasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasVentasNoCerradasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasVentasNoCerradasActual()) {
				if(!this.isEsNuevoVentasVentasNoCerradas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasVentasNoCerradas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasVentasNoCerradasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Ventas No Cerradas ?", "MANTENIMIENTO DE Ventas Ventas No Cerradas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasVentasNoCerradas ventasventasnocerradas) throws Exception {
		VentasVentasNoCerradasConstantesFunciones.seleccionarAsignar(this.ventasventasnocerradas,ventasventasnocerradas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasVentasNoCerradas=this.isPermisoActualizarOriginalVentasVentasNoCerradas;
			
			
			this.seleccionarAsignar(ventasventasnocerradas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventasventasnocerradasSessionBean.setsFuncionBusquedaRapida(this.ventasventasnocerradasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasVentasNoCerradas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasVentasNoCerradas(esParaCancelar);				
				this.cancelarNuevoVentasVentasNoCerradas(esParaCancelar);								
			}
			
			this.ventasventasnocerradas=new VentasVentasNoCerradas();
			
			this.inicializarVentasVentasNoCerradas();
			
			this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasVentasNoCerradas() throws Exception {
		try {
			VentasVentasNoCerradasConstantesFunciones.inicializarVentasVentasNoCerradas(this.ventasventasnocerradas);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasVentasNoCerradass(String sAccionBusqueda,List<VentasVentasNoCerradas> ventasventasnocerradassParaReportes) throws Exception {
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
					sPathReporteFinal="VentasVentasNoCerradas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasVentasNoCerradasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasVentasNoCerradasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasVentasNoCerradas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Ventas No Cerradases");		
		parameters.put("busquedapor", VentasVentasNoCerradasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasVentasNoCerradas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasVentasNoCerradasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasVentasNoCerradasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasVentasNoCerradas=new JRBeanArrayDataSource(VentasVentasNoCerradasJInternalFrame.TraerVentasVentasNoCerradasBeans(ventasventasnocerradassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasVentasNoCerradas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasVentasNoCerradasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasVentasNoCerradasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasVentasNoCerradasBean.TraerVentasVentasNoCerradasBeans(ventasventasnocerradassParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradasActionPerformed(null);
					//this.generarExcelReporteVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasVentasNoCerradass(sAccionBusqueda,sTipoArchivoReporte,ventasventasnocerradassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasVentasNoCerradass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasVentasNoCerradas> ventasventasnocerradassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasVentasNoCerradass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasVentasNoCerradas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasVentasNoCerradas ventasventasnocerradas : ventasventasnocerradassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasVentasNoCerradasConstantesFunciones.generarExcelReporteDataVentasVentasNoCerradas("NORMAL",row,workbook,ventasventasnocerradas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasVentasNoCerradas(String sTipo,Row row,Workbook workbook) {
		
		VentasVentasNoCerradasConstantesFunciones.generarExcelReporteHeaderVentasVentasNoCerradas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasVentasNoCerradass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasVentasNoCerradas> ventasventasnocerradassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasVentasNoCerradass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasVentasNoCerradas ventasventasnocerradas : ventasventasnocerradassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.getVentasVentasNoCerradasDescripcion(ventasventasnocerradas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasventasnocerradas.getefectivo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasVentasNoCerradass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasVentasNoCerradas> ventasventasnocerradassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasVentasNoCerradas> ventasventasnocerradassRespaldo=null;
		
		classes=VentasVentasNoCerradasConstantesFunciones.getClassesRelationshipsOfVentasVentasNoCerradas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventasventasnocerradasLogic.setDatosCliente(this.datosCliente);
		this.ventasventasnocerradasLogic.setDatosDeep(this.datosDeep);
		this.ventasventasnocerradasLogic.setIsConDeep(true);
		
		ventasventasnocerradassRespaldo=this.ventasventasnocerradasLogic.getVentasVentasNoCerradass();
		
		this.ventasventasnocerradasLogic.setVentasVentasNoCerradass(ventasventasnocerradassParaReportes);	
		this.ventasventasnocerradasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventasventasnocerradassParaReportes=this.ventasventasnocerradasLogic.getVentasVentasNoCerradass();
		this.ventasventasnocerradasLogic.setVentasVentasNoCerradass(ventasventasnocerradassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasVentasNoCerradass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasVentasNoCerradas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasVentasNoCerradas ventasventasnocerradas : ventasventasnocerradassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasVentasNoCerradas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasVentasNoCerradasConstantesFunciones.generarExcelReporteDataVentasVentasNoCerradas("NORMAL",row,workbook,ventasventasnocerradas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.getVentasVentasNoCerradasDescripcion(ventasventasnocerradas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasVentasNoCerradas() throws Exception {		
		this.startProcessVentasVentasNoCerradas(true);
	}
	
	public void startProcessVentasVentasNoCerradas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasVentasNoCerradas ,this.jPanelParametrosReportesVentasVentasNoCerradas, this.jScrollPanelDatosVentasVentasNoCerradas,this.jPanelPaginacionVentasVentasNoCerradas, this.jScrollPanelDatosEdicionVentasVentasNoCerradas, this.jPanelAccionesVentasVentasNoCerradas,this.jPanelAccionesFormularioVentasVentasNoCerradas,this.jmenuBarVentasVentasNoCerradas,this.jmenuBarDetalleVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasVentasNoCerradas=this.jTabbedPaneBusquedasVentasVentasNoCerradas; 
		
		final JPanel jPanelParametrosReportesVentasVentasNoCerradas=this.jPanelParametrosReportesVentasVentasNoCerradas;
		//final JScrollPane jScrollPanelDatosVentasVentasNoCerradas=this.jScrollPanelDatosVentasVentasNoCerradas;
		final JTable jTableDatosVentasVentasNoCerradas=this.jTableDatosVentasVentasNoCerradas;		
		final JPanel jPanelPaginacionVentasVentasNoCerradas=this.jPanelPaginacionVentasVentasNoCerradas;
		//final JScrollPane jScrollPanelDatosEdicionVentasVentasNoCerradas=this.jScrollPanelDatosEdicionVentasVentasNoCerradas;
		final JPanel jPanelAccionesVentasVentasNoCerradas=this.jPanelAccionesVentasVentasNoCerradas;
		
		JPanel jPanelCamposAuxiliarVentasVentasNoCerradas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			jPanelCamposAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelCamposVentasVentasNoCerradas;
			jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelAccionesFormularioVentasVentasNoCerradas;
		}
		
		final JPanel jPanelCamposVentasVentasNoCerradas=jPanelCamposAuxiliarVentasVentasNoCerradas;
		final JPanel jPanelAccionesFormularioVentasVentasNoCerradas=jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas;
		
		
		final JMenuBar jmenuBarVentasVentasNoCerradas=this.jmenuBarVentasVentasNoCerradas;
		final JToolBar jTtoolBarVentasVentasNoCerradas=this.jTtoolBarVentasVentasNoCerradas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasVentasNoCerradas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasVentasNoCerradas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			jmenuBarDetalleAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jmenuBarDetalleVentasVentasNoCerradas;
			jTtoolBarDetalleAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTtoolBarDetalleVentasVentasNoCerradas;
		}
		
		final JMenuBar jmenuBarDetalleVentasVentasNoCerradas=jmenuBarDetalleAuxiliarVentasVentasNoCerradas;
		final JToolBar jTtoolBarDetalleVentasVentasNoCerradas=jTtoolBarDetalleAuxiliarVentasVentasNoCerradas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasVentasNoCerradas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasVentasNoCerradas;
			processRunnable.jTableDatos=jTableDatosVentasVentasNoCerradas;
			processRunnable.jPanelCampos=jPanelCamposVentasVentasNoCerradas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasVentasNoCerradas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasVentasNoCerradas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasVentasNoCerradas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasVentasNoCerradas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasVentasNoCerradas;
			processRunnable.jTtoolBar=jTtoolBarVentasVentasNoCerradas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasVentasNoCerradas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasVentasNoCerradas ,jPanelParametrosReportesVentasVentasNoCerradas,jTableDatosVentasVentasNoCerradas, /*jScrollPanelDatosVentasVentasNoCerradas,*/jPanelCamposVentasVentasNoCerradas,jPanelPaginacionVentasVentasNoCerradas, /*jScrollPanelDatosEdicionVentasVentasNoCerradas,*/ jPanelAccionesVentasVentasNoCerradas,jPanelAccionesFormularioVentasVentasNoCerradas,jmenuBarVentasVentasNoCerradas,jmenuBarDetalleVentasVentasNoCerradas,jTtoolBarVentasVentasNoCerradas,jTtoolBarDetalleVentasVentasNoCerradas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasVentasNoCerradas ,jPanelParametrosReportesVentasVentasNoCerradas, jScrollPanelDatosVentasVentasNoCerradas,jPanelPaginacionVentasVentasNoCerradas, jScrollPanelDatosEdicionVentasVentasNoCerradas, jPanelAccionesVentasVentasNoCerradas,jPanelAccionesFormularioVentasVentasNoCerradas,jmenuBarVentasVentasNoCerradas,jmenuBarDetalleVentasVentasNoCerradas,jTtoolBarVentasVentasNoCerradas,jTtoolBarDetalleVentasVentasNoCerradas);
						
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
	
	public void finishProcessVentasVentasNoCerradas() {// throws Exception 
		this.finishProcessVentasVentasNoCerradas(true);
	}
	
	public void finishProcessVentasVentasNoCerradas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasVentasNoCerradas ,this.jPanelParametrosReportesVentasVentasNoCerradas, this.jScrollPanelDatosVentasVentasNoCerradas,this.jPanelPaginacionVentasVentasNoCerradas, this.jScrollPanelDatosEdicionVentasVentasNoCerradas, this.jPanelAccionesVentasVentasNoCerradas,this.jPanelAccionesFormularioVentasVentasNoCerradas,this.jmenuBarVentasVentasNoCerradas,this.jmenuBarDetalleVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasVentasNoCerradas=this.jTabbedPaneBusquedasVentasVentasNoCerradas; 
		
		final JPanel jPanelParametrosReportesVentasVentasNoCerradas=this.jPanelParametrosReportesVentasVentasNoCerradas;
		//final JScrollPane jScrollPanelDatosVentasVentasNoCerradas=this.jScrollPanelDatosVentasVentasNoCerradas;
		final JTable jTableDatosVentasVentasNoCerradas=this.jTableDatosVentasVentasNoCerradas;		
		final JPanel jPanelPaginacionVentasVentasNoCerradas=this.jPanelPaginacionVentasVentasNoCerradas;
		//final JScrollPane jScrollPanelDatosEdicionVentasVentasNoCerradas=this.jScrollPanelDatosEdicionVentasVentasNoCerradas;
		final JPanel jPanelAccionesVentasVentasNoCerradas=this.jPanelAccionesVentasVentasNoCerradas;
		
		JPanel jPanelCamposAuxiliarVentasVentasNoCerradas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			jPanelCamposAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelCamposVentasVentasNoCerradas;
			jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelAccionesFormularioVentasVentasNoCerradas;
		}
		
		final JPanel jPanelCamposVentasVentasNoCerradas=jPanelCamposAuxiliarVentasVentasNoCerradas;
		final JPanel jPanelAccionesFormularioVentasVentasNoCerradas=jPanelAccionesFormularioAuxiliarVentasVentasNoCerradas;
		
		
		final JMenuBar jmenuBarVentasVentasNoCerradas=this.jmenuBarVentasVentasNoCerradas;		
		final JToolBar jTtoolBarVentasVentasNoCerradas=this.jTtoolBarVentasVentasNoCerradas;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasVentasNoCerradas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasVentasNoCerradas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			jmenuBarDetalleAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jmenuBarDetalleVentasVentasNoCerradas;
			jTtoolBarDetalleAuxiliarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTtoolBarDetalleVentasVentasNoCerradas;		
		}
		
		final JMenuBar jmenuBarDetalleVentasVentasNoCerradas=jmenuBarDetalleAuxiliarVentasVentasNoCerradas;
		final JToolBar jTtoolBarDetalleVentasVentasNoCerradas=jTtoolBarDetalleAuxiliarVentasVentasNoCerradas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasVentasNoCerradas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasVentasNoCerradas;
			processRunnable.jTableDatos=jTableDatosVentasVentasNoCerradas;
			processRunnable.jPanelCampos=jPanelCamposVentasVentasNoCerradas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasVentasNoCerradas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasVentasNoCerradas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasVentasNoCerradas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasVentasNoCerradas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasVentasNoCerradas;
			processRunnable.jTtoolBar=jTtoolBarVentasVentasNoCerradas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasVentasNoCerradas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasVentasNoCerradas ,jPanelParametrosReportesVentasVentasNoCerradas, jTableDatosVentasVentasNoCerradas,/*jScrollPanelDatosVentasVentasNoCerradas,*/jPanelCamposVentasVentasNoCerradas,jPanelPaginacionVentasVentasNoCerradas, /*jScrollPanelDatosEdicionVentasVentasNoCerradas,*/ jPanelAccionesVentasVentasNoCerradas,jPanelAccionesFormularioVentasVentasNoCerradas,jmenuBarVentasVentasNoCerradas,jmenuBarDetalleVentasVentasNoCerradas,jTtoolBarVentasVentasNoCerradas,jTtoolBarDetalleVentasVentasNoCerradas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasVentasNoCerradas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasVentasNoCerradas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasVentasNoCerradas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasVentasNoCerradas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasVentasNoCerradas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasVentasNoCerradas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasVentasNoCerradas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasVentasNoCerradas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasVentasNoCerradas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventasventasnocerradasConstantesFunciones.getsFinalQueryVentasVentasNoCerradas();
		String  finalQueryPaginacionTodos=this.ventasventasnocerradasConstantesFunciones.getsFinalQueryVentasVentasNoCerradas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasVentasNoCerradasConstantesFunciones.getArrayColumnasGlobalesNoVentasVentasNoCerradas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasVentasNoCerradasConstantesFunciones.getArrayColumnasGlobalesVentasVentasNoCerradas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasVentasNoCerradasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventasventasnocerradassEliminados= new ArrayList<VentasVentasNoCerradas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasVentasNoCerradas();
		
				///*VentasVentasNoCerradasSessionBean*/this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
			
			if(this.ventasventasnocerradasSessionBean==null) {
				this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
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
					this.iNumeroPaginacion=VentasVentasNoCerradasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasVentasNoCerradasConstantesFunciones.getClassesForeignKeysOfVentasVentasNoCerradas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventasventasnocerradas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventasventasnocerradassAux= new ArrayList<VentasVentasNoCerradas>();
			
				
			ventasventasnocerradasLogic.setDatosCliente(this.datosCliente);
			ventasventasnocerradasLogic.setDatosDeep(this.datosDeep);
			ventasventasnocerradasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasVentasNoCerradas")) {
				this.sDetalleReporte=VentasVentasNoCerradasConstantesFunciones.getDetalleIndiceBusquedaVentasVentasNoCerradas(fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventasventasnocerradasLogic.getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasVentasNoCerradasConstantesFunciones.getDetalleIndiceBusquedaVentasVentasNoCerradas(fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasVentasNoCerradasConstantesFunciones.getDetalleIndiceBusquedaVentasVentasNoCerradas(fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventasventasnocerradasLogic.getVentasVentasNoCerradass()==null||ventasventasnocerradasLogic.getVentasVentasNoCerradass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventasventasnocerradass==null|| ventasventasnocerradass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasventasnocerradassAux=new ArrayList<VentasVentasNoCerradas>();
						ventasventasnocerradassAux.addAll(ventasventasnocerradasLogic.getVentasVentasNoCerradass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasventasnocerradassAux=new ArrayList<VentasVentasNoCerradas>();
							ventasventasnocerradassAux.addAll(ventasventasnocerradass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventasventasnocerradasLogic.getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasVentasNoCerradasConstantesFunciones.getDetalleIndiceBusquedaVentasVentasNoCerradas(fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasVentasNoCerradasConstantesFunciones.getDetalleIndiceBusquedaVentasVentasNoCerradas(fecha_emision_desdeBusquedaVentasVentasNoCerradas,fecha_emision_hastaBusquedaVentasVentasNoCerradas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasVentasNoCerradass("BusquedaVentasVentasNoCerradas",ventasventasnocerradasLogic.getVentasVentasNoCerradass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasVentasNoCerradass("BusquedaVentasVentasNoCerradas",ventasventasnocerradass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasventasnocerradasLogic.setVentasVentasNoCerradass(new ArrayList<VentasVentasNoCerradas>());
						ventasventasnocerradasLogic.getVentasVentasNoCerradass().addAll(ventasventasnocerradassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasventasnocerradass=new ArrayList<VentasVentasNoCerradas>();
							ventasventasnocerradass.addAll(ventasventasnocerradassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasVentasNoCerradas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasVentasNoCerradas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasventasnocerradasLogic.getVentasVentasNoCerradass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasventasnocerradass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasventasnocerradasLogic.getVentasVentasNoCerradass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasventasnocerradass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasVentasNoCerradas ventasventasnocerradas) {
		Boolean permite=true;
		
		if(this.ventasventasnocerradas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasVentasNoCerradasConstantesFunciones.getOrderByListaVentasVentasNoCerradas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasVentasNoCerradasConstantesFunciones.getOrderByListaVentasVentasNoCerradas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				if(ventasventasnocerradas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasventasnocerradasTotales=ventasventasnocerradas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasVentasNoCerradas ventasventasnocerradas:this.ventasventasnocerradass) {
				if(ventasventasnocerradas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasventasnocerradasTotales=ventasventasnocerradas;
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
			this.ventasventasnocerradasAux=new VentasVentasNoCerradas();
			this.ventasventasnocerradasAux.setsType(Constantes2.S_TOTALES);
			this.ventasventasnocerradasAux.setIsNew(false);
			this.ventasventasnocerradasAux.setIsChanged(false);
			this.ventasventasnocerradasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasVentasNoCerradasConstantesFunciones.TotalizarValoresFilaVentasVentasNoCerradas(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass(),this.ventasventasnocerradasAux);
				
				//this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().add(this.ventasventasnocerradasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasVentasNoCerradasConstantesFunciones.TotalizarValoresFilaVentasVentasNoCerradas(this.ventasventasnocerradass,this.ventasventasnocerradasAux);
				
				this.ventasventasnocerradass.add(this.ventasventasnocerradasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventasventasnocerradasTotales=new VentasVentasNoCerradas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().remove(ventasventasnocerradasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasventasnocerradass.remove(ventasventasnocerradasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventasventasnocerradasTotales=new VentasVentasNoCerradas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				if(ventasventasnocerradas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasventasnocerradasTotales=ventasventasnocerradas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasVentasNoCerradasConstantesFunciones.TotalizarValoresFilaVentasVentasNoCerradas(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass(),ventasventasnocerradasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasVentasNoCerradas ventasventasnocerradas:this.ventasventasnocerradass) {
				if(ventasventasnocerradas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasventasnocerradasTotales=ventasventasnocerradas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasVentasNoCerradasConstantesFunciones.TotalizarValoresFilaVentasVentasNoCerradas(this.ventasventasnocerradass,ventasventasnocerradasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasVentasNoCerradas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasVentasNoCerradassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasVentasNoCerradassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasventasnocerradasLogic.getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasVentasNoCerradassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasventasnocerradasLogic.getVentasVentasNoCerradassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasVentasNoCerradassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasventasnocerradasLogic.getVentasVentasNoCerradassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVentasVentasNoCerradas() {
		this.isPermisoTodoVentasVentasNoCerradas=false;
		this.isPermisoNuevoVentasVentasNoCerradas=false;
		this.isPermisoActualizarVentasVentasNoCerradas=false;
		this.isPermisoActualizarOriginalVentasVentasNoCerradas=false;
		this.isPermisoEliminarVentasVentasNoCerradas=false;
		this.isPermisoGuardarCambiosVentasVentasNoCerradas=false;
		this.isPermisoConsultaVentasVentasNoCerradas=true;
		this.isPermisoBusquedaVentasVentasNoCerradas=true;
		this.isPermisoReporteVentasVentasNoCerradas=true;
		this.isPermisoOrdenVentasVentasNoCerradas=false;		
		this.isPermisoPaginacionMedioVentasVentasNoCerradas=false;		
		this.isPermisoPaginacionAltoVentasVentasNoCerradas=false;		
		this.isPermisoPaginacionTodoVentasVentasNoCerradas=false;		
		this.isPermisoCopiarVentasVentasNoCerradas=false;		
		this.isPermisoVerFormVentasVentasNoCerradas=false;		
		this.isPermisoDuplicarVentasVentasNoCerradas=false;
		this.isPermisoOrdenVentasVentasNoCerradas=false;
	}
	
	public void setPermisosUsuarioVentasVentasNoCerradas(Boolean isPermiso) {
		this.isPermisoTodoVentasVentasNoCerradas=isPermiso;
		this.isPermisoNuevoVentasVentasNoCerradas=isPermiso;
		this.isPermisoActualizarVentasVentasNoCerradas=isPermiso;
		this.isPermisoActualizarOriginalVentasVentasNoCerradas=isPermiso;
		this.isPermisoEliminarVentasVentasNoCerradas=isPermiso;
		this.isPermisoGuardarCambiosVentasVentasNoCerradas=isPermiso;
		this.isPermisoConsultaVentasVentasNoCerradas=isPermiso;
		this.isPermisoBusquedaVentasVentasNoCerradas=isPermiso;
		this.isPermisoReporteVentasVentasNoCerradas=isPermiso;
		this.isPermisoOrdenVentasVentasNoCerradas=isPermiso;		
		this.isPermisoPaginacionMedioVentasVentasNoCerradas=isPermiso;		
		this.isPermisoPaginacionAltoVentasVentasNoCerradas=isPermiso;		
		this.isPermisoPaginacionTodoVentasVentasNoCerradas=isPermiso;		
		this.isPermisoCopiarVentasVentasNoCerradas=isPermiso;		
		this.isPermisoVerFormVentasVentasNoCerradas=isPermiso;		
		this.isPermisoDuplicarVentasVentasNoCerradas=isPermiso;
		this.isPermisoOrdenVentasVentasNoCerradas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasVentasNoCerradas(Boolean isPermiso) {
		//this.isPermisoTodoVentasVentasNoCerradas=isPermiso;
		this.isPermisoNuevoVentasVentasNoCerradas=isPermiso;
		this.isPermisoActualizarVentasVentasNoCerradas=isPermiso;
		this.isPermisoActualizarOriginalVentasVentasNoCerradas=isPermiso;
		this.isPermisoEliminarVentasVentasNoCerradas=isPermiso;
		this.isPermisoGuardarCambiosVentasVentasNoCerradas=isPermiso;
		//this.isPermisoConsultaVentasVentasNoCerradas=isPermiso;
		//this.isPermisoBusquedaVentasVentasNoCerradas=isPermiso;
		//this.isPermisoReporteVentasVentasNoCerradas=isPermiso;
		//this.isPermisoOrdenVentasVentasNoCerradas=isPermiso;		
		//this.isPermisoPaginacionMedioVentasVentasNoCerradas=isPermiso;		
		//this.isPermisoPaginacionAltoVentasVentasNoCerradas=isPermiso;		
		//this.isPermisoPaginacionTodoVentasVentasNoCerradas=isPermiso;		
		//this.isPermisoCopiarVentasVentasNoCerradas=isPermiso;		
		//this.isPermisoDuplicarVentasVentasNoCerradas=isPermiso;
		//this.isPermisoOrdenVentasVentasNoCerradas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasVentasNoCerradasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasVentasNoCerradasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasVentasNoCerradas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasVentasNoCerradasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasVentasNoCerradasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasVentasNoCerradasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasVentasNoCerradasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasVentasNoCerradas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasVentasNoCerradasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasVentasNoCerradasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasVentasNoCerradas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasVentasNoCerradas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasVentasNoCerradas=this.isPermisoActualizarVentasVentasNoCerradas;
			this.isPermisoEliminarVentasVentasNoCerradas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasVentasNoCerradas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasVentasNoCerradas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasVentasNoCerradas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasVentasNoCerradas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasVentasNoCerradas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasVentasNoCerradas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasVentasNoCerradas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasVentasNoCerradas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasVentasNoCerradas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasVentasNoCerradas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasVentasNoCerradas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasVentasNoCerradas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasVentasNoCerradas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasVentasNoCerradas.setToolTipText(this.jTableDatosVentasVentasNoCerradas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasVentasNoCerradas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasVentasNoCerradas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasVentasNoCerradasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasVentasNoCerradasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasVentasNoCerradas() throws Exception {
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
	public void inicializarCombosForeignKeyVentasVentasNoCerradasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasVentasNoCerradasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasVentasNoCerradasJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasVentasNoCerradas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventasventasnocerradasSessionBean==null) {
				this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
			}

			if(!this.ventasventasnocerradasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventasventasnocerradasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyVentasVentasNoCerradas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasVentasNoCerradas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasVentasNoCerradas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasVentasNoCerradas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasVentasNoCerradas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasVentasNoCerradas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasVentasNoCerradas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasVentasNoCerradas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasVentasNoCerradas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasVentasNoCerradas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasVentasNoCerradas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasVentasNoCerradas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VentasVentasNoCerradasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasVentasNoCerradasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasVentasNoCerradasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean(); 
		this.ventasventasnocerradasConstantesFunciones=new VentasVentasNoCerradasConstantesFunciones(); 
		this.ventasventasnocerradasBean=new VentasVentasNoCerradas();//(this.ventasventasnocerradasConstantesFunciones); 		
		this.ventasventasnocerradasReturnGeneral=new VentasVentasNoCerradasParameterReturnGeneral(); 
		
		this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasventasnocerradasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasVentasNoCerradasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasVentasNoCerradasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasVentasNoCerradasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasVentasNoCerradas(true);
			
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
			
			this.ventasventasnocerradasConstantesFunciones=new VentasVentasNoCerradasConstantesFunciones(); 
			this.ventasventasnocerradasBean=new VentasVentasNoCerradas();//this.ventasventasnocerradasConstantesFunciones); 			
			this.ventasventasnocerradasReturnGeneral=new VentasVentasNoCerradasParameterReturnGeneral(); 
		
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Ventas No Cerradas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventasventasnocerradas=new VentasVentasNoCerradas();
			this.ventasventasnocerradass = new ArrayList<VentasVentasNoCerradas>();
			this.ventasventasnocerradassAux = new ArrayList<VentasVentasNoCerradas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic=new VentasVentasNoCerradasLogic();
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			//this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventasventasnocerradasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasVentasNoCerradas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasVentasNoCerradas);	
					}
					
					if(this.jInternalFrameImportacionVentasVentasNoCerradas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasVentasNoCerradas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasVentasNoCerradas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasVentasNoCerradas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasVentasNoCerradas);
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.setVisible(false);
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas);
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasVentasNoCerradas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasVentasNoCerradas);
					this.jInternalFrameImportacionVentasVentasNoCerradas.setVisible(false);
					this.jInternalFrameImportacionVentasVentasNoCerradas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasVentasNoCerradas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasVentasNoCerradas);
					this.jInternalFrameOrderByVentasVentasNoCerradas.setVisible(false);
					this.jInternalFrameOrderByVentasVentasNoCerradas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasVentasNoCerradasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasVentasNoCerradasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventasventasnocerradasReturnGeneral=new VentasVentasNoCerradasParameterReturnGeneral();
			
			this.ventasventasnocerradasParameterGeneral=new VentasVentasNoCerradasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventasventasnocerradasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasVentasNoCerradasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasVentasNoCerradasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),this.ventasventasnocerradasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasVentasNoCerradasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),this.ventasventasnocerradasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaCopiarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaVerFormVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaOrdenVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			
			
			this.isVisibilidadBusquedaVentasVentasNoCerradas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasVentasNoCerradas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasVentasNoCerradas(false);
			
			this.setPermisosUsuarioVentasVentasNoCerradas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() 
				|| (this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() && this.ventasventasnocerradasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasVentasNoCerradasClasesRelacionadas();
			}
			
			if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasVentasNoCerradasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasVentasNoCerradas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasVentasNoCerradas();
			}
			
			if(!this.isPermisoBusquedaVentasVentasNoCerradas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasVentasNoCerradasConstantesFunciones.getTiposSeleccionarVentasVentasNoCerradas());
				
				this.tiposColumnasSelect=VentasVentasNoCerradasConstantesFunciones.getTiposSeleccionarVentasVentasNoCerradas(true);
				
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
			//if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasVentasNoCerradas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasVentasNoCerradas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasVentasNoCerradas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasVentasNoCerradas() ;
			
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
				ventasventasnocerradasImplementable= (VentasVentasNoCerradasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasVentasNoCerradasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventasventasnocerradasImplementableHome= (VentasVentasNoCerradasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasVentasNoCerradasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventasventasnocerradass= new ArrayList<VentasVentasNoCerradas>();
			this.ventasventasnocerradassEliminados= new ArrayList<VentasVentasNoCerradas>();
						
			this.isEsNuevoVentasVentasNoCerradas=false;
			this.esParaAccionDesdeFormularioVentasVentasNoCerradas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasVentasNoCerradas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasVentasNoCerradas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasVentasNoCerradasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasVentasNoCerradas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasVentasNoCerradas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasVentasNoCerradas();
			}
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasVentasNoCerradas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasVentasNoCerradas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasVentasNoCerradas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasVentasNoCerradas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasVentasNoCerradas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasVentasNoCerradas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasVentasNoCerradas")) {
				iIndex=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasVentasNoCerradas();	
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
	
	public void cargarCombosForeignKeyVentasVentasNoCerradas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasVentasNoCerradas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasVentasNoCerradas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasVentasNoCerradasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasVentasNoCerradas();
		
		this.cargarCombosFrameForeignKeyVentasVentasNoCerradas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasVentasNoCerradas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasVentasNoCerradas();
		}
	}
	
	
	
	public void jButtonNuevoVentasVentasNoCerradasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			
			if(jTableDatosVentasVentasNoCerradas.getRowCount()>=1) {
				jTableDatosVentasVentasNoCerradas.removeRowSelectionInterval(0, jTableDatosVentasVentasNoCerradas.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasVentasNoCerradas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasVentasNoCerradas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasVentasNoCerradas(true);			
			//this.ventasventasnocerradas=new VentasVentasNoCerradas();
			//this.ventasventasnocerradas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas() ;
			
			if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasVentasNoCerradas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventasventasnocerradas);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);				
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasVentasNoCerradas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasVentasNoCerradasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasVentasNoCerradas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasVentasNoCerradas.getSelectedRows().length;			
			}
			
			ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasVentasNoCerradas--;			
				//VentasVentasNoCerradas ventasventasnocerradasAux= new VentasVentasNoCerradas();			
				//ventasventasnocerradasAux.setId(this.iIdNuevoVentasVentasNoCerradas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasVentasNoCerradas ventasventasnocerradasOrigen=new VentasVentasNoCerradas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasVentasNoCerradas ventasventasnocerradasOrigen : ventasventasnocerradassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventasventasnocerradasOrigen =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasventasnocerradasOrigen =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasVentasNoCerradas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventasventasnocerradas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasVentasNoCerradas(ventasventasnocerradasOrigen,this.ventasventasnocerradas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().add(this.ventasventasnocerradasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradass.add(this.ventasventasnocerradasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
				
				this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(this.getIndiceNuevoVentasVentasNoCerradas(), this.getIndiceNuevoVentasVentasNoCerradas());
				
				int iLastRow =  this.jTableDatosVentasVentasNoCerradas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasVentasNoCerradas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasVentasNoCerradas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();									
		
			VentasVentasNoCerradas ventasventasnocerradasOrigen=new VentasVentasNoCerradas();
			VentasVentasNoCerradas ventasventasnocerradasDestino=new VentasVentasNoCerradas();
				
			ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasVentasNoCerradas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventasventasnocerradassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasVentasNoCerradas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasventasnocerradasOrigen =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasventasnocerradasOrigen =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasventasnocerradasDestino =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasventasnocerradasDestino =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventasventasnocerradasOrigen =ventasventasnocerradassSeleccionados.get(0);
				ventasventasnocerradasDestino =ventasventasnocerradassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasVentasNoCerradas(ventasventasnocerradasOrigen,ventasventasnocerradasDestino,true,false);
				
				ventasventasnocerradasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventasventasnocerradasDestino,ventasventasnocerradasLogic.getVentasVentasNoCerradass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventasventasnocerradasDestino,ventasventasnocerradass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
				
				//this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(this.getIndiceNuevoVentasVentasNoCerradas(), this.getIndiceNuevoVentasVentasNoCerradas());
				
				int iLastRow =  this.jTableDatosVentasVentasNoCerradas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasVentasNoCerradas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasVentasNoCerradas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasVentasNoCerradas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(!isVisible);
			this.jPanelPaginacionVentasVentasNoCerradas.setVisible(!isVisible);
			this.jPanelAccionesVentasVentasNoCerradas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasVentasNoCerradas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasVentasNoCerradas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasVentasNoCerradas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasVentasNoCerradas();
			
			this.abrirFrameOrderByVentasVentasNoCerradas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasVentasNoCerradas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasVentasNoCerradas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasVentasNoCerradas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.isMaximum()) {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSize(this.jInternalFrameDetalleFormVentasVentasNoCerradas.iWidthFormulario,this.jInternalFrameDetalleFormVentasVentasNoCerradas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasVentasNoCerradas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasVentasNoCerradas.isMaximum()) {
						this.jInternalFrameDetalleFormVentasVentasNoCerradas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jContentPaneDetalleVentasVentasNoCerradas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jContentPaneDetalleVentasVentasNoCerradas.getWidth(),VentasVentasNoCerradasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jContentPaneDetalleVentasVentasNoCerradas.getWidth(),VentasVentasNoCerradasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jContentPaneDetalleVentasVentasNoCerradas.getWidth(),VentasVentasNoCerradasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasVentasNoCerradas.setVisible(true);
	        this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasVentasNoCerradas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasVentasNoCerradas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasVentasNoCerradas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasVentasNoCerradas,false,this);
				} else {
					this.jInternalFrameOrderByVentasVentasNoCerradas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasVentasNoCerradas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasVentasNoCerradas);
				this.jInternalFrameOrderByVentasVentasNoCerradas.setVisible(false);
				this.jInternalFrameOrderByVentasVentasNoCerradas.setSelected(false);
				
				this.jInternalFrameOrderByVentasVentasNoCerradas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasVentasNoCerradas"));
				
				this.inicializarActualizarBindingTablaOrderByVentasVentasNoCerradas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasVentasNoCerradas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasVentasNoCerradas==null) {
				
				this.jInternalFrameImportacionVentasVentasNoCerradas=new ImportacionJInternalFrame(VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasVentasNoCerradas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasVentasNoCerradas);
				this.jInternalFrameImportacionVentasVentasNoCerradas.setVisible(false);
				this.jInternalFrameImportacionVentasVentasNoCerradas.setSelected(false);


				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasVentasNoCerradas"));
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasVentasNoCerradas"));
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasVentasNoCerradas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasVentasNoCerradas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas==null) {
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas=new ReporteDinamicoJInternalFrame(VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasVentasNoCerradas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas);
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasVentasNoCerradas"));
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasVentasNoCerradas"));
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasVentasNoCerradas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasVentasNoCerradas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasVentasNoCerradas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasVentasNoCerradas);
			
	       	this.jInternalFrameDetalleFormVentasVentasNoCerradas.setVisible(false);
	        this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasVentasNoCerradas.dispose();
			//this.jInternalFrameDetalleFormVentasVentasNoCerradas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasVentasNoCerradas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasVentasNoCerradas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasVentasNoCerradas.setVisible(true);
	        this.jInternalFrameImportacionVentasVentasNoCerradas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasVentasNoCerradas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasVentasNoCerradas.setVisible(true);
	        this.jInternalFrameOrderByVentasVentasNoCerradas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasVentasNoCerradas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasVentasNoCerradas.setVisible(false);
	        this.jInternalFrameOrderByVentasVentasNoCerradas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasVentasNoCerradas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasVentasNoCerradas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasVentasNoCerradas.setVisible(false);
	        this.jInternalFrameImportacionVentasVentasNoCerradas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasVentasNoCerradas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasVentasNoCerradas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasVentasNoCerradas(true);
			//this.isEsNuevoVentasVentasNoCerradas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false) ;
			
			if(ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasVentasNoCerradas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasVentasNoCerradasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasVentasNoCerradas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasVentasNoCerradas(true);
			//this.isEsNuevoVentasVentasNoCerradas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventasventasnocerradas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false) ;
			
			if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasVentasNoCerradas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasVentasNoCerradas(false);
			
			//if(!this.isEsNuevoVentasVentasNoCerradas) {								
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				
			}
			
			if(this.permiteMantenimiento(this.ventasventasnocerradas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasVentasNoCerradas=true;
					this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
					this.isEsNuevoVentasVentasNoCerradas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasVentasNoCerradas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasVentasNoCerradas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(false);
				
				this.habilitarDeshabilitarControlesVentasVentasNoCerradas(false);
			
												
				
				if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasVentasNoCerradas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,ventasventasnocerradasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasVentasNoCerradas(this.ventasventasnocerradas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventasventasnocerradasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventasventasnocerradas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				this.ventasventasnocerradas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				this.ventasventasnocerradas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventasventasnocerradas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasVentasNoCerradasModel) this.jTableDatosVentasVentasNoCerradas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasVentasNoCerradas=true;
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
				this.isEsNuevoVentasVentasNoCerradas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(false);
				
				this.habilitarDeshabilitarControlesVentasVentasNoCerradas(false);
				
				
				
				if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasVentasNoCerradas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasVentasNoCerradas.getRowCount()>=1) {
				jTableDatosVentasVentasNoCerradas.removeRowSelectionInterval(0, jTableDatosVentasVentasNoCerradas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasVentasNoCerradas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(false) ;
			
			this.isEsNuevoVentasVentasNoCerradas=false;
			
			if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasVentasNoCerradas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				
				//SI ES MANUAL
				if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasVentasNoCerradas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasVentasNoCerradas--;			
			//VentasVentasNoCerradas ventasventasnocerradasAux= new VentasVentasNoCerradas();			
			//ventasventasnocerradasAux.setId(this.iIdNuevoVentasVentasNoCerradas);
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasVentasNoCerradas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
			
			this.ventasventasnocerradas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().add(this.ventasventasnocerradasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventasventasnocerradass.add(this.ventasventasnocerradasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			
			this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(this.getIndiceNuevoVentasVentasNoCerradas(), this.getIndiceNuevoVentasVentasNoCerradas());
			
			int iLastRow =  this.jTableDatosVentasVentasNoCerradas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasVentasNoCerradas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasVentasNoCerradas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
			
			//SI ES MANUAL
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasVentasNoCerradas();
			}
			
			//this.abrirFrameTreeVentasVentasNoCerradas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasVentasNoCerradas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasVentasNoCerradas.setFileImportacion(this.jInternalFrameImportacionVentasVentasNoCerradas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasVentasNoCerradas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasVentasNoCerradas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		

		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasVentasNoCerradasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasVentasNoCerradasBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ectivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ectivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ectivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ectivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO:
					sNombreCampoCategoria="efectivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO:
					sNombreCampoCategoriaValor="efectivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Efectivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"efectivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasVentasNoCerradass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO);
					iRow++;

					for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasventasnocerradas.getefectivo());
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
			//	this.getFilaCabeceraExportarExcelVentasVentasNoCerradas(row);				
			//	iRow++;
			//}				
			
			//for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasVentasNoCerradas(ventasventasnocerradasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
			
			//SI ES MANUAL
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasVentasNoCerradas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
			
			//SI ES MANUAL
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasVentasNoCerradas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
			
			//SI ES MANUAL
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasVentasNoCerradas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasVentasNoCerradas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasVentasNoCerradas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasVentasNoCerradas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasVentasNoCerradas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasVentasNoCerradas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasVentasNoCerradas.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasVentasNoCerradas.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasVentasNoCerradas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasVentasNoCerradas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasVentasNoCerradas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasVentasNoCerradas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasVentasNoCerradas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasVentasNoCerradas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasVentasNoCerradas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasVentasNoCerradas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasVentasNoCerradas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasVentasNoCerradas();
		
		this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasVentasNoCerradas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasVentasNoCerradas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasVentasNoCerradas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasVentasNoCerradas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasVentasNoCerradas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionNuevoVentasVentasNoCerradas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionNuevoVentasVentasNoCerradas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasVentasNoCerradas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasVentasNoCerradas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasVentasNoCerradas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasVentasNoCerradas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasVentasNoCerradas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasVentasNoCerradas(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasVentasNoCerradas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasVentasNoCerradas() throws Exception {
		try	{
			if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasVentasNoCerradas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasVentasNoCerradas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasVentasNoCerradas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasVentasNoCerradas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasVentasNoCerradas.addItem(reporte);
			}
			
			
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasVentasNoCerradas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasVentasNoCerradas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasVentasNoCerradas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasVentasNoCerradas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasVentasNoCerradasConstantesFunciones.getTiposSeleccionarVentasVentasNoCerradas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasVentasNoCerradasConstantesFunciones.getTiposSeleccionarVentasVentasNoCerradas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasVentasNoCerradasConstantesFunciones.getTiposSeleccionarVentasVentasNoCerradas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasVentasNoCerradas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaVentasVentasNoCerradas=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasVentasNoCerradas=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasVentasNoCerradas(Boolean esInicializar) throws Exception {				
		if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasVentasNoCerradas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasVentasNoCerradas() throws Exception {
		this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasVentasNoCerradas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasVentasNoCerradasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasVentasNoCerradas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventasventasnocerradasLogic.getVentasVentasNoCerradass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventasventasnocerradass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasVentasNoCerradas.setModel(new VentasVentasNoCerradasModel(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasVentasNoCerradas.setModel(new VentasVentasNoCerradasModel(this.ventasventasnocerradass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasVentasNoCerradas!=null && this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasVentasNoCerradas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,ventasventasnocerradasConstantesFunciones.resaltarSeleccionarVentasVentasNoCerradas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,ventasventasnocerradasConstantesFunciones.resaltarSeleccionarVentasVentasNoCerradas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_ID));

		if(this.ventasventasnocerradasConstantesFunciones.mostraridVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasventasnocerradasConstantesFunciones.resaltaridVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activaridVentasVentasNoCerradas,iSizeTabla,this,true,"idVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltaridVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activaridVentasVentasNoCerradas,this,true,"idVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarcodigoVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarcodigoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarcodigoVentasVentasNoCerradas,iSizeTabla,this,true,"codigoVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarcodigoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarcodigoVentasVentasNoCerradas,this,true,"codigoVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarnombre_completoVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnombre_completoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnombre_completoVentasVentasNoCerradas,iSizeTabla,this,true,"nombre_completoVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnombre_completoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnombre_completoVentasVentasNoCerradas,this,true,"nombre_completoVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emisionVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emisionVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarfecha_emisionVentasVentasNoCerradas,iSizeTabla,this,true,"fecha_emisionVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emisionVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarfecha_emisionVentasVentasNoCerradas,this,true,"fecha_emisionVentasVentasNoCerradas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_pre_impresoVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_pre_impresoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnumero_pre_impresoVentasVentasNoCerradas,iSizeTabla,this,true,"numero_pre_impresoVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_pre_impresoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnumero_pre_impresoVentasVentasNoCerradas,this,true,"numero_pre_impresoVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_documentoVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_documentoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnumero_documentoVentasVentasNoCerradas,iSizeTabla,this,true,"numero_documentoVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_documentoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarnumero_documentoVentasVentasNoCerradas,this,true,"numero_documentoVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL));

		if(this.ventasventasnocerradasConstantesFunciones.mostrartotalVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasventasnocerradasConstantesFunciones.resaltartotalVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activartotalVentasVentasNoCerradas,iSizeTabla,this,true,"totalVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltartotalVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activartotalVentasVentasNoCerradas,this,true,"totalVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO));

		if(this.ventasventasnocerradasConstantesFunciones.mostrarefectivoVentasVentasNoCerradas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarefectivoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarefectivoVentasVentasNoCerradas,iSizeTabla,this,true,"efectivoVentasVentasNoCerradas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasventasnocerradasConstantesFunciones.resaltarefectivoVentasVentasNoCerradas,this.ventasventasnocerradasConstantesFunciones.activarefectivoVentasVentasNoCerradas,this,true,"efectivoVentasVentasNoCerradas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasVentasNoCerradasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasVentasNoCerradas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasVentasNoCerradas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasVentasNoCerradas.addColumn(tableColumn);
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
			
			this.jTableDatosVentasVentasNoCerradas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasVentasNoCerradas.moveColumn(this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasVentasNoCerradas.moveColumn(this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasVentasNoCerradas.moveColumn(this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasVentasNoCerradas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasVentasNoCerradas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasVentasNoCerradas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasVentasNoCerradas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasVentasNoCerradas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasVentasNoCerradas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventasventasnocerradasLogic.getVentasVentasNoCerradass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventasventasnocerradass.size()-1;
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
		//this.jTableDatosVentasVentasNoCerradas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasVentasNoCerradas();
			
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
				
				//this.isEsNuevoVentasVentasNoCerradas=false;
					
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
				if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasVentasNoCerradas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasVentasNoCerradas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventasventasnocerradas.getsType().equals("DUPLICADO")
				   || this.ventasventasnocerradas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasVentasNoCerradas=true;
				
				} else {
					this.isEsNuevoVentasVentasNoCerradas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
					if(this.ventasventasnocerradas.getId()>=0 && !this.ventasventasnocerradas.getIsNew()) {						
						this.isEsNuevoVentasVentasNoCerradas=false;
						
					} else {
						this.isEsNuevoVentasVentasNoCerradas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasVentasNoCerradas(esRelaciones);						
				
				this.seleccionarVentasVentasNoCerradas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventasventasnocerradas.getId()<0) {
					this.isEsNuevoVentasVentasNoCerradas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasVentasNoCerradas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasVentasNoCerradas(evt,rowIndex);
				}	
				
				if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasVentasNoCerradas: " + this.dDif); 
					}
				}								
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasVentasNoCerradas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventasventasnocerradas)) {
					if(this.ventasventasnocerradas.getId()>0) {
						this.ventasventasnocerradas.setIsDeleted(true);
						
						this.ventasventasnocerradassEliminados.add(this.ventasventasnocerradas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().remove(this.ventasventasnocerradas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradass.remove(this.ventasventasnocerradas);				
					}
					
					
					((VentasVentasNoCerradasModel) this.jTableDatosVentasVentasNoCerradas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasVentasNoCerradas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasVentasNoCerradas) {
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasVentasNoCerradas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasVentasNoCerradas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasVentasNoCerradas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasVentasNoCerradas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasVentasNoCerradas(ventasventasnocerradas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasVentasNoCerradas(ventasventasnocerradas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasVentasNoCerradas(ventasventasnocerradas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasVentasNoCerradas(ventasventasnocerradas);
	}
	
	public void setVariablesObjetoActualToFormularioVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setText(ventasventasnocerradas.getId().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setText(ventasventasnocerradas.getcodigo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnombre_completo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setDate(ventasventasnocerradas.getfecha_emision());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnumero_documento());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setText(ventasventasnocerradas.gettotal().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setText(ventasventasnocerradas.getefectivo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasVentasNoCerradas ventasventasnocerradasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventasventasnocerradasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasVentasNoCerradas ventasventasnocerradasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventasventasnocerradasLocal=this.ventasventasnocerradas;
			} else {
				ventasventasnocerradasLocal=this.ventasventasnocerradasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventasventasnocerradasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasVentasNoCerradas(ventasventasnocerradasLocal,true);
					
					if(ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventasventasnocerradasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventasventasnocerradasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(ventasventasnocerradas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(ventasventasnocerradas);
	}
	
	public void setVariablesFormularioToObjetoActualVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(ventasventasnocerradas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.getText()==null || this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.getText()=="" || this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setText("0");
			}

			if(conColumnasBase) {ventasventasnocerradas.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelIdVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setcodigo(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelcodigoVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setnombre_completo(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnombre_completoVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setfecha_emision(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelfecha_emisionVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setnumero_pre_impreso(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_pre_impresoVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setnumero_documento(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelnumero_documentoVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.settotal(Double.parseDouble(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabeltotalVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasventasnocerradas.setefectivo(Double.parseDouble(this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelefectivoVentasVentasNoCerradas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradasBean,VentasVentasNoCerradas ventasventasnocerradas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradasOrigen,VentasVentasNoCerradas ventasventasnocerradas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getId()!=null && !ventasventasnocerradasOrigen.getId().equals(0L))) {ventasventasnocerradas.setId(ventasventasnocerradasOrigen.getId());}}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getfecha_emision_desde()!=null && !ventasventasnocerradasOrigen.getfecha_emision_desde().equals(new Date()))) {ventasventasnocerradas.setfecha_emision_desde(ventasventasnocerradasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getfecha_emision_hasta()!=null && !ventasventasnocerradasOrigen.getfecha_emision_hasta().equals(new Date()))) {ventasventasnocerradas.setfecha_emision_hasta(ventasventasnocerradasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getcodigo()!=null && !ventasventasnocerradasOrigen.getcodigo().equals(""))) {ventasventasnocerradas.setcodigo(ventasventasnocerradasOrigen.getcodigo());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getnombre_completo()!=null && !ventasventasnocerradasOrigen.getnombre_completo().equals(""))) {ventasventasnocerradas.setnombre_completo(ventasventasnocerradasOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getfecha_emision()!=null && !ventasventasnocerradasOrigen.getfecha_emision().equals(new Date()))) {ventasventasnocerradas.setfecha_emision(ventasventasnocerradasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getnumero_pre_impreso()!=null && !ventasventasnocerradasOrigen.getnumero_pre_impreso().equals(""))) {ventasventasnocerradas.setnumero_pre_impreso(ventasventasnocerradasOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getnumero_documento()!=null && !ventasventasnocerradasOrigen.getnumero_documento().equals(""))) {ventasventasnocerradas.setnumero_documento(ventasventasnocerradasOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.gettotal()!=null && !ventasventasnocerradasOrigen.gettotal().equals(0.0))) {ventasventasnocerradas.settotal(ventasventasnocerradasOrigen.gettotal());}
			if(conDefault || (!conDefault && ventasventasnocerradasOrigen.getefectivo()!=null && !ventasventasnocerradasOrigen.getefectivo().equals(0.0))) {ventasventasnocerradas.setefectivo(ventasventasnocerradasOrigen.getefectivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setText(ventasventasnocerradas.getId().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setText(ventasventasnocerradas.getcodigo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnombre_completo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setDate(ventasventasnocerradas.getfecha_emision());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setText(ventasventasnocerradas.getnumero_documento());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setText(ventasventasnocerradas.gettotal().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setText(ventasventasnocerradas.getefectivo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasVentasNoCerradas(VentasVentasNoCerradasBean ventasventasnocerradasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getId().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getcodigo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getnombre_completo());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setDate(ventasventasnocerradasBean.getfecha_emision());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getnumero_documento());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setText(ventasventasnocerradasBean.gettotal().toString());
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setText(ventasventasnocerradasBean.getefectivo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasVentasNoCerradas(VentasVentasNoCerradasParameterReturnGeneral ventasventasnocerradasReturnGeneral,VentasVentasNoCerradasBean ventasventasnocerradasBean,Boolean conDefault) throws Exception { 
		try {
			VentasVentasNoCerradas ventasventasnocerradasLocal=new VentasVentasNoCerradas();
			
			ventasventasnocerradasLocal=ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasventasnocerradasLocal.getId()!=null && !ventasventasnocerradasLocal.getId().equals(0L))) {ventasventasnocerradasBean.setId(ventasventasnocerradasLocal.getId());}}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getcodigo()!=null && !ventasventasnocerradasLocal.getcodigo().equals(""))) {ventasventasnocerradasBean.setcodigo(ventasventasnocerradasLocal.getcodigo());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getnombre_completo()!=null && !ventasventasnocerradasLocal.getnombre_completo().equals(""))) {ventasventasnocerradasBean.setnombre_completo(ventasventasnocerradasLocal.getnombre_completo());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getfecha_emision()!=null && !ventasventasnocerradasLocal.getfecha_emision().equals(new Date()))) {ventasventasnocerradasBean.setfecha_emision(ventasventasnocerradasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getnumero_pre_impreso()!=null && !ventasventasnocerradasLocal.getnumero_pre_impreso().equals(""))) {ventasventasnocerradasBean.setnumero_pre_impreso(ventasventasnocerradasLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getnumero_documento()!=null && !ventasventasnocerradasLocal.getnumero_documento().equals(""))) {ventasventasnocerradasBean.setnumero_documento(ventasventasnocerradasLocal.getnumero_documento());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.gettotal()!=null && !ventasventasnocerradasLocal.gettotal().equals(0.0))) {ventasventasnocerradasBean.settotal(ventasventasnocerradasLocal.gettotal());}
			if(conDefault || (!conDefault && ventasventasnocerradasLocal.getefectivo()!=null && !ventasventasnocerradasLocal.getefectivo().equals(0.0))) {ventasventasnocerradasBean.setefectivo(ventasventasnocerradasLocal.getefectivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasVentasNoCerradasGenerico(Long idVentasVentasNoCerradasSeleccionado,JComboBox jComboBoxVentasVentasNoCerradas,List<VentasVentasNoCerradas> ventasventasnocerradassLocal)throws Exception {
		try {
			VentasVentasNoCerradas  ventasventasnocerradasTemp=null;

			for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassLocal) {
				if(ventasventasnocerradasAux.getId()!=null && ventasventasnocerradasAux.getId().equals(idVentasVentasNoCerradasSeleccionado)) {
					ventasventasnocerradasTemp=ventasventasnocerradasAux;
					break;
				}
			}

			jComboBoxVentasVentasNoCerradas.setSelectedItem(ventasventasnocerradasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasVentasNoCerradasGenerico(JComboBox jComboBoxVentasVentasNoCerradas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasVentasNoCerradas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasVentasNoCerradas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasVentasNoCerradas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasVentasNoCerradas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasventasnocerradas=(VentasVentasNoCerradas) ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasventasnocerradas =(VentasVentasNoCerradas) ventasventasnocerradass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventasventasnocerradas.getIsNew() && !ventasventasnocerradas.getIsChanged() && !ventasventasnocerradas.getIsDeleted()) {
				sDescripcion=ventasventasnocerradas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventasventasnocerradas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventasventasnocerradas.getIsNew() && !ventasventasnocerradas.getIsChanged() && !ventasventasnocerradas.getIsDeleted()) {
				sDescripcion=ventasventasnocerradas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventasventasnocerradas.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasVentasNoCerradas ventasventasnocerradasRow=new VentasVentasNoCerradas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasventasnocerradasRow=(VentasVentasNoCerradas) ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasventasnocerradasRow=(VentasVentasNoCerradas) ventasventasnocerradass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));			
			this.jButtonDuplicarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas && this.isPermisoDuplicarVentasVentasNoCerradas));			
			this.jButtonCopiarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaCopiarVentasVentasNoCerradas && this.isPermisoCopiarVentasVentasNoCerradas));
			this.jButtonVerFormVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaVerFormVentasVentasNoCerradas && this.isPermisoVerFormVentasVentasNoCerradas));
			
			this.jButtonAbrirOrderByVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));			
			
			this.jButtonNuevoRelacionesVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));			
			this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaModificarVentasVentasNoCerradas && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaActualizarVentasVentasNoCerradas && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaEliminarVentasVentasNoCerradas && this.isPermisoEliminarVentasVentasNoCerradas));
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.setVisible(this.isVisibilidadCeldaCancelarVentasVentasNoCerradas);							
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));						
			this.jButtonDuplicarToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas && this.isPermisoDuplicarVentasVentasNoCerradas));						
			this.jButtonCopiarToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaCopiarVentasVentasNoCerradas && this.isPermisoCopiarVentasVentasNoCerradas));			
			this.jButtonVerFormToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaVerFormVentasVentasNoCerradas && this.isPermisoVerFormVentasVentasNoCerradas));			
			this.jButtonAbrirOrderByToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));
			this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));			
			this.jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));			
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaModificarVentasVentasNoCerradas && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaActualizarVentasVentasNoCerradas  && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaEliminarVentasVentasNoCerradas && this.isPermisoEliminarVentasVentasNoCerradas));
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarToolBarVentasVentasNoCerradas.setVisible(this.isVisibilidadCeldaCancelarVentasVentasNoCerradas);				
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));			
			this.jMenuItemDuplicarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas && this.isPermisoDuplicarVentasVentasNoCerradas));			
			this.jMenuItemCopiarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaCopiarVentasVentasNoCerradas && this.isPermisoCopiarVentasVentasNoCerradas));			
			this.jMenuItemVerFormVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaVerFormVentasVentasNoCerradas && this.isPermisoVerFormVentasVentasNoCerradas));			
			this.jMenuItemAbrirOrderByVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));			
			//this.jMenuItemMostrarOcultarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));
			this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));			
			//this.jMenuItemDetalleMostrarOcultarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaOrdenVentasVentasNoCerradas && this.isPermisoOrdenVentasVentasNoCerradas));			
			this.jMenuItemNuevoRelacionesVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas));			
			this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaNuevoVentasVentasNoCerradas && this.isPermisoNuevoVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));									
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemModificarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaModificarVentasVentasNoCerradas && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemActualizarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaActualizarVentasVentasNoCerradas && this.isPermisoActualizarVentasVentasNoCerradas));	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemEliminarVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaEliminarVentasVentasNoCerradas && this.isPermisoEliminarVentasVentasNoCerradas));
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemCancelarVentasVentasNoCerradas.setVisible(this.isVisibilidadCeldaCancelarVentasVentasNoCerradas);				
			}
			
			this.jMenuItemGuardarCambiosVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));						
			this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=this.jButtonNuevoVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas=this.jButtonDuplicarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaCopiarVentasVentasNoCerradas=this.jButtonCopiarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaVerFormVentasVentasNoCerradas=this.jButtonVerFormVentasVentasNoCerradas.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasVentasNoCerradas=this.jButtonAbrirOrderByVentasVentasNoCerradas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=this.jButtonNuevoRelacionesVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=this.jButtonModificarVentasVentasNoCerradas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=this.jButtonNuevoToolBarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarToolBarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarToolBarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarToolBarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarToolBarVentasVentasNoCerradas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=this.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=this.jMenuItemNuevoVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=this.jMenuItemNuevoRelacionesVentasVentasNoCerradas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemModificarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemActualizarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemEliminarVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemCancelarVentasVentasNoCerradas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=this.jMenuItemGuardarCambiosVentasVentasNoCerradas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasVentasNoCerradas(Boolean esInicializar) {
		if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
				//if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasVentasNoCerradas();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasVentasNoCerradas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasVentasNoCerradas() {
		this.jButtonNuevoVentasVentasNoCerradas.setVisible(this.isPermisoNuevoVentasVentasNoCerradas);			
		this.jButtonDuplicarVentasVentasNoCerradas.setVisible(this.isPermisoDuplicarVentasVentasNoCerradas);			
		this.jButtonCopiarVentasVentasNoCerradas.setVisible(this.isPermisoCopiarVentasVentasNoCerradas);			
		this.jButtonVerFormVentasVentasNoCerradas.setVisible(this.isPermisoVerFormVentasVentasNoCerradas);			
		
		this.jButtonAbrirOrderByVentasVentasNoCerradas.setVisible(this.isPermisoOrdenVentasVentasNoCerradas);					
		
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.setVisible(this.isPermisoNuevoVentasVentasNoCerradas);			
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarVentasVentasNoCerradas.setVisible(this.isPermisoActualizarVentasVentasNoCerradas);	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.setVisible(this.isPermisoActualizarVentasVentasNoCerradas);	
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.setVisible(this.isPermisoEliminarVentasVentasNoCerradas);
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.setVisible(this.isVisibilidadCeldaCancelarVentasVentasNoCerradas);						
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.setVisible(this.isPermisoGuardarCambiosVentasVentasNoCerradas);							
		}
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setVisible(this.isPermisoActualizarVentasVentasNoCerradas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasVentasNoCerradas() {
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarVentasVentasNoCerradas.setVisible(this.isPermisoActualizarVentasVentasNoCerradas);	
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.setVisible(this.isPermisoActualizarVentasVentasNoCerradas);	
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.setVisible(this.isPermisoEliminarVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.setVisible(this.isVisibilidadCeldaCancelarVentasVentasNoCerradas);							
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.setVisible((this.isVisibilidadCeldaGuardarVentasVentasNoCerradas && this.isPermisoGuardarCambiosVentasVentasNoCerradas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasVentasNoCerradas() {
		if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasVentasNoCerradas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasVentasNoCerradas() {
	}
	
	public void jTableDatosVentasVentasNoCerradasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasVentasNoCerradas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventasventasnocerradas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasVentasNoCerradasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasVentasNoCerradas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasVentasNoCerradas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventasventasnocerradasLogic.getConnexion());

				if(this.ventasventasnocerradas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventasventasnocerradas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasVentasNoCerradas=(TitledBorder)this.jScrollPanelDatosVentasVentasNoCerradas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasVentasNoCerradas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventasventasnocerradas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentasVentasNoCerradasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentasVentasNoCerradas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasVentasNoCerradas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasVentasNoCerradas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventasventasnocerradasLogic.getConnexion());

				if(this.ventasventasnocerradas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventasventasnocerradas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasVentasNoCerradas=(TitledBorder)this.jScrollPanelDatosVentasVentasNoCerradas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentasVentasNoCerradas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventasventasnocerradas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventasventasnocerradas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventasventasnocerradas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.ventasventasnocerradas.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.ventasventasnocerradas.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.ventasventasnocerradas.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.ventasventasnocerradas.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.ventasventasnocerradas.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.ventasventasnocerradas.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonefectivoVentasVentasNoCerradasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.getventasventasnocerradas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasventasnocerradas==null) {
						this.ventasventasnocerradas = new VentasVentasNoCerradas();
					}

					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);
				}

				if(this.ventasventasnocerradas.getefectivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where efectivo = "+this.ventasventasnocerradas.getefectivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasVentasNoCerradas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);

			this.getVentasVentasNoCerradassBusquedaVentasVentasNoCerradas();

			this.inicializarActualizarBindingVentasVentasNoCerradas(false);

			//if(VentasVentasNoCerradasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);

			this.getVentasVentasNoCerradassFK_IdEmpresa();

			this.inicializarActualizarBindingVentasVentasNoCerradas(false);

			//if(VentasVentasNoCerradasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentasVentasNoCerradasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);

			this.getVentasVentasNoCerradassFK_IdSucursal();

			this.inicializarActualizarBindingVentasVentasNoCerradas(false);

			//if(VentasVentasNoCerradasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasventasnocerradasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasVentasNoCerradas() {
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.dispose();
			this.jInternalFrameDetalleFormVentasVentasNoCerradas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
			this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.dispose();
			this.jInternalFrameReporteDinamicoVentasVentasNoCerradas=null;
		}
		
		if(this.jInternalFrameImportacionVentasVentasNoCerradas!=null) {
			this.jInternalFrameImportacionVentasVentasNoCerradas.setVisible(false);	    			
			this.jInternalFrameImportacionVentasVentasNoCerradas.dispose();
			this.jInternalFrameImportacionVentasVentasNoCerradas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasVentasNoCerradas();
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasVentasNoCerradas")) {
				jButtonDuplicarVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasVentasNoCerradas")) {
				jButtonCopiarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasVentasNoCerradas")) {
				jButtonVerFormVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasVentasNoCerradas")) {
				jButtonDuplicarVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasVentasNoCerradas")) {
				jButtonDuplicarVentasVentasNoCerradasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasVentasNoCerradas")) {
				jButtonModificarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasVentasNoCerradas")) {
				jButtonModificarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasVentasNoCerradas")) {
				jButtonModificarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasVentasNoCerradas")) {
				jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasVentasNoCerradas")) {
				jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasVentasNoCerradas")) {
				jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasVentasNoCerradas")) {
				jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasVentasNoCerradas")) {
				jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasVentasNoCerradas")) {
				jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasVentasNoCerradas")) {
				jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasVentasNoCerradas")) {
				jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasVentasNoCerradas")) {
				jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasVentasNoCerradas")) {
				jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasVentasNoCerradas")) {
				jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasVentasNoCerradas")) {
				jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasVentasNoCerradas")) {
				jButtonMostrarOcultarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasVentasNoCerradas")) {
				jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasVentasNoCerradas")) {
				jButtonCopiarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasVentasNoCerradas")) {
				jButtonVerFormVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasVentasNoCerradas")) {
				jButtonCopiarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasVentasNoCerradas")) {
				jButtonVerFormVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasVentasNoCerradas")) {
				jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasVentasNoCerradas")) {
				jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasVentasNoCerradas")) {
				jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasVentasNoCerradas")) {
				jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasVentasNoCerradas")) {
				jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasVentasNoCerradas")) {
				jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasVentasNoCerradas")) {
				jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasVentasNoCerradas")) {
				jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasVentasNoCerradas")) {
				jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasVentasNoCerradas") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasVentasNoCerradas")) {
				jButtonAbrirOrderByVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasVentasNoCerradas") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasVentasNoCerradas")) {
				jButtonMostrarOcultarVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasVentasNoCerradas")) {
				jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasVentasNoCerradas")) {
				jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasVentasNoCerradas")) {
				jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasVentasNoCerradas")) {
				jButtonCerrarReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasVentasNoCerradas")) {
				jButtonGenerarReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasVentasNoCerradas")) {
				
				jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasVentasNoCerradas")) {
				jButtonCerrarImportacionVentasVentasNoCerradasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasVentasNoCerradas")) {
				
				jButtonGenerarImportacionVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasVentasNoCerradas")) {
				
				jButtonAbrirImportacionVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasVentasNoCerradas")) {
				jComboBoxTiposAccionesVentasVentasNoCerradasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasVentasNoCerradas")) {
				jComboBoxTiposRelacionesVentasVentasNoCerradasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasVentasNoCerradas")) {
				jComboBoxTiposAccionesVentasVentasNoCerradasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasVentasNoCerradas")) {
				
				jComboBoxTiposSeleccionarVentasVentasNoCerradasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasVentasNoCerradas")) {
				jTextFieldValorCampoGeneralVentasVentasNoCerradasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasVentasNoCerradas")) {
				jButtonAbrirOrderByVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasVentasNoCerradas")) {
				jButtonAbrirOrderByVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasVentasNoCerradas")) {
				jButtonCerrarOrderByVentasVentasNoCerradasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasVentasNoCerradasBusqueda")) {
				this.jButtonidVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasVentasNoCerradasUpdate")) {
				this.jButtonid_empresaVentasVentasNoCerradasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasVentasNoCerradasBusqueda")) {
				this.jButtonid_empresaVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasVentasNoCerradasUpdate")) {
				this.jButtonid_sucursalVentasVentasNoCerradasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasVentasNoCerradasBusqueda")) {
				this.jButtonid_sucursalVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVentasVentasNoCerradasBusqueda")) {
				this.jButtoncodigoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnombre_completoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emisionVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnumero_documentoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasVentasNoCerradasBusqueda")) {
				this.jButtontotalVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("efectivoVentasVentasNoCerradasBusqueda")) {
				this.jButtonefectivoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasVentasNoCerradasVentasVentasNoCerradas")) {
				this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradasActionPerformed(evt);
			}
			
			;
			
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasVentasNoCerradas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasVentasNoCerradas ventasventasnocerradasLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventasventasnocerradasLocal=this.ventasventasnocerradas;
			} else {
				ventasventasnocerradasLocal=this.ventasventasnocerradasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
							
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
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
			
			


			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
								
						
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
								
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
							
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
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
			
			


			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
								
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasVentasNoCerradas")) {
					jCheckBoxSeleccionarTodosVentasVentasNoCerradasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasVentasNoCerradas")) {
					jCheckBoxSeleccionadosVentasVentasNoCerradasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasVentasNoCerradas")) {
					
				}
				
				


				
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
												
				
				


				
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
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
			
			


			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasventasnocerradas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasventasnocerradas);
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
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
				
				


				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasVentasNoCerradas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasVentasNoCerradas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasVentasNoCerradasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasventasnocerradasAnterior =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasVentasNoCerradas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasVentasNoCerradasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasVentasNoCerradas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventasventasnocerradas =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventasventasnocerradas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasVentasNoCerradas")) {
				
				}
				
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasVentasNoCerradas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasVentasNoCerradas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasVentasNoCerradas")) {
			
			}
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasVentasNoCerradas();
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			if(sTipo.equals("NuevoVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasVentasNoCerradas")) {
				jButtonDuplicarVentasVentasNoCerradasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasVentasNoCerradas")) {
				jButtonCopiarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasVentasNoCerradas")) {
				jButtonVerFormVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasVentasNoCerradas")) {
				jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasVentasNoCerradas")) {
				jButtonModificarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasVentasNoCerradas")) {
				jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasVentasNoCerradas")) {
				jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasVentasNoCerradas")) {
				jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasVentasNoCerradas")) {
				jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasVentasNoCerradas")) {
				jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasVentasNoCerradas")) {
				jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasVentasNoCerradas")) {
				jButtonAbrirOrderByVentasVentasNoCerradasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasVentasNoCerradas")) {
				jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasVentasNoCerradas")) {
				jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasVentasNoCerradas")) {
				jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasVentasNoCerradasBusqueda")) {
				this.jButtonidVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasVentasNoCerradasUpdate")) {
				this.jButtonid_empresaVentasVentasNoCerradasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasVentasNoCerradasBusqueda")) {
				this.jButtonid_empresaVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentasVentasNoCerradasUpdate")) {
				this.jButtonid_sucursalVentasVentasNoCerradasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentasVentasNoCerradasBusqueda")) {
				this.jButtonid_sucursalVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVentasVentasNoCerradasBusqueda")) {
				this.jButtoncodigoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnombre_completoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVentasVentasNoCerradasBusqueda")) {
				this.jButtonfecha_emisionVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoVentasVentasNoCerradasBusqueda")) {
				this.jButtonnumero_documentoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalVentasVentasNoCerradasBusqueda")) {
				this.jButtontotalVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("efectivoVentasVentasNoCerradasBusqueda")) {
				this.jButtonefectivoVentasVentasNoCerradasBusquedaActionPerformed(evt);
			}
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasVentasNoCerradas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasVentasNoCerradas")) {
				closingInternalFrameVentasVentasNoCerradas();
				
			} else if(sTipo.equals("jButtonCancelarVentasVentasNoCerradas")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasVentasNoCerradas = (JInternalFrameBase)evt.getSource();
	            	
	            VentasVentasNoCerradasBeanSwingJInternalFrame jInternalFrameParent=(VentasVentasNoCerradasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasVentasNoCerradas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasVentasNoCerradasActionPerformed(null);
			}
			
			VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasventasnocerradas,new Object(),this.ventasventasnocerradasParameterGeneral,this.ventasventasnocerradasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasVentasNoCerradas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasVentasNoCerradas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasVentasNoCerradas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventasventasnocerradas)) {
			if(!esControlTabla) {
				if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);			
				}
				
				if(this.ventasventasnocerradasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral,this.ventasventasnocerradasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventasventasnocerradasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasVentasNoCerradas(classes,this.ventasventasnocerradasReturnGeneral,this.ventasventasnocerradasBean,false);
					}
						
					if(this.ventasventasnocerradasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas());	
					}
						
					if(this.ventasventasnocerradasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas(),classes);//this.ventasventasnocerradasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasVentasNoCerradas(this.ventasventasnocerradas,classes);//this.ventasventasnocerradasBean);									
				}
			
				if(VentasVentasNoCerradasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasVentasNoCerradas(this.ventasventasnocerradas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasVentasNoCerradas(this.ventasventasnocerradas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventasventasnocerradasAnterior!=null) {
						this.ventasventasnocerradas=this.ventasventasnocerradasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventasventasnocerradasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas(),ventasventasnocerradasLogic.getVentasVentasNoCerradass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradas(),this.ventasventasnocerradass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasVentasNoCerradas.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasVentasNoCerradas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasVentasNoCerradas();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasVentasNoCerradas() throws Exception {
		
		VentasVentasNoCerradasModel ventasventasnocerradasModel=(VentasVentasNoCerradasModel)this.jTableDatosVentasVentasNoCerradas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasventasnocerradasModel.ventasventasnocerradass=this.ventasventasnocerradasLogic.getVentasVentasNoCerradass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventasventasnocerradasModel.ventasventasnocerradass=this.ventasventasnocerradass;
		}
		
		
		((VentasVentasNoCerradasModel) this.jTableDatosVentasVentasNoCerradas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasVentasNoCerradas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventasventasnocerradasAnterior(),this.ventasventasnocerradasLogic.getVentasVentasNoCerradass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventasventasnocerradasAnterior(),this.ventasventasnocerradass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasVentasNoCerradas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
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
										
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasventasnocerradas,new Object(),generalEntityParameterGeneral,this.ventasventasnocerradasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasVentasNoCerradasConstantesFunciones.getClassesRelationshipsOfVentasVentasNoCerradas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasVentasNoCerradasConstantesFunciones.getClassesRelationshipsFromStringsOfVentasVentasNoCerradas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasVentasNoCerradas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasventasnocerradas,new Object(),generalEntityParameterGeneral,this.ventasventasnocerradasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasVentasNoCerradas(VentasVentasNoCerradasBean ventasventasnocerradasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasVentasNoCerradas(ArrayList<Classe> classes,VentasVentasNoCerradasReturnGeneral ventasventasnocerradasReturnGeneral,VentasVentasNoCerradasBean ventasventasnocerradasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventasventasnocerradas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas = new VentasVentasNoCerradasDetalleFormJInternalFrame(jDesktopPane,this.ventasventasnocerradasSessionBean.getConGuardarRelaciones(),this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.setVisible(false);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.ventasventasnocerradasLogic=this.ventasventasnocerradasLogic;
		
		this.cargarCombosFrameForeignKeyVentasVentasNoCerradas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasVentasNoCerradas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasVentasNoCerradas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasVentasNoCerradas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasVentasNoCerradas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasVentasNoCerradas"));
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ModificarVentasVentasNoCerradas"));

		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasVentasNoCerradas"));
					
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemModificarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasVentasNoCerradas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"ActualizarVentasVentasNoCerradas"));
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasVentasNoCerradas"));
						
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemActualizarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasVentasNoCerradas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"EliminarVentasVentasNoCerradas"));
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasVentasNoCerradas"));
								
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemEliminarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasVentasNoCerradas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CancelarVentasVentasNoCerradas"));
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasVentasNoCerradas"));
					
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemCancelarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasVentasNoCerradas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemDetalleCerrarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasVentasNoCerradas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasVentasNoCerradas"));
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasVentasNoCerradas"));
		
		
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasVentasNoCerradas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonidVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtoncodigoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnombre_completoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtontotalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonefectivoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasVentasNoCerradasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasVentasNoCerradas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasVentasNoCerradas"));
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasVentasNoCerradas"));
		}
		
		this.jTableDatosVentasVentasNoCerradas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasVentasNoCerradas"));
		
		this.jTableDatosVentasVentasNoCerradas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasVentasNoCerradas"));
		
		this.jButtonNuevoVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"NuevoVentasVentasNoCerradas"));
		
		this.jButtonDuplicarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"DuplicarVentasVentasNoCerradas"));
		
		this.jButtonCopiarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"CopiarVentasVentasNoCerradas"));
		
		this.jButtonVerFormVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"VerFormVentasVentasNoCerradas"));
		
		
		this.jButtonNuevoToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasVentasNoCerradas"));
			
		this.jButtonDuplicarToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemNuevoVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasVentasNoCerradas"));
			
		this.jMenuItemDuplicarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasVentasNoCerradas"));		
		
		
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasVentasNoCerradas"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemNuevoRelacionesVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasVentasNoCerradas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ModificarVentasVentasNoCerradas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonModificarToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasVentasNoCerradas"));
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemModificarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasVentasNoCerradas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"ActualizarVentasVentasNoCerradas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonActualizarToolBarVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasVentasNoCerradas"));
				
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemActualizarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasVentasNoCerradas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"EliminarVentasVentasNoCerradas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonEliminarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasVentasNoCerradas"));
						
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemEliminarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasVentasNoCerradas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CancelarVentasVentasNoCerradas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonCancelarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasVentasNoCerradas"));
			
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemCancelarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasVentasNoCerradas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasVentasNoCerradas"));		
		
		
		this.jButtonCerrarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CerrarVentasVentasNoCerradas"));
		
		
		this.jButtonCerrarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemCerrarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasVentasNoCerradas"));
			
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jMenuItemDetalleCerrarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasVentasNoCerradas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasVentasNoCerradas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasVentasNoCerradas"));
		}
		
		this.jButtonCopiarToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasVentasNoCerradas"));
			
		this.jButtonVerFormToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasVentasNoCerradas"));
		
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasVentasNoCerradas"));
			
		this.jMenuItemCopiarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasVentasNoCerradas"));		
		
		this.jMenuItemVerFormVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasVentasNoCerradas"));		
		
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasVentasNoCerradas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasVentasNoCerradas"));		
		
		
		
		this.jButtonRecargarInformacionVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasVentasNoCerradas"));
					
		this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasVentasNoCerradas"));
		
		this.jMenuItemRecargarInformacionVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasVentasNoCerradas"));		
		
		
		
		this.jButtonAnterioresVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"AnterioresVentasVentasNoCerradas"));
		
		
		this.jButtonAnterioresToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasVentasNoCerradas"));
		
		this.jMenuItemAnterioresVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasVentasNoCerradas"));		
		
		
		this.jButtonSiguientesVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"SiguientesVentasVentasNoCerradas"));
		
		
		this.jButtonSiguientesToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemSiguientesVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasVentasNoCerradas"));
			
		this.jMenuItemAbrirOrderByVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasVentasNoCerradas"));
			
		this.jMenuItemMostrarOcultarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasVentasNoCerradas"));
			
		this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasVentasNoCerradas"));
			
		this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasVentasNoCerradas"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasVentasNoCerradas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasVentasNoCerradas"));
			
		this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasVentasNoCerradas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasVentasNoCerradas"));

		this.jCheckBoxSeleccionadosVentasVentasNoCerradas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasVentasNoCerradas"));
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasVentasNoCerradas"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasVentasNoCerradas"));
			
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasVentasNoCerradas"));
					
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasVentasNoCerradas"));
			
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasVentasNoCerradas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonidVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtoncodigoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnombre_completoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtontotalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonefectivoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasVentasNoCerradasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"BusquedaVentasVentasNoCerradasVentasVentasNoCerradas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasVentasNoCerradas!=null) {
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasVentasNoCerradas"));
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasVentasNoCerradas"));
				this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasVentasNoCerradas"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasVentasNoCerradas"));				
			//this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasVentasNoCerradas"));
			//this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasVentasNoCerradas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasVentasNoCerradas!=null) {
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasVentasNoCerradas"));
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasVentasNoCerradas"));
				this.jInternalFrameImportacionVentasVentasNoCerradas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasVentasNoCerradas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasVentasNoCerradas"));
			
			this.jButtonAbrirOrderByToolBarVentasVentasNoCerradas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasVentasNoCerradas"));			
			
			if(this.jInternalFrameOrderByVentasVentasNoCerradas!=null) {
				this.jInternalFrameOrderByVentasVentasNoCerradas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasVentasNoCerradas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTabbedPaneRelacionesVentasVentasNoCerradas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasVentasNoCerradas"));
		
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
            		closingInternalFrameVentasVentasNoCerradas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasVentasNoCerradas = (JInternalFrameBase)event.getSource();
	            	
	            VentasVentasNoCerradasBeanSwingJInternalFrame jInternalFrameParent=(VentasVentasNoCerradasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasVentasNoCerradas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasVentasNoCerradasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasVentasNoCerradas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasVentasNoCerradasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasVentasNoCerradas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasVentasNoCerradas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoRelacionesVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasVentasNoCerradasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasVentasNoCerradas";
		inputMap = this.jButtonModificarVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasVentasNoCerradas";
		inputMap = this.jButtonActualizarVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasVentasNoCerradas";
		inputMap = this.jButtonEliminarVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasVentasNoCerradas";
		inputMap = this.jButtonCancelarVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasVentasNoCerradas";
		inputMap = this.jButtonCerrarVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasVentasNoCerradas";
		inputMap = this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonGuardarCambiosVentasVentasNoCerradas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasVentasNoCerradasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasVentasNoCerradas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasVentasNoCerradasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasVentasNoCerradasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasVentasNoCerradasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonidVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_empresaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasVentasNoCerradasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonid_sucursalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtoncodigoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"codigoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnombre_completoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtontotalVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"totalVentasVentasNoCerradasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jButtonefectivoVentasVentasNoCerradasBusqueda.addActionListener(new ButtonActionListener(this,"efectivoVentasVentasNoCerradasBusqueda"));
		
		
		this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.addActionListener(new ButtonActionListener(this,"BusquedaVentasVentasNoCerradasVentasVentasNoCerradas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasVentasNoCerradas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasVentasNoCerradasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasVentasNoCerradasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasVentasNoCerradas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
					ventasventasnocerradasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradass) {
					ventasventasnocerradasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasVentasNoCerradasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
						ventasventasnocerradasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradass) {
						ventasventasnocerradasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasVentasNoCerradas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasVentasNoCerradas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasVentasNoCerradasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasVentasNoCerradas.getSelectedRows();
			
			VentasVentasNoCerradas ventasventasnocerradasLocal=new VentasVentasNoCerradas();
			
			//this.seleccionarTodosVentasVentasNoCerradas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventasventasnocerradasLocal =(VentasVentasNoCerradas) this.ventasventasnocerradasLogic.getVentasVentasNoCerradass().toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventasventasnocerradasLocal =(VentasVentasNoCerradas) this.ventasventasnocerradass.toArray()[this.jTableDatosVentasVentasNoCerradas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventasventasnocerradasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
						ventasventasnocerradasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradass) {
						ventasventasnocerradasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasVentasNoCerradas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasVentasNoCerradas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasVentasNoCerradas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasVentasNoCerradasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasVentasNoCerradasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasVentasNoCerradasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
				
						if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ventasventasnocerradasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasventasnocerradasAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventasventasnocerradasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							ventasventasnocerradasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventasventasnocerradasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO)) {
							existe=true;
							ventasventasnocerradasAux.setefectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradass) {
					
						if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ventasventasnocerradasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							ventasventasnocerradasAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							ventasventasnocerradasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ventasventasnocerradasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							ventasventasnocerradasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							ventasventasnocerradasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO)) {
							existe=true;
							ventasventasnocerradasAux.setefectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasVentasNoCerradasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasVentasNoCerradas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasVentasNoCerradas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasVentasNoCerradas) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasVentasNoCerradas(conSplash);
				
					this.generarReporteVentasVentasNoCerradassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasVentasNoCerradassSeleccionados();
				//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasVentasNoCerradassSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasVentasNoCerradassSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasVentasNoCerradas();
				
				this.exportarVentasVentasNoCerradassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasVentasNoCerradass();
				//this.importarVentasVentasNoCerradass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasVentasNoCerradas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasVentasNoCerradassSeleccionados();
				//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Ventas No Cerradas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasVentasNoCerradas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasVentasNoCerradas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasVentasNoCerradas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasVentasNoCerradasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasVentasNoCerradas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasVentasNoCerradas(conSplash);
					
						//this.actualizarParametrosGeneralVentasVentasNoCerradas();
						
						this.generarReporteProcesoAccionVentasVentasNoCerradassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas Ventas No CerradasES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Ventas No Cerradas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasVentasNoCerradas();
				
						this.actualizarParametrosGeneralVentasVentasNoCerradas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventasventasnocerradasReturnGeneral=ventasventasnocerradasLogic.procesarAccionVentasVentasNoCerradassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventasventasnocerradasLogic.getVentasVentasNoCerradass(),this.ventasventasnocerradasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasVentasNoCerradasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasVentasNoCerradas();
					
					VentasVentasNoCerradasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasVentasNoCerradasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasVentasNoCerradas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasVentasNoCerradas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasVentasNoCerradasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasVentasNoCerradas();
			
			if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
			VentasVentasNoCerradas ventasventasnocerradas=new VentasVentasNoCerradas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasVentasNoCerradas.getSelectedItem();
			
			
			
			
			ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventasventasnocerradassSeleccionados.size()==1) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
					ventasventasnocerradas=ventasventasnocerradasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasVentasNoCerradas();
			
      		//this.finishProcessVentasVentasNoCerradas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasVentasNoCerradasReturnGeneral() throws Exception {
		if(this.ventasventasnocerradasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventasventasnocerradasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventasventasnocerradasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventasventasnocerradasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventasventasnocerradasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventasventasnocerradasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
		}
		
		if(this.ventasventasnocerradasReturnGeneral.getConRetornoLista() || this.ventasventasnocerradasReturnGeneral.getConRetornoObjeto()) {
			if(this.ventasventasnocerradasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventasventasnocerradasLogic.setVentasVentasNoCerradass(this.ventasventasnocerradasReturnGeneral.getVentasVentasNoCerradass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasVentasNoCerradas(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasVentasNoCerradas() throws Exception {
		
		
	}
	
	public ArrayList<VentasVentasNoCerradas> getVentasVentasNoCerradassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasVentasNoCerradas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradasLogic.getVentasVentasNoCerradass()) {
					if(ventasventasnocerradasAux.getIsSelected()) {
						ventasventasnocerradassSeleccionados.add(ventasventasnocerradasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasVentasNoCerradas ventasventasnocerradasAux:this.ventasventasnocerradass) {
					if(ventasventasnocerradasAux.getIsSelected()) {
						ventasventasnocerradassSeleccionados.add(ventasventasnocerradasAux);				
					}
				}
			}
			
			if(ventasventasnocerradassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventasventasnocerradassSeleccionados.addAll(this.ventasventasnocerradasLogic.getVentasVentasNoCerradass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventasventasnocerradassSeleccionados.addAll(this.ventasventasnocerradass);				
					}
				}
			}
		} else {
			ventasventasnocerradassSeleccionados.add(this.ventasventasnocerradas);
		}
		
		return ventasventasnocerradassSeleccionados;
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
	
	public void generarReporteVentasVentasNoCerradassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasVentasNoCerradassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasVentasNoCerradassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasVentasNoCerradassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasVentasNoCerradassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Ventas No Cerradas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasVentasNoCerradassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasVentasNoCerradas();
		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasVentasNoCerradas();
		
		
		//this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados ,ventasventasnocerradasImplementable,ventasventasnocerradasImplementableHome);
	}
	
	public void mostrarImportacionVentasVentasNoCerradass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasVentasNoCerradas();
		
		this.abrirFrameImportacionVentasVentasNoCerradas();		
		
			
		//this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados ,ventasventasnocerradasImplementable,ventasventasnocerradasImplementableHome);
	}
	
	public void importarVentasVentasNoCerradass() throws Exception {		
	
	}
	
	public void exportarVentasVentasNoCerradassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasVentasNoCerradassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasVentasNoCerradassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasVentasNoCerradassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Ventas No Cerradas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasVentasNoCerradas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasVentasNoCerradas(ventasventasnocerradasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventasventasnocerradasAux.setsDetalleGeneralEntityReporte(ventasventasnocerradasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasVentasNoCerradas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventasventasnocerradas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasventasnocerradas.getefectivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasVentasNoCerradass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasVentasNoCerradas(row);				
				iRow++;
			}				
			
			for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasVentasNoCerradas(ventasventasnocerradasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasVentasNoCerradassSeleccionados() throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();		
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasventasnocerradas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventasventasnocerradass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventasventasnocerradas");
			//elementRoot.appendChild(element);
		
			for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
				element = document.createElement("ventasventasnocerradas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasVentasNoCerradas(ventasventasnocerradasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Ventas No Cerradas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasVentasNoCerradas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasventasnocerradas.getefectivo());				
	}
	
	public void setFilaDatosExportarXmlVentasVentasNoCerradas(VentasVentasNoCerradas ventasventasnocerradas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasVentasNoCerradasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventasventasnocerradas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasVentasNoCerradasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventasventasnocerradas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasVentasNoCerradasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventasventasnocerradas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentasVentasNoCerradasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventasventasnocerradas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasVentasNoCerradasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventasventasnocerradas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasVentasNoCerradasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventasventasnocerradas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(VentasVentasNoCerradasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(ventasventasnocerradas.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(VentasVentasNoCerradasConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(ventasventasnocerradas.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementfecha_emision = document.createElement(VentasVentasNoCerradasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(ventasventasnocerradas.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_pre_impreso = document.createElement(VentasVentasNoCerradasConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(ventasventasnocerradas.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementnumero_documento = document.createElement(VentasVentasNoCerradasConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(ventasventasnocerradas.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementtotal = document.createElement(VentasVentasNoCerradasConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(ventasventasnocerradas.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementefectivo = document.createElement(VentasVentasNoCerradasConstantesFunciones.EFECTIVO);
		elementefectivo.appendChild(document.createTextNode(ventasventasnocerradas.getefectivo().toString().trim()));
		element.appendChild(elementefectivo);
	}
	
	public void generarReporteGroupGenericoVentasVentasNoCerradassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados=new ArrayList<VentasVentasNoCerradas>();
		
		ventasventasnocerradassSeleccionados=this.getVentasVentasNoCerradassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasVentasNoCerradas(ventasventasnocerradassSeleccionados);
		
		this.generarReporteVentasVentasNoCerradass("Todos",ventasventasnocerradassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasVentasNoCerradas(ArrayList<VentasVentasNoCerradas> ventasventasnocerradassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasVentasNoCerradas ventasventasnocerradasAux:ventasventasnocerradassSeleccionados) {
				ventasventasnocerradasAux.setsDetalleGeneralEntityReporte(ventasventasnocerradasAux.toString());
			
				if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasventasnocerradasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasventasnocerradasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasventasnocerradasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					ventasventasnocerradasAux.setsDescripcionGeneralEntityReporte1(ventasventasnocerradasAux.getnumero_documento());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasVentasNoCerradasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasVentasNoCerradas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=true;
				this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=true;
			}
			
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaModificarVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=true;
		} else {
			this.actualizarEstadoPanelsVentasVentasNoCerradas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasVentasNoCerradas=false;
			//this.isVisibilidadCeldaVerFormVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaDuplicarVentasVentasNoCerradas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			if(!ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;												
			}
			
			this.jButtonCerrarVentasVentasNoCerradas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
		}
		
		if(!this.permiteMantenimiento(this.ventasventasnocerradas)) {
			this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
			this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasVentasNoCerradas=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasVentasNoCerradas=false;
		this.isVisibilidadCeldaGuardarCambiosVentasVentasNoCerradas=false;
		//this.isVisibilidadCeldaModificarVentasVentasNoCerradas=true;
		this.isVisibilidadCeldaActualizarVentasVentasNoCerradas=false;
		this.isVisibilidadCeldaEliminarVentasVentasNoCerradas=false;
		//this.isVisibilidadCeldaCancelarVentasVentasNoCerradas=true;			
		this.isVisibilidadCeldaGuardarVentasVentasNoCerradas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasVentasNoCerradas() {
	}
	
	public void actualizarEstadoPanelsVentasVentasNoCerradas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasVentasNoCerradas!=null) {
				this.jScrollPanelDatosVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasVentasNoCerradas!=null) {
				this.jPanelPaginacionVentasVentasNoCerradas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
					this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasVentasNoCerradas!=null) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasVentasNoCerradas!=null) {
				this.jPanelParametrosReportesVentasVentasNoCerradas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasVentasNoCerradas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasVentasNoCerradas) {this.jTabbedPaneBusquedasVentasVentasNoCerradas.remove(jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentasVentasNoCerradas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentasVentasNoCerradas) {this.jTabbedPaneBusquedasVentasVentasNoCerradas.remove(jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);}
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
			
			this.inicializarActualizarBindingTablaVentasVentasNoCerradas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasVentasNoCerradas() {
		this.updateBorderResaltarBusquedasFormularioVentasVentasNoCerradas();
		this.updateVisibilidadBusquedasFormularioVentasVentasNoCerradas();
		this.updateHabilitarBusquedasFormularioVentasVentasNoCerradas();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasVentasNoCerradas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponents().length>0) {
	

		if(this.ventasventasnocerradasConstantesFunciones.resaltarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas!=null) {
			index= this.jTabbedPaneBusquedasVentasVentasNoCerradas.indexOfComponent(this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponent(index);
				jPanel.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasVentasNoCerradas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasVentasNoCerradas.indexOfComponent(this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			if(!this.ventasventasnocerradasConstantesFunciones.mostrarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas && index>-1) {
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasVentasNoCerradas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasVentasNoCerradas.indexOfComponent(this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
				this.jTabbedPaneBusquedasVentasVentasNoCerradas.setEnabledAt(index,this.ventasventasnocerradasConstantesFunciones.activarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasVentasNoCerradas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasVentasNoCerradas")) {
			index= this.jTabbedPaneBusquedasVentasVentasNoCerradas.indexOfComponent(this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);

			this.jTabbedPaneBusquedasVentasVentasNoCerradas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasVentasNoCerradas.getComponent(index);

			this.ventasventasnocerradasConstantesFunciones.setResaltarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas(resaltar);

			jPanel.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasVentasNoCerradas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasVentasNoCerradas() throws Exception {

		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasVentasNoCerradas();
		this.updateVisibilidadResaltarControlesFormularioVentasVentasNoCerradas();
		this.updateHabilitarResaltarControlesFormularioVentasVentasNoCerradas();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasVentasNoCerradas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventasventasnocerradasConstantesFunciones.resaltaridVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltaridVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarid_empresaVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarid_empresaVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarid_sucursalVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarid_sucursalVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emision_desdeVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emision_desdeVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emision_hastaVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emision_hastaVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarcodigoVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarcodigoVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarnombre_completoVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarnombre_completoVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emisionVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarfecha_emisionVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_pre_impresoVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_pre_impresoVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_documentoVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarnumero_documentoVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltartotalVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltartotalVentasVentasNoCerradas);}
		if(this.ventasventasnocerradasConstantesFunciones.resaltarefectivoVentasVentasNoCerradas!=null && this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setBorder(this.ventasventasnocerradasConstantesFunciones.resaltarefectivoVentasVentasNoCerradas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasVentasNoCerradas() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
	
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostraridVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelidVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostraridVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarid_empresaVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelid_empresaVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarid_empresaVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarid_sucursalVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelid_sucursalVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarid_sucursalVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emision_desdeVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelfecha_emision_desdeVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emision_desdeVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emision_hastaVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelfecha_emision_hastaVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emision_hastaVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarcodigoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelcodigoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarcodigoVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnombre_completoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelnombre_completoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnombre_completoVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emisionVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelfecha_emisionVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarfecha_emisionVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_pre_impresoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelnumero_pre_impresoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_pre_impresoVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_documentoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelnumero_documentoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarnumero_documentoVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrartotalVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPaneltotalVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrartotalVentasVentasNoCerradas);
		//this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarefectivoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jPanelefectivoVentasVentasNoCerradas.setVisible(this.ventasventasnocerradasConstantesFunciones.mostrarefectivoVentasVentasNoCerradas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasVentasNoCerradas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasVentasNoCerradas!=null) {
	
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jLabelidVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activaridVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_empresaVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarid_empresaVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jComboBoxid_sucursalVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarid_sucursalVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarfecha_emision_desdeVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarfecha_emision_hastaVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldcodigoVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarcodigoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextAreanombre_completoVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarnombre_completoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jDateChooserfecha_emisionVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarfecha_emisionVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarnumero_pre_impresoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldnumero_documentoVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarnumero_documentoVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldtotalVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activartotalVentasVentasNoCerradas);
		this.jInternalFrameDetalleFormVentasVentasNoCerradas.jTextFieldefectivoVentasVentasNoCerradas.setEnabled(this.ventasventasnocerradasConstantesFunciones.activarefectivoVentasVentasNoCerradas);
		}
	}
	
		
}