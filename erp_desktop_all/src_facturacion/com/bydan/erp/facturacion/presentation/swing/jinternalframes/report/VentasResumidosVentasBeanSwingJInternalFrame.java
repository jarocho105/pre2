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

//import com.bydan.erp.facturacion.util.VentasResumidosVentasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasResumidosVentasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasResumidosVentasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasResumidosVentasBean;
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
public class VentasResumidosVentasBeanSwingJInternalFrame extends VentasResumidosVentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasResumidosVentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasResumidosVentas> ventasresumidosventasValidator = new ClassValidator<VentasResumidosVentas>(VentasResumidosVentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasResumidosVentas ventasresumidosventas;	
	public VentasResumidosVentas ventasresumidosventasAux;
	public VentasResumidosVentas ventasresumidosventasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasResumidosVentas ventasresumidosventasTotales;
	public Long idVentasResumidosVentasActual;
	public Long iIdNuevoVentasResumidosVentas=0L;
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
	
	public Boolean isPermisoTodoVentasResumidosVentas;
	public Boolean isPermisoNuevoVentasResumidosVentas;
	public Boolean isPermisoActualizarVentasResumidosVentas;
	public Boolean isPermisoActualizarOriginalVentasResumidosVentas;
	public Boolean isPermisoEliminarVentasResumidosVentas;
	public Boolean isPermisoGuardarCambiosVentasResumidosVentas;
	public Boolean isPermisoConsultaVentasResumidosVentas;
	public Boolean isPermisoBusquedaVentasResumidosVentas;
	public Boolean isPermisoReporteVentasResumidosVentas;
	public Boolean isPermisoPaginacionMedioVentasResumidosVentas;
	public Boolean isPermisoPaginacionAltoVentasResumidosVentas;
	public Boolean isPermisoPaginacionTodoVentasResumidosVentas;
	public Boolean isPermisoCopiarVentasResumidosVentas;
	public Boolean isPermisoVerFormVentasResumidosVentas;
	public Boolean isPermisoDuplicarVentasResumidosVentas;
	public Boolean isPermisoOrdenVentasResumidosVentas;
	
	
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
	
	public VentasResumidosVentasParameterReturnGeneral ventasresumidosventasReturnGeneral;
	public VentasResumidosVentasParameterReturnGeneral ventasresumidosventasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasResumidosVentas=false;
	public Boolean esParaAccionDesdeFormularioVentasResumidosVentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasResumidosVentasSessionBeanAdditional ventasresumidosventasSessionBeanAdditional=null;
	
	public VentasResumidosVentasSessionBeanAdditional getVentasResumidosVentasSessionBeanAdditional() {
		return this.ventasresumidosventasSessionBeanAdditional;
	}
	
	public void setVentasResumidosVentasSessionBeanAdditional(VentasResumidosVentasSessionBeanAdditional ventasresumidosventasSessionBeanAdditional) {
		try {
			this.ventasresumidosventasSessionBeanAdditional=ventasresumidosventasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasResumidosVentasBeanSwingJInternalFrameAdditional ventasresumidosventasBeanSwingJInternalFrameAdditional=null;
	//public class VentasResumidosVentasBeanSwingJInternalFrame
	
	public VentasResumidosVentasBeanSwingJInternalFrameAdditional getVentasResumidosVentasBeanSwingJInternalFrameAdditional() {
		return this.ventasresumidosventasBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasResumidosVentasBeanSwingJInternalFrameAdditional(VentasResumidosVentasBeanSwingJInternalFrameAdditional ventasresumidosventasBeanSwingJInternalFrameAdditional) {
		try {
			this.ventasresumidosventasBeanSwingJInternalFrameAdditional=ventasresumidosventasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasResumidosVentasLogic ventasresumidosventasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasResumidosVentas ventasresumidosventasBean;
	public VentasResumidosVentasConstantesFunciones ventasresumidosventasConstantesFunciones;
	//public VentasResumidosVentasParameterReturnGeneral ventasresumidosventasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<VentasResumidosVentas> ventasresumidosventass;	
	//public List<VentasResumidosVentas> ventasresumidosventassEliminados;
	//public List<VentasResumidosVentas> ventasresumidosventassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaDuplicarVentasResumidosVentas=true;
	public Boolean isVisibilidadCeldaCopiarVentasResumidosVentas=true;
	public Boolean isVisibilidadCeldaVerFormVentasResumidosVentas=true;
	public Boolean isVisibilidadCeldaOrdenVentasResumidosVentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaModificarVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaActualizarVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaEliminarVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaCancelarVentasResumidosVentas=false;
	public Boolean isVisibilidadCeldaGuardarVentasResumidosVentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasResumidosVentas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVentasResumidosVentas() {
		return this.iIdNuevoVentasResumidosVentas;
	}

	public void setiIdNuevoVentasResumidosVentas(Long iIdNuevoVentasResumidosVentas) {
		this.iIdNuevoVentasResumidosVentas = iIdNuevoVentasResumidosVentas;
	}
	
	public Long getidVentasResumidosVentasActual() {
		return this.idVentasResumidosVentasActual;
	}

	public void setidVentasResumidosVentasActual(Long idVentasResumidosVentasActual) {
		this.idVentasResumidosVentasActual = idVentasResumidosVentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasResumidosVentas getventasresumidosventas() {
		return this.ventasresumidosventas;
	}

	public void setventasresumidosventas(VentasResumidosVentas ventasresumidosventas) {
		this.ventasresumidosventas = ventasresumidosventas;
	}
	
	public VentasResumidosVentas getventasresumidosventasAux() {
		return this.ventasresumidosventasAux;
	}

	public void setventasresumidosventasAux(VentasResumidosVentas ventasresumidosventasAux) {
		this.ventasresumidosventasAux = ventasresumidosventasAux;
	}				
	
	public VentasResumidosVentas getventasresumidosventasAnterior() {
		return this.ventasresumidosventasAnterior;
	}

	public void setventasresumidosventasAnterior(VentasResumidosVentas ventasresumidosventasAnterior) {
		this.ventasresumidosventasAnterior = ventasresumidosventasAnterior;
	}	
	
	public VentasResumidosVentas getventasresumidosventasTotales() {
		return this.ventasresumidosventasTotales;
	}

	public void setventasresumidosventasTotales(VentasResumidosVentas ventasresumidosventasTotales) {
		this.ventasresumidosventasTotales = ventasresumidosventasTotales;
	}	
	
	public VentasResumidosVentas getventasresumidosventasBean() {
		return this.ventasresumidosventasBean;
	}

	public void setventasresumidosventasBean(VentasResumidosVentas ventasresumidosventasBean) {
		this.ventasresumidosventasBean = ventasresumidosventasBean;
	}	
	
	public VentasResumidosVentasParameterReturnGeneral getventasresumidosventasReturnGeneral() {
		return this.ventasresumidosventasReturnGeneral;
	}

	public void setventasresumidosventasReturnGeneral(VentasResumidosVentasParameterReturnGeneral ventasresumidosventasReturnGeneral) {
		this.ventasresumidosventasReturnGeneral = ventasresumidosventasReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaVentasResumidosVentas=new Date();

	public Date getfecha_emision_desdeBusquedaVentasResumidosVentas() {
		return this.fecha_emision_desdeBusquedaVentasResumidosVentas;
	}

	public void setfecha_emision_desdeBusquedaVentasResumidosVentas(Date fecha_emision_desdeBusquedaVentasResumidosVentas) {
		this.fecha_emision_desdeBusquedaVentasResumidosVentas = fecha_emision_desdeBusquedaVentasResumidosVentas;
	}

;
	public Date fecha_emision_hastaBusquedaVentasResumidosVentas=new Date();

	public Date getfecha_emision_hastaBusquedaVentasResumidosVentas() {
		return this.fecha_emision_hastaBusquedaVentasResumidosVentas;
	}

	public void setfecha_emision_hastaBusquedaVentasResumidosVentas(Date fecha_emision_hastaBusquedaVentasResumidosVentas) {
		this.fecha_emision_hastaBusquedaVentasResumidosVentas = fecha_emision_hastaBusquedaVentasResumidosVentas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentasResumidosVentasLogic getVentasResumidosVentasLogic()	{		
		return ventasresumidosventasLogic;
	}

	public void setVentasResumidosVentasLogic(VentasResumidosVentasLogic ventasresumidosventasLogic) {
		this.ventasresumidosventasLogic = ventasresumidosventasLogic;
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
	
	public Boolean getIsEsNuevoVentasResumidosVentas() {
		return isEsNuevoVentasResumidosVentas;
	}

	public void setIsEsNuevoVentasResumidosVentas(Boolean isEsNuevoVentasResumidosVentas) {
		this.isEsNuevoVentasResumidosVentas = isEsNuevoVentasResumidosVentas;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasResumidosVentas() {
		return esParaAccionDesdeFormularioVentasResumidosVentas;
	}
	
	public void setEsParaAccionDesdeFormularioVentasResumidosVentas(Boolean esParaAccionDesdeFormularioVentasResumidosVentas) {
		this.esParaAccionDesdeFormularioVentasResumidosVentas = esParaAccionDesdeFormularioVentasResumidosVentas;
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

			if(this.ventasresumidosventasSessionBean==null) {
				this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
			}

			if(!this.ventasresumidosventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventasresumidosventasSessionBean.getlidEmpresaActual());
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

					if(this.ventasresumidosventas!=null) {
						this.ventasresumidosventas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
						this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasResumidosVentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
						if(this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasResumidosVentasGenerico)throws Exception
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
				jComboBoxid_empresaVentasResumidosVentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasResumidosVentasGenerico!=null && jComboBoxid_empresaVentasResumidosVentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasResumidosVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasResumidosVentas ventasresumidosventas,JComboBox jComboBoxid_empresaVentasResumidosVentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasResumidosVentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasResumidosVentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventasresumidosventas.setid_empresa(empresaAux.getId());
				ventasresumidosventas.setempresa_descripcion(VentasResumidosVentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventasresumidosventas.setEmpresa(empresaAux);			}
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

					if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { 
							this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { 
					}

					if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
							this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
							this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentasResumidosVentas() throws Exception {
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
		
	public VentasResumidosVentasParameterReturnGeneral getVentasResumidosVentasParameterGeneral() {
		return this.ventasresumidosventasParameterGeneral;
	}
	
	public void setVentasResumidosVentasParameterGeneral(VentasResumidosVentasParameterReturnGeneral ventasresumidosventasParameterGeneral) {
		this.ventasresumidosventasParameterGeneral = ventasresumidosventasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasResumidosVentas() {
		return isPermisoTodoVentasResumidosVentas;
	}

	public void setIsPermisoTodoVentasResumidosVentas(Boolean isPermisoTodoVentasResumidosVentas) {
		this.isPermisoTodoVentasResumidosVentas = isPermisoTodoVentasResumidosVentas;
	}

	public Boolean getIsPermisoNuevoVentasResumidosVentas() {
		return isPermisoNuevoVentasResumidosVentas;
	}

	public void setIsPermisoNuevoVentasResumidosVentas(Boolean isPermisoNuevoVentasResumidosVentas) {
		this.isPermisoNuevoVentasResumidosVentas = isPermisoNuevoVentasResumidosVentas;
	}

	public Boolean getIsPermisoActualizarVentasResumidosVentas() {
		return isPermisoActualizarVentasResumidosVentas;
	}

	public void setIsPermisoActualizarVentasResumidosVentas(Boolean isPermisoActualizarVentasResumidosVentas) {
		this.isPermisoActualizarVentasResumidosVentas = isPermisoActualizarVentasResumidosVentas;
	}

	public Boolean getIsPermisoEliminarVentasResumidosVentas() {
		return isPermisoEliminarVentasResumidosVentas;
	}

	public void setIsPermisoEliminarVentasResumidosVentas(Boolean isPermisoEliminarVentasResumidosVentas) {
		this.isPermisoEliminarVentasResumidosVentas = isPermisoEliminarVentasResumidosVentas;
	}

	public Boolean getIsPermisoGuardarCambiosVentasResumidosVentas() {
		return isPermisoGuardarCambiosVentasResumidosVentas;
	}

	public void setIsPermisoGuardarCambiosVentasResumidosVentas(Boolean isPermisoGuardarCambiosVentasResumidosVentas) {
		this.isPermisoGuardarCambiosVentasResumidosVentas = isPermisoGuardarCambiosVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoConsultaVentasResumidosVentas() {
		return isPermisoConsultaVentasResumidosVentas;
	}

	public void setIsPermisoConsultaVentasResumidosVentas(Boolean isPermisoConsultaVentasResumidosVentas) {
		this.isPermisoConsultaVentasResumidosVentas = isPermisoConsultaVentasResumidosVentas;
	}

	public Boolean getIsPermisoBusquedaVentasResumidosVentas() {
		return isPermisoBusquedaVentasResumidosVentas;
	}

	public void setIsPermisoBusquedaVentasResumidosVentas(Boolean isPermisoBusquedaVentasResumidosVentas) {
		this.isPermisoBusquedaVentasResumidosVentas = isPermisoBusquedaVentasResumidosVentas;
	}

	public Boolean getIsPermisoReporteVentasResumidosVentas() {
		return isPermisoReporteVentasResumidosVentas;
	}

	public void setIsPermisoReporteVentasResumidosVentas(Boolean isPermisoReporteVentasResumidosVentas) {
		this.isPermisoReporteVentasResumidosVentas = isPermisoReporteVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasResumidosVentas() {
		return isPermisoPaginacionMedioVentasResumidosVentas;
	}

	public void setIsPermisoPaginacionMedioVentasResumidosVentas(Boolean isPermisoPaginacionMedioVentasResumidosVentas) {
		this.isPermisoPaginacionMedioVentasResumidosVentas = isPermisoPaginacionMedioVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasResumidosVentas() {
		return isPermisoPaginacionTodoVentasResumidosVentas;
	}

	public void setIsPermisoPaginacionTodoVentasResumidosVentas(Boolean isPermisoPaginacionTodoVentasResumidosVentas) {
		this.isPermisoPaginacionTodoVentasResumidosVentas = isPermisoPaginacionTodoVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasResumidosVentas() {
		return isPermisoPaginacionAltoVentasResumidosVentas;
	}

	public void setIsPermisoPaginacionAltoVentasResumidosVentas(Boolean isPermisoPaginacionAltoVentasResumidosVentas) {
		this.isPermisoPaginacionAltoVentasResumidosVentas = isPermisoPaginacionAltoVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoCopiarVentasResumidosVentas() {
		return isPermisoCopiarVentasResumidosVentas;
	}

	public void setIsPermisoCopiarVentasResumidosVentas(Boolean isPermisoCopiarVentasResumidosVentas) {
		this.isPermisoCopiarVentasResumidosVentas = isPermisoCopiarVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoVerFormVentasResumidosVentas() {
		return isPermisoVerFormVentasResumidosVentas;
	}

	public void setIsPermisoVerFormVentasResumidosVentas(Boolean isPermisoVerFormVentasResumidosVentas) {
		this.isPermisoVerFormVentasResumidosVentas = isPermisoVerFormVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoDuplicarVentasResumidosVentas() {
		return isPermisoDuplicarVentasResumidosVentas;
	}

	public void setIsPermisoDuplicarVentasResumidosVentas(Boolean isPermisoDuplicarVentasResumidosVentas) {
		this.isPermisoDuplicarVentasResumidosVentas = isPermisoDuplicarVentasResumidosVentas;
	}
	
	public Boolean getIsPermisoOrdenVentasResumidosVentas() {
		return isPermisoOrdenVentasResumidosVentas;
	}

	public void setIsPermisoOrdenVentasResumidosVentas(Boolean isPermisoOrdenVentasResumidosVentas) {
		this.isPermisoOrdenVentasResumidosVentas = isPermisoOrdenVentasResumidosVentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasResumidosVentas() {
		return isVisibilidadCeldaNuevoVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaNuevoVentasResumidosVentas(Boolean isVisibilidadCeldaNuevoVentasResumidosVentas) {
		this.isVisibilidadCeldaNuevoVentasResumidosVentas = isVisibilidadCeldaNuevoVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasResumidosVentas() {
		return isVisibilidadCeldaDuplicarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaDuplicarVentasResumidosVentas(Boolean isVisibilidadCeldaDuplicarVentasResumidosVentas) {
		this.isVisibilidadCeldaDuplicarVentasResumidosVentas = isVisibilidadCeldaDuplicarVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasResumidosVentas() {
		return isVisibilidadCeldaCopiarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaCopiarVentasResumidosVentas(Boolean isVisibilidadCeldaCopiarVentasResumidosVentas) {
		this.isVisibilidadCeldaCopiarVentasResumidosVentas = isVisibilidadCeldaCopiarVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasResumidosVentas() {
		return isVisibilidadCeldaVerFormVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaVerFormVentasResumidosVentas(Boolean isVisibilidadCeldaVerFormVentasResumidosVentas) {
		this.isVisibilidadCeldaVerFormVentasResumidosVentas = isVisibilidadCeldaVerFormVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasResumidosVentas() {
		return isVisibilidadCeldaOrdenVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaOrdenVentasResumidosVentas(Boolean isVisibilidadCeldaOrdenVentasResumidosVentas) {
		this.isVisibilidadCeldaOrdenVentasResumidosVentas = isVisibilidadCeldaOrdenVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasResumidosVentas() {
		return isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasResumidosVentas(Boolean isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas) {
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas = isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasResumidosVentas() {
		return isVisibilidadCeldaModificarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaModificarVentasResumidosVentas(Boolean isVisibilidadCeldaModificarVentasResumidosVentas) {
		this.isVisibilidadCeldaModificarVentasResumidosVentas = isVisibilidadCeldaModificarVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasResumidosVentas() {
		return isVisibilidadCeldaActualizarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaActualizarVentasResumidosVentas(Boolean isVisibilidadCeldaActualizarVentasResumidosVentas) {
		this.isVisibilidadCeldaActualizarVentasResumidosVentas = isVisibilidadCeldaActualizarVentasResumidosVentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasResumidosVentas() {
		return isVisibilidadCeldaEliminarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaEliminarVentasResumidosVentas(Boolean isVisibilidadCeldaEliminarVentasResumidosVentas) {
		this.isVisibilidadCeldaEliminarVentasResumidosVentas = isVisibilidadCeldaEliminarVentasResumidosVentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasResumidosVentas() {
		return isVisibilidadCeldaCancelarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaCancelarVentasResumidosVentas(Boolean isVisibilidadCeldaCancelarVentasResumidosVentas) {
		this.isVisibilidadCeldaCancelarVentasResumidosVentas = isVisibilidadCeldaCancelarVentasResumidosVentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasResumidosVentas() {
		return isVisibilidadCeldaGuardarVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaGuardarVentasResumidosVentas(Boolean isVisibilidadCeldaGuardarVentasResumidosVentas) {
		this.isVisibilidadCeldaGuardarVentasResumidosVentas = isVisibilidadCeldaGuardarVentasResumidosVentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasResumidosVentas() {
		return isVisibilidadCeldaGuardarCambiosVentasResumidosVentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasResumidosVentas(Boolean isVisibilidadCeldaGuardarCambiosVentasResumidosVentas) {
		this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas = isVisibilidadCeldaGuardarCambiosVentasResumidosVentas;
	}
		
	public VentasResumidosVentasSessionBean getventasresumidosventasSessionBean() {
		return this.ventasresumidosventasSessionBean;
	}
	
	public void setventasresumidosventasSessionBean(VentasResumidosVentasSessionBean ventasresumidosventasSessionBean) {
		this.ventasresumidosventasSessionBean=ventasresumidosventasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasResumidosVentas() {
		return this.isVisibilidadBusquedaVentasResumidosVentas;
	}

	public void setisVisibilidadBusquedaVentasResumidosVentas(Boolean isVisibilidadBusquedaVentasResumidosVentas) {
		this.isVisibilidadBusquedaVentasResumidosVentas=isVisibilidadBusquedaVentasResumidosVentas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventasresumidosventas,null);
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
	
	public void bugActualizarReferenciaActual(VentasResumidosVentas ventasresumidosventas,VentasResumidosVentas ventasresumidosventasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasResumidosVentas(ventasresumidosventas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventasresumidosventasAux.setId(ventasresumidosventas.getId());
		ventasresumidosventasAux.setVersionRow(ventasresumidosventas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasResumidosVentas ventasresumidosventasLocal) throws Exception {
		
		if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasResumidosVentas ventasresumidosventasLocal) throws Exception {	
		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventasresumidosventasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasResumidosVentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventasresumidosventasValidator.getInvalidValues(this.ventasresumidosventas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasResumidosVentas ventasresumidosventas,List<VentasResumidosVentas> ventasresumidosventass) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasResumidosVentas ventasresumidosventas,List<VentasResumidosVentas> ventasresumidosventass) throws Exception {
		try	{			
			VentasResumidosVentasConstantesFunciones.actualizarSelectedLista(ventasresumidosventas,ventasresumidosventass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasResumidosVentas> ventasresumidosventassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventasresumidosventassLocal=this.ventasresumidosventasLogic.getVentasResumidosVentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventasresumidosventassLocal=this.ventasresumidosventass;
			}
			//ARCHITECTURE
		
			for(VentasResumidosVentas ventasresumidosventasLocal:ventasresumidosventassLocal) {
				if(this.permiteMantenimiento(ventasresumidosventasLocal) && ventasresumidosventasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasResumidosVentasConstantesFunciones.getVentasResumidosVentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.DIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeldiaVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_ivaVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_sin_ivaVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.TOTALFLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_fleteVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelivaVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.NOMBREANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_anioVentasResumidosVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasResumidosVentasConstantesFunciones.NOMBREMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_mesVentasResumidosVentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeldiaVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_ivaVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_sin_ivaVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_fleteVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelivaVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_anioVentasResumidosVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_mesVentasResumidosVentas,"");
		
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
		this.iIdNuevoVentasResumidosVentas--;	
		
		
		this.ventasresumidosventasAux=new VentasResumidosVentas();
		
		this.ventasresumidosventasAux.setId(this.iIdNuevoVentasResumidosVentas);
		this.ventasresumidosventasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasresumidosventasLogic.getVentasResumidosVentass().add(this.ventasresumidosventasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventasresumidosventass.add(this.ventasresumidosventasAux);
		}
		//ARCHITECTURE
		
		this.ventasresumidosventas=this.ventasresumidosventasAux;
		
		if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventas);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidosVentas(this.ventasresumidosventas);
		}
				
		//this.setDefaultControlesVentasResumidosVentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasResumidosVentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasResumidosVentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidosVentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidosVentas(this.ventasresumidosventasBean,this.ventasresumidosventas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasResumidosVentas(this.ventasresumidosventasReturnGeneral,this.ventasresumidosventasBean,false);
		
		if(this.ventasresumidosventasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas());
		}
		
		if(this.ventasresumidosventasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas(),classes);//this.ventasresumidosventasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasResumidosVentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasResumidosVentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.RecargarFormVentasResumidosVentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasResumidosVentas(false);
						
			if(ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidosVentas();
			}
			
			this.actualizarVisualTableDatosVentasResumidosVentas();
			
			this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(this.getIndiceNuevoVentasResumidosVentas(), this.getIndiceNuevoVentasResumidosVentas());
			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
						
			this.actualizarEstadoCeldasBotonesVentasResumidosVentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasResumidosVentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_desdeVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarfecha_emision_desdeVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_hastaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarfecha_emision_hastaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activardiaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activartotal_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activartotal_sin_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activartotal_fleteVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarnombre_anioVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarnombre_mesVentasResumidosVentas);	
		//
		this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setEnabled(isHabilitar && this.ventasresumidosventasConstantesFunciones.activarid_empresaVentasResumidosVentas);
	};
	
	public void setDefaultControlesVentasResumidosVentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasResumidosVentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventasresumidosventasSessionBean.setConGuardarRelaciones(true);			
			this.ventasresumidosventasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.setVisible(true);
			
					
		} else {
			//this.ventasresumidosventasSessionBean.setConGuardarRelaciones(false);			
			this.ventasresumidosventasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasResumidosVentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
				if(ventasresumidosventasAux.getId().equals(this.iIdNuevoVentasResumidosVentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventass) {
				if(ventasresumidosventasAux.getId().equals(this.iIdNuevoVentasResumidosVentas)) {
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
	
	public int getIndiceActualVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
				if(ventasresumidosventasAux.getId().equals(ventasresumidosventas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventass) {
				if(ventasresumidosventasAux.getId().equals(ventasresumidosventas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasResumidosVentas(VentasResumidosVentas ventasresumidosventasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
				if(ventasresumidosventasAux.getVentasResumidosVentasOriginal().getId().equals(ventasresumidosventasOriginal.getId())) {
					existe=true;
					ventasresumidosventasOriginal.setId(ventasresumidosventasAux.getId());
					ventasresumidosventasOriginal.setVersionRow(ventasresumidosventasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventass) {
				if(ventasresumidosventasAux.getVentasResumidosVentasOriginal().getId().equals(ventasresumidosventasOriginal.getId())) {
					existe=true;
					ventasresumidosventasOriginal.setId(ventasresumidosventasAux.getId());
					ventasresumidosventasOriginal.setVersionRow(ventasresumidosventasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasResumidosVentas(Boolean esParaCancelar) throws Exception {
		ventasresumidosventassAux=new ArrayList<VentasResumidosVentas>();
		ventasresumidosventasAux=new VentasResumidosVentas();
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
					if(ventasresumidosventasAux.getId()<0) {
						ventasresumidosventassAux.add(ventasresumidosventasAux);
					}		
				}
				this.iIdNuevoVentasResumidosVentas=0L;
				this.ventasresumidosventasLogic.getVentasResumidosVentass().removeAll(ventasresumidosventassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventass) {
					if(ventasresumidosventasAux.getId()<0) {
						ventasresumidosventassAux.add(ventasresumidosventasAux);
					}		
				}
				this.iIdNuevoVentasResumidosVentas=0L;
				this.ventasresumidosventass.removeAll(ventasresumidosventassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasResumidosVentas 
					&& this.ventasresumidosventasLogic.getVentasResumidosVentass().size()>0
					) {
					ventasresumidosventasAux=this.ventasresumidosventasLogic.getVentasResumidosVentass().get(this.ventasresumidosventasLogic.getVentasResumidosVentass().size() - 1);
				
					if(ventasresumidosventasAux.getId()<0) {
						this.ventasresumidosventasLogic.getVentasResumidosVentass().remove(ventasresumidosventasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasResumidosVentas && this.ventasresumidosventass.size()>0) {
					ventasresumidosventasAux=this.ventasresumidosventass.get(this.ventasresumidosventass.size() - 1);
				
					if(ventasresumidosventasAux.getId()<0) {
						this.ventasresumidosventass.remove(ventasresumidosventasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasResumidosVentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventasresumidosventas.getId()<0) {
				this.ventasresumidosventasLogic.getVentasResumidosVentass().remove(this.ventasresumidosventas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventasresumidosventas.getId()<0) {
				this.ventasresumidosventass.remove(this.ventasresumidosventas);
			}
		}			
	}
	
	public void setEstadosInicialesVentasResumidosVentas(List<VentasResumidosVentas> ventasresumidosventassAux) throws Exception {
		VentasResumidosVentasConstantesFunciones.setEstadosInicialesVentasResumidosVentas(ventasresumidosventassAux);
	}
	
	public void setEstadosInicialesVentasResumidosVentas(VentasResumidosVentas ventasresumidosventasAux) throws Exception {
		VentasResumidosVentasConstantesFunciones.setEstadosInicialesVentasResumidosVentas(ventasresumidosventasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasResumidosVentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasResumidosVentasActual()) {
				if(!this.isEsNuevoVentasResumidosVentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasResumidosVentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasResumidosVentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Resumidos Ventas ?", "MANTENIMIENTO DE Ventas Resumidos Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasResumidosVentas ventasresumidosventas) throws Exception {
		VentasResumidosVentasConstantesFunciones.seleccionarAsignar(this.ventasresumidosventas,ventasresumidosventas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasResumidosVentas=this.isPermisoActualizarOriginalVentasResumidosVentas;
			
			
			this.seleccionarAsignar(ventasresumidosventas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasResumidosVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventasresumidosventasSessionBean.setsFuncionBusquedaRapida(this.ventasresumidosventasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasResumidosVentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasResumidosVentas(esParaCancelar);				
				this.cancelarNuevoVentasResumidosVentas(esParaCancelar);								
			}
			
			this.ventasresumidosventas=new VentasResumidosVentas();
			
			this.inicializarVentasResumidosVentas();
			
			this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasResumidosVentas() throws Exception {
		try {
			VentasResumidosVentasConstantesFunciones.inicializarVentasResumidosVentas(this.ventasresumidosventas);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventasresumidosventasLogic.getVentasResumidosVentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasResumidosVentass(String sAccionBusqueda,List<VentasResumidosVentas> ventasresumidosventassParaReportes) throws Exception {
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
					sPathReporteFinal="VentasResumidosVentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasResumidosVentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasResumidosVentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasResumidosVentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Resumidos Ventases");		
		parameters.put("busquedapor", VentasResumidosVentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasResumidosVentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasResumidosVentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasResumidosVentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasResumidosVentas=new JRBeanArrayDataSource(VentasResumidosVentasJInternalFrame.TraerVentasResumidosVentasBeans(ventasresumidosventassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasResumidosVentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasResumidosVentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasResumidosVentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasResumidosVentasBean.TraerVentasResumidosVentasBeans(ventasresumidosventassParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentasActionPerformed(null);
					//this.generarExcelReporteVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasResumidosVentass(sAccionBusqueda,sTipoArchivoReporte,ventasresumidosventassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasResumidosVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidosVentas> ventasresumidosventassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidosVentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidosVentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasResumidosVentas ventasresumidosventas : ventasresumidosventassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasResumidosVentasConstantesFunciones.generarExcelReporteDataVentasResumidosVentas("NORMAL",row,workbook,ventasresumidosventas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasResumidosVentas(String sTipo,Row row,Workbook workbook) {
		
		VentasResumidosVentasConstantesFunciones.generarExcelReporteHeaderVentasResumidosVentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasResumidosVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidosVentas> ventasresumidosventassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidosVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasResumidosVentas ventasresumidosventas : ventasresumidosventassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasResumidosVentasConstantesFunciones.getVentasResumidosVentasDescripcion(ventasresumidosventas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_DIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_DIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getdia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.gettotal_flete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getnombre_anio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasresumidosventas.getnombre_mes());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasResumidosVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasResumidosVentas> ventasresumidosventassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasResumidosVentas> ventasresumidosventassRespaldo=null;
		
		classes=VentasResumidosVentasConstantesFunciones.getClassesRelationshipsOfVentasResumidosVentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventasresumidosventasLogic.setDatosCliente(this.datosCliente);
		this.ventasresumidosventasLogic.setDatosDeep(this.datosDeep);
		this.ventasresumidosventasLogic.setIsConDeep(true);
		
		ventasresumidosventassRespaldo=this.ventasresumidosventasLogic.getVentasResumidosVentass();
		
		this.ventasresumidosventasLogic.setVentasResumidosVentass(ventasresumidosventassParaReportes);	
		this.ventasresumidosventasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventasresumidosventassParaReportes=this.ventasresumidosventasLogic.getVentasResumidosVentass();
		this.ventasresumidosventasLogic.setVentasResumidosVentass(ventasresumidosventassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasResumidosVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasResumidosVentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasResumidosVentas ventasresumidosventas : ventasresumidosventassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasResumidosVentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasResumidosVentasConstantesFunciones.generarExcelReporteDataVentasResumidosVentas("NORMAL",row,workbook,ventasresumidosventas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasResumidosVentasConstantesFunciones.getVentasResumidosVentasDescripcion(ventasresumidosventas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasResumidosVentas() throws Exception {		
		this.startProcessVentasResumidosVentas(true);
	}
	
	public void startProcessVentasResumidosVentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasResumidosVentas ,this.jPanelParametrosReportesVentasResumidosVentas, this.jScrollPanelDatosVentasResumidosVentas,this.jPanelPaginacionVentasResumidosVentas, this.jScrollPanelDatosEdicionVentasResumidosVentas, this.jPanelAccionesVentasResumidosVentas,this.jPanelAccionesFormularioVentasResumidosVentas,this.jmenuBarVentasResumidosVentas,this.jmenuBarDetalleVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidosVentas=this.jTabbedPaneBusquedasVentasResumidosVentas; 
		
		final JPanel jPanelParametrosReportesVentasResumidosVentas=this.jPanelParametrosReportesVentasResumidosVentas;
		//final JScrollPane jScrollPanelDatosVentasResumidosVentas=this.jScrollPanelDatosVentasResumidosVentas;
		final JTable jTableDatosVentasResumidosVentas=this.jTableDatosVentasResumidosVentas;		
		final JPanel jPanelPaginacionVentasResumidosVentas=this.jPanelPaginacionVentasResumidosVentas;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidosVentas=this.jScrollPanelDatosEdicionVentasResumidosVentas;
		final JPanel jPanelAccionesVentasResumidosVentas=this.jPanelAccionesVentasResumidosVentas;
		
		JPanel jPanelCamposAuxiliarVentasResumidosVentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidosVentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			jPanelCamposAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelCamposVentasResumidosVentas;
			jPanelAccionesFormularioAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelAccionesFormularioVentasResumidosVentas;
		}
		
		final JPanel jPanelCamposVentasResumidosVentas=jPanelCamposAuxiliarVentasResumidosVentas;
		final JPanel jPanelAccionesFormularioVentasResumidosVentas=jPanelAccionesFormularioAuxiliarVentasResumidosVentas;
		
		
		final JMenuBar jmenuBarVentasResumidosVentas=this.jmenuBarVentasResumidosVentas;
		final JToolBar jTtoolBarVentasResumidosVentas=this.jTtoolBarVentasResumidosVentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidosVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidosVentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			jmenuBarDetalleAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jmenuBarDetalleVentasResumidosVentas;
			jTtoolBarDetalleAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jTtoolBarDetalleVentasResumidosVentas;
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidosVentas=jmenuBarDetalleAuxiliarVentasResumidosVentas;
		final JToolBar jTtoolBarDetalleVentasResumidosVentas=jTtoolBarDetalleAuxiliarVentasResumidosVentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidosVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidosVentas;
			processRunnable.jTableDatos=jTableDatosVentasResumidosVentas;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidosVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidosVentas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidosVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidosVentas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidosVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidosVentas;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidosVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidosVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidosVentas ,jPanelParametrosReportesVentasResumidosVentas,jTableDatosVentasResumidosVentas, /*jScrollPanelDatosVentasResumidosVentas,*/jPanelCamposVentasResumidosVentas,jPanelPaginacionVentasResumidosVentas, /*jScrollPanelDatosEdicionVentasResumidosVentas,*/ jPanelAccionesVentasResumidosVentas,jPanelAccionesFormularioVentasResumidosVentas,jmenuBarVentasResumidosVentas,jmenuBarDetalleVentasResumidosVentas,jTtoolBarVentasResumidosVentas,jTtoolBarDetalleVentasResumidosVentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasResumidosVentas ,jPanelParametrosReportesVentasResumidosVentas, jScrollPanelDatosVentasResumidosVentas,jPanelPaginacionVentasResumidosVentas, jScrollPanelDatosEdicionVentasResumidosVentas, jPanelAccionesVentasResumidosVentas,jPanelAccionesFormularioVentasResumidosVentas,jmenuBarVentasResumidosVentas,jmenuBarDetalleVentasResumidosVentas,jTtoolBarVentasResumidosVentas,jTtoolBarDetalleVentasResumidosVentas);
						
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
	
	public void finishProcessVentasResumidosVentas() {// throws Exception 
		this.finishProcessVentasResumidosVentas(true);
	}
	
	public void finishProcessVentasResumidosVentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasResumidosVentas ,this.jPanelParametrosReportesVentasResumidosVentas, this.jScrollPanelDatosVentasResumidosVentas,this.jPanelPaginacionVentasResumidosVentas, this.jScrollPanelDatosEdicionVentasResumidosVentas, this.jPanelAccionesVentasResumidosVentas,this.jPanelAccionesFormularioVentasResumidosVentas,this.jmenuBarVentasResumidosVentas,this.jmenuBarDetalleVentasResumidosVentas,this.jTtoolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasResumidosVentas=this.jTabbedPaneBusquedasVentasResumidosVentas; 
		
		final JPanel jPanelParametrosReportesVentasResumidosVentas=this.jPanelParametrosReportesVentasResumidosVentas;
		//final JScrollPane jScrollPanelDatosVentasResumidosVentas=this.jScrollPanelDatosVentasResumidosVentas;
		final JTable jTableDatosVentasResumidosVentas=this.jTableDatosVentasResumidosVentas;		
		final JPanel jPanelPaginacionVentasResumidosVentas=this.jPanelPaginacionVentasResumidosVentas;
		//final JScrollPane jScrollPanelDatosEdicionVentasResumidosVentas=this.jScrollPanelDatosEdicionVentasResumidosVentas;
		final JPanel jPanelAccionesVentasResumidosVentas=this.jPanelAccionesVentasResumidosVentas;
		
		JPanel jPanelCamposAuxiliarVentasResumidosVentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasResumidosVentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			jPanelCamposAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelCamposVentasResumidosVentas;
			jPanelAccionesFormularioAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelAccionesFormularioVentasResumidosVentas;
		}
		
		final JPanel jPanelCamposVentasResumidosVentas=jPanelCamposAuxiliarVentasResumidosVentas;
		final JPanel jPanelAccionesFormularioVentasResumidosVentas=jPanelAccionesFormularioAuxiliarVentasResumidosVentas;
		
		
		final JMenuBar jmenuBarVentasResumidosVentas=this.jmenuBarVentasResumidosVentas;		
		final JToolBar jTtoolBarVentasResumidosVentas=this.jTtoolBarVentasResumidosVentas;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasResumidosVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasResumidosVentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			jmenuBarDetalleAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jmenuBarDetalleVentasResumidosVentas;
			jTtoolBarDetalleAuxiliarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jTtoolBarDetalleVentasResumidosVentas;		
		}
		
		final JMenuBar jmenuBarDetalleVentasResumidosVentas=jmenuBarDetalleAuxiliarVentasResumidosVentas;
		final JToolBar jTtoolBarDetalleVentasResumidosVentas=jTtoolBarDetalleAuxiliarVentasResumidosVentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasResumidosVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasResumidosVentas;
			processRunnable.jTableDatos=jTableDatosVentasResumidosVentas;
			processRunnable.jPanelCampos=jPanelCamposVentasResumidosVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasResumidosVentas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasResumidosVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasResumidosVentas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasResumidosVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasResumidosVentas;
			processRunnable.jTtoolBar=jTtoolBarVentasResumidosVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasResumidosVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasResumidosVentas ,jPanelParametrosReportesVentasResumidosVentas, jTableDatosVentasResumidosVentas,/*jScrollPanelDatosVentasResumidosVentas,*/jPanelCamposVentasResumidosVentas,jPanelPaginacionVentasResumidosVentas, /*jScrollPanelDatosEdicionVentasResumidosVentas,*/ jPanelAccionesVentasResumidosVentas,jPanelAccionesFormularioVentasResumidosVentas,jmenuBarVentasResumidosVentas,jmenuBarDetalleVentasResumidosVentas,jTtoolBarVentasResumidosVentas,jTtoolBarDetalleVentasResumidosVentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasResumidosVentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasResumidosVentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasResumidosVentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasResumidosVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasResumidosVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasResumidosVentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasResumidosVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasResumidosVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasResumidosVentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventasresumidosventasConstantesFunciones.getsFinalQueryVentasResumidosVentas();
		String  finalQueryPaginacionTodos=this.ventasresumidosventasConstantesFunciones.getsFinalQueryVentasResumidosVentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasResumidosVentasConstantesFunciones.getArrayColumnasGlobalesNoVentasResumidosVentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasResumidosVentasConstantesFunciones.getArrayColumnasGlobalesVentasResumidosVentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasResumidosVentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventasresumidosventassEliminados= new ArrayList<VentasResumidosVentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasResumidosVentas();
		
				///*VentasResumidosVentasSessionBean*/this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
			
			if(this.ventasresumidosventasSessionBean==null) {
				this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
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
					this.iNumeroPaginacion=VentasResumidosVentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasResumidosVentasConstantesFunciones.getClassesForeignKeysOfVentasResumidosVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventasresumidosventas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventasresumidosventassAux= new ArrayList<VentasResumidosVentas>();
			
				
			ventasresumidosventasLogic.setDatosCliente(this.datosCliente);
			ventasresumidosventasLogic.setDatosDeep(this.datosDeep);
			ventasresumidosventasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasResumidosVentas")) {
				this.sDetalleReporte=VentasResumidosVentasConstantesFunciones.getDetalleIndiceBusquedaVentasResumidosVentas(fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventasresumidosventasLogic.getVentasResumidosVentassBusquedaVentasResumidosVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidosVentasConstantesFunciones.getDetalleIndiceBusquedaVentasResumidosVentas(fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidosVentasConstantesFunciones.getDetalleIndiceBusquedaVentasResumidosVentas(fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventasresumidosventasLogic.getVentasResumidosVentass()==null||ventasresumidosventasLogic.getVentasResumidosVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventasresumidosventass==null|| ventasresumidosventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosventassAux=new ArrayList<VentasResumidosVentas>();
						ventasresumidosventassAux.addAll(ventasresumidosventasLogic.getVentasResumidosVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidosventassAux=new ArrayList<VentasResumidosVentas>();
							ventasresumidosventassAux.addAll(ventasresumidosventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventasresumidosventasLogic.getVentasResumidosVentassBusquedaVentasResumidosVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasResumidosVentasConstantesFunciones.getDetalleIndiceBusquedaVentasResumidosVentas(fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasResumidosVentasConstantesFunciones.getDetalleIndiceBusquedaVentasResumidosVentas(fecha_emision_desdeBusquedaVentasResumidosVentas,fecha_emision_hastaBusquedaVentasResumidosVentas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasResumidosVentass("BusquedaVentasResumidosVentas",ventasresumidosventasLogic.getVentasResumidosVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasResumidosVentass("BusquedaVentasResumidosVentas",ventasresumidosventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosventasLogic.setVentasResumidosVentass(new ArrayList<VentasResumidosVentas>());
						ventasresumidosventasLogic.getVentasResumidosVentass().addAll(ventasresumidosventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidosventass=new ArrayList<VentasResumidosVentas>();
							ventasresumidosventass.addAll(ventasresumidosventassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasResumidosVentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasResumidosVentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidosventasLogic.getVentasResumidosVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidosventass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasresumidosventasLogic.getVentasResumidosVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidosventass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasResumidosVentas ventasresumidosventas) {
		Boolean permite=true;
		
		if(this.ventasresumidosventas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasResumidosVentasConstantesFunciones.getOrderByListaVentasResumidosVentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasResumidosVentasConstantesFunciones.getOrderByListaVentasResumidosVentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventasLogic.getVentasResumidosVentass()) {
				if(ventasresumidosventas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosventasTotales=ventasresumidosventas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidosVentas ventasresumidosventas:this.ventasresumidosventass) {
				if(ventasresumidosventas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosventasTotales=ventasresumidosventas;
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
			this.ventasresumidosventasAux=new VentasResumidosVentas();
			this.ventasresumidosventasAux.setsType(Constantes2.S_TOTALES);
			this.ventasresumidosventasAux.setIsNew(false);
			this.ventasresumidosventasAux.setIsChanged(false);
			this.ventasresumidosventasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasResumidosVentasConstantesFunciones.TotalizarValoresFilaVentasResumidosVentas(this.ventasresumidosventasLogic.getVentasResumidosVentass(),this.ventasresumidosventasAux);
				
				//this.ventasresumidosventasLogic.getVentasResumidosVentass().add(this.ventasresumidosventasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasResumidosVentasConstantesFunciones.TotalizarValoresFilaVentasResumidosVentas(this.ventasresumidosventass,this.ventasresumidosventasAux);
				
				this.ventasresumidosventass.add(this.ventasresumidosventasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventasresumidosventasTotales=new VentasResumidosVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidosventasLogic.getVentasResumidosVentass().remove(ventasresumidosventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasresumidosventass.remove(ventasresumidosventasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventasresumidosventasTotales=new VentasResumidosVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventasLogic.getVentasResumidosVentass()) {
				if(ventasresumidosventas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosventasTotales=ventasresumidosventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidosVentasConstantesFunciones.TotalizarValoresFilaVentasResumidosVentas(this.ventasresumidosventasLogic.getVentasResumidosVentass(),ventasresumidosventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasResumidosVentas ventasresumidosventas:this.ventasresumidosventass) {
				if(ventasresumidosventas.getsType().equals(Constantes2.S_TOTALES)) {
					ventasresumidosventasTotales=ventasresumidosventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasResumidosVentasConstantesFunciones.TotalizarValoresFilaVentasResumidosVentas(this.ventasresumidosventass,ventasresumidosventasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasResumidosVentassBusquedaVentasResumidosVentas()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasResumidosVentas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasResumidosVentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasResumidosVentassBusquedaVentasResumidosVentas(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidosventasLogic.getVentasResumidosVentassBusquedaVentasResumidosVentas(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasResumidosVentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasresumidosventasLogic.getVentasResumidosVentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosVentasResumidosVentas() {
		this.isPermisoTodoVentasResumidosVentas=false;
		this.isPermisoNuevoVentasResumidosVentas=false;
		this.isPermisoActualizarVentasResumidosVentas=false;
		this.isPermisoActualizarOriginalVentasResumidosVentas=false;
		this.isPermisoEliminarVentasResumidosVentas=false;
		this.isPermisoGuardarCambiosVentasResumidosVentas=false;
		this.isPermisoConsultaVentasResumidosVentas=true;
		this.isPermisoBusquedaVentasResumidosVentas=true;
		this.isPermisoReporteVentasResumidosVentas=true;
		this.isPermisoOrdenVentasResumidosVentas=false;		
		this.isPermisoPaginacionMedioVentasResumidosVentas=false;		
		this.isPermisoPaginacionAltoVentasResumidosVentas=false;		
		this.isPermisoPaginacionTodoVentasResumidosVentas=false;		
		this.isPermisoCopiarVentasResumidosVentas=false;		
		this.isPermisoVerFormVentasResumidosVentas=false;		
		this.isPermisoDuplicarVentasResumidosVentas=false;
		this.isPermisoOrdenVentasResumidosVentas=false;
	}
	
	public void setPermisosUsuarioVentasResumidosVentas(Boolean isPermiso) {
		this.isPermisoTodoVentasResumidosVentas=isPermiso;
		this.isPermisoNuevoVentasResumidosVentas=isPermiso;
		this.isPermisoActualizarVentasResumidosVentas=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidosVentas=isPermiso;
		this.isPermisoEliminarVentasResumidosVentas=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidosVentas=isPermiso;
		this.isPermisoConsultaVentasResumidosVentas=isPermiso;
		this.isPermisoBusquedaVentasResumidosVentas=isPermiso;
		this.isPermisoReporteVentasResumidosVentas=isPermiso;
		this.isPermisoOrdenVentasResumidosVentas=isPermiso;		
		this.isPermisoPaginacionMedioVentasResumidosVentas=isPermiso;		
		this.isPermisoPaginacionAltoVentasResumidosVentas=isPermiso;		
		this.isPermisoPaginacionTodoVentasResumidosVentas=isPermiso;		
		this.isPermisoCopiarVentasResumidosVentas=isPermiso;		
		this.isPermisoVerFormVentasResumidosVentas=isPermiso;		
		this.isPermisoDuplicarVentasResumidosVentas=isPermiso;
		this.isPermisoOrdenVentasResumidosVentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasResumidosVentas(Boolean isPermiso) {
		//this.isPermisoTodoVentasResumidosVentas=isPermiso;
		this.isPermisoNuevoVentasResumidosVentas=isPermiso;
		this.isPermisoActualizarVentasResumidosVentas=isPermiso;
		this.isPermisoActualizarOriginalVentasResumidosVentas=isPermiso;
		this.isPermisoEliminarVentasResumidosVentas=isPermiso;
		this.isPermisoGuardarCambiosVentasResumidosVentas=isPermiso;
		//this.isPermisoConsultaVentasResumidosVentas=isPermiso;
		//this.isPermisoBusquedaVentasResumidosVentas=isPermiso;
		//this.isPermisoReporteVentasResumidosVentas=isPermiso;
		//this.isPermisoOrdenVentasResumidosVentas=isPermiso;		
		//this.isPermisoPaginacionMedioVentasResumidosVentas=isPermiso;		
		//this.isPermisoPaginacionAltoVentasResumidosVentas=isPermiso;		
		//this.isPermisoPaginacionTodoVentasResumidosVentas=isPermiso;		
		//this.isPermisoCopiarVentasResumidosVentas=isPermiso;		
		//this.isPermisoDuplicarVentasResumidosVentas=isPermiso;
		//this.isPermisoOrdenVentasResumidosVentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidosVentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasResumidosVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasResumidosVentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasResumidosVentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasResumidosVentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasResumidosVentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasResumidosVentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasResumidosVentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasResumidosVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasResumidosVentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasResumidosVentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasResumidosVentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasResumidosVentas=this.isPermisoActualizarVentasResumidosVentas;
			this.isPermisoEliminarVentasResumidosVentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasResumidosVentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasResumidosVentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasResumidosVentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasResumidosVentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasResumidosVentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidosVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasResumidosVentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasResumidosVentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasResumidosVentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasResumidosVentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasResumidosVentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasResumidosVentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasResumidosVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasResumidosVentas.setToolTipText(this.jTableDatosVentasResumidosVentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasResumidosVentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasResumidosVentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasResumidosVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasResumidosVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasResumidosVentas() throws Exception {
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
	public void inicializarCombosForeignKeyVentasResumidosVentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasResumidosVentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasResumidosVentasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasResumidosVentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventasresumidosventasSessionBean==null) {
				this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
			}

			if(!this.ventasresumidosventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyVentasResumidosVentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasResumidosVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasResumidosVentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidosVentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasResumidosVentas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasResumidosVentas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasResumidosVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasResumidosVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasResumidosVentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasResumidosVentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasResumidosVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasResumidosVentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public VentasResumidosVentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasResumidosVentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasResumidosVentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean(); 
		this.ventasresumidosventasConstantesFunciones=new VentasResumidosVentasConstantesFunciones(); 
		this.ventasresumidosventasBean=new VentasResumidosVentas();//(this.ventasresumidosventasConstantesFunciones); 		
		this.ventasresumidosventasReturnGeneral=new VentasResumidosVentasParameterReturnGeneral(); 
		
		this.ventasresumidosventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasResumidosVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasResumidosVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasResumidosVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasResumidosVentas(true);
			
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
			
			this.ventasresumidosventasConstantesFunciones=new VentasResumidosVentasConstantesFunciones(); 
			this.ventasresumidosventasBean=new VentasResumidosVentas();//this.ventasresumidosventasConstantesFunciones); 			
			this.ventasresumidosventasReturnGeneral=new VentasResumidosVentasParameterReturnGeneral(); 
		
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidos Ventas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventasresumidosventas=new VentasResumidosVentas();
			this.ventasresumidosventass = new ArrayList<VentasResumidosVentas>();
			this.ventasresumidosventassAux = new ArrayList<VentasResumidosVentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic=new VentasResumidosVentasLogic();
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			//this.ventasresumidosventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventasresumidosventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasResumidosVentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidosVentas);	
					}
					
					if(this.jInternalFrameImportacionVentasResumidosVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidosVentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasResumidosVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasResumidosVentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidosVentas);
				this.jInternalFrameDetalleFormVentasResumidosVentas.setVisible(false);
				this.jInternalFrameDetalleFormVentasResumidosVentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidosVentas);
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasResumidosVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidosVentas);
					this.jInternalFrameImportacionVentasResumidosVentas.setVisible(false);
					this.jInternalFrameImportacionVentasResumidosVentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasResumidosVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidosVentas);
					this.jInternalFrameOrderByVentasResumidosVentas.setVisible(false);
					this.jInternalFrameOrderByVentasResumidosVentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasResumidosVentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasResumidosVentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventasresumidosventasReturnGeneral=new VentasResumidosVentasParameterReturnGeneral();
			
			this.ventasresumidosventasParameterGeneral=new VentasResumidosVentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventasresumidosventasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasResumidosVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidosVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),this.ventasresumidosventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasResumidosVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),this.ventasresumidosventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaDuplicarVentasResumidosVentas=true;
			this.isVisibilidadCeldaCopiarVentasResumidosVentas=true;
			this.isVisibilidadCeldaVerFormVentasResumidosVentas=true;
			this.isVisibilidadCeldaOrdenVentasResumidosVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			
			
			this.isVisibilidadBusquedaVentasResumidosVentas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasResumidosVentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasResumidosVentas(false);
			
			this.setPermisosUsuarioVentasResumidosVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() 
				|| (this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() && this.ventasresumidosventasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasResumidosVentasClasesRelacionadas();
			}
			
			if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasResumidosVentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasResumidosVentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasResumidosVentas();
			}
			
			if(!this.isPermisoBusquedaVentasResumidosVentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasResumidosVentasConstantesFunciones.getTiposSeleccionarVentasResumidosVentas());
				
				this.tiposColumnasSelect=VentasResumidosVentasConstantesFunciones.getTiposSeleccionarVentasResumidosVentas(true);
				
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
			//if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasResumidosVentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasResumidosVentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasResumidosVentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidosVentas() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventasresumidosventasImplementable= (VentasResumidosVentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidosVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventasresumidosventasImplementableHome= (VentasResumidosVentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasResumidosVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventasresumidosventass= new ArrayList<VentasResumidosVentas>();
			this.ventasresumidosventassEliminados= new ArrayList<VentasResumidosVentas>();
						
			this.isEsNuevoVentasResumidosVentas=false;
			this.esParaAccionDesdeFormularioVentasResumidosVentas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasResumidosVentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasResumidosVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasResumidosVentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasResumidosVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasResumidosVentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasResumidosVentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasResumidosVentas();
			}
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasResumidosVentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasResumidosVentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasResumidosVentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasResumidosVentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasResumidosVentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasResumidosVentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasResumidosVentas")) {
				iIndex=this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasResumidosVentas();	
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
	
	public void cargarCombosForeignKeyVentasResumidosVentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasResumidosVentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasResumidosVentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasResumidosVentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasResumidosVentas();
		
		this.cargarCombosFrameForeignKeyVentasResumidosVentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasResumidosVentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasResumidosVentas();
		}
	}
	
	
	
	public void jButtonNuevoVentasResumidosVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			
			if(jTableDatosVentasResumidosVentas.getRowCount()>=1) {
				jTableDatosVentasResumidosVentas.removeRowSelectionInterval(0, jTableDatosVentasResumidosVentas.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasResumidosVentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasResumidosVentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasResumidosVentas(true);			
			//this.ventasresumidosventas=new VentasResumidosVentas();
			//this.ventasresumidosventas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidosVentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas() ;
			
			if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidosVentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventasresumidosventas);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);				
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasResumidosVentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasResumidosVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasResumidosVentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasResumidosVentas.getSelectedRows().length;			
			}
			
			ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasResumidosVentas--;			
				//VentasResumidosVentas ventasresumidosventasAux= new VentasResumidosVentas();			
				//ventasresumidosventasAux.setId(this.iIdNuevoVentasResumidosVentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasResumidosVentas ventasresumidosventasOrigen=new VentasResumidosVentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasResumidosVentas ventasresumidosventasOrigen : ventasresumidosventassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventasresumidosventasOrigen =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasresumidosventasOrigen =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasResumidosVentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventasresumidosventas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasResumidosVentas(ventasresumidosventasOrigen,this.ventasresumidosventas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidosventasLogic.getVentasResumidosVentass().add(this.ventasresumidosventasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventass.add(this.ventasresumidosventasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
				
				this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(this.getIndiceNuevoVentasResumidosVentas(), this.getIndiceNuevoVentasResumidosVentas());
				
				int iLastRow =  this.jTableDatosVentasResumidosVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidosVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidosVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();									
		
			VentasResumidosVentas ventasresumidosventasOrigen=new VentasResumidosVentas();
			VentasResumidosVentas ventasresumidosventasDestino=new VentasResumidosVentas();
				
			ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasResumidosVentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventasresumidosventassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasResumidosVentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosventasOrigen =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidosventasOrigen =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasresumidosventasDestino =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasresumidosventasDestino =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventasresumidosventasOrigen =ventasresumidosventassSeleccionados.get(0);
				ventasresumidosventasDestino =ventasresumidosventassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasResumidosVentas(ventasresumidosventasOrigen,ventasresumidosventasDestino,true,false);
				
				ventasresumidosventasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventasresumidosventasDestino,ventasresumidosventasLogic.getVentasResumidosVentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventasresumidosventasDestino,ventasresumidosventass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
				
				//this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(this.getIndiceNuevoVentasResumidosVentas(), this.getIndiceNuevoVentasResumidosVentas());
				
				int iLastRow =  this.jTableDatosVentasResumidosVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasResumidosVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasResumidosVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasResumidosVentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasResumidosVentas.setVisible(!isVisible);
			this.jPanelPaginacionVentasResumidosVentas.setVisible(!isVisible);
			this.jPanelAccionesVentasResumidosVentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasResumidosVentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasResumidosVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasResumidosVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasResumidosVentas();
			
			this.abrirFrameOrderByVentasResumidosVentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasResumidosVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasResumidosVentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidosVentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasResumidosVentas.isMaximum()) {
					this.jInternalFrameDetalleFormVentasResumidosVentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasResumidosVentas.setSize(this.jInternalFrameDetalleFormVentasResumidosVentas.iWidthFormulario,this.jInternalFrameDetalleFormVentasResumidosVentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasResumidosVentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasResumidosVentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasResumidosVentas.isMaximum()) {
						this.jInternalFrameDetalleFormVentasResumidosVentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidosVentas.jContentPaneDetalleVentasResumidosVentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidosVentas.jContentPaneDetalleVentasResumidosVentas.getWidth(),VentasResumidosVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidosVentas.jContentPaneDetalleVentasResumidosVentas.getWidth(),VentasResumidosVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasResumidosVentas.jContentPaneDetalleVentasResumidosVentas.getWidth(),VentasResumidosVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasResumidosVentas.setVisible(true);
	        this.jInternalFrameDetalleFormVentasResumidosVentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasResumidosVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasResumidosVentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasResumidosVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidosVentas,false,this);
				} else {
					this.jInternalFrameOrderByVentasResumidosVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidosVentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasResumidosVentas);
				this.jInternalFrameOrderByVentasResumidosVentas.setVisible(false);
				this.jInternalFrameOrderByVentasResumidosVentas.setSelected(false);
				
				this.jInternalFrameOrderByVentasResumidosVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidosVentas"));
				
				this.inicializarActualizarBindingTablaOrderByVentasResumidosVentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasResumidosVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasResumidosVentas==null) {
				
				this.jInternalFrameImportacionVentasResumidosVentas=new ImportacionJInternalFrame(VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasResumidosVentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasResumidosVentas);
				this.jInternalFrameImportacionVentasResumidosVentas.setVisible(false);
				this.jInternalFrameImportacionVentasResumidosVentas.setSelected(false);


				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidosVentas"));
				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidosVentas"));
				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidosVentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasResumidosVentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasResumidosVentas==null) {
				this.jInternalFrameReporteDinamicoVentasResumidosVentas=new ReporteDinamicoJInternalFrame(VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasResumidosVentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasResumidosVentas);
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidosVentas"));
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidosVentas"));
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidosVentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidosVentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasResumidosVentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasResumidosVentas);
			
	       	this.jInternalFrameDetalleFormVentasResumidosVentas.setVisible(false);
	        this.jInternalFrameDetalleFormVentasResumidosVentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasResumidosVentas.dispose();
			//this.jInternalFrameDetalleFormVentasResumidosVentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasResumidosVentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasResumidosVentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasResumidosVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasResumidosVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasResumidosVentas.setVisible(true);
	        this.jInternalFrameImportacionVentasResumidosVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasResumidosVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasResumidosVentas.setVisible(true);
	        this.jInternalFrameOrderByVentasResumidosVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasResumidosVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasResumidosVentas.setVisible(false);
	        this.jInternalFrameOrderByVentasResumidosVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasResumidosVentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasResumidosVentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasResumidosVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasResumidosVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasResumidosVentas.setVisible(false);
	        this.jInternalFrameImportacionVentasResumidosVentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasResumidosVentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasResumidosVentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasResumidosVentas(true);
			//this.isEsNuevoVentasResumidosVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasResumidosVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidosVentas(false) ;
			
			if(ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidosVentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasResumidosVentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasResumidosVentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasResumidosVentas(true);
			//this.isEsNuevoVentasResumidosVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventasresumidosventas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasResumidosVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasResumidosVentas(false) ;
			
			if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasResumidosVentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidosVentas(false);
			
			//if(!this.isEsNuevoVentasResumidosVentas) {								
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				
			}
			
			if(this.permiteMantenimiento(this.ventasresumidosventas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasResumidosVentas=true;
					this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
					this.isEsNuevoVentasResumidosVentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasResumidosVentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasResumidosVentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidosVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(false);
				
				this.habilitarDeshabilitarControlesVentasResumidosVentas(false);
			
												
				
				if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasResumidosVentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasResumidosVentasActionPerformed(evt,ventasresumidosventasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasResumidosVentas(this.ventasresumidosventas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventasresumidosventasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventasresumidosventas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidosventas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				this.ventasresumidosventas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventasresumidosventas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasResumidosVentasModel) this.jTableDatosVentasResumidosVentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasResumidosVentas=true;
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
				this.isEsNuevoVentasResumidosVentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasResumidosVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(false);
				
				this.habilitarDeshabilitarControlesVentasResumidosVentas(false);
				
				
				
				if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasResumidosVentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasResumidosVentas.getRowCount()>=1) {
				jTableDatosVentasResumidosVentas.removeRowSelectionInterval(0, jTableDatosVentasResumidosVentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasResumidosVentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasResumidosVentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(false) ;
			
			this.isEsNuevoVentasResumidosVentas=false;
			
			if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasResumidosVentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasResumidosVentas(false);
				
				//SI ES MANUAL
				if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasResumidosVentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasResumidosVentas--;			
			//VentasResumidosVentas ventasresumidosventasAux= new VentasResumidosVentas();			
			//ventasresumidosventasAux.setId(this.iIdNuevoVentasResumidosVentas);
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasResumidosVentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
			
			this.ventasresumidosventas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventasresumidosventasLogic.getVentasResumidosVentass().add(this.ventasresumidosventasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventasresumidosventass.add(this.ventasresumidosventasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			
			this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(this.getIndiceNuevoVentasResumidosVentas(), this.getIndiceNuevoVentasResumidosVentas());
			
			int iLastRow =  this.jTableDatosVentasResumidosVentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasResumidosVentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasResumidosVentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidosVentas(false);
			
			//SI ES MANUAL
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidosVentas();
			}
			
			//this.abrirFrameTreeVentasResumidosVentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasResumidosVentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasResumidosVentas.setFileImportacion(this.jInternalFrameImportacionVentasResumidosVentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasResumidosVentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasResumidosVentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasResumidosVentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasResumidosVentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		

		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasResumidosVentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasResumidosVentasBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidosVentasConstantesFunciones.LABEL_DIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFlete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFlete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFlete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFlete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreAnio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreAnio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreAnio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreAnio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasResumidosVentasConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoria="dia";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE:
					sNombreCampoCategoria="total_flete";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO:
					sNombreCampoCategoria="nombre_anio";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES:
					sNombreCampoCategoria="nombre_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasResumidosVentasConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoriaValor="dia";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE:
					sNombreCampoCategoriaValor="total_flete";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO:
					sNombreCampoCategoriaValor="nombre_anio";
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES:
					sNombreCampoCategoriaValor="nombre_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasResumidosVentasConstantesFunciones.LABEL_DIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_flete");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_anio");
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasResumidosVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_DIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_DIA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getdia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.gettotal_flete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IVA);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getnombre_anio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES);
					iRow++;

					for(VentasResumidosVentas ventasresumidosventas:ventasresumidosventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasresumidosventas.getnombre_mes());
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
			//	this.getFilaCabeceraExportarExcelVentasResumidosVentas(row);				
			//	iRow++;
			//}				
			
			//for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasResumidosVentas(ventasresumidosventasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidosVentas(false);
			
			//SI ES MANUAL
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasResumidosVentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidosVentas(false);
			
			//SI ES MANUAL
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidosVentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasResumidosVentas(false);
			
			//SI ES MANUAL
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasResumidosVentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasResumidosVentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasResumidosVentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasResumidosVentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasResumidosVentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasResumidosVentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasResumidosVentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasResumidosVentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasResumidosVentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasResumidosVentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasResumidosVentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasResumidosVentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasResumidosVentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasResumidosVentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasResumidosVentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidosVentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasResumidosVentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasResumidosVentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasResumidosVentas();
		
		this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidosVentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidosVentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidosVentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidosVentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasResumidosVentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasResumidosVentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasResumidosVentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionNuevoVentasResumidosVentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionSinCerrarVentasResumidosVentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionSinMensajeVentasResumidosVentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasResumidosVentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasResumidosVentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasResumidosVentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
				this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionNuevoVentasResumidosVentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionSinCerrarVentasResumidosVentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasResumidosVentas.jCheckBoxPostAccionSinMensajeVentasResumidosVentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasResumidosVentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasResumidosVentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasResumidosVentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasResumidosVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasResumidosVentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasResumidosVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasResumidosVentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasResumidosVentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasResumidosVentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasResumidosVentas(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasResumidosVentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasResumidosVentas() throws Exception {
		try	{
			if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidosVentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidosVentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasResumidosVentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasResumidosVentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasResumidosVentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasResumidosVentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasResumidosVentas.addItem(reporte);
			}
			
			
			if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasResumidosVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasResumidosVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasResumidosVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasResumidosVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasResumidosVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasResumidosVentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasResumidosVentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidosVentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasResumidosVentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasResumidosVentasConstantesFunciones.getTiposSeleccionarVentasResumidosVentas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasResumidosVentasConstantesFunciones.getTiposSeleccionarVentasResumidosVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasResumidosVentasConstantesFunciones.getTiposSeleccionarVentasResumidosVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasResumidosVentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaVentasResumidosVentas=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasVentasResumidosVentas.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasResumidosVentas=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasVentasResumidosVentas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasResumidosVentas(Boolean esInicializar) throws Exception {				
		if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasResumidosVentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasResumidosVentas() throws Exception {
		this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasResumidosVentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasResumidosVentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasResumidosVentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventasresumidosventasLogic.getVentasResumidosVentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventasresumidosventass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasResumidosVentas.setModel(new VentasResumidosVentasModel(this.ventasresumidosventasLogic.getVentasResumidosVentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasResumidosVentas.setModel(new VentasResumidosVentasModel(this.ventasresumidosventass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasResumidosVentas!=null && this.jInternalFrameOrderByVentasResumidosVentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasResumidosVentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,ventasresumidosventasConstantesFunciones.resaltarSeleccionarVentasResumidosVentas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO,ventasresumidosventasConstantesFunciones.resaltarSeleccionarVentasResumidosVentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_ID));

		if(this.ventasresumidosventasConstantesFunciones.mostraridVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosventasConstantesFunciones.resaltaridVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activaridVentasResumidosVentas,iSizeTabla,this,true,"idVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltaridVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activaridVentasResumidosVentas,this,true,"idVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_DIA));

		if(this.ventasresumidosventasConstantesFunciones.mostrardiaVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_DIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosventasConstantesFunciones.resaltardiaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activardiaVentasResumidosVentas,iSizeTabla,this,true,"diaVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltardiaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activardiaVentasResumidosVentas,this,true,"diaVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA));

		if(this.ventasresumidosventasConstantesFunciones.mostrartotal_ivaVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_ivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_ivaVentasResumidosVentas,iSizeTabla,this,true,"total_ivaVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_ivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_ivaVentasResumidosVentas,this,true,"total_ivaVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.ventasresumidosventasConstantesFunciones.mostrartotal_sin_ivaVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_sin_ivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_sin_ivaVentasResumidosVentas,iSizeTabla,this,true,"total_sin_ivaVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_sin_ivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_sin_ivaVentasResumidosVentas,this,true,"total_sin_ivaVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE));

		if(this.ventasresumidosventasConstantesFunciones.mostrartotal_fleteVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_fleteVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_fleteVentasResumidosVentas,iSizeTabla,this,true,"total_fleteVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltartotal_fleteVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activartotal_fleteVentasResumidosVentas,this,true,"total_fleteVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_IVA));

		if(this.ventasresumidosventasConstantesFunciones.mostrarivaVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasresumidosventasConstantesFunciones.resaltarivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarivaVentasResumidosVentas,iSizeTabla,this,true,"ivaVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltarivaVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarivaVentasResumidosVentas,this,true,"ivaVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO));

		if(this.ventasresumidosventasConstantesFunciones.mostrarnombre_anioVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosventasConstantesFunciones.resaltarnombre_anioVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarnombre_anioVentasResumidosVentas,iSizeTabla,this,true,"nombre_anioVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltarnombre_anioVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarnombre_anioVentasResumidosVentas,this,true,"nombre_anioVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES));

		if(this.ventasresumidosventasConstantesFunciones.mostrarnombre_mesVentasResumidosVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasresumidosventasConstantesFunciones.resaltarnombre_mesVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarnombre_mesVentasResumidosVentas,iSizeTabla,this,true,"nombre_mesVentasResumidosVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasresumidosventasConstantesFunciones.resaltarnombre_mesVentasResumidosVentas,this.ventasresumidosventasConstantesFunciones.activarnombre_mesVentasResumidosVentas,this,true,"nombre_mesVentasResumidosVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasResumidosVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidosVentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasResumidosVentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasResumidosVentas.addColumn(tableColumn);
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
			
			this.jTableDatosVentasResumidosVentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasResumidosVentas.moveColumn(this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasResumidosVentas.moveColumn(this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasResumidosVentas.moveColumn(this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasResumidosVentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasResumidosVentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasResumidosVentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasResumidosVentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasResumidosVentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasResumidosVentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasResumidosVentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventasresumidosventasLogic.getVentasResumidosVentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventasresumidosventass.size()-1;
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
		//this.jTableDatosVentasResumidosVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasResumidosVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasResumidosVentas();
			
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
				
				//this.isEsNuevoVentasResumidosVentas=false;
					
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
				if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidosVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidosVentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventasresumidosventas.getsType().equals("DUPLICADO")
				   || this.ventasresumidosventas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasResumidosVentas=true;
				
				} else {
					this.isEsNuevoVentasResumidosVentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
					if(this.ventasresumidosventas.getId()>=0 && !this.ventasresumidosventas.getIsNew()) {						
						this.isEsNuevoVentasResumidosVentas=false;
						
					} else {
						this.isEsNuevoVentasResumidosVentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasResumidosVentas(esRelaciones);						
				
				this.seleccionarVentasResumidosVentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventasresumidosventas.getId()<0) {
					this.isEsNuevoVentasResumidosVentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasResumidosVentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasResumidosVentas(evt,rowIndex);
				}	
				
				if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasResumidosVentas: " + this.dDif); 
					}
				}								
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasResumidosVentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventasresumidosventas)) {
					if(this.ventasresumidosventas.getId()>0) {
						this.ventasresumidosventas.setIsDeleted(true);
						
						this.ventasresumidosventassEliminados.add(this.ventasresumidosventas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasresumidosventasLogic.getVentasResumidosVentass().remove(this.ventasresumidosventas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventass.remove(this.ventasresumidosventas);				
					}
					
					
					((VentasResumidosVentasModel) this.jTableDatosVentasResumidosVentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasResumidosVentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasResumidosVentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasResumidosVentas) {
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasResumidosVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasResumidosVentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasResumidosVentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasResumidosVentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasResumidosVentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasResumidosVentas(ventasresumidosventas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasResumidosVentas(ventasresumidosventas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasResumidosVentas(ventasresumidosventas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidosVentas(ventasresumidosventas);
	}
	
	public void setVariablesObjetoActualToFormularioVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setText(ventasresumidosventas.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setText(ventasresumidosventas.getdia());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setText(ventasresumidosventas.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setText(ventasresumidosventas.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setText(ventasresumidosventas.gettotal_flete().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setText(ventasresumidosventas.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setText(ventasresumidosventas.getnombre_anio());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setText(ventasresumidosventas.getnombre_mes());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasResumidosVentas ventasresumidosventasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventasresumidosventasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasResumidosVentas ventasresumidosventasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventasresumidosventasLocal=this.ventasresumidosventas;
			} else {
				ventasresumidosventasLocal=this.ventasresumidosventasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventasresumidosventasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasResumidosVentas(ventasresumidosventasLocal,true);
					
					if(ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventasresumidosventasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventasresumidosventasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidosVentas(ventasresumidosventas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(ventasresumidosventas);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasResumidosVentas(ventasresumidosventas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.getText()==null || this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.getText()=="" || this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setText("0");
			}

			if(conColumnasBase) {ventasresumidosventas.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelIdVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.setdia(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_DIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeldiaVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_ivaVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_sin_ivaVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.settotal_flete(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabeltotal_fleteVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.setiva(Double.parseDouble(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelivaVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.setnombre_anio(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_anioVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasresumidosventas.setnombre_mes(this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelnombre_mesVentasResumidosVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasResumidosVentas(VentasResumidosVentas ventasresumidosventasBean,VentasResumidosVentas ventasresumidosventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasResumidosVentas(VentasResumidosVentas ventasresumidosventasOrigen,VentasResumidosVentas ventasresumidosventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidosventasOrigen.getId()!=null && !ventasresumidosventasOrigen.getId().equals(0L))) {ventasresumidosventas.setId(ventasresumidosventasOrigen.getId());}}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getfecha_emision_desde()!=null && !ventasresumidosventasOrigen.getfecha_emision_desde().equals(new Date()))) {ventasresumidosventas.setfecha_emision_desde(ventasresumidosventasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getfecha_emision_hasta()!=null && !ventasresumidosventasOrigen.getfecha_emision_hasta().equals(new Date()))) {ventasresumidosventas.setfecha_emision_hasta(ventasresumidosventasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getdia()!=null && !ventasresumidosventasOrigen.getdia().equals(""))) {ventasresumidosventas.setdia(ventasresumidosventasOrigen.getdia());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.gettotal_iva()!=null && !ventasresumidosventasOrigen.gettotal_iva().equals(0.0))) {ventasresumidosventas.settotal_iva(ventasresumidosventasOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.gettotal_sin_iva()!=null && !ventasresumidosventasOrigen.gettotal_sin_iva().equals(0.0))) {ventasresumidosventas.settotal_sin_iva(ventasresumidosventasOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.gettotal_flete()!=null && !ventasresumidosventasOrigen.gettotal_flete().equals(0.0))) {ventasresumidosventas.settotal_flete(ventasresumidosventasOrigen.gettotal_flete());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getiva()!=null && !ventasresumidosventasOrigen.getiva().equals(0.0))) {ventasresumidosventas.setiva(ventasresumidosventasOrigen.getiva());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getnombre_anio()!=null && !ventasresumidosventasOrigen.getnombre_anio().equals(""))) {ventasresumidosventas.setnombre_anio(ventasresumidosventasOrigen.getnombre_anio());}
			if(conDefault || (!conDefault && ventasresumidosventasOrigen.getnombre_mes()!=null && !ventasresumidosventasOrigen.getnombre_mes().equals(""))) {ventasresumidosventas.setnombre_mes(ventasresumidosventasOrigen.getnombre_mes());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setText(ventasresumidosventas.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setText(ventasresumidosventas.getdia());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setText(ventasresumidosventas.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setText(ventasresumidosventas.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setText(ventasresumidosventas.gettotal_flete().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setText(ventasresumidosventas.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setText(ventasresumidosventas.getnombre_anio());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setText(ventasresumidosventas.getnombre_mes());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasResumidosVentas(VentasResumidosVentasBean ventasresumidosventasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setText(ventasresumidosventasBean.getId().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setText(ventasresumidosventasBean.getdia());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setText(ventasresumidosventasBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setText(ventasresumidosventasBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setText(ventasresumidosventasBean.gettotal_flete().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setText(ventasresumidosventasBean.getiva().toString());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setText(ventasresumidosventasBean.getnombre_anio());
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setText(ventasresumidosventasBean.getnombre_mes());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasResumidosVentas(VentasResumidosVentasParameterReturnGeneral ventasresumidosventasReturnGeneral,VentasResumidosVentasBean ventasresumidosventasBean,Boolean conDefault) throws Exception { 
		try {
			VentasResumidosVentas ventasresumidosventasLocal=new VentasResumidosVentas();
			
			ventasresumidosventasLocal=ventasresumidosventasReturnGeneral.getVentasResumidosVentas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasresumidosventasLocal.getId()!=null && !ventasresumidosventasLocal.getId().equals(0L))) {ventasresumidosventasBean.setId(ventasresumidosventasLocal.getId());}}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.getdia()!=null && !ventasresumidosventasLocal.getdia().equals(""))) {ventasresumidosventasBean.setdia(ventasresumidosventasLocal.getdia());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.gettotal_iva()!=null && !ventasresumidosventasLocal.gettotal_iva().equals(0.0))) {ventasresumidosventasBean.settotal_iva(ventasresumidosventasLocal.gettotal_iva());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.gettotal_sin_iva()!=null && !ventasresumidosventasLocal.gettotal_sin_iva().equals(0.0))) {ventasresumidosventasBean.settotal_sin_iva(ventasresumidosventasLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.gettotal_flete()!=null && !ventasresumidosventasLocal.gettotal_flete().equals(0.0))) {ventasresumidosventasBean.settotal_flete(ventasresumidosventasLocal.gettotal_flete());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.getiva()!=null && !ventasresumidosventasLocal.getiva().equals(0.0))) {ventasresumidosventasBean.setiva(ventasresumidosventasLocal.getiva());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.getnombre_anio()!=null && !ventasresumidosventasLocal.getnombre_anio().equals(""))) {ventasresumidosventasBean.setnombre_anio(ventasresumidosventasLocal.getnombre_anio());}
			if(conDefault || (!conDefault && ventasresumidosventasLocal.getnombre_mes()!=null && !ventasresumidosventasLocal.getnombre_mes().equals(""))) {ventasresumidosventasBean.setnombre_mes(ventasresumidosventasLocal.getnombre_mes());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasResumidosVentasGenerico(Long idVentasResumidosVentasSeleccionado,JComboBox jComboBoxVentasResumidosVentas,List<VentasResumidosVentas> ventasresumidosventassLocal)throws Exception {
		try {
			VentasResumidosVentas  ventasresumidosventasTemp=null;

			for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassLocal) {
				if(ventasresumidosventasAux.getId()!=null && ventasresumidosventasAux.getId().equals(idVentasResumidosVentasSeleccionado)) {
					ventasresumidosventasTemp=ventasresumidosventasAux;
					break;
				}
			}

			jComboBoxVentasResumidosVentas.setSelectedItem(ventasresumidosventasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasResumidosVentasGenerico(JComboBox jComboBoxVentasResumidosVentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidosVentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasResumidosVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasResumidosVentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasResumidosVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidosventas=(VentasResumidosVentas) ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidosventas =(VentasResumidosVentas) ventasresumidosventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventasresumidosventas.getIsNew() && !ventasresumidosventas.getIsChanged() && !ventasresumidosventas.getIsDeleted()) {
				sDescripcion=ventasresumidosventas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventasresumidosventas.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasResumidosVentas ventasresumidosventasRow=new VentasResumidosVentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidosventasRow=(VentasResumidosVentas) ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasresumidosventasRow=(VentasResumidosVentas) ventasresumidosventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasResumidosVentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));			
			this.jButtonDuplicarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidosVentas && this.isPermisoDuplicarVentasResumidosVentas));			
			this.jButtonCopiarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaCopiarVentasResumidosVentas && this.isPermisoCopiarVentasResumidosVentas));
			this.jButtonVerFormVentasResumidosVentas.setVisible((this.isVisibilidadCeldaVerFormVentasResumidosVentas && this.isPermisoVerFormVentasResumidosVentas));
			
			this.jButtonAbrirOrderByVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));			
			
			this.jButtonNuevoRelacionesVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));			
			this.jButtonNuevoGuardarCambiosVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaModificarVentasResumidosVentas && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaActualizarVentasResumidosVentas && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaEliminarVentasResumidosVentas && this.isPermisoEliminarVentasResumidosVentas));
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.setVisible(this.isVisibilidadCeldaCancelarVentasResumidosVentas);							
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));						
			this.jButtonDuplicarToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidosVentas && this.isPermisoDuplicarVentasResumidosVentas));						
			this.jButtonCopiarToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaCopiarVentasResumidosVentas && this.isPermisoCopiarVentasResumidosVentas));			
			this.jButtonVerFormToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaVerFormVentasResumidosVentas && this.isPermisoVerFormVentasResumidosVentas));			
			this.jButtonAbrirOrderByToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));
			this.jButtonNuevoRelacionesToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));			
			this.jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));			
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaModificarVentasResumidosVentas && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaActualizarVentasResumidosVentas  && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaEliminarVentasResumidosVentas && this.isPermisoEliminarVentasResumidosVentas));
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarToolBarVentasResumidosVentas.setVisible(this.isVisibilidadCeldaCancelarVentasResumidosVentas);				
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));			
			this.jMenuItemDuplicarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaDuplicarVentasResumidosVentas && this.isPermisoDuplicarVentasResumidosVentas));			
			this.jMenuItemCopiarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaCopiarVentasResumidosVentas && this.isPermisoCopiarVentasResumidosVentas));			
			this.jMenuItemVerFormVentasResumidosVentas.setVisible((this.isVisibilidadCeldaVerFormVentasResumidosVentas && this.isPermisoVerFormVentasResumidosVentas));			
			this.jMenuItemAbrirOrderByVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));			
			//this.jMenuItemMostrarOcultarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));
			this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));			
			//this.jMenuItemDetalleMostrarOcultarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaOrdenVentasResumidosVentas && this.isPermisoOrdenVentasResumidosVentas));			
			this.jMenuItemNuevoRelacionesVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas));			
			this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas.setVisible((this.isVisibilidadCeldaNuevoVentasResumidosVentas && this.isPermisoNuevoVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));									
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemModificarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaModificarVentasResumidosVentas && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemActualizarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaActualizarVentasResumidosVentas && this.isPermisoActualizarVentasResumidosVentas));	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemEliminarVentasResumidosVentas.setVisible((this.isVisibilidadCeldaEliminarVentasResumidosVentas && this.isPermisoEliminarVentasResumidosVentas));
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemCancelarVentasResumidosVentas.setVisible(this.isVisibilidadCeldaCancelarVentasResumidosVentas);				
			}
			
			this.jMenuItemGuardarCambiosVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));						
			this.jMenuItemGuardarCambiosTablaVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=this.jButtonNuevoVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaDuplicarVentasResumidosVentas=this.jButtonDuplicarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaCopiarVentasResumidosVentas=this.jButtonCopiarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaVerFormVentasResumidosVentas=this.jButtonVerFormVentasResumidosVentas.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasResumidosVentas=this.jButtonAbrirOrderByVentasResumidosVentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=this.jButtonNuevoRelacionesVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaModificarVentasResumidosVentas=this.jButtonModificarVentasResumidosVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaGuardarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=this.jButtonGuardarCambiosTablaVentasResumidosVentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=this.jButtonNuevoToolBarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=this.jButtonNuevoRelacionesToolBarVentasResumidosVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.isVisibilidadCeldaModificarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarToolBarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarToolBarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarToolBarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarToolBarVentasResumidosVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidosVentas=this.jButtonGuardarCambiosToolBarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=this.jMenuItemNuevoVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=this.jMenuItemNuevoRelacionesVentasResumidosVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.isVisibilidadCeldaModificarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemModificarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemActualizarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemEliminarVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemCancelarVentasResumidosVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasResumidosVentas=this.jMenuItemGuardarCambiosVentasResumidosVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=this.jMenuItemGuardarCambiosTablaVentasResumidosVentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasResumidosVentas(Boolean esInicializar) {
		if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
				//if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidosVentas();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasResumidosVentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasResumidosVentas() {
		this.jButtonNuevoVentasResumidosVentas.setVisible(this.isPermisoNuevoVentasResumidosVentas);			
		this.jButtonDuplicarVentasResumidosVentas.setVisible(this.isPermisoDuplicarVentasResumidosVentas);			
		this.jButtonCopiarVentasResumidosVentas.setVisible(this.isPermisoCopiarVentasResumidosVentas);			
		this.jButtonVerFormVentasResumidosVentas.setVisible(this.isPermisoVerFormVentasResumidosVentas);			
		
		this.jButtonAbrirOrderByVentasResumidosVentas.setVisible(this.isPermisoOrdenVentasResumidosVentas);					
		
		this.jButtonNuevoRelacionesVentasResumidosVentas.setVisible(this.isPermisoNuevoVentasResumidosVentas);			
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarVentasResumidosVentas.setVisible(this.isPermisoActualizarVentasResumidosVentas);	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.setVisible(this.isPermisoActualizarVentasResumidosVentas);	
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.setVisible(this.isPermisoEliminarVentasResumidosVentas);
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.setVisible(this.isVisibilidadCeldaCancelarVentasResumidosVentas);						
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.setVisible(this.isPermisoGuardarCambiosVentasResumidosVentas);							
		}
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.setVisible(this.isPermisoActualizarVentasResumidosVentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidosVentas() {
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarVentasResumidosVentas.setVisible(this.isPermisoActualizarVentasResumidosVentas);	
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.setVisible(this.isPermisoActualizarVentasResumidosVentas);	
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.setVisible(this.isPermisoEliminarVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.setVisible(this.isVisibilidadCeldaCancelarVentasResumidosVentas);							
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.setVisible((this.isVisibilidadCeldaGuardarVentasResumidosVentas && this.isPermisoGuardarCambiosVentasResumidosVentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasResumidosVentas() {
		if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasResumidosVentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasResumidosVentas() {
	}
	
	public void jTableDatosVentasResumidosVentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasResumidosVentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventasresumidosventas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasResumidosVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasResumidosVentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasResumidosVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasResumidosVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventasresumidosventasLogic.getConnexion());

				if(this.ventasresumidosventas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventasresumidosventas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasResumidosVentas=(TitledBorder)this.jScrollPanelDatosVentasResumidosVentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasResumidosVentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventasresumidosventas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventasresumidosventas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventasresumidosventas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getdia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia like '%"+this.ventasresumidosventas.getdia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.ventasresumidosventas.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.ventasresumidosventas.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_fleteVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.gettotal_flete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_flete = "+this.ventasresumidosventas.gettotal_flete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.ventasresumidosventas.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_anioVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getnombre_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_anio like '%"+this.ventasresumidosventas.getnombre_anio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_mesVentasResumidosVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.getventasresumidosventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasresumidosventas==null) {
						this.ventasresumidosventas = new VentasResumidosVentas();
					}

					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);
				}

				if(this.ventasresumidosventas.getnombre_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_mes like '%"+this.ventasresumidosventas.getnombre_mes()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasResumidosVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasResumidosVentasVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);

			this.getVentasResumidosVentassBusquedaVentasResumidosVentas();

			this.inicializarActualizarBindingVentasResumidosVentas(false);

			//if(VentasResumidosVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasResumidosVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);

			this.getVentasResumidosVentassFK_IdEmpresa();

			this.inicializarActualizarBindingVentasResumidosVentas(false);

			//if(VentasResumidosVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasresumidosventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasResumidosVentas() {
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasResumidosVentas.dispose();
			this.jInternalFrameDetalleFormVentasResumidosVentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
			this.jInternalFrameReporteDinamicoVentasResumidosVentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasResumidosVentas.dispose();
			this.jInternalFrameReporteDinamicoVentasResumidosVentas=null;
		}
		
		if(this.jInternalFrameImportacionVentasResumidosVentas!=null) {
			this.jInternalFrameImportacionVentasResumidosVentas.setVisible(false);	    			
			this.jInternalFrameImportacionVentasResumidosVentas.dispose();
			this.jInternalFrameImportacionVentasResumidosVentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasResumidosVentas();
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasResumidosVentas")) {
				jButtonDuplicarVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasResumidosVentas")) {
				jButtonCopiarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasResumidosVentas")) {
				jButtonVerFormVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasResumidosVentas")) {
				jButtonDuplicarVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasResumidosVentas")) {
				jButtonDuplicarVentasResumidosVentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasResumidosVentas")) {
				jButtonModificarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasResumidosVentas")) {
				jButtonModificarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasResumidosVentas")) {
				jButtonModificarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasResumidosVentas")) {
				jButtonActualizarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasResumidosVentas")) {
				jButtonActualizarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasResumidosVentas")) {
				jButtonActualizarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasResumidosVentas")) {
				jButtonEliminarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasResumidosVentas")) {
				jButtonEliminarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasResumidosVentas")) {
				jButtonEliminarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasResumidosVentas")) {
				jButtonCancelarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasResumidosVentas")) {
				jButtonCancelarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasResumidosVentas")) {
				jButtonCancelarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasResumidosVentas")) {
				jButtonCerrarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasResumidosVentas")) {
				jButtonCerrarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasResumidosVentas")) {
				jButtonCerrarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasResumidosVentas")) {
				jButtonMostrarOcultarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasResumidosVentas")) {
				jButtonCancelarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasResumidosVentas")) {
				jButtonCopiarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasResumidosVentas")) {
				jButtonVerFormVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasResumidosVentas")) {
				jButtonCopiarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasResumidosVentas")) {
				jButtonVerFormVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasResumidosVentas")) {
				jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasResumidosVentas")) {
				jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasResumidosVentas")) {
				jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasResumidosVentas")) {
				jButtonAnterioresVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasResumidosVentas")) {
				jButtonAnterioresVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasResumidosVentas")) {
				jButtonAnterioresVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasResumidosVentas")) {
				jButtonSiguientesVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasResumidosVentas")) {
				jButtonSiguientesVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasResumidosVentas")) {
				jButtonSiguientesVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasResumidosVentas") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasResumidosVentas")) {
				jButtonAbrirOrderByVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasResumidosVentas") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasResumidosVentas")) {
				jButtonMostrarOcultarVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidosVentas")) {
				jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasResumidosVentas")) {
				jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasResumidosVentas")) {
				jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasResumidosVentas")) {
				jButtonCerrarReporteDinamicoVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasResumidosVentas")) {
				jButtonGenerarReporteDinamicoVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasResumidosVentas")) {
				
				jButtonGenerarExcelReporteDinamicoVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasResumidosVentas")) {
				jButtonCerrarImportacionVentasResumidosVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasResumidosVentas")) {
				
				jButtonGenerarImportacionVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasResumidosVentas")) {
				
				jButtonAbrirImportacionVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasResumidosVentas")) {
				jComboBoxTiposAccionesVentasResumidosVentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasResumidosVentas")) {
				jComboBoxTiposRelacionesVentasResumidosVentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasResumidosVentas")) {
				jComboBoxTiposAccionesVentasResumidosVentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasResumidosVentas")) {
				
				jComboBoxTiposSeleccionarVentasResumidosVentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasResumidosVentas")) {
				jTextFieldValorCampoGeneralVentasResumidosVentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasResumidosVentas")) {
				jButtonAbrirOrderByVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasResumidosVentas")) {
				jButtonAbrirOrderByVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasResumidosVentas")) {
				jButtonCerrarOrderByVentasResumidosVentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidosVentasBusqueda")) {
				this.jButtonidVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosVentasUpdate")) {
				this.jButtonid_empresaVentasResumidosVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosVentasBusqueda")) {
				this.jButtonid_empresaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidosVentasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidosVentasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaVentasResumidosVentasBusqueda")) {
				this.jButtondiaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaVentasResumidosVentasBusqueda")) {
				this.jButtontotal_ivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaVentasResumidosVentasBusqueda")) {
				this.jButtontotal_sin_ivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_fleteVentasResumidosVentasBusqueda")) {
				this.jButtontotal_fleteVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentasResumidosVentasBusqueda")) {
				this.jButtonivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_anioVentasResumidosVentasBusqueda")) {
				this.jButtonnombre_anioVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_mesVentasResumidosVentasBusqueda")) {
				this.jButtonnombre_mesVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasResumidosVentasVentasResumidosVentas")) {
				this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentasActionPerformed(evt);
			}
			
			;
			
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasResumidosVentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasResumidosVentas ventasresumidosventasLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventasresumidosventasLocal=this.ventasresumidosventas;
			} else {
				ventasresumidosventasLocal=this.ventasresumidosventasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
							
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
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
			
			


			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
								
						
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
								
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
							
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
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
			
			


			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
								
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasResumidosVentas")) {
					jCheckBoxSeleccionarTodosVentasResumidosVentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasResumidosVentas")) {
					jCheckBoxSeleccionadosVentasResumidosVentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasResumidosVentas")) {
					
				}
				
				


				
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
												
				
				


				
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
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
			
			


			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasResumidosVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasresumidosventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasresumidosventas);
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
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
				
				


				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasResumidosVentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasResumidosVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasResumidosVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasresumidosventasAnterior =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasResumidosVentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasResumidosVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasResumidosVentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventasresumidosventas =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventasresumidosventas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasResumidosVentas")) {
				
				}
				
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasResumidosVentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasResumidosVentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasResumidosVentas")) {
			
			}
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasResumidosVentas();
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			if(sTipo.equals("NuevoVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasResumidosVentas")) {
				jButtonDuplicarVentasResumidosVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasResumidosVentas")) {
				jButtonCopiarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasResumidosVentas")) {
				jButtonVerFormVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasResumidosVentas")) {
				jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasResumidosVentas")) {
				jButtonModificarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasResumidosVentas")) {
				jButtonActualizarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasResumidosVentas")) {
				jButtonEliminarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasResumidosVentas")) {
				jButtonCancelarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasResumidosVentas")) {
				jButtonCerrarVentasResumidosVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasResumidosVentas")) {
				jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasResumidosVentas")) {
				jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasResumidosVentas")) {
				jButtonAbrirOrderByVentasResumidosVentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasResumidosVentas")) {
				jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasResumidosVentas")) {
				jButtonAnterioresVentasResumidosVentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasResumidosVentas")) {
				jButtonSiguientesVentasResumidosVentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasResumidosVentasBusqueda")) {
				this.jButtonidVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosVentasUpdate")) {
				this.jButtonid_empresaVentasResumidosVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasResumidosVentasBusqueda")) {
				this.jButtonid_empresaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasResumidosVentasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasResumidosVentasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaVentasResumidosVentasBusqueda")) {
				this.jButtondiaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaVentasResumidosVentasBusqueda")) {
				this.jButtontotal_ivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaVentasResumidosVentasBusqueda")) {
				this.jButtontotal_sin_ivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_fleteVentasResumidosVentasBusqueda")) {
				this.jButtontotal_fleteVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentasResumidosVentasBusqueda")) {
				this.jButtonivaVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_anioVentasResumidosVentasBusqueda")) {
				this.jButtonnombre_anioVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_mesVentasResumidosVentasBusqueda")) {
				this.jButtonnombre_mesVentasResumidosVentasBusquedaActionPerformed(evt);
			}
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasResumidosVentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasResumidosVentas")) {
				closingInternalFrameVentasResumidosVentas();
				
			} else if(sTipo.equals("jButtonCancelarVentasResumidosVentas")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasResumidosVentas = (JInternalFrameBase)evt.getSource();
	            	
	            VentasResumidosVentasBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidosVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidosVentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasResumidosVentasActionPerformed(null);
			}
			
			VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasresumidosventas,new Object(),this.ventasresumidosventasParameterGeneral,this.ventasresumidosventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasResumidosVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasResumidosVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasResumidosVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventasresumidosventas)) {
			if(!esControlTabla) {
				if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);			
				}
				
				if(this.ventasresumidosventasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasResumidosVentas(this.ventasresumidosventasReturnGeneral,this.ventasresumidosventasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventasresumidosventasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidosVentas(classes,this.ventasresumidosventasReturnGeneral,this.ventasresumidosventasBean,false);
					}
						
					if(this.ventasresumidosventasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas());	
					}
						
					if(this.ventasresumidosventasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas(),classes);//this.ventasresumidosventasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasResumidosVentas(this.ventasresumidosventas,classes);//this.ventasresumidosventasBean);									
				}
			
				if(VentasResumidosVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasResumidosVentas(this.ventasresumidosventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasResumidosVentas(this.ventasresumidosventas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventasresumidosventasAnterior!=null) {
						this.ventasresumidosventas=this.ventasresumidosventasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventasresumidosventasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventasresumidosventasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas(),ventasresumidosventasLogic.getVentasResumidosVentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentas(),this.ventasresumidosventass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasResumidosVentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasResumidosVentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasResumidosVentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasResumidosVentas() throws Exception {
		
		VentasResumidosVentasModel ventasresumidosventasModel=(VentasResumidosVentasModel)this.jTableDatosVentasResumidosVentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasresumidosventasModel.ventasresumidosventass=this.ventasresumidosventasLogic.getVentasResumidosVentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventasresumidosventasModel.ventasresumidosventass=this.ventasresumidosventass;
		}
		
		
		((VentasResumidosVentasModel) this.jTableDatosVentasResumidosVentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasResumidosVentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventasresumidosventasAnterior(),this.ventasresumidosventasLogic.getVentasResumidosVentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventasresumidosventasAnterior(),this.ventasresumidosventass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasResumidosVentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
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
										
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidosventas,new Object(),generalEntityParameterGeneral,this.ventasresumidosventasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasResumidosVentasConstantesFunciones.getClassesRelationshipsOfVentasResumidosVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasResumidosVentasConstantesFunciones.getClassesRelationshipsFromStringsOfVentasResumidosVentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasResumidosVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasResumidosVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasresumidosventas,new Object(),generalEntityParameterGeneral,this.ventasresumidosventasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasResumidosVentas(VentasResumidosVentasBean ventasresumidosventasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasResumidosVentas(ArrayList<Classe> classes,VentasResumidosVentasReturnGeneral ventasresumidosventasReturnGeneral,VentasResumidosVentasBean ventasresumidosventasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventasresumidosventas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasResumidosVentas = new VentasResumidosVentasDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidosventasSessionBean.getConGuardarRelaciones(),this.ventasresumidosventasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.setVisible(false);
		this.jInternalFrameDetalleFormVentasResumidosVentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.ventasresumidosventasLogic=this.ventasresumidosventasLogic;
		
		this.cargarCombosFrameForeignKeyVentasResumidosVentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasResumidosVentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasResumidosVentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasResumidosVentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasResumidosVentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidosVentas"));
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidosVentas"));

		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidosVentas"));
					
		this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemModificarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidosVentas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidosVentas"));
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidosVentas"));
						
		this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemActualizarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidosVentas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidosVentas"));
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidosVentas"));
								
		this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemEliminarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidosVentas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidosVentas"));
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidosVentas"));
					
		this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemCancelarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidosVentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemDetalleCerrarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidosVentas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidosVentas"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidosVentas"));
		
		
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidosVentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonidVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtondiaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"diaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_fleteVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_fleteVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_anioVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_anioVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_mesVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesVentasResumidosVentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidosVentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasResumidosVentas"));
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasResumidosVentas"));
		}
		
		this.jTableDatosVentasResumidosVentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasResumidosVentas"));
		
		this.jTableDatosVentasResumidosVentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasResumidosVentas"));
		
		this.jButtonNuevoVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"NuevoVentasResumidosVentas"));
		
		this.jButtonDuplicarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"DuplicarVentasResumidosVentas"));
		
		this.jButtonCopiarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"CopiarVentasResumidosVentas"));
		
		this.jButtonVerFormVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"VerFormVentasResumidosVentas"));
		
		
		this.jButtonNuevoToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasResumidosVentas"));
			
		this.jButtonDuplicarToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasResumidosVentas"));
			
		this.jMenuItemNuevoVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasResumidosVentas"));
			
		this.jMenuItemDuplicarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasResumidosVentas"));		
		
		
		this.jButtonNuevoRelacionesVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasResumidosVentas"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasResumidosVentas"));
			
		this.jMenuItemNuevoRelacionesVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasResumidosVentas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ModificarVentasResumidosVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonModificarToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasResumidosVentas"));
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemModificarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasResumidosVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"ActualizarVentasResumidosVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonActualizarToolBarVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasResumidosVentas"));
				
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemActualizarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasResumidosVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"EliminarVentasResumidosVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonEliminarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasResumidosVentas"));
						
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemEliminarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasResumidosVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CancelarVentasResumidosVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonCancelarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasResumidosVentas"));
			
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemCancelarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasResumidosVentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasResumidosVentas"));		
		
		
		this.jButtonCerrarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CerrarVentasResumidosVentas"));
		
		
		this.jButtonCerrarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasResumidosVentas"));
			
		this.jMenuItemCerrarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasResumidosVentas"));
			
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jMenuItemDetalleCerrarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasResumidosVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasResumidosVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasResumidosVentas"));
		}
		
		this.jButtonCopiarToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasResumidosVentas"));
			
		this.jButtonVerFormToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasResumidosVentas"));
		
		this.jMenuItemGuardarCambiosVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasResumidosVentas"));
			
		this.jMenuItemCopiarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasResumidosVentas"));		
		
		this.jMenuItemVerFormVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasResumidosVentas"));		
		
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidosVentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasResumidosVentas"));
			
		this.jMenuItemGuardarCambiosTablaVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasResumidosVentas"));		
		
		
		
		this.jButtonRecargarInformacionVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasResumidosVentas"));
					
		this.jButtonRecargarInformacionToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasResumidosVentas"));
		
		this.jMenuItemRecargarInformacionVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasResumidosVentas"));		
		
		
		
		this.jButtonAnterioresVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"AnterioresVentasResumidosVentas"));
		
		
		this.jButtonAnterioresToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasResumidosVentas"));
		
		this.jMenuItemAnterioresVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasResumidosVentas"));		
		
		
		this.jButtonSiguientesVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"SiguientesVentasResumidosVentas"));
		
		
		this.jButtonSiguientesToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasResumidosVentas"));
			
		this.jMenuItemSiguientesVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasResumidosVentas"));
			
		this.jMenuItemAbrirOrderByVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasResumidosVentas"));
			
		this.jMenuItemMostrarOcultarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasResumidosVentas"));
			
		this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasResumidosVentas"));
			
		this.jMenuItemDetalleMostarOcultarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasResumidosVentas"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasResumidosVentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasResumidosVentas"));
			
		this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasResumidosVentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasResumidosVentas"));

		this.jCheckBoxSeleccionadosVentasResumidosVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasResumidosVentas"));
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasResumidosVentas"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasResumidosVentas"));
			
		this.jComboBoxTiposAccionesVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasResumidosVentas"));
					
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasResumidosVentas"));
			
		this.jTextFieldValorCampoGeneralVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasResumidosVentas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonidVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtondiaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"diaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_fleteVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_fleteVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_anioVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_anioVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_mesVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesVentasResumidosVentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidosVentasVentasResumidosVentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasResumidosVentas!=null) {
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidosVentas"));
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidosVentas"));
				this.jInternalFrameReporteDinamicoVentasResumidosVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidosVentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasResumidosVentas"));				
			//this.jButtonGenerarReporteDinamicoVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasResumidosVentas"));
			//this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasResumidosVentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasResumidosVentas!=null) {
				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasResumidosVentas"));
				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasResumidosVentas"));
				this.jInternalFrameImportacionVentasResumidosVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasResumidosVentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasResumidosVentas"));
			
			this.jButtonAbrirOrderByToolBarVentasResumidosVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasResumidosVentas"));			
			
			if(this.jInternalFrameOrderByVentasResumidosVentas!=null) {
				this.jInternalFrameOrderByVentasResumidosVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasResumidosVentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasResumidosVentas.jTabbedPaneRelacionesVentasResumidosVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasResumidosVentas"));
		
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
            		closingInternalFrameVentasResumidosVentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasResumidosVentas = (JInternalFrameBase)event.getSource();
	            	
	            VentasResumidosVentasBeanSwingJInternalFrame jInternalFrameParent=(VentasResumidosVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasResumidosVentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasResumidosVentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasResumidosVentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasResumidosVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasResumidosVentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasResumidosVentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasResumidosVentas";
		inputMap = this.jButtonNuevoVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasResumidosVentas";
		inputMap = this.jButtonNuevoRelacionesVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasResumidosVentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasResumidosVentas";
		inputMap = this.jButtonModificarVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasResumidosVentas";
		inputMap = this.jButtonActualizarVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasResumidosVentas";
		inputMap = this.jButtonEliminarVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasResumidosVentas";
		inputMap = this.jButtonCancelarVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasResumidosVentas";
		inputMap = this.jButtonCerrarVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasResumidosVentas";
		inputMap = this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonGuardarCambiosVentasResumidosVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasResumidosVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasResumidosVentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasResumidosVentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasResumidosVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasResumidosVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasResumidosVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasResumidosVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasResumidosVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasResumidosVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonidVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasResumidosVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonid_empresaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtondiaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"diaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtontotal_fleteVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"total_fleteVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonivaVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_anioVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_anioVentasResumidosVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasResumidosVentas.jButtonnombre_mesVentasResumidosVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_mesVentasResumidosVentasBusqueda"));
		
		
		this.jButtonBusquedaVentasResumidosVentasVentasResumidosVentas.addActionListener(new ButtonActionListener(this,"BusquedaVentasResumidosVentasVentasResumidosVentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasResumidosVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasResumidosVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasResumidosVentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasResumidosVentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasResumidosVentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
					ventasresumidosventasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventass) {
					ventasresumidosventasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasResumidosVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
						ventasresumidosventasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventass) {
						ventasresumidosventasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidosVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidosVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasResumidosVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasResumidosVentas.getSelectedRows();
			
			VentasResumidosVentas ventasresumidosventasLocal=new VentasResumidosVentas();
			
			//this.seleccionarTodosVentasResumidosVentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventasresumidosventasLocal =(VentasResumidosVentas) this.ventasresumidosventasLogic.getVentasResumidosVentass().toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventasresumidosventasLocal =(VentasResumidosVentas) this.ventasresumidosventass.toArray()[this.jTableDatosVentasResumidosVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventasresumidosventasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
						ventasresumidosventasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventass) {
						ventasresumidosventasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasResumidosVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasResumidosVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasResumidosVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasResumidosVentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasResumidosVentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasResumidosVentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasResumidosVentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventasLogic.getVentasResumidosVentass()) {
				
						if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidosventasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidosventasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_DIA)) {
							existe=true;
							ventasresumidosventasAux.setdia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							ventasresumidosventasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							ventasresumidosventasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE)) {
							existe=true;
							ventasresumidosventasAux.settotal_flete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventasresumidosventasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO)) {
							existe=true;
							ventasresumidosventasAux.setnombre_anio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES)) {
							existe=true;
							ventasresumidosventasAux.setnombre_mes(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventass) {
					
						if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasresumidosventasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasresumidosventasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_DIA)) {
							existe=true;
							ventasresumidosventasAux.setdia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							ventasresumidosventasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							ventasresumidosventasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE)) {
							existe=true;
							ventasresumidosventasAux.settotal_flete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventasresumidosventasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO)) {
							existe=true;
							ventasresumidosventasAux.setnombre_anio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES)) {
							existe=true;
							ventasresumidosventasAux.setnombre_mes(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasResumidosVentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasResumidosVentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasResumidosVentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasResumidosVentas) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasResumidosVentas(conSplash);
				
					this.generarReporteVentasResumidosVentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasResumidosVentassSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidosVentassSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasResumidosVentassSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidosVentas();
				
				this.exportarVentasResumidosVentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasResumidosVentass();
				//this.importarVentasResumidosVentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasResumidosVentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasResumidosVentassSeleccionados();
				//this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Resumidos Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasResumidosVentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasResumidosVentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasResumidosVentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasResumidosVentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasResumidosVentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasResumidosVentas(conSplash);
					
						//this.actualizarParametrosGeneralVentasResumidosVentas();
						
						this.generarReporteProcesoAccionVentasResumidosVentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasResumidosVentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas Resumidos VentasES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Resumidos Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasResumidosVentas();
				
						this.actualizarParametrosGeneralVentasResumidosVentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventasresumidosventasReturnGeneral=ventasresumidosventasLogic.procesarAccionVentasResumidosVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventasresumidosventasLogic.getVentasResumidosVentass(),this.ventasresumidosventasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasResumidosVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasResumidosVentas();
					
					VentasResumidosVentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasResumidosVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasResumidosVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasResumidosVentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasResumidosVentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasResumidosVentas();
			
			if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
			VentasResumidosVentas ventasresumidosventas=new VentasResumidosVentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasResumidosVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasResumidosVentas.getSelectedItem();
			
			
			
			
			ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventasresumidosventassSeleccionados.size()==1) {
				for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
					ventasresumidosventas=ventasresumidosventasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasResumidosVentas();
			
      		//this.finishProcessVentasResumidosVentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasResumidosVentasReturnGeneral() throws Exception {
		if(this.ventasresumidosventasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidosventasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventasresumidosventasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventasresumidosventasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventasresumidosventasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventasresumidosventasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasResumidosVentas(false);
		}
		
		if(this.ventasresumidosventasReturnGeneral.getConRetornoLista() || this.ventasresumidosventasReturnGeneral.getConRetornoObjeto()) {
			if(this.ventasresumidosventasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventasresumidosventasLogic.setVentasResumidosVentass(this.ventasresumidosventasReturnGeneral.getVentasResumidosVentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasResumidosVentas(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasResumidosVentas() throws Exception {
		
		
	}
	
	public ArrayList<VentasResumidosVentas> getVentasResumidosVentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasResumidosVentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventasLogic.getVentasResumidosVentass()) {
					if(ventasresumidosventasAux.getIsSelected()) {
						ventasresumidosventassSeleccionados.add(ventasresumidosventasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasResumidosVentas ventasresumidosventasAux:this.ventasresumidosventass) {
					if(ventasresumidosventasAux.getIsSelected()) {
						ventasresumidosventassSeleccionados.add(ventasresumidosventasAux);				
					}
				}
			}
			
			if(ventasresumidosventassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventasresumidosventassSeleccionados.addAll(this.ventasresumidosventasLogic.getVentasResumidosVentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventasresumidosventassSeleccionados.addAll(this.ventasresumidosventass);				
					}
				}
			}
		} else {
			ventasresumidosventassSeleccionados.add(this.ventasresumidosventas);
		}
		
		return ventasresumidosventassSeleccionados;
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
	
	public void generarReporteVentasResumidosVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasResumidosVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasResumidosVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidosVentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasResumidosVentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Resumidos Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasResumidosVentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasResumidosVentas();
		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasResumidosVentas();
		
		
		//this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados ,ventasresumidosventasImplementable,ventasresumidosventasImplementableHome);
	}
	
	public void mostrarImportacionVentasResumidosVentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasResumidosVentas();
		
		this.abrirFrameImportacionVentasResumidosVentas();		
		
			
		//this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados ,ventasresumidosventasImplementable,ventasresumidosventasImplementableHome);
	}
	
	public void importarVentasResumidosVentass() throws Exception {		
	
	}
	
	public void exportarVentasResumidosVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasResumidosVentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasResumidosVentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasResumidosVentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Resumidos Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasResumidosVentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasResumidosVentas(ventasresumidosventasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventasresumidosventasAux.setsDetalleGeneralEntityReporte(ventasresumidosventasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasResumidosVentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_DIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventasresumidosventas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getdia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.gettotal_flete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getnombre_anio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasresumidosventas.getnombre_mes();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasResumidosVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasResumidosVentas(row);				
				iRow++;
			}				
			
			for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasResumidosVentas(ventasresumidosventasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasResumidosVentassSeleccionados() throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();		
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasresumidosventas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventasresumidosventass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventasresumidosventas");
			//elementRoot.appendChild(element);
		
			for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
				element = document.createElement("ventasresumidosventas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasResumidosVentas(ventasresumidosventasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Resumidos Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasResumidosVentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_DIA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getdia());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.gettotal_flete());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getnombre_anio());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasresumidosventas.getnombre_mes());				
	}
	
	public void setFilaDatosExportarXmlVentasResumidosVentas(VentasResumidosVentas ventasresumidosventas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasResumidosVentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventasresumidosventas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasResumidosVentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventasresumidosventas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasResumidosVentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventasresumidosventas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasResumidosVentasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventasresumidosventas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasResumidosVentasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventasresumidosventas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementdia = document.createElement(VentasResumidosVentasConstantesFunciones.DIA);
		elementdia.appendChild(document.createTextNode(ventasresumidosventas.getdia().trim()));
		element.appendChild(elementdia);

		Element elementtotal_iva = document.createElement(VentasResumidosVentasConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(ventasresumidosventas.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(VentasResumidosVentasConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(ventasresumidosventas.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementtotal_flete = document.createElement(VentasResumidosVentasConstantesFunciones.TOTALFLETE);
		elementtotal_flete.appendChild(document.createTextNode(ventasresumidosventas.gettotal_flete().toString().trim()));
		element.appendChild(elementtotal_flete);

		Element elementiva = document.createElement(VentasResumidosVentasConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(ventasresumidosventas.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementnombre_anio = document.createElement(VentasResumidosVentasConstantesFunciones.NOMBREANIO);
		elementnombre_anio.appendChild(document.createTextNode(ventasresumidosventas.getnombre_anio().trim()));
		element.appendChild(elementnombre_anio);

		Element elementnombre_mes = document.createElement(VentasResumidosVentasConstantesFunciones.NOMBREMES);
		elementnombre_mes.appendChild(document.createTextNode(ventasresumidosventas.getnombre_mes().trim()));
		element.appendChild(elementnombre_mes);
	}
	
	public void generarReporteGroupGenericoVentasResumidosVentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados=new ArrayList<VentasResumidosVentas>();
		
		ventasresumidosventassSeleccionados=this.getVentasResumidosVentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasResumidosVentas(ventasresumidosventassSeleccionados);
		
		this.generarReporteVentasResumidosVentass("Todos",ventasresumidosventassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasResumidosVentas(ArrayList<VentasResumidosVentas> ventasresumidosventassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasResumidosVentas ventasresumidosventasAux:ventasresumidosventassSeleccionados) {
				ventasresumidosventasAux.setsDetalleGeneralEntityReporte(ventasresumidosventasAux.toString());
			
				if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(ventasresumidosventasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidosventasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasresumidosventasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_DIA)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(ventasresumidosventasAux.getdia());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(ventasresumidosventasAux.getnombre_anio());
				}
				 else if(sTipoSeleccionar.equals(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES)) {
					existe=true;
					ventasresumidosventasAux.setsDescripcionGeneralEntityReporte1(ventasresumidosventasAux.getnombre_mes());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasResumidosVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasResumidosVentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasResumidosVentas=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=true;
				this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=true;
			}
			
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=true;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=true;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=true;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=true;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=true;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
			this.isVisibilidadCeldaModificarVentasResumidosVentas=true;
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
			this.isVisibilidadCeldaCancelarVentasResumidosVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=true;
		} else {
			this.actualizarEstadoPanelsVentasResumidosVentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasResumidosVentas=false;
			//this.isVisibilidadCeldaVerFormVentasResumidosVentas=false;
			this.isVisibilidadCeldaDuplicarVentasResumidosVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			if(!ventasresumidosventasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;												
			}
			
			this.jButtonCerrarVentasResumidosVentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
		}
		
		if(!this.permiteMantenimiento(this.ventasresumidosventas)) {
			this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
			this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasResumidosVentas=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasResumidosVentas=false;
		this.isVisibilidadCeldaGuardarCambiosVentasResumidosVentas=false;
		//this.isVisibilidadCeldaModificarVentasResumidosVentas=true;
		this.isVisibilidadCeldaActualizarVentasResumidosVentas=false;
		this.isVisibilidadCeldaEliminarVentasResumidosVentas=false;
		//this.isVisibilidadCeldaCancelarVentasResumidosVentas=true;			
		this.isVisibilidadCeldaGuardarVentasResumidosVentas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasResumidosVentas() {
	}
	
	public void actualizarEstadoPanelsVentasResumidosVentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasResumidosVentas!=null) {
				this.jScrollPanelDatosEdicionVentasResumidosVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasResumidosVentas!=null) {
				this.jScrollPanelDatosVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasResumidosVentas!=null) {
				this.jPanelPaginacionVentasResumidosVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
					this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasResumidosVentas!=null) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasResumidosVentas!=null) {
				this.jPanelParametrosReportesVentasResumidosVentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasResumidosVentas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasResumidosVentas) {this.jTabbedPaneBusquedasVentasResumidosVentas.remove(jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);}
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
			
			this.inicializarActualizarBindingTablaVentasResumidosVentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasResumidosVentas() {
		this.updateBorderResaltarBusquedasFormularioVentasResumidosVentas();
		this.updateVisibilidadBusquedasFormularioVentasResumidosVentas();
		this.updateHabilitarBusquedasFormularioVentasResumidosVentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasResumidosVentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasResumidosVentas.getComponents().length>0) {
	

		if(this.ventasresumidosventasConstantesFunciones.resaltarBusquedaVentasResumidosVentasVentasResumidosVentas!=null) {
			index= this.jTabbedPaneBusquedasVentasResumidosVentas.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidosVentas.getComponent(index);
				jPanel.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarBusquedaVentasResumidosVentasVentasResumidosVentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasResumidosVentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasResumidosVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidosVentas.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidosVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarBusquedaVentasResumidosVentasVentasResumidosVentas);
			if(!this.ventasresumidosventasConstantesFunciones.mostrarBusquedaVentasResumidosVentasVentasResumidosVentas && index>-1) {
				this.jTabbedPaneBusquedasVentasResumidosVentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasResumidosVentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasResumidosVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasResumidosVentas.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidosVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventasresumidosventasConstantesFunciones.activarBusquedaVentasResumidosVentasVentasResumidosVentas);
				this.jTabbedPaneBusquedasVentasResumidosVentas.setEnabledAt(index,this.ventasresumidosventasConstantesFunciones.activarBusquedaVentasResumidosVentasVentasResumidosVentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasResumidosVentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasResumidosVentas")) {
			index= this.jTabbedPaneBusquedasVentasResumidosVentas.indexOfComponent(this.jPanelBusquedaVentasResumidosVentasVentasResumidosVentas);

			this.jTabbedPaneBusquedasVentasResumidosVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasResumidosVentas.getComponent(index);

			this.ventasresumidosventasConstantesFunciones.setResaltarBusquedaVentasResumidosVentasVentasResumidosVentas(resaltar);

			jPanel.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarBusquedaVentasResumidosVentasVentasResumidosVentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasResumidosVentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasResumidosVentas() throws Exception {

		if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasResumidosVentas();
		this.updateVisibilidadResaltarControlesFormularioVentasResumidosVentas();
		this.updateHabilitarResaltarControlesFormularioVentasResumidosVentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasResumidosVentas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventasresumidosventasConstantesFunciones.resaltaridVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltaridVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarid_empresaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarid_empresaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarfecha_emision_desdeVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_desdeVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarfecha_emision_desdeVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarfecha_emision_hastaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_hastaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarfecha_emision_hastaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltardiaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltardiaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltartotal_ivaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltartotal_ivaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltartotal_sin_ivaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltartotal_sin_ivaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltartotal_fleteVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltartotal_fleteVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarivaVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarivaVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarnombre_anioVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarnombre_anioVentasResumidosVentas);}
		if(this.ventasresumidosventasConstantesFunciones.resaltarnombre_mesVentasResumidosVentas!=null && this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setBorder(this.ventasresumidosventasConstantesFunciones.resaltarnombre_mesVentasResumidosVentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasResumidosVentas() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
	
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostraridVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelidVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostraridVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarid_empresaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelid_empresaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarid_empresaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_desdeVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarfecha_emision_desdeVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelfecha_emision_desdeVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarfecha_emision_desdeVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_hastaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarfecha_emision_hastaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelfecha_emision_hastaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarfecha_emision_hastaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrardiaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPaneldiaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrardiaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPaneltotal_ivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_ivaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_sin_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPaneltotal_sin_ivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_sin_ivaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_fleteVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPaneltotal_fleteVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrartotal_fleteVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelivaVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarivaVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarnombre_anioVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelnombre_anioVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarnombre_anioVentasResumidosVentas);
		//this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarnombre_mesVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jPanelnombre_mesVentasResumidosVentas.setVisible(this.ventasresumidosventasConstantesFunciones.mostrarnombre_mesVentasResumidosVentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasResumidosVentas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasResumidosVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasResumidosVentas!=null) {
	
		this.jInternalFrameDetalleFormVentasResumidosVentas.jLabelidVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activaridVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jComboBoxid_empresaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarid_empresaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_desdeVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarfecha_emision_desdeVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jDateChooserfecha_emision_hastaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarfecha_emision_hastaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFielddiaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activardiaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_ivaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activartotal_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_sin_ivaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activartotal_sin_ivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldtotal_fleteVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activartotal_fleteVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldivaVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarivaVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_anioVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarnombre_anioVentasResumidosVentas);
		this.jInternalFrameDetalleFormVentasResumidosVentas.jTextFieldnombre_mesVentasResumidosVentas.setEnabled(this.ventasresumidosventasConstantesFunciones.activarnombre_mesVentasResumidosVentas);
		}
	}
	
		
}