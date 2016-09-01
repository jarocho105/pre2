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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.PresupuestosFlujosCajaConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PresupuestosFlujosCajaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PresupuestosFlujosCajaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.PresupuestosFlujosCajaBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class PresupuestosFlujosCajaBeanSwingJInternalFrame extends PresupuestosFlujosCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestosFlujosCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestosFlujosCaja> presupuestosflujoscajaValidator = new ClassValidator<PresupuestosFlujosCaja>(PresupuestosFlujosCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestosFlujosCaja presupuestosflujoscaja;	
	public PresupuestosFlujosCaja presupuestosflujoscajaAux;
	public PresupuestosFlujosCaja presupuestosflujoscajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestosFlujosCaja presupuestosflujoscajaTotales;
	public Long idPresupuestosFlujosCajaActual;
	public Long iIdNuevoPresupuestosFlujosCaja=0L;
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
	
	public Boolean isPermisoTodoPresupuestosFlujosCaja;
	public Boolean isPermisoNuevoPresupuestosFlujosCaja;
	public Boolean isPermisoActualizarPresupuestosFlujosCaja;
	public Boolean isPermisoActualizarOriginalPresupuestosFlujosCaja;
	public Boolean isPermisoEliminarPresupuestosFlujosCaja;
	public Boolean isPermisoGuardarCambiosPresupuestosFlujosCaja;
	public Boolean isPermisoConsultaPresupuestosFlujosCaja;
	public Boolean isPermisoBusquedaPresupuestosFlujosCaja;
	public Boolean isPermisoReportePresupuestosFlujosCaja;
	public Boolean isPermisoPaginacionMedioPresupuestosFlujosCaja;
	public Boolean isPermisoPaginacionAltoPresupuestosFlujosCaja;
	public Boolean isPermisoPaginacionTodoPresupuestosFlujosCaja;
	public Boolean isPermisoCopiarPresupuestosFlujosCaja;
	public Boolean isPermisoVerFormPresupuestosFlujosCaja;
	public Boolean isPermisoDuplicarPresupuestosFlujosCaja;
	public Boolean isPermisoOrdenPresupuestosFlujosCaja;
	
	
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
	
	public PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaReturnGeneral;
	public PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestosFlujosCaja=false;
	public Boolean esParaAccionDesdeFormularioPresupuestosFlujosCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestosFlujosCajaSessionBeanAdditional presupuestosflujoscajaSessionBeanAdditional=null;
	
	public PresupuestosFlujosCajaSessionBeanAdditional getPresupuestosFlujosCajaSessionBeanAdditional() {
		return this.presupuestosflujoscajaSessionBeanAdditional;
	}
	
	public void setPresupuestosFlujosCajaSessionBeanAdditional(PresupuestosFlujosCajaSessionBeanAdditional presupuestosflujoscajaSessionBeanAdditional) {
		try {
			this.presupuestosflujoscajaSessionBeanAdditional=presupuestosflujoscajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional presupuestosflujoscajaBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestosFlujosCajaBeanSwingJInternalFrame
	
	public PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional getPresupuestosFlujosCajaBeanSwingJInternalFrameAdditional() {
		return this.presupuestosflujoscajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestosFlujosCajaBeanSwingJInternalFrameAdditional(PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional presupuestosflujoscajaBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestosflujoscajaBeanSwingJInternalFrameAdditional=presupuestosflujoscajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestosFlujosCajaLogic presupuestosflujoscajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestosFlujosCaja presupuestosflujoscajaBean;
	public PresupuestosFlujosCajaConstantesFunciones presupuestosflujoscajaConstantesFunciones;
	//public PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestosFlujosCaja> presupuestosflujoscajas;	
	//public List<PresupuestosFlujosCaja> presupuestosflujoscajasEliminados;
	//public List<PresupuestosFlujosCaja> presupuestosflujoscajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestosFlujosCaja=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestosFlujosCaja=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestosFlujosCaja=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestosFlujosCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPresupuestosFlujosCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPresupuestosFlujosCaja() {
		return this.iIdNuevoPresupuestosFlujosCaja;
	}

	public void setiIdNuevoPresupuestosFlujosCaja(Long iIdNuevoPresupuestosFlujosCaja) {
		this.iIdNuevoPresupuestosFlujosCaja = iIdNuevoPresupuestosFlujosCaja;
	}
	
	public Long getidPresupuestosFlujosCajaActual() {
		return this.idPresupuestosFlujosCajaActual;
	}

	public void setidPresupuestosFlujosCajaActual(Long idPresupuestosFlujosCajaActual) {
		this.idPresupuestosFlujosCajaActual = idPresupuestosFlujosCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestosFlujosCaja getpresupuestosflujoscaja() {
		return this.presupuestosflujoscaja;
	}

	public void setpresupuestosflujoscaja(PresupuestosFlujosCaja presupuestosflujoscaja) {
		this.presupuestosflujoscaja = presupuestosflujoscaja;
	}
	
	public PresupuestosFlujosCaja getpresupuestosflujoscajaAux() {
		return this.presupuestosflujoscajaAux;
	}

	public void setpresupuestosflujoscajaAux(PresupuestosFlujosCaja presupuestosflujoscajaAux) {
		this.presupuestosflujoscajaAux = presupuestosflujoscajaAux;
	}				
	
	public PresupuestosFlujosCaja getpresupuestosflujoscajaAnterior() {
		return this.presupuestosflujoscajaAnterior;
	}

	public void setpresupuestosflujoscajaAnterior(PresupuestosFlujosCaja presupuestosflujoscajaAnterior) {
		this.presupuestosflujoscajaAnterior = presupuestosflujoscajaAnterior;
	}	
	
	public PresupuestosFlujosCaja getpresupuestosflujoscajaTotales() {
		return this.presupuestosflujoscajaTotales;
	}

	public void setpresupuestosflujoscajaTotales(PresupuestosFlujosCaja presupuestosflujoscajaTotales) {
		this.presupuestosflujoscajaTotales = presupuestosflujoscajaTotales;
	}	
	
	public PresupuestosFlujosCaja getpresupuestosflujoscajaBean() {
		return this.presupuestosflujoscajaBean;
	}

	public void setpresupuestosflujoscajaBean(PresupuestosFlujosCaja presupuestosflujoscajaBean) {
		this.presupuestosflujoscajaBean = presupuestosflujoscajaBean;
	}	
	
	public PresupuestosFlujosCajaParameterReturnGeneral getpresupuestosflujoscajaReturnGeneral() {
		return this.presupuestosflujoscajaReturnGeneral;
	}

	public void setpresupuestosflujoscajaReturnGeneral(PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaReturnGeneral) {
		this.presupuestosflujoscajaReturnGeneral = presupuestosflujoscajaReturnGeneral;
	}	
	
	
	public Long idBusquedaPresupuestosFlujosCaja=0L;

	public Long getidBusquedaPresupuestosFlujosCaja() {
		return this.idBusquedaPresupuestosFlujosCaja;
	}

	public void setidBusquedaPresupuestosFlujosCaja(Long idBusquedaPresupuestosFlujosCaja) {
		this.idBusquedaPresupuestosFlujosCaja = idBusquedaPresupuestosFlujosCaja;
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
	
	
	public PresupuestosFlujosCajaLogic getPresupuestosFlujosCajaLogic()	{		
		return presupuestosflujoscajaLogic;
	}

	public void setPresupuestosFlujosCajaLogic(PresupuestosFlujosCajaLogic presupuestosflujoscajaLogic) {
		this.presupuestosflujoscajaLogic = presupuestosflujoscajaLogic;
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
	
	public Boolean getIsEsNuevoPresupuestosFlujosCaja() {
		return isEsNuevoPresupuestosFlujosCaja;
	}

	public void setIsEsNuevoPresupuestosFlujosCaja(Boolean isEsNuevoPresupuestosFlujosCaja) {
		this.isEsNuevoPresupuestosFlujosCaja = isEsNuevoPresupuestosFlujosCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestosFlujosCaja() {
		return esParaAccionDesdeFormularioPresupuestosFlujosCaja;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestosFlujosCaja(Boolean esParaAccionDesdeFormularioPresupuestosFlujosCaja) {
		this.esParaAccionDesdeFormularioPresupuestosFlujosCaja = esParaAccionDesdeFormularioPresupuestosFlujosCaja;
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

			if(this.presupuestosflujoscajaSessionBean==null) {
				this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
			}

			if(!this.presupuestosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestosflujoscajaSessionBean.getlidEmpresaActual());
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

					if(this.presupuestosflujoscaja!=null) {
						this.presupuestosflujoscaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestosFlujosCajaGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestosFlujosCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestosFlujosCajaGenerico!=null && jComboBoxid_empresaPresupuestosFlujosCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestosFlujosCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestosFlujosCaja presupuestosflujoscaja,JComboBox jComboBoxid_empresaPresupuestosFlujosCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestosFlujosCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestosFlujosCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestosflujoscaja.setid_empresa(empresaAux.getId());
				presupuestosflujoscaja.setempresa_descripcion(PresupuestosFlujosCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestosflujoscaja.setEmpresa(empresaAux);			}
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

					if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { 
					}

					if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPresupuestosFlujosCaja() throws Exception {
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
		
	public PresupuestosFlujosCajaParameterReturnGeneral getPresupuestosFlujosCajaParameterGeneral() {
		return this.presupuestosflujoscajaParameterGeneral;
	}
	
	public void setPresupuestosFlujosCajaParameterGeneral(PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaParameterGeneral) {
		this.presupuestosflujoscajaParameterGeneral = presupuestosflujoscajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestosFlujosCaja() {
		return isPermisoTodoPresupuestosFlujosCaja;
	}

	public void setIsPermisoTodoPresupuestosFlujosCaja(Boolean isPermisoTodoPresupuestosFlujosCaja) {
		this.isPermisoTodoPresupuestosFlujosCaja = isPermisoTodoPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoNuevoPresupuestosFlujosCaja() {
		return isPermisoNuevoPresupuestosFlujosCaja;
	}

	public void setIsPermisoNuevoPresupuestosFlujosCaja(Boolean isPermisoNuevoPresupuestosFlujosCaja) {
		this.isPermisoNuevoPresupuestosFlujosCaja = isPermisoNuevoPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoActualizarPresupuestosFlujosCaja() {
		return isPermisoActualizarPresupuestosFlujosCaja;
	}

	public void setIsPermisoActualizarPresupuestosFlujosCaja(Boolean isPermisoActualizarPresupuestosFlujosCaja) {
		this.isPermisoActualizarPresupuestosFlujosCaja = isPermisoActualizarPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoEliminarPresupuestosFlujosCaja() {
		return isPermisoEliminarPresupuestosFlujosCaja;
	}

	public void setIsPermisoEliminarPresupuestosFlujosCaja(Boolean isPermisoEliminarPresupuestosFlujosCaja) {
		this.isPermisoEliminarPresupuestosFlujosCaja = isPermisoEliminarPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestosFlujosCaja() {
		return isPermisoGuardarCambiosPresupuestosFlujosCaja;
	}

	public void setIsPermisoGuardarCambiosPresupuestosFlujosCaja(Boolean isPermisoGuardarCambiosPresupuestosFlujosCaja) {
		this.isPermisoGuardarCambiosPresupuestosFlujosCaja = isPermisoGuardarCambiosPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoConsultaPresupuestosFlujosCaja() {
		return isPermisoConsultaPresupuestosFlujosCaja;
	}

	public void setIsPermisoConsultaPresupuestosFlujosCaja(Boolean isPermisoConsultaPresupuestosFlujosCaja) {
		this.isPermisoConsultaPresupuestosFlujosCaja = isPermisoConsultaPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoBusquedaPresupuestosFlujosCaja() {
		return isPermisoBusquedaPresupuestosFlujosCaja;
	}

	public void setIsPermisoBusquedaPresupuestosFlujosCaja(Boolean isPermisoBusquedaPresupuestosFlujosCaja) {
		this.isPermisoBusquedaPresupuestosFlujosCaja = isPermisoBusquedaPresupuestosFlujosCaja;
	}

	public Boolean getIsPermisoReportePresupuestosFlujosCaja() {
		return isPermisoReportePresupuestosFlujosCaja;
	}

	public void setIsPermisoReportePresupuestosFlujosCaja(Boolean isPermisoReportePresupuestosFlujosCaja) {
		this.isPermisoReportePresupuestosFlujosCaja = isPermisoReportePresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestosFlujosCaja() {
		return isPermisoPaginacionMedioPresupuestosFlujosCaja;
	}

	public void setIsPermisoPaginacionMedioPresupuestosFlujosCaja(Boolean isPermisoPaginacionMedioPresupuestosFlujosCaja) {
		this.isPermisoPaginacionMedioPresupuestosFlujosCaja = isPermisoPaginacionMedioPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestosFlujosCaja() {
		return isPermisoPaginacionTodoPresupuestosFlujosCaja;
	}

	public void setIsPermisoPaginacionTodoPresupuestosFlujosCaja(Boolean isPermisoPaginacionTodoPresupuestosFlujosCaja) {
		this.isPermisoPaginacionTodoPresupuestosFlujosCaja = isPermisoPaginacionTodoPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestosFlujosCaja() {
		return isPermisoPaginacionAltoPresupuestosFlujosCaja;
	}

	public void setIsPermisoPaginacionAltoPresupuestosFlujosCaja(Boolean isPermisoPaginacionAltoPresupuestosFlujosCaja) {
		this.isPermisoPaginacionAltoPresupuestosFlujosCaja = isPermisoPaginacionAltoPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoCopiarPresupuestosFlujosCaja() {
		return isPermisoCopiarPresupuestosFlujosCaja;
	}

	public void setIsPermisoCopiarPresupuestosFlujosCaja(Boolean isPermisoCopiarPresupuestosFlujosCaja) {
		this.isPermisoCopiarPresupuestosFlujosCaja = isPermisoCopiarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoVerFormPresupuestosFlujosCaja() {
		return isPermisoVerFormPresupuestosFlujosCaja;
	}

	public void setIsPermisoVerFormPresupuestosFlujosCaja(Boolean isPermisoVerFormPresupuestosFlujosCaja) {
		this.isPermisoVerFormPresupuestosFlujosCaja = isPermisoVerFormPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestosFlujosCaja() {
		return isPermisoDuplicarPresupuestosFlujosCaja;
	}

	public void setIsPermisoDuplicarPresupuestosFlujosCaja(Boolean isPermisoDuplicarPresupuestosFlujosCaja) {
		this.isPermisoDuplicarPresupuestosFlujosCaja = isPermisoDuplicarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsPermisoOrdenPresupuestosFlujosCaja() {
		return isPermisoOrdenPresupuestosFlujosCaja;
	}

	public void setIsPermisoOrdenPresupuestosFlujosCaja(Boolean isPermisoOrdenPresupuestosFlujosCaja) {
		this.isPermisoOrdenPresupuestosFlujosCaja = isPermisoOrdenPresupuestosFlujosCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestosFlujosCaja() {
		return isVisibilidadCeldaNuevoPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestosFlujosCaja(Boolean isVisibilidadCeldaNuevoPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja = isVisibilidadCeldaNuevoPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaDuplicarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaDuplicarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja = isVisibilidadCeldaDuplicarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaCopiarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaCopiarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja = isVisibilidadCeldaCopiarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestosFlujosCaja() {
		return isVisibilidadCeldaVerFormPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestosFlujosCaja(Boolean isVisibilidadCeldaVerFormPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja = isVisibilidadCeldaVerFormPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestosFlujosCaja() {
		return isVisibilidadCeldaOrdenPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestosFlujosCaja(Boolean isVisibilidadCeldaOrdenPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja = isVisibilidadCeldaOrdenPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja = isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaModificarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaModificarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaModificarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaModificarPresupuestosFlujosCaja = isVisibilidadCeldaModificarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaActualizarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaActualizarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja = isVisibilidadCeldaActualizarPresupuestosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaEliminarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaEliminarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja = isVisibilidadCeldaEliminarPresupuestosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaCancelarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaCancelarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja = isVisibilidadCeldaCancelarPresupuestosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestosFlujosCaja() {
		return isVisibilidadCeldaGuardarPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestosFlujosCaja(Boolean isVisibilidadCeldaGuardarPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja = isVisibilidadCeldaGuardarPresupuestosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja() {
		return isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja(Boolean isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja = isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja;
	}
		
	public PresupuestosFlujosCajaSessionBean getpresupuestosflujoscajaSessionBean() {
		return this.presupuestosflujoscajaSessionBean;
	}
	
	public void setpresupuestosflujoscajaSessionBean(PresupuestosFlujosCajaSessionBean presupuestosflujoscajaSessionBean) {
		this.presupuestosflujoscajaSessionBean=presupuestosflujoscajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPresupuestosFlujosCaja() {
		return this.isVisibilidadBusquedaPresupuestosFlujosCaja;
	}

	public void setisVisibilidadBusquedaPresupuestosFlujosCaja(Boolean isVisibilidadBusquedaPresupuestosFlujosCaja) {
		this.isVisibilidadBusquedaPresupuestosFlujosCaja=isVisibilidadBusquedaPresupuestosFlujosCaja;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestosflujoscaja,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestosFlujosCaja presupuestosflujoscaja,PresupuestosFlujosCaja presupuestosflujoscajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestosFlujosCaja(presupuestosflujoscaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestosflujoscajaAux.setId(presupuestosflujoscaja.getId());
		presupuestosflujoscajaAux.setVersionRow(presupuestosflujoscaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PresupuestosFlujosCaja presupuestosflujoscajaLocal) throws Exception {
		
		if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestosFlujosCaja presupuestosflujoscajaLocal) throws Exception {	
		if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestosflujoscajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestosFlujosCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestosflujoscajaValidator.getInvalidValues(this.presupuestosflujoscaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestosFlujosCaja presupuestosflujoscaja,List<PresupuestosFlujosCaja> presupuestosflujoscajas) throws Exception {
	}		
	
	public void actualizarSelectedLista(PresupuestosFlujosCaja presupuestosflujoscaja,List<PresupuestosFlujosCaja> presupuestosflujoscajas) throws Exception {
		try	{			
			PresupuestosFlujosCajaConstantesFunciones.actualizarSelectedLista(presupuestosflujoscaja,presupuestosflujoscajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestosFlujosCaja> presupuestosflujoscajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestosflujoscajasLocal=this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestosflujoscajasLocal=this.presupuestosflujoscajas;
			}
			//ARCHITECTURE
		
			for(PresupuestosFlujosCaja presupuestosflujoscajaLocal:presupuestosflujoscajasLocal) {
				if(this.permiteMantenimiento(presupuestosflujoscajaLocal) && presupuestosflujoscajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.getPresupuestosFlujosCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.CODIGOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigo_cuentaPresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigoPresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombrePresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.NOMBREMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombre_moduloPresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor1PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor2PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor3PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor4PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor5PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR6)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor6PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR7)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor7PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR8)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor8PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR9)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor9PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR10)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor10PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR11)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor11PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.VALOR12)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor12PresupuestosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestosFlujosCajaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabeltotalPresupuestosFlujosCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigo_cuentaPresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigoPresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombrePresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombre_moduloPresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor1PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor2PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor3PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor4PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor5PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor6PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor7PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor8PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor9PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor10PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor11PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor12PresupuestosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabeltotalPresupuestosFlujosCaja,"");
		
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
		this.iIdNuevoPresupuestosFlujosCaja--;	
		
		
		this.presupuestosflujoscajaAux=new PresupuestosFlujosCaja();
		
		this.presupuestosflujoscajaAux.setId(this.iIdNuevoPresupuestosFlujosCaja);
		this.presupuestosflujoscajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().add(this.presupuestosflujoscajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestosflujoscajas.add(this.presupuestosflujoscajaAux);
		}
		//ARCHITECTURE
		
		this.presupuestosflujoscaja=this.presupuestosflujoscajaAux;
		
		if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscaja);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestosFlujosCaja(this.presupuestosflujoscaja);
		}
				
		//this.setDefaultControlesPresupuestosFlujosCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestosFlujosCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestosFlujosCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestosFlujosCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscajaBean,this.presupuestosflujoscaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral,this.presupuestosflujoscajaBean,false);
		
		if(this.presupuestosflujoscajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja());
		}
		
		if(this.presupuestosflujoscajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja(),classes);//this.presupuestosflujoscajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestosFlujosCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestosFlujosCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.RecargarFormPresupuestosFlujosCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
						
			if(presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();
			}
			
			this.actualizarVisualTableDatosPresupuestosFlujosCaja();
			
			this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestosFlujosCaja(), this.getIndiceNuevoPresupuestosFlujosCaja());
			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestosFlujosCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarcodigo_cuentaPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarcodigoPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarnombrePresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarnombre_moduloPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor1PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor2PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor3PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor4PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor5PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor6PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor7PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor8PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor9PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor10PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor11PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarvalor12PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activartotalPresupuestosFlujosCaja);	
		//
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setEnabled(isHabilitar && this.presupuestosflujoscajaConstantesFunciones.activarid_empresaPresupuestosFlujosCaja);
	};
	
	public void setDefaultControlesPresupuestosFlujosCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestosFlujosCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(true);			
			this.presupuestosflujoscajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.setVisible(true);
			
					
		} else {
			//this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(false);			
			this.presupuestosflujoscajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestosFlujosCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				if(presupuestosflujoscajaAux.getId().equals(this.iIdNuevoPresupuestosFlujosCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajas) {
				if(presupuestosflujoscajaAux.getId().equals(this.iIdNuevoPresupuestosFlujosCaja)) {
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
	
	public int getIndiceActualPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				if(presupuestosflujoscajaAux.getId().equals(presupuestosflujoscaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajas) {
				if(presupuestosflujoscajaAux.getId().equals(presupuestosflujoscaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				if(presupuestosflujoscajaAux.getPresupuestosFlujosCajaOriginal().getId().equals(presupuestosflujoscajaOriginal.getId())) {
					existe=true;
					presupuestosflujoscajaOriginal.setId(presupuestosflujoscajaAux.getId());
					presupuestosflujoscajaOriginal.setVersionRow(presupuestosflujoscajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajas) {
				if(presupuestosflujoscajaAux.getPresupuestosFlujosCajaOriginal().getId().equals(presupuestosflujoscajaOriginal.getId())) {
					existe=true;
					presupuestosflujoscajaOriginal.setId(presupuestosflujoscajaAux.getId());
					presupuestosflujoscajaOriginal.setVersionRow(presupuestosflujoscajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestosFlujosCaja(Boolean esParaCancelar) throws Exception {
		presupuestosflujoscajasAux=new ArrayList<PresupuestosFlujosCaja>();
		presupuestosflujoscajaAux=new PresupuestosFlujosCaja();
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
					if(presupuestosflujoscajaAux.getId()<0) {
						presupuestosflujoscajasAux.add(presupuestosflujoscajaAux);
					}		
				}
				this.iIdNuevoPresupuestosFlujosCaja=0L;
				this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().removeAll(presupuestosflujoscajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajas) {
					if(presupuestosflujoscajaAux.getId()<0) {
						presupuestosflujoscajasAux.add(presupuestosflujoscajaAux);
					}		
				}
				this.iIdNuevoPresupuestosFlujosCaja=0L;
				this.presupuestosflujoscajas.removeAll(presupuestosflujoscajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestosFlujosCaja 
					&& this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size()>0
					) {
					presupuestosflujoscajaAux=this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().get(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size() - 1);
				
					if(presupuestosflujoscajaAux.getId()<0) {
						this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().remove(presupuestosflujoscajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestosFlujosCaja && this.presupuestosflujoscajas.size()>0) {
					presupuestosflujoscajaAux=this.presupuestosflujoscajas.get(this.presupuestosflujoscajas.size() - 1);
				
					if(presupuestosflujoscajaAux.getId()<0) {
						this.presupuestosflujoscajas.remove(presupuestosflujoscajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestosFlujosCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestosflujoscaja.getId()<0) {
				this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().remove(this.presupuestosflujoscaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestosflujoscaja.getId()<0) {
				this.presupuestosflujoscajas.remove(this.presupuestosflujoscaja);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestosFlujosCaja(List<PresupuestosFlujosCaja> presupuestosflujoscajasAux) throws Exception {
		PresupuestosFlujosCajaConstantesFunciones.setEstadosInicialesPresupuestosFlujosCaja(presupuestosflujoscajasAux);
	}
	
	public void setEstadosInicialesPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscajaAux) throws Exception {
		PresupuestosFlujosCajaConstantesFunciones.setEstadosInicialesPresupuestosFlujosCaja(presupuestosflujoscajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestosFlujosCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestosFlujosCajaActual()) {
				if(!this.isEsNuevoPresupuestosFlujosCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestosFlujosCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestosFlujosCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuestos Flujos Caja ?", "MANTENIMIENTO DE Presupuestos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestosFlujosCaja presupuestosflujoscaja) throws Exception {
		PresupuestosFlujosCajaConstantesFunciones.seleccionarAsignar(this.presupuestosflujoscaja,presupuestosflujoscaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestosFlujosCaja=this.isPermisoActualizarOriginalPresupuestosFlujosCaja;
			
			
			this.seleccionarAsignar(presupuestosflujoscaja);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestosflujoscajaSessionBean.setsFuncionBusquedaRapida(this.presupuestosflujoscajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresupuestosFlujosCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestosFlujosCaja(esParaCancelar);				
				this.cancelarNuevoPresupuestosFlujosCaja(esParaCancelar);								
			}
			
			this.presupuestosflujoscaja=new PresupuestosFlujosCaja();
			
			this.inicializarPresupuestosFlujosCaja();
			
			this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestosFlujosCaja() throws Exception {
		try {
			PresupuestosFlujosCajaConstantesFunciones.inicializarPresupuestosFlujosCaja(this.presupuestosflujoscaja);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestosFlujosCajas(String sAccionBusqueda,List<PresupuestosFlujosCaja> presupuestosflujoscajasParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestosFlujosCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestosFlujosCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestosFlujosCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestosFlujosCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuestos Flujos Cajas");		
		parameters.put("busquedapor", PresupuestosFlujosCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestosFlujosCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestosFlujosCaja=new JRBeanArrayDataSource(PresupuestosFlujosCajaJInternalFrame.TraerPresupuestosFlujosCajaBeans(presupuestosflujoscajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestosFlujosCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestosFlujosCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestosFlujosCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestosFlujosCajaBean.TraerPresupuestosFlujosCajaBeans(presupuestosflujoscajasParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCajaActionPerformed(null);
					//this.generarExcelReportePresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestosflujoscajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestosFlujosCaja> presupuestosflujoscajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestosFlujosCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestosFlujosCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestosFlujosCaja presupuestosflujoscaja : presupuestosflujoscajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestosFlujosCajaConstantesFunciones.generarExcelReporteDataPresupuestosFlujosCaja("NORMAL",row,workbook,presupuestosflujoscaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestosFlujosCaja(String sTipo,Row row,Workbook workbook) {
		
		PresupuestosFlujosCajaConstantesFunciones.generarExcelReporteHeaderPresupuestosFlujosCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestosFlujosCaja> presupuestosflujoscajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestosFlujosCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestosFlujosCaja presupuestosflujoscaja : presupuestosflujoscajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.getPresupuestosFlujosCajaDescripcion(presupuestosflujoscaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getcodigo_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getnombre_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor4());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor6());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor7());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor8());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor9());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor10());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor11());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.getvalor12());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestosflujoscaja.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestosFlujosCaja> presupuestosflujoscajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestosFlujosCaja> presupuestosflujoscajasRespaldo=null;
		
		classes=PresupuestosFlujosCajaConstantesFunciones.getClassesRelationshipsOfPresupuestosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestosflujoscajaLogic.setDatosCliente(this.datosCliente);
		this.presupuestosflujoscajaLogic.setDatosDeep(this.datosDeep);
		this.presupuestosflujoscajaLogic.setIsConDeep(true);
		
		presupuestosflujoscajasRespaldo=this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas();
		
		this.presupuestosflujoscajaLogic.setPresupuestosFlujosCajas(presupuestosflujoscajasParaReportes);	
		this.presupuestosflujoscajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestosflujoscajasParaReportes=this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas();
		this.presupuestosflujoscajaLogic.setPresupuestosFlujosCajas(presupuestosflujoscajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestosFlujosCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestosFlujosCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestosFlujosCaja presupuestosflujoscaja : presupuestosflujoscajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestosFlujosCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestosFlujosCajaConstantesFunciones.generarExcelReporteDataPresupuestosFlujosCaja("NORMAL",row,workbook,presupuestosflujoscaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.getPresupuestosFlujosCajaDescripcion(presupuestosflujoscaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestosFlujosCaja() throws Exception {		
		this.startProcessPresupuestosFlujosCaja(true);
	}
	
	public void startProcessPresupuestosFlujosCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestosFlujosCaja ,this.jPanelParametrosReportesPresupuestosFlujosCaja, this.jScrollPanelDatosPresupuestosFlujosCaja,this.jPanelPaginacionPresupuestosFlujosCaja, this.jScrollPanelDatosEdicionPresupuestosFlujosCaja, this.jPanelAccionesPresupuestosFlujosCaja,this.jPanelAccionesFormularioPresupuestosFlujosCaja,this.jmenuBarPresupuestosFlujosCaja,this.jmenuBarDetallePresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestosFlujosCaja=this.jTabbedPaneBusquedasPresupuestosFlujosCaja; 
		
		final JPanel jPanelParametrosReportesPresupuestosFlujosCaja=this.jPanelParametrosReportesPresupuestosFlujosCaja;
		//final JScrollPane jScrollPanelDatosPresupuestosFlujosCaja=this.jScrollPanelDatosPresupuestosFlujosCaja;
		final JTable jTableDatosPresupuestosFlujosCaja=this.jTableDatosPresupuestosFlujosCaja;		
		final JPanel jPanelPaginacionPresupuestosFlujosCaja=this.jPanelPaginacionPresupuestosFlujosCaja;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestosFlujosCaja=this.jScrollPanelDatosEdicionPresupuestosFlujosCaja;
		final JPanel jPanelAccionesPresupuestosFlujosCaja=this.jPanelAccionesPresupuestosFlujosCaja;
		
		JPanel jPanelCamposAuxiliarPresupuestosFlujosCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			jPanelCamposAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelCamposPresupuestosFlujosCaja;
			jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelAccionesFormularioPresupuestosFlujosCaja;
		}
		
		final JPanel jPanelCamposPresupuestosFlujosCaja=jPanelCamposAuxiliarPresupuestosFlujosCaja;
		final JPanel jPanelAccionesFormularioPresupuestosFlujosCaja=jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja;
		
		
		final JMenuBar jmenuBarPresupuestosFlujosCaja=this.jmenuBarPresupuestosFlujosCaja;
		final JToolBar jTtoolBarPresupuestosFlujosCaja=this.jTtoolBarPresupuestosFlujosCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestosFlujosCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			jmenuBarDetalleAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jmenuBarDetallePresupuestosFlujosCaja;
			jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTtoolBarDetallePresupuestosFlujosCaja;
		}
		
		final JMenuBar jmenuBarDetallePresupuestosFlujosCaja=jmenuBarDetalleAuxiliarPresupuestosFlujosCaja;
		final JToolBar jTtoolBarDetallePresupuestosFlujosCaja=jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestosFlujosCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestosFlujosCaja;
			processRunnable.jTableDatos=jTableDatosPresupuestosFlujosCaja;
			processRunnable.jPanelCampos=jPanelCamposPresupuestosFlujosCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestosFlujosCaja;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestosFlujosCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestosFlujosCaja;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestosFlujosCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestosFlujosCaja;
			processRunnable.jTtoolBar=jTtoolBarPresupuestosFlujosCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestosFlujosCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestosFlujosCaja ,jPanelParametrosReportesPresupuestosFlujosCaja,jTableDatosPresupuestosFlujosCaja, /*jScrollPanelDatosPresupuestosFlujosCaja,*/jPanelCamposPresupuestosFlujosCaja,jPanelPaginacionPresupuestosFlujosCaja, /*jScrollPanelDatosEdicionPresupuestosFlujosCaja,*/ jPanelAccionesPresupuestosFlujosCaja,jPanelAccionesFormularioPresupuestosFlujosCaja,jmenuBarPresupuestosFlujosCaja,jmenuBarDetallePresupuestosFlujosCaja,jTtoolBarPresupuestosFlujosCaja,jTtoolBarDetallePresupuestosFlujosCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestosFlujosCaja ,jPanelParametrosReportesPresupuestosFlujosCaja, jScrollPanelDatosPresupuestosFlujosCaja,jPanelPaginacionPresupuestosFlujosCaja, jScrollPanelDatosEdicionPresupuestosFlujosCaja, jPanelAccionesPresupuestosFlujosCaja,jPanelAccionesFormularioPresupuestosFlujosCaja,jmenuBarPresupuestosFlujosCaja,jmenuBarDetallePresupuestosFlujosCaja,jTtoolBarPresupuestosFlujosCaja,jTtoolBarDetallePresupuestosFlujosCaja);
						
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
	
	public void finishProcessPresupuestosFlujosCaja() {// throws Exception 
		this.finishProcessPresupuestosFlujosCaja(true);
	}
	
	public void finishProcessPresupuestosFlujosCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestosFlujosCaja ,this.jPanelParametrosReportesPresupuestosFlujosCaja, this.jScrollPanelDatosPresupuestosFlujosCaja,this.jPanelPaginacionPresupuestosFlujosCaja, this.jScrollPanelDatosEdicionPresupuestosFlujosCaja, this.jPanelAccionesPresupuestosFlujosCaja,this.jPanelAccionesFormularioPresupuestosFlujosCaja,this.jmenuBarPresupuestosFlujosCaja,this.jmenuBarDetallePresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,this.jTtoolBarDetallePresupuestosFlujosCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestosFlujosCaja=this.jTabbedPaneBusquedasPresupuestosFlujosCaja; 
		
		final JPanel jPanelParametrosReportesPresupuestosFlujosCaja=this.jPanelParametrosReportesPresupuestosFlujosCaja;
		//final JScrollPane jScrollPanelDatosPresupuestosFlujosCaja=this.jScrollPanelDatosPresupuestosFlujosCaja;
		final JTable jTableDatosPresupuestosFlujosCaja=this.jTableDatosPresupuestosFlujosCaja;		
		final JPanel jPanelPaginacionPresupuestosFlujosCaja=this.jPanelPaginacionPresupuestosFlujosCaja;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestosFlujosCaja=this.jScrollPanelDatosEdicionPresupuestosFlujosCaja;
		final JPanel jPanelAccionesPresupuestosFlujosCaja=this.jPanelAccionesPresupuestosFlujosCaja;
		
		JPanel jPanelCamposAuxiliarPresupuestosFlujosCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			jPanelCamposAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelCamposPresupuestosFlujosCaja;
			jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelAccionesFormularioPresupuestosFlujosCaja;
		}
		
		final JPanel jPanelCamposPresupuestosFlujosCaja=jPanelCamposAuxiliarPresupuestosFlujosCaja;
		final JPanel jPanelAccionesFormularioPresupuestosFlujosCaja=jPanelAccionesFormularioAuxiliarPresupuestosFlujosCaja;
		
		
		final JMenuBar jmenuBarPresupuestosFlujosCaja=this.jmenuBarPresupuestosFlujosCaja;		
		final JToolBar jTtoolBarPresupuestosFlujosCaja=this.jTtoolBarPresupuestosFlujosCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestosFlujosCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			jmenuBarDetalleAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jmenuBarDetallePresupuestosFlujosCaja;
			jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTtoolBarDetallePresupuestosFlujosCaja;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestosFlujosCaja=jmenuBarDetalleAuxiliarPresupuestosFlujosCaja;
		final JToolBar jTtoolBarDetallePresupuestosFlujosCaja=jTtoolBarDetalleAuxiliarPresupuestosFlujosCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestosFlujosCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestosFlujosCaja;
			processRunnable.jTableDatos=jTableDatosPresupuestosFlujosCaja;
			processRunnable.jPanelCampos=jPanelCamposPresupuestosFlujosCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestosFlujosCaja;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestosFlujosCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestosFlujosCaja;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestosFlujosCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestosFlujosCaja;
			processRunnable.jTtoolBar=jTtoolBarPresupuestosFlujosCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestosFlujosCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestosFlujosCaja ,jPanelParametrosReportesPresupuestosFlujosCaja, jTableDatosPresupuestosFlujosCaja,/*jScrollPanelDatosPresupuestosFlujosCaja,*/jPanelCamposPresupuestosFlujosCaja,jPanelPaginacionPresupuestosFlujosCaja, /*jScrollPanelDatosEdicionPresupuestosFlujosCaja,*/ jPanelAccionesPresupuestosFlujosCaja,jPanelAccionesFormularioPresupuestosFlujosCaja,jmenuBarPresupuestosFlujosCaja,jmenuBarDetallePresupuestosFlujosCaja,jTtoolBarPresupuestosFlujosCaja,jTtoolBarDetallePresupuestosFlujosCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestosFlujosCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestosFlujosCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestosFlujosCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestosFlujosCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestosFlujosCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestosFlujosCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestosflujoscajaConstantesFunciones.getsFinalQueryPresupuestosFlujosCaja();
		String  finalQueryPaginacionTodos=this.presupuestosflujoscajaConstantesFunciones.getsFinalQueryPresupuestosFlujosCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestosFlujosCajaConstantesFunciones.getArrayColumnasGlobalesNoPresupuestosFlujosCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestosFlujosCajaConstantesFunciones.getArrayColumnasGlobalesPresupuestosFlujosCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestosFlujosCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestosflujoscajasEliminados= new ArrayList<PresupuestosFlujosCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestosFlujosCaja();
		
				///*PresupuestosFlujosCajaSessionBean*/this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
			
			if(this.presupuestosflujoscajaSessionBean==null) {
				this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
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
					this.iNumeroPaginacion=PresupuestosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestosFlujosCajaConstantesFunciones.getClassesForeignKeysOfPresupuestosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestosflujoscaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestosflujoscajasAux= new ArrayList<PresupuestosFlujosCaja>();
			
				
			presupuestosflujoscajaLogic.setDatosCliente(this.datosCliente);
			presupuestosflujoscajaLogic.setDatosDeep(this.datosDeep);
			presupuestosflujoscajaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPresupuestosFlujosCaja")) {
				this.sDetalleReporte=PresupuestosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaPresupuestosFlujosCaja(idBusquedaPresupuestosFlujosCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestosflujoscajaLogic.getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaPresupuestosFlujosCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaPresupuestosFlujosCaja(idBusquedaPresupuestosFlujosCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaPresupuestosFlujosCaja(idBusquedaPresupuestosFlujosCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()==null||presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestosflujoscajas==null|| presupuestosflujoscajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestosflujoscajasAux=new ArrayList<PresupuestosFlujosCaja>();
						presupuestosflujoscajasAux.addAll(presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestosflujoscajasAux=new ArrayList<PresupuestosFlujosCaja>();
							presupuestosflujoscajasAux.addAll(presupuestosflujoscajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestosflujoscajaLogic.getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaPresupuestosFlujosCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaPresupuestosFlujosCaja(idBusquedaPresupuestosFlujosCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaPresupuestosFlujosCaja(idBusquedaPresupuestosFlujosCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestosFlujosCajas("BusquedaPresupuestosFlujosCaja",presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestosFlujosCajas("BusquedaPresupuestosFlujosCaja",presupuestosflujoscajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestosflujoscajaLogic.setPresupuestosFlujosCajas(new ArrayList<PresupuestosFlujosCaja>());
						presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().addAll(presupuestosflujoscajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestosflujoscajas=new ArrayList<PresupuestosFlujosCaja>();
							presupuestosflujoscajas.addAll(presupuestosflujoscajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestosFlujosCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestosFlujosCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestosflujoscajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestosflujoscajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestosFlujosCaja presupuestosflujoscaja) {
		Boolean permite=true;
		
		if(this.presupuestosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestosFlujosCajaConstantesFunciones.getOrderByListaPresupuestosFlujosCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestosFlujosCajaConstantesFunciones.getOrderByListaPresupuestosFlujosCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				if(presupuestosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestosflujoscajaTotales=presupuestosflujoscaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestosFlujosCaja presupuestosflujoscaja:this.presupuestosflujoscajas) {
				if(presupuestosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestosflujoscajaTotales=presupuestosflujoscaja;
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
			this.presupuestosflujoscajaAux=new PresupuestosFlujosCaja();
			this.presupuestosflujoscajaAux.setsType(Constantes2.S_TOTALES);
			this.presupuestosflujoscajaAux.setIsNew(false);
			this.presupuestosflujoscajaAux.setIsChanged(false);
			this.presupuestosflujoscajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PresupuestosFlujosCajaConstantesFunciones.TotalizarValoresFilaPresupuestosFlujosCaja(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas(),this.presupuestosflujoscajaAux);
				
				//this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().add(this.presupuestosflujoscajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestosFlujosCajaConstantesFunciones.TotalizarValoresFilaPresupuestosFlujosCaja(this.presupuestosflujoscajas,this.presupuestosflujoscajaAux);
				
				this.presupuestosflujoscajas.add(this.presupuestosflujoscajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestosflujoscajaTotales=new PresupuestosFlujosCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().remove(presupuestosflujoscajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestosflujoscajas.remove(presupuestosflujoscajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestosflujoscajaTotales=new PresupuestosFlujosCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				if(presupuestosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestosflujoscajaTotales=presupuestosflujoscaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestosFlujosCajaConstantesFunciones.TotalizarValoresFilaPresupuestosFlujosCaja(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas(),presupuestosflujoscajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestosFlujosCaja presupuestosflujoscaja:this.presupuestosflujoscajas) {
				if(presupuestosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestosflujoscajaTotales=presupuestosflujoscaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestosFlujosCajaConstantesFunciones.TotalizarValoresFilaPresupuestosFlujosCaja(this.presupuestosflujoscajas,presupuestosflujoscajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja()throws Exception {
		try {
			sAccionBusqueda="BusquedaPresupuestosFlujosCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestosFlujosCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//presupuestosflujoscajaLogic.getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestosFlujosCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//presupuestosflujoscajaLogic.getPresupuestosFlujosCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPresupuestosFlujosCaja() {
		this.isPermisoTodoPresupuestosFlujosCaja=false;
		this.isPermisoNuevoPresupuestosFlujosCaja=false;
		this.isPermisoActualizarPresupuestosFlujosCaja=false;
		this.isPermisoActualizarOriginalPresupuestosFlujosCaja=false;
		this.isPermisoEliminarPresupuestosFlujosCaja=false;
		this.isPermisoGuardarCambiosPresupuestosFlujosCaja=false;
		this.isPermisoConsultaPresupuestosFlujosCaja=true;
		this.isPermisoBusquedaPresupuestosFlujosCaja=true;
		this.isPermisoReportePresupuestosFlujosCaja=true;
		this.isPermisoOrdenPresupuestosFlujosCaja=false;		
		this.isPermisoPaginacionMedioPresupuestosFlujosCaja=false;		
		this.isPermisoPaginacionAltoPresupuestosFlujosCaja=false;		
		this.isPermisoPaginacionTodoPresupuestosFlujosCaja=false;		
		this.isPermisoCopiarPresupuestosFlujosCaja=false;		
		this.isPermisoVerFormPresupuestosFlujosCaja=false;		
		this.isPermisoDuplicarPresupuestosFlujosCaja=false;
		this.isPermisoOrdenPresupuestosFlujosCaja=false;
	}
	
	public void setPermisosUsuarioPresupuestosFlujosCaja(Boolean isPermiso) {
		this.isPermisoTodoPresupuestosFlujosCaja=isPermiso;
		this.isPermisoNuevoPresupuestosFlujosCaja=isPermiso;
		this.isPermisoActualizarPresupuestosFlujosCaja=isPermiso;
		this.isPermisoActualizarOriginalPresupuestosFlujosCaja=isPermiso;
		this.isPermisoEliminarPresupuestosFlujosCaja=isPermiso;
		this.isPermisoGuardarCambiosPresupuestosFlujosCaja=isPermiso;
		this.isPermisoConsultaPresupuestosFlujosCaja=isPermiso;
		this.isPermisoBusquedaPresupuestosFlujosCaja=isPermiso;
		this.isPermisoReportePresupuestosFlujosCaja=isPermiso;
		this.isPermisoOrdenPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoCopiarPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoVerFormPresupuestosFlujosCaja=isPermiso;		
		this.isPermisoDuplicarPresupuestosFlujosCaja=isPermiso;
		this.isPermisoOrdenPresupuestosFlujosCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestosFlujosCaja(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestosFlujosCaja=isPermiso;
		this.isPermisoNuevoPresupuestosFlujosCaja=isPermiso;
		this.isPermisoActualizarPresupuestosFlujosCaja=isPermiso;
		this.isPermisoActualizarOriginalPresupuestosFlujosCaja=isPermiso;
		this.isPermisoEliminarPresupuestosFlujosCaja=isPermiso;
		this.isPermisoGuardarCambiosPresupuestosFlujosCaja=isPermiso;
		//this.isPermisoConsultaPresupuestosFlujosCaja=isPermiso;
		//this.isPermisoBusquedaPresupuestosFlujosCaja=isPermiso;
		//this.isPermisoReportePresupuestosFlujosCaja=isPermiso;
		//this.isPermisoOrdenPresupuestosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestosFlujosCaja=isPermiso;		
		//this.isPermisoCopiarPresupuestosFlujosCaja=isPermiso;		
		//this.isPermisoDuplicarPresupuestosFlujosCaja=isPermiso;
		//this.isPermisoOrdenPresupuestosFlujosCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestosFlujosCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestosFlujosCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestosFlujosCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestosFlujosCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestosFlujosCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestosFlujosCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestosFlujosCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestosFlujosCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestosFlujosCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestosFlujosCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestosFlujosCaja=this.isPermisoActualizarPresupuestosFlujosCaja;
			this.isPermisoEliminarPresupuestosFlujosCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestosFlujosCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestosFlujosCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestosFlujosCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestosFlujosCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestosFlujosCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestosFlujosCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestosFlujosCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestosFlujosCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestosFlujosCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestosFlujosCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestosFlujosCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestosFlujosCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestosFlujosCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestosFlujosCaja.setToolTipText(this.jTableDatosPresupuestosFlujosCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestosFlujosCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestosFlujosCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestosFlujosCaja() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestosFlujosCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestosFlujosCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestosFlujosCajaJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestosFlujosCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestosflujoscajaSessionBean==null) {
				this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
			}

			if(!this.presupuestosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPresupuestosFlujosCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestosFlujosCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestosFlujosCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestosFlujosCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestosFlujosCaja()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestosFlujosCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestosFlujosCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestosFlujosCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestosFlujosCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestosFlujosCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestosFlujosCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestosFlujosCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PresupuestosFlujosCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestosFlujosCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestosFlujosCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean(); 
		this.presupuestosflujoscajaConstantesFunciones=new PresupuestosFlujosCajaConstantesFunciones(); 
		this.presupuestosflujoscajaBean=new PresupuestosFlujosCaja();//(this.presupuestosflujoscajaConstantesFunciones); 		
		this.presupuestosflujoscajaReturnGeneral=new PresupuestosFlujosCajaParameterReturnGeneral(); 
		
		this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestosFlujosCaja(true);
			
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
			
			this.presupuestosflujoscajaConstantesFunciones=new PresupuestosFlujosCajaConstantesFunciones(); 
			this.presupuestosflujoscajaBean=new PresupuestosFlujosCaja();//this.presupuestosflujoscajaConstantesFunciones); 			
			this.presupuestosflujoscajaReturnGeneral=new PresupuestosFlujosCajaParameterReturnGeneral(); 
		
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuestos Flujos Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestosflujoscaja=new PresupuestosFlujosCaja();
			this.presupuestosflujoscajas = new ArrayList<PresupuestosFlujosCaja>();
			this.presupuestosflujoscajasAux = new ArrayList<PresupuestosFlujosCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic=new PresupuestosFlujosCajaLogic();
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestosFlujosCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja);	
					}
					
					if(this.jInternalFrameImportacionPresupuestosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestosFlujosCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestosFlujosCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestosFlujosCaja);
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja);
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestosFlujosCaja);
					this.jInternalFrameImportacionPresupuestosFlujosCaja.setVisible(false);
					this.jInternalFrameImportacionPresupuestosFlujosCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestosFlujosCaja);
					this.jInternalFrameOrderByPresupuestosFlujosCaja.setVisible(false);
					this.jInternalFrameOrderByPresupuestosFlujosCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestosFlujosCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestosflujoscajaReturnGeneral=new PresupuestosFlujosCajaParameterReturnGeneral();
			
			this.presupuestosflujoscajaParameterGeneral=new PresupuestosFlujosCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestosflujoscajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestosFlujosCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestosFlujosCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			
			
			this.isVisibilidadBusquedaPresupuestosFlujosCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestosFlujosCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestosFlujosCaja(false);
			
			this.setPermisosUsuarioPresupuestosFlujosCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado() && this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestosFlujosCajaClasesRelacionadas();
			}
			
			if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestosFlujosCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestosFlujosCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestosFlujosCaja();
			}
			
			if(!this.isPermisoBusquedaPresupuestosFlujosCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestosFlujosCajaConstantesFunciones.getTiposSeleccionarPresupuestosFlujosCaja());
				
				this.tiposColumnasSelect=PresupuestosFlujosCajaConstantesFunciones.getTiposSeleccionarPresupuestosFlujosCaja(true);
				
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
			//if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestosFlujosCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPresupuestosFlujosCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPresupuestosFlujosCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestosFlujosCaja() ;
			
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
				presupuestosflujoscajaImplementable= (PresupuestosFlujosCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestosFlujosCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestosflujoscajaImplementableHome= (PresupuestosFlujosCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestosFlujosCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestosflujoscajas= new ArrayList<PresupuestosFlujosCaja>();
			this.presupuestosflujoscajasEliminados= new ArrayList<PresupuestosFlujosCaja>();
						
			this.isEsNuevoPresupuestosFlujosCaja=false;
			this.esParaAccionDesdeFormularioPresupuestosFlujosCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestosFlujosCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestosFlujosCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestosFlujosCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestosFlujosCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestosFlujosCaja();
			}
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestosFlujosCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestosFlujosCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestosFlujosCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestosFlujosCaja")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestosFlujosCaja();	
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
	
	public void cargarCombosForeignKeyPresupuestosFlujosCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestosFlujosCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestosFlujosCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestosFlujosCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestosFlujosCaja();
		
		this.cargarCombosFrameForeignKeyPresupuestosFlujosCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestosFlujosCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestosFlujosCaja();
		}
	}
	
	
	
	public void jButtonNuevoPresupuestosFlujosCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			
			if(jTableDatosPresupuestosFlujosCaja.getRowCount()>=1) {
				jTableDatosPresupuestosFlujosCaja.removeRowSelectionInterval(0, jTableDatosPresupuestosFlujosCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestosFlujosCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestosFlujosCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(true);			
			//this.presupuestosflujoscaja=new PresupuestosFlujosCaja();
			//this.presupuestosflujoscaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja() ;
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestosFlujosCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestosflujoscaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);				
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestosFlujosCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestosFlujosCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestosFlujosCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestosFlujosCaja.getSelectedRows().length;			
			}
			
			presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestosFlujosCaja--;			
				//PresupuestosFlujosCaja presupuestosflujoscajaAux= new PresupuestosFlujosCaja();			
				//presupuestosflujoscajaAux.setId(this.iIdNuevoPresupuestosFlujosCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestosFlujosCaja presupuestosflujoscajaOrigen=new PresupuestosFlujosCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestosFlujosCaja presupuestosflujoscajaOrigen : presupuestosflujoscajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestosflujoscajaOrigen =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestosflujoscajaOrigen =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestosFlujosCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestosflujoscaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestosFlujosCaja(presupuestosflujoscajaOrigen,this.presupuestosflujoscaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().add(this.presupuestosflujoscajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscajas.add(this.presupuestosflujoscajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
				
				this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestosFlujosCaja(), this.getIndiceNuevoPresupuestosFlujosCaja());
				
				int iLastRow =  this.jTableDatosPresupuestosFlujosCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestosFlujosCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestosFlujosCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();									
		
			PresupuestosFlujosCaja presupuestosflujoscajaOrigen=new PresupuestosFlujosCaja();
			PresupuestosFlujosCaja presupuestosflujoscajaDestino=new PresupuestosFlujosCaja();
				
			presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestosFlujosCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestosflujoscajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestosFlujosCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestosflujoscajaOrigen =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestosflujoscajaOrigen =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestosflujoscajaDestino =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestosflujoscajaDestino =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestosflujoscajaOrigen =presupuestosflujoscajasSeleccionados.get(0);
				presupuestosflujoscajaDestino =presupuestosflujoscajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestosFlujosCaja(presupuestosflujoscajaOrigen,presupuestosflujoscajaDestino,true,false);
				
				presupuestosflujoscajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestosflujoscajaDestino,presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestosflujoscajaDestino,presupuestosflujoscajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
				
				//this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestosFlujosCaja(), this.getIndiceNuevoPresupuestosFlujosCaja());
				
				int iLastRow =  this.jTableDatosPresupuestosFlujosCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestosFlujosCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestosFlujosCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestosFlujosCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(!isVisible);
			this.jPanelAccionesPresupuestosFlujosCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestosFlujosCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestosFlujosCaja();
			
			this.abrirFrameOrderByPresupuestosFlujosCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestosFlujosCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestosFlujosCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSize(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestosFlujosCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestosFlujosCaja.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jContentPaneDetallePresupuestosFlujosCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jContentPaneDetallePresupuestosFlujosCaja.getWidth(),PresupuestosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jContentPaneDetallePresupuestosFlujosCaja.getWidth(),PresupuestosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jContentPaneDetallePresupuestosFlujosCaja.getWidth(),PresupuestosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestosFlujosCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestosFlujosCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestosFlujosCaja,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestosFlujosCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestosFlujosCaja);
				this.jInternalFrameOrderByPresupuestosFlujosCaja.setVisible(false);
				this.jInternalFrameOrderByPresupuestosFlujosCaja.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestosFlujosCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestosFlujosCaja"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestosFlujosCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestosFlujosCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestosFlujosCaja==null) {
				
				this.jInternalFrameImportacionPresupuestosFlujosCaja=new ImportacionJInternalFrame(PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestosFlujosCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestosFlujosCaja);
				this.jInternalFrameImportacionPresupuestosFlujosCaja.setVisible(false);
				this.jInternalFrameImportacionPresupuestosFlujosCaja.setSelected(false);


				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestosFlujosCaja"));
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestosFlujosCaja"));
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestosFlujosCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestosFlujosCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja==null) {
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja=new ReporteDinamicoJInternalFrame(PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja);
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestosFlujosCaja"));
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestosFlujosCaja"));
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestosFlujosCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestosFlujosCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestosFlujosCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestosFlujosCaja);
			
	       	this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.dispose();
			//this.jInternalFrameDetalleFormPresupuestosFlujosCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestosFlujosCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestosFlujosCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestosFlujosCaja.setVisible(true);
	        this.jInternalFrameImportacionPresupuestosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestosFlujosCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setVisible(true);
	        this.jInternalFrameOrderByPresupuestosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestosFlujosCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setVisible(false);
	        this.jInternalFrameOrderByPresupuestosFlujosCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestosFlujosCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestosFlujosCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestosFlujosCaja.setVisible(false);
	        this.jInternalFrameImportacionPresupuestosFlujosCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestosFlujosCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestosFlujosCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(true);
			//this.isEsNuevoPresupuestosFlujosCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false) ;
			
			if(presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestosFlujosCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestosFlujosCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestosFlujosCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(true);
			//this.isEsNuevoPresupuestosFlujosCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestosflujoscaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false) ;
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestosFlujosCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestosFlujosCaja(false);
			
			//if(!this.isEsNuevoPresupuestosFlujosCaja) {								
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestosflujoscaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestosFlujosCaja=true;
					this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
					this.isEsNuevoPresupuestosFlujosCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestosFlujosCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestosFlujosCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(false);
				
				this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(false);
			
												
				
				if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestosFlujosCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,presupuestosflujoscajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestosflujoscajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestosflujoscaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				this.presupuestosflujoscaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				this.presupuestosflujoscaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestosflujoscaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestosFlujosCajaModel) this.jTableDatosPresupuestosFlujosCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestosFlujosCaja=true;
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
				this.isEsNuevoPresupuestosFlujosCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(false);
				
				this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(false);
				
				
				
				if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestosFlujosCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestosFlujosCaja.getRowCount()>=1) {
				jTableDatosPresupuestosFlujosCaja.removeRowSelectionInterval(0, jTableDatosPresupuestosFlujosCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestosFlujosCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(false) ;
			
			this.isEsNuevoPresupuestosFlujosCaja=false;
			
			if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestosFlujosCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				
				//SI ES MANUAL
				if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestosFlujosCaja--;			
			//PresupuestosFlujosCaja presupuestosflujoscajaAux= new PresupuestosFlujosCaja();			
			//presupuestosflujoscajaAux.setId(this.iIdNuevoPresupuestosFlujosCaja);
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestosFlujosCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
			
			this.presupuestosflujoscaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().add(this.presupuestosflujoscajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestosflujoscajas.add(this.presupuestosflujoscajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			
			this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestosFlujosCaja(), this.getIndiceNuevoPresupuestosFlujosCaja());
			
			int iLastRow =  this.jTableDatosPresupuestosFlujosCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestosFlujosCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestosFlujosCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
			
			//SI ES MANUAL
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();
			}
			
			//this.abrirFrameTreePresupuestosFlujosCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestosFlujosCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestosFlujosCaja.setFileImportacion(this.jInternalFrameImportacionPresupuestosFlujosCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestosFlujosCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestosFlujosCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		

		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestosFlujosCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestosFlujosCajaBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor6_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor6_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor6_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor6_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor7_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor7_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor7_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor7_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor8_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor8_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor8_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor8_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor9_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor9_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor9_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor9_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor10_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor10_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor10_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor10_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor11_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor11_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor11_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor11_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor12_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor12_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor12_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor12_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoria="codigo_cuenta";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoria="nombre_modulo";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1:
					sNombreCampoCategoria="valor1";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2:
					sNombreCampoCategoria="valor2";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3:
					sNombreCampoCategoria="valor3";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4:
					sNombreCampoCategoria="valor4";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5:
					sNombreCampoCategoria="valor5";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6:
					sNombreCampoCategoria="valor6";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7:
					sNombreCampoCategoria="valor7";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8:
					sNombreCampoCategoria="valor8";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9:
					sNombreCampoCategoria="valor9";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10:
					sNombreCampoCategoria="valor10";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11:
					sNombreCampoCategoria="valor11";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12:
					sNombreCampoCategoria="valor12";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoriaValor="codigo_cuenta";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoriaValor="nombre_modulo";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1:
					sNombreCampoCategoriaValor="valor1";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2:
					sNombreCampoCategoriaValor="valor2";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3:
					sNombreCampoCategoriaValor="valor3";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4:
					sNombreCampoCategoriaValor="valor4";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5:
					sNombreCampoCategoriaValor="valor5";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6:
					sNombreCampoCategoriaValor="valor6";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7:
					sNombreCampoCategoriaValor="valor7";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8:
					sNombreCampoCategoriaValor="valor8";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9:
					sNombreCampoCategoriaValor="valor9";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10:
					sNombreCampoCategoriaValor="valor10";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11:
					sNombreCampoCategoriaValor="valor11";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12:
					sNombreCampoCategoriaValor="valor12";
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_modulo");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor1");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor2");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor3");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor4");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor5");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor6",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor6");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor7",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor7");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor8",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor8");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor9",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor9");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor10",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor10");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor11",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor11");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor12",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor12");
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestosFlujosCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getcodigo_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getnombre_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor6());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor7());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor8());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor9());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor10());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor11());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.getvalor12());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestosflujoscaja.gettotal());
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
			//	this.getFilaCabeceraExportarExcelPresupuestosFlujosCaja(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestosFlujosCaja(presupuestosflujoscajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
			
			//SI ES MANUAL
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
			
			//SI ES MANUAL
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
			
			//SI ES MANUAL
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestosFlujosCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestosFlujosCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestosFlujosCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestosFlujosCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestosFlujosCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestosFlujosCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestosFlujosCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestosFlujosCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestosFlujosCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestosFlujosCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestosFlujosCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestosFlujosCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestosFlujosCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestosFlujosCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestosFlujosCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestosFlujosCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestosFlujosCaja();
		
		this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestosFlujosCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestosFlujosCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestosFlujosCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestosFlujosCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionNuevoPresupuestosFlujosCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionSinCerrarPresupuestosFlujosCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jCheckBoxPostAccionSinMensajePresupuestosFlujosCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestosFlujosCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestosFlujosCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestosFlujosCaja() throws Exception {
		try	{
			if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestosFlujosCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestosFlujosCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestosFlujosCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestosFlujosCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.addItem(reporte);
			}
			
			
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestosFlujosCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestosFlujosCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestosFlujosCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestosFlujosCajaConstantesFunciones.getTiposSeleccionarPresupuestosFlujosCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestosFlujosCajaConstantesFunciones.getTiposSeleccionarPresupuestosFlujosCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestosFlujosCajaConstantesFunciones.getTiposSeleccionarPresupuestosFlujosCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestosFlujosCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPresupuestosFlujosCaja=Long.parseLong(this.jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestosFlujosCaja(Boolean esInicializar) throws Exception {				
		if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestosFlujosCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestosFlujosCaja() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestosFlujosCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestosFlujosCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestosFlujosCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestosflujoscajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestosFlujosCaja.setModel(new PresupuestosFlujosCajaModel(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestosFlujosCaja.setModel(new PresupuestosFlujosCajaModel(this.presupuestosflujoscajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestosFlujosCaja!=null && this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestosFlujosCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,presupuestosflujoscajaConstantesFunciones.resaltarSeleccionarPresupuestosFlujosCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,presupuestosflujoscajaConstantesFunciones.resaltarSeleccionarPresupuestosFlujosCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_ID));

		if(this.presupuestosflujoscajaConstantesFunciones.mostraridPresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltaridPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activaridPresupuestosFlujosCaja,iSizeTabla,this,true,"idPresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltaridPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activaridPresupuestosFlujosCaja,this,true,"idPresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigo_cuentaPresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigo_cuentaPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarcodigo_cuentaPresupuestosFlujosCaja,iSizeTabla,this,true,"codigo_cuentaPresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigo_cuentaPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarcodigo_cuentaPresupuestosFlujosCaja,this,true,"codigo_cuentaPresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigoPresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigoPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarcodigoPresupuestosFlujosCaja,iSizeTabla,this,true,"codigoPresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigoPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarcodigoPresupuestosFlujosCaja,this,true,"codigoPresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarnombrePresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarnombrePresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarnombrePresupuestosFlujosCaja,iSizeTabla,this,true,"nombrePresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarnombrePresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarnombrePresupuestosFlujosCaja,this,true,"nombrePresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarnombre_moduloPresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarnombre_moduloPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarnombre_moduloPresupuestosFlujosCaja,iSizeTabla,this,true,"nombre_moduloPresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarnombre_moduloPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarnombre_moduloPresupuestosFlujosCaja,this,true,"nombre_moduloPresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor1PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor1PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor1PresupuestosFlujosCaja,iSizeTabla,this,true,"valor1PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor1PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor1PresupuestosFlujosCaja,this,true,"valor1PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor2PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor2PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor2PresupuestosFlujosCaja,iSizeTabla,this,true,"valor2PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor2PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor2PresupuestosFlujosCaja,this,true,"valor2PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor3PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor3PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor3PresupuestosFlujosCaja,iSizeTabla,this,true,"valor3PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor3PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor3PresupuestosFlujosCaja,this,true,"valor3PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor4PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor4PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor4PresupuestosFlujosCaja,iSizeTabla,this,true,"valor4PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor4PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor4PresupuestosFlujosCaja,this,true,"valor4PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor5PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor5PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor5PresupuestosFlujosCaja,iSizeTabla,this,true,"valor5PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor5PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor5PresupuestosFlujosCaja,this,true,"valor5PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor6PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor6PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor6PresupuestosFlujosCaja,iSizeTabla,this,true,"valor6PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor6PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor6PresupuestosFlujosCaja,this,true,"valor6PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor7PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor7PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor7PresupuestosFlujosCaja,iSizeTabla,this,true,"valor7PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor7PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor7PresupuestosFlujosCaja,this,true,"valor7PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor8PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor8PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor8PresupuestosFlujosCaja,iSizeTabla,this,true,"valor8PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor8PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor8PresupuestosFlujosCaja,this,true,"valor8PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor9PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor9PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor9PresupuestosFlujosCaja,iSizeTabla,this,true,"valor9PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor9PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor9PresupuestosFlujosCaja,this,true,"valor9PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor10PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor10PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor10PresupuestosFlujosCaja,iSizeTabla,this,true,"valor10PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor10PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor10PresupuestosFlujosCaja,this,true,"valor10PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor11PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor11PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor11PresupuestosFlujosCaja,iSizeTabla,this,true,"valor11PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor11PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor11PresupuestosFlujosCaja,this,true,"valor11PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor12PresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor12PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor12PresupuestosFlujosCaja,iSizeTabla,this,true,"valor12PresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor12PresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activarvalor12PresupuestosFlujosCaja,this,true,"valor12PresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL));

		if(this.presupuestosflujoscajaConstantesFunciones.mostrartotalPresupuestosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltartotalPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activartotalPresupuestosFlujosCaja,iSizeTabla,this,true,"totalPresupuestosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestosflujoscajaConstantesFunciones.resaltartotalPresupuestosFlujosCaja,this.presupuestosflujoscajaConstantesFunciones.activartotalPresupuestosFlujosCaja,this,true,"totalPresupuestosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestosFlujosCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestosFlujosCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestosFlujosCaja.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestosFlujosCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestosFlujosCaja.moveColumn(this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestosFlujosCaja.moveColumn(this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestosFlujosCaja.moveColumn(this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestosFlujosCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestosFlujosCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestosFlujosCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestosFlujosCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestosFlujosCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestosFlujosCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestosflujoscajas.size()-1;
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
		//this.jTableDatosPresupuestosFlujosCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestosFlujosCaja();
			
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
				
				//this.isEsNuevoPresupuestosFlujosCaja=false;
					
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
				if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestosFlujosCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestosflujoscaja.getsType().equals("DUPLICADO")
				   || this.presupuestosflujoscaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestosFlujosCaja=true;
				
				} else {
					this.isEsNuevoPresupuestosFlujosCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestosflujoscaja.getId()>=0 && !this.presupuestosflujoscaja.getIsNew()) {						
						this.isEsNuevoPresupuestosFlujosCaja=false;
						
					} else {
						this.isEsNuevoPresupuestosFlujosCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestosFlujosCaja(esRelaciones);						
				
				this.seleccionarPresupuestosFlujosCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestosflujoscaja.getId()<0) {
					this.isEsNuevoPresupuestosFlujosCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestosFlujosCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestosFlujosCaja(evt,rowIndex);
				}	
				
				if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestosFlujosCaja: " + this.dDif); 
					}
				}								
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestosFlujosCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestosflujoscaja)) {
					if(this.presupuestosflujoscaja.getId()>0) {
						this.presupuestosflujoscaja.setIsDeleted(true);
						
						this.presupuestosflujoscajasEliminados.add(this.presupuestosflujoscaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().remove(this.presupuestosflujoscaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscajas.remove(this.presupuestosflujoscaja);				
					}
					
					
					((PresupuestosFlujosCajaModel) this.jTableDatosPresupuestosFlujosCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestosFlujosCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestosFlujosCaja) {
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestosFlujosCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestosFlujosCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestosFlujosCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestosFlujosCaja(presupuestosflujoscaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(presupuestosflujoscaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestosFlujosCaja(presupuestosflujoscaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestosFlujosCaja(presupuestosflujoscaja);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getId().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getcodigo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setText(presupuestosflujoscaja.getnombre());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getnombre_modulo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor1().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor2().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor3().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor4().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor5().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor6().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor7().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor8().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor9().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor10().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor11().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor12().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setText(presupuestosflujoscaja.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestosFlujosCaja presupuestosflujoscajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestosflujoscajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestosFlujosCaja presupuestosflujoscajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestosflujoscajaLocal=this.presupuestosflujoscaja;
			} else {
				presupuestosflujoscajaLocal=this.presupuestosflujoscajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestosflujoscajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestosFlujosCaja(presupuestosflujoscajaLocal,true);
					
					if(presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestosflujoscajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestosflujoscajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(presupuestosflujoscaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(presupuestosflujoscaja);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(presupuestosflujoscaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.getText()==null || this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.getText()=="" || this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setText("0");
			}

			if(conColumnasBase) {presupuestosflujoscaja.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelIdPresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setcodigo_cuenta(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigo_cuentaPresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setcodigo(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelcodigoPresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setnombre(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombrePresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setnombre_modulo(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelnombre_moduloPresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor1(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor1PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor2(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor2PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor3(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor3PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor4(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor4PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor5(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor5PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor6(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor6PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor7(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor7PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor8(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor8PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor9(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor9PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor10(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor10PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor11(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor11PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.setvalor12(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelvalor12PresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestosflujoscaja.settotal(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabeltotalPresupuestosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscajaBean,PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscajaOrigen,PresupuestosFlujosCaja presupuestosflujoscaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getId()!=null && !presupuestosflujoscajaOrigen.getId().equals(0L))) {presupuestosflujoscaja.setId(presupuestosflujoscajaOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getcodigo_cuenta()!=null && !presupuestosflujoscajaOrigen.getcodigo_cuenta().equals(""))) {presupuestosflujoscaja.setcodigo_cuenta(presupuestosflujoscajaOrigen.getcodigo_cuenta());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getcodigo()!=null && !presupuestosflujoscajaOrigen.getcodigo().equals(""))) {presupuestosflujoscaja.setcodigo(presupuestosflujoscajaOrigen.getcodigo());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getnombre()!=null && !presupuestosflujoscajaOrigen.getnombre().equals(""))) {presupuestosflujoscaja.setnombre(presupuestosflujoscajaOrigen.getnombre());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getnombre_modulo()!=null && !presupuestosflujoscajaOrigen.getnombre_modulo().equals(""))) {presupuestosflujoscaja.setnombre_modulo(presupuestosflujoscajaOrigen.getnombre_modulo());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor1()!=null && !presupuestosflujoscajaOrigen.getvalor1().equals(0.0))) {presupuestosflujoscaja.setvalor1(presupuestosflujoscajaOrigen.getvalor1());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor2()!=null && !presupuestosflujoscajaOrigen.getvalor2().equals(0.0))) {presupuestosflujoscaja.setvalor2(presupuestosflujoscajaOrigen.getvalor2());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor3()!=null && !presupuestosflujoscajaOrigen.getvalor3().equals(0.0))) {presupuestosflujoscaja.setvalor3(presupuestosflujoscajaOrigen.getvalor3());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor4()!=null && !presupuestosflujoscajaOrigen.getvalor4().equals(0.0))) {presupuestosflujoscaja.setvalor4(presupuestosflujoscajaOrigen.getvalor4());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor5()!=null && !presupuestosflujoscajaOrigen.getvalor5().equals(0.0))) {presupuestosflujoscaja.setvalor5(presupuestosflujoscajaOrigen.getvalor5());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor6()!=null && !presupuestosflujoscajaOrigen.getvalor6().equals(0.0))) {presupuestosflujoscaja.setvalor6(presupuestosflujoscajaOrigen.getvalor6());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor7()!=null && !presupuestosflujoscajaOrigen.getvalor7().equals(0.0))) {presupuestosflujoscaja.setvalor7(presupuestosflujoscajaOrigen.getvalor7());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor8()!=null && !presupuestosflujoscajaOrigen.getvalor8().equals(0.0))) {presupuestosflujoscaja.setvalor8(presupuestosflujoscajaOrigen.getvalor8());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor9()!=null && !presupuestosflujoscajaOrigen.getvalor9().equals(0.0))) {presupuestosflujoscaja.setvalor9(presupuestosflujoscajaOrigen.getvalor9());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor10()!=null && !presupuestosflujoscajaOrigen.getvalor10().equals(0.0))) {presupuestosflujoscaja.setvalor10(presupuestosflujoscajaOrigen.getvalor10());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor11()!=null && !presupuestosflujoscajaOrigen.getvalor11().equals(0.0))) {presupuestosflujoscaja.setvalor11(presupuestosflujoscajaOrigen.getvalor11());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.getvalor12()!=null && !presupuestosflujoscajaOrigen.getvalor12().equals(0.0))) {presupuestosflujoscaja.setvalor12(presupuestosflujoscajaOrigen.getvalor12());}
			if(conDefault || (!conDefault && presupuestosflujoscajaOrigen.gettotal()!=null && !presupuestosflujoscajaOrigen.gettotal().equals(0.0))) {presupuestosflujoscaja.settotal(presupuestosflujoscajaOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getId().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getcodigo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setText(presupuestosflujoscaja.getnombre());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setText(presupuestosflujoscaja.getnombre_modulo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor1().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor2().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor3().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor4().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor5().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor6().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor7().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor8().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor9().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor10().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor11().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setText(presupuestosflujoscaja.getvalor12().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setText(presupuestosflujoscaja.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestosFlujosCaja(PresupuestosFlujosCajaBean presupuestosflujoscajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getcodigo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getnombre());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getnombre_modulo());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor1().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor2().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor3().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor4().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor5().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor6().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor7().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor8().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor9().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor10().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor11().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.getvalor12().toString());
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setText(presupuestosflujoscajaBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestosFlujosCaja(PresupuestosFlujosCajaParameterReturnGeneral presupuestosflujoscajaReturnGeneral,PresupuestosFlujosCajaBean presupuestosflujoscajaBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestosFlujosCaja presupuestosflujoscajaLocal=new PresupuestosFlujosCaja();
			
			presupuestosflujoscajaLocal=presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getId()!=null && !presupuestosflujoscajaLocal.getId().equals(0L))) {presupuestosflujoscajaBean.setId(presupuestosflujoscajaLocal.getId());}}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getcodigo_cuenta()!=null && !presupuestosflujoscajaLocal.getcodigo_cuenta().equals(""))) {presupuestosflujoscajaBean.setcodigo_cuenta(presupuestosflujoscajaLocal.getcodigo_cuenta());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getcodigo()!=null && !presupuestosflujoscajaLocal.getcodigo().equals(""))) {presupuestosflujoscajaBean.setcodigo(presupuestosflujoscajaLocal.getcodigo());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getnombre()!=null && !presupuestosflujoscajaLocal.getnombre().equals(""))) {presupuestosflujoscajaBean.setnombre(presupuestosflujoscajaLocal.getnombre());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getnombre_modulo()!=null && !presupuestosflujoscajaLocal.getnombre_modulo().equals(""))) {presupuestosflujoscajaBean.setnombre_modulo(presupuestosflujoscajaLocal.getnombre_modulo());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor1()!=null && !presupuestosflujoscajaLocal.getvalor1().equals(0.0))) {presupuestosflujoscajaBean.setvalor1(presupuestosflujoscajaLocal.getvalor1());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor2()!=null && !presupuestosflujoscajaLocal.getvalor2().equals(0.0))) {presupuestosflujoscajaBean.setvalor2(presupuestosflujoscajaLocal.getvalor2());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor3()!=null && !presupuestosflujoscajaLocal.getvalor3().equals(0.0))) {presupuestosflujoscajaBean.setvalor3(presupuestosflujoscajaLocal.getvalor3());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor4()!=null && !presupuestosflujoscajaLocal.getvalor4().equals(0.0))) {presupuestosflujoscajaBean.setvalor4(presupuestosflujoscajaLocal.getvalor4());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor5()!=null && !presupuestosflujoscajaLocal.getvalor5().equals(0.0))) {presupuestosflujoscajaBean.setvalor5(presupuestosflujoscajaLocal.getvalor5());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor6()!=null && !presupuestosflujoscajaLocal.getvalor6().equals(0.0))) {presupuestosflujoscajaBean.setvalor6(presupuestosflujoscajaLocal.getvalor6());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor7()!=null && !presupuestosflujoscajaLocal.getvalor7().equals(0.0))) {presupuestosflujoscajaBean.setvalor7(presupuestosflujoscajaLocal.getvalor7());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor8()!=null && !presupuestosflujoscajaLocal.getvalor8().equals(0.0))) {presupuestosflujoscajaBean.setvalor8(presupuestosflujoscajaLocal.getvalor8());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor9()!=null && !presupuestosflujoscajaLocal.getvalor9().equals(0.0))) {presupuestosflujoscajaBean.setvalor9(presupuestosflujoscajaLocal.getvalor9());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor10()!=null && !presupuestosflujoscajaLocal.getvalor10().equals(0.0))) {presupuestosflujoscajaBean.setvalor10(presupuestosflujoscajaLocal.getvalor10());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor11()!=null && !presupuestosflujoscajaLocal.getvalor11().equals(0.0))) {presupuestosflujoscajaBean.setvalor11(presupuestosflujoscajaLocal.getvalor11());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.getvalor12()!=null && !presupuestosflujoscajaLocal.getvalor12().equals(0.0))) {presupuestosflujoscajaBean.setvalor12(presupuestosflujoscajaLocal.getvalor12());}
			if(conDefault || (!conDefault && presupuestosflujoscajaLocal.gettotal()!=null && !presupuestosflujoscajaLocal.gettotal().equals(0.0))) {presupuestosflujoscajaBean.settotal(presupuestosflujoscajaLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestosFlujosCajaGenerico(Long idPresupuestosFlujosCajaSeleccionado,JComboBox jComboBoxPresupuestosFlujosCaja,List<PresupuestosFlujosCaja> presupuestosflujoscajasLocal)throws Exception {
		try {
			PresupuestosFlujosCaja  presupuestosflujoscajaTemp=null;

			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasLocal) {
				if(presupuestosflujoscajaAux.getId()!=null && presupuestosflujoscajaAux.getId().equals(idPresupuestosFlujosCajaSeleccionado)) {
					presupuestosflujoscajaTemp=presupuestosflujoscajaAux;
					break;
				}
			}

			jComboBoxPresupuestosFlujosCaja.setSelectedItem(presupuestosflujoscajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestosFlujosCajaGenerico(JComboBox jComboBoxPresupuestosFlujosCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestosFlujosCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestosFlujosCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestosFlujosCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestosFlujosCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestosflujoscaja=(PresupuestosFlujosCaja) presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestosflujoscaja =(PresupuestosFlujosCaja) presupuestosflujoscajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestosflujoscaja.getIsNew() && !presupuestosflujoscaja.getIsChanged() && !presupuestosflujoscaja.getIsDeleted()) {
				sDescripcion=presupuestosflujoscaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestosflujoscaja.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestosFlujosCaja presupuestosflujoscajaRow=new PresupuestosFlujosCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestosflujoscajaRow=(PresupuestosFlujosCaja) presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestosflujoscajaRow=(PresupuestosFlujosCaja) presupuestosflujoscajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));			
			this.jButtonDuplicarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja && this.isPermisoDuplicarPresupuestosFlujosCaja));			
			this.jButtonCopiarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja && this.isPermisoCopiarPresupuestosFlujosCaja));
			this.jButtonVerFormPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja && this.isPermisoVerFormPresupuestosFlujosCaja));
			
			this.jButtonAbrirOrderByPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));			
			
			this.jButtonNuevoRelacionesPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));			
			this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestosFlujosCaja && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja && this.isPermisoEliminarPresupuestosFlujosCaja));
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja);							
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));						
			this.jButtonDuplicarToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja && this.isPermisoDuplicarPresupuestosFlujosCaja));						
			this.jButtonCopiarToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja && this.isPermisoCopiarPresupuestosFlujosCaja));			
			this.jButtonVerFormToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja && this.isPermisoVerFormPresupuestosFlujosCaja));			
			this.jButtonAbrirOrderByToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));
			this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));			
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestosFlujosCaja && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja  && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja && this.isPermisoEliminarPresupuestosFlujosCaja));
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarToolBarPresupuestosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja);				
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));			
			this.jMenuItemDuplicarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja && this.isPermisoDuplicarPresupuestosFlujosCaja));			
			this.jMenuItemCopiarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja && this.isPermisoCopiarPresupuestosFlujosCaja));			
			this.jMenuItemVerFormPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja && this.isPermisoVerFormPresupuestosFlujosCaja));			
			this.jMenuItemAbrirOrderByPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));			
			//this.jMenuItemMostrarOcultarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));
			this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja && this.isPermisoOrdenPresupuestosFlujosCaja));			
			this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja));			
			this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja && this.isPermisoNuevoPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));									
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemModificarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestosFlujosCaja && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemActualizarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja && this.isPermisoActualizarPresupuestosFlujosCaja));	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemEliminarPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja && this.isPermisoEliminarPresupuestosFlujosCaja));
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemCancelarPresupuestosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));						
			this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=this.jButtonNuevoPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja=this.jButtonDuplicarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja=this.jButtonCopiarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja=this.jButtonVerFormPresupuestosFlujosCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestosFlujosCaja=this.jButtonAbrirOrderByPresupuestosFlujosCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=this.jButtonNuevoRelacionesPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=this.jButtonModificarPresupuestosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=this.jButtonNuevoToolBarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarToolBarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarToolBarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarToolBarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarToolBarPresupuestosFlujosCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=this.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=this.jMenuItemNuevoPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemModificarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemActualizarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemEliminarPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemCancelarPresupuestosFlujosCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestosFlujosCaja(Boolean esInicializar) {
		if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestosFlujosCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestosFlujosCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestosFlujosCaja() {
		this.jButtonNuevoPresupuestosFlujosCaja.setVisible(this.isPermisoNuevoPresupuestosFlujosCaja);			
		this.jButtonDuplicarPresupuestosFlujosCaja.setVisible(this.isPermisoDuplicarPresupuestosFlujosCaja);			
		this.jButtonCopiarPresupuestosFlujosCaja.setVisible(this.isPermisoCopiarPresupuestosFlujosCaja);			
		this.jButtonVerFormPresupuestosFlujosCaja.setVisible(this.isPermisoVerFormPresupuestosFlujosCaja);			
		
		this.jButtonAbrirOrderByPresupuestosFlujosCaja.setVisible(this.isPermisoOrdenPresupuestosFlujosCaja);					
		
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.setVisible(this.isPermisoNuevoPresupuestosFlujosCaja);			
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarPresupuestosFlujosCaja.setVisible(this.isPermisoActualizarPresupuestosFlujosCaja);	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.setVisible(this.isPermisoActualizarPresupuestosFlujosCaja);	
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.setVisible(this.isPermisoEliminarPresupuestosFlujosCaja);
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja);						
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.setVisible(this.isPermisoGuardarCambiosPresupuestosFlujosCaja);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setVisible(this.isPermisoActualizarPresupuestosFlujosCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestosFlujosCaja() {
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarPresupuestosFlujosCaja.setVisible(this.isPermisoActualizarPresupuestosFlujosCaja);	
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.setVisible(this.isPermisoActualizarPresupuestosFlujosCaja);	
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.setVisible(this.isPermisoEliminarPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja);							
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja && this.isPermisoGuardarCambiosPresupuestosFlujosCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestosFlujosCaja() {
		if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestosFlujosCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestosFlujosCaja() {
	}
	
	public void jTableDatosPresupuestosFlujosCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestosFlujosCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestosflujoscaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestosFlujosCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestosFlujosCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestosFlujosCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestosFlujosCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestosflujoscajaLogic.getConnexion());

				if(this.presupuestosflujoscaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestosflujoscaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestosFlujosCaja=(TitledBorder)this.jScrollPanelDatosPresupuestosFlujosCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestosFlujosCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestosflujoscaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuentaPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getcodigo_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta like '%"+this.presupuestosflujoscaja.getcodigo_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.presupuestosflujoscaja.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presupuestosflujoscaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_moduloPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getnombre_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_modulo like '%"+this.presupuestosflujoscaja.getnombre_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor1PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor1 = "+this.presupuestosflujoscaja.getvalor1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor2PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor2 = "+this.presupuestosflujoscaja.getvalor2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor3PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor3 = "+this.presupuestosflujoscaja.getvalor3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor4PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor4 = "+this.presupuestosflujoscaja.getvalor4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor5PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor5 = "+this.presupuestosflujoscaja.getvalor5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor6PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor6()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor6 = "+this.presupuestosflujoscaja.getvalor6().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor7PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor7()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor7 = "+this.presupuestosflujoscaja.getvalor7().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor8PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor8()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor8 = "+this.presupuestosflujoscaja.getvalor8().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor9PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor9()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor9 = "+this.presupuestosflujoscaja.getvalor9().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor10PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor10()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor10 = "+this.presupuestosflujoscaja.getvalor10().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor11PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor11()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor11 = "+this.presupuestosflujoscaja.getvalor11().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor12PresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.getvalor12()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor12 = "+this.presupuestosflujoscaja.getvalor12().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalPresupuestosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.getpresupuestosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestosflujoscaja==null) {
						this.presupuestosflujoscaja = new PresupuestosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);
				}

				if(this.presupuestosflujoscaja.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.presupuestosflujoscaja.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);

			this.getPresupuestosFlujosCajasBusquedaPresupuestosFlujosCaja();

			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);

			//if(PresupuestosFlujosCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresupuestosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);

			this.getPresupuestosFlujosCajasFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);

			//if(PresupuestosFlujosCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestosFlujosCaja() {
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.dispose();
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
			this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.dispose();
			this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestosFlujosCaja!=null) {
			this.jInternalFrameImportacionPresupuestosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestosFlujosCaja.dispose();
			this.jInternalFrameImportacionPresupuestosFlujosCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestosFlujosCaja();
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestosFlujosCaja")) {
				jButtonDuplicarPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestosFlujosCaja")) {
				jButtonCopiarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestosFlujosCaja")) {
				jButtonVerFormPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestosFlujosCaja")) {
				jButtonDuplicarPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestosFlujosCaja")) {
				jButtonDuplicarPresupuestosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestosFlujosCaja")) {
				jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestosFlujosCaja")) {
				jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestosFlujosCaja")) {
				jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestosFlujosCaja")) {
				jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestosFlujosCaja")) {
				jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestosFlujosCaja")) {
				jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestosFlujosCaja")) {
				jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestosFlujosCaja")) {
				jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestosFlujosCaja")) {
				jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestosFlujosCaja")) {
				jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestosFlujosCaja")) {
				jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestosFlujosCaja")) {
				jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestosFlujosCaja")) {
				jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestosFlujosCaja")) {
				jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestosFlujosCaja")) {
				jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestosFlujosCaja")) {
				jButtonMostrarOcultarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestosFlujosCaja")) {
				jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestosFlujosCaja")) {
				jButtonCopiarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestosFlujosCaja")) {
				jButtonVerFormPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestosFlujosCaja")) {
				jButtonCopiarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestosFlujosCaja")) {
				jButtonVerFormPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestosFlujosCaja")) {
				jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestosFlujosCaja")) {
				jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestosFlujosCaja")) {
				jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestosFlujosCaja")) {
				jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestosFlujosCaja")) {
				jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestosFlujosCaja")) {
				jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestosFlujosCaja")) {
				jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestosFlujosCaja")) {
				jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestosFlujosCaja")) {
				jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestosFlujosCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestosFlujosCaja")) {
				jButtonAbrirOrderByPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestosFlujosCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestosFlujosCaja")) {
				jButtonMostrarOcultarPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestosFlujosCaja")) {
				jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestosFlujosCaja")) {
				jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestosFlujosCaja")) {
				jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestosFlujosCaja")) {
				jButtonCerrarReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestosFlujosCaja")) {
				jButtonGenerarReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestosFlujosCaja")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestosFlujosCaja")) {
				jButtonCerrarImportacionPresupuestosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestosFlujosCaja")) {
				
				jButtonGenerarImportacionPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestosFlujosCaja")) {
				
				jButtonAbrirImportacionPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestosFlujosCaja")) {
				jComboBoxTiposAccionesPresupuestosFlujosCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestosFlujosCaja")) {
				jComboBoxTiposRelacionesPresupuestosFlujosCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestosFlujosCaja")) {
				jComboBoxTiposAccionesPresupuestosFlujosCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestosFlujosCaja")) {
				
				jComboBoxTiposSeleccionarPresupuestosFlujosCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestosFlujosCaja")) {
				jTextFieldValorCampoGeneralPresupuestosFlujosCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestosFlujosCaja")) {
				jButtonAbrirOrderByPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestosFlujosCaja")) {
				jButtonAbrirOrderByPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestosFlujosCaja")) {
				jButtonCerrarOrderByPresupuestosFlujosCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestosFlujosCajaBusqueda")) {
				this.jButtonidPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestosFlujosCajaUpdate")) {
				this.jButtonid_empresaPresupuestosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestosFlujosCajaBusqueda")) {
				this.jButtonid_empresaPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaPresupuestosFlujosCajaBusqueda")) {
				this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresupuestosFlujosCajaBusqueda")) {
				this.jButtoncodigoPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresupuestosFlujosCajaBusqueda")) {
				this.jButtonnombrePresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloPresupuestosFlujosCajaBusqueda")) {
				this.jButtonnombre_moduloPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor1PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor1PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor2PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor2PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor3PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor3PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor4PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor4PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor5PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor5PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor6PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor6PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor7PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor7PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor8PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor8PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor9PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor9PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor10PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor10PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor11PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor11PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor12PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor12PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalPresupuestosFlujosCajaBusqueda")) {
				this.jButtontotalPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja")) {
				this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCajaActionPerformed(evt);
			}
			
			;
			
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestosFlujosCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestosFlujosCaja presupuestosflujoscajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestosflujoscajaLocal=this.presupuestosflujoscaja;
			} else {
				presupuestosflujoscajaLocal=this.presupuestosflujoscajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
							
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
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
			
			


			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
								
						
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
								
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
							
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
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
			
			


			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
								
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestosFlujosCaja")) {
					jCheckBoxSeleccionarTodosPresupuestosFlujosCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestosFlujosCaja")) {
					jCheckBoxSeleccionadosPresupuestosFlujosCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestosFlujosCaja")) {
					
				}
				
				


				
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
												
				
				


				
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
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
			
			


			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestosflujoscaja);
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
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
				
				


				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestosFlujosCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestosflujoscajaAnterior =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestosFlujosCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestosFlujosCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestosFlujosCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestosflujoscaja =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestosflujoscaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestosFlujosCaja")) {
				
				}
				
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestosFlujosCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestosFlujosCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestosFlujosCaja")) {
			
			}
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestosFlujosCaja();
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestosFlujosCaja")) {
				jButtonDuplicarPresupuestosFlujosCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestosFlujosCaja")) {
				jButtonCopiarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestosFlujosCaja")) {
				jButtonVerFormPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestosFlujosCaja")) {
				jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestosFlujosCaja")) {
				jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestosFlujosCaja")) {
				jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestosFlujosCaja")) {
				jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestosFlujosCaja")) {
				jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestosFlujosCaja")) {
				jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestosFlujosCaja")) {
				jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestosFlujosCaja")) {
				jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestosFlujosCaja")) {
				jButtonAbrirOrderByPresupuestosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestosFlujosCaja")) {
				jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestosFlujosCaja")) {
				jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestosFlujosCaja")) {
				jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestosFlujosCajaBusqueda")) {
				this.jButtonidPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestosFlujosCajaUpdate")) {
				this.jButtonid_empresaPresupuestosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestosFlujosCajaBusqueda")) {
				this.jButtonid_empresaPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaPresupuestosFlujosCajaBusqueda")) {
				this.jButtoncodigo_cuentaPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresupuestosFlujosCajaBusqueda")) {
				this.jButtoncodigoPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresupuestosFlujosCajaBusqueda")) {
				this.jButtonnombrePresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloPresupuestosFlujosCajaBusqueda")) {
				this.jButtonnombre_moduloPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor1PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor1PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor2PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor2PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor3PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor3PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor4PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor4PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor5PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor5PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor6PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor6PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor7PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor7PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor8PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor8PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor9PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor9PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor10PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor10PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor11PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor11PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor12PresupuestosFlujosCajaBusqueda")) {
				this.jButtonvalor12PresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalPresupuestosFlujosCajaBusqueda")) {
				this.jButtontotalPresupuestosFlujosCajaBusquedaActionPerformed(evt);
			}
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestosFlujosCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestosFlujosCaja")) {
				closingInternalFramePresupuestosFlujosCaja();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestosFlujosCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestosFlujosCaja = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestosFlujosCajaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestosFlujosCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestosFlujosCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestosFlujosCajaActionPerformed(null);
			}
			
			PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestosflujoscaja,new Object(),this.presupuestosflujoscajaParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestosFlujosCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestosFlujosCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestosFlujosCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestosflujoscaja)) {
			if(!esControlTabla) {
				if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);			
				}
				
				if(this.presupuestosflujoscajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral,this.presupuestosflujoscajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestosflujoscajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestosFlujosCaja(classes,this.presupuestosflujoscajaReturnGeneral,this.presupuestosflujoscajaBean,false);
					}
						
					if(this.presupuestosflujoscajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja());	
					}
						
					if(this.presupuestosflujoscajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja(),classes);//this.presupuestosflujoscajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestosFlujosCaja(this.presupuestosflujoscaja,classes);//this.presupuestosflujoscajaBean);									
				}
			
				if(PresupuestosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestosFlujosCaja(this.presupuestosflujoscaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestosFlujosCaja(this.presupuestosflujoscaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestosflujoscajaAnterior!=null) {
						this.presupuestosflujoscaja=this.presupuestosflujoscajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestosflujoscajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja(),presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCaja(),this.presupuestosflujoscajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestosFlujosCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestosFlujosCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestosFlujosCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestosFlujosCaja() throws Exception {
		
		PresupuestosFlujosCajaModel presupuestosflujoscajaModel=(PresupuestosFlujosCajaModel)this.jTableDatosPresupuestosFlujosCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestosflujoscajaModel.presupuestosflujoscajas=this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestosflujoscajaModel.presupuestosflujoscajas=this.presupuestosflujoscajas;
		}
		
		
		((PresupuestosFlujosCajaModel) this.jTableDatosPresupuestosFlujosCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestosFlujosCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestosflujoscajaAnterior(),this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestosflujoscajaAnterior(),this.presupuestosflujoscajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestosFlujosCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
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
										
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestosflujoscaja,new Object(),generalEntityParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestosFlujosCajaConstantesFunciones.getClassesRelationshipsOfPresupuestosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestosFlujosCajaConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestosFlujosCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestosFlujosCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestosflujoscaja,new Object(),generalEntityParameterGeneral,this.presupuestosflujoscajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestosFlujosCaja(PresupuestosFlujosCajaBean presupuestosflujoscajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestosFlujosCaja(ArrayList<Classe> classes,PresupuestosFlujosCajaReturnGeneral presupuestosflujoscajaReturnGeneral,PresupuestosFlujosCajaBean presupuestosflujoscajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestosflujoscaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja = new PresupuestosFlujosCajaDetalleFormJInternalFrame(jDesktopPane,this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones(),this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.presupuestosflujoscajaLogic=this.presupuestosflujoscajaLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestosFlujosCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestosFlujosCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestosFlujosCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestosFlujosCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestosFlujosCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestosFlujosCaja"));
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarPresupuestosFlujosCaja"));

		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestosFlujosCaja"));
					
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemModificarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestosFlujosCaja"));
						
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemActualizarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarPresupuestosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestosFlujosCaja"));
								
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemEliminarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarPresupuestosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestosFlujosCaja"));
					
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemCancelarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestosFlujosCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemDetalleCerrarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestosFlujosCaja"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestosFlujosCaja"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestosFlujosCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonidPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigoPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombrePresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor1PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor1PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor2PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor2PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor3PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor3PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor4PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor4PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor5PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor5PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor6PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor6PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor7PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor7PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor8PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor8PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor9PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor9PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor10PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor10PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor11PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor11PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor12PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor12PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtontotalPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalPresupuestosFlujosCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestosFlujosCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestosFlujosCaja"));
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestosFlujosCaja"));
		}
		
		this.jTableDatosPresupuestosFlujosCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestosFlujosCaja"));
		
		this.jTableDatosPresupuestosFlujosCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestosFlujosCaja"));
		
		this.jButtonNuevoPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoPresupuestosFlujosCaja"));
		
		this.jButtonDuplicarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestosFlujosCaja"));
		
		this.jButtonCopiarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"CopiarPresupuestosFlujosCaja"));
		
		this.jButtonVerFormPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"VerFormPresupuestosFlujosCaja"));
		
		
		this.jButtonNuevoToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestosFlujosCaja"));
			
		this.jButtonDuplicarToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemNuevoPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestosFlujosCaja"));
			
		this.jMenuItemDuplicarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestosFlujosCaja"));		
		
		
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestosFlujosCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestosFlujosCaja"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarPresupuestosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonModificarToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestosFlujosCaja"));
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemModificarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonActualizarToolBarPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestosFlujosCaja"));
				
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemActualizarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarPresupuestosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonEliminarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestosFlujosCaja"));
						
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemEliminarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarPresupuestosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonCancelarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestosFlujosCaja"));
			
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemCancelarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestosFlujosCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestosFlujosCaja"));		
		
		
		this.jButtonCerrarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarPresupuestosFlujosCaja"));
		
		
		this.jButtonCerrarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemCerrarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestosFlujosCaja"));
			
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jMenuItemDetalleCerrarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestosFlujosCaja"));
		}
		
		this.jButtonCopiarToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestosFlujosCaja"));
			
		this.jButtonVerFormToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestosFlujosCaja"));
		
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestosFlujosCaja"));
			
		this.jMenuItemCopiarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestosFlujosCaja"));		
		
		this.jMenuItemVerFormPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestosFlujosCaja"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestosFlujosCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestosFlujosCaja"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestosFlujosCaja"));
					
		this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestosFlujosCaja"));
		
		this.jMenuItemRecargarInformacionPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestosFlujosCaja"));		
		
		
		
		this.jButtonAnterioresPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestosFlujosCaja"));
		
		
		this.jButtonAnterioresToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestosFlujosCaja"));
		
		this.jMenuItemAnterioresPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestosFlujosCaja"));		
		
		
		this.jButtonSiguientesPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestosFlujosCaja"));
		
		
		this.jButtonSiguientesToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemSiguientesPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestosFlujosCaja"));
			
		this.jMenuItemAbrirOrderByPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestosFlujosCaja"));
			
		this.jMenuItemMostrarOcultarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestosFlujosCaja"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestosFlujosCaja"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestosFlujosCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestosFlujosCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestosFlujosCaja"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestosFlujosCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestosFlujosCaja"));

		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestosFlujosCaja"));
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestosFlujosCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestosFlujosCaja"));
			
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestosFlujosCaja"));
					
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestosFlujosCaja"));
			
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestosFlujosCaja"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonidPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigoPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombrePresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor1PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor1PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor2PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor2PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor3PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor3PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor4PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor4PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor5PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor5PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor6PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor6PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor7PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor7PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor8PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor8PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor9PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor9PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor10PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor10PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor11PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor11PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor12PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor12PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtontotalPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalPresupuestosFlujosCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"BusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestosFlujosCaja"));
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestosFlujosCaja"));
				this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestosFlujosCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestosFlujosCaja"));				
			//this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestosFlujosCaja"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestosFlujosCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestosFlujosCaja!=null) {
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestosFlujosCaja"));
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestosFlujosCaja"));
				this.jInternalFrameImportacionPresupuestosFlujosCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestosFlujosCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestosFlujosCaja"));
			
			this.jButtonAbrirOrderByToolBarPresupuestosFlujosCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestosFlujosCaja"));			
			
			if(this.jInternalFrameOrderByPresupuestosFlujosCaja!=null) {
				this.jInternalFrameOrderByPresupuestosFlujosCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestosFlujosCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTabbedPaneRelacionesPresupuestosFlujosCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestosFlujosCaja"));
		
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
            		closingInternalFramePresupuestosFlujosCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestosFlujosCaja = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestosFlujosCajaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestosFlujosCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestosFlujosCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestosFlujosCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestosFlujosCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestosFlujosCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestosFlujosCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestosFlujosCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoRelacionesPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestosFlujosCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestosFlujosCaja";
		inputMap = this.jButtonModificarPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestosFlujosCaja";
		inputMap = this.jButtonActualizarPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestosFlujosCaja";
		inputMap = this.jButtonEliminarPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestosFlujosCaja";
		inputMap = this.jButtonCancelarPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestosFlujosCaja";
		inputMap = this.jButtonCerrarPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestosFlujosCaja";
		inputMap = this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonGuardarCambiosPresupuestosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestosFlujosCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonidPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonid_empresaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigo_cuentaPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtoncodigoPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombrePresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonnombre_moduloPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloPresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor1PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor1PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor2PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor2PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor3PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor3PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor4PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor4PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor5PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor5PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor6PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor6PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor7PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor7PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor8PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor8PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor9PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor9PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor10PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor10PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor11PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor11PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtonvalor12PresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor12PresupuestosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jButtontotalPresupuestosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalPresupuestosFlujosCajaBusqueda"));
		
		
		this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.addActionListener(new ButtonActionListener(this,"BusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestosFlujosCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestosFlujosCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
					presupuestosflujoscajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajas) {
					presupuestosflujoscajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestosFlujosCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
						presupuestosflujoscajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajas) {
						presupuestosflujoscajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestosFlujosCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestosFlujosCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestosFlujosCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestosFlujosCaja.getSelectedRows();
			
			PresupuestosFlujosCaja presupuestosflujoscajaLocal=new PresupuestosFlujosCaja();
			
			//this.seleccionarTodosPresupuestosFlujosCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestosflujoscajaLocal =(PresupuestosFlujosCaja) this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestosflujoscajaLocal =(PresupuestosFlujosCaja) this.presupuestosflujoscajas.toArray()[this.jTableDatosPresupuestosFlujosCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestosflujoscajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
						presupuestosflujoscajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajas) {
						presupuestosflujoscajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestosFlujosCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestosFlujosCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestosFlujosCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestosFlujosCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestosFlujosCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestosFlujosCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
				
						if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							presupuestosflujoscajaAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presupuestosflujoscajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presupuestosflujoscajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							presupuestosflujoscajaAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor6(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor7(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor8(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor9(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor11(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor12(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							presupuestosflujoscajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajas) {
					
						if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							presupuestosflujoscajaAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presupuestosflujoscajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presupuestosflujoscajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							presupuestosflujoscajaAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor6(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor7(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor8(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor9(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor11(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12)) {
							existe=true;
							presupuestosflujoscajaAux.setvalor12(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							presupuestosflujoscajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestosFlujosCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestosFlujosCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestosFlujosCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestosFlujosCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestosFlujosCaja(conSplash);
				
					this.generarReportePresupuestosFlujosCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestosFlujosCajasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestosFlujosCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestosFlujosCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestosFlujosCaja();
				
				this.exportarPresupuestosFlujosCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestosFlujosCajas();
				//this.importarPresupuestosFlujosCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestosFlujosCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestosFlujosCajasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuestos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestosFlujosCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestosFlujosCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestosFlujosCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestosFlujosCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestosFlujosCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestosFlujosCaja(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestosFlujosCaja();
						
						this.generarReporteProcesoAccionPresupuestosFlujosCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuestos Flujos CajaS SELECCIONADOS?", "MANTENIMIENTO DE Presupuestos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestosFlujosCaja();
				
						this.actualizarParametrosGeneralPresupuestosFlujosCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestosflujoscajaReturnGeneral=presupuestosflujoscajaLogic.procesarAccionPresupuestosFlujosCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas(),this.presupuestosflujoscajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestosFlujosCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestosFlujosCaja();
					
					PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestosFlujosCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxTiposAccionesFormularioPresupuestosFlujosCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestosFlujosCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestosFlujosCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestosFlujosCaja();
			
			if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
			PresupuestosFlujosCaja presupuestosflujoscaja=new PresupuestosFlujosCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.getSelectedItem();
			
			
			
			
			presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestosflujoscajasSeleccionados.size()==1) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
					presupuestosflujoscaja=presupuestosflujoscajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestosFlujosCaja();
			
      		//this.finishProcessPresupuestosFlujosCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestosFlujosCajaReturnGeneral() throws Exception {
		if(this.presupuestosflujoscajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestosflujoscajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestosflujoscajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestosflujoscajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestosflujoscajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestosflujoscajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
		}
		
		if(this.presupuestosflujoscajaReturnGeneral.getConRetornoLista() || this.presupuestosflujoscajaReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestosflujoscajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestosflujoscajaLogic.setPresupuestosFlujosCajas(this.presupuestosflujoscajaReturnGeneral.getPresupuestosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPresupuestosFlujosCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestosFlujosCaja() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestosFlujosCaja> getPresupuestosFlujosCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestosFlujosCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajaLogic.getPresupuestosFlujosCajas()) {
					if(presupuestosflujoscajaAux.getIsSelected()) {
						presupuestosflujoscajasSeleccionados.add(presupuestosflujoscajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestosFlujosCaja presupuestosflujoscajaAux:this.presupuestosflujoscajas) {
					if(presupuestosflujoscajaAux.getIsSelected()) {
						presupuestosflujoscajasSeleccionados.add(presupuestosflujoscajaAux);				
					}
				}
			}
			
			if(presupuestosflujoscajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestosflujoscajasSeleccionados.addAll(this.presupuestosflujoscajaLogic.getPresupuestosFlujosCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestosflujoscajasSeleccionados.addAll(this.presupuestosflujoscajas);				
					}
				}
			}
		} else {
			presupuestosflujoscajasSeleccionados.add(this.presupuestosflujoscaja);
		}
		
		return presupuestosflujoscajasSeleccionados;
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
	
	public void generarReportePresupuestosFlujosCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestosFlujosCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestosFlujosCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestosFlujosCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestosFlujosCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuestos Flujos Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestosFlujosCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestosFlujosCaja();
		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestosFlujosCaja();
		
		
		//this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados ,presupuestosflujoscajaImplementable,presupuestosflujoscajaImplementableHome);
	}
	
	public void mostrarImportacionPresupuestosFlujosCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestosFlujosCaja();
		
		this.abrirFrameImportacionPresupuestosFlujosCaja();		
		
			
		//this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados ,presupuestosflujoscajaImplementable,presupuestosflujoscajaImplementableHome);
	}
	
	public void importarPresupuestosFlujosCajas() throws Exception {		
	
	}
	
	public void exportarPresupuestosFlujosCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestosFlujosCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestosFlujosCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestosFlujosCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuestos Flujos Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestosFlujosCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestosFlujosCaja(presupuestosflujoscajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestosflujoscajaAux.setsDetalleGeneralEntityReporte(presupuestosflujoscajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestosFlujosCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestosflujoscaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getcodigo_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getnombre_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor1().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor6().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor7().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor8().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor9().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor10().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor11().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.getvalor12().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestosflujoscaja.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestosFlujosCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestosFlujosCaja(row);				
				iRow++;
			}				
			
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestosFlujosCaja(presupuestosflujoscajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestosFlujosCajasSeleccionados() throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();		
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestosflujoscaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestosflujoscajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestosflujoscaja");
			//elementRoot.appendChild(element);
		
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
				element = document.createElement("presupuestosflujoscaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestosFlujosCaja(presupuestosflujoscajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuestos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestosFlujosCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR1);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR2);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR3);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR4);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR5);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR6);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR7);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR8);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR9);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR10);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR11);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_VALOR12);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestosFlujosCajaConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getcodigo_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getnombre_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor1());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor2());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor3());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor4());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor5());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor6());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor7());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor8());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor9());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor10());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor11());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.getvalor12());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestosflujoscaja.gettotal());				
	}
	
	public void setFilaDatosExportarXmlPresupuestosFlujosCaja(PresupuestosFlujosCaja presupuestosflujoscaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestosFlujosCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestosflujoscaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestosflujoscaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestosFlujosCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestosflujoscaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo_cuenta = document.createElement(PresupuestosFlujosCajaConstantesFunciones.CODIGOCUENTA);
		elementcodigo_cuenta.appendChild(document.createTextNode(presupuestosflujoscaja.getcodigo_cuenta().trim()));
		element.appendChild(elementcodigo_cuenta);

		Element elementcodigo = document.createElement(PresupuestosFlujosCajaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(presupuestosflujoscaja.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PresupuestosFlujosCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presupuestosflujoscaja.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_modulo = document.createElement(PresupuestosFlujosCajaConstantesFunciones.NOMBREMODULO);
		elementnombre_modulo.appendChild(document.createTextNode(presupuestosflujoscaja.getnombre_modulo().trim()));
		element.appendChild(elementnombre_modulo);

		Element elementvalor1 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR1);
		elementvalor1.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor1().toString().trim()));
		element.appendChild(elementvalor1);

		Element elementvalor2 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR2);
		elementvalor2.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor2().toString().trim()));
		element.appendChild(elementvalor2);

		Element elementvalor3 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR3);
		elementvalor3.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor3().toString().trim()));
		element.appendChild(elementvalor3);

		Element elementvalor4 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR4);
		elementvalor4.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor4().toString().trim()));
		element.appendChild(elementvalor4);

		Element elementvalor5 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR5);
		elementvalor5.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor5().toString().trim()));
		element.appendChild(elementvalor5);

		Element elementvalor6 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR6);
		elementvalor6.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor6().toString().trim()));
		element.appendChild(elementvalor6);

		Element elementvalor7 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR7);
		elementvalor7.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor7().toString().trim()));
		element.appendChild(elementvalor7);

		Element elementvalor8 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR8);
		elementvalor8.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor8().toString().trim()));
		element.appendChild(elementvalor8);

		Element elementvalor9 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR9);
		elementvalor9.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor9().toString().trim()));
		element.appendChild(elementvalor9);

		Element elementvalor10 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR10);
		elementvalor10.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor10().toString().trim()));
		element.appendChild(elementvalor10);

		Element elementvalor11 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR11);
		elementvalor11.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor11().toString().trim()));
		element.appendChild(elementvalor11);

		Element elementvalor12 = document.createElement(PresupuestosFlujosCajaConstantesFunciones.VALOR12);
		elementvalor12.appendChild(document.createTextNode(presupuestosflujoscaja.getvalor12().toString().trim()));
		element.appendChild(elementvalor12);

		Element elementtotal = document.createElement(PresupuestosFlujosCajaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(presupuestosflujoscaja.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoPresupuestosFlujosCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados=new ArrayList<PresupuestosFlujosCaja>();
		
		presupuestosflujoscajasSeleccionados=this.getPresupuestosFlujosCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestosFlujosCaja(presupuestosflujoscajasSeleccionados);
		
		this.generarReportePresupuestosFlujosCajas("Todos",presupuestosflujoscajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestosFlujosCaja(ArrayList<PresupuestosFlujosCaja> presupuestosflujoscajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestosFlujosCaja presupuestosflujoscajaAux:presupuestosflujoscajasSeleccionados) {
				presupuestosflujoscajaAux.setsDetalleGeneralEntityReporte(presupuestosflujoscajaAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestosflujoscajaAux.setsDescripcionGeneralEntityReporte1(presupuestosflujoscajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGOCUENTA)) {
					existe=true;
					presupuestosflujoscajaAux.setsDescripcionGeneralEntityReporte1(presupuestosflujoscajaAux.getcodigo_cuenta());
				}
				 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					presupuestosflujoscajaAux.setsDescripcionGeneralEntityReporte1(presupuestosflujoscajaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presupuestosflujoscajaAux.setsDescripcionGeneralEntityReporte1(presupuestosflujoscajaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PresupuestosFlujosCajaConstantesFunciones.LABEL_NOMBREMODULO)) {
					existe=true;
					presupuestosflujoscajaAux.setsDescripcionGeneralEntityReporte1(presupuestosflujoscajaAux.getnombre_modulo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestosFlujosCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=true;
		} else {
			this.actualizarEstadoPanelsPresupuestosFlujosCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestosFlujosCaja=false;
			//this.isVisibilidadCeldaVerFormPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaDuplicarPresupuestosFlujosCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestosflujoscajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;												
			}
			
			this.jButtonCerrarPresupuestosFlujosCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestosflujoscaja)) {
			this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPresupuestosFlujosCaja=false;
		this.isVisibilidadCeldaNuevoRelacionesPresupuestosFlujosCaja=false;
		this.isVisibilidadCeldaGuardarCambiosPresupuestosFlujosCaja=false;
		//this.isVisibilidadCeldaModificarPresupuestosFlujosCaja=true;
		this.isVisibilidadCeldaActualizarPresupuestosFlujosCaja=false;
		this.isVisibilidadCeldaEliminarPresupuestosFlujosCaja=false;
		//this.isVisibilidadCeldaCancelarPresupuestosFlujosCaja=true;			
		this.isVisibilidadCeldaGuardarPresupuestosFlujosCaja=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestosFlujosCaja() {
	}
	
	public void actualizarEstadoPanelsPresupuestosFlujosCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestosFlujosCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestosFlujosCaja!=null) {
				this.jScrollPanelDatosPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestosFlujosCaja!=null) {
				this.jPanelPaginacionPresupuestosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
					this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestosFlujosCaja!=null) {
				this.jPanelParametrosReportesPresupuestosFlujosCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPresupuestosFlujosCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPresupuestosFlujosCaja) {this.jTabbedPaneBusquedasPresupuestosFlujosCaja.remove(jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);}
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
			
			this.inicializarActualizarBindingTablaPresupuestosFlujosCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestosFlujosCaja() {
		this.updateBorderResaltarBusquedasFormularioPresupuestosFlujosCaja();
		this.updateVisibilidadBusquedasFormularioPresupuestosFlujosCaja();
		this.updateHabilitarBusquedasFormularioPresupuestosFlujosCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestosFlujosCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponents().length>0) {
	

		if(this.presupuestosflujoscajaConstantesFunciones.resaltarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja!=null) {
			index= this.jTabbedPaneBusquedasPresupuestosFlujosCaja.indexOfComponent(this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponent(index);
				jPanel.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestosFlujosCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestosFlujosCaja.indexOfComponent(this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			if(!this.presupuestosflujoscajaConstantesFunciones.mostrarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja && index>-1) {
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestosFlujosCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestosFlujosCaja.indexOfComponent(this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
				this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setEnabledAt(index,this.presupuestosflujoscajaConstantesFunciones.activarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestosFlujosCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPresupuestosFlujosCaja")) {
			index= this.jTabbedPaneBusquedasPresupuestosFlujosCaja.indexOfComponent(this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);

			this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestosFlujosCaja.getComponent(index);

			this.presupuestosflujoscajaConstantesFunciones.setResaltarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja(resaltar);

			jPanel.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestosFlujosCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestosFlujosCaja() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestosFlujosCaja();
		this.updateVisibilidadResaltarControlesFormularioPresupuestosFlujosCaja();
		this.updateHabilitarResaltarControlesFormularioPresupuestosFlujosCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestosFlujosCaja() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestosflujoscajaConstantesFunciones.resaltaridPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltaridPresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarid_empresaPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarid_empresaPresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigo_cuentaPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigo_cuentaPresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigoPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarcodigoPresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarnombrePresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarnombrePresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarnombre_moduloPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarnombre_moduloPresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor1PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor1PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor2PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor2PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor3PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor3PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor4PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor4PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor5PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor5PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor6PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor6PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor7PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor7PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor8PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor8PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor9PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor9PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor10PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor10PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor11PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor11PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor12PresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltarvalor12PresupuestosFlujosCaja);}
		if(this.presupuestosflujoscajaConstantesFunciones.resaltartotalPresupuestosFlujosCaja!=null && this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setBorder(this.presupuestosflujoscajaConstantesFunciones.resaltartotalPresupuestosFlujosCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestosFlujosCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostraridPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelidPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostraridPresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarid_empresaPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelid_empresaPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarid_empresaPresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigo_cuentaPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelcodigo_cuentaPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigo_cuentaPresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigoPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelcodigoPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarcodigoPresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarnombrePresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelnombrePresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarnombrePresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarnombre_moduloPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelnombre_moduloPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarnombre_moduloPresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor1PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor1PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor1PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor2PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor2PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor2PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor3PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor3PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor3PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor4PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor4PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor4PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor5PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor5PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor5PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor6PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor6PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor6PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor7PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor7PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor7PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor8PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor8PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor8PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor9PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor9PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor9PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor10PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor10PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor10PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor11PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor11PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor11PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor12PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPanelvalor12PresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrarvalor12PresupuestosFlujosCaja);
		//this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrartotalPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jPaneltotalPresupuestosFlujosCaja.setVisible(this.presupuestosflujoscajaConstantesFunciones.mostrartotalPresupuestosFlujosCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestosFlujosCaja() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestosFlujosCaja!=null) {
	
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jLabelidPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activaridPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jComboBoxid_empresaPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarid_empresaPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigo_cuentaPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarcodigo_cuentaPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldcodigoPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarcodigoPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombrePresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarnombrePresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextAreanombre_moduloPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarnombre_moduloPresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor1PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor1PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor2PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor2PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor3PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor3PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor4PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor4PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor5PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor5PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor6PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor6PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor7PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor7PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor8PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor8PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor9PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor9PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor10PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor10PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor11PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor11PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldvalor12PresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activarvalor12PresupuestosFlujosCaja);
		this.jInternalFrameDetalleFormPresupuestosFlujosCaja.jTextFieldtotalPresupuestosFlujosCaja.setEnabled(this.presupuestosflujoscajaConstantesFunciones.activartotalPresupuestosFlujosCaja);
		}
	}
	
		
}