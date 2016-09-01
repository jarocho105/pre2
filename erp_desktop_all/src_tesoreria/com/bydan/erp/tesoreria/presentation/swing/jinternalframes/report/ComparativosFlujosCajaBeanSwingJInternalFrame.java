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

//import com.bydan.erp.tesoreria.util.ComparativosFlujosCajaConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ComparativosFlujosCajaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ComparativosFlujosCajaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.ComparativosFlujosCajaBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComparativosFlujosCajaBeanSwingJInternalFrame extends ComparativosFlujosCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComparativosFlujosCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComparativosFlujosCaja> comparativosflujoscajaValidator = new ClassValidator<ComparativosFlujosCaja>(ComparativosFlujosCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComparativosFlujosCaja comparativosflujoscaja;	
	public ComparativosFlujosCaja comparativosflujoscajaAux;
	public ComparativosFlujosCaja comparativosflujoscajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComparativosFlujosCaja comparativosflujoscajaTotales;
	public Long idComparativosFlujosCajaActual;
	public Long iIdNuevoComparativosFlujosCaja=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
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
	
	public Boolean isPermisoTodoComparativosFlujosCaja;
	public Boolean isPermisoNuevoComparativosFlujosCaja;
	public Boolean isPermisoActualizarComparativosFlujosCaja;
	public Boolean isPermisoActualizarOriginalComparativosFlujosCaja;
	public Boolean isPermisoEliminarComparativosFlujosCaja;
	public Boolean isPermisoGuardarCambiosComparativosFlujosCaja;
	public Boolean isPermisoConsultaComparativosFlujosCaja;
	public Boolean isPermisoBusquedaComparativosFlujosCaja;
	public Boolean isPermisoReporteComparativosFlujosCaja;
	public Boolean isPermisoPaginacionMedioComparativosFlujosCaja;
	public Boolean isPermisoPaginacionAltoComparativosFlujosCaja;
	public Boolean isPermisoPaginacionTodoComparativosFlujosCaja;
	public Boolean isPermisoCopiarComparativosFlujosCaja;
	public Boolean isPermisoVerFormComparativosFlujosCaja;
	public Boolean isPermisoDuplicarComparativosFlujosCaja;
	public Boolean isPermisoOrdenComparativosFlujosCaja;
	
	
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
	
	public ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaReturnGeneral;
	public ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComparativosFlujosCaja=false;
	public Boolean esParaAccionDesdeFormularioComparativosFlujosCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComparativosFlujosCajaSessionBeanAdditional comparativosflujoscajaSessionBeanAdditional=null;
	
	public ComparativosFlujosCajaSessionBeanAdditional getComparativosFlujosCajaSessionBeanAdditional() {
		return this.comparativosflujoscajaSessionBeanAdditional;
	}
	
	public void setComparativosFlujosCajaSessionBeanAdditional(ComparativosFlujosCajaSessionBeanAdditional comparativosflujoscajaSessionBeanAdditional) {
		try {
			this.comparativosflujoscajaSessionBeanAdditional=comparativosflujoscajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComparativosFlujosCajaBeanSwingJInternalFrameAdditional comparativosflujoscajaBeanSwingJInternalFrameAdditional=null;
	//public class ComparativosFlujosCajaBeanSwingJInternalFrame
	
	public ComparativosFlujosCajaBeanSwingJInternalFrameAdditional getComparativosFlujosCajaBeanSwingJInternalFrameAdditional() {
		return this.comparativosflujoscajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComparativosFlujosCajaBeanSwingJInternalFrameAdditional(ComparativosFlujosCajaBeanSwingJInternalFrameAdditional comparativosflujoscajaBeanSwingJInternalFrameAdditional) {
		try {
			this.comparativosflujoscajaBeanSwingJInternalFrameAdditional=comparativosflujoscajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComparativosFlujosCajaLogic comparativosflujoscajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComparativosFlujosCaja comparativosflujoscajaBean;
	public ComparativosFlujosCajaConstantesFunciones comparativosflujoscajaConstantesFunciones;
	//public ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<ComparativosFlujosCaja> comparativosflujoscajas;	
	//public List<ComparativosFlujosCaja> comparativosflujoscajasEliminados;
	//public List<ComparativosFlujosCaja> comparativosflujoscajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaDuplicarComparativosFlujosCaja=true;
	public Boolean isVisibilidadCeldaCopiarComparativosFlujosCaja=true;
	public Boolean isVisibilidadCeldaVerFormComparativosFlujosCaja=true;
	public Boolean isVisibilidadCeldaOrdenComparativosFlujosCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaModificarComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaCancelarComparativosFlujosCaja=false;
	public Boolean isVisibilidadCeldaGuardarComparativosFlujosCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaComparativosFlujosCaja=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoComparativosFlujosCaja() {
		return this.iIdNuevoComparativosFlujosCaja;
	}

	public void setiIdNuevoComparativosFlujosCaja(Long iIdNuevoComparativosFlujosCaja) {
		this.iIdNuevoComparativosFlujosCaja = iIdNuevoComparativosFlujosCaja;
	}
	
	public Long getidComparativosFlujosCajaActual() {
		return this.idComparativosFlujosCajaActual;
	}

	public void setidComparativosFlujosCajaActual(Long idComparativosFlujosCajaActual) {
		this.idComparativosFlujosCajaActual = idComparativosFlujosCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComparativosFlujosCaja getcomparativosflujoscaja() {
		return this.comparativosflujoscaja;
	}

	public void setcomparativosflujoscaja(ComparativosFlujosCaja comparativosflujoscaja) {
		this.comparativosflujoscaja = comparativosflujoscaja;
	}
	
	public ComparativosFlujosCaja getcomparativosflujoscajaAux() {
		return this.comparativosflujoscajaAux;
	}

	public void setcomparativosflujoscajaAux(ComparativosFlujosCaja comparativosflujoscajaAux) {
		this.comparativosflujoscajaAux = comparativosflujoscajaAux;
	}				
	
	public ComparativosFlujosCaja getcomparativosflujoscajaAnterior() {
		return this.comparativosflujoscajaAnterior;
	}

	public void setcomparativosflujoscajaAnterior(ComparativosFlujosCaja comparativosflujoscajaAnterior) {
		this.comparativosflujoscajaAnterior = comparativosflujoscajaAnterior;
	}	
	
	public ComparativosFlujosCaja getcomparativosflujoscajaTotales() {
		return this.comparativosflujoscajaTotales;
	}

	public void setcomparativosflujoscajaTotales(ComparativosFlujosCaja comparativosflujoscajaTotales) {
		this.comparativosflujoscajaTotales = comparativosflujoscajaTotales;
	}	
	
	public ComparativosFlujosCaja getcomparativosflujoscajaBean() {
		return this.comparativosflujoscajaBean;
	}

	public void setcomparativosflujoscajaBean(ComparativosFlujosCaja comparativosflujoscajaBean) {
		this.comparativosflujoscajaBean = comparativosflujoscajaBean;
	}	
	
	public ComparativosFlujosCajaParameterReturnGeneral getcomparativosflujoscajaReturnGeneral() {
		return this.comparativosflujoscajaReturnGeneral;
	}

	public void setcomparativosflujoscajaReturnGeneral(ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaReturnGeneral) {
		this.comparativosflujoscajaReturnGeneral = comparativosflujoscajaReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaComparativosFlujosCaja=-1L;

	public Long getid_ejercicioBusquedaComparativosFlujosCaja() {
		return this.id_ejercicioBusquedaComparativosFlujosCaja;
	}

	public void setid_ejercicioBusquedaComparativosFlujosCaja(Long id_ejercicioBusquedaComparativosFlujosCaja) {
		this.id_ejercicioBusquedaComparativosFlujosCaja = id_ejercicioBusquedaComparativosFlujosCaja;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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
	
	
	public ComparativosFlujosCajaLogic getComparativosFlujosCajaLogic()	{		
		return comparativosflujoscajaLogic;
	}

	public void setComparativosFlujosCajaLogic(ComparativosFlujosCajaLogic comparativosflujoscajaLogic) {
		this.comparativosflujoscajaLogic = comparativosflujoscajaLogic;
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
	
	public Boolean getIsEsNuevoComparativosFlujosCaja() {
		return isEsNuevoComparativosFlujosCaja;
	}

	public void setIsEsNuevoComparativosFlujosCaja(Boolean isEsNuevoComparativosFlujosCaja) {
		this.isEsNuevoComparativosFlujosCaja = isEsNuevoComparativosFlujosCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioComparativosFlujosCaja() {
		return esParaAccionDesdeFormularioComparativosFlujosCaja;
	}
	
	public void setEsParaAccionDesdeFormularioComparativosFlujosCaja(Boolean esParaAccionDesdeFormularioComparativosFlujosCaja) {
		this.esParaAccionDesdeFormularioComparativosFlujosCaja = esParaAccionDesdeFormularioComparativosFlujosCaja;
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

			if(this.comparativosflujoscajaSessionBean==null) {
				this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
			}

			if(!this.comparativosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comparativosflujoscajaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.comparativosflujoscajaSessionBean==null) {
				this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
			}

			if(!this.comparativosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(comparativosflujoscajaSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

					if(this.comparativosflujoscaja!=null) {
						this.comparativosflujoscaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
						this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComparativosFlujosCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComparativosFlujosCajaGenerico)throws Exception
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
				jComboBoxid_empresaComparativosFlujosCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComparativosFlujosCajaGenerico!=null && jComboBoxid_empresaComparativosFlujosCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComparativosFlujosCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.comparativosflujoscaja!=null) {
						this.comparativosflujoscaja.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
						this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaComparativosFlujosCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja!=null) {
						jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja!=null) {
							//jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioComparativosFlujosCajaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioComparativosFlujosCajaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioComparativosFlujosCajaGenerico!=null && jComboBoxid_ejercicioComparativosFlujosCajaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioComparativosFlujosCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComparativosFlujosCaja comparativosflujoscaja,JComboBox jComboBoxid_empresaComparativosFlujosCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComparativosFlujosCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComparativosFlujosCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comparativosflujoscaja.setid_empresa(empresaAux.getId());
				comparativosflujoscaja.setempresa_descripcion(ComparativosFlujosCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comparativosflujoscaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ComparativosFlujosCaja comparativosflujoscaja,JComboBox jComboBoxid_ejercicioComparativosFlujosCajaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioComparativosFlujosCajaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioComparativosFlujosCajaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				comparativosflujoscaja.setid_ejercicio(ejercicioAux.getId());
				comparativosflujoscaja.setejercicio_descripcion(ComparativosFlujosCajaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				comparativosflujoscaja.setEjercicio(ejercicioAux);			}
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

					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { 
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { 
					}

					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { 
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { 
					}

					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaComparativosFlujosCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.addItem(ejercicio);
							}
						}

						if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesComparativosFlujosCaja() throws Exception {
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
		
	public ComparativosFlujosCajaParameterReturnGeneral getComparativosFlujosCajaParameterGeneral() {
		return this.comparativosflujoscajaParameterGeneral;
	}
	
	public void setComparativosFlujosCajaParameterGeneral(ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaParameterGeneral) {
		this.comparativosflujoscajaParameterGeneral = comparativosflujoscajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComparativosFlujosCaja() {
		return isPermisoTodoComparativosFlujosCaja;
	}

	public void setIsPermisoTodoComparativosFlujosCaja(Boolean isPermisoTodoComparativosFlujosCaja) {
		this.isPermisoTodoComparativosFlujosCaja = isPermisoTodoComparativosFlujosCaja;
	}

	public Boolean getIsPermisoNuevoComparativosFlujosCaja() {
		return isPermisoNuevoComparativosFlujosCaja;
	}

	public void setIsPermisoNuevoComparativosFlujosCaja(Boolean isPermisoNuevoComparativosFlujosCaja) {
		this.isPermisoNuevoComparativosFlujosCaja = isPermisoNuevoComparativosFlujosCaja;
	}

	public Boolean getIsPermisoActualizarComparativosFlujosCaja() {
		return isPermisoActualizarComparativosFlujosCaja;
	}

	public void setIsPermisoActualizarComparativosFlujosCaja(Boolean isPermisoActualizarComparativosFlujosCaja) {
		this.isPermisoActualizarComparativosFlujosCaja = isPermisoActualizarComparativosFlujosCaja;
	}

	public Boolean getIsPermisoEliminarComparativosFlujosCaja() {
		return isPermisoEliminarComparativosFlujosCaja;
	}

	public void setIsPermisoEliminarComparativosFlujosCaja(Boolean isPermisoEliminarComparativosFlujosCaja) {
		this.isPermisoEliminarComparativosFlujosCaja = isPermisoEliminarComparativosFlujosCaja;
	}

	public Boolean getIsPermisoGuardarCambiosComparativosFlujosCaja() {
		return isPermisoGuardarCambiosComparativosFlujosCaja;
	}

	public void setIsPermisoGuardarCambiosComparativosFlujosCaja(Boolean isPermisoGuardarCambiosComparativosFlujosCaja) {
		this.isPermisoGuardarCambiosComparativosFlujosCaja = isPermisoGuardarCambiosComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoConsultaComparativosFlujosCaja() {
		return isPermisoConsultaComparativosFlujosCaja;
	}

	public void setIsPermisoConsultaComparativosFlujosCaja(Boolean isPermisoConsultaComparativosFlujosCaja) {
		this.isPermisoConsultaComparativosFlujosCaja = isPermisoConsultaComparativosFlujosCaja;
	}

	public Boolean getIsPermisoBusquedaComparativosFlujosCaja() {
		return isPermisoBusquedaComparativosFlujosCaja;
	}

	public void setIsPermisoBusquedaComparativosFlujosCaja(Boolean isPermisoBusquedaComparativosFlujosCaja) {
		this.isPermisoBusquedaComparativosFlujosCaja = isPermisoBusquedaComparativosFlujosCaja;
	}

	public Boolean getIsPermisoReporteComparativosFlujosCaja() {
		return isPermisoReporteComparativosFlujosCaja;
	}

	public void setIsPermisoReporteComparativosFlujosCaja(Boolean isPermisoReporteComparativosFlujosCaja) {
		this.isPermisoReporteComparativosFlujosCaja = isPermisoReporteComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioComparativosFlujosCaja() {
		return isPermisoPaginacionMedioComparativosFlujosCaja;
	}

	public void setIsPermisoPaginacionMedioComparativosFlujosCaja(Boolean isPermisoPaginacionMedioComparativosFlujosCaja) {
		this.isPermisoPaginacionMedioComparativosFlujosCaja = isPermisoPaginacionMedioComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoComparativosFlujosCaja() {
		return isPermisoPaginacionTodoComparativosFlujosCaja;
	}

	public void setIsPermisoPaginacionTodoComparativosFlujosCaja(Boolean isPermisoPaginacionTodoComparativosFlujosCaja) {
		this.isPermisoPaginacionTodoComparativosFlujosCaja = isPermisoPaginacionTodoComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoComparativosFlujosCaja() {
		return isPermisoPaginacionAltoComparativosFlujosCaja;
	}

	public void setIsPermisoPaginacionAltoComparativosFlujosCaja(Boolean isPermisoPaginacionAltoComparativosFlujosCaja) {
		this.isPermisoPaginacionAltoComparativosFlujosCaja = isPermisoPaginacionAltoComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoCopiarComparativosFlujosCaja() {
		return isPermisoCopiarComparativosFlujosCaja;
	}

	public void setIsPermisoCopiarComparativosFlujosCaja(Boolean isPermisoCopiarComparativosFlujosCaja) {
		this.isPermisoCopiarComparativosFlujosCaja = isPermisoCopiarComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoVerFormComparativosFlujosCaja() {
		return isPermisoVerFormComparativosFlujosCaja;
	}

	public void setIsPermisoVerFormComparativosFlujosCaja(Boolean isPermisoVerFormComparativosFlujosCaja) {
		this.isPermisoVerFormComparativosFlujosCaja = isPermisoVerFormComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoDuplicarComparativosFlujosCaja() {
		return isPermisoDuplicarComparativosFlujosCaja;
	}

	public void setIsPermisoDuplicarComparativosFlujosCaja(Boolean isPermisoDuplicarComparativosFlujosCaja) {
		this.isPermisoDuplicarComparativosFlujosCaja = isPermisoDuplicarComparativosFlujosCaja;
	}
	
	public Boolean getIsPermisoOrdenComparativosFlujosCaja() {
		return isPermisoOrdenComparativosFlujosCaja;
	}

	public void setIsPermisoOrdenComparativosFlujosCaja(Boolean isPermisoOrdenComparativosFlujosCaja) {
		this.isPermisoOrdenComparativosFlujosCaja = isPermisoOrdenComparativosFlujosCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComparativosFlujosCaja() {
		return isVisibilidadCeldaNuevoComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaNuevoComparativosFlujosCaja(Boolean isVisibilidadCeldaNuevoComparativosFlujosCaja) {
		this.isVisibilidadCeldaNuevoComparativosFlujosCaja = isVisibilidadCeldaNuevoComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComparativosFlujosCaja() {
		return isVisibilidadCeldaDuplicarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaDuplicarComparativosFlujosCaja(Boolean isVisibilidadCeldaDuplicarComparativosFlujosCaja) {
		this.isVisibilidadCeldaDuplicarComparativosFlujosCaja = isVisibilidadCeldaDuplicarComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComparativosFlujosCaja() {
		return isVisibilidadCeldaCopiarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaCopiarComparativosFlujosCaja(Boolean isVisibilidadCeldaCopiarComparativosFlujosCaja) {
		this.isVisibilidadCeldaCopiarComparativosFlujosCaja = isVisibilidadCeldaCopiarComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComparativosFlujosCaja() {
		return isVisibilidadCeldaVerFormComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaVerFormComparativosFlujosCaja(Boolean isVisibilidadCeldaVerFormComparativosFlujosCaja) {
		this.isVisibilidadCeldaVerFormComparativosFlujosCaja = isVisibilidadCeldaVerFormComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComparativosFlujosCaja() {
		return isVisibilidadCeldaOrdenComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaOrdenComparativosFlujosCaja(Boolean isVisibilidadCeldaOrdenComparativosFlujosCaja) {
		this.isVisibilidadCeldaOrdenComparativosFlujosCaja = isVisibilidadCeldaOrdenComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja() {
		return isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja(Boolean isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja) {
		this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja = isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComparativosFlujosCaja() {
		return isVisibilidadCeldaModificarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaModificarComparativosFlujosCaja(Boolean isVisibilidadCeldaModificarComparativosFlujosCaja) {
		this.isVisibilidadCeldaModificarComparativosFlujosCaja = isVisibilidadCeldaModificarComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComparativosFlujosCaja() {
		return isVisibilidadCeldaActualizarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaActualizarComparativosFlujosCaja(Boolean isVisibilidadCeldaActualizarComparativosFlujosCaja) {
		this.isVisibilidadCeldaActualizarComparativosFlujosCaja = isVisibilidadCeldaActualizarComparativosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarComparativosFlujosCaja() {
		return isVisibilidadCeldaEliminarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaEliminarComparativosFlujosCaja(Boolean isVisibilidadCeldaEliminarComparativosFlujosCaja) {
		this.isVisibilidadCeldaEliminarComparativosFlujosCaja = isVisibilidadCeldaEliminarComparativosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarComparativosFlujosCaja() {
		return isVisibilidadCeldaCancelarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaCancelarComparativosFlujosCaja(Boolean isVisibilidadCeldaCancelarComparativosFlujosCaja) {
		this.isVisibilidadCeldaCancelarComparativosFlujosCaja = isVisibilidadCeldaCancelarComparativosFlujosCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarComparativosFlujosCaja() {
		return isVisibilidadCeldaGuardarComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaGuardarComparativosFlujosCaja(Boolean isVisibilidadCeldaGuardarComparativosFlujosCaja) {
		this.isVisibilidadCeldaGuardarComparativosFlujosCaja = isVisibilidadCeldaGuardarComparativosFlujosCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComparativosFlujosCaja() {
		return isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComparativosFlujosCaja(Boolean isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja) {
		this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja = isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja;
	}
		
	public ComparativosFlujosCajaSessionBean getcomparativosflujoscajaSessionBean() {
		return this.comparativosflujoscajaSessionBean;
	}
	
	public void setcomparativosflujoscajaSessionBean(ComparativosFlujosCajaSessionBean comparativosflujoscajaSessionBean) {
		this.comparativosflujoscajaSessionBean=comparativosflujoscajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComparativosFlujosCaja() {
		return this.isVisibilidadBusquedaComparativosFlujosCaja;
	}

	public void setisVisibilidadBusquedaComparativosFlujosCaja(Boolean isVisibilidadBusquedaComparativosFlujosCaja) {
		this.isVisibilidadBusquedaComparativosFlujosCaja=isVisibilidadBusquedaComparativosFlujosCaja;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comparativosflujoscaja,null);
				this.setActualParaGuardarEjercicioForeignKey(comparativosflujoscaja,null);
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
	
	public void bugActualizarReferenciaActual(ComparativosFlujosCaja comparativosflujoscaja,ComparativosFlujosCaja comparativosflujoscajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComparativosFlujosCaja(comparativosflujoscaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comparativosflujoscajaAux.setId(comparativosflujoscaja.getId());
		comparativosflujoscajaAux.setVersionRow(comparativosflujoscaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComparativosFlujosCaja comparativosflujoscajaLocal) throws Exception {
		
		if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComparativosFlujosCaja comparativosflujoscajaLocal) throws Exception {	
		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comparativosflujoscajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				comparativosflujoscajaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComparativosFlujosCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comparativosflujoscajaValidator.getInvalidValues(this.comparativosflujoscaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComparativosFlujosCaja comparativosflujoscaja,List<ComparativosFlujosCaja> comparativosflujoscajas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComparativosFlujosCaja comparativosflujoscaja,List<ComparativosFlujosCaja> comparativosflujoscajas) throws Exception {
		try	{			
			ComparativosFlujosCajaConstantesFunciones.actualizarSelectedLista(comparativosflujoscaja,comparativosflujoscajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComparativosFlujosCaja> comparativosflujoscajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comparativosflujoscajasLocal=this.comparativosflujoscajaLogic.getComparativosFlujosCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comparativosflujoscajasLocal=this.comparativosflujoscajas;
			}
			//ARCHITECTURE
		
			for(ComparativosFlujosCaja comparativosflujoscajaLocal:comparativosflujoscajasLocal) {
				if(this.permiteMantenimiento(comparativosflujoscajaLocal) && comparativosflujoscajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComparativosFlujosCajaConstantesFunciones.getComparativosFlujosCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.NOMBRECENTROACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelnombre_centro_actividadComparativosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabeltipo_movimientoComparativosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.SALDOACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_actualComparativosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.SALDOACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_acumuladoComparativosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.SALDOPRESACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_actualComparativosFlujosCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComparativosFlujosCajaConstantesFunciones.SALDOPRESACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_acumuladoComparativosFlujosCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelnombre_centro_actividadComparativosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabeltipo_movimientoComparativosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_actualComparativosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_acumuladoComparativosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_actualComparativosFlujosCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_acumuladoComparativosFlujosCaja,"");
		
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
		this.iIdNuevoComparativosFlujosCaja--;	
		
		
		this.comparativosflujoscajaAux=new ComparativosFlujosCaja();
		
		this.comparativosflujoscajaAux.setId(this.iIdNuevoComparativosFlujosCaja);
		this.comparativosflujoscajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comparativosflujoscajaLogic.getComparativosFlujosCajas().add(this.comparativosflujoscajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comparativosflujoscajas.add(this.comparativosflujoscajaAux);
		}
		//ARCHITECTURE
		
		this.comparativosflujoscaja=this.comparativosflujoscajaAux;
		
		if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscaja);
			this.setVariablesObjetoActualToFormularioForeignKeyComparativosFlujosCaja(this.comparativosflujoscaja);
		}
				
		//this.setDefaultControlesComparativosFlujosCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComparativosFlujosCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComparativosFlujosCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComparativosFlujosCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComparativosFlujosCaja(this.comparativosflujoscajaBean,this.comparativosflujoscaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral,this.comparativosflujoscajaBean,false);
		
		if(this.comparativosflujoscajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja());
		}
		
		if(this.comparativosflujoscajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja(),classes);//this.comparativosflujoscajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComparativosFlujosCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComparativosFlujosCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.RecargarFormComparativosFlujosCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
						
			if(comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComparativosFlujosCaja();
			}
			
			this.actualizarVisualTableDatosComparativosFlujosCaja();
			
			this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoComparativosFlujosCaja(), this.getIndiceNuevoComparativosFlujosCaja());
			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
						
			this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComparativosFlujosCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarnombre_centro_actividadComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activartipo_movimientoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarsaldo_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarsaldo_acumuladoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_acumuladoComparativosFlujosCaja);	
		//
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarid_empresaComparativosFlujosCaja);//
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setEnabled(isHabilitar && this.comparativosflujoscajaConstantesFunciones.activarid_ejercicioComparativosFlujosCaja);
	};
	
	public void setDefaultControlesComparativosFlujosCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComparativosFlujosCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(true);			
			this.comparativosflujoscajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.setVisible(true);
			
					
		} else {
			//this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(false);			
			this.comparativosflujoscajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComparativosFlujosCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				if(comparativosflujoscajaAux.getId().equals(this.iIdNuevoComparativosFlujosCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajas) {
				if(comparativosflujoscajaAux.getId().equals(this.iIdNuevoComparativosFlujosCaja)) {
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
	
	public int getIndiceActualComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				if(comparativosflujoscajaAux.getId().equals(comparativosflujoscaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajas) {
				if(comparativosflujoscajaAux.getId().equals(comparativosflujoscaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				if(comparativosflujoscajaAux.getComparativosFlujosCajaOriginal().getId().equals(comparativosflujoscajaOriginal.getId())) {
					existe=true;
					comparativosflujoscajaOriginal.setId(comparativosflujoscajaAux.getId());
					comparativosflujoscajaOriginal.setVersionRow(comparativosflujoscajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajas) {
				if(comparativosflujoscajaAux.getComparativosFlujosCajaOriginal().getId().equals(comparativosflujoscajaOriginal.getId())) {
					existe=true;
					comparativosflujoscajaOriginal.setId(comparativosflujoscajaAux.getId());
					comparativosflujoscajaOriginal.setVersionRow(comparativosflujoscajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComparativosFlujosCaja(Boolean esParaCancelar) throws Exception {
		comparativosflujoscajasAux=new ArrayList<ComparativosFlujosCaja>();
		comparativosflujoscajaAux=new ComparativosFlujosCaja();
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
					if(comparativosflujoscajaAux.getId()<0) {
						comparativosflujoscajasAux.add(comparativosflujoscajaAux);
					}		
				}
				this.iIdNuevoComparativosFlujosCaja=0L;
				this.comparativosflujoscajaLogic.getComparativosFlujosCajas().removeAll(comparativosflujoscajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajas) {
					if(comparativosflujoscajaAux.getId()<0) {
						comparativosflujoscajasAux.add(comparativosflujoscajaAux);
					}		
				}
				this.iIdNuevoComparativosFlujosCaja=0L;
				this.comparativosflujoscajas.removeAll(comparativosflujoscajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComparativosFlujosCaja 
					&& this.comparativosflujoscajaLogic.getComparativosFlujosCajas().size()>0
					) {
					comparativosflujoscajaAux=this.comparativosflujoscajaLogic.getComparativosFlujosCajas().get(this.comparativosflujoscajaLogic.getComparativosFlujosCajas().size() - 1);
				
					if(comparativosflujoscajaAux.getId()<0) {
						this.comparativosflujoscajaLogic.getComparativosFlujosCajas().remove(comparativosflujoscajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComparativosFlujosCaja && this.comparativosflujoscajas.size()>0) {
					comparativosflujoscajaAux=this.comparativosflujoscajas.get(this.comparativosflujoscajas.size() - 1);
				
					if(comparativosflujoscajaAux.getId()<0) {
						this.comparativosflujoscajas.remove(comparativosflujoscajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComparativosFlujosCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comparativosflujoscaja.getId()<0) {
				this.comparativosflujoscajaLogic.getComparativosFlujosCajas().remove(this.comparativosflujoscaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comparativosflujoscaja.getId()<0) {
				this.comparativosflujoscajas.remove(this.comparativosflujoscaja);
			}
		}			
	}
	
	public void setEstadosInicialesComparativosFlujosCaja(List<ComparativosFlujosCaja> comparativosflujoscajasAux) throws Exception {
		ComparativosFlujosCajaConstantesFunciones.setEstadosInicialesComparativosFlujosCaja(comparativosflujoscajasAux);
	}
	
	public void setEstadosInicialesComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscajaAux) throws Exception {
		ComparativosFlujosCajaConstantesFunciones.setEstadosInicialesComparativosFlujosCaja(comparativosflujoscajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComparativosFlujosCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComparativosFlujosCajaActual()) {
				if(!this.isEsNuevoComparativosFlujosCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComparativosFlujosCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComparativosFlujosCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comparativos Flujos Caja ?", "MANTENIMIENTO DE Comparativos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComparativosFlujosCaja comparativosflujoscaja) throws Exception {
		ComparativosFlujosCajaConstantesFunciones.seleccionarAsignar(this.comparativosflujoscaja,comparativosflujoscaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComparativosFlujosCaja=this.isPermisoActualizarOriginalComparativosFlujosCaja;
			
			
			this.seleccionarAsignar(comparativosflujoscaja);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comparativosflujoscajaSessionBean.setsFuncionBusquedaRapida(this.comparativosflujoscajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComparativosFlujosCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComparativosFlujosCaja(esParaCancelar);				
				this.cancelarNuevoComparativosFlujosCaja(esParaCancelar);								
			}
			
			this.comparativosflujoscaja=new ComparativosFlujosCaja();
			
			this.inicializarComparativosFlujosCaja();
			
			this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComparativosFlujosCaja() throws Exception {
		try {
			ComparativosFlujosCajaConstantesFunciones.inicializarComparativosFlujosCaja(this.comparativosflujoscaja);
			
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
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comparativosflujoscajaLogic.getComparativosFlujosCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComparativosFlujosCajas(String sAccionBusqueda,List<ComparativosFlujosCaja> comparativosflujoscajasParaReportes) throws Exception {
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
					sPathReporteFinal="ComparativosFlujosCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComparativosFlujosCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComparativosFlujosCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComparativosFlujosCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comparativos Flujos Cajas");		
		parameters.put("busquedapor", ComparativosFlujosCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComparativosFlujosCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComparativosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComparativosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComparativosFlujosCaja=new JRBeanArrayDataSource(ComparativosFlujosCajaJInternalFrame.TraerComparativosFlujosCajaBeans(comparativosflujoscajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComparativosFlujosCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComparativosFlujosCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComparativosFlujosCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComparativosFlujosCajaBean.TraerComparativosFlujosCajaBeans(comparativosflujoscajasParaReportes).toArray()));
							
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
				this.generarExcelReporteComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCajaActionPerformed(null);
					//this.generarExcelReporteComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComparativosFlujosCajas(sAccionBusqueda,sTipoArchivoReporte,comparativosflujoscajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComparativosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComparativosFlujosCaja> comparativosflujoscajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComparativosFlujosCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComparativosFlujosCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComparativosFlujosCaja comparativosflujoscaja : comparativosflujoscajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComparativosFlujosCajaConstantesFunciones.generarExcelReporteDataComparativosFlujosCaja("NORMAL",row,workbook,comparativosflujoscaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComparativosFlujosCaja(String sTipo,Row row,Workbook workbook) {
		
		ComparativosFlujosCajaConstantesFunciones.generarExcelReporteHeaderComparativosFlujosCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComparativosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComparativosFlujosCaja> comparativosflujoscajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComparativosFlujosCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComparativosFlujosCaja comparativosflujoscaja : comparativosflujoscajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.getComparativosFlujosCajaDescripcion(comparativosflujoscaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getnombre_centro_actividad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getsaldo_actual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getsaldo_acumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getsaldo_pres_actual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comparativosflujoscaja.getsaldo_pres_acumulado());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComparativosFlujosCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComparativosFlujosCaja> comparativosflujoscajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComparativosFlujosCaja> comparativosflujoscajasRespaldo=null;
		
		classes=ComparativosFlujosCajaConstantesFunciones.getClassesRelationshipsOfComparativosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comparativosflujoscajaLogic.setDatosCliente(this.datosCliente);
		this.comparativosflujoscajaLogic.setDatosDeep(this.datosDeep);
		this.comparativosflujoscajaLogic.setIsConDeep(true);
		
		comparativosflujoscajasRespaldo=this.comparativosflujoscajaLogic.getComparativosFlujosCajas();
		
		this.comparativosflujoscajaLogic.setComparativosFlujosCajas(comparativosflujoscajasParaReportes);	
		this.comparativosflujoscajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comparativosflujoscajasParaReportes=this.comparativosflujoscajaLogic.getComparativosFlujosCajas();
		this.comparativosflujoscajaLogic.setComparativosFlujosCajas(comparativosflujoscajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComparativosFlujosCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComparativosFlujosCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComparativosFlujosCaja comparativosflujoscaja : comparativosflujoscajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComparativosFlujosCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComparativosFlujosCajaConstantesFunciones.generarExcelReporteDataComparativosFlujosCaja("NORMAL",row,workbook,comparativosflujoscaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.getComparativosFlujosCajaDescripcion(comparativosflujoscaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComparativosFlujosCaja() throws Exception {		
		this.startProcessComparativosFlujosCaja(true);
	}
	
	public void startProcessComparativosFlujosCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComparativosFlujosCaja ,this.jPanelParametrosReportesComparativosFlujosCaja, this.jScrollPanelDatosComparativosFlujosCaja,this.jPanelPaginacionComparativosFlujosCaja, this.jScrollPanelDatosEdicionComparativosFlujosCaja, this.jPanelAccionesComparativosFlujosCaja,this.jPanelAccionesFormularioComparativosFlujosCaja,this.jmenuBarComparativosFlujosCaja,this.jmenuBarDetalleComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasComparativosFlujosCaja=this.jTabbedPaneBusquedasComparativosFlujosCaja; 
		
		final JPanel jPanelParametrosReportesComparativosFlujosCaja=this.jPanelParametrosReportesComparativosFlujosCaja;
		//final JScrollPane jScrollPanelDatosComparativosFlujosCaja=this.jScrollPanelDatosComparativosFlujosCaja;
		final JTable jTableDatosComparativosFlujosCaja=this.jTableDatosComparativosFlujosCaja;		
		final JPanel jPanelPaginacionComparativosFlujosCaja=this.jPanelPaginacionComparativosFlujosCaja;
		//final JScrollPane jScrollPanelDatosEdicionComparativosFlujosCaja=this.jScrollPanelDatosEdicionComparativosFlujosCaja;
		final JPanel jPanelAccionesComparativosFlujosCaja=this.jPanelAccionesComparativosFlujosCaja;
		
		JPanel jPanelCamposAuxiliarComparativosFlujosCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComparativosFlujosCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			jPanelCamposAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelCamposComparativosFlujosCaja;
			jPanelAccionesFormularioAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelAccionesFormularioComparativosFlujosCaja;
		}
		
		final JPanel jPanelCamposComparativosFlujosCaja=jPanelCamposAuxiliarComparativosFlujosCaja;
		final JPanel jPanelAccionesFormularioComparativosFlujosCaja=jPanelAccionesFormularioAuxiliarComparativosFlujosCaja;
		
		
		final JMenuBar jmenuBarComparativosFlujosCaja=this.jmenuBarComparativosFlujosCaja;
		final JToolBar jTtoolBarComparativosFlujosCaja=this.jTtoolBarComparativosFlujosCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComparativosFlujosCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComparativosFlujosCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			jmenuBarDetalleAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jmenuBarDetalleComparativosFlujosCaja;
			jTtoolBarDetalleAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jTtoolBarDetalleComparativosFlujosCaja;
		}
		
		final JMenuBar jmenuBarDetalleComparativosFlujosCaja=jmenuBarDetalleAuxiliarComparativosFlujosCaja;
		final JToolBar jTtoolBarDetalleComparativosFlujosCaja=jTtoolBarDetalleAuxiliarComparativosFlujosCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComparativosFlujosCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComparativosFlujosCaja;
			processRunnable.jTableDatos=jTableDatosComparativosFlujosCaja;
			processRunnable.jPanelCampos=jPanelCamposComparativosFlujosCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionComparativosFlujosCaja;
			processRunnable.jPanelAcciones=jPanelAccionesComparativosFlujosCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComparativosFlujosCaja;
			
			
			processRunnable.jmenuBar=jmenuBarComparativosFlujosCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComparativosFlujosCaja;
			processRunnable.jTtoolBar=jTtoolBarComparativosFlujosCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComparativosFlujosCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComparativosFlujosCaja ,jPanelParametrosReportesComparativosFlujosCaja,jTableDatosComparativosFlujosCaja, /*jScrollPanelDatosComparativosFlujosCaja,*/jPanelCamposComparativosFlujosCaja,jPanelPaginacionComparativosFlujosCaja, /*jScrollPanelDatosEdicionComparativosFlujosCaja,*/ jPanelAccionesComparativosFlujosCaja,jPanelAccionesFormularioComparativosFlujosCaja,jmenuBarComparativosFlujosCaja,jmenuBarDetalleComparativosFlujosCaja,jTtoolBarComparativosFlujosCaja,jTtoolBarDetalleComparativosFlujosCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComparativosFlujosCaja ,jPanelParametrosReportesComparativosFlujosCaja, jScrollPanelDatosComparativosFlujosCaja,jPanelPaginacionComparativosFlujosCaja, jScrollPanelDatosEdicionComparativosFlujosCaja, jPanelAccionesComparativosFlujosCaja,jPanelAccionesFormularioComparativosFlujosCaja,jmenuBarComparativosFlujosCaja,jmenuBarDetalleComparativosFlujosCaja,jTtoolBarComparativosFlujosCaja,jTtoolBarDetalleComparativosFlujosCaja);
						
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
	
	public void finishProcessComparativosFlujosCaja() {// throws Exception 
		this.finishProcessComparativosFlujosCaja(true);
	}
	
	public void finishProcessComparativosFlujosCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComparativosFlujosCaja ,this.jPanelParametrosReportesComparativosFlujosCaja, this.jScrollPanelDatosComparativosFlujosCaja,this.jPanelPaginacionComparativosFlujosCaja, this.jScrollPanelDatosEdicionComparativosFlujosCaja, this.jPanelAccionesComparativosFlujosCaja,this.jPanelAccionesFormularioComparativosFlujosCaja,this.jmenuBarComparativosFlujosCaja,this.jmenuBarDetalleComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasComparativosFlujosCaja=this.jTabbedPaneBusquedasComparativosFlujosCaja; 
		
		final JPanel jPanelParametrosReportesComparativosFlujosCaja=this.jPanelParametrosReportesComparativosFlujosCaja;
		//final JScrollPane jScrollPanelDatosComparativosFlujosCaja=this.jScrollPanelDatosComparativosFlujosCaja;
		final JTable jTableDatosComparativosFlujosCaja=this.jTableDatosComparativosFlujosCaja;		
		final JPanel jPanelPaginacionComparativosFlujosCaja=this.jPanelPaginacionComparativosFlujosCaja;
		//final JScrollPane jScrollPanelDatosEdicionComparativosFlujosCaja=this.jScrollPanelDatosEdicionComparativosFlujosCaja;
		final JPanel jPanelAccionesComparativosFlujosCaja=this.jPanelAccionesComparativosFlujosCaja;
		
		JPanel jPanelCamposAuxiliarComparativosFlujosCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComparativosFlujosCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			jPanelCamposAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelCamposComparativosFlujosCaja;
			jPanelAccionesFormularioAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelAccionesFormularioComparativosFlujosCaja;
		}
		
		final JPanel jPanelCamposComparativosFlujosCaja=jPanelCamposAuxiliarComparativosFlujosCaja;
		final JPanel jPanelAccionesFormularioComparativosFlujosCaja=jPanelAccionesFormularioAuxiliarComparativosFlujosCaja;
		
		
		final JMenuBar jmenuBarComparativosFlujosCaja=this.jmenuBarComparativosFlujosCaja;		
		final JToolBar jTtoolBarComparativosFlujosCaja=this.jTtoolBarComparativosFlujosCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarComparativosFlujosCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComparativosFlujosCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			jmenuBarDetalleAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jmenuBarDetalleComparativosFlujosCaja;
			jTtoolBarDetalleAuxiliarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jTtoolBarDetalleComparativosFlujosCaja;		
		}
		
		final JMenuBar jmenuBarDetalleComparativosFlujosCaja=jmenuBarDetalleAuxiliarComparativosFlujosCaja;
		final JToolBar jTtoolBarDetalleComparativosFlujosCaja=jTtoolBarDetalleAuxiliarComparativosFlujosCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComparativosFlujosCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComparativosFlujosCaja;
			processRunnable.jTableDatos=jTableDatosComparativosFlujosCaja;
			processRunnable.jPanelCampos=jPanelCamposComparativosFlujosCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionComparativosFlujosCaja;
			processRunnable.jPanelAcciones=jPanelAccionesComparativosFlujosCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComparativosFlujosCaja;
			
			
			processRunnable.jmenuBar=jmenuBarComparativosFlujosCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComparativosFlujosCaja;
			processRunnable.jTtoolBar=jTtoolBarComparativosFlujosCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComparativosFlujosCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComparativosFlujosCaja ,jPanelParametrosReportesComparativosFlujosCaja, jTableDatosComparativosFlujosCaja,/*jScrollPanelDatosComparativosFlujosCaja,*/jPanelCamposComparativosFlujosCaja,jPanelPaginacionComparativosFlujosCaja, /*jScrollPanelDatosEdicionComparativosFlujosCaja,*/ jPanelAccionesComparativosFlujosCaja,jPanelAccionesFormularioComparativosFlujosCaja,jmenuBarComparativosFlujosCaja,jmenuBarDetalleComparativosFlujosCaja,jTtoolBarComparativosFlujosCaja,jTtoolBarDetalleComparativosFlujosCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComparativosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComparativosFlujosCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComparativosFlujosCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComparativosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComparativosFlujosCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComparativosFlujosCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComparativosFlujosCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComparativosFlujosCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComparativosFlujosCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comparativosflujoscajaConstantesFunciones.getsFinalQueryComparativosFlujosCaja();
		String  finalQueryPaginacionTodos=this.comparativosflujoscajaConstantesFunciones.getsFinalQueryComparativosFlujosCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComparativosFlujosCajaConstantesFunciones.getArrayColumnasGlobalesNoComparativosFlujosCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComparativosFlujosCajaConstantesFunciones.getArrayColumnasGlobalesComparativosFlujosCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComparativosFlujosCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comparativosflujoscajasEliminados= new ArrayList<ComparativosFlujosCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComparativosFlujosCaja();
		
				///*ComparativosFlujosCajaSessionBean*/this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
			
			if(this.comparativosflujoscajaSessionBean==null) {
				this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
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
					this.iNumeroPaginacion=ComparativosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComparativosFlujosCajaConstantesFunciones.getClassesForeignKeysOfComparativosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comparativosflujoscaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comparativosflujoscajasAux= new ArrayList<ComparativosFlujosCaja>();
			
				
			comparativosflujoscajaLogic.setDatosCliente(this.datosCliente);
			comparativosflujoscajaLogic.setDatosDeep(this.datosDeep);
			comparativosflujoscajaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComparativosFlujosCaja")) {
				this.sDetalleReporte=ComparativosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaComparativosFlujosCaja(id_ejercicioBusquedaComparativosFlujosCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comparativosflujoscajaLogic.getComparativosFlujosCajasBusquedaComparativosFlujosCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaComparativosFlujosCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComparativosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaComparativosFlujosCaja(id_ejercicioBusquedaComparativosFlujosCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComparativosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaComparativosFlujosCaja(id_ejercicioBusquedaComparativosFlujosCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comparativosflujoscajaLogic.getComparativosFlujosCajas()==null||comparativosflujoscajaLogic.getComparativosFlujosCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comparativosflujoscajas==null|| comparativosflujoscajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comparativosflujoscajasAux=new ArrayList<ComparativosFlujosCaja>();
						comparativosflujoscajasAux.addAll(comparativosflujoscajaLogic.getComparativosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comparativosflujoscajasAux=new ArrayList<ComparativosFlujosCaja>();
							comparativosflujoscajasAux.addAll(comparativosflujoscajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comparativosflujoscajaLogic.getComparativosFlujosCajasBusquedaComparativosFlujosCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaComparativosFlujosCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComparativosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaComparativosFlujosCaja(id_ejercicioBusquedaComparativosFlujosCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComparativosFlujosCajaConstantesFunciones.getDetalleIndiceBusquedaComparativosFlujosCaja(id_ejercicioBusquedaComparativosFlujosCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComparativosFlujosCajas("BusquedaComparativosFlujosCaja",comparativosflujoscajaLogic.getComparativosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComparativosFlujosCajas("BusquedaComparativosFlujosCaja",comparativosflujoscajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comparativosflujoscajaLogic.setComparativosFlujosCajas(new ArrayList<ComparativosFlujosCaja>());
						comparativosflujoscajaLogic.getComparativosFlujosCajas().addAll(comparativosflujoscajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comparativosflujoscajas=new ArrayList<ComparativosFlujosCaja>();
							comparativosflujoscajas.addAll(comparativosflujoscajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComparativosFlujosCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComparativosFlujosCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comparativosflujoscajaLogic.getComparativosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comparativosflujoscajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comparativosflujoscajaLogic.getComparativosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comparativosflujoscajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComparativosFlujosCaja comparativosflujoscaja) {
		Boolean permite=true;
		
		if(this.comparativosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComparativosFlujosCajaConstantesFunciones.getOrderByListaComparativosFlujosCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComparativosFlujosCajaConstantesFunciones.getOrderByListaComparativosFlujosCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				if(comparativosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					comparativosflujoscajaTotales=comparativosflujoscaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComparativosFlujosCaja comparativosflujoscaja:this.comparativosflujoscajas) {
				if(comparativosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					comparativosflujoscajaTotales=comparativosflujoscaja;
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
			this.comparativosflujoscajaAux=new ComparativosFlujosCaja();
			this.comparativosflujoscajaAux.setsType(Constantes2.S_TOTALES);
			this.comparativosflujoscajaAux.setIsNew(false);
			this.comparativosflujoscajaAux.setIsChanged(false);
			this.comparativosflujoscajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComparativosFlujosCajaConstantesFunciones.TotalizarValoresFilaComparativosFlujosCaja(this.comparativosflujoscajaLogic.getComparativosFlujosCajas(),this.comparativosflujoscajaAux);
				
				//this.comparativosflujoscajaLogic.getComparativosFlujosCajas().add(this.comparativosflujoscajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComparativosFlujosCajaConstantesFunciones.TotalizarValoresFilaComparativosFlujosCaja(this.comparativosflujoscajas,this.comparativosflujoscajaAux);
				
				this.comparativosflujoscajas.add(this.comparativosflujoscajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comparativosflujoscajaTotales=new ComparativosFlujosCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comparativosflujoscajaLogic.getComparativosFlujosCajas().remove(comparativosflujoscajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comparativosflujoscajas.remove(comparativosflujoscajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comparativosflujoscajaTotales=new ComparativosFlujosCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				if(comparativosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					comparativosflujoscajaTotales=comparativosflujoscaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComparativosFlujosCajaConstantesFunciones.TotalizarValoresFilaComparativosFlujosCaja(this.comparativosflujoscajaLogic.getComparativosFlujosCajas(),comparativosflujoscajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComparativosFlujosCaja comparativosflujoscaja:this.comparativosflujoscajas) {
				if(comparativosflujoscaja.getsType().equals(Constantes2.S_TOTALES)) {
					comparativosflujoscajaTotales=comparativosflujoscaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComparativosFlujosCajaConstantesFunciones.TotalizarValoresFilaComparativosFlujosCaja(this.comparativosflujoscajas,comparativosflujoscajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComparativosFlujosCajasBusquedaComparativosFlujosCaja()throws Exception {
		try {
			sAccionBusqueda="BusquedaComparativosFlujosCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComparativosFlujosCajasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComparativosFlujosCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComparativosFlujosCajasBusquedaComparativosFlujosCaja(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comparativosflujoscajaLogic.getComparativosFlujosCajasBusquedaComparativosFlujosCaja(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComparativosFlujosCajasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comparativosflujoscajaLogic.getComparativosFlujosCajasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComparativosFlujosCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comparativosflujoscajaLogic.getComparativosFlujosCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosComparativosFlujosCaja() {
		this.isPermisoTodoComparativosFlujosCaja=false;
		this.isPermisoNuevoComparativosFlujosCaja=false;
		this.isPermisoActualizarComparativosFlujosCaja=false;
		this.isPermisoActualizarOriginalComparativosFlujosCaja=false;
		this.isPermisoEliminarComparativosFlujosCaja=false;
		this.isPermisoGuardarCambiosComparativosFlujosCaja=false;
		this.isPermisoConsultaComparativosFlujosCaja=true;
		this.isPermisoBusquedaComparativosFlujosCaja=true;
		this.isPermisoReporteComparativosFlujosCaja=true;
		this.isPermisoOrdenComparativosFlujosCaja=false;		
		this.isPermisoPaginacionMedioComparativosFlujosCaja=false;		
		this.isPermisoPaginacionAltoComparativosFlujosCaja=false;		
		this.isPermisoPaginacionTodoComparativosFlujosCaja=false;		
		this.isPermisoCopiarComparativosFlujosCaja=false;		
		this.isPermisoVerFormComparativosFlujosCaja=false;		
		this.isPermisoDuplicarComparativosFlujosCaja=false;
		this.isPermisoOrdenComparativosFlujosCaja=false;
	}
	
	public void setPermisosUsuarioComparativosFlujosCaja(Boolean isPermiso) {
		this.isPermisoTodoComparativosFlujosCaja=isPermiso;
		this.isPermisoNuevoComparativosFlujosCaja=isPermiso;
		this.isPermisoActualizarComparativosFlujosCaja=isPermiso;
		this.isPermisoActualizarOriginalComparativosFlujosCaja=isPermiso;
		this.isPermisoEliminarComparativosFlujosCaja=isPermiso;
		this.isPermisoGuardarCambiosComparativosFlujosCaja=isPermiso;
		this.isPermisoConsultaComparativosFlujosCaja=isPermiso;
		this.isPermisoBusquedaComparativosFlujosCaja=isPermiso;
		this.isPermisoReporteComparativosFlujosCaja=isPermiso;
		this.isPermisoOrdenComparativosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionMedioComparativosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionAltoComparativosFlujosCaja=isPermiso;		
		this.isPermisoPaginacionTodoComparativosFlujosCaja=isPermiso;		
		this.isPermisoCopiarComparativosFlujosCaja=isPermiso;		
		this.isPermisoVerFormComparativosFlujosCaja=isPermiso;		
		this.isPermisoDuplicarComparativosFlujosCaja=isPermiso;
		this.isPermisoOrdenComparativosFlujosCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComparativosFlujosCaja(Boolean isPermiso) {
		//this.isPermisoTodoComparativosFlujosCaja=isPermiso;
		this.isPermisoNuevoComparativosFlujosCaja=isPermiso;
		this.isPermisoActualizarComparativosFlujosCaja=isPermiso;
		this.isPermisoActualizarOriginalComparativosFlujosCaja=isPermiso;
		this.isPermisoEliminarComparativosFlujosCaja=isPermiso;
		this.isPermisoGuardarCambiosComparativosFlujosCaja=isPermiso;
		//this.isPermisoConsultaComparativosFlujosCaja=isPermiso;
		//this.isPermisoBusquedaComparativosFlujosCaja=isPermiso;
		//this.isPermisoReporteComparativosFlujosCaja=isPermiso;
		//this.isPermisoOrdenComparativosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionMedioComparativosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionAltoComparativosFlujosCaja=isPermiso;		
		//this.isPermisoPaginacionTodoComparativosFlujosCaja=isPermiso;		
		//this.isPermisoCopiarComparativosFlujosCaja=isPermiso;		
		//this.isPermisoDuplicarComparativosFlujosCaja=isPermiso;
		//this.isPermisoOrdenComparativosFlujosCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComparativosFlujosCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComparativosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComparativosFlujosCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComparativosFlujosCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComparativosFlujosCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComparativosFlujosCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComparativosFlujosCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComparativosFlujosCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComparativosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComparativosFlujosCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComparativosFlujosCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComparativosFlujosCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComparativosFlujosCaja=this.isPermisoActualizarComparativosFlujosCaja;
			this.isPermisoEliminarComparativosFlujosCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComparativosFlujosCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComparativosFlujosCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComparativosFlujosCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComparativosFlujosCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComparativosFlujosCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComparativosFlujosCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComparativosFlujosCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComparativosFlujosCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComparativosFlujosCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComparativosFlujosCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComparativosFlujosCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComparativosFlujosCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComparativosFlujosCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComparativosFlujosCaja.setToolTipText(this.jTableDatosComparativosFlujosCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComparativosFlujosCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComparativosFlujosCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComparativosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComparativosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComparativosFlujosCaja() throws Exception {
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
	public void inicializarCombosForeignKeyComparativosFlujosCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComparativosFlujosCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComparativosFlujosCajaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyComparativosFlujosCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comparativosflujoscajaSessionBean==null) {
				this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
			}

			if(!this.comparativosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.comparativosflujoscajaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComparativosFlujosCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComparativosFlujosCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComparativosFlujosCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComparativosFlujosCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComparativosFlujosCaja()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComparativosFlujosCaja()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComparativosFlujosCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComparativosFlujosCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComparativosFlujosCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComparativosFlujosCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComparativosFlujosCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComparativosFlujosCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ComparativosFlujosCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComparativosFlujosCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComparativosFlujosCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean(); 
		this.comparativosflujoscajaConstantesFunciones=new ComparativosFlujosCajaConstantesFunciones(); 
		this.comparativosflujoscajaBean=new ComparativosFlujosCaja();//(this.comparativosflujoscajaConstantesFunciones); 		
		this.comparativosflujoscajaReturnGeneral=new ComparativosFlujosCajaParameterReturnGeneral(); 
		
		this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comparativosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComparativosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComparativosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComparativosFlujosCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComparativosFlujosCaja(true);
			
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
			
			this.comparativosflujoscajaConstantesFunciones=new ComparativosFlujosCajaConstantesFunciones(); 
			this.comparativosflujoscajaBean=new ComparativosFlujosCaja();//this.comparativosflujoscajaConstantesFunciones); 			
			this.comparativosflujoscajaReturnGeneral=new ComparativosFlujosCajaParameterReturnGeneral(); 
		
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comparativos Flujos Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comparativosflujoscaja=new ComparativosFlujosCaja();
			this.comparativosflujoscajas = new ArrayList<ComparativosFlujosCaja>();
			this.comparativosflujoscajasAux = new ArrayList<ComparativosFlujosCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic=new ComparativosFlujosCajaLogic();
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			//this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comparativosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComparativosFlujosCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComparativosFlujosCaja);	
					}
					
					if(this.jInternalFrameImportacionComparativosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComparativosFlujosCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComparativosFlujosCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComparativosFlujosCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComparativosFlujosCaja);
				this.jInternalFrameDetalleFormComparativosFlujosCaja.setVisible(false);
				this.jInternalFrameDetalleFormComparativosFlujosCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComparativosFlujosCaja);
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComparativosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComparativosFlujosCaja);
					this.jInternalFrameImportacionComparativosFlujosCaja.setVisible(false);
					this.jInternalFrameImportacionComparativosFlujosCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComparativosFlujosCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComparativosFlujosCaja);
					this.jInternalFrameOrderByComparativosFlujosCaja.setVisible(false);
					this.jInternalFrameOrderByComparativosFlujosCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComparativosFlujosCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComparativosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comparativosflujoscajaReturnGeneral=new ComparativosFlujosCajaParameterReturnGeneral();
			
			this.comparativosflujoscajaParameterGeneral=new ComparativosFlujosCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comparativosflujoscajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComparativosFlujosCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComparativosFlujosCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),this.comparativosflujoscajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComparativosFlujosCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),this.comparativosflujoscajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaDuplicarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaCopiarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaVerFormComparativosFlujosCaja=true;
			this.isVisibilidadCeldaOrdenComparativosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			
			
			this.isVisibilidadBusquedaComparativosFlujosCaja=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComparativosFlujosCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComparativosFlujosCaja(false);
			
			this.setPermisosUsuarioComparativosFlujosCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() 
				|| (this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() && this.comparativosflujoscajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComparativosFlujosCajaClasesRelacionadas();
			}
			
			if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComparativosFlujosCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComparativosFlujosCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComparativosFlujosCaja();
			}
			
			if(!this.isPermisoBusquedaComparativosFlujosCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComparativosFlujosCajaConstantesFunciones.getTiposSeleccionarComparativosFlujosCaja());
				
				this.tiposColumnasSelect=ComparativosFlujosCajaConstantesFunciones.getTiposSeleccionarComparativosFlujosCaja(true);
				
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
			//if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComparativosFlujosCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComparativosFlujosCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComparativosFlujosCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComparativosFlujosCaja() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comparativosflujoscajaImplementable= (ComparativosFlujosCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComparativosFlujosCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comparativosflujoscajaImplementableHome= (ComparativosFlujosCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComparativosFlujosCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comparativosflujoscajas= new ArrayList<ComparativosFlujosCaja>();
			this.comparativosflujoscajasEliminados= new ArrayList<ComparativosFlujosCaja>();
						
			this.isEsNuevoComparativosFlujosCaja=false;
			this.esParaAccionDesdeFormularioComparativosFlujosCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComparativosFlujosCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComparativosFlujosCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComparativosFlujosCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComparativosFlujosCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComparativosFlujosCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComparativosFlujosCaja();
			}
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComparativosFlujosCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComparativosFlujosCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComparativosFlujosCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComparativosFlujosCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComparativosFlujosCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComparativosFlujosCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComparativosFlujosCaja")) {
				iIndex=this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComparativosFlujosCaja();	
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
	
	public void cargarCombosForeignKeyComparativosFlujosCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComparativosFlujosCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComparativosFlujosCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComparativosFlujosCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComparativosFlujosCaja();
		
		this.cargarCombosFrameForeignKeyComparativosFlujosCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComparativosFlujosCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComparativosFlujosCaja();
		}
	}
	
	
	
	public void jButtonNuevoComparativosFlujosCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			
			if(jTableDatosComparativosFlujosCaja.getRowCount()>=1) {
				jTableDatosComparativosFlujosCaja.removeRowSelectionInterval(0, jTableDatosComparativosFlujosCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoComparativosFlujosCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComparativosFlujosCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComparativosFlujosCaja(true);			
			//this.comparativosflujoscaja=new ComparativosFlujosCaja();
			//this.comparativosflujoscaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja() ;
			
			if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComparativosFlujosCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comparativosflujoscaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);				
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComparativosFlujosCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComparativosFlujosCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComparativosFlujosCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComparativosFlujosCaja.getSelectedRows().length;			
			}
			
			comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComparativosFlujosCaja--;			
				//ComparativosFlujosCaja comparativosflujoscajaAux= new ComparativosFlujosCaja();			
				//comparativosflujoscajaAux.setId(this.iIdNuevoComparativosFlujosCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComparativosFlujosCaja comparativosflujoscajaOrigen=new ComparativosFlujosCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComparativosFlujosCaja comparativosflujoscajaOrigen : comparativosflujoscajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comparativosflujoscajaOrigen =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comparativosflujoscajaOrigen =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComparativosFlujosCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comparativosflujoscaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComparativosFlujosCaja(comparativosflujoscajaOrigen,this.comparativosflujoscaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comparativosflujoscajaLogic.getComparativosFlujosCajas().add(this.comparativosflujoscajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscajas.add(this.comparativosflujoscajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
				
				this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoComparativosFlujosCaja(), this.getIndiceNuevoComparativosFlujosCaja());
				
				int iLastRow =  this.jTableDatosComparativosFlujosCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComparativosFlujosCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComparativosFlujosCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();									
		
			ComparativosFlujosCaja comparativosflujoscajaOrigen=new ComparativosFlujosCaja();
			ComparativosFlujosCaja comparativosflujoscajaDestino=new ComparativosFlujosCaja();
				
			comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComparativosFlujosCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comparativosflujoscajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComparativosFlujosCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comparativosflujoscajaOrigen =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comparativosflujoscajaOrigen =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comparativosflujoscajaDestino =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comparativosflujoscajaDestino =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comparativosflujoscajaOrigen =comparativosflujoscajasSeleccionados.get(0);
				comparativosflujoscajaDestino =comparativosflujoscajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComparativosFlujosCaja(comparativosflujoscajaOrigen,comparativosflujoscajaDestino,true,false);
				
				comparativosflujoscajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comparativosflujoscajaDestino,comparativosflujoscajaLogic.getComparativosFlujosCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comparativosflujoscajaDestino,comparativosflujoscajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
				
				//this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoComparativosFlujosCaja(), this.getIndiceNuevoComparativosFlujosCaja());
				
				int iLastRow =  this.jTableDatosComparativosFlujosCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComparativosFlujosCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComparativosFlujosCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComparativosFlujosCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(!isVisible);
			this.jPanelPaginacionComparativosFlujosCaja.setVisible(!isVisible);
			this.jPanelAccionesComparativosFlujosCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComparativosFlujosCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComparativosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComparativosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComparativosFlujosCaja();
			
			this.abrirFrameOrderByComparativosFlujosCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComparativosFlujosCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComparativosFlujosCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComparativosFlujosCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComparativosFlujosCaja.isMaximum()) {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComparativosFlujosCaja.setSize(this.jInternalFrameDetalleFormComparativosFlujosCaja.iWidthFormulario,this.jInternalFrameDetalleFormComparativosFlujosCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComparativosFlujosCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComparativosFlujosCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComparativosFlujosCaja.isMaximum()) {
						this.jInternalFrameDetalleFormComparativosFlujosCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jContentPaneDetalleComparativosFlujosCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComparativosFlujosCaja.jContentPaneDetalleComparativosFlujosCaja.getWidth(),ComparativosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComparativosFlujosCaja.jContentPaneDetalleComparativosFlujosCaja.getWidth(),ComparativosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComparativosFlujosCaja.jContentPaneDetalleComparativosFlujosCaja.getWidth(),ComparativosFlujosCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComparativosFlujosCaja.setVisible(true);
	        this.jInternalFrameDetalleFormComparativosFlujosCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComparativosFlujosCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComparativosFlujosCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComparativosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComparativosFlujosCaja,false,this);
				} else {
					this.jInternalFrameOrderByComparativosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComparativosFlujosCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComparativosFlujosCaja);
				this.jInternalFrameOrderByComparativosFlujosCaja.setVisible(false);
				this.jInternalFrameOrderByComparativosFlujosCaja.setSelected(false);
				
				this.jInternalFrameOrderByComparativosFlujosCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComparativosFlujosCaja"));
				
				this.inicializarActualizarBindingTablaOrderByComparativosFlujosCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComparativosFlujosCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComparativosFlujosCaja==null) {
				
				this.jInternalFrameImportacionComparativosFlujosCaja=new ImportacionJInternalFrame(ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComparativosFlujosCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComparativosFlujosCaja);
				this.jInternalFrameImportacionComparativosFlujosCaja.setVisible(false);
				this.jInternalFrameImportacionComparativosFlujosCaja.setSelected(false);


				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComparativosFlujosCaja"));
				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComparativosFlujosCaja"));
				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComparativosFlujosCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComparativosFlujosCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja==null) {
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja=new ReporteDinamicoJInternalFrame(ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComparativosFlujosCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComparativosFlujosCaja);
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComparativosFlujosCaja"));
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComparativosFlujosCaja"));
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComparativosFlujosCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComparativosFlujosCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComparativosFlujosCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComparativosFlujosCaja);
			
	       	this.jInternalFrameDetalleFormComparativosFlujosCaja.setVisible(false);
	        this.jInternalFrameDetalleFormComparativosFlujosCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormComparativosFlujosCaja.dispose();
			//this.jInternalFrameDetalleFormComparativosFlujosCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComparativosFlujosCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComparativosFlujosCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComparativosFlujosCaja.setVisible(true);
	        this.jInternalFrameImportacionComparativosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComparativosFlujosCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComparativosFlujosCaja.setVisible(true);
	        this.jInternalFrameOrderByComparativosFlujosCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComparativosFlujosCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComparativosFlujosCaja.setVisible(false);
	        this.jInternalFrameOrderByComparativosFlujosCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComparativosFlujosCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComparativosFlujosCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComparativosFlujosCaja.setVisible(false);
	        this.jInternalFrameImportacionComparativosFlujosCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComparativosFlujosCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComparativosFlujosCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComparativosFlujosCaja(true);
			//this.isEsNuevoComparativosFlujosCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false) ;
			
			if(comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComparativosFlujosCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComparativosFlujosCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComparativosFlujosCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComparativosFlujosCaja(true);
			//this.isEsNuevoComparativosFlujosCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comparativosflujoscaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false) ;
			
			if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComparativosFlujosCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComparativosFlujosCaja(false);
			
			//if(!this.isEsNuevoComparativosFlujosCaja) {								
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				
			}
			
			if(this.permiteMantenimiento(this.comparativosflujoscaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComparativosFlujosCaja=true;
					this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
					this.isEsNuevoComparativosFlujosCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComparativosFlujosCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComparativosFlujosCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(false);
				
				this.habilitarDeshabilitarControlesComparativosFlujosCaja(false);
			
												
				
				if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComparativosFlujosCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComparativosFlujosCajaActionPerformed(evt,comparativosflujoscajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComparativosFlujosCaja(this.comparativosflujoscaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comparativosflujoscajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comparativosflujoscaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				this.comparativosflujoscaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				this.comparativosflujoscaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comparativosflujoscaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComparativosFlujosCajaModel) this.jTableDatosComparativosFlujosCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComparativosFlujosCaja=true;
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
				this.isEsNuevoComparativosFlujosCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(false);
				
				this.habilitarDeshabilitarControlesComparativosFlujosCaja(false);
				
				
				
				if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComparativosFlujosCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComparativosFlujosCaja.getRowCount()>=1) {
				jTableDatosComparativosFlujosCaja.removeRowSelectionInterval(0, jTableDatosComparativosFlujosCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComparativosFlujosCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(false) ;
			
			this.isEsNuevoComparativosFlujosCaja=false;
			
			if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComparativosFlujosCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComparativosFlujosCaja(false);
				
				//SI ES MANUAL
				if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComparativosFlujosCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComparativosFlujosCaja--;			
			//ComparativosFlujosCaja comparativosflujoscajaAux= new ComparativosFlujosCaja();			
			//comparativosflujoscajaAux.setId(this.iIdNuevoComparativosFlujosCaja);
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComparativosFlujosCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
			
			this.comparativosflujoscaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comparativosflujoscajaLogic.getComparativosFlujosCajas().add(this.comparativosflujoscajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comparativosflujoscajas.add(this.comparativosflujoscajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			
			this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(this.getIndiceNuevoComparativosFlujosCaja(), this.getIndiceNuevoComparativosFlujosCaja());
			
			int iLastRow =  this.jTableDatosComparativosFlujosCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComparativosFlujosCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComparativosFlujosCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
			
			//SI ES MANUAL
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComparativosFlujosCaja();
			}
			
			//this.abrirFrameTreeComparativosFlujosCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComparativosFlujosCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComparativosFlujosCaja.setFileImportacion(this.jInternalFrameImportacionComparativosFlujosCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComparativosFlujosCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComparativosFlujosCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComparativosFlujosCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComparativosFlujosCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		

		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComparativosFlujosCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComparativosFlujosCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCentroActividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCentroActividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCentroActividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCentroActividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoActual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoAcumulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoAcumulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoAcumulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoAcumulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoPresActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoPresActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoPresActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoPresActual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoPresAcumulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoPresAcumulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoPresAcumulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoPresAcumulado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					sNombreCampoCategoria="nombre_centro_actividad";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL:
					sNombreCampoCategoria="saldo_actual";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO:
					sNombreCampoCategoria="saldo_acumulado";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL:
					sNombreCampoCategoria="saldo_pres_actual";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO:
					sNombreCampoCategoria="saldo_pres_acumulado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					sNombreCampoCategoriaValor="nombre_centro_actividad";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL:
					sNombreCampoCategoriaValor="saldo_actual";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO:
					sNombreCampoCategoriaValor="saldo_acumulado";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL:
					sNombreCampoCategoriaValor="saldo_pres_actual";
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO:
					sNombreCampoCategoriaValor="saldo_pres_acumulado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Centro Activad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_centro_actividad");
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_actual");
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_acumulado");
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Pres Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_pres_actual");
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Pres Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_pres_acumulado");
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
	
	public void jButtonGenerarExcelReporteDinamicoComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComparativosFlujosCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getnombre_centro_actividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getsaldo_actual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getsaldo_acumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getsaldo_pres_actual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO);
					iRow++;

					for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comparativosflujoscaja.getsaldo_pres_acumulado());
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
			//	this.getFilaCabeceraExportarExcelComparativosFlujosCaja(row);				
			//	iRow++;
			//}				
			
			//for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComparativosFlujosCaja(comparativosflujoscajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
			
			//SI ES MANUAL
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComparativosFlujosCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
			
			//SI ES MANUAL
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComparativosFlujosCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
			
			//SI ES MANUAL
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComparativosFlujosCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComparativosFlujosCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComparativosFlujosCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComparativosFlujosCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComparativosFlujosCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComparativosFlujosCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComparativosFlujosCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosComparativosFlujosCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosComparativosFlujosCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComparativosFlujosCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComparativosFlujosCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComparativosFlujosCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComparativosFlujosCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComparativosFlujosCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComparativosFlujosCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComparativosFlujosCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComparativosFlujosCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComparativosFlujosCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComparativosFlujosCaja();
		
		this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComparativosFlujosCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComparativosFlujosCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComparativosFlujosCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComparativosFlujosCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComparativosFlujosCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComparativosFlujosCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionNuevoComparativosFlujosCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComparativosFlujosCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionNuevoComparativosFlujosCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComparativosFlujosCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComparativosFlujosCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComparativosFlujosCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComparativosFlujosCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComparativosFlujosCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComparativosFlujosCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComparativosFlujosCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComparativosFlujosCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComparativosFlujosCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComparativosFlujosCaja() throws Exception {
		try	{
			if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComparativosFlujosCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComparativosFlujosCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComparativosFlujosCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComparativosFlujosCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComparativosFlujosCaja.addItem(reporte);
			}
			
			
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComparativosFlujosCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComparativosFlujosCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComparativosFlujosCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComparativosFlujosCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComparativosFlujosCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComparativosFlujosCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComparativosFlujosCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComparativosFlujosCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComparativosFlujosCajaConstantesFunciones.getTiposSeleccionarComparativosFlujosCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComparativosFlujosCajaConstantesFunciones.getTiposSeleccionarComparativosFlujosCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComparativosFlujosCajaConstantesFunciones.getTiposSeleccionarComparativosFlujosCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComparativosFlujosCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.getSelectedItem()!=null){this.id_ejercicioBusquedaComparativosFlujosCaja=((Ejercicio)this.jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComparativosFlujosCaja(Boolean esInicializar) throws Exception {				
		if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComparativosFlujosCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComparativosFlujosCaja() throws Exception {
		this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComparativosFlujosCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComparativosFlujosCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComparativosFlujosCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comparativosflujoscajaLogic.getComparativosFlujosCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comparativosflujoscajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComparativosFlujosCaja.setModel(new ComparativosFlujosCajaModel(this.comparativosflujoscajaLogic.getComparativosFlujosCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComparativosFlujosCaja.setModel(new ComparativosFlujosCajaModel(this.comparativosflujoscajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComparativosFlujosCaja!=null && this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComparativosFlujosCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,comparativosflujoscajaConstantesFunciones.resaltarSeleccionarComparativosFlujosCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,comparativosflujoscajaConstantesFunciones.resaltarSeleccionarComparativosFlujosCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_ID));

		if(this.comparativosflujoscajaConstantesFunciones.mostraridComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comparativosflujoscajaConstantesFunciones.resaltaridComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activaridComparativosFlujosCaja,iSizeTabla,this,true,"idComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltaridComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activaridComparativosFlujosCaja,this,true,"idComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD));

		if(this.comparativosflujoscajaConstantesFunciones.mostrarnombre_centro_actividadComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarnombre_centro_actividadComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarnombre_centro_actividadComparativosFlujosCaja,iSizeTabla,this,true,"nombre_centro_actividadComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarnombre_centro_actividadComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarnombre_centro_actividadComparativosFlujosCaja,this,true,"nombre_centro_actividadComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.comparativosflujoscajaConstantesFunciones.mostrartipo_movimientoComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comparativosflujoscajaConstantesFunciones.resaltartipo_movimientoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activartipo_movimientoComparativosFlujosCaja,iSizeTabla,this,true,"tipo_movimientoComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltartipo_movimientoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activartipo_movimientoComparativosFlujosCaja,this,true,"tipo_movimientoComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL));

		if(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_actualComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_actualComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_actualComparativosFlujosCaja,iSizeTabla,this,true,"saldo_actualComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_actualComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_actualComparativosFlujosCaja,this,true,"saldo_actualComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO));

		if(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_acumuladoComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_acumuladoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_acumuladoComparativosFlujosCaja,iSizeTabla,this,true,"saldo_acumuladoComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_acumuladoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_acumuladoComparativosFlujosCaja,this,true,"saldo_acumuladoComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL));

		if(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_actualComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_actualComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_actualComparativosFlujosCaja,iSizeTabla,this,true,"saldo_pres_actualComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_actualComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_actualComparativosFlujosCaja,this,true,"saldo_pres_actualComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO));

		if(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_acumuladoComparativosFlujosCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_acumuladoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_acumuladoComparativosFlujosCaja,iSizeTabla,this,true,"saldo_pres_acumuladoComparativosFlujosCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_acumuladoComparativosFlujosCaja,this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_acumuladoComparativosFlujosCaja,this,true,"saldo_pres_acumuladoComparativosFlujosCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComparativosFlujosCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComparativosFlujosCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComparativosFlujosCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComparativosFlujosCaja.addColumn(tableColumn);
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
			
			this.jTableDatosComparativosFlujosCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComparativosFlujosCaja.moveColumn(this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComparativosFlujosCaja.moveColumn(this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComparativosFlujosCaja.moveColumn(this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComparativosFlujosCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComparativosFlujosCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComparativosFlujosCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComparativosFlujosCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComparativosFlujosCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComparativosFlujosCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comparativosflujoscajaLogic.getComparativosFlujosCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comparativosflujoscajas.size()-1;
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
		//this.jTableDatosComparativosFlujosCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComparativosFlujosCaja();
			
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
				
				//this.isEsNuevoComparativosFlujosCaja=false;
					
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
				if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComparativosFlujosCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComparativosFlujosCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comparativosflujoscaja.getsType().equals("DUPLICADO")
				   || this.comparativosflujoscaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComparativosFlujosCaja=true;
				
				} else {
					this.isEsNuevoComparativosFlujosCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					if(this.comparativosflujoscaja.getId()>=0 && !this.comparativosflujoscaja.getIsNew()) {						
						this.isEsNuevoComparativosFlujosCaja=false;
						
					} else {
						this.isEsNuevoComparativosFlujosCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComparativosFlujosCaja(esRelaciones);						
				
				this.seleccionarComparativosFlujosCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comparativosflujoscaja.getId()<0) {
					this.isEsNuevoComparativosFlujosCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComparativosFlujosCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComparativosFlujosCaja(evt,rowIndex);
				}	
				
				if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComparativosFlujosCaja: " + this.dDif); 
					}
				}								
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComparativosFlujosCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comparativosflujoscaja)) {
					if(this.comparativosflujoscaja.getId()>0) {
						this.comparativosflujoscaja.setIsDeleted(true);
						
						this.comparativosflujoscajasEliminados.add(this.comparativosflujoscaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comparativosflujoscajaLogic.getComparativosFlujosCajas().remove(this.comparativosflujoscaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscajas.remove(this.comparativosflujoscaja);				
					}
					
					
					((ComparativosFlujosCajaModel) this.jTableDatosComparativosFlujosCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComparativosFlujosCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComparativosFlujosCaja) {
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComparativosFlujosCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComparativosFlujosCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscaja);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComparativosFlujosCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComparativosFlujosCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComparativosFlujosCaja(comparativosflujoscaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComparativosFlujosCaja(comparativosflujoscaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComparativosFlujosCaja(comparativosflujoscaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComparativosFlujosCaja(comparativosflujoscaja);
	}
	
	public void setVariablesObjetoActualToFormularioComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setText(comparativosflujoscaja.getId().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setText(comparativosflujoscaja.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setText(comparativosflujoscaja.gettipo_movimiento());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_acumulado().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_pres_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_pres_acumulado().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComparativosFlujosCaja comparativosflujoscajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comparativosflujoscajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComparativosFlujosCaja comparativosflujoscajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comparativosflujoscajaLocal=this.comparativosflujoscaja;
			} else {
				comparativosflujoscajaLocal=this.comparativosflujoscajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comparativosflujoscajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComparativosFlujosCaja(comparativosflujoscajaLocal,true);
					
					if(comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comparativosflujoscajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comparativosflujoscajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(comparativosflujoscaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(comparativosflujoscaja);
	}
	
	public void setVariablesFormularioToObjetoActualComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(comparativosflujoscaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.getText()==null || this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.getText()=="" || this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setText("0");
			}

			if(conColumnasBase) {comparativosflujoscaja.setId(Long.parseLong(this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelIdComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.setnombre_centro_actividad(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelnombre_centro_actividadComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.settipo_movimiento(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabeltipo_movimientoComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.setsaldo_actual(Double.parseDouble(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_actualComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.setsaldo_acumulado(Double.parseDouble(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_acumuladoComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.setsaldo_pres_actual(Double.parseDouble(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_actualComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comparativosflujoscaja.setsaldo_pres_acumulado(Double.parseDouble(this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelsaldo_pres_acumuladoComparativosFlujosCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscajaBean,ComparativosFlujosCaja comparativosflujoscaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscajaOrigen,ComparativosFlujosCaja comparativosflujoscaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getId()!=null && !comparativosflujoscajaOrigen.getId().equals(0L))) {comparativosflujoscaja.setId(comparativosflujoscajaOrigen.getId());}}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getnombre_centro_actividad()!=null && !comparativosflujoscajaOrigen.getnombre_centro_actividad().equals(""))) {comparativosflujoscaja.setnombre_centro_actividad(comparativosflujoscajaOrigen.getnombre_centro_actividad());}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.gettipo_movimiento()!=null && !comparativosflujoscajaOrigen.gettipo_movimiento().equals(""))) {comparativosflujoscaja.settipo_movimiento(comparativosflujoscajaOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getsaldo_actual()!=null && !comparativosflujoscajaOrigen.getsaldo_actual().equals(0.0))) {comparativosflujoscaja.setsaldo_actual(comparativosflujoscajaOrigen.getsaldo_actual());}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getsaldo_acumulado()!=null && !comparativosflujoscajaOrigen.getsaldo_acumulado().equals(0.0))) {comparativosflujoscaja.setsaldo_acumulado(comparativosflujoscajaOrigen.getsaldo_acumulado());}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getsaldo_pres_actual()!=null && !comparativosflujoscajaOrigen.getsaldo_pres_actual().equals(0.0))) {comparativosflujoscaja.setsaldo_pres_actual(comparativosflujoscajaOrigen.getsaldo_pres_actual());}
			if(conDefault || (!conDefault && comparativosflujoscajaOrigen.getsaldo_pres_acumulado()!=null && !comparativosflujoscajaOrigen.getsaldo_pres_acumulado().equals(0.0))) {comparativosflujoscaja.setsaldo_pres_acumulado(comparativosflujoscajaOrigen.getsaldo_pres_acumulado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setText(comparativosflujoscaja.getId().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setText(comparativosflujoscaja.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setText(comparativosflujoscaja.gettipo_movimiento());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_acumulado().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_pres_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setText(comparativosflujoscaja.getsaldo_pres_acumulado().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComparativosFlujosCaja(ComparativosFlujosCajaBean comparativosflujoscajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setText(comparativosflujoscajaBean.getId().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setText(comparativosflujoscajaBean.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setText(comparativosflujoscajaBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setText(comparativosflujoscajaBean.getsaldo_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setText(comparativosflujoscajaBean.getsaldo_acumulado().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setText(comparativosflujoscajaBean.getsaldo_pres_actual().toString());
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setText(comparativosflujoscajaBean.getsaldo_pres_acumulado().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComparativosFlujosCaja(ComparativosFlujosCajaParameterReturnGeneral comparativosflujoscajaReturnGeneral,ComparativosFlujosCajaBean comparativosflujoscajaBean,Boolean conDefault) throws Exception { 
		try {
			ComparativosFlujosCaja comparativosflujoscajaLocal=new ComparativosFlujosCaja();
			
			comparativosflujoscajaLocal=comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comparativosflujoscajaLocal.getId()!=null && !comparativosflujoscajaLocal.getId().equals(0L))) {comparativosflujoscajaBean.setId(comparativosflujoscajaLocal.getId());}}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.getnombre_centro_actividad()!=null && !comparativosflujoscajaLocal.getnombre_centro_actividad().equals(""))) {comparativosflujoscajaBean.setnombre_centro_actividad(comparativosflujoscajaLocal.getnombre_centro_actividad());}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.gettipo_movimiento()!=null && !comparativosflujoscajaLocal.gettipo_movimiento().equals(""))) {comparativosflujoscajaBean.settipo_movimiento(comparativosflujoscajaLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.getsaldo_actual()!=null && !comparativosflujoscajaLocal.getsaldo_actual().equals(0.0))) {comparativosflujoscajaBean.setsaldo_actual(comparativosflujoscajaLocal.getsaldo_actual());}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.getsaldo_acumulado()!=null && !comparativosflujoscajaLocal.getsaldo_acumulado().equals(0.0))) {comparativosflujoscajaBean.setsaldo_acumulado(comparativosflujoscajaLocal.getsaldo_acumulado());}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.getsaldo_pres_actual()!=null && !comparativosflujoscajaLocal.getsaldo_pres_actual().equals(0.0))) {comparativosflujoscajaBean.setsaldo_pres_actual(comparativosflujoscajaLocal.getsaldo_pres_actual());}
			if(conDefault || (!conDefault && comparativosflujoscajaLocal.getsaldo_pres_acumulado()!=null && !comparativosflujoscajaLocal.getsaldo_pres_acumulado().equals(0.0))) {comparativosflujoscajaBean.setsaldo_pres_acumulado(comparativosflujoscajaLocal.getsaldo_pres_acumulado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComparativosFlujosCajaGenerico(Long idComparativosFlujosCajaSeleccionado,JComboBox jComboBoxComparativosFlujosCaja,List<ComparativosFlujosCaja> comparativosflujoscajasLocal)throws Exception {
		try {
			ComparativosFlujosCaja  comparativosflujoscajaTemp=null;

			for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasLocal) {
				if(comparativosflujoscajaAux.getId()!=null && comparativosflujoscajaAux.getId().equals(idComparativosFlujosCajaSeleccionado)) {
					comparativosflujoscajaTemp=comparativosflujoscajaAux;
					break;
				}
			}

			jComboBoxComparativosFlujosCaja.setSelectedItem(comparativosflujoscajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComparativosFlujosCajaGenerico(JComboBox jComboBoxComparativosFlujosCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComparativosFlujosCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComparativosFlujosCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComparativosFlujosCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComparativosFlujosCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comparativosflujoscaja=(ComparativosFlujosCaja) comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comparativosflujoscaja =(ComparativosFlujosCaja) comparativosflujoscajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comparativosflujoscaja.getIsNew() && !comparativosflujoscaja.getIsChanged() && !comparativosflujoscaja.getIsDeleted()) {
				sDescripcion=comparativosflujoscaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comparativosflujoscaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!comparativosflujoscaja.getIsNew() && !comparativosflujoscaja.getIsChanged() && !comparativosflujoscaja.getIsDeleted()) {
				sDescripcion=comparativosflujoscaja.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=comparativosflujoscaja.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComparativosFlujosCaja comparativosflujoscajaRow=new ComparativosFlujosCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comparativosflujoscajaRow=(ComparativosFlujosCaja) comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comparativosflujoscajaRow=(ComparativosFlujosCaja) comparativosflujoscajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComparativosFlujosCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));			
			this.jButtonDuplicarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarComparativosFlujosCaja && this.isPermisoDuplicarComparativosFlujosCaja));			
			this.jButtonCopiarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarComparativosFlujosCaja && this.isPermisoCopiarComparativosFlujosCaja));
			this.jButtonVerFormComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormComparativosFlujosCaja && this.isPermisoVerFormComparativosFlujosCaja));
			
			this.jButtonAbrirOrderByComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));			
			
			this.jButtonNuevoRelacionesComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));			
			this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarComparativosFlujosCaja && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarComparativosFlujosCaja && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarComparativosFlujosCaja && this.isPermisoEliminarComparativosFlujosCaja));
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarComparativosFlujosCaja);							
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));						
			this.jButtonDuplicarToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarComparativosFlujosCaja && this.isPermisoDuplicarComparativosFlujosCaja));						
			this.jButtonCopiarToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarComparativosFlujosCaja && this.isPermisoCopiarComparativosFlujosCaja));			
			this.jButtonVerFormToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormComparativosFlujosCaja && this.isPermisoVerFormComparativosFlujosCaja));			
			this.jButtonAbrirOrderByToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));
			this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));			
			this.jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));			
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarComparativosFlujosCaja && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarComparativosFlujosCaja  && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarComparativosFlujosCaja && this.isPermisoEliminarComparativosFlujosCaja));
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarToolBarComparativosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarComparativosFlujosCaja);				
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));			
			this.jMenuItemDuplicarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaDuplicarComparativosFlujosCaja && this.isPermisoDuplicarComparativosFlujosCaja));			
			this.jMenuItemCopiarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaCopiarComparativosFlujosCaja && this.isPermisoCopiarComparativosFlujosCaja));			
			this.jMenuItemVerFormComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaVerFormComparativosFlujosCaja && this.isPermisoVerFormComparativosFlujosCaja));			
			this.jMenuItemAbrirOrderByComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));			
			//this.jMenuItemMostrarOcultarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));
			this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));			
			//this.jMenuItemDetalleMostrarOcultarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaOrdenComparativosFlujosCaja && this.isPermisoOrdenComparativosFlujosCaja));			
			this.jMenuItemNuevoRelacionesComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja));			
			this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaNuevoComparativosFlujosCaja && this.isPermisoNuevoComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));									
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemModificarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaModificarComparativosFlujosCaja && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemActualizarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaActualizarComparativosFlujosCaja && this.isPermisoActualizarComparativosFlujosCaja));	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemEliminarComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaEliminarComparativosFlujosCaja && this.isPermisoEliminarComparativosFlujosCaja));
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemCancelarComparativosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarComparativosFlujosCaja);				
			}
			
			this.jMenuItemGuardarCambiosComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));						
			this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=this.jButtonNuevoComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaDuplicarComparativosFlujosCaja=this.jButtonDuplicarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCopiarComparativosFlujosCaja=this.jButtonCopiarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaVerFormComparativosFlujosCaja=this.jButtonVerFormComparativosFlujosCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenComparativosFlujosCaja=this.jButtonAbrirOrderByComparativosFlujosCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=this.jButtonNuevoRelacionesComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=this.jButtonModificarComparativosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=this.jButtonGuardarCambiosTablaComparativosFlujosCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=this.jButtonNuevoToolBarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarToolBarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarToolBarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarToolBarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarToolBarComparativosFlujosCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComparativosFlujosCaja=this.jButtonGuardarCambiosToolBarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=this.jMenuItemNuevoComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=this.jMenuItemNuevoRelacionesComparativosFlujosCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemModificarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemActualizarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemEliminarComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemCancelarComparativosFlujosCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComparativosFlujosCaja=this.jMenuItemGuardarCambiosComparativosFlujosCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComparativosFlujosCaja(Boolean esInicializar) {
		if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
				//if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComparativosFlujosCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualComparativosFlujosCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComparativosFlujosCaja() {
		this.jButtonNuevoComparativosFlujosCaja.setVisible(this.isPermisoNuevoComparativosFlujosCaja);			
		this.jButtonDuplicarComparativosFlujosCaja.setVisible(this.isPermisoDuplicarComparativosFlujosCaja);			
		this.jButtonCopiarComparativosFlujosCaja.setVisible(this.isPermisoCopiarComparativosFlujosCaja);			
		this.jButtonVerFormComparativosFlujosCaja.setVisible(this.isPermisoVerFormComparativosFlujosCaja);			
		
		this.jButtonAbrirOrderByComparativosFlujosCaja.setVisible(this.isPermisoOrdenComparativosFlujosCaja);					
		
		this.jButtonNuevoRelacionesComparativosFlujosCaja.setVisible(this.isPermisoNuevoComparativosFlujosCaja);			
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarComparativosFlujosCaja.setVisible(this.isPermisoActualizarComparativosFlujosCaja);	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.setVisible(this.isPermisoActualizarComparativosFlujosCaja);	
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.setVisible(this.isPermisoEliminarComparativosFlujosCaja);
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarComparativosFlujosCaja);						
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.setVisible(this.isPermisoGuardarCambiosComparativosFlujosCaja);							
		}
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setVisible(this.isPermisoActualizarComparativosFlujosCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComparativosFlujosCaja() {
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarComparativosFlujosCaja.setVisible(this.isPermisoActualizarComparativosFlujosCaja);	
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.setVisible(this.isPermisoActualizarComparativosFlujosCaja);	
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.setVisible(this.isPermisoEliminarComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.setVisible(this.isVisibilidadCeldaCancelarComparativosFlujosCaja);							
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.setVisible((this.isVisibilidadCeldaGuardarComparativosFlujosCaja && this.isPermisoGuardarCambiosComparativosFlujosCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComparativosFlujosCaja() {
		if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComparativosFlujosCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComparativosFlujosCaja() {
	}
	
	public void jTableDatosComparativosFlujosCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComparativosFlujosCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comparativosflujoscaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComparativosFlujosCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComparativosFlujosCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComparativosFlujosCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comparativosflujoscajaLogic.getConnexion());

				if(this.comparativosflujoscaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comparativosflujoscaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComparativosFlujosCaja=(TitledBorder)this.jScrollPanelDatosComparativosFlujosCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComparativosFlujosCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comparativosflujoscaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioComparativosFlujosCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebComparativosFlujosCaja(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComparativosFlujosCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComparativosFlujosCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.comparativosflujoscajaLogic.getConnexion());

				if(this.comparativosflujoscaja.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.comparativosflujoscaja.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComparativosFlujosCaja=(TitledBorder)this.jScrollPanelDatosComparativosFlujosCaja.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderComparativosFlujosCaja.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.comparativosflujoscaja.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_centro_actividadComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getnombre_centro_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_centro_actividad like '%"+this.comparativosflujoscaja.getnombre_centro_actividad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.comparativosflujoscaja.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_actualComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getsaldo_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_actual = "+this.comparativosflujoscaja.getsaldo_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_acumuladoComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getsaldo_acumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_acumulado = "+this.comparativosflujoscaja.getsaldo_acumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_pres_actualComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getsaldo_pres_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_pres_actual = "+this.comparativosflujoscaja.getsaldo_pres_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.getcomparativosflujoscaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comparativosflujoscaja==null) {
						this.comparativosflujoscaja = new ComparativosFlujosCaja();
					}

					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);
				}

				if(this.comparativosflujoscaja.getsaldo_pres_acumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_pres_acumulado = "+this.comparativosflujoscaja.getsaldo_pres_acumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComparativosFlujosCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComparativosFlujosCajaComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);

			this.getComparativosFlujosCajasBusquedaComparativosFlujosCaja();

			this.inicializarActualizarBindingComparativosFlujosCaja(false);

			//if(ComparativosFlujosCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);

			this.getComparativosFlujosCajasFK_IdEjercicio();

			this.inicializarActualizarBindingComparativosFlujosCaja(false);

			//if(ComparativosFlujosCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComparativosFlujosCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);

			this.getComparativosFlujosCajasFK_IdEmpresa();

			this.inicializarActualizarBindingComparativosFlujosCaja(false);

			//if(ComparativosFlujosCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comparativosflujoscajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComparativosFlujosCaja() {
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.dispose();
			this.jInternalFrameDetalleFormComparativosFlujosCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
			this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComparativosFlujosCaja.dispose();
			this.jInternalFrameReporteDinamicoComparativosFlujosCaja=null;
		}
		
		if(this.jInternalFrameImportacionComparativosFlujosCaja!=null) {
			this.jInternalFrameImportacionComparativosFlujosCaja.setVisible(false);	    			
			this.jInternalFrameImportacionComparativosFlujosCaja.dispose();
			this.jInternalFrameImportacionComparativosFlujosCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComparativosFlujosCaja();
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComparativosFlujosCaja")) {
				jButtonDuplicarComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComparativosFlujosCaja")) {
				jButtonCopiarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComparativosFlujosCaja")) {
				jButtonVerFormComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComparativosFlujosCaja")) {
				jButtonDuplicarComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComparativosFlujosCaja")) {
				jButtonDuplicarComparativosFlujosCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComparativosFlujosCaja")) {
				jButtonModificarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComparativosFlujosCaja")) {
				jButtonModificarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComparativosFlujosCaja")) {
				jButtonModificarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComparativosFlujosCaja")) {
				jButtonActualizarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComparativosFlujosCaja")) {
				jButtonActualizarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComparativosFlujosCaja")) {
				jButtonActualizarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComparativosFlujosCaja")) {
				jButtonEliminarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComparativosFlujosCaja")) {
				jButtonEliminarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComparativosFlujosCaja")) {
				jButtonEliminarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComparativosFlujosCaja")) {
				jButtonCancelarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComparativosFlujosCaja")) {
				jButtonCancelarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComparativosFlujosCaja")) {
				jButtonCancelarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComparativosFlujosCaja")) {
				jButtonCerrarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComparativosFlujosCaja")) {
				jButtonCerrarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComparativosFlujosCaja")) {
				jButtonCerrarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComparativosFlujosCaja")) {
				jButtonMostrarOcultarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComparativosFlujosCaja")) {
				jButtonCancelarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComparativosFlujosCaja")) {
				jButtonCopiarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComparativosFlujosCaja")) {
				jButtonVerFormComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComparativosFlujosCaja")) {
				jButtonCopiarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComparativosFlujosCaja")) {
				jButtonVerFormComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComparativosFlujosCaja")) {
				jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComparativosFlujosCaja")) {
				jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComparativosFlujosCaja")) {
				jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComparativosFlujosCaja")) {
				jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComparativosFlujosCaja")) {
				jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComparativosFlujosCaja")) {
				jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComparativosFlujosCaja")) {
				jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComparativosFlujosCaja")) {
				jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComparativosFlujosCaja")) {
				jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComparativosFlujosCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByComparativosFlujosCaja")) {
				jButtonAbrirOrderByComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComparativosFlujosCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarComparativosFlujosCaja")) {
				jButtonMostrarOcultarComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComparativosFlujosCaja")) {
				jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComparativosFlujosCaja")) {
				jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComparativosFlujosCaja")) {
				jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComparativosFlujosCaja")) {
				jButtonCerrarReporteDinamicoComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComparativosFlujosCaja")) {
				jButtonGenerarReporteDinamicoComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComparativosFlujosCaja")) {
				
				jButtonGenerarExcelReporteDinamicoComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComparativosFlujosCaja")) {
				jButtonCerrarImportacionComparativosFlujosCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComparativosFlujosCaja")) {
				
				jButtonGenerarImportacionComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComparativosFlujosCaja")) {
				
				jButtonAbrirImportacionComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComparativosFlujosCaja")) {
				jComboBoxTiposAccionesComparativosFlujosCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComparativosFlujosCaja")) {
				jComboBoxTiposRelacionesComparativosFlujosCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComparativosFlujosCaja")) {
				jComboBoxTiposAccionesComparativosFlujosCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComparativosFlujosCaja")) {
				
				jComboBoxTiposSeleccionarComparativosFlujosCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComparativosFlujosCaja")) {
				jTextFieldValorCampoGeneralComparativosFlujosCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComparativosFlujosCaja")) {
				jButtonAbrirOrderByComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComparativosFlujosCaja")) {
				jButtonAbrirOrderByComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComparativosFlujosCaja")) {
				jButtonCerrarOrderByComparativosFlujosCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComparativosFlujosCajaBusqueda")) {
				this.jButtonidComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComparativosFlujosCajaUpdate")) {
				this.jButtonid_empresaComparativosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComparativosFlujosCajaBusqueda")) {
				this.jButtonid_empresaComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComparativosFlujosCajaUpdate")) {
				this.jButtonid_ejercicioComparativosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComparativosFlujosCajaBusqueda")) {
				this.jButtonid_ejercicioComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_centro_actividadComparativosFlujosCajaBusqueda")) {
				this.jButtonnombre_centro_actividadComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoComparativosFlujosCajaBusqueda")) {
				this.jButtontipo_movimientoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_actualComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_actualComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_acumuladoComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_acumuladoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_pres_actualComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_pres_actualComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_pres_acumuladoComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComparativosFlujosCajaComparativosFlujosCaja")) {
				this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCajaActionPerformed(evt);
			}
			
			;
			
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComparativosFlujosCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComparativosFlujosCaja comparativosflujoscajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comparativosflujoscajaLocal=this.comparativosflujoscaja;
			} else {
				comparativosflujoscajaLocal=this.comparativosflujoscajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
							
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
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
			
			


			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
								
						
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
								
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
							
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
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
			
			


			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
								
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComparativosFlujosCaja")) {
					jCheckBoxSeleccionarTodosComparativosFlujosCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComparativosFlujosCaja")) {
					jCheckBoxSeleccionadosComparativosFlujosCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComparativosFlujosCaja")) {
					
				}
				
				


				
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
												
				
				


				
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
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
			
			


			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comparativosflujoscaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comparativosflujoscaja);
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
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
				
				


				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComparativosFlujosCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComparativosFlujosCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComparativosFlujosCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comparativosflujoscajaAnterior =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComparativosFlujosCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComparativosFlujosCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComparativosFlujosCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comparativosflujoscaja =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comparativosflujoscaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComparativosFlujosCaja")) {
				
				}
				
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComparativosFlujosCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComparativosFlujosCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComparativosFlujosCaja")) {
			
			}
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComparativosFlujosCaja();
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			if(sTipo.equals("NuevoComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComparativosFlujosCaja")) {
				jButtonDuplicarComparativosFlujosCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComparativosFlujosCaja")) {
				jButtonCopiarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComparativosFlujosCaja")) {
				jButtonVerFormComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComparativosFlujosCaja")) {
				jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComparativosFlujosCaja")) {
				jButtonModificarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComparativosFlujosCaja")) {
				jButtonActualizarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComparativosFlujosCaja")) {
				jButtonEliminarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComparativosFlujosCaja")) {
				jButtonCancelarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComparativosFlujosCaja")) {
				jButtonCerrarComparativosFlujosCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComparativosFlujosCaja")) {
				jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComparativosFlujosCaja")) {
				jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComparativosFlujosCaja")) {
				jButtonAbrirOrderByComparativosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComparativosFlujosCaja")) {
				jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComparativosFlujosCaja")) {
				jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComparativosFlujosCaja")) {
				jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComparativosFlujosCajaBusqueda")) {
				this.jButtonidComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComparativosFlujosCajaUpdate")) {
				this.jButtonid_empresaComparativosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComparativosFlujosCajaBusqueda")) {
				this.jButtonid_empresaComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComparativosFlujosCajaUpdate")) {
				this.jButtonid_ejercicioComparativosFlujosCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComparativosFlujosCajaBusqueda")) {
				this.jButtonid_ejercicioComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_centro_actividadComparativosFlujosCajaBusqueda")) {
				this.jButtonnombre_centro_actividadComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoComparativosFlujosCajaBusqueda")) {
				this.jButtontipo_movimientoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_actualComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_actualComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_acumuladoComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_acumuladoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_pres_actualComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_pres_actualComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_pres_acumuladoComparativosFlujosCajaBusqueda")) {
				this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusquedaActionPerformed(evt);
			}
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComparativosFlujosCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComparativosFlujosCaja")) {
				closingInternalFrameComparativosFlujosCaja();
				
			} else if(sTipo.equals("jButtonCancelarComparativosFlujosCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormComparativosFlujosCaja = (JInternalFrameBase)evt.getSource();
	            	
	            ComparativosFlujosCajaBeanSwingJInternalFrame jInternalFrameParent=(ComparativosFlujosCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormComparativosFlujosCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComparativosFlujosCajaActionPerformed(null);
			}
			
			ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comparativosflujoscaja,new Object(),this.comparativosflujoscajaParameterGeneral,this.comparativosflujoscajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComparativosFlujosCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComparativosFlujosCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComparativosFlujosCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comparativosflujoscaja)) {
			if(!esControlTabla) {
				if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);			
				}
				
				if(this.comparativosflujoscajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral,this.comparativosflujoscajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comparativosflujoscajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComparativosFlujosCaja(classes,this.comparativosflujoscajaReturnGeneral,this.comparativosflujoscajaBean,false);
					}
						
					if(this.comparativosflujoscajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja());	
					}
						
					if(this.comparativosflujoscajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja(),classes);//this.comparativosflujoscajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComparativosFlujosCaja(this.comparativosflujoscaja,classes);//this.comparativosflujoscajaBean);									
				}
			
				if(ComparativosFlujosCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComparativosFlujosCaja(this.comparativosflujoscaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComparativosFlujosCaja(this.comparativosflujoscaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comparativosflujoscajaAnterior!=null) {
						this.comparativosflujoscaja=this.comparativosflujoscajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comparativosflujoscajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja(),comparativosflujoscajaLogic.getComparativosFlujosCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCaja(),this.comparativosflujoscajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComparativosFlujosCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosComparativosFlujosCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComparativosFlujosCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosComparativosFlujosCaja() throws Exception {
		
		ComparativosFlujosCajaModel comparativosflujoscajaModel=(ComparativosFlujosCajaModel)this.jTableDatosComparativosFlujosCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comparativosflujoscajaModel.comparativosflujoscajas=this.comparativosflujoscajaLogic.getComparativosFlujosCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comparativosflujoscajaModel.comparativosflujoscajas=this.comparativosflujoscajas;
		}
		
		
		((ComparativosFlujosCajaModel) this.jTableDatosComparativosFlujosCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComparativosFlujosCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomparativosflujoscajaAnterior(),this.comparativosflujoscajaLogic.getComparativosFlujosCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomparativosflujoscajaAnterior(),this.comparativosflujoscajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComparativosFlujosCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
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
										
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comparativosflujoscaja,new Object(),generalEntityParameterGeneral,this.comparativosflujoscajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComparativosFlujosCajaConstantesFunciones.getClassesRelationshipsOfComparativosFlujosCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComparativosFlujosCajaConstantesFunciones.getClassesRelationshipsFromStringsOfComparativosFlujosCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComparativosFlujosCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comparativosflujoscaja,new Object(),generalEntityParameterGeneral,this.comparativosflujoscajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComparativosFlujosCaja(ComparativosFlujosCajaBean comparativosflujoscajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComparativosFlujosCaja(ArrayList<Classe> classes,ComparativosFlujosCajaReturnGeneral comparativosflujoscajaReturnGeneral,ComparativosFlujosCajaBean comparativosflujoscajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comparativosflujoscaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja = new ComparativosFlujosCajaDetalleFormJInternalFrame(jDesktopPane,this.comparativosflujoscajaSessionBean.getConGuardarRelaciones(),this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.setVisible(false);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.comparativosflujoscajaLogic=this.comparativosflujoscajaLogic;
		
		this.cargarCombosFrameForeignKeyComparativosFlujosCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComparativosFlujosCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComparativosFlujosCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComparativosFlujosCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComparativosFlujosCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComparativosFlujosCaja"));
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarComparativosFlujosCaja"));

		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarComparativosFlujosCaja"));
					
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemModificarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarComparativosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"ActualizarComparativosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComparativosFlujosCaja"));
						
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemActualizarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComparativosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarComparativosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarComparativosFlujosCaja"));
								
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemEliminarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComparativosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarComparativosFlujosCaja"));
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarComparativosFlujosCaja"));
					
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemCancelarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComparativosFlujosCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemDetalleCerrarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComparativosFlujosCaja"));		
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComparativosFlujosCaja"));
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComparativosFlujosCaja"));
		
		
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComparativosFlujosCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonidComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtontipo_movimientoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_acumuladoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_acumuladoComparativosFlujosCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComparativosFlujosCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComparativosFlujosCaja"));
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComparativosFlujosCaja"));
		}
		
		this.jTableDatosComparativosFlujosCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComparativosFlujosCaja"));
		
		this.jTableDatosComparativosFlujosCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComparativosFlujosCaja"));
		
		this.jButtonNuevoComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoComparativosFlujosCaja"));
		
		this.jButtonDuplicarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"DuplicarComparativosFlujosCaja"));
		
		this.jButtonCopiarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"CopiarComparativosFlujosCaja"));
		
		this.jButtonVerFormComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"VerFormComparativosFlujosCaja"));
		
		
		this.jButtonNuevoToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarComparativosFlujosCaja"));
			
		this.jButtonDuplicarToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComparativosFlujosCaja"));
			
		this.jMenuItemNuevoComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComparativosFlujosCaja"));
			
		this.jMenuItemDuplicarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComparativosFlujosCaja"));		
		
		
		this.jButtonNuevoRelacionesComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComparativosFlujosCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComparativosFlujosCaja"));
			
		this.jMenuItemNuevoRelacionesComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComparativosFlujosCaja"));		
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarComparativosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonModificarToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarComparativosFlujosCaja"));
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemModificarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarComparativosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"ActualizarComparativosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonActualizarToolBarComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComparativosFlujosCaja"));
				
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemActualizarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComparativosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarComparativosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonEliminarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarComparativosFlujosCaja"));
						
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemEliminarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComparativosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarComparativosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonCancelarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarComparativosFlujosCaja"));
			
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemCancelarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComparativosFlujosCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComparativosFlujosCaja"));		
		
		
		this.jButtonCerrarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarComparativosFlujosCaja"));
		
		
		this.jButtonCerrarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarComparativosFlujosCaja"));
			
		this.jMenuItemCerrarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComparativosFlujosCaja"));
			
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jMenuItemDetalleCerrarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComparativosFlujosCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosComparativosFlujosCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComparativosFlujosCaja"));
		}
		
		this.jButtonCopiarToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarComparativosFlujosCaja"));
			
		this.jButtonVerFormToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarComparativosFlujosCaja"));
		
		this.jMenuItemGuardarCambiosComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComparativosFlujosCaja"));
			
		this.jMenuItemCopiarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComparativosFlujosCaja"));		
		
		this.jMenuItemVerFormComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComparativosFlujosCaja"));		
		
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComparativosFlujosCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComparativosFlujosCaja"));
			
		this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComparativosFlujosCaja"));		
		
		
		
		this.jButtonRecargarInformacionComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionComparativosFlujosCaja"));
					
		this.jButtonRecargarInformacionToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComparativosFlujosCaja"));
		
		this.jMenuItemRecargarInformacionComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComparativosFlujosCaja"));		
		
		
		
		this.jButtonAnterioresComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"AnterioresComparativosFlujosCaja"));
		
		
		this.jButtonAnterioresToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComparativosFlujosCaja"));
		
		this.jMenuItemAnterioresComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComparativosFlujosCaja"));		
		
		
		this.jButtonSiguientesComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"SiguientesComparativosFlujosCaja"));
		
		
		this.jButtonSiguientesToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComparativosFlujosCaja"));
			
		this.jMenuItemSiguientesComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComparativosFlujosCaja"));
			
		this.jMenuItemAbrirOrderByComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComparativosFlujosCaja"));
			
		this.jMenuItemMostrarOcultarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComparativosFlujosCaja"));
			
		this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComparativosFlujosCaja"));
			
		this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComparativosFlujosCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComparativosFlujosCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComparativosFlujosCaja"));
			
		this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComparativosFlujosCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComparativosFlujosCaja"));

		this.jCheckBoxSeleccionadosComparativosFlujosCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComparativosFlujosCaja"));
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComparativosFlujosCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesComparativosFlujosCaja"));
			
		this.jComboBoxTiposAccionesComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesComparativosFlujosCaja"));
					
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComparativosFlujosCaja"));
			
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComparativosFlujosCaja"));		
		
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonidComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtontipo_movimientoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_acumuladoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_acumuladoComparativosFlujosCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"BusquedaComparativosFlujosCajaComparativosFlujosCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComparativosFlujosCaja!=null) {
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComparativosFlujosCaja"));
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComparativosFlujosCaja"));
				this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComparativosFlujosCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComparativosFlujosCaja"));				
			//this.jButtonGenerarReporteDinamicoComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComparativosFlujosCaja"));
			//this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComparativosFlujosCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComparativosFlujosCaja!=null) {
				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComparativosFlujosCaja"));
				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComparativosFlujosCaja"));
				this.jInternalFrameImportacionComparativosFlujosCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComparativosFlujosCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByComparativosFlujosCaja"));
			
			this.jButtonAbrirOrderByToolBarComparativosFlujosCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComparativosFlujosCaja"));			
			
			if(this.jInternalFrameOrderByComparativosFlujosCaja!=null) {
				this.jInternalFrameOrderByComparativosFlujosCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComparativosFlujosCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComparativosFlujosCaja.jTabbedPaneRelacionesComparativosFlujosCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComparativosFlujosCaja"));
		
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
            		closingInternalFrameComparativosFlujosCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComparativosFlujosCaja = (JInternalFrameBase)event.getSource();
	            	
	            ComparativosFlujosCajaBeanSwingJInternalFrame jInternalFrameParent=(ComparativosFlujosCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormComparativosFlujosCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComparativosFlujosCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComparativosFlujosCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComparativosFlujosCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComparativosFlujosCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComparativosFlujosCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComparativosFlujosCaja";
		inputMap = this.jButtonNuevoComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComparativosFlujosCaja";
		inputMap = this.jButtonNuevoRelacionesComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComparativosFlujosCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComparativosFlujosCaja";
		inputMap = this.jButtonModificarComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComparativosFlujosCaja";
		inputMap = this.jButtonActualizarComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComparativosFlujosCaja";
		inputMap = this.jButtonEliminarComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComparativosFlujosCaja";
		inputMap = this.jButtonCancelarComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComparativosFlujosCaja";
		inputMap = this.jButtonCerrarComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComparativosFlujosCaja";
		inputMap = this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonGuardarCambiosComparativosFlujosCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComparativosFlujosCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComparativosFlujosCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComparativosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComparativosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComparativosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComparativosFlujosCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonidComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"idComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_empresaComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComparativosFlujosCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonid_ejercicioComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtontipo_movimientoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_acumuladoComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_actualComparativosFlujosCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.addActionListener(new ButtonActionListener(this,"saldo_pres_acumuladoComparativosFlujosCajaBusqueda"));
		
		
		this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja.addActionListener(new ButtonActionListener(this,"BusquedaComparativosFlujosCajaComparativosFlujosCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComparativosFlujosCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComparativosFlujosCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComparativosFlujosCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComparativosFlujosCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComparativosFlujosCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
					comparativosflujoscajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajas) {
					comparativosflujoscajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComparativosFlujosCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
						comparativosflujoscajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajas) {
						comparativosflujoscajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComparativosFlujosCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComparativosFlujosCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComparativosFlujosCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComparativosFlujosCaja.getSelectedRows();
			
			ComparativosFlujosCaja comparativosflujoscajaLocal=new ComparativosFlujosCaja();
			
			//this.seleccionarTodosComparativosFlujosCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comparativosflujoscajaLocal =(ComparativosFlujosCaja) this.comparativosflujoscajaLogic.getComparativosFlujosCajas().toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comparativosflujoscajaLocal =(ComparativosFlujosCaja) this.comparativosflujoscajas.toArray()[this.jTableDatosComparativosFlujosCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comparativosflujoscajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
						comparativosflujoscajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajas) {
						comparativosflujoscajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComparativosFlujosCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComparativosFlujosCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComparativosFlujosCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComparativosFlujosCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComparativosFlujosCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComparativosFlujosCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComparativosFlujosCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
				
						if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
							existe=true;
							comparativosflujoscajaAux.setnombre_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							comparativosflujoscajaAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_pres_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_pres_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajas) {
					
						if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
							existe=true;
							comparativosflujoscajaAux.setnombre_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							comparativosflujoscajaAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_pres_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO)) {
							existe=true;
							comparativosflujoscajaAux.setsaldo_pres_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComparativosFlujosCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComparativosFlujosCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComparativosFlujosCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComparativosFlujosCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessComparativosFlujosCaja(conSplash);
				
					this.generarReporteComparativosFlujosCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComparativosFlujosCajasSeleccionados();
				//this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComparativosFlujosCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComparativosFlujosCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComparativosFlujosCaja();
				
				this.exportarComparativosFlujosCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComparativosFlujosCajas();
				//this.importarComparativosFlujosCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComparativosFlujosCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComparativosFlujosCajasSeleccionados();
				//this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comparativos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComparativosFlujosCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComparativosFlujosCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComparativosFlujosCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(ComparativosFlujosCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComparativosFlujosCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComparativosFlujosCaja(conSplash);
					
						//this.actualizarParametrosGeneralComparativosFlujosCaja();
						
						this.generarReporteProcesoAccionComparativosFlujosCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comparativos Flujos CajaS SELECCIONADOS?", "MANTENIMIENTO DE Comparativos Flujos Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComparativosFlujosCaja();
				
						this.actualizarParametrosGeneralComparativosFlujosCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comparativosflujoscajaReturnGeneral=comparativosflujoscajaLogic.procesarAccionComparativosFlujosCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comparativosflujoscajaLogic.getComparativosFlujosCajas(),this.comparativosflujoscajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComparativosFlujosCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComparativosFlujosCaja();
					
					ComparativosFlujosCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComparativosFlujosCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComparativosFlujosCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComparativosFlujosCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComparativosFlujosCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComparativosFlujosCaja();
			
			if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
			ComparativosFlujosCaja comparativosflujoscaja=new ComparativosFlujosCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComparativosFlujosCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComparativosFlujosCaja.getSelectedItem();
			
			
			
			
			comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comparativosflujoscajasSeleccionados.size()==1) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
					comparativosflujoscaja=comparativosflujoscajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComparativosFlujosCaja();
			
      		//this.finishProcessComparativosFlujosCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComparativosFlujosCajaReturnGeneral() throws Exception {
		if(this.comparativosflujoscajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comparativosflujoscajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comparativosflujoscajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comparativosflujoscajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comparativosflujoscajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comparativosflujoscajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
		}
		
		if(this.comparativosflujoscajaReturnGeneral.getConRetornoLista() || this.comparativosflujoscajaReturnGeneral.getConRetornoObjeto()) {
			if(this.comparativosflujoscajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comparativosflujoscajaLogic.setComparativosFlujosCajas(this.comparativosflujoscajaReturnGeneral.getComparativosFlujosCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComparativosFlujosCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralComparativosFlujosCaja() throws Exception {
		
		
	}
	
	public ArrayList<ComparativosFlujosCaja> getComparativosFlujosCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComparativosFlujosCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajaLogic.getComparativosFlujosCajas()) {
					if(comparativosflujoscajaAux.getIsSelected()) {
						comparativosflujoscajasSeleccionados.add(comparativosflujoscajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComparativosFlujosCaja comparativosflujoscajaAux:this.comparativosflujoscajas) {
					if(comparativosflujoscajaAux.getIsSelected()) {
						comparativosflujoscajasSeleccionados.add(comparativosflujoscajaAux);				
					}
				}
			}
			
			if(comparativosflujoscajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comparativosflujoscajasSeleccionados.addAll(this.comparativosflujoscajaLogic.getComparativosFlujosCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comparativosflujoscajasSeleccionados.addAll(this.comparativosflujoscajas);				
					}
				}
			}
		} else {
			comparativosflujoscajasSeleccionados.add(this.comparativosflujoscaja);
		}
		
		return comparativosflujoscajasSeleccionados;
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
	
	public void generarReporteComparativosFlujosCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComparativosFlujosCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComparativosFlujosCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComparativosFlujosCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComparativosFlujosCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comparativos Flujos Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados);
		
	}	
	
	public void generarReporteNormalComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComparativosFlujosCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComparativosFlujosCaja();
		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComparativosFlujosCaja();
		
		
		//this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados ,comparativosflujoscajaImplementable,comparativosflujoscajaImplementableHome);
	}
	
	public void mostrarImportacionComparativosFlujosCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComparativosFlujosCaja();
		
		this.abrirFrameImportacionComparativosFlujosCaja();		
		
			
		//this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados ,comparativosflujoscajaImplementable,comparativosflujoscajaImplementableHome);
	}
	
	public void importarComparativosFlujosCajas() throws Exception {		
	
	}
	
	public void exportarComparativosFlujosCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComparativosFlujosCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComparativosFlujosCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComparativosFlujosCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comparativos Flujos Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComparativosFlujosCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComparativosFlujosCaja(comparativosflujoscajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comparativosflujoscajaAux.setsDetalleGeneralEntityReporte(comparativosflujoscajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComparativosFlujosCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comparativosflujoscaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getnombre_centro_actividad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getsaldo_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getsaldo_acumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getsaldo_pres_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comparativosflujoscaja.getsaldo_pres_acumulado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComparativosFlujosCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComparativosFlujosCaja(row);				
				iRow++;
			}				
			
			for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComparativosFlujosCaja(comparativosflujoscajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComparativosFlujosCajasSeleccionados() throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();		
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comparativosflujoscaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comparativosflujoscajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comparativosflujoscaja");
			//elementRoot.appendChild(element);
		
			for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
				element = document.createElement("comparativosflujoscaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComparativosFlujosCaja(comparativosflujoscajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comparativos Flujos Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComparativosFlujosCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getnombre_centro_actividad());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getsaldo_actual());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getsaldo_acumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getsaldo_pres_actual());
		cell = row.createCell(iColumn++);cell.setCellValue(comparativosflujoscaja.getsaldo_pres_acumulado());				
	}
	
	public void setFilaDatosExportarXmlComparativosFlujosCaja(ComparativosFlujosCaja comparativosflujoscaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComparativosFlujosCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comparativosflujoscaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComparativosFlujosCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comparativosflujoscaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComparativosFlujosCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comparativosflujoscaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(ComparativosFlujosCajaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(comparativosflujoscaja.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementnombre_centro_actividad = document.createElement(ComparativosFlujosCajaConstantesFunciones.NOMBRECENTROACTIVIDAD);
		elementnombre_centro_actividad.appendChild(document.createTextNode(comparativosflujoscaja.getnombre_centro_actividad().trim()));
		element.appendChild(elementnombre_centro_actividad);

		Element elementtipo_movimiento = document.createElement(ComparativosFlujosCajaConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(comparativosflujoscaja.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementsaldo_actual = document.createElement(ComparativosFlujosCajaConstantesFunciones.SALDOACTUAL);
		elementsaldo_actual.appendChild(document.createTextNode(comparativosflujoscaja.getsaldo_actual().toString().trim()));
		element.appendChild(elementsaldo_actual);

		Element elementsaldo_acumulado = document.createElement(ComparativosFlujosCajaConstantesFunciones.SALDOACUMULADO);
		elementsaldo_acumulado.appendChild(document.createTextNode(comparativosflujoscaja.getsaldo_acumulado().toString().trim()));
		element.appendChild(elementsaldo_acumulado);

		Element elementsaldo_pres_actual = document.createElement(ComparativosFlujosCajaConstantesFunciones.SALDOPRESACTUAL);
		elementsaldo_pres_actual.appendChild(document.createTextNode(comparativosflujoscaja.getsaldo_pres_actual().toString().trim()));
		element.appendChild(elementsaldo_pres_actual);

		Element elementsaldo_pres_acumulado = document.createElement(ComparativosFlujosCajaConstantesFunciones.SALDOPRESACUMULADO);
		elementsaldo_pres_acumulado.appendChild(document.createTextNode(comparativosflujoscaja.getsaldo_pres_acumulado().toString().trim()));
		element.appendChild(elementsaldo_pres_acumulado);
	}
	
	public void generarReporteGroupGenericoComparativosFlujosCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados=new ArrayList<ComparativosFlujosCaja>();
		
		comparativosflujoscajasSeleccionados=this.getComparativosFlujosCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComparativosFlujosCaja(comparativosflujoscajasSeleccionados);
		
		this.generarReporteComparativosFlujosCajas("Todos",comparativosflujoscajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComparativosFlujosCaja(ArrayList<ComparativosFlujosCaja> comparativosflujoscajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComparativosFlujosCaja comparativosflujoscajaAux:comparativosflujoscajasSeleccionados) {
				comparativosflujoscajaAux.setsDetalleGeneralEntityReporte(comparativosflujoscajaAux.toString());
			
				if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comparativosflujoscajaAux.setsDescripcionGeneralEntityReporte1(comparativosflujoscajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					comparativosflujoscajaAux.setsDescripcionGeneralEntityReporte1(comparativosflujoscajaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
					existe=true;
					comparativosflujoscajaAux.setsDescripcionGeneralEntityReporte1(comparativosflujoscajaAux.getnombre_centro_actividad());
				}
				 else if(sTipoSeleccionar.equals(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					comparativosflujoscajaAux.setsDescripcionGeneralEntityReporte1(comparativosflujoscajaAux.gettipo_movimiento());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComparativosFlujosCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComparativosFlujosCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComparativosFlujosCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=true;
				this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=true;
			}
			
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=true;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=true;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
			this.isVisibilidadCeldaModificarComparativosFlujosCaja=true;
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaCancelarComparativosFlujosCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=true;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=true;
		} else {
			this.actualizarEstadoPanelsComparativosFlujosCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComparativosFlujosCaja=false;
			//this.isVisibilidadCeldaVerFormComparativosFlujosCaja=false;
			this.isVisibilidadCeldaDuplicarComparativosFlujosCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
			this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(!comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;												
			}
			
			this.jButtonCerrarComparativosFlujosCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.comparativosflujoscaja)) {
			this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
			this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComparativosFlujosCaja=false;
		this.isVisibilidadCeldaNuevoRelacionesComparativosFlujosCaja=false;
		this.isVisibilidadCeldaGuardarCambiosComparativosFlujosCaja=false;
		//this.isVisibilidadCeldaModificarComparativosFlujosCaja=true;
		this.isVisibilidadCeldaActualizarComparativosFlujosCaja=false;
		this.isVisibilidadCeldaEliminarComparativosFlujosCaja=false;
		//this.isVisibilidadCeldaCancelarComparativosFlujosCaja=true;			
		this.isVisibilidadCeldaGuardarComparativosFlujosCaja=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComparativosFlujosCaja() {
	}
	
	public void actualizarEstadoPanelsComparativosFlujosCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosEdicionComparativosFlujosCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComparativosFlujosCaja!=null) {
				this.jScrollPanelDatosComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionComparativosFlujosCaja!=null) {
				this.jPanelPaginacionComparativosFlujosCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
					this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComparativosFlujosCaja!=null) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComparativosFlujosCaja!=null) {
				this.jPanelParametrosReportesComparativosFlujosCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComparativosFlujosCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComparativosFlujosCaja) {this.jTabbedPaneBusquedasComparativosFlujosCaja.remove(jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaComparativosFlujosCaja=isParaEjercicio;
			if(!this.isVisibilidadBusquedaComparativosFlujosCaja) {this.jTabbedPaneBusquedasComparativosFlujosCaja.remove(jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);}
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
			
			this.inicializarActualizarBindingTablaComparativosFlujosCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComparativosFlujosCaja() {
		this.updateBorderResaltarBusquedasFormularioComparativosFlujosCaja();
		this.updateVisibilidadBusquedasFormularioComparativosFlujosCaja();
		this.updateHabilitarBusquedasFormularioComparativosFlujosCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioComparativosFlujosCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponents().length>0) {
	

		if(this.comparativosflujoscajaConstantesFunciones.resaltarBusquedaComparativosFlujosCajaComparativosFlujosCaja!=null) {
			index= this.jTabbedPaneBusquedasComparativosFlujosCaja.indexOfComponent(this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponent(index);
				jPanel.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComparativosFlujosCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComparativosFlujosCaja.indexOfComponent(this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			if(!this.comparativosflujoscajaConstantesFunciones.mostrarBusquedaComparativosFlujosCajaComparativosFlujosCaja && index>-1) {
				this.jTabbedPaneBusquedasComparativosFlujosCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComparativosFlujosCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComparativosFlujosCaja.indexOfComponent(this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarBusquedaComparativosFlujosCajaComparativosFlujosCaja);
				this.jTabbedPaneBusquedasComparativosFlujosCaja.setEnabledAt(index,this.comparativosflujoscajaConstantesFunciones.activarBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComparativosFlujosCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComparativosFlujosCaja")) {
			index= this.jTabbedPaneBusquedasComparativosFlujosCaja.indexOfComponent(this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);

			this.jTabbedPaneBusquedasComparativosFlujosCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComparativosFlujosCaja.getComponent(index);

			this.comparativosflujoscajaConstantesFunciones.setResaltarBusquedaComparativosFlujosCajaComparativosFlujosCaja(resaltar);

			jPanel.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarBusquedaComparativosFlujosCajaComparativosFlujosCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComparativosFlujosCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComparativosFlujosCaja() throws Exception {

		if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComparativosFlujosCaja();
		this.updateVisibilidadResaltarControlesFormularioComparativosFlujosCaja();
		this.updateHabilitarResaltarControlesFormularioComparativosFlujosCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioComparativosFlujosCaja() throws Exception {
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comparativosflujoscajaConstantesFunciones.resaltaridComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltaridComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarid_empresaComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarid_empresaComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarid_ejercicioComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarid_ejercicioComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarnombre_centro_actividadComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarnombre_centro_actividadComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltartipo_movimientoComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltartipo_movimientoComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_actualComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_actualComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_acumuladoComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_acumuladoComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_actualComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_actualComparativosFlujosCaja);}
		if(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_acumuladoComparativosFlujosCaja!=null && this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setBorder(this.comparativosflujoscajaConstantesFunciones.resaltarsaldo_pres_acumuladoComparativosFlujosCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComparativosFlujosCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
	
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostraridComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelidComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostraridComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarid_empresaComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelid_empresaComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarid_empresaComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarid_ejercicioComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelid_ejercicioComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarid_ejercicioComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarnombre_centro_actividadComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelnombre_centro_actividadComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarnombre_centro_actividadComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrartipo_movimientoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPaneltipo_movimientoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrartipo_movimientoComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelsaldo_actualComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_actualComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_acumuladoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelsaldo_acumuladoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_acumuladoComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelsaldo_pres_actualComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_actualComparativosFlujosCaja);
		//this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_acumuladoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.setVisible(this.comparativosflujoscajaConstantesFunciones.mostrarsaldo_pres_acumuladoComparativosFlujosCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComparativosFlujosCaja() throws Exception {
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComparativosFlujosCaja!=null) {
	
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jLabelidComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activaridComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_empresaComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarid_empresaComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jComboBoxid_ejercicioComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarid_ejercicioComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreanombre_centro_actividadComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarnombre_centro_actividadComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextAreatipo_movimientoComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activartipo_movimientoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_actualComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarsaldo_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_acumuladoComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarsaldo_acumuladoComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_actualComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_actualComparativosFlujosCaja);
		this.jInternalFrameDetalleFormComparativosFlujosCaja.jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setEnabled(this.comparativosflujoscajaConstantesFunciones.activarsaldo_pres_acumuladoComparativosFlujosCaja);
		}
	}
	
		
}