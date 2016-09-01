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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.FacturasPuntoVentaConstantesFunciones;
import com.bydan.erp.sris.util.report.FacturasPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.FacturasPuntoVentaParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.FacturasPuntoVentaBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
public class FacturasPuntoVentaBeanSwingJInternalFrame extends FacturasPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturasPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturasPuntoVenta> facturaspuntoventaValidator = new ClassValidator<FacturasPuntoVenta>(FacturasPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturasPuntoVenta facturaspuntoventa;	
	public FacturasPuntoVenta facturaspuntoventaAux;
	public FacturasPuntoVenta facturaspuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturasPuntoVenta facturaspuntoventaTotales;
	public Long idFacturasPuntoVentaActual;
	public Long iIdNuevoFacturasPuntoVenta=0L;
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
	
	public Boolean isPermisoTodoFacturasPuntoVenta;
	public Boolean isPermisoNuevoFacturasPuntoVenta;
	public Boolean isPermisoActualizarFacturasPuntoVenta;
	public Boolean isPermisoActualizarOriginalFacturasPuntoVenta;
	public Boolean isPermisoEliminarFacturasPuntoVenta;
	public Boolean isPermisoGuardarCambiosFacturasPuntoVenta;
	public Boolean isPermisoConsultaFacturasPuntoVenta;
	public Boolean isPermisoBusquedaFacturasPuntoVenta;
	public Boolean isPermisoReporteFacturasPuntoVenta;
	public Boolean isPermisoPaginacionMedioFacturasPuntoVenta;
	public Boolean isPermisoPaginacionAltoFacturasPuntoVenta;
	public Boolean isPermisoPaginacionTodoFacturasPuntoVenta;
	public Boolean isPermisoCopiarFacturasPuntoVenta;
	public Boolean isPermisoVerFormFacturasPuntoVenta;
	public Boolean isPermisoDuplicarFacturasPuntoVenta;
	public Boolean isPermisoOrdenFacturasPuntoVenta;
	
	
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
	
	public FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaReturnGeneral;
	public FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturasPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioFacturasPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturasPuntoVentaSessionBeanAdditional facturaspuntoventaSessionBeanAdditional=null;
	
	public FacturasPuntoVentaSessionBeanAdditional getFacturasPuntoVentaSessionBeanAdditional() {
		return this.facturaspuntoventaSessionBeanAdditional;
	}
	
	public void setFacturasPuntoVentaSessionBeanAdditional(FacturasPuntoVentaSessionBeanAdditional facturaspuntoventaSessionBeanAdditional) {
		try {
			this.facturaspuntoventaSessionBeanAdditional=facturaspuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturasPuntoVentaBeanSwingJInternalFrameAdditional facturaspuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class FacturasPuntoVentaBeanSwingJInternalFrame
	
	public FacturasPuntoVentaBeanSwingJInternalFrameAdditional getFacturasPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.facturaspuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturasPuntoVentaBeanSwingJInternalFrameAdditional(FacturasPuntoVentaBeanSwingJInternalFrameAdditional facturaspuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.facturaspuntoventaBeanSwingJInternalFrameAdditional=facturaspuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturasPuntoVentaLogic facturaspuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturasPuntoVenta facturaspuntoventaBean;
	public FacturasPuntoVentaConstantesFunciones facturaspuntoventaConstantesFunciones;
	//public FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<FacturasPuntoVenta> facturaspuntoventas;	
	//public List<FacturasPuntoVenta> facturaspuntoventasEliminados;
	//public List<FacturasPuntoVenta> facturaspuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarFacturasPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarFacturasPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormFacturasPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenFacturasPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarFacturasPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarFacturasPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturasPuntoVenta=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFacturasPuntoVenta() {
		return this.iIdNuevoFacturasPuntoVenta;
	}

	public void setiIdNuevoFacturasPuntoVenta(Long iIdNuevoFacturasPuntoVenta) {
		this.iIdNuevoFacturasPuntoVenta = iIdNuevoFacturasPuntoVenta;
	}
	
	public Long getidFacturasPuntoVentaActual() {
		return this.idFacturasPuntoVentaActual;
	}

	public void setidFacturasPuntoVentaActual(Long idFacturasPuntoVentaActual) {
		this.idFacturasPuntoVentaActual = idFacturasPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturasPuntoVenta getfacturaspuntoventa() {
		return this.facturaspuntoventa;
	}

	public void setfacturaspuntoventa(FacturasPuntoVenta facturaspuntoventa) {
		this.facturaspuntoventa = facturaspuntoventa;
	}
	
	public FacturasPuntoVenta getfacturaspuntoventaAux() {
		return this.facturaspuntoventaAux;
	}

	public void setfacturaspuntoventaAux(FacturasPuntoVenta facturaspuntoventaAux) {
		this.facturaspuntoventaAux = facturaspuntoventaAux;
	}				
	
	public FacturasPuntoVenta getfacturaspuntoventaAnterior() {
		return this.facturaspuntoventaAnterior;
	}

	public void setfacturaspuntoventaAnterior(FacturasPuntoVenta facturaspuntoventaAnterior) {
		this.facturaspuntoventaAnterior = facturaspuntoventaAnterior;
	}	
	
	public FacturasPuntoVenta getfacturaspuntoventaTotales() {
		return this.facturaspuntoventaTotales;
	}

	public void setfacturaspuntoventaTotales(FacturasPuntoVenta facturaspuntoventaTotales) {
		this.facturaspuntoventaTotales = facturaspuntoventaTotales;
	}	
	
	public FacturasPuntoVenta getfacturaspuntoventaBean() {
		return this.facturaspuntoventaBean;
	}

	public void setfacturaspuntoventaBean(FacturasPuntoVenta facturaspuntoventaBean) {
		this.facturaspuntoventaBean = facturaspuntoventaBean;
	}	
	
	public FacturasPuntoVentaParameterReturnGeneral getfacturaspuntoventaReturnGeneral() {
		return this.facturaspuntoventaReturnGeneral;
	}

	public void setfacturaspuntoventaReturnGeneral(FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaReturnGeneral) {
		this.facturaspuntoventaReturnGeneral = facturaspuntoventaReturnGeneral;
	}	
	
	
	public Date fecha_desdeBusquedaFacturasPuntoVenta=new Date();

	public Date getfecha_desdeBusquedaFacturasPuntoVenta() {
		return this.fecha_desdeBusquedaFacturasPuntoVenta;
	}

	public void setfecha_desdeBusquedaFacturasPuntoVenta(Date fecha_desdeBusquedaFacturasPuntoVenta) {
		this.fecha_desdeBusquedaFacturasPuntoVenta = fecha_desdeBusquedaFacturasPuntoVenta;
	}

;
	public Date fecha_hastaBusquedaFacturasPuntoVenta=new Date();

	public Date getfecha_hastaBusquedaFacturasPuntoVenta() {
		return this.fecha_hastaBusquedaFacturasPuntoVenta;
	}

	public void setfecha_hastaBusquedaFacturasPuntoVenta(Date fecha_hastaBusquedaFacturasPuntoVenta) {
		this.fecha_hastaBusquedaFacturasPuntoVenta = fecha_hastaBusquedaFacturasPuntoVenta;
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
	
	
	public FacturasPuntoVentaLogic getFacturasPuntoVentaLogic()	{		
		return facturaspuntoventaLogic;
	}

	public void setFacturasPuntoVentaLogic(FacturasPuntoVentaLogic facturaspuntoventaLogic) {
		this.facturaspuntoventaLogic = facturaspuntoventaLogic;
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
	
	public Boolean getIsEsNuevoFacturasPuntoVenta() {
		return isEsNuevoFacturasPuntoVenta;
	}

	public void setIsEsNuevoFacturasPuntoVenta(Boolean isEsNuevoFacturasPuntoVenta) {
		this.isEsNuevoFacturasPuntoVenta = isEsNuevoFacturasPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturasPuntoVenta() {
		return esParaAccionDesdeFormularioFacturasPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioFacturasPuntoVenta(Boolean esParaAccionDesdeFormularioFacturasPuntoVenta) {
		this.esParaAccionDesdeFormularioFacturasPuntoVenta = esParaAccionDesdeFormularioFacturasPuntoVenta;
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

			if(this.facturaspuntoventaSessionBean==null) {
				this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
			}

			if(!this.facturaspuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturaspuntoventaSessionBean.getlidEmpresaActual());
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

					if(this.facturaspuntoventa!=null) {
						this.facturaspuntoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
						this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturasPuntoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturasPuntoVentaGenerico)throws Exception
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
				jComboBoxid_empresaFacturasPuntoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturasPuntoVentaGenerico!=null && jComboBoxid_empresaFacturasPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturasPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturasPuntoVenta facturaspuntoventa,JComboBox jComboBoxid_empresaFacturasPuntoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturasPuntoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturasPuntoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturaspuntoventa.setid_empresa(empresaAux.getId());
				facturaspuntoventa.setempresa_descripcion(FacturasPuntoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturaspuntoventa.setEmpresa(empresaAux);			}
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

					if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { 
					}

					if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
							this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
							this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFacturasPuntoVenta() throws Exception {
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
		
	public FacturasPuntoVentaParameterReturnGeneral getFacturasPuntoVentaParameterGeneral() {
		return this.facturaspuntoventaParameterGeneral;
	}
	
	public void setFacturasPuntoVentaParameterGeneral(FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaParameterGeneral) {
		this.facturaspuntoventaParameterGeneral = facturaspuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturasPuntoVenta() {
		return isPermisoTodoFacturasPuntoVenta;
	}

	public void setIsPermisoTodoFacturasPuntoVenta(Boolean isPermisoTodoFacturasPuntoVenta) {
		this.isPermisoTodoFacturasPuntoVenta = isPermisoTodoFacturasPuntoVenta;
	}

	public Boolean getIsPermisoNuevoFacturasPuntoVenta() {
		return isPermisoNuevoFacturasPuntoVenta;
	}

	public void setIsPermisoNuevoFacturasPuntoVenta(Boolean isPermisoNuevoFacturasPuntoVenta) {
		this.isPermisoNuevoFacturasPuntoVenta = isPermisoNuevoFacturasPuntoVenta;
	}

	public Boolean getIsPermisoActualizarFacturasPuntoVenta() {
		return isPermisoActualizarFacturasPuntoVenta;
	}

	public void setIsPermisoActualizarFacturasPuntoVenta(Boolean isPermisoActualizarFacturasPuntoVenta) {
		this.isPermisoActualizarFacturasPuntoVenta = isPermisoActualizarFacturasPuntoVenta;
	}

	public Boolean getIsPermisoEliminarFacturasPuntoVenta() {
		return isPermisoEliminarFacturasPuntoVenta;
	}

	public void setIsPermisoEliminarFacturasPuntoVenta(Boolean isPermisoEliminarFacturasPuntoVenta) {
		this.isPermisoEliminarFacturasPuntoVenta = isPermisoEliminarFacturasPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosFacturasPuntoVenta() {
		return isPermisoGuardarCambiosFacturasPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosFacturasPuntoVenta(Boolean isPermisoGuardarCambiosFacturasPuntoVenta) {
		this.isPermisoGuardarCambiosFacturasPuntoVenta = isPermisoGuardarCambiosFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaFacturasPuntoVenta() {
		return isPermisoConsultaFacturasPuntoVenta;
	}

	public void setIsPermisoConsultaFacturasPuntoVenta(Boolean isPermisoConsultaFacturasPuntoVenta) {
		this.isPermisoConsultaFacturasPuntoVenta = isPermisoConsultaFacturasPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaFacturasPuntoVenta() {
		return isPermisoBusquedaFacturasPuntoVenta;
	}

	public void setIsPermisoBusquedaFacturasPuntoVenta(Boolean isPermisoBusquedaFacturasPuntoVenta) {
		this.isPermisoBusquedaFacturasPuntoVenta = isPermisoBusquedaFacturasPuntoVenta;
	}

	public Boolean getIsPermisoReporteFacturasPuntoVenta() {
		return isPermisoReporteFacturasPuntoVenta;
	}

	public void setIsPermisoReporteFacturasPuntoVenta(Boolean isPermisoReporteFacturasPuntoVenta) {
		this.isPermisoReporteFacturasPuntoVenta = isPermisoReporteFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturasPuntoVenta() {
		return isPermisoPaginacionMedioFacturasPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioFacturasPuntoVenta(Boolean isPermisoPaginacionMedioFacturasPuntoVenta) {
		this.isPermisoPaginacionMedioFacturasPuntoVenta = isPermisoPaginacionMedioFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturasPuntoVenta() {
		return isPermisoPaginacionTodoFacturasPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoFacturasPuntoVenta(Boolean isPermisoPaginacionTodoFacturasPuntoVenta) {
		this.isPermisoPaginacionTodoFacturasPuntoVenta = isPermisoPaginacionTodoFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturasPuntoVenta() {
		return isPermisoPaginacionAltoFacturasPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoFacturasPuntoVenta(Boolean isPermisoPaginacionAltoFacturasPuntoVenta) {
		this.isPermisoPaginacionAltoFacturasPuntoVenta = isPermisoPaginacionAltoFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarFacturasPuntoVenta() {
		return isPermisoCopiarFacturasPuntoVenta;
	}

	public void setIsPermisoCopiarFacturasPuntoVenta(Boolean isPermisoCopiarFacturasPuntoVenta) {
		this.isPermisoCopiarFacturasPuntoVenta = isPermisoCopiarFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormFacturasPuntoVenta() {
		return isPermisoVerFormFacturasPuntoVenta;
	}

	public void setIsPermisoVerFormFacturasPuntoVenta(Boolean isPermisoVerFormFacturasPuntoVenta) {
		this.isPermisoVerFormFacturasPuntoVenta = isPermisoVerFormFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarFacturasPuntoVenta() {
		return isPermisoDuplicarFacturasPuntoVenta;
	}

	public void setIsPermisoDuplicarFacturasPuntoVenta(Boolean isPermisoDuplicarFacturasPuntoVenta) {
		this.isPermisoDuplicarFacturasPuntoVenta = isPermisoDuplicarFacturasPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenFacturasPuntoVenta() {
		return isPermisoOrdenFacturasPuntoVenta;
	}

	public void setIsPermisoOrdenFacturasPuntoVenta(Boolean isPermisoOrdenFacturasPuntoVenta) {
		this.isPermisoOrdenFacturasPuntoVenta = isPermisoOrdenFacturasPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturasPuntoVenta() {
		return isVisibilidadCeldaNuevoFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoFacturasPuntoVenta(Boolean isVisibilidadCeldaNuevoFacturasPuntoVenta) {
		this.isVisibilidadCeldaNuevoFacturasPuntoVenta = isVisibilidadCeldaNuevoFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturasPuntoVenta() {
		return isVisibilidadCeldaDuplicarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarFacturasPuntoVenta(Boolean isVisibilidadCeldaDuplicarFacturasPuntoVenta) {
		this.isVisibilidadCeldaDuplicarFacturasPuntoVenta = isVisibilidadCeldaDuplicarFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturasPuntoVenta() {
		return isVisibilidadCeldaCopiarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarFacturasPuntoVenta(Boolean isVisibilidadCeldaCopiarFacturasPuntoVenta) {
		this.isVisibilidadCeldaCopiarFacturasPuntoVenta = isVisibilidadCeldaCopiarFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturasPuntoVenta() {
		return isVisibilidadCeldaVerFormFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormFacturasPuntoVenta(Boolean isVisibilidadCeldaVerFormFacturasPuntoVenta) {
		this.isVisibilidadCeldaVerFormFacturasPuntoVenta = isVisibilidadCeldaVerFormFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturasPuntoVenta() {
		return isVisibilidadCeldaOrdenFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenFacturasPuntoVenta(Boolean isVisibilidadCeldaOrdenFacturasPuntoVenta) {
		this.isVisibilidadCeldaOrdenFacturasPuntoVenta = isVisibilidadCeldaOrdenFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta = isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturasPuntoVenta() {
		return isVisibilidadCeldaModificarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarFacturasPuntoVenta(Boolean isVisibilidadCeldaModificarFacturasPuntoVenta) {
		this.isVisibilidadCeldaModificarFacturasPuntoVenta = isVisibilidadCeldaModificarFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturasPuntoVenta() {
		return isVisibilidadCeldaActualizarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarFacturasPuntoVenta(Boolean isVisibilidadCeldaActualizarFacturasPuntoVenta) {
		this.isVisibilidadCeldaActualizarFacturasPuntoVenta = isVisibilidadCeldaActualizarFacturasPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturasPuntoVenta() {
		return isVisibilidadCeldaEliminarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarFacturasPuntoVenta(Boolean isVisibilidadCeldaEliminarFacturasPuntoVenta) {
		this.isVisibilidadCeldaEliminarFacturasPuntoVenta = isVisibilidadCeldaEliminarFacturasPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturasPuntoVenta() {
		return isVisibilidadCeldaCancelarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarFacturasPuntoVenta(Boolean isVisibilidadCeldaCancelarFacturasPuntoVenta) {
		this.isVisibilidadCeldaCancelarFacturasPuntoVenta = isVisibilidadCeldaCancelarFacturasPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturasPuntoVenta() {
		return isVisibilidadCeldaGuardarFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarFacturasPuntoVenta(Boolean isVisibilidadCeldaGuardarFacturasPuntoVenta) {
		this.isVisibilidadCeldaGuardarFacturasPuntoVenta = isVisibilidadCeldaGuardarFacturasPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturasPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturasPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta = isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta;
	}
		
	public FacturasPuntoVentaSessionBean getfacturaspuntoventaSessionBean() {
		return this.facturaspuntoventaSessionBean;
	}
	
	public void setfacturaspuntoventaSessionBean(FacturasPuntoVentaSessionBean facturaspuntoventaSessionBean) {
		this.facturaspuntoventaSessionBean=facturaspuntoventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturasPuntoVenta() {
		return this.isVisibilidadBusquedaFacturasPuntoVenta;
	}

	public void setisVisibilidadBusquedaFacturasPuntoVenta(Boolean isVisibilidadBusquedaFacturasPuntoVenta) {
		this.isVisibilidadBusquedaFacturasPuntoVenta=isVisibilidadBusquedaFacturasPuntoVenta;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturaspuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(FacturasPuntoVenta facturaspuntoventa,FacturasPuntoVenta facturaspuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturasPuntoVenta(facturaspuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturaspuntoventaAux.setId(facturaspuntoventa.getId());
		facturaspuntoventaAux.setVersionRow(facturaspuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturasPuntoVenta facturaspuntoventaLocal) throws Exception {
		
		if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturasPuntoVenta facturaspuntoventaLocal) throws Exception {	
		if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturaspuntoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturasPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturaspuntoventaValidator.getInvalidValues(this.facturaspuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturasPuntoVenta facturaspuntoventa,List<FacturasPuntoVenta> facturaspuntoventas) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturasPuntoVenta facturaspuntoventa,List<FacturasPuntoVenta> facturaspuntoventas) throws Exception {
		try	{			
			FacturasPuntoVentaConstantesFunciones.actualizarSelectedLista(facturaspuntoventa,facturaspuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturasPuntoVenta> facturaspuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturaspuntoventasLocal=this.facturaspuntoventaLogic.getFacturasPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturaspuntoventasLocal=this.facturaspuntoventas;
			}
			//ARCHITECTURE
		
			for(FacturasPuntoVenta facturaspuntoventaLocal:facturaspuntoventasLocal) {
				if(this.permiteMantenimiento(facturaspuntoventaLocal) && facturaspuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturasPuntoVentaConstantesFunciones.getFacturasPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelnombre_completo_clienteFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_ivaFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_sin_ivaFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelivaFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeldescuentoFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotalFacturasPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasPuntoVentaConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelruc_clienteFacturasPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelnombre_completo_clienteFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_ivaFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_sin_ivaFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelivaFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeldescuentoFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotalFacturasPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelruc_clienteFacturasPuntoVenta,"");
		
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
		this.iIdNuevoFacturasPuntoVenta--;	
		
		
		this.facturaspuntoventaAux=new FacturasPuntoVenta();
		
		this.facturaspuntoventaAux.setId(this.iIdNuevoFacturasPuntoVenta);
		this.facturaspuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturaspuntoventaLogic.getFacturasPuntoVentas().add(this.facturaspuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturaspuntoventas.add(this.facturaspuntoventaAux);
		}
		//ARCHITECTURE
		
		this.facturaspuntoventa=this.facturaspuntoventaAux;
		
		if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasPuntoVenta(this.facturaspuntoventa);
		}
				
		//this.setDefaultControlesFacturasPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturasPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturasPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasPuntoVenta(this.facturaspuntoventaBean,this.facturaspuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral,this.facturaspuntoventaBean,false);
		
		if(this.facturaspuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta());
		}
		
		if(this.facturaspuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta(),classes);//this.facturaspuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturasPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturasPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormFacturasPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
						
			if(facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasPuntoVenta();
			}
			
			this.actualizarVisualTableDatosFacturasPuntoVenta();
			
			this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoFacturasPuntoVenta(), this.getIndiceNuevoFacturasPuntoVenta());
			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturasPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_desdeFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarfecha_desdeFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_hastaFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarfecha_hastaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarnombre_completo_clienteFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activartotal_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activartotal_sin_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activardescuentoFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activartotalFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarruc_clienteFacturasPuntoVenta);	
		//
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setEnabled(isHabilitar && this.facturaspuntoventaConstantesFunciones.activarid_empresaFacturasPuntoVenta);
	};
	
	public void setDefaultControlesFacturasPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturasPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturaspuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.facturaspuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.setVisible(true);
			
					
		} else {
			//this.facturaspuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.facturaspuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturasPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				if(facturaspuntoventaAux.getId().equals(this.iIdNuevoFacturasPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventas) {
				if(facturaspuntoventaAux.getId().equals(this.iIdNuevoFacturasPuntoVenta)) {
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
	
	public int getIndiceActualFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				if(facturaspuntoventaAux.getId().equals(facturaspuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventas) {
				if(facturaspuntoventaAux.getId().equals(facturaspuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				if(facturaspuntoventaAux.getFacturasPuntoVentaOriginal().getId().equals(facturaspuntoventaOriginal.getId())) {
					existe=true;
					facturaspuntoventaOriginal.setId(facturaspuntoventaAux.getId());
					facturaspuntoventaOriginal.setVersionRow(facturaspuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventas) {
				if(facturaspuntoventaAux.getFacturasPuntoVentaOriginal().getId().equals(facturaspuntoventaOriginal.getId())) {
					existe=true;
					facturaspuntoventaOriginal.setId(facturaspuntoventaAux.getId());
					facturaspuntoventaOriginal.setVersionRow(facturaspuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturasPuntoVenta(Boolean esParaCancelar) throws Exception {
		facturaspuntoventasAux=new ArrayList<FacturasPuntoVenta>();
		facturaspuntoventaAux=new FacturasPuntoVenta();
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
					if(facturaspuntoventaAux.getId()<0) {
						facturaspuntoventasAux.add(facturaspuntoventaAux);
					}		
				}
				this.iIdNuevoFacturasPuntoVenta=0L;
				this.facturaspuntoventaLogic.getFacturasPuntoVentas().removeAll(facturaspuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventas) {
					if(facturaspuntoventaAux.getId()<0) {
						facturaspuntoventasAux.add(facturaspuntoventaAux);
					}		
				}
				this.iIdNuevoFacturasPuntoVenta=0L;
				this.facturaspuntoventas.removeAll(facturaspuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturasPuntoVenta 
					&& this.facturaspuntoventaLogic.getFacturasPuntoVentas().size()>0
					) {
					facturaspuntoventaAux=this.facturaspuntoventaLogic.getFacturasPuntoVentas().get(this.facturaspuntoventaLogic.getFacturasPuntoVentas().size() - 1);
				
					if(facturaspuntoventaAux.getId()<0) {
						this.facturaspuntoventaLogic.getFacturasPuntoVentas().remove(facturaspuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturasPuntoVenta && this.facturaspuntoventas.size()>0) {
					facturaspuntoventaAux=this.facturaspuntoventas.get(this.facturaspuntoventas.size() - 1);
				
					if(facturaspuntoventaAux.getId()<0) {
						this.facturaspuntoventas.remove(facturaspuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturasPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturaspuntoventa.getId()<0) {
				this.facturaspuntoventaLogic.getFacturasPuntoVentas().remove(this.facturaspuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturaspuntoventa.getId()<0) {
				this.facturaspuntoventas.remove(this.facturaspuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesFacturasPuntoVenta(List<FacturasPuntoVenta> facturaspuntoventasAux) throws Exception {
		FacturasPuntoVentaConstantesFunciones.setEstadosInicialesFacturasPuntoVenta(facturaspuntoventasAux);
	}
	
	public void setEstadosInicialesFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventaAux) throws Exception {
		FacturasPuntoVentaConstantesFunciones.setEstadosInicialesFacturasPuntoVenta(facturaspuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturasPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturasPuntoVentaActual()) {
				if(!this.isEsNuevoFacturasPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturasPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturasPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturas Punto Venta ?", "MANTENIMIENTO DE Facturas Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturasPuntoVenta facturaspuntoventa) throws Exception {
		FacturasPuntoVentaConstantesFunciones.seleccionarAsignar(this.facturaspuntoventa,facturaspuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturasPuntoVenta=this.isPermisoActualizarOriginalFacturasPuntoVenta;
			
			
			this.seleccionarAsignar(facturaspuntoventa);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturaspuntoventaSessionBean.setsFuncionBusquedaRapida(this.facturaspuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturasPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturasPuntoVenta(esParaCancelar);				
				this.cancelarNuevoFacturasPuntoVenta(esParaCancelar);								
			}
			
			this.facturaspuntoventa=new FacturasPuntoVenta();
			
			this.inicializarFacturasPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturasPuntoVenta() throws Exception {
		try {
			FacturasPuntoVentaConstantesFunciones.inicializarFacturasPuntoVenta(this.facturaspuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturaspuntoventaLogic.getFacturasPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturasPuntoVentas(String sAccionBusqueda,List<FacturasPuntoVenta> facturaspuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="FacturasPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturasPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturasPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturasPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturas Punto Ventas");		
		parameters.put("busquedapor", FacturasPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturasPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturasPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturasPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturasPuntoVenta=new JRBeanArrayDataSource(FacturasPuntoVentaJInternalFrame.TraerFacturasPuntoVentaBeans(facturaspuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturasPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturasPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturasPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturasPuntoVentaBean.TraerFacturasPuntoVentaBeans(facturaspuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVentaActionPerformed(null);
					//this.generarExcelReporteFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturasPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,facturaspuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturasPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasPuntoVenta> facturaspuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturasPuntoVenta facturaspuntoventa : facturaspuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturasPuntoVentaConstantesFunciones.generarExcelReporteDataFacturasPuntoVenta("NORMAL",row,workbook,facturaspuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturasPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		FacturasPuntoVentaConstantesFunciones.generarExcelReporteHeaderFacturasPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturasPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasPuntoVenta> facturaspuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturasPuntoVenta facturaspuntoventa : facturaspuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturasPuntoVentaConstantesFunciones.getFacturasPuntoVentaDescripcion(facturaspuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaspuntoventa.getruc_cliente());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturasPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasPuntoVenta> facturaspuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturasPuntoVenta> facturaspuntoventasRespaldo=null;
		
		classes=FacturasPuntoVentaConstantesFunciones.getClassesRelationshipsOfFacturasPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturaspuntoventaLogic.setDatosCliente(this.datosCliente);
		this.facturaspuntoventaLogic.setDatosDeep(this.datosDeep);
		this.facturaspuntoventaLogic.setIsConDeep(true);
		
		facturaspuntoventasRespaldo=this.facturaspuntoventaLogic.getFacturasPuntoVentas();
		
		this.facturaspuntoventaLogic.setFacturasPuntoVentas(facturaspuntoventasParaReportes);	
		this.facturaspuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturaspuntoventasParaReportes=this.facturaspuntoventaLogic.getFacturasPuntoVentas();
		this.facturaspuntoventaLogic.setFacturasPuntoVentas(facturaspuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturasPuntoVenta facturaspuntoventa : facturaspuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturasPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturasPuntoVentaConstantesFunciones.generarExcelReporteDataFacturasPuntoVenta("NORMAL",row,workbook,facturaspuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturasPuntoVentaConstantesFunciones.getFacturasPuntoVentaDescripcion(facturaspuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturasPuntoVenta() throws Exception {		
		this.startProcessFacturasPuntoVenta(true);
	}
	
	public void startProcessFacturasPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturasPuntoVenta ,this.jPanelParametrosReportesFacturasPuntoVenta, this.jScrollPanelDatosFacturasPuntoVenta,this.jPanelPaginacionFacturasPuntoVenta, this.jScrollPanelDatosEdicionFacturasPuntoVenta, this.jPanelAccionesFacturasPuntoVenta,this.jPanelAccionesFormularioFacturasPuntoVenta,this.jmenuBarFacturasPuntoVenta,this.jmenuBarDetalleFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasPuntoVenta=this.jTabbedPaneBusquedasFacturasPuntoVenta; 
		
		final JPanel jPanelParametrosReportesFacturasPuntoVenta=this.jPanelParametrosReportesFacturasPuntoVenta;
		//final JScrollPane jScrollPanelDatosFacturasPuntoVenta=this.jScrollPanelDatosFacturasPuntoVenta;
		final JTable jTableDatosFacturasPuntoVenta=this.jTableDatosFacturasPuntoVenta;		
		final JPanel jPanelPaginacionFacturasPuntoVenta=this.jPanelPaginacionFacturasPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionFacturasPuntoVenta=this.jScrollPanelDatosEdicionFacturasPuntoVenta;
		final JPanel jPanelAccionesFacturasPuntoVenta=this.jPanelAccionesFacturasPuntoVenta;
		
		JPanel jPanelCamposAuxiliarFacturasPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturasPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			jPanelCamposAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelCamposFacturasPuntoVenta;
			jPanelAccionesFormularioAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelAccionesFormularioFacturasPuntoVenta;
		}
		
		final JPanel jPanelCamposFacturasPuntoVenta=jPanelCamposAuxiliarFacturasPuntoVenta;
		final JPanel jPanelAccionesFormularioFacturasPuntoVenta=jPanelAccionesFormularioAuxiliarFacturasPuntoVenta;
		
		
		final JMenuBar jmenuBarFacturasPuntoVenta=this.jmenuBarFacturasPuntoVenta;
		final JToolBar jTtoolBarFacturasPuntoVenta=this.jTtoolBarFacturasPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturasPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jmenuBarDetalleFacturasPuntoVenta;
			jTtoolBarDetalleAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jTtoolBarDetalleFacturasPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleFacturasPuntoVenta=jmenuBarDetalleAuxiliarFacturasPuntoVenta;
		final JToolBar jTtoolBarDetalleFacturasPuntoVenta=jTtoolBarDetalleAuxiliarFacturasPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasPuntoVenta;
			processRunnable.jTableDatos=jTableDatosFacturasPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposFacturasPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarFacturasPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasPuntoVenta ,jPanelParametrosReportesFacturasPuntoVenta,jTableDatosFacturasPuntoVenta, /*jScrollPanelDatosFacturasPuntoVenta,*/jPanelCamposFacturasPuntoVenta,jPanelPaginacionFacturasPuntoVenta, /*jScrollPanelDatosEdicionFacturasPuntoVenta,*/ jPanelAccionesFacturasPuntoVenta,jPanelAccionesFormularioFacturasPuntoVenta,jmenuBarFacturasPuntoVenta,jmenuBarDetalleFacturasPuntoVenta,jTtoolBarFacturasPuntoVenta,jTtoolBarDetalleFacturasPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasPuntoVenta ,jPanelParametrosReportesFacturasPuntoVenta, jScrollPanelDatosFacturasPuntoVenta,jPanelPaginacionFacturasPuntoVenta, jScrollPanelDatosEdicionFacturasPuntoVenta, jPanelAccionesFacturasPuntoVenta,jPanelAccionesFormularioFacturasPuntoVenta,jmenuBarFacturasPuntoVenta,jmenuBarDetalleFacturasPuntoVenta,jTtoolBarFacturasPuntoVenta,jTtoolBarDetalleFacturasPuntoVenta);
						
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
	
	public void finishProcessFacturasPuntoVenta() {// throws Exception 
		this.finishProcessFacturasPuntoVenta(true);
	}
	
	public void finishProcessFacturasPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturasPuntoVenta ,this.jPanelParametrosReportesFacturasPuntoVenta, this.jScrollPanelDatosFacturasPuntoVenta,this.jPanelPaginacionFacturasPuntoVenta, this.jScrollPanelDatosEdicionFacturasPuntoVenta, this.jPanelAccionesFacturasPuntoVenta,this.jPanelAccionesFormularioFacturasPuntoVenta,this.jmenuBarFacturasPuntoVenta,this.jmenuBarDetalleFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,this.jTtoolBarDetalleFacturasPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasPuntoVenta=this.jTabbedPaneBusquedasFacturasPuntoVenta; 
		
		final JPanel jPanelParametrosReportesFacturasPuntoVenta=this.jPanelParametrosReportesFacturasPuntoVenta;
		//final JScrollPane jScrollPanelDatosFacturasPuntoVenta=this.jScrollPanelDatosFacturasPuntoVenta;
		final JTable jTableDatosFacturasPuntoVenta=this.jTableDatosFacturasPuntoVenta;		
		final JPanel jPanelPaginacionFacturasPuntoVenta=this.jPanelPaginacionFacturasPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionFacturasPuntoVenta=this.jScrollPanelDatosEdicionFacturasPuntoVenta;
		final JPanel jPanelAccionesFacturasPuntoVenta=this.jPanelAccionesFacturasPuntoVenta;
		
		JPanel jPanelCamposAuxiliarFacturasPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturasPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			jPanelCamposAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelCamposFacturasPuntoVenta;
			jPanelAccionesFormularioAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelAccionesFormularioFacturasPuntoVenta;
		}
		
		final JPanel jPanelCamposFacturasPuntoVenta=jPanelCamposAuxiliarFacturasPuntoVenta;
		final JPanel jPanelAccionesFormularioFacturasPuntoVenta=jPanelAccionesFormularioAuxiliarFacturasPuntoVenta;
		
		
		final JMenuBar jmenuBarFacturasPuntoVenta=this.jmenuBarFacturasPuntoVenta;		
		final JToolBar jTtoolBarFacturasPuntoVenta=this.jTtoolBarFacturasPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturasPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jmenuBarDetalleFacturasPuntoVenta;
			jTtoolBarDetalleAuxiliarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jTtoolBarDetalleFacturasPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleFacturasPuntoVenta=jmenuBarDetalleAuxiliarFacturasPuntoVenta;
		final JToolBar jTtoolBarDetalleFacturasPuntoVenta=jTtoolBarDetalleAuxiliarFacturasPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasPuntoVenta;
			processRunnable.jTableDatos=jTableDatosFacturasPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposFacturasPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarFacturasPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturasPuntoVenta ,jPanelParametrosReportesFacturasPuntoVenta, jTableDatosFacturasPuntoVenta,/*jScrollPanelDatosFacturasPuntoVenta,*/jPanelCamposFacturasPuntoVenta,jPanelPaginacionFacturasPuntoVenta, /*jScrollPanelDatosEdicionFacturasPuntoVenta,*/ jPanelAccionesFacturasPuntoVenta,jPanelAccionesFormularioFacturasPuntoVenta,jmenuBarFacturasPuntoVenta,jmenuBarDetalleFacturasPuntoVenta,jTtoolBarFacturasPuntoVenta,jTtoolBarDetalleFacturasPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturasPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturasPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturasPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturasPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturasPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturasPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturasPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturasPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturasPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturaspuntoventaConstantesFunciones.getsFinalQueryFacturasPuntoVenta();
		String  finalQueryPaginacionTodos=this.facturaspuntoventaConstantesFunciones.getsFinalQueryFacturasPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturasPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoFacturasPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturasPuntoVentaConstantesFunciones.getArrayColumnasGlobalesFacturasPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturasPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturaspuntoventasEliminados= new ArrayList<FacturasPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturasPuntoVenta();
		
				///*FacturasPuntoVentaSessionBean*/this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
			
			if(this.facturaspuntoventaSessionBean==null) {
				this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=FacturasPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturasPuntoVentaConstantesFunciones.getClassesForeignKeysOfFacturasPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturaspuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturaspuntoventasAux= new ArrayList<FacturasPuntoVenta>();
			
				
			facturaspuntoventaLogic.setDatosCliente(this.datosCliente);
			facturaspuntoventaLogic.setDatosDeep(this.datosDeep);
			facturaspuntoventaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturasPuntoVenta")) {
				this.sDetalleReporte=FacturasPuntoVentaConstantesFunciones.getDetalleIndiceBusquedaFacturasPuntoVenta(fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturaspuntoventaLogic.getFacturasPuntoVentasBusquedaFacturasPuntoVenta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasPuntoVentaConstantesFunciones.getDetalleIndiceBusquedaFacturasPuntoVenta(fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasPuntoVentaConstantesFunciones.getDetalleIndiceBusquedaFacturasPuntoVenta(fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturaspuntoventaLogic.getFacturasPuntoVentas()==null||facturaspuntoventaLogic.getFacturasPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturaspuntoventas==null|| facturaspuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaspuntoventasAux=new ArrayList<FacturasPuntoVenta>();
						facturaspuntoventasAux.addAll(facturaspuntoventaLogic.getFacturasPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaspuntoventasAux=new ArrayList<FacturasPuntoVenta>();
							facturaspuntoventasAux.addAll(facturaspuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturaspuntoventaLogic.getFacturasPuntoVentasBusquedaFacturasPuntoVenta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasPuntoVentaConstantesFunciones.getDetalleIndiceBusquedaFacturasPuntoVenta(fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasPuntoVentaConstantesFunciones.getDetalleIndiceBusquedaFacturasPuntoVenta(fecha_desdeBusquedaFacturasPuntoVenta,fecha_hastaBusquedaFacturasPuntoVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturasPuntoVentas("BusquedaFacturasPuntoVenta",facturaspuntoventaLogic.getFacturasPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturasPuntoVentas("BusquedaFacturasPuntoVenta",facturaspuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaspuntoventaLogic.setFacturasPuntoVentas(new ArrayList<FacturasPuntoVenta>());
						facturaspuntoventaLogic.getFacturasPuntoVentas().addAll(facturaspuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaspuntoventas=new ArrayList<FacturasPuntoVenta>();
							facturaspuntoventas.addAll(facturaspuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturasPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturasPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturaspuntoventaLogic.getFacturasPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaspuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturaspuntoventaLogic.getFacturasPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaspuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturasPuntoVenta facturaspuntoventa) {
		Boolean permite=true;
		
		if(this.facturaspuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturasPuntoVentaConstantesFunciones.getOrderByListaFacturasPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturasPuntoVentaConstantesFunciones.getOrderByListaFacturasPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				if(facturaspuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					facturaspuntoventaTotales=facturaspuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasPuntoVenta facturaspuntoventa:this.facturaspuntoventas) {
				if(facturaspuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					facturaspuntoventaTotales=facturaspuntoventa;
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
			this.facturaspuntoventaAux=new FacturasPuntoVenta();
			this.facturaspuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.facturaspuntoventaAux.setIsNew(false);
			this.facturaspuntoventaAux.setIsChanged(false);
			this.facturaspuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturasPuntoVentaConstantesFunciones.TotalizarValoresFilaFacturasPuntoVenta(this.facturaspuntoventaLogic.getFacturasPuntoVentas(),this.facturaspuntoventaAux);
				
				//this.facturaspuntoventaLogic.getFacturasPuntoVentas().add(this.facturaspuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturasPuntoVentaConstantesFunciones.TotalizarValoresFilaFacturasPuntoVenta(this.facturaspuntoventas,this.facturaspuntoventaAux);
				
				this.facturaspuntoventas.add(this.facturaspuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturaspuntoventaTotales=new FacturasPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturaspuntoventaLogic.getFacturasPuntoVentas().remove(facturaspuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturaspuntoventas.remove(facturaspuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturaspuntoventaTotales=new FacturasPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				if(facturaspuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					facturaspuntoventaTotales=facturaspuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasPuntoVentaConstantesFunciones.TotalizarValoresFilaFacturasPuntoVenta(this.facturaspuntoventaLogic.getFacturasPuntoVentas(),facturaspuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasPuntoVenta facturaspuntoventa:this.facturaspuntoventas) {
				if(facturaspuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					facturaspuntoventaTotales=facturaspuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasPuntoVentaConstantesFunciones.TotalizarValoresFilaFacturasPuntoVenta(this.facturaspuntoventas,facturaspuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturasPuntoVentasBusquedaFacturasPuntoVenta()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturasPuntoVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasPuntoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturasPuntoVentasBusquedaFacturasPuntoVenta(String sFinalQuery,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaspuntoventaLogic.getFacturasPuntoVentasBusquedaFacturasPuntoVenta(sFinalQuery,this.pagination,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasPuntoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaspuntoventaLogic.getFacturasPuntoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosFacturasPuntoVenta() {
		this.isPermisoTodoFacturasPuntoVenta=false;
		this.isPermisoNuevoFacturasPuntoVenta=false;
		this.isPermisoActualizarFacturasPuntoVenta=false;
		this.isPermisoActualizarOriginalFacturasPuntoVenta=false;
		this.isPermisoEliminarFacturasPuntoVenta=false;
		this.isPermisoGuardarCambiosFacturasPuntoVenta=false;
		this.isPermisoConsultaFacturasPuntoVenta=true;
		this.isPermisoBusquedaFacturasPuntoVenta=true;
		this.isPermisoReporteFacturasPuntoVenta=true;
		this.isPermisoOrdenFacturasPuntoVenta=false;		
		this.isPermisoPaginacionMedioFacturasPuntoVenta=false;		
		this.isPermisoPaginacionAltoFacturasPuntoVenta=false;		
		this.isPermisoPaginacionTodoFacturasPuntoVenta=false;		
		this.isPermisoCopiarFacturasPuntoVenta=false;		
		this.isPermisoVerFormFacturasPuntoVenta=false;		
		this.isPermisoDuplicarFacturasPuntoVenta=false;
		this.isPermisoOrdenFacturasPuntoVenta=false;
	}
	
	public void setPermisosUsuarioFacturasPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoFacturasPuntoVenta=isPermiso;
		this.isPermisoNuevoFacturasPuntoVenta=isPermiso;
		this.isPermisoActualizarFacturasPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalFacturasPuntoVenta=isPermiso;
		this.isPermisoEliminarFacturasPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosFacturasPuntoVenta=isPermiso;
		this.isPermisoConsultaFacturasPuntoVenta=isPermiso;
		this.isPermisoBusquedaFacturasPuntoVenta=isPermiso;
		this.isPermisoReporteFacturasPuntoVenta=isPermiso;
		this.isPermisoOrdenFacturasPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioFacturasPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoFacturasPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoFacturasPuntoVenta=isPermiso;		
		this.isPermisoCopiarFacturasPuntoVenta=isPermiso;		
		this.isPermisoVerFormFacturasPuntoVenta=isPermiso;		
		this.isPermisoDuplicarFacturasPuntoVenta=isPermiso;
		this.isPermisoOrdenFacturasPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturasPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoFacturasPuntoVenta=isPermiso;
		this.isPermisoNuevoFacturasPuntoVenta=isPermiso;
		this.isPermisoActualizarFacturasPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalFacturasPuntoVenta=isPermiso;
		this.isPermisoEliminarFacturasPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosFacturasPuntoVenta=isPermiso;
		//this.isPermisoConsultaFacturasPuntoVenta=isPermiso;
		//this.isPermisoBusquedaFacturasPuntoVenta=isPermiso;
		//this.isPermisoReporteFacturasPuntoVenta=isPermiso;
		//this.isPermisoOrdenFacturasPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioFacturasPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoFacturasPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoFacturasPuntoVenta=isPermiso;		
		//this.isPermisoCopiarFacturasPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarFacturasPuntoVenta=isPermiso;
		//this.isPermisoOrdenFacturasPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturasPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturasPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturasPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturasPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturasPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturasPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturasPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturasPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturasPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturasPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturasPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturasPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturasPuntoVenta=this.isPermisoActualizarFacturasPuntoVenta;
			this.isPermisoEliminarFacturasPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturasPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturasPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturasPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturasPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturasPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturasPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturasPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturasPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturasPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturasPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturasPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturasPuntoVenta.setToolTipText(this.jTableDatosFacturasPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturasPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturasPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturasPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturasPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturasPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyFacturasPuntoVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturasPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturasPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturasPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturaspuntoventaSessionBean==null) {
				this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
			}

			if(!this.facturaspuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyFacturasPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturasPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturasPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturasPuntoVenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturasPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturasPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturasPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturasPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturasPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturasPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public FacturasPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturasPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturasPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean(); 
		this.facturaspuntoventaConstantesFunciones=new FacturasPuntoVentaConstantesFunciones(); 
		this.facturaspuntoventaBean=new FacturasPuntoVenta();//(this.facturaspuntoventaConstantesFunciones); 		
		this.facturaspuntoventaReturnGeneral=new FacturasPuntoVentaParameterReturnGeneral(); 
		
		this.facturaspuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaspuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturasPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturasPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturasPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturasPuntoVenta(true);
			
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
			
			this.facturaspuntoventaConstantesFunciones=new FacturasPuntoVentaConstantesFunciones(); 
			this.facturaspuntoventaBean=new FacturasPuntoVenta();//this.facturaspuntoventaConstantesFunciones); 			
			this.facturaspuntoventaReturnGeneral=new FacturasPuntoVentaParameterReturnGeneral(); 
		
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturaspuntoventa=new FacturasPuntoVenta();
			this.facturaspuntoventas = new ArrayList<FacturasPuntoVenta>();
			this.facturaspuntoventasAux = new ArrayList<FacturasPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic=new FacturasPuntoVentaLogic();
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.facturaspuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturaspuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturasPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionFacturasPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturasPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturasPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasPuntoVenta);
				this.jInternalFrameDetalleFormFacturasPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormFacturasPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasPuntoVenta);
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturasPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturasPuntoVenta);
					this.jInternalFrameImportacionFacturasPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionFacturasPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturasPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturasPuntoVenta);
					this.jInternalFrameOrderByFacturasPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByFacturasPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturasPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturasPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturaspuntoventaReturnGeneral=new FacturasPuntoVentaParameterReturnGeneral();
			
			this.facturaspuntoventaParameterGeneral=new FacturasPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturaspuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturasPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),this.facturaspuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),this.facturaspuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaCopiarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaVerFormFacturasPuntoVenta=true;
			this.isVisibilidadCeldaOrdenFacturasPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			
			
			this.isVisibilidadBusquedaFacturasPuntoVenta=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturasPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturasPuntoVenta(false);
			
			this.setPermisosUsuarioFacturasPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.facturaspuntoventaSessionBean.getEsGuardarRelacionado() && this.facturaspuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturasPuntoVentaClasesRelacionadas();
			}
			
			if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturasPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturasPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturasPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaFacturasPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturasPuntoVentaConstantesFunciones.getTiposSeleccionarFacturasPuntoVenta());
				
				this.tiposColumnasSelect=FacturasPuntoVentaConstantesFunciones.getTiposSeleccionarFacturasPuntoVenta(true);
				
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
			//if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturasPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturasPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturasPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasPuntoVenta() ;
			
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
				facturaspuntoventaImplementable= (FacturasPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturaspuntoventaImplementableHome= (FacturasPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturaspuntoventas= new ArrayList<FacturasPuntoVenta>();
			this.facturaspuntoventasEliminados= new ArrayList<FacturasPuntoVenta>();
						
			this.isEsNuevoFacturasPuntoVenta=false;
			this.esParaAccionDesdeFormularioFacturasPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturasPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturasPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturasPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturasPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturasPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturasPuntoVenta();
			}
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturasPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturasPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturasPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturasPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturasPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturasPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturasPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturasPuntoVenta();	
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
	
	public void cargarCombosForeignKeyFacturasPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturasPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturasPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturasPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturasPuntoVenta();
		
		this.cargarCombosFrameForeignKeyFacturasPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturasPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturasPuntoVenta();
		}
	}
	
	
	
	public void jButtonNuevoFacturasPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			
			if(jTableDatosFacturasPuntoVenta.getRowCount()>=1) {
				jTableDatosFacturasPuntoVenta.removeRowSelectionInterval(0, jTableDatosFacturasPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturasPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturasPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturasPuntoVenta(true);			
			//this.facturaspuntoventa=new FacturasPuntoVenta();
			//this.facturaspuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta() ;
			
			if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturaspuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);				
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturasPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturasPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturasPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturasPuntoVenta.getSelectedRows().length;			
			}
			
			facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturasPuntoVenta--;			
				//FacturasPuntoVenta facturaspuntoventaAux= new FacturasPuntoVenta();			
				//facturaspuntoventaAux.setId(this.iIdNuevoFacturasPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturasPuntoVenta facturaspuntoventaOrigen=new FacturasPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturasPuntoVenta facturaspuntoventaOrigen : facturaspuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturaspuntoventaOrigen =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaspuntoventaOrigen =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturasPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturaspuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturasPuntoVenta(facturaspuntoventaOrigen,this.facturaspuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturaspuntoventaLogic.getFacturasPuntoVentas().add(this.facturaspuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventas.add(this.facturaspuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
				
				this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoFacturasPuntoVenta(), this.getIndiceNuevoFacturasPuntoVenta());
				
				int iLastRow =  this.jTableDatosFacturasPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();									
		
			FacturasPuntoVenta facturaspuntoventaOrigen=new FacturasPuntoVenta();
			FacturasPuntoVenta facturaspuntoventaDestino=new FacturasPuntoVenta();
				
			facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturasPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturaspuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturasPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaspuntoventaOrigen =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturaspuntoventaOrigen =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaspuntoventaDestino =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturaspuntoventaDestino =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturaspuntoventaOrigen =facturaspuntoventasSeleccionados.get(0);
				facturaspuntoventaDestino =facturaspuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturasPuntoVenta(facturaspuntoventaOrigen,facturaspuntoventaDestino,true,false);
				
				facturaspuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturaspuntoventaDestino,facturaspuntoventaLogic.getFacturasPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturaspuntoventaDestino,facturaspuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
				
				//this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoFacturasPuntoVenta(), this.getIndiceNuevoFacturasPuntoVenta());
				
				int iLastRow =  this.jTableDatosFacturasPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturasPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionFacturasPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesFacturasPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturasPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturasPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturasPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturasPuntoVenta();
			
			this.abrirFrameOrderByFacturasPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturasPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturasPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturasPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturasPuntoVenta.setSize(this.jInternalFrameDetalleFormFacturasPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormFacturasPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturasPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturasPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturasPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormFacturasPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturasPuntoVenta.jContentPaneDetalleFacturasPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturasPuntoVenta.jContentPaneDetalleFacturasPuntoVenta.getWidth(),FacturasPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturasPuntoVenta.jContentPaneDetalleFacturasPuntoVenta.getWidth(),FacturasPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturasPuntoVenta.jContentPaneDetalleFacturasPuntoVenta.getWidth(),FacturasPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturasPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormFacturasPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturasPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturasPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturasPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByFacturasPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturasPuntoVenta);
				this.jInternalFrameOrderByFacturasPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByFacturasPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByFacturasPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByFacturasPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturasPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturasPuntoVenta==null) {
				
				this.jInternalFrameImportacionFacturasPuntoVenta=new ImportacionJInternalFrame(FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturasPuntoVenta);
				this.jInternalFrameImportacionFacturasPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionFacturasPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasPuntoVenta"));
				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasPuntoVenta"));
				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturasPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta=new ReporteDinamicoJInternalFrame(FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasPuntoVenta);
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasPuntoVenta"));
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasPuntoVenta"));
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturasPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasPuntoVenta);
			
	       	this.jInternalFrameDetalleFormFacturasPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormFacturasPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturasPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormFacturasPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturasPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturasPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturasPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionFacturasPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturasPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturasPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByFacturasPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturasPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturasPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByFacturasPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturasPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturasPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturasPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionFacturasPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturasPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturasPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturasPuntoVenta(true);
			//this.isEsNuevoFacturasPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false) ;
			
			if(facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturasPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturasPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturasPuntoVenta(true);
			//this.isEsNuevoFacturasPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturaspuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false) ;
			
			if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturasPuntoVenta(false);
			
			//if(!this.isEsNuevoFacturasPuntoVenta) {								
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.facturaspuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturasPuntoVenta=true;
					this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
					this.isEsNuevoFacturasPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturasPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturasPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesFacturasPuntoVenta(false);
			
												
				
				if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturasPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturasPuntoVentaActionPerformed(evt,facturaspuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturasPuntoVenta(this.facturaspuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturaspuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturaspuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.facturaspuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.facturaspuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturaspuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturasPuntoVentaModel) this.jTableDatosFacturasPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturasPuntoVenta=true;
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
				this.isEsNuevoFacturasPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesFacturasPuntoVenta(false);
				
				
				
				if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturasPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturasPuntoVenta.getRowCount()>=1) {
				jTableDatosFacturasPuntoVenta.removeRowSelectionInterval(0, jTableDatosFacturasPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturasPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(false) ;
			
			this.isEsNuevoFacturasPuntoVenta=false;
			
			if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturasPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturasPuntoVenta(false);
				
				//SI ES MANUAL
				if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturasPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturasPuntoVenta--;			
			//FacturasPuntoVenta facturaspuntoventaAux= new FacturasPuntoVenta();			
			//facturaspuntoventaAux.setId(this.iIdNuevoFacturasPuntoVenta);
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturasPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
			
			this.facturaspuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturaspuntoventaLogic.getFacturasPuntoVentas().add(this.facturaspuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturaspuntoventas.add(this.facturaspuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			
			this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoFacturasPuntoVenta(), this.getIndiceNuevoFacturasPuntoVenta());
			
			int iLastRow =  this.jTableDatosFacturasPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturasPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturasPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
			
			//SI ES MANUAL
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasPuntoVenta();
			}
			
			//this.abrirFrameTreeFacturasPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturasPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturasPuntoVenta.setFileImportacion(this.jInternalFrameImportacionFacturasPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturasPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturasPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturasPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturasPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		

		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturasPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturasPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cCliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturasPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaspuntoventa.getruc_cliente());
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
			//	this.getFilaCabeceraExportarExcelFacturasPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturasPuntoVenta(facturaspuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
			
			//SI ES MANUAL
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
			
			//SI ES MANUAL
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
			
			//SI ES MANUAL
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturasPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturasPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturasPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturasPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturasPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturasPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturasPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturasPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturasPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturasPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturasPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturasPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturasPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturasPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturasPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturasPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturasPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturasPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturasPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionNuevoFacturasPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturasPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionNuevoFacturasPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionSinCerrarFacturasPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jCheckBoxPostAccionSinMensajeFacturasPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturasPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturasPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturasPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturasPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturasPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturasPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturasPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturasPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturasPuntoVenta() throws Exception {
		try	{
			if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturasPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturasPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturasPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturasPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturasPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturasPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturasPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturasPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturasPuntoVentaConstantesFunciones.getTiposSeleccionarFacturasPuntoVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturasPuntoVentaConstantesFunciones.getTiposSeleccionarFacturasPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturasPuntoVentaConstantesFunciones.getTiposSeleccionarFacturasPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturasPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_desdeBusquedaFacturasPuntoVenta=new Date(this.jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.getDate().getTime());
		this.fecha_hastaBusquedaFacturasPuntoVenta=new Date(this.jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturasPuntoVenta(Boolean esInicializar) throws Exception {				
		if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturasPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturasPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturasPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturasPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturaspuntoventaLogic.getFacturasPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturaspuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturasPuntoVenta.setModel(new FacturasPuntoVentaModel(this.facturaspuntoventaLogic.getFacturasPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturasPuntoVenta.setModel(new FacturasPuntoVentaModel(this.facturaspuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturasPuntoVenta!=null && this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturasPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,facturaspuntoventaConstantesFunciones.resaltarSeleccionarFacturasPuntoVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,facturaspuntoventaConstantesFunciones.resaltarSeleccionarFacturasPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.facturaspuntoventaConstantesFunciones.mostraridFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltaridFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activaridFacturasPuntoVenta,iSizeTabla,this,true,"idFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltaridFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activaridFacturasPuntoVenta,this,true,"idFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.facturaspuntoventaConstantesFunciones.mostrarnombre_completo_clienteFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturaspuntoventaConstantesFunciones.resaltarnombre_completo_clienteFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarnombre_completo_clienteFacturasPuntoVenta,iSizeTabla,this,true,"nombre_completo_clienteFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltarnombre_completo_clienteFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarnombre_completo_clienteFacturasPuntoVenta,this,true,"nombre_completo_clienteFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA));

		if(this.facturaspuntoventaConstantesFunciones.mostrartotal_ivaFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotal_ivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotal_ivaFacturasPuntoVenta,iSizeTabla,this,true,"total_ivaFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotal_ivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotal_ivaFacturasPuntoVenta,this,true,"total_ivaFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.facturaspuntoventaConstantesFunciones.mostrartotal_sin_ivaFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotal_sin_ivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotal_sin_ivaFacturasPuntoVenta,iSizeTabla,this,true,"total_sin_ivaFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotal_sin_ivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotal_sin_ivaFacturasPuntoVenta,this,true,"total_sin_ivaFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_IVA));

		if(this.facturaspuntoventaConstantesFunciones.mostrarivaFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltarivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarivaFacturasPuntoVenta,iSizeTabla,this,true,"ivaFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltarivaFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarivaFacturasPuntoVenta,this,true,"ivaFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO));

		if(this.facturaspuntoventaConstantesFunciones.mostrardescuentoFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltardescuentoFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activardescuentoFacturasPuntoVenta,iSizeTabla,this,true,"descuentoFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltardescuentoFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activardescuentoFacturasPuntoVenta,this,true,"descuentoFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL));

		if(this.facturaspuntoventaConstantesFunciones.mostrartotalFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotalFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotalFacturasPuntoVenta,iSizeTabla,this,true,"totalFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltartotalFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activartotalFacturasPuntoVenta,this,true,"totalFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.facturaspuntoventaConstantesFunciones.mostrarruc_clienteFacturasPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturaspuntoventaConstantesFunciones.resaltarruc_clienteFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarruc_clienteFacturasPuntoVenta,iSizeTabla,this,true,"ruc_clienteFacturasPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaspuntoventaConstantesFunciones.resaltarruc_clienteFacturasPuntoVenta,this.facturaspuntoventaConstantesFunciones.activarruc_clienteFacturasPuntoVenta,this,true,"ruc_clienteFacturasPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturasPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosFacturasPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturasPuntoVenta.moveColumn(this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturasPuntoVenta.moveColumn(this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturasPuntoVenta.moveColumn(this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturasPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturasPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturasPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturasPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturasPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturasPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturaspuntoventaLogic.getFacturasPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturaspuntoventas.size()-1;
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
		//this.jTableDatosFacturasPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturasPuntoVenta();
			
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
				
				//this.isEsNuevoFacturasPuntoVenta=false;
					
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
				if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturaspuntoventa.getsType().equals("DUPLICADO")
				   || this.facturaspuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturasPuntoVenta=true;
				
				} else {
					this.isEsNuevoFacturasPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.facturaspuntoventa.getId()>=0 && !this.facturaspuntoventa.getIsNew()) {						
						this.isEsNuevoFacturasPuntoVenta=false;
						
					} else {
						this.isEsNuevoFacturasPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturasPuntoVenta(esRelaciones);						
				
				this.seleccionarFacturasPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturaspuntoventa.getId()<0) {
					this.isEsNuevoFacturasPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturasPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturasPuntoVenta(evt,rowIndex);
				}	
				
				if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturasPuntoVenta: " + this.dDif); 
					}
				}								
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturasPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturaspuntoventa)) {
					if(this.facturaspuntoventa.getId()>0) {
						this.facturaspuntoventa.setIsDeleted(true);
						
						this.facturaspuntoventasEliminados.add(this.facturaspuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturaspuntoventaLogic.getFacturasPuntoVentas().remove(this.facturaspuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventas.remove(this.facturaspuntoventa);				
					}
					
					
					((FacturasPuntoVentaModel) this.jTableDatosFacturasPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturasPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturasPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventa);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturasPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturasPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturasPuntoVenta(facturaspuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturasPuntoVenta(facturaspuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturasPuntoVenta(facturaspuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturasPuntoVenta(facturaspuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setText(facturaspuntoventa.getId().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setText(facturaspuntoventa.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setText(facturaspuntoventa.gettotal_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setText(facturaspuntoventa.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setText(facturaspuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setText(facturaspuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setText(facturaspuntoventa.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setText(facturaspuntoventa.getruc_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturasPuntoVenta facturaspuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturaspuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturasPuntoVenta facturaspuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturaspuntoventaLocal=this.facturaspuntoventa;
			} else {
				facturaspuntoventaLocal=this.facturaspuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturaspuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturasPuntoVenta(facturaspuntoventaLocal,true);
					
					if(facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturaspuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturaspuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(facturaspuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(facturaspuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(facturaspuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.getText()==null || this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setText("0");
			}

			if(conColumnasBase) {facturaspuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelIdFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.setnombre_completo_cliente(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelnombre_completo_clienteFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_ivaFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotal_sin_ivaFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.setiva(Double.parseDouble(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelivaFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeldescuentoFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.settotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabeltotalFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturaspuntoventa.setruc_cliente(this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelruc_clienteFacturasPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventaBean,FacturasPuntoVenta facturaspuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventaOrigen,FacturasPuntoVenta facturaspuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturaspuntoventaOrigen.getId()!=null && !facturaspuntoventaOrigen.getId().equals(0L))) {facturaspuntoventa.setId(facturaspuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getfecha_desde()!=null && !facturaspuntoventaOrigen.getfecha_desde().equals(new Date()))) {facturaspuntoventa.setfecha_desde(facturaspuntoventaOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getfecha_hasta()!=null && !facturaspuntoventaOrigen.getfecha_hasta().equals(new Date()))) {facturaspuntoventa.setfecha_hasta(facturaspuntoventaOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getnombre_completo_cliente()!=null && !facturaspuntoventaOrigen.getnombre_completo_cliente().equals(""))) {facturaspuntoventa.setnombre_completo_cliente(facturaspuntoventaOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.gettotal_iva()!=null && !facturaspuntoventaOrigen.gettotal_iva().equals(0.0))) {facturaspuntoventa.settotal_iva(facturaspuntoventaOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.gettotal_sin_iva()!=null && !facturaspuntoventaOrigen.gettotal_sin_iva().equals(0.0))) {facturaspuntoventa.settotal_sin_iva(facturaspuntoventaOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getiva()!=null && !facturaspuntoventaOrigen.getiva().equals(0.0))) {facturaspuntoventa.setiva(facturaspuntoventaOrigen.getiva());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getdescuento()!=null && !facturaspuntoventaOrigen.getdescuento().equals(0.0))) {facturaspuntoventa.setdescuento(facturaspuntoventaOrigen.getdescuento());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.gettotal()!=null && !facturaspuntoventaOrigen.gettotal().equals(0.0))) {facturaspuntoventa.settotal(facturaspuntoventaOrigen.gettotal());}
			if(conDefault || (!conDefault && facturaspuntoventaOrigen.getruc_cliente()!=null && !facturaspuntoventaOrigen.getruc_cliente().equals(""))) {facturaspuntoventa.setruc_cliente(facturaspuntoventaOrigen.getruc_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setText(facturaspuntoventa.getId().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setText(facturaspuntoventa.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setText(facturaspuntoventa.gettotal_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setText(facturaspuntoventa.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setText(facturaspuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setText(facturaspuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setText(facturaspuntoventa.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setText(facturaspuntoventa.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasPuntoVenta(FacturasPuntoVentaBean facturaspuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setText(facturaspuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setText(facturaspuntoventaBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setText(facturaspuntoventaBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setText(facturaspuntoventaBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setText(facturaspuntoventaBean.getiva().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setText(facturaspuntoventaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setText(facturaspuntoventaBean.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setText(facturaspuntoventaBean.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturasPuntoVenta(FacturasPuntoVentaParameterReturnGeneral facturaspuntoventaReturnGeneral,FacturasPuntoVentaBean facturaspuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			FacturasPuntoVenta facturaspuntoventaLocal=new FacturasPuntoVenta();
			
			facturaspuntoventaLocal=facturaspuntoventaReturnGeneral.getFacturasPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturaspuntoventaLocal.getId()!=null && !facturaspuntoventaLocal.getId().equals(0L))) {facturaspuntoventaBean.setId(facturaspuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.getnombre_completo_cliente()!=null && !facturaspuntoventaLocal.getnombre_completo_cliente().equals(""))) {facturaspuntoventaBean.setnombre_completo_cliente(facturaspuntoventaLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.gettotal_iva()!=null && !facturaspuntoventaLocal.gettotal_iva().equals(0.0))) {facturaspuntoventaBean.settotal_iva(facturaspuntoventaLocal.gettotal_iva());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.gettotal_sin_iva()!=null && !facturaspuntoventaLocal.gettotal_sin_iva().equals(0.0))) {facturaspuntoventaBean.settotal_sin_iva(facturaspuntoventaLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.getiva()!=null && !facturaspuntoventaLocal.getiva().equals(0.0))) {facturaspuntoventaBean.setiva(facturaspuntoventaLocal.getiva());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.getdescuento()!=null && !facturaspuntoventaLocal.getdescuento().equals(0.0))) {facturaspuntoventaBean.setdescuento(facturaspuntoventaLocal.getdescuento());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.gettotal()!=null && !facturaspuntoventaLocal.gettotal().equals(0.0))) {facturaspuntoventaBean.settotal(facturaspuntoventaLocal.gettotal());}
			if(conDefault || (!conDefault && facturaspuntoventaLocal.getruc_cliente()!=null && !facturaspuntoventaLocal.getruc_cliente().equals(""))) {facturaspuntoventaBean.setruc_cliente(facturaspuntoventaLocal.getruc_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturasPuntoVentaGenerico(Long idFacturasPuntoVentaSeleccionado,JComboBox jComboBoxFacturasPuntoVenta,List<FacturasPuntoVenta> facturaspuntoventasLocal)throws Exception {
		try {
			FacturasPuntoVenta  facturaspuntoventaTemp=null;

			for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasLocal) {
				if(facturaspuntoventaAux.getId()!=null && facturaspuntoventaAux.getId().equals(idFacturasPuntoVentaSeleccionado)) {
					facturaspuntoventaTemp=facturaspuntoventaAux;
					break;
				}
			}

			jComboBoxFacturasPuntoVenta.setSelectedItem(facturaspuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturasPuntoVentaGenerico(JComboBox jComboBoxFacturasPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturasPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturasPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturasPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturasPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaspuntoventa=(FacturasPuntoVenta) facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturaspuntoventa =(FacturasPuntoVenta) facturaspuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturaspuntoventa.getIsNew() && !facturaspuntoventa.getIsChanged() && !facturaspuntoventa.getIsDeleted()) {
				sDescripcion=facturaspuntoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturaspuntoventa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturasPuntoVenta facturaspuntoventaRow=new FacturasPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaspuntoventaRow=(FacturasPuntoVenta) facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturaspuntoventaRow=(FacturasPuntoVenta) facturaspuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturasPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));			
			this.jButtonDuplicarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarFacturasPuntoVenta && this.isPermisoDuplicarFacturasPuntoVenta));			
			this.jButtonCopiarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarFacturasPuntoVenta && this.isPermisoCopiarFacturasPuntoVenta));
			this.jButtonVerFormFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormFacturasPuntoVenta && this.isPermisoVerFormFacturasPuntoVenta));
			
			this.jButtonAbrirOrderByFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));			
			
			this.jButtonNuevoRelacionesFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));			
			this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaModificarFacturasPuntoVenta && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarFacturasPuntoVenta && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarFacturasPuntoVenta && this.isPermisoEliminarFacturasPuntoVenta));
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarFacturasPuntoVenta);							
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));						
			this.jButtonDuplicarToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarFacturasPuntoVenta && this.isPermisoDuplicarFacturasPuntoVenta));						
			this.jButtonCopiarToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarFacturasPuntoVenta && this.isPermisoCopiarFacturasPuntoVenta));			
			this.jButtonVerFormToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormFacturasPuntoVenta && this.isPermisoVerFormFacturasPuntoVenta));			
			this.jButtonAbrirOrderByToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));
			this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaModificarFacturasPuntoVenta && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarFacturasPuntoVenta  && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarFacturasPuntoVenta && this.isPermisoEliminarFacturasPuntoVenta));
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarToolBarFacturasPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarFacturasPuntoVenta);				
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));			
			this.jMenuItemDuplicarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarFacturasPuntoVenta && this.isPermisoDuplicarFacturasPuntoVenta));			
			this.jMenuItemCopiarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarFacturasPuntoVenta && this.isPermisoCopiarFacturasPuntoVenta));			
			this.jMenuItemVerFormFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormFacturasPuntoVenta && this.isPermisoVerFormFacturasPuntoVenta));			
			this.jMenuItemAbrirOrderByFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));			
			//this.jMenuItemMostrarOcultarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenFacturasPuntoVenta && this.isPermisoOrdenFacturasPuntoVenta));			
			this.jMenuItemNuevoRelacionesFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoFacturasPuntoVenta && this.isPermisoNuevoFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemModificarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaModificarFacturasPuntoVenta && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemActualizarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarFacturasPuntoVenta && this.isPermisoActualizarFacturasPuntoVenta));	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemEliminarFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarFacturasPuntoVenta && this.isPermisoEliminarFacturasPuntoVenta));
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemCancelarFacturasPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarFacturasPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=this.jButtonNuevoFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarFacturasPuntoVenta=this.jButtonDuplicarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarFacturasPuntoVenta=this.jButtonCopiarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormFacturasPuntoVenta=this.jButtonVerFormFacturasPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturasPuntoVenta=this.jButtonAbrirOrderByFacturasPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=this.jButtonNuevoRelacionesFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=this.jButtonModificarFacturasPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=this.jButtonGuardarCambiosTablaFacturasPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=this.jButtonNuevoToolBarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarToolBarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarToolBarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarToolBarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarToolBarFacturasPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasPuntoVenta=this.jButtonGuardarCambiosToolBarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=this.jMenuItemNuevoFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=this.jMenuItemNuevoRelacionesFacturasPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemModificarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemActualizarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemEliminarFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemCancelarFacturasPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasPuntoVenta=this.jMenuItemGuardarCambiosFacturasPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturasPuntoVenta(Boolean esInicializar) {
		if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturasPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturasPuntoVenta() {
		this.jButtonNuevoFacturasPuntoVenta.setVisible(this.isPermisoNuevoFacturasPuntoVenta);			
		this.jButtonDuplicarFacturasPuntoVenta.setVisible(this.isPermisoDuplicarFacturasPuntoVenta);			
		this.jButtonCopiarFacturasPuntoVenta.setVisible(this.isPermisoCopiarFacturasPuntoVenta);			
		this.jButtonVerFormFacturasPuntoVenta.setVisible(this.isPermisoVerFormFacturasPuntoVenta);			
		
		this.jButtonAbrirOrderByFacturasPuntoVenta.setVisible(this.isPermisoOrdenFacturasPuntoVenta);					
		
		this.jButtonNuevoRelacionesFacturasPuntoVenta.setVisible(this.isPermisoNuevoFacturasPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarFacturasPuntoVenta.setVisible(this.isPermisoActualizarFacturasPuntoVenta);	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.setVisible(this.isPermisoActualizarFacturasPuntoVenta);	
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.setVisible(this.isPermisoEliminarFacturasPuntoVenta);
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarFacturasPuntoVenta);						
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.setVisible(this.isPermisoGuardarCambiosFacturasPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setVisible(this.isPermisoActualizarFacturasPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasPuntoVenta() {
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarFacturasPuntoVenta.setVisible(this.isPermisoActualizarFacturasPuntoVenta);	
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.setVisible(this.isPermisoActualizarFacturasPuntoVenta);	
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.setVisible(this.isPermisoEliminarFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarFacturasPuntoVenta);							
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarFacturasPuntoVenta && this.isPermisoGuardarCambiosFacturasPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturasPuntoVenta() {
		if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturasPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturasPuntoVenta() {
	}
	
	public void jTableDatosFacturasPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturasPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturaspuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturasPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturasPuntoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturaspuntoventaLogic.getConnexion());

				if(this.facturaspuntoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturaspuntoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasPuntoVenta=(TitledBorder)this.jScrollPanelDatosFacturasPuntoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturasPuntoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturaspuntoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.facturaspuntoventa.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.facturaspuntoventa.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.facturaspuntoventa.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.facturaspuntoventa.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.facturaspuntoventa.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.facturaspuntoventa.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.facturaspuntoventa.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.facturaspuntoventa.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clienteFacturasPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.getfacturaspuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaspuntoventa==null) {
						this.facturaspuntoventa = new FacturasPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);
				}

				if(this.facturaspuntoventa.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.facturaspuntoventa.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturasPuntoVentaFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);

			this.getFacturasPuntoVentasBusquedaFacturasPuntoVenta();

			this.inicializarActualizarBindingFacturasPuntoVenta(false);

			//if(FacturasPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturasPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);

			this.getFacturasPuntoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingFacturasPuntoVenta(false);

			//if(FacturasPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaspuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturasPuntoVenta() {
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.dispose();
			this.jInternalFrameDetalleFormFacturasPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturasPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoFacturasPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionFacturasPuntoVenta!=null) {
			this.jInternalFrameImportacionFacturasPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionFacturasPuntoVenta.dispose();
			this.jInternalFrameImportacionFacturasPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturasPuntoVenta();
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturasPuntoVenta")) {
				jButtonDuplicarFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturasPuntoVenta")) {
				jButtonCopiarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturasPuntoVenta")) {
				jButtonVerFormFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturasPuntoVenta")) {
				jButtonDuplicarFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturasPuntoVenta")) {
				jButtonDuplicarFacturasPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturasPuntoVenta")) {
				jButtonModificarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturasPuntoVenta")) {
				jButtonModificarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturasPuntoVenta")) {
				jButtonModificarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturasPuntoVenta")) {
				jButtonActualizarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturasPuntoVenta")) {
				jButtonActualizarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturasPuntoVenta")) {
				jButtonActualizarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturasPuntoVenta")) {
				jButtonEliminarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturasPuntoVenta")) {
				jButtonEliminarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturasPuntoVenta")) {
				jButtonEliminarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturasPuntoVenta")) {
				jButtonCancelarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturasPuntoVenta")) {
				jButtonCancelarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturasPuntoVenta")) {
				jButtonCancelarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturasPuntoVenta")) {
				jButtonCerrarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturasPuntoVenta")) {
				jButtonCerrarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturasPuntoVenta")) {
				jButtonCerrarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturasPuntoVenta")) {
				jButtonMostrarOcultarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturasPuntoVenta")) {
				jButtonCancelarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturasPuntoVenta")) {
				jButtonCopiarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturasPuntoVenta")) {
				jButtonVerFormFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturasPuntoVenta")) {
				jButtonCopiarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturasPuntoVenta")) {
				jButtonVerFormFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturasPuntoVenta")) {
				jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturasPuntoVenta")) {
				jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturasPuntoVenta")) {
				jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturasPuntoVenta")) {
				jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturasPuntoVenta")) {
				jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturasPuntoVenta")) {
				jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturasPuntoVenta")) {
				jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturasPuntoVenta")) {
				jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturasPuntoVenta")) {
				jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturasPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturasPuntoVenta")) {
				jButtonAbrirOrderByFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturasPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturasPuntoVenta")) {
				jButtonMostrarOcultarFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasPuntoVenta")) {
				jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturasPuntoVenta")) {
				jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturasPuntoVenta")) {
				jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturasPuntoVenta")) {
				jButtonCerrarReporteDinamicoFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturasPuntoVenta")) {
				jButtonGenerarReporteDinamicoFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturasPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturasPuntoVenta")) {
				jButtonCerrarImportacionFacturasPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturasPuntoVenta")) {
				
				jButtonGenerarImportacionFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturasPuntoVenta")) {
				
				jButtonAbrirImportacionFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturasPuntoVenta")) {
				jComboBoxTiposAccionesFacturasPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturasPuntoVenta")) {
				jComboBoxTiposRelacionesFacturasPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturasPuntoVenta")) {
				jComboBoxTiposAccionesFacturasPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturasPuntoVenta")) {
				
				jComboBoxTiposSeleccionarFacturasPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturasPuntoVenta")) {
				jTextFieldValorCampoGeneralFacturasPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturasPuntoVenta")) {
				jButtonAbrirOrderByFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturasPuntoVenta")) {
				jButtonAbrirOrderByFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturasPuntoVenta")) {
				jButtonCerrarOrderByFacturasPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasPuntoVentaBusqueda")) {
				this.jButtonidFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasPuntoVentaUpdate")) {
				this.jButtonid_empresaFacturasPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasPuntoVentaBusqueda")) {
				this.jButtonid_empresaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeFacturasPuntoVentaBusqueda")) {
				this.jButtonfecha_desdeFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaFacturasPuntoVentaBusqueda")) {
				this.jButtonfecha_hastaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasPuntoVentaBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaFacturasPuntoVentaBusqueda")) {
				this.jButtontotal_ivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaFacturasPuntoVentaBusqueda")) {
				this.jButtontotal_sin_ivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasPuntoVentaBusqueda")) {
				this.jButtonivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoFacturasPuntoVentaBusqueda")) {
				this.jButtondescuentoFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasPuntoVentaBusqueda")) {
				this.jButtontotalFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteFacturasPuntoVentaBusqueda")) {
				this.jButtonruc_clienteFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturasPuntoVentaFacturasPuntoVenta")) {
				this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturasPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturasPuntoVenta facturaspuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturaspuntoventaLocal=this.facturaspuntoventa;
			} else {
				facturaspuntoventaLocal=this.facturaspuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
							
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
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
			
			


			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
								
						
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
								
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
							
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
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
			
			


			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
								
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturasPuntoVenta")) {
					jCheckBoxSeleccionarTodosFacturasPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturasPuntoVenta")) {
					jCheckBoxSeleccionadosFacturasPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturasPuntoVenta")) {
					
				}
				
				


				
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
												
				
				


				
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
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
			
			


			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaspuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaspuntoventa);
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
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
				
				


				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaspuntoventaAnterior =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturasPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturasPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturasPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturaspuntoventa =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturaspuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturasPuntoVenta")) {
				
				}
				
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturasPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturasPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturasPuntoVenta")) {
			
			}
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturasPuntoVenta();
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturasPuntoVenta")) {
				jButtonDuplicarFacturasPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturasPuntoVenta")) {
				jButtonCopiarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturasPuntoVenta")) {
				jButtonVerFormFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturasPuntoVenta")) {
				jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturasPuntoVenta")) {
				jButtonModificarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturasPuntoVenta")) {
				jButtonActualizarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturasPuntoVenta")) {
				jButtonEliminarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturasPuntoVenta")) {
				jButtonCancelarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturasPuntoVenta")) {
				jButtonCerrarFacturasPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturasPuntoVenta")) {
				jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasPuntoVenta")) {
				jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturasPuntoVenta")) {
				jButtonAbrirOrderByFacturasPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturasPuntoVenta")) {
				jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturasPuntoVenta")) {
				jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturasPuntoVenta")) {
				jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasPuntoVentaBusqueda")) {
				this.jButtonidFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasPuntoVentaUpdate")) {
				this.jButtonid_empresaFacturasPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasPuntoVentaBusqueda")) {
				this.jButtonid_empresaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeFacturasPuntoVentaBusqueda")) {
				this.jButtonfecha_desdeFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaFacturasPuntoVentaBusqueda")) {
				this.jButtonfecha_hastaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasPuntoVentaBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaFacturasPuntoVentaBusqueda")) {
				this.jButtontotal_ivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaFacturasPuntoVentaBusqueda")) {
				this.jButtontotal_sin_ivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasPuntoVentaBusqueda")) {
				this.jButtonivaFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoFacturasPuntoVentaBusqueda")) {
				this.jButtondescuentoFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasPuntoVentaBusqueda")) {
				this.jButtontotalFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteFacturasPuntoVentaBusqueda")) {
				this.jButtonruc_clienteFacturasPuntoVentaBusquedaActionPerformed(evt);
			}
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturasPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturasPuntoVenta")) {
				closingInternalFrameFacturasPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarFacturasPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturasPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            FacturasPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(FacturasPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturasPuntoVentaActionPerformed(null);
			}
			
			FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturaspuntoventa,new Object(),this.facturaspuntoventaParameterGeneral,this.facturaspuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturasPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturasPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturasPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturaspuntoventa)) {
			if(!esControlTabla) {
				if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);			
				}
				
				if(this.facturaspuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral,this.facturaspuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturaspuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturasPuntoVenta(classes,this.facturaspuntoventaReturnGeneral,this.facturaspuntoventaBean,false);
					}
						
					if(this.facturaspuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta());	
					}
						
					if(this.facturaspuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta(),classes);//this.facturaspuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturasPuntoVenta(this.facturaspuntoventa,classes);//this.facturaspuntoventaBean);									
				}
			
				if(FacturasPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturasPuntoVenta(this.facturaspuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasPuntoVenta(this.facturaspuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturaspuntoventaAnterior!=null) {
						this.facturaspuntoventa=this.facturaspuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturaspuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturaspuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta(),facturaspuntoventaLogic.getFacturasPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVenta(),this.facturaspuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturasPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturasPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturasPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturasPuntoVenta() throws Exception {
		
		FacturasPuntoVentaModel facturaspuntoventaModel=(FacturasPuntoVentaModel)this.jTableDatosFacturasPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaspuntoventaModel.facturaspuntoventas=this.facturaspuntoventaLogic.getFacturasPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturaspuntoventaModel.facturaspuntoventas=this.facturaspuntoventas;
		}
		
		
		((FacturasPuntoVentaModel) this.jTableDatosFacturasPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturasPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturaspuntoventaAnterior(),this.facturaspuntoventaLogic.getFacturasPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturaspuntoventaAnterior(),this.facturaspuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturasPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaspuntoventa,new Object(),generalEntityParameterGeneral,this.facturaspuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturasPuntoVentaConstantesFunciones.getClassesRelationshipsOfFacturasPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturasPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfFacturasPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturasPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturasPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaspuntoventa,new Object(),generalEntityParameterGeneral,this.facturaspuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturasPuntoVenta(FacturasPuntoVentaBean facturaspuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturasPuntoVenta(ArrayList<Classe> classes,FacturasPuntoVentaReturnGeneral facturaspuntoventaReturnGeneral,FacturasPuntoVentaBean facturaspuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturaspuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta = new FacturasPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.facturaspuntoventaSessionBean.getConGuardarRelaciones(),this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.facturaspuntoventaLogic=this.facturaspuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyFacturasPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturasPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturasPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasPuntoVenta"));
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarFacturasPuntoVenta"));

		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasPuntoVenta"));
					
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemModificarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarFacturasPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasPuntoVenta"));
						
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemActualizarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarFacturasPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasPuntoVenta"));
								
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemEliminarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarFacturasPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasPuntoVenta"));
					
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemCancelarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemDetalleCerrarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonidFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_desdeFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_hastaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtondescuentoFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotalFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonruc_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturasPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturasPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasPuntoVenta"));
		}
		
		this.jTableDatosFacturasPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturasPuntoVenta"));
		
		this.jTableDatosFacturasPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturasPuntoVenta"));
		
		this.jButtonNuevoFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoFacturasPuntoVenta"));
		
		this.jButtonDuplicarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarFacturasPuntoVenta"));
		
		this.jButtonCopiarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarFacturasPuntoVenta"));
		
		this.jButtonVerFormFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormFacturasPuntoVenta"));
		
		
		this.jButtonNuevoToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturasPuntoVenta"));
			
		this.jButtonDuplicarToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturasPuntoVenta"));
			
		this.jMenuItemNuevoFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturasPuntoVenta"));
			
		this.jMenuItemDuplicarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturasPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturasPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturasPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturasPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarFacturasPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonModificarToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasPuntoVenta"));
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemModificarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarFacturasPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonActualizarToolBarFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasPuntoVenta"));
				
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemActualizarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarFacturasPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonEliminarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasPuntoVenta"));
						
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemEliminarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarFacturasPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonCancelarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasPuntoVenta"));
			
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemCancelarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturasPuntoVenta"));		
		
		
		this.jButtonCerrarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarFacturasPuntoVenta"));
		
		
		this.jButtonCerrarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturasPuntoVenta"));
			
		this.jMenuItemCerrarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturasPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jMenuItemDetalleCerrarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturasPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturasPuntoVenta"));
			
		this.jButtonVerFormToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturasPuntoVenta"));
		
		this.jMenuItemGuardarCambiosFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturasPuntoVenta"));
			
		this.jMenuItemCopiarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturasPuntoVenta"));		
		
		this.jMenuItemVerFormFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturasPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturasPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturasPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturasPuntoVenta"));
		
		this.jMenuItemRecargarInformacionFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturasPuntoVenta"));		
		
		
		
		this.jButtonAnterioresFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresFacturasPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturasPuntoVenta"));
		
		this.jMenuItemAnterioresFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturasPuntoVenta"));		
		
		
		this.jButtonSiguientesFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesFacturasPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturasPuntoVenta"));
			
		this.jMenuItemSiguientesFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturasPuntoVenta"));
			
		this.jMenuItemAbrirOrderByFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturasPuntoVenta"));
			
		this.jMenuItemMostrarOcultarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturasPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturasPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturasPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturasPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturasPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturasPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturasPuntoVenta"));

		this.jCheckBoxSeleccionadosFacturasPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturasPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturasPuntoVenta"));
			
		this.jComboBoxTiposAccionesFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturasPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturasPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturasPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonidFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_desdeFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_hastaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtondescuentoFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotalFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonruc_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturasPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"BusquedaFacturasPuntoVentaFacturasPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturasPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasPuntoVenta"));
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasPuntoVenta"));
				this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturasPuntoVenta!=null) {
				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasPuntoVenta"));
				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasPuntoVenta"));
				this.jInternalFrameImportacionFacturasPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturasPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarFacturasPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturasPuntoVenta"));			
			
			if(this.jInternalFrameOrderByFacturasPuntoVenta!=null) {
				this.jInternalFrameOrderByFacturasPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasPuntoVenta.jTabbedPaneRelacionesFacturasPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasPuntoVenta"));
		
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
            		closingInternalFrameFacturasPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturasPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            FacturasPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(FacturasPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturasPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturasPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturasPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturasPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturasPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturasPuntoVenta";
		inputMap = this.jButtonNuevoFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturasPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturasPuntoVenta";
		inputMap = this.jButtonModificarFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturasPuntoVenta";
		inputMap = this.jButtonActualizarFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturasPuntoVenta";
		inputMap = this.jButtonEliminarFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturasPuntoVenta";
		inputMap = this.jButtonCancelarFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturasPuntoVenta";
		inputMap = this.jButtonCerrarFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturasPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonGuardarCambiosFacturasPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturasPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturasPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturasPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturasPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturasPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturasPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonidFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonid_empresaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_desdeFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonfecha_hastaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonnombre_completo_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotal_sin_ivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonivaFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtondescuentoFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtontotalFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jButtonruc_clienteFacturasPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteFacturasPuntoVentaBusqueda"));
		
		
		this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta.addActionListener(new ButtonActionListener(this,"BusquedaFacturasPuntoVentaFacturasPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturasPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturasPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturasPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturasPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturasPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
					facturaspuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventas) {
					facturaspuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturasPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
						facturaspuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventas) {
						facturaspuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturasPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturasPuntoVenta.getSelectedRows();
			
			FacturasPuntoVenta facturaspuntoventaLocal=new FacturasPuntoVenta();
			
			//this.seleccionarTodosFacturasPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaspuntoventaLocal =(FacturasPuntoVenta) this.facturaspuntoventaLogic.getFacturasPuntoVentas().toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturaspuntoventaLocal =(FacturasPuntoVenta) this.facturaspuntoventas.toArray()[this.jTableDatosFacturasPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturaspuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
						facturaspuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventas) {
						facturaspuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturasPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturasPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturasPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturasPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventaLogic.getFacturasPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							facturaspuntoventaAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							facturaspuntoventaAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturaspuntoventaAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							facturaspuntoventaAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							facturaspuntoventaAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturaspuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							facturaspuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturaspuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							facturaspuntoventaAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventas) {
					
						if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							facturaspuntoventaAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							facturaspuntoventaAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturaspuntoventaAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							facturaspuntoventaAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							facturaspuntoventaAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturaspuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							facturaspuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturaspuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							facturaspuntoventaAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturasPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturasPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturasPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturasPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturasPuntoVenta(conSplash);
				
					this.generarReporteFacturasPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturasPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasPuntoVenta();
				
				this.exportarFacturasPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturasPuntoVentas();
				//this.importarFacturasPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturasPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturas Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturasPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturasPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturasPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturasPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturasPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturasPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralFacturasPuntoVenta();
						
						this.generarReporteProcesoAccionFacturasPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturasPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Facturas Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Facturas Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturasPuntoVenta();
				
						this.actualizarParametrosGeneralFacturasPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturaspuntoventaReturnGeneral=facturaspuntoventaLogic.procesarAccionFacturasPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturaspuntoventaLogic.getFacturasPuntoVentas(),this.facturaspuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturasPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturasPuntoVenta();
					
					FacturasPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturasPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxTiposAccionesFormularioFacturasPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturasPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturasPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturasPuntoVenta();
			
			if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
			FacturasPuntoVenta facturaspuntoventa=new FacturasPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturasPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturasPuntoVenta.getSelectedItem();
			
			
			
			
			facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturaspuntoventasSeleccionados.size()==1) {
				for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
					facturaspuntoventa=facturaspuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturasPuntoVenta();
			
      		//this.finishProcessFacturasPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturasPuntoVentaReturnGeneral() throws Exception {
		if(this.facturaspuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturaspuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturaspuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturaspuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturaspuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturaspuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
		}
		
		if(this.facturaspuntoventaReturnGeneral.getConRetornoLista() || this.facturaspuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.facturaspuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturaspuntoventaLogic.setFacturasPuntoVentas(this.facturaspuntoventaReturnGeneral.getFacturasPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturasPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturasPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<FacturasPuntoVenta> getFacturasPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturasPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventaLogic.getFacturasPuntoVentas()) {
					if(facturaspuntoventaAux.getIsSelected()) {
						facturaspuntoventasSeleccionados.add(facturaspuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasPuntoVenta facturaspuntoventaAux:this.facturaspuntoventas) {
					if(facturaspuntoventaAux.getIsSelected()) {
						facturaspuntoventasSeleccionados.add(facturaspuntoventaAux);				
					}
				}
			}
			
			if(facturaspuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturaspuntoventasSeleccionados.addAll(this.facturaspuntoventaLogic.getFacturasPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturaspuntoventasSeleccionados.addAll(this.facturaspuntoventas);				
					}
				}
			}
		} else {
			facturaspuntoventasSeleccionados.add(this.facturaspuntoventa);
		}
		
		return facturaspuntoventasSeleccionados;
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
	
	public void generarReporteFacturasPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturasPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturasPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturas Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturasPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturasPuntoVenta();
		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturasPuntoVenta();
		
		
		//this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados ,facturaspuntoventaImplementable,facturaspuntoventaImplementableHome);
	}
	
	public void mostrarImportacionFacturasPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturasPuntoVenta();
		
		this.abrirFrameImportacionFacturasPuntoVenta();		
		
			
		//this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados ,facturaspuntoventaImplementable,facturaspuntoventaImplementableHome);
	}
	
	public void importarFacturasPuntoVentas() throws Exception {		
	
	}
	
	public void exportarFacturasPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturasPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturasPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturasPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturas Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturasPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturasPuntoVenta(facturaspuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturaspuntoventaAux.setsDetalleGeneralEntityReporte(facturaspuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturasPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturaspuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaspuntoventa.getruc_cliente();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturasPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturasPuntoVenta(row);				
				iRow++;
			}				
			
			for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturasPuntoVenta(facturaspuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturasPuntoVentasSeleccionados() throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();		
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaspuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturaspuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturaspuntoventa");
			//elementRoot.appendChild(element);
		
			for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
				element = document.createElement("facturaspuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturasPuntoVenta(facturaspuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturasPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaspuntoventa.getruc_cliente());				
	}
	
	public void setFilaDatosExportarXmlFacturasPuntoVenta(FacturasPuntoVenta facturaspuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturasPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturaspuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturasPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturaspuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturasPuntoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturaspuntoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_desde = document.createElement(FacturasPuntoVentaConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(facturaspuntoventa.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(FacturasPuntoVentaConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(facturaspuntoventa.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_completo_cliente = document.createElement(FacturasPuntoVentaConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(facturaspuntoventa.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementtotal_iva = document.createElement(FacturasPuntoVentaConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(facturaspuntoventa.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(FacturasPuntoVentaConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(facturaspuntoventa.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementiva = document.createElement(FacturasPuntoVentaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(facturaspuntoventa.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(FacturasPuntoVentaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(facturaspuntoventa.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementtotal = document.createElement(FacturasPuntoVentaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(facturaspuntoventa.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementruc_cliente = document.createElement(FacturasPuntoVentaConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(facturaspuntoventa.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);
	}
	
	public void generarReporteGroupGenericoFacturasPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados=new ArrayList<FacturasPuntoVenta>();
		
		facturaspuntoventasSeleccionados=this.getFacturasPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturasPuntoVenta(facturaspuntoventasSeleccionados);
		
		this.generarReporteFacturasPuntoVentas("Todos",facturaspuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturasPuntoVenta(ArrayList<FacturasPuntoVenta> facturaspuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturasPuntoVenta facturaspuntoventaAux:facturaspuntoventasSeleccionados) {
				facturaspuntoventaAux.setsDetalleGeneralEntityReporte(facturaspuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturaspuntoventaAux.setsDescripcionGeneralEntityReporte1(facturaspuntoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					facturaspuntoventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturaspuntoventaAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					facturaspuntoventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturaspuntoventaAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					facturaspuntoventaAux.setsDescripcionGeneralEntityReporte1(facturaspuntoventaAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturasPuntoVentaConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					facturaspuntoventaAux.setsDescripcionGeneralEntityReporte1(facturaspuntoventaAux.getruc_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturasPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturasPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=true;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
			this.isVisibilidadCeldaModificarFacturasPuntoVenta=true;
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaCancelarFacturasPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsFacturasPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturasPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormFacturasPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarFacturasPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturaspuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!facturaspuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;												
			}
			
			this.jButtonCerrarFacturasPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.facturaspuntoventa)) {
			this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
			this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturasPuntoVenta=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturasPuntoVenta=false;
		this.isVisibilidadCeldaGuardarCambiosFacturasPuntoVenta=false;
		//this.isVisibilidadCeldaModificarFacturasPuntoVenta=true;
		this.isVisibilidadCeldaActualizarFacturasPuntoVenta=false;
		this.isVisibilidadCeldaEliminarFacturasPuntoVenta=false;
		//this.isVisibilidadCeldaCancelarFacturasPuntoVenta=true;			
		this.isVisibilidadCeldaGuardarFacturasPuntoVenta=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsFacturasPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionFacturasPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasPuntoVenta!=null) {
				this.jScrollPanelDatosFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasPuntoVenta!=null) {
				this.jPanelPaginacionFacturasPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
					this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasPuntoVenta!=null) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturasPuntoVenta!=null) {
				this.jPanelParametrosReportesFacturasPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturasPuntoVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturasPuntoVenta) {this.jTabbedPaneBusquedasFacturasPuntoVenta.remove(jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);}
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
			
			this.inicializarActualizarBindingTablaFacturasPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturasPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioFacturasPuntoVenta();
		this.updateVisibilidadBusquedasFormularioFacturasPuntoVenta();
		this.updateHabilitarBusquedasFormularioFacturasPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturasPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponents().length>0) {
	

		if(this.facturaspuntoventaConstantesFunciones.resaltarBusquedaFacturasPuntoVentaFacturasPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasFacturasPuntoVenta.indexOfComponent(this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponent(index);
				jPanel.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturasPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasPuntoVenta.indexOfComponent(this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			if(!this.facturaspuntoventaConstantesFunciones.mostrarBusquedaFacturasPuntoVentaFacturasPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasFacturasPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturasPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasPuntoVenta.indexOfComponent(this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturaspuntoventaConstantesFunciones.activarBusquedaFacturasPuntoVentaFacturasPuntoVenta);
				this.jTabbedPaneBusquedasFacturasPuntoVenta.setEnabledAt(index,this.facturaspuntoventaConstantesFunciones.activarBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturasPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturasPuntoVenta")) {
			index= this.jTabbedPaneBusquedasFacturasPuntoVenta.indexOfComponent(this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);

			this.jTabbedPaneBusquedasFacturasPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasPuntoVenta.getComponent(index);

			this.facturaspuntoventaConstantesFunciones.setResaltarBusquedaFacturasPuntoVentaFacturasPuntoVenta(resaltar);

			jPanel.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarBusquedaFacturasPuntoVentaFacturasPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturasPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturasPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturasPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioFacturasPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioFacturasPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturasPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturaspuntoventaConstantesFunciones.resaltaridFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltaridFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarid_empresaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarid_empresaFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarfecha_desdeFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_desdeFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarfecha_desdeFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarfecha_hastaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_hastaFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarfecha_hastaFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarnombre_completo_clienteFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarnombre_completo_clienteFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltartotal_ivaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltartotal_ivaFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltartotal_sin_ivaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltartotal_sin_ivaFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarivaFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarivaFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltardescuentoFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltardescuentoFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltartotalFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltartotalFacturasPuntoVenta);}
		if(this.facturaspuntoventaConstantesFunciones.resaltarruc_clienteFacturasPuntoVenta!=null && this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setBorder(this.facturaspuntoventaConstantesFunciones.resaltarruc_clienteFacturasPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturasPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostraridFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelidFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostraridFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarid_empresaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelid_empresaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarid_empresaFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_desdeFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarfecha_desdeFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelfecha_desdeFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarfecha_desdeFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_hastaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarfecha_hastaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelfecha_hastaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarfecha_hastaFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarnombre_completo_clienteFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelnombre_completo_clienteFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarnombre_completo_clienteFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotal_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPaneltotal_ivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotal_ivaFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotal_sin_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPaneltotal_sin_ivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotal_sin_ivaFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelivaFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarivaFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrardescuentoFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPaneldescuentoFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrardescuentoFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotalFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPaneltotalFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrartotalFacturasPuntoVenta);
		//this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarruc_clienteFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jPanelruc_clienteFacturasPuntoVenta.setVisible(this.facturaspuntoventaConstantesFunciones.mostrarruc_clienteFacturasPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturasPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jLabelidFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activaridFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jComboBoxid_empresaFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarid_empresaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_desdeFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarfecha_desdeFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jDateChooserfecha_hastaFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarfecha_hastaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextAreanombre_completo_clienteFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarnombre_completo_clienteFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_ivaFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activartotal_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotal_sin_ivaFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activartotal_sin_ivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldivaFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarivaFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFielddescuentoFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activardescuentoFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldtotalFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activartotalFacturasPuntoVenta);
		this.jInternalFrameDetalleFormFacturasPuntoVenta.jTextFieldruc_clienteFacturasPuntoVenta.setEnabled(this.facturaspuntoventaConstantesFunciones.activarruc_clienteFacturasPuntoVenta);
		}
	}
	
		
}