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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.seguridad.util.ProcesoCambiarParametroGeneralConstantesFunciones;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarParametroGeneralParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.report.ProcesoCambiarParametroGeneralParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.report.ProcesoCambiarParametroGeneralBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.seguridad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.seguridad.util.*;

import com.bydan.erp.seguridad.util.report.*;
import com.bydan.erp.seguridad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.entity.report.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoCambiarParametroGeneralBeanSwingJInternalFrame extends ProcesoCambiarParametroGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralValidator = new ClassValidator<ProcesoCambiarParametroGeneral>(ProcesoCambiarParametroGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCambiarParametroGeneral procesocambiarparametrogeneral;	
	public ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux;
	public ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCambiarParametroGeneral procesocambiarparametrogeneralTotales;
	public Long idProcesoCambiarParametroGeneralActual;
	public Long iIdNuevoProcesoCambiarParametroGeneral=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoVisual="";

	public List<TipoVisual> tipovisualsForeignKey;

	public List<TipoVisual> gettipovisualsForeignKey() {
		return tipovisualsForeignKey;
	}

	public void settipovisualsForeignKey(List<TipoVisual> tipovisualsForeignKey) {
		this.tipovisualsForeignKey = tipovisualsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoVisual tipovisualForeignKey;

	public TipoVisual gettipovisualForeignKey() {
		return tipovisualForeignKey;
	}

	public void settipovisualForeignKey(TipoVisual tipovisualForeignKey) {
		this.tipovisualForeignKey = tipovisualForeignKey;
	}

	public String sFinalQueryComboTipoFondo="";

	public List<TipoFondo> tipofondosForeignKey;

	public List<TipoFondo> gettipofondosForeignKey() {
		return tipofondosForeignKey;
	}

	public void settipofondosForeignKey(List<TipoFondo> tipofondosForeignKey) {
		this.tipofondosForeignKey = tipofondosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFondo tipofondoForeignKey;

	public TipoFondo gettipofondoForeignKey() {
		return tipofondoForeignKey;
	}

	public void settipofondoForeignKey(TipoFondo tipofondoForeignKey) {
		this.tipofondoForeignKey = tipofondoForeignKey;
	}

	public String sFinalQueryComboTipoFondoBorde="";

	public List<TipoFondo> tipofondobordesForeignKey;

	public List<TipoFondo> gettipofondobordesForeignKey() {
		return tipofondobordesForeignKey;
	}

	public void settipofondobordesForeignKey(List<TipoFondo> tipofondobordesForeignKey) {
		this.tipofondobordesForeignKey = tipofondobordesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFondo tipofondobordeForeignKey;

	public TipoFondo gettipofondobordeForeignKey() {
		return tipofondobordeForeignKey;
	}

	public void settipofondobordeForeignKey(TipoFondo tipofondobordeForeignKey) {
		this.tipofondobordeForeignKey = tipofondobordeForeignKey;
	}

	public String sFinalQueryComboTipoFondoControl="";

	public List<TipoFondoControl> tipofondocontrolsForeignKey;

	public List<TipoFondoControl> gettipofondocontrolsForeignKey() {
		return tipofondocontrolsForeignKey;
	}

	public void settipofondocontrolsForeignKey(List<TipoFondoControl> tipofondocontrolsForeignKey) {
		this.tipofondocontrolsForeignKey = tipofondocontrolsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFondoControl tipofondocontrolForeignKey;

	public TipoFondoControl gettipofondocontrolForeignKey() {
		return tipofondocontrolForeignKey;
	}

	public void settipofondocontrolForeignKey(TipoFondoControl tipofondocontrolForeignKey) {
		this.tipofondocontrolForeignKey = tipofondocontrolForeignKey;
	}

	public String sFinalQueryComboTipoTamanioControl="";

	public List<TipoTamanioControl> tipotamaniocontrolsForeignKey;

	public List<TipoTamanioControl> gettipotamaniocontrolsForeignKey() {
		return tipotamaniocontrolsForeignKey;
	}

	public void settipotamaniocontrolsForeignKey(List<TipoTamanioControl> tipotamaniocontrolsForeignKey) {
		this.tipotamaniocontrolsForeignKey = tipotamaniocontrolsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTamanioControl tipotamaniocontrolForeignKey;

	public TipoTamanioControl gettipotamaniocontrolForeignKey() {
		return tipotamaniocontrolForeignKey;
	}

	public void settipotamaniocontrolForeignKey(TipoTamanioControl tipotamaniocontrolForeignKey) {
		this.tipotamaniocontrolForeignKey = tipotamaniocontrolForeignKey;
	}

	public String sFinalQueryComboTipoExportar="";

	public List<TipoExportar> tipoexportarsForeignKey;

	public List<TipoExportar> gettipoexportarsForeignKey() {
		return tipoexportarsForeignKey;
	}

	public void settipoexportarsForeignKey(List<TipoExportar> tipoexportarsForeignKey) {
		this.tipoexportarsForeignKey = tipoexportarsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoExportar tipoexportarForeignKey;

	public TipoExportar gettipoexportarForeignKey() {
		return tipoexportarForeignKey;
	}

	public void settipoexportarForeignKey(TipoExportar tipoexportarForeignKey) {
		this.tipoexportarForeignKey = tipoexportarForeignKey;
	}

	public String sFinalQueryComboTipoDelimiter="";

	public List<TipoDelimiter> tipodelimitersForeignKey;

	public List<TipoDelimiter> gettipodelimitersForeignKey() {
		return tipodelimitersForeignKey;
	}

	public void settipodelimitersForeignKey(List<TipoDelimiter> tipodelimitersForeignKey) {
		this.tipodelimitersForeignKey = tipodelimitersForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDelimiter tipodelimiterForeignKey;

	public TipoDelimiter gettipodelimiterForeignKey() {
		return tipodelimiterForeignKey;
	}

	public void settipodelimiterForeignKey(TipoDelimiter tipodelimiterForeignKey) {
		this.tipodelimiterForeignKey = tipodelimiterForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCambiarParametroGeneral;
	public Boolean isPermisoNuevoProcesoCambiarParametroGeneral;
	public Boolean isPermisoActualizarProcesoCambiarParametroGeneral;
	public Boolean isPermisoActualizarOriginalProcesoCambiarParametroGeneral;
	public Boolean isPermisoEliminarProcesoCambiarParametroGeneral;
	public Boolean isPermisoGuardarCambiosProcesoCambiarParametroGeneral;
	public Boolean isPermisoConsultaProcesoCambiarParametroGeneral;
	public Boolean isPermisoBusquedaProcesoCambiarParametroGeneral;
	public Boolean isPermisoReporteProcesoCambiarParametroGeneral;
	public Boolean isPermisoPaginacionMedioProcesoCambiarParametroGeneral;
	public Boolean isPermisoPaginacionAltoProcesoCambiarParametroGeneral;
	public Boolean isPermisoPaginacionTodoProcesoCambiarParametroGeneral;
	public Boolean isPermisoCopiarProcesoCambiarParametroGeneral;
	public Boolean isPermisoVerFormProcesoCambiarParametroGeneral;
	public Boolean isPermisoDuplicarProcesoCambiarParametroGeneral;
	public Boolean isPermisoOrdenProcesoCambiarParametroGeneral;
	
	
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
	
	public ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralReturnGeneral;
	public ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCambiarParametroGeneral=false;
	public Boolean esParaAccionDesdeFormularioProcesoCambiarParametroGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCambiarParametroGeneralSessionBeanAdditional procesocambiarparametrogeneralSessionBeanAdditional=null;
	
	public ProcesoCambiarParametroGeneralSessionBeanAdditional getProcesoCambiarParametroGeneralSessionBeanAdditional() {
		return this.procesocambiarparametrogeneralSessionBeanAdditional;
	}
	
	public void setProcesoCambiarParametroGeneralSessionBeanAdditional(ProcesoCambiarParametroGeneralSessionBeanAdditional procesocambiarparametrogeneralSessionBeanAdditional) {
		try {
			this.procesocambiarparametrogeneralSessionBeanAdditional=procesocambiarparametrogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional procesocambiarparametrogeneralBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCambiarParametroGeneralBeanSwingJInternalFrame
	
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional getProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional() {
		return this.procesocambiarparametrogeneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional(ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional procesocambiarparametrogeneralBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocambiarparametrogeneralBeanSwingJInternalFrameAdditional=procesocambiarparametrogeneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCambiarParametroGeneralLogic procesocambiarparametrogeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCambiarParametroGeneral procesocambiarparametrogeneralBean;
	public ProcesoCambiarParametroGeneralConstantesFunciones procesocambiarparametrogeneralConstantesFunciones;
	//public ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralReturnGeneral;
	
	//FK
	
	public TipoVisualLogic tipovisualLogic;
	public TipoFondoLogic tipofondoLogic;
	public TipoFondoLogic tipofondobordeLogic;
	public TipoFondoControlLogic tipofondocontrolLogic;
	public TipoTamanioControlLogic tipotamaniocontrolLogic;
	public TipoExportarLogic tipoexportarLogic;
	public TipoDelimiterLogic tipodelimiterLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals;	
	//public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsEliminados;
	//public List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCambiarParametroGeneral=false;
	public Boolean isVisibilidadFK_IdTipoDelimiter=false;
	public Boolean isVisibilidadFK_IdTipoExportar=false;
	public Boolean isVisibilidadFK_IdTipoFondo=false;
	public Boolean isVisibilidadFK_IdTipoFondoBorde=false;
	public Boolean isVisibilidadFK_IdTipoFondoControl=false;
	public Boolean isVisibilidadFK_IdTipoTamanioControl=false;
	public Boolean isVisibilidadFK_IdTipoVisual=false;
	
	public Long getiIdNuevoProcesoCambiarParametroGeneral() {
		return this.iIdNuevoProcesoCambiarParametroGeneral;
	}

	public void setiIdNuevoProcesoCambiarParametroGeneral(Long iIdNuevoProcesoCambiarParametroGeneral) {
		this.iIdNuevoProcesoCambiarParametroGeneral = iIdNuevoProcesoCambiarParametroGeneral;
	}
	
	public Long getidProcesoCambiarParametroGeneralActual() {
		return this.idProcesoCambiarParametroGeneralActual;
	}

	public void setidProcesoCambiarParametroGeneralActual(Long idProcesoCambiarParametroGeneralActual) {
		this.idProcesoCambiarParametroGeneralActual = idProcesoCambiarParametroGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCambiarParametroGeneral getprocesocambiarparametrogeneral() {
		return this.procesocambiarparametrogeneral;
	}

	public void setprocesocambiarparametrogeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) {
		this.procesocambiarparametrogeneral = procesocambiarparametrogeneral;
	}
	
	public ProcesoCambiarParametroGeneral getprocesocambiarparametrogeneralAux() {
		return this.procesocambiarparametrogeneralAux;
	}

	public void setprocesocambiarparametrogeneralAux(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux) {
		this.procesocambiarparametrogeneralAux = procesocambiarparametrogeneralAux;
	}				
	
	public ProcesoCambiarParametroGeneral getprocesocambiarparametrogeneralAnterior() {
		return this.procesocambiarparametrogeneralAnterior;
	}

	public void setprocesocambiarparametrogeneralAnterior(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAnterior) {
		this.procesocambiarparametrogeneralAnterior = procesocambiarparametrogeneralAnterior;
	}	
	
	public ProcesoCambiarParametroGeneral getprocesocambiarparametrogeneralTotales() {
		return this.procesocambiarparametrogeneralTotales;
	}

	public void setprocesocambiarparametrogeneralTotales(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralTotales) {
		this.procesocambiarparametrogeneralTotales = procesocambiarparametrogeneralTotales;
	}	
	
	public ProcesoCambiarParametroGeneral getprocesocambiarparametrogeneralBean() {
		return this.procesocambiarparametrogeneralBean;
	}

	public void setprocesocambiarparametrogeneralBean(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralBean) {
		this.procesocambiarparametrogeneralBean = procesocambiarparametrogeneralBean;
	}	
	
	public ProcesoCambiarParametroGeneralParameterReturnGeneral getprocesocambiarparametrogeneralReturnGeneral() {
		return this.procesocambiarparametrogeneralReturnGeneral;
	}

	public void setprocesocambiarparametrogeneralReturnGeneral(ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralReturnGeneral) {
		this.procesocambiarparametrogeneralReturnGeneral = procesocambiarparametrogeneralReturnGeneral;
	}	
	
	
	public Long id_tipo_visualBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_visualBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_visualBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_visualBusquedaProcesoCambiarParametroGeneral(Long id_tipo_visualBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_visualBusquedaProcesoCambiarParametroGeneral = id_tipo_visualBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Boolean con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral=false;

	public Boolean getcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral() {
		return this.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral;
	}

	public void setcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral(Boolean con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral) {
		this.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral = con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Boolean con_botones_tool_barBusquedaProcesoCambiarParametroGeneral=false;

	public Boolean getcon_botones_tool_barBusquedaProcesoCambiarParametroGeneral() {
		return this.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral;
	}

	public void setcon_botones_tool_barBusquedaProcesoCambiarParametroGeneral(Boolean con_botones_tool_barBusquedaProcesoCambiarParametroGeneral) {
		this.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral = con_botones_tool_barBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_fondoBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_fondoBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_fondoBusquedaProcesoCambiarParametroGeneral(Long id_tipo_fondoBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral = id_tipo_fondoBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral(Long id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral = id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral(Long id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral = id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral(Long id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral = id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_exportarBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_exportarBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_exportarBusquedaProcesoCambiarParametroGeneral(Long id_tipo_exportarBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral = id_tipo_exportarBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Long id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral=-1L;

	public Long getid_tipo_delimiterBusquedaProcesoCambiarParametroGeneral() {
		return this.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral;
	}

	public void setid_tipo_delimiterBusquedaProcesoCambiarParametroGeneral(Long id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral) {
		this.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral = id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral;
	}

;
	public Boolean con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral=false;

	public Boolean getcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral() {
		return this.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral;
	}

	public void setcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral(Boolean con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral) {
		this.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral = con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral;
	}

;
	public String path_exportarBusquedaProcesoCambiarParametroGeneral="";

	public String getpath_exportarBusquedaProcesoCambiarParametroGeneral() {
		return this.path_exportarBusquedaProcesoCambiarParametroGeneral;
	}

	public void setpath_exportarBusquedaProcesoCambiarParametroGeneral(String path_exportarBusquedaProcesoCambiarParametroGeneral) {
		this.path_exportarBusquedaProcesoCambiarParametroGeneral = path_exportarBusquedaProcesoCambiarParametroGeneral;
	}

	public Long id_tipo_delimiterFK_IdTipoDelimiter=-1L;

	public Long getid_tipo_delimiterFK_IdTipoDelimiter() {
		return this.id_tipo_delimiterFK_IdTipoDelimiter;
	}

	public void setid_tipo_delimiterFK_IdTipoDelimiter(Long id_tipo_delimiterFK_IdTipoDelimiter) {
		this.id_tipo_delimiterFK_IdTipoDelimiter = id_tipo_delimiterFK_IdTipoDelimiter;
	}

	public Long id_tipo_exportarFK_IdTipoExportar=-1L;

	public Long getid_tipo_exportarFK_IdTipoExportar() {
		return this.id_tipo_exportarFK_IdTipoExportar;
	}

	public void setid_tipo_exportarFK_IdTipoExportar(Long id_tipo_exportarFK_IdTipoExportar) {
		this.id_tipo_exportarFK_IdTipoExportar = id_tipo_exportarFK_IdTipoExportar;
	}

	public Long id_tipo_fondoFK_IdTipoFondo=-1L;

	public Long getid_tipo_fondoFK_IdTipoFondo() {
		return this.id_tipo_fondoFK_IdTipoFondo;
	}

	public void setid_tipo_fondoFK_IdTipoFondo(Long id_tipo_fondoFK_IdTipoFondo) {
		this.id_tipo_fondoFK_IdTipoFondo = id_tipo_fondoFK_IdTipoFondo;
	}

	public Long id_tipo_fondo_bordeFK_IdTipoFondoBorde=-1L;

	public Long getid_tipo_fondo_bordeFK_IdTipoFondoBorde() {
		return this.id_tipo_fondo_bordeFK_IdTipoFondoBorde;
	}

	public void setid_tipo_fondo_bordeFK_IdTipoFondoBorde(Long id_tipo_fondo_bordeFK_IdTipoFondoBorde) {
		this.id_tipo_fondo_bordeFK_IdTipoFondoBorde = id_tipo_fondo_bordeFK_IdTipoFondoBorde;
	}

	public Long id_tipo_fondo_controlFK_IdTipoFondoControl=-1L;

	public Long getid_tipo_fondo_controlFK_IdTipoFondoControl() {
		return this.id_tipo_fondo_controlFK_IdTipoFondoControl;
	}

	public void setid_tipo_fondo_controlFK_IdTipoFondoControl(Long id_tipo_fondo_controlFK_IdTipoFondoControl) {
		this.id_tipo_fondo_controlFK_IdTipoFondoControl = id_tipo_fondo_controlFK_IdTipoFondoControl;
	}

	public Long id_tipo_tamanio_controlFK_IdTipoTamanioControl=-1L;

	public Long getid_tipo_tamanio_controlFK_IdTipoTamanioControl() {
		return this.id_tipo_tamanio_controlFK_IdTipoTamanioControl;
	}

	public void setid_tipo_tamanio_controlFK_IdTipoTamanioControl(Long id_tipo_tamanio_controlFK_IdTipoTamanioControl) {
		this.id_tipo_tamanio_controlFK_IdTipoTamanioControl = id_tipo_tamanio_controlFK_IdTipoTamanioControl;
	}

	public Long id_tipo_visualFK_IdTipoVisual=-1L;

	public Long getid_tipo_visualFK_IdTipoVisual() {
		return this.id_tipo_visualFK_IdTipoVisual;
	}

	public void setid_tipo_visualFK_IdTipoVisual(Long id_tipo_visualFK_IdTipoVisual) {
		this.id_tipo_visualFK_IdTipoVisual = id_tipo_visualFK_IdTipoVisual;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCambiarParametroGeneralLogic getProcesoCambiarParametroGeneralLogic()	{		
		return procesocambiarparametrogeneralLogic;
	}

	public void setProcesoCambiarParametroGeneralLogic(ProcesoCambiarParametroGeneralLogic procesocambiarparametrogeneralLogic) {
		this.procesocambiarparametrogeneralLogic = procesocambiarparametrogeneralLogic;
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
	
	public Boolean getIsEsNuevoProcesoCambiarParametroGeneral() {
		return isEsNuevoProcesoCambiarParametroGeneral;
	}

	public void setIsEsNuevoProcesoCambiarParametroGeneral(Boolean isEsNuevoProcesoCambiarParametroGeneral) {
		this.isEsNuevoProcesoCambiarParametroGeneral = isEsNuevoProcesoCambiarParametroGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCambiarParametroGeneral() {
		return esParaAccionDesdeFormularioProcesoCambiarParametroGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCambiarParametroGeneral(Boolean esParaAccionDesdeFormularioProcesoCambiarParametroGeneral) {
		this.esParaAccionDesdeFormularioProcesoCambiarParametroGeneral = esParaAccionDesdeFormularioProcesoCambiarParametroGeneral;
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
	
	
	public void cargarCombosTipoVisualsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovisualsForeignKey=new ArrayList<TipoVisual>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoVisualLogic tipovisualLogic=new TipoVisualLogic();

			tipovisualLogic.getTipoVisualDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoVisual()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovisualLogic.getTipoVisualDataAccess().setIsForForeingKeyData(true);

					tipovisualLogic.getTodosTipoVisualsWithConnection(sFinalQuery,new Pagination());

					this.tipovisualsForeignKey=tipovisualLogic.getTipoVisuals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoVisual(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovisualLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoVisualActual());
					this.tipovisualsForeignKey.add(tipovisualLogic.getTipoVisual());
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

	public void cargarCombosTipoFondosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipofondosForeignKey=new ArrayList<TipoFondo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFondoLogic tipofondoLogic=new TipoFondoLogic();

			tipofondoLogic.getTipoFondoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondoLogic.getTipoFondoDataAccess().setIsForForeingKeyData(true);

					tipofondoLogic.getTodosTipoFondosWithConnection(sFinalQuery,new Pagination());

					this.tipofondosForeignKey=tipofondoLogic.getTipoFondos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFondo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondoLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoFondoActual());
					this.tipofondosForeignKey.add(tipofondoLogic.getTipoFondo());
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

	public void cargarCombosTipoFondoBordesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipofondobordesForeignKey=new ArrayList<TipoFondo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFondoLogic tipofondoLogic=new TipoFondoLogic();

			tipofondoLogic.getTipoFondoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondoBorde()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondobordeLogic.getTipoFondoDataAccess().setIsForForeingKeyData(true);

					tipofondoLogic.getTodosTipoFondosWithConnection(sFinalQuery,new Pagination());

					this.tipofondobordesForeignKey=tipofondoLogic.getTipoFondos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFondoBorde(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondoLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoFondoBordeActual());
					this.tipofondobordesForeignKey.add(tipofondoLogic.getTipoFondo());
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

	public void cargarCombosTipoFondoControlsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipofondocontrolsForeignKey=new ArrayList<TipoFondoControl>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFondoControlLogic tipofondocontrolLogic=new TipoFondoControlLogic();

			tipofondocontrolLogic.getTipoFondoControlDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondoControl()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondocontrolLogic.getTipoFondoControlDataAccess().setIsForForeingKeyData(true);

					tipofondocontrolLogic.getTodosTipoFondoControlsWithConnection(sFinalQuery,new Pagination());

					this.tipofondocontrolsForeignKey=tipofondocontrolLogic.getTipoFondoControls();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFondoControl(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondocontrolLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoFondoControlActual());
					this.tipofondocontrolsForeignKey.add(tipofondocontrolLogic.getTipoFondoControl());
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

	public void cargarCombosTipoTamanioControlsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotamaniocontrolsForeignKey=new ArrayList<TipoTamanioControl>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTamanioControlLogic tipotamaniocontrolLogic=new TipoTamanioControlLogic();

			tipotamaniocontrolLogic.getTipoTamanioControlDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoTamanioControl()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotamaniocontrolLogic.getTipoTamanioControlDataAccess().setIsForForeingKeyData(true);

					tipotamaniocontrolLogic.getTodosTipoTamanioControlsWithConnection(sFinalQuery,new Pagination());

					this.tipotamaniocontrolsForeignKey=tipotamaniocontrolLogic.getTipoTamanioControls();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTamanioControl(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotamaniocontrolLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoTamanioControlActual());
					this.tipotamaniocontrolsForeignKey.add(tipotamaniocontrolLogic.getTipoTamanioControl());
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

	public void cargarCombosTipoExportarsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoexportarsForeignKey=new ArrayList<TipoExportar>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoExportarLogic tipoexportarLogic=new TipoExportarLogic();

			tipoexportarLogic.getTipoExportarDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoExportar()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoexportarLogic.getTipoExportarDataAccess().setIsForForeingKeyData(true);

					tipoexportarLogic.getTodosTipoExportarsWithConnection(sFinalQuery,new Pagination());

					this.tipoexportarsForeignKey=tipoexportarLogic.getTipoExportars();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoExportar(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoexportarLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoExportarActual());
					this.tipoexportarsForeignKey.add(tipoexportarLogic.getTipoExportar());
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

	public void cargarCombosTipoDelimitersForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodelimitersForeignKey=new ArrayList<TipoDelimiter>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDelimiterLogic tipodelimiterLogic=new TipoDelimiterLogic();

			tipodelimiterLogic.getTipoDelimiterDataAccess().setIsForForeingKeyData(true);

			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDelimiter()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodelimiterLogic.getTipoDelimiterDataAccess().setIsForForeingKeyData(true);

					tipodelimiterLogic.getTodosTipoDelimitersWithConnection(sFinalQuery,new Pagination());

					this.tipodelimitersForeignKey=tipodelimiterLogic.getTipoDelimiters();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDelimiter(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodelimiterLogic.getEntityWithConnection(procesocambiarparametrogeneralSessionBean.getlidTipoDelimiterActual());
					this.tipodelimitersForeignKey.add(tipodelimiterLogic.getTipoDelimiter());
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

	
	
	public void setActualTipoVisualForeignKey(Long idTipoVisualSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoVisual  tipovisualTemp=null;

			for(TipoVisual tipovisualAux:tipovisualsForeignKey) {
				if(tipovisualAux.getId()!=null && tipovisualAux.getId().equals(idTipoVisualSeleccionado)) {
					tipovisualTemp=tipovisualAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovisualTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoVisual(tipovisualTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedItem(tipovisualTemp);
					}
				} else {
					//jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedItem(tipovisualTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovisualTemp!=null && jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipovisualTemp);
					} else {
						if(jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipovisualTemp);
							if(jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoVisualForeignKeyDescripcion(Long idTipoVisualSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoVisual  tipovisualTemp=null;

			for(TipoVisual tipovisualAux:tipovisualsForeignKey) {
				if(tipovisualAux.getId()!=null && tipovisualAux.getId().equals(idTipoVisualSeleccionado)) {
					tipovisualTemp=tipovisualAux;
					break;
				}
			}


			sDescripcion=TipoVisualConstantesFunciones.getTipoVisualDescripcion(tipovisualTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoVisualForeignKeyGenerico(Long idTipoVisualSeleccionado,JComboBox jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoVisual  tipovisualTemp=null;

			for(TipoVisual tipovisualAux:tipovisualsForeignKey) {
				if(tipovisualAux.getId()!=null && tipovisualAux.getId().equals(idTipoVisualSeleccionado)) {
					tipovisualTemp=tipovisualAux;
					break;
				}
			}

			if(tipovisualTemp!=null) {
				jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipovisualTemp);
			} else {
				if(jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFondoForeignKey(Long idTipoFondoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFondo  tipofondoTemp=null;

			for(TipoFondo tipofondoAux:tipofondosForeignKey) {
				if(tipofondoAux.getId()!=null && tipofondoAux.getId().equals(idTipoFondoSeleccionado)) {
					tipofondoTemp=tipofondoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipofondoTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoFondo(tipofondoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedItem(tipofondoTemp);
					}
				} else {
					//jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedItem(tipofondoTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipofondoTemp!=null && jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondoTemp);
					} else {
						if(jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondoTemp);
							if(jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoFondoForeignKeyDescripcion(Long idTipoFondoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFondo  tipofondoTemp=null;

			for(TipoFondo tipofondoAux:tipofondosForeignKey) {
				if(tipofondoAux.getId()!=null && tipofondoAux.getId().equals(idTipoFondoSeleccionado)) {
					tipofondoTemp=tipofondoAux;
					break;
				}
			}


			sDescripcion=TipoFondoConstantesFunciones.getTipoFondoDescripcion(tipofondoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFondoForeignKeyGenerico(Long idTipoFondoSeleccionado,JComboBox jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondo  tipofondoTemp=null;

			for(TipoFondo tipofondoAux:tipofondosForeignKey) {
				if(tipofondoAux.getId()!=null && tipofondoAux.getId().equals(idTipoFondoSeleccionado)) {
					tipofondoTemp=tipofondoAux;
					break;
				}
			}

			if(tipofondoTemp!=null) {
				jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipofondoTemp);
			} else {
				if(jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFondoBordeForeignKey(Long idTipoFondoBordeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFondo  tipofondobordeTemp=null;

			for(TipoFondo tipofondobordeAux:tipofondobordesForeignKey) {
				if(tipofondobordeAux.getId()!=null && tipofondobordeAux.getId().equals(idTipoFondoBordeSeleccionado)) {
					tipofondobordeTemp=tipofondobordeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipofondobordeTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoFondoBorde(tipofondobordeTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedItem(tipofondobordeTemp);
					}
				} else {
					//jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedItem(tipofondobordeTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipofondobordeTemp!=null && jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondobordeTemp);
					} else {
						if(jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondobordeTemp);
							if(jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoFondoBordeForeignKeyDescripcion(Long idTipoFondoBordeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFondo  tipofondobordeTemp=null;

			for(TipoFondo tipofondobordeAux:tipofondobordesForeignKey) {
				if(tipofondobordeAux.getId()!=null && tipofondobordeAux.getId().equals(idTipoFondoBordeSeleccionado)) {
					tipofondobordeTemp=tipofondobordeAux;
					break;
				}
			}


			sDescripcion=TipoFondoConstantesFunciones.getTipoFondoDescripcion(tipofondobordeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFondoBordeForeignKeyGenerico(Long idTipoFondoBordeSeleccionado,JComboBox jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondo  tipofondobordeTemp=null;

			for(TipoFondo tipofondobordeAux:tipofondobordesForeignKey) {
				if(tipofondobordeAux.getId()!=null && tipofondobordeAux.getId().equals(idTipoFondoBordeSeleccionado)) {
					tipofondobordeTemp=tipofondobordeAux;
					break;
				}
			}

			if(tipofondobordeTemp!=null) {
				jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipofondobordeTemp);
			} else {
				if(jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFondoControlForeignKey(Long idTipoFondoControlSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFondoControl  tipofondocontrolTemp=null;

			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsForeignKey) {
				if(tipofondocontrolAux.getId()!=null && tipofondocontrolAux.getId().equals(idTipoFondoControlSeleccionado)) {
					tipofondocontrolTemp=tipofondocontrolAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipofondocontrolTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoFondoControl(tipofondocontrolTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrolTemp);
					}
				} else {
					//jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrolTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipofondocontrolTemp!=null && jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrolTemp);
					} else {
						if(jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrolTemp);
							if(jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoFondoControlForeignKeyDescripcion(Long idTipoFondoControlSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFondoControl  tipofondocontrolTemp=null;

			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsForeignKey) {
				if(tipofondocontrolAux.getId()!=null && tipofondocontrolAux.getId().equals(idTipoFondoControlSeleccionado)) {
					tipofondocontrolTemp=tipofondocontrolAux;
					break;
				}
			}


			sDescripcion=TipoFondoControlConstantesFunciones.getTipoFondoControlDescripcion(tipofondocontrolTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFondoControlForeignKeyGenerico(Long idTipoFondoControlSeleccionado,JComboBox jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondoControl  tipofondocontrolTemp=null;

			for(TipoFondoControl tipofondocontrolAux:tipofondocontrolsForeignKey) {
				if(tipofondocontrolAux.getId()!=null && tipofondocontrolAux.getId().equals(idTipoFondoControlSeleccionado)) {
					tipofondocontrolTemp=tipofondocontrolAux;
					break;
				}
			}

			if(tipofondocontrolTemp!=null) {
				jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipofondocontrolTemp);
			} else {
				if(jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTamanioControlForeignKey(Long idTipoTamanioControlSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTamanioControl  tipotamaniocontrolTemp=null;

			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsForeignKey) {
				if(tipotamaniocontrolAux.getId()!=null && tipotamaniocontrolAux.getId().equals(idTipoTamanioControlSeleccionado)) {
					tipotamaniocontrolTemp=tipotamaniocontrolAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotamaniocontrolTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoTamanioControl(tipotamaniocontrolTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrolTemp);
					}
				} else {
					//jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrolTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotamaniocontrolTemp!=null && jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrolTemp);
					} else {
						if(jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrolTemp);
							if(jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoTamanioControlForeignKeyDescripcion(Long idTipoTamanioControlSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTamanioControl  tipotamaniocontrolTemp=null;

			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsForeignKey) {
				if(tipotamaniocontrolAux.getId()!=null && tipotamaniocontrolAux.getId().equals(idTipoTamanioControlSeleccionado)) {
					tipotamaniocontrolTemp=tipotamaniocontrolAux;
					break;
				}
			}


			sDescripcion=TipoTamanioControlConstantesFunciones.getTipoTamanioControlDescripcion(tipotamaniocontrolTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTamanioControlForeignKeyGenerico(Long idTipoTamanioControlSeleccionado,JComboBox jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoTamanioControl  tipotamaniocontrolTemp=null;

			for(TipoTamanioControl tipotamaniocontrolAux:tipotamaniocontrolsForeignKey) {
				if(tipotamaniocontrolAux.getId()!=null && tipotamaniocontrolAux.getId().equals(idTipoTamanioControlSeleccionado)) {
					tipotamaniocontrolTemp=tipotamaniocontrolAux;
					break;
				}
			}

			if(tipotamaniocontrolTemp!=null) {
				jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipotamaniocontrolTemp);
			} else {
				if(jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoExportarForeignKey(Long idTipoExportarSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoExportar  tipoexportarTemp=null;

			for(TipoExportar tipoexportarAux:tipoexportarsForeignKey) {
				if(tipoexportarAux.getId()!=null && tipoexportarAux.getId().equals(idTipoExportarSeleccionado)) {
					tipoexportarTemp=tipoexportarAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoexportarTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoExportar(tipoexportarTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedItem(tipoexportarTemp);
					}
				} else {
					//jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedItem(tipoexportarTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoexportarTemp!=null && jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipoexportarTemp);
					} else {
						if(jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipoexportarTemp);
							if(jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoExportarForeignKeyDescripcion(Long idTipoExportarSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoExportar  tipoexportarTemp=null;

			for(TipoExportar tipoexportarAux:tipoexportarsForeignKey) {
				if(tipoexportarAux.getId()!=null && tipoexportarAux.getId().equals(idTipoExportarSeleccionado)) {
					tipoexportarTemp=tipoexportarAux;
					break;
				}
			}


			sDescripcion=TipoExportarConstantesFunciones.getTipoExportarDescripcion(tipoexportarTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoExportarForeignKeyGenerico(Long idTipoExportarSeleccionado,JComboBox jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoExportar  tipoexportarTemp=null;

			for(TipoExportar tipoexportarAux:tipoexportarsForeignKey) {
				if(tipoexportarAux.getId()!=null && tipoexportarAux.getId().equals(idTipoExportarSeleccionado)) {
					tipoexportarTemp=tipoexportarAux;
					break;
				}
			}

			if(tipoexportarTemp!=null) {
				jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipoexportarTemp);
			} else {
				if(jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDelimiterForeignKey(Long idTipoDelimiterSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDelimiter  tipodelimiterTemp=null;

			for(TipoDelimiter tipodelimiterAux:tipodelimitersForeignKey) {
				if(tipodelimiterAux.getId()!=null && tipodelimiterAux.getId().equals(idTipoDelimiterSeleccionado)) {
					tipodelimiterTemp=tipodelimiterAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodelimiterTemp!=null) {

					if(this.procesocambiarparametrogeneral!=null) {
						this.procesocambiarparametrogeneral.setTipoDelimiter(tipodelimiterTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiterTemp);
					}
				} else {
					//jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiterTemp);
					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodelimiterTemp!=null && jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
						jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiterTemp);
					} else {
						if(jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
							//jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiterTemp);
							if(jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoDelimiterForeignKeyDescripcion(Long idTipoDelimiterSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDelimiter  tipodelimiterTemp=null;

			for(TipoDelimiter tipodelimiterAux:tipodelimitersForeignKey) {
				if(tipodelimiterAux.getId()!=null && tipodelimiterAux.getId().equals(idTipoDelimiterSeleccionado)) {
					tipodelimiterTemp=tipodelimiterAux;
					break;
				}
			}


			sDescripcion=TipoDelimiterConstantesFunciones.getTipoDelimiterDescripcion(tipodelimiterTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDelimiterForeignKeyGenerico(Long idTipoDelimiterSeleccionado,JComboBox jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoDelimiter  tipodelimiterTemp=null;

			for(TipoDelimiter tipodelimiterAux:tipodelimitersForeignKey) {
				if(tipodelimiterAux.getId()!=null && tipodelimiterAux.getId().equals(idTipoDelimiterSeleccionado)) {
					tipodelimiterTemp=tipodelimiterAux;
					break;
				}
			}

			if(tipodelimiterTemp!=null) {
				jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico.setSelectedItem(tipodelimiterTemp);
			} else {
				if(jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico!=null && jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoVisualForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoVisual  tipovisualAux=new TipoVisual();

			if(jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico==null) {
				tipovisualAux=(TipoVisual)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipovisualAux=(TipoVisual)jComboBoxid_tipo_visualProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipovisualAux!=null && tipovisualAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_visual(tipovisualAux.getId());
				procesocambiarparametrogeneral.settipovisual_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoVisualDescripcion(tipovisualAux));
				procesocambiarparametrogeneral.setTipoVisual(tipovisualAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFondoForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondo  tipofondoAux=new TipoFondo();

			if(jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico==null) {
				tipofondoAux=(TipoFondo)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipofondoAux=(TipoFondo)jComboBoxid_tipo_fondoProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipofondoAux!=null && tipofondoAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_fondo(tipofondoAux.getId());
				procesocambiarparametrogeneral.settipofondo_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoFondoDescripcion(tipofondoAux));
				procesocambiarparametrogeneral.setTipoFondo(tipofondoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFondoBordeForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondo  tipofondoAux=new TipoFondo();

			if(jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico==null) {
				tipofondoAux=(TipoFondo)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipofondoAux=(TipoFondo)jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipofondoAux!=null && tipofondoAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_fondo_borde(tipofondoAux.getId());
				procesocambiarparametrogeneral.settipofondoborde_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoFondoBordeDescripcion(tipofondoAux));
				procesocambiarparametrogeneral.setTipoFondoBorde(tipofondoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFondoControlForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoFondoControl  tipofondocontrolAux=new TipoFondoControl();

			if(jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico==null) {
				tipofondocontrolAux=(TipoFondoControl)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipofondocontrolAux=(TipoFondoControl)jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipofondocontrolAux!=null && tipofondocontrolAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_fondo_control(tipofondocontrolAux.getId());
				procesocambiarparametrogeneral.settipofondocontrol_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoFondoControlDescripcion(tipofondocontrolAux));
				procesocambiarparametrogeneral.setTipoFondoControl(tipofondocontrolAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTamanioControlForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoTamanioControl  tipotamaniocontrolAux=new TipoTamanioControl();

			if(jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico==null) {
				tipotamaniocontrolAux=(TipoTamanioControl)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipotamaniocontrolAux=(TipoTamanioControl)jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipotamaniocontrolAux!=null && tipotamaniocontrolAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_tamanio_control(tipotamaniocontrolAux.getId());
				procesocambiarparametrogeneral.settipotamaniocontrol_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoTamanioControlDescripcion(tipotamaniocontrolAux));
				procesocambiarparametrogeneral.setTipoTamanioControl(tipotamaniocontrolAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoExportarForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoExportar  tipoexportarAux=new TipoExportar();

			if(jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico==null) {
				tipoexportarAux=(TipoExportar)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipoexportarAux=(TipoExportar)jComboBoxid_tipo_exportarProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipoexportarAux!=null && tipoexportarAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_exportar(tipoexportarAux.getId());
				procesocambiarparametrogeneral.settipoexportar_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoExportarDescripcion(tipoexportarAux));
				procesocambiarparametrogeneral.setTipoExportar(tipoexportarAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDelimiterForeignKey(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,JComboBox jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoDelimiter  tipodelimiterAux=new TipoDelimiter();

			if(jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico==null) {
				tipodelimiterAux=(TipoDelimiter)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getSelectedItem();
			} else {
				tipodelimiterAux=(TipoDelimiter)jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneralGenerico.getSelectedItem();
			}

			if(tipodelimiterAux!=null && tipodelimiterAux.getId()!=null) {
				procesocambiarparametrogeneral.setid_tipo_delimiter(tipodelimiterAux.getId());
				procesocambiarparametrogeneral.settipodelimiter_descripcion(ProcesoCambiarParametroGeneralConstantesFunciones.getTipoDelimiterDescripcion(tipodelimiterAux));
				procesocambiarparametrogeneral.setTipoDelimiter(tipodelimiterAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoVisualsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoVisual=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoVisual tipovisual:this.tipovisualsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.addItem(tipovisual);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoVisual tipovisual:this.tipovisualsForeignKey) {
								this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipovisual);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFondosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFondo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondo tipofondo:this.tipofondosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.addItem(tipofondo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondo tipofondo:this.tipofondosForeignKey) {
								this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipofondo);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFondoBordesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFondo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondo tipofondoborde:this.tipofondobordesForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.addItem(tipofondoborde);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondo tipofondoborde:this.tipofondobordesForeignKey) {
								this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipofondoborde);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFondoControlsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFondoControl=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondoControl tipofondocontrol:this.tipofondocontrolsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.addItem(tipofondocontrol);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoFondoControl tipofondocontrol:this.tipofondocontrolsForeignKey) {
								this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipofondocontrol);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTamanioControlsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTamanioControl=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoTamanioControl tipotamaniocontrol:this.tipotamaniocontrolsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.addItem(tipotamaniocontrol);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoTamanioControl tipotamaniocontrol:this.tipotamaniocontrolsForeignKey) {
								this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipotamaniocontrol);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoExportarsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoExportar=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoExportar tipoexportar:this.tipoexportarsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.addItem(tipoexportar);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoExportar tipoexportar:this.tipoexportarsForeignKey) {
								this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipoexportar);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDelimitersForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDelimiter=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoDelimiter tipodelimiter:this.tipodelimitersForeignKey) {
								this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.addItem(tipodelimiter);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { 
					}

					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.removeAllItems();

							for(TipoDelimiter tipodelimiter:this.tipodelimitersForeignKey) {
								this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addItem(tipodelimiter);
							}
						}

						if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoVisualForeignKey(TipoVisual tipovisual,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedItem(tipovisual);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipovisual);
						} else {
							this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFondoForeignKey(TipoFondo tipofondo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedItem(tipofondo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondo);
						} else {
							this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFondoBordeForeignKey(TipoFondo tipofondoborde,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedItem(tipofondoborde);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondoborde);
						} else {
							this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFondoControlForeignKey(TipoFondoControl tipofondocontrol,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrol);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipofondocontrol);
						} else {
							this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTamanioControlForeignKey(TipoTamanioControl tipotamaniocontrol,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrol);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipotamaniocontrol);
						} else {
							this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoExportarForeignKey(TipoExportar tipoexportar,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedItem(tipoexportar);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipoexportar);
						} else {
							this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDelimiterForeignKey(TipoDelimiter tipodelimiter,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiter);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedItem(tipodelimiter);
						} else {
							this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCambiarParametroGeneral() throws Exception {
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
		
	public ProcesoCambiarParametroGeneralParameterReturnGeneral getProcesoCambiarParametroGeneralParameterGeneral() {
		return this.procesocambiarparametrogeneralParameterGeneral;
	}
	
	public void setProcesoCambiarParametroGeneralParameterGeneral(ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralParameterGeneral) {
		this.procesocambiarparametrogeneralParameterGeneral = procesocambiarparametrogeneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCambiarParametroGeneral() {
		return isPermisoTodoProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoTodoProcesoCambiarParametroGeneral(Boolean isPermisoTodoProcesoCambiarParametroGeneral) {
		this.isPermisoTodoProcesoCambiarParametroGeneral = isPermisoTodoProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoNuevoProcesoCambiarParametroGeneral() {
		return isPermisoNuevoProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoNuevoProcesoCambiarParametroGeneral(Boolean isPermisoNuevoProcesoCambiarParametroGeneral) {
		this.isPermisoNuevoProcesoCambiarParametroGeneral = isPermisoNuevoProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoActualizarProcesoCambiarParametroGeneral() {
		return isPermisoActualizarProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoActualizarProcesoCambiarParametroGeneral(Boolean isPermisoActualizarProcesoCambiarParametroGeneral) {
		this.isPermisoActualizarProcesoCambiarParametroGeneral = isPermisoActualizarProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoEliminarProcesoCambiarParametroGeneral() {
		return isPermisoEliminarProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoEliminarProcesoCambiarParametroGeneral(Boolean isPermisoEliminarProcesoCambiarParametroGeneral) {
		this.isPermisoEliminarProcesoCambiarParametroGeneral = isPermisoEliminarProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCambiarParametroGeneral() {
		return isPermisoGuardarCambiosProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoGuardarCambiosProcesoCambiarParametroGeneral(Boolean isPermisoGuardarCambiosProcesoCambiarParametroGeneral) {
		this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral = isPermisoGuardarCambiosProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoConsultaProcesoCambiarParametroGeneral() {
		return isPermisoConsultaProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoConsultaProcesoCambiarParametroGeneral(Boolean isPermisoConsultaProcesoCambiarParametroGeneral) {
		this.isPermisoConsultaProcesoCambiarParametroGeneral = isPermisoConsultaProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoBusquedaProcesoCambiarParametroGeneral() {
		return isPermisoBusquedaProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoBusquedaProcesoCambiarParametroGeneral(Boolean isPermisoBusquedaProcesoCambiarParametroGeneral) {
		this.isPermisoBusquedaProcesoCambiarParametroGeneral = isPermisoBusquedaProcesoCambiarParametroGeneral;
	}

	public Boolean getIsPermisoReporteProcesoCambiarParametroGeneral() {
		return isPermisoReporteProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoReporteProcesoCambiarParametroGeneral(Boolean isPermisoReporteProcesoCambiarParametroGeneral) {
		this.isPermisoReporteProcesoCambiarParametroGeneral = isPermisoReporteProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCambiarParametroGeneral() {
		return isPermisoPaginacionMedioProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoPaginacionMedioProcesoCambiarParametroGeneral(Boolean isPermisoPaginacionMedioProcesoCambiarParametroGeneral) {
		this.isPermisoPaginacionMedioProcesoCambiarParametroGeneral = isPermisoPaginacionMedioProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCambiarParametroGeneral() {
		return isPermisoPaginacionTodoProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoPaginacionTodoProcesoCambiarParametroGeneral(Boolean isPermisoPaginacionTodoProcesoCambiarParametroGeneral) {
		this.isPermisoPaginacionTodoProcesoCambiarParametroGeneral = isPermisoPaginacionTodoProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCambiarParametroGeneral() {
		return isPermisoPaginacionAltoProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoPaginacionAltoProcesoCambiarParametroGeneral(Boolean isPermisoPaginacionAltoProcesoCambiarParametroGeneral) {
		this.isPermisoPaginacionAltoProcesoCambiarParametroGeneral = isPermisoPaginacionAltoProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoCopiarProcesoCambiarParametroGeneral() {
		return isPermisoCopiarProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoCopiarProcesoCambiarParametroGeneral(Boolean isPermisoCopiarProcesoCambiarParametroGeneral) {
		this.isPermisoCopiarProcesoCambiarParametroGeneral = isPermisoCopiarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoVerFormProcesoCambiarParametroGeneral() {
		return isPermisoVerFormProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoVerFormProcesoCambiarParametroGeneral(Boolean isPermisoVerFormProcesoCambiarParametroGeneral) {
		this.isPermisoVerFormProcesoCambiarParametroGeneral = isPermisoVerFormProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCambiarParametroGeneral() {
		return isPermisoDuplicarProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoDuplicarProcesoCambiarParametroGeneral(Boolean isPermisoDuplicarProcesoCambiarParametroGeneral) {
		this.isPermisoDuplicarProcesoCambiarParametroGeneral = isPermisoDuplicarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsPermisoOrdenProcesoCambiarParametroGeneral() {
		return isPermisoOrdenProcesoCambiarParametroGeneral;
	}

	public void setIsPermisoOrdenProcesoCambiarParametroGeneral(Boolean isPermisoOrdenProcesoCambiarParametroGeneral) {
		this.isPermisoOrdenProcesoCambiarParametroGeneral = isPermisoOrdenProcesoCambiarParametroGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral = isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral = isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral = isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral = isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral = isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral = isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaModificarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaModificarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaModificarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral = isVisibilidadCeldaModificarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral = isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral = isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral = isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral = isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral() {
		return isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral(Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral = isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral;
	}
		
	public ProcesoCambiarParametroGeneralSessionBean getprocesocambiarparametrogeneralSessionBean() {
		return this.procesocambiarparametrogeneralSessionBean;
	}
	
	public void setprocesocambiarparametrogeneralSessionBean(ProcesoCambiarParametroGeneralSessionBean procesocambiarparametrogeneralSessionBean) {
		this.procesocambiarparametrogeneralSessionBean=procesocambiarparametrogeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCambiarParametroGeneral() {
		return this.isVisibilidadBusquedaProcesoCambiarParametroGeneral;
	}

	public void setisVisibilidadBusquedaProcesoCambiarParametroGeneral(Boolean isVisibilidadBusquedaProcesoCambiarParametroGeneral) {
		this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isVisibilidadBusquedaProcesoCambiarParametroGeneral;
	}

	public Boolean getisVisibilidadFK_IdTipoDelimiter() {
		return this.isVisibilidadFK_IdTipoDelimiter;
	}

	public void setisVisibilidadFK_IdTipoDelimiter(Boolean isVisibilidadFK_IdTipoDelimiter) {
		this.isVisibilidadFK_IdTipoDelimiter=isVisibilidadFK_IdTipoDelimiter;
	}

	public Boolean getisVisibilidadFK_IdTipoExportar() {
		return this.isVisibilidadFK_IdTipoExportar;
	}

	public void setisVisibilidadFK_IdTipoExportar(Boolean isVisibilidadFK_IdTipoExportar) {
		this.isVisibilidadFK_IdTipoExportar=isVisibilidadFK_IdTipoExportar;
	}

	public Boolean getisVisibilidadFK_IdTipoFondo() {
		return this.isVisibilidadFK_IdTipoFondo;
	}

	public void setisVisibilidadFK_IdTipoFondo(Boolean isVisibilidadFK_IdTipoFondo) {
		this.isVisibilidadFK_IdTipoFondo=isVisibilidadFK_IdTipoFondo;
	}

	public Boolean getisVisibilidadFK_IdTipoFondoBorde() {
		return this.isVisibilidadFK_IdTipoFondoBorde;
	}

	public void setisVisibilidadFK_IdTipoFondoBorde(Boolean isVisibilidadFK_IdTipoFondoBorde) {
		this.isVisibilidadFK_IdTipoFondoBorde=isVisibilidadFK_IdTipoFondoBorde;
	}

	public Boolean getisVisibilidadFK_IdTipoFondoControl() {
		return this.isVisibilidadFK_IdTipoFondoControl;
	}

	public void setisVisibilidadFK_IdTipoFondoControl(Boolean isVisibilidadFK_IdTipoFondoControl) {
		this.isVisibilidadFK_IdTipoFondoControl=isVisibilidadFK_IdTipoFondoControl;
	}

	public Boolean getisVisibilidadFK_IdTipoTamanioControl() {
		return this.isVisibilidadFK_IdTipoTamanioControl;
	}

	public void setisVisibilidadFK_IdTipoTamanioControl(Boolean isVisibilidadFK_IdTipoTamanioControl) {
		this.isVisibilidadFK_IdTipoTamanioControl=isVisibilidadFK_IdTipoTamanioControl;
	}

	public Boolean getisVisibilidadFK_IdTipoVisual() {
		return this.isVisibilidadFK_IdTipoVisual;
	}

	public void setisVisibilidadFK_IdTipoVisual(Boolean isVisibilidadFK_IdTipoVisual) {
		this.isVisibilidadFK_IdTipoVisual=isVisibilidadFK_IdTipoVisual;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral)throws Exception {
		try {
			
				this.setActualParaGuardarTipoVisualForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoFondoForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoFondoBordeForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoFondoControlForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoTamanioControlForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoExportarForeignKey(procesocambiarparametrogeneral,null);
				this.setActualParaGuardarTipoDelimiterForeignKey(procesocambiarparametrogeneral,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCambiarParametroGeneral(procesocambiarparametrogeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocambiarparametrogeneralAux.setId(procesocambiarparametrogeneral.getId());
		procesocambiarparametrogeneralAux.setVersionRow(procesocambiarparametrogeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal) throws Exception {
		
		if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal) throws Exception {	
		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoVisualDetalleFormJInternalFrame.class)) {
				TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrameLocal=(TipoVisualBeanSwingJInternalFrame) ((TipoVisualDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovisualBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoVisual(tipovisualBeanSwingJInternalFrameLocal.gettipovisual(),true);
				tipovisualBeanSwingJInternalFrameLocal.actualizarLista(tipovisualBeanSwingJInternalFrameLocal.tipovisual,this.tipovisualsForeignKey);

				tipovisualBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovisualBeanSwingJInternalFrameLocal.tipovisual);

				procesocambiarparametrogeneralLocal.setTipoVisual(tipovisualBeanSwingJInternalFrameLocal.tipovisual);

				this.addItemDefectoCombosForeignKeyTipoVisual();
				this.cargarCombosFrameTipoVisualsForeignKey("Formulario");
				this.setActualTipoVisualForeignKey(tipovisualBeanSwingJInternalFrameLocal.tipovisual.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFondoDetalleFormJInternalFrame.class)) {
				TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrameLocal=(TipoFondoBeanSwingJInternalFrame) ((TipoFondoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipofondoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFondo(tipofondoBeanSwingJInternalFrameLocal.gettipofondo(),true);
				tipofondoBeanSwingJInternalFrameLocal.actualizarLista(tipofondoBeanSwingJInternalFrameLocal.tipofondo,this.tipofondosForeignKey);

				tipofondoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipofondoBeanSwingJInternalFrameLocal.tipofondo);

				procesocambiarparametrogeneralLocal.setTipoFondo(tipofondoBeanSwingJInternalFrameLocal.tipofondo);

				this.addItemDefectoCombosForeignKeyTipoFondo();
				this.cargarCombosFrameTipoFondosForeignKey("Formulario");
				this.setActualTipoFondoForeignKey(tipofondoBeanSwingJInternalFrameLocal.tipofondo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFondoDetalleFormJInternalFrame.class)) {
				TipoFondoBeanSwingJInternalFrame tipofondobordeBeanSwingJInternalFrameLocal=(TipoFondoBeanSwingJInternalFrame) ((TipoFondoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipofondobordeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFondo(tipofondobordeBeanSwingJInternalFrameLocal.gettipofondo(),true);
				tipofondobordeBeanSwingJInternalFrameLocal.actualizarLista(tipofondobordeBeanSwingJInternalFrameLocal.tipofondo,this.tipofondobordesForeignKey);

				tipofondobordeBeanSwingJInternalFrameLocal.actualizarRelaciones(tipofondobordeBeanSwingJInternalFrameLocal.tipofondo);

				procesocambiarparametrogeneralLocal.setTipoFondoBorde(tipofondobordeBeanSwingJInternalFrameLocal.tipofondo);

				this.addItemDefectoCombosForeignKeyTipoFondoBorde();
				this.cargarCombosFrameTipoFondoBordesForeignKey("Formulario");
				this.setActualTipoFondoBordeForeignKey(tipofondobordeBeanSwingJInternalFrameLocal.tipofondo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFondoControlDetalleFormJInternalFrame.class)) {
				TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrameLocal=(TipoFondoControlBeanSwingJInternalFrame) ((TipoFondoControlDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipofondocontrolBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFondoControl(tipofondocontrolBeanSwingJInternalFrameLocal.gettipofondocontrol(),true);
				tipofondocontrolBeanSwingJInternalFrameLocal.actualizarLista(tipofondocontrolBeanSwingJInternalFrameLocal.tipofondocontrol,this.tipofondocontrolsForeignKey);

				tipofondocontrolBeanSwingJInternalFrameLocal.actualizarRelaciones(tipofondocontrolBeanSwingJInternalFrameLocal.tipofondocontrol);

				procesocambiarparametrogeneralLocal.setTipoFondoControl(tipofondocontrolBeanSwingJInternalFrameLocal.tipofondocontrol);

				this.addItemDefectoCombosForeignKeyTipoFondoControl();
				this.cargarCombosFrameTipoFondoControlsForeignKey("Formulario");
				this.setActualTipoFondoControlForeignKey(tipofondocontrolBeanSwingJInternalFrameLocal.tipofondocontrol.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTamanioControlDetalleFormJInternalFrame.class)) {
				TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolBeanSwingJInternalFrameLocal=(TipoTamanioControlBeanSwingJInternalFrame) ((TipoTamanioControlDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotamaniocontrolBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTamanioControl(tipotamaniocontrolBeanSwingJInternalFrameLocal.gettipotamaniocontrol(),true);
				tipotamaniocontrolBeanSwingJInternalFrameLocal.actualizarLista(tipotamaniocontrolBeanSwingJInternalFrameLocal.tipotamaniocontrol,this.tipotamaniocontrolsForeignKey);

				tipotamaniocontrolBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotamaniocontrolBeanSwingJInternalFrameLocal.tipotamaniocontrol);

				procesocambiarparametrogeneralLocal.setTipoTamanioControl(tipotamaniocontrolBeanSwingJInternalFrameLocal.tipotamaniocontrol);

				this.addItemDefectoCombosForeignKeyTipoTamanioControl();
				this.cargarCombosFrameTipoTamanioControlsForeignKey("Formulario");
				this.setActualTipoTamanioControlForeignKey(tipotamaniocontrolBeanSwingJInternalFrameLocal.tipotamaniocontrol.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoExportarDetalleFormJInternalFrame.class)) {
				TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrameLocal=(TipoExportarBeanSwingJInternalFrame) ((TipoExportarDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoexportarBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoExportar(tipoexportarBeanSwingJInternalFrameLocal.gettipoexportar(),true);
				tipoexportarBeanSwingJInternalFrameLocal.actualizarLista(tipoexportarBeanSwingJInternalFrameLocal.tipoexportar,this.tipoexportarsForeignKey);

				tipoexportarBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoexportarBeanSwingJInternalFrameLocal.tipoexportar);

				procesocambiarparametrogeneralLocal.setTipoExportar(tipoexportarBeanSwingJInternalFrameLocal.tipoexportar);

				this.addItemDefectoCombosForeignKeyTipoExportar();
				this.cargarCombosFrameTipoExportarsForeignKey("Formulario");
				this.setActualTipoExportarForeignKey(tipoexportarBeanSwingJInternalFrameLocal.tipoexportar.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDelimiterDetalleFormJInternalFrame.class)) {
				TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrameLocal=(TipoDelimiterBeanSwingJInternalFrame) ((TipoDelimiterDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodelimiterBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDelimiter(tipodelimiterBeanSwingJInternalFrameLocal.gettipodelimiter(),true);
				tipodelimiterBeanSwingJInternalFrameLocal.actualizarLista(tipodelimiterBeanSwingJInternalFrameLocal.tipodelimiter,this.tipodelimitersForeignKey);

				tipodelimiterBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodelimiterBeanSwingJInternalFrameLocal.tipodelimiter);

				procesocambiarparametrogeneralLocal.setTipoDelimiter(tipodelimiterBeanSwingJInternalFrameLocal.tipodelimiter);

				this.addItemDefectoCombosForeignKeyTipoDelimiter();
				this.cargarCombosFrameTipoDelimitersForeignKey("Formulario");
				this.setActualTipoDelimiterForeignKey(tipodelimiterBeanSwingJInternalFrameLocal.tipodelimiter.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCambiarParametroGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocambiarparametrogeneralValidator.getInvalidValues(this.procesocambiarparametrogeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogenerals) throws Exception {
		try	{			
			ProcesoCambiarParametroGeneralConstantesFunciones.actualizarSelectedLista(procesocambiarparametrogeneral,procesocambiarparametrogenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocambiarparametrogeneralsLocal=this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocambiarparametrogeneralsLocal=this.procesocambiarparametrogenerals;
			}
			//ARCHITECTURE
		
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal:procesocambiarparametrogeneralsLocal) {
				if(this.permiteMantenimiento(procesocambiarparametrogeneralLocal) && procesocambiarparametrogeneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOVISUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_visualProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondoProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDOBORDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDOCONTROL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOTAMANIOCONTROL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.CONMENSAJECONFIRMACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.CONBOTONESTOOLBAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOEXPORTAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_exportarProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPODELIMITER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.CONEXPORTARCABECERA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCambiarParametroGeneralConstantesFunciones.PATHEXPORTAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelpath_exportarProcesoCambiarParametroGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_visualProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondoProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_exportarProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelpath_exportarProcesoCambiarParametroGeneral,"");
		
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
		this.iIdNuevoProcesoCambiarParametroGeneral--;	
		
		
		this.procesocambiarparametrogeneralAux=new ProcesoCambiarParametroGeneral();
		
		this.procesocambiarparametrogeneralAux.setId(this.iIdNuevoProcesoCambiarParametroGeneral);
		this.procesocambiarparametrogeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().add(this.procesocambiarparametrogeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocambiarparametrogenerals.add(this.procesocambiarparametrogeneralAux);
		}
		//ARCHITECTURE
		
		this.procesocambiarparametrogeneral=this.procesocambiarparametrogeneralAux;
		
		if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
		}
				
		//this.setDefaultControlesProcesoCambiarParametroGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCambiarParametroGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarParametroGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarParametroGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralBean,this.procesocambiarparametrogeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral,this.procesocambiarparametrogeneralBean,false);
		
		if(this.procesocambiarparametrogeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral());
		}
		
		if(this.procesocambiarparametrogeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral(),classes);//this.procesocambiarparametrogeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCambiarParametroGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCambiarParametroGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.RecargarFormProcesoCambiarParametroGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
						
			if(procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();
			}
			
			this.actualizarVisualTableDatosProcesoCambiarParametroGeneral();
			
			this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarParametroGeneral(), this.getIndiceNuevoProcesoCambiarParametroGeneral());
			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarcon_mensaje_confirmacionProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarcon_botones_tool_barProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarcon_exportar_cabeceraProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarpath_exportarProcesoCambiarParametroGeneral);	
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_visualProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondoProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_bordeProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_tamanio_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_exportarProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setEnabled(isHabilitar && this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_delimiterProcesoCambiarParametroGeneral);
	};
	
	public void setDefaultControlesProcesoCambiarParametroGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCambiarParametroGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(true);			
			this.procesocambiarparametrogeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setVisible(true);
			
					
		} else {
			//this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(false);			
			this.procesocambiarparametrogeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCambiarParametroGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				if(procesocambiarparametrogeneralAux.getId().equals(this.iIdNuevoProcesoCambiarParametroGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogenerals) {
				if(procesocambiarparametrogeneralAux.getId().equals(this.iIdNuevoProcesoCambiarParametroGeneral)) {
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
	
	public int getIndiceActualProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				if(procesocambiarparametrogeneralAux.getId().equals(procesocambiarparametrogeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogenerals) {
				if(procesocambiarparametrogeneralAux.getId().equals(procesocambiarparametrogeneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				if(procesocambiarparametrogeneralAux.getProcesoCambiarParametroGeneralOriginal().getId().equals(procesocambiarparametrogeneralOriginal.getId())) {
					existe=true;
					procesocambiarparametrogeneralOriginal.setId(procesocambiarparametrogeneralAux.getId());
					procesocambiarparametrogeneralOriginal.setVersionRow(procesocambiarparametrogeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogenerals) {
				if(procesocambiarparametrogeneralAux.getProcesoCambiarParametroGeneralOriginal().getId().equals(procesocambiarparametrogeneralOriginal.getId())) {
					existe=true;
					procesocambiarparametrogeneralOriginal.setId(procesocambiarparametrogeneralAux.getId());
					procesocambiarparametrogeneralOriginal.setVersionRow(procesocambiarparametrogeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCambiarParametroGeneral(Boolean esParaCancelar) throws Exception {
		procesocambiarparametrogeneralsAux=new ArrayList<ProcesoCambiarParametroGeneral>();
		procesocambiarparametrogeneralAux=new ProcesoCambiarParametroGeneral();
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
					if(procesocambiarparametrogeneralAux.getId()<0) {
						procesocambiarparametrogeneralsAux.add(procesocambiarparametrogeneralAux);
					}		
				}
				this.iIdNuevoProcesoCambiarParametroGeneral=0L;
				this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().removeAll(procesocambiarparametrogeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogenerals) {
					if(procesocambiarparametrogeneralAux.getId()<0) {
						procesocambiarparametrogeneralsAux.add(procesocambiarparametrogeneralAux);
					}		
				}
				this.iIdNuevoProcesoCambiarParametroGeneral=0L;
				this.procesocambiarparametrogenerals.removeAll(procesocambiarparametrogeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarParametroGeneral 
					&& this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size()>0
					) {
					procesocambiarparametrogeneralAux=this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().get(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size() - 1);
				
					if(procesocambiarparametrogeneralAux.getId()<0) {
						this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().remove(procesocambiarparametrogeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarParametroGeneral && this.procesocambiarparametrogenerals.size()>0) {
					procesocambiarparametrogeneralAux=this.procesocambiarparametrogenerals.get(this.procesocambiarparametrogenerals.size() - 1);
				
					if(procesocambiarparametrogeneralAux.getId()<0) {
						this.procesocambiarparametrogenerals.remove(procesocambiarparametrogeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCambiarParametroGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocambiarparametrogeneral.getId()<0) {
				this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().remove(this.procesocambiarparametrogeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocambiarparametrogeneral.getId()<0) {
				this.procesocambiarparametrogenerals.remove(this.procesocambiarparametrogeneral);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCambiarParametroGeneral(List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsAux) throws Exception {
		ProcesoCambiarParametroGeneralConstantesFunciones.setEstadosInicialesProcesoCambiarParametroGeneral(procesocambiarparametrogeneralsAux);
	}
	
	public void setEstadosInicialesProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux) throws Exception {
		ProcesoCambiarParametroGeneralConstantesFunciones.setEstadosInicialesProcesoCambiarParametroGeneral(procesocambiarparametrogeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCambiarParametroGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCambiarParametroGeneralActual()) {
				if(!this.isEsNuevoProcesoCambiarParametroGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCambiarParametroGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCambiarParametroGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cambiar Parametro General ?", "MANTENIMIENTO DE Proceso Cambiar Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) throws Exception {
		ProcesoCambiarParametroGeneralConstantesFunciones.seleccionarAsignar(this.procesocambiarparametrogeneral,procesocambiarparametrogeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCambiarParametroGeneral=this.isPermisoActualizarOriginalProcesoCambiarParametroGeneral;
			
			
			this.seleccionarAsignar(procesocambiarparametrogeneral);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocambiarparametrogeneralSessionBean.setsFuncionBusquedaRapida(this.procesocambiarparametrogeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCambiarParametroGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCambiarParametroGeneral(esParaCancelar);				
				this.cancelarNuevoProcesoCambiarParametroGeneral(esParaCancelar);								
			}
			
			this.procesocambiarparametrogeneral=new ProcesoCambiarParametroGeneral();
			
			this.inicializarProcesoCambiarParametroGeneral();
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCambiarParametroGeneral() throws Exception {
		try {
			ProcesoCambiarParametroGeneralConstantesFunciones.inicializarProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCambiarParametroGenerals(String sAccionBusqueda,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCambiarParametroGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCambiarParametroGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCambiarParametroGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCambiarParametroGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cambiar Parametro Generales");		
		parameters.put("busquedapor", ProcesoCambiarParametroGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCambiarParametroGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCambiarParametroGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCambiarParametroGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCambiarParametroGeneralBean.TraerProcesoCambiarParametroGeneralBeans(procesocambiarparametrogeneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(null);
					//this.generarExcelReporteProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCambiarParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,procesocambiarparametrogeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCambiarParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarParametroGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarParametroGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral : procesocambiarparametrogeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCambiarParametroGeneralConstantesFunciones.generarExcelReporteDataProcesoCambiarParametroGeneral("NORMAL",row,workbook,procesocambiarparametrogeneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCambiarParametroGeneral(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCambiarParametroGeneralConstantesFunciones.generarExcelReporteHeaderProcesoCambiarParametroGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCambiarParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarParametroGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral : procesocambiarparametrogeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralDescripcion(procesocambiarparametrogeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipovisual_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipofondo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipofondoborde_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipofondocontrol_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneral.getcon_mensaje_confirmacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneral.getcon_botones_tool_bar()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipoexportar_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.gettipodelimiter_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneral.getcon_exportar_cabecera()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarparametrogeneral.getpath_exportar());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCambiarParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsRespaldo=null;
		
		classes=ProcesoCambiarParametroGeneralConstantesFunciones.getClassesRelationshipsOfProcesoCambiarParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocambiarparametrogeneralLogic.setDatosCliente(this.datosCliente);
		this.procesocambiarparametrogeneralLogic.setDatosDeep(this.datosDeep);
		this.procesocambiarparametrogeneralLogic.setIsConDeep(true);
		
		procesocambiarparametrogeneralsRespaldo=this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals();
		
		this.procesocambiarparametrogeneralLogic.setProcesoCambiarParametroGenerals(procesocambiarparametrogeneralsParaReportes);	
		this.procesocambiarparametrogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocambiarparametrogeneralsParaReportes=this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals();
		this.procesocambiarparametrogeneralLogic.setProcesoCambiarParametroGenerals(procesocambiarparametrogeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarParametroGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarParametroGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral : procesocambiarparametrogeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCambiarParametroGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCambiarParametroGeneralConstantesFunciones.generarExcelReporteDataProcesoCambiarParametroGeneral("NORMAL",row,workbook,procesocambiarparametrogeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralDescripcion(procesocambiarparametrogeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCambiarParametroGeneral() throws Exception {		
		this.startProcessProcesoCambiarParametroGeneral(true);
	}
	
	public void startProcessProcesoCambiarParametroGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral ,this.jPanelParametrosReportesProcesoCambiarParametroGeneral, this.jScrollPanelDatosProcesoCambiarParametroGeneral,this.jPanelPaginacionProcesoCambiarParametroGeneral, this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral, this.jPanelAccionesProcesoCambiarParametroGeneral,this.jPanelAccionesFormularioProcesoCambiarParametroGeneral,this.jmenuBarProcesoCambiarParametroGeneral,this.jmenuBarDetalleProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarParametroGeneral=this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarParametroGeneral=this.jPanelParametrosReportesProcesoCambiarParametroGeneral;
		//final JScrollPane jScrollPanelDatosProcesoCambiarParametroGeneral=this.jScrollPanelDatosProcesoCambiarParametroGeneral;
		final JTable jTableDatosProcesoCambiarParametroGeneral=this.jTableDatosProcesoCambiarParametroGeneral;		
		final JPanel jPanelPaginacionProcesoCambiarParametroGeneral=this.jPanelPaginacionProcesoCambiarParametroGeneral;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarParametroGeneral=this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral;
		final JPanel jPanelAccionesProcesoCambiarParametroGeneral=this.jPanelAccionesProcesoCambiarParametroGeneral;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarParametroGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			jPanelCamposAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelCamposProcesoCambiarParametroGeneral;
			jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelAccionesFormularioProcesoCambiarParametroGeneral;
		}
		
		final JPanel jPanelCamposProcesoCambiarParametroGeneral=jPanelCamposAuxiliarProcesoCambiarParametroGeneral;
		final JPanel jPanelAccionesFormularioProcesoCambiarParametroGeneral=jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral;
		
		
		final JMenuBar jmenuBarProcesoCambiarParametroGeneral=this.jmenuBarProcesoCambiarParametroGeneral;
		final JToolBar jTtoolBarProcesoCambiarParametroGeneral=this.jTtoolBarProcesoCambiarParametroGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jmenuBarDetalleProcesoCambiarParametroGeneral;
			jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTtoolBarDetalleProcesoCambiarParametroGeneral;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarParametroGeneral=jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral;
		final JToolBar jTtoolBarDetalleProcesoCambiarParametroGeneral=jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarParametroGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarParametroGeneral;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarParametroGeneral;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarParametroGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarParametroGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarParametroGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarParametroGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarParametroGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarParametroGeneral;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarParametroGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarParametroGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarParametroGeneral ,jPanelParametrosReportesProcesoCambiarParametroGeneral,jTableDatosProcesoCambiarParametroGeneral, /*jScrollPanelDatosProcesoCambiarParametroGeneral,*/jPanelCamposProcesoCambiarParametroGeneral,jPanelPaginacionProcesoCambiarParametroGeneral, /*jScrollPanelDatosEdicionProcesoCambiarParametroGeneral,*/ jPanelAccionesProcesoCambiarParametroGeneral,jPanelAccionesFormularioProcesoCambiarParametroGeneral,jmenuBarProcesoCambiarParametroGeneral,jmenuBarDetalleProcesoCambiarParametroGeneral,jTtoolBarProcesoCambiarParametroGeneral,jTtoolBarDetalleProcesoCambiarParametroGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarParametroGeneral ,jPanelParametrosReportesProcesoCambiarParametroGeneral, jScrollPanelDatosProcesoCambiarParametroGeneral,jPanelPaginacionProcesoCambiarParametroGeneral, jScrollPanelDatosEdicionProcesoCambiarParametroGeneral, jPanelAccionesProcesoCambiarParametroGeneral,jPanelAccionesFormularioProcesoCambiarParametroGeneral,jmenuBarProcesoCambiarParametroGeneral,jmenuBarDetalleProcesoCambiarParametroGeneral,jTtoolBarProcesoCambiarParametroGeneral,jTtoolBarDetalleProcesoCambiarParametroGeneral);
						
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
	
	public void finishProcessProcesoCambiarParametroGeneral() {// throws Exception 
		this.finishProcessProcesoCambiarParametroGeneral(true);
	}
	
	public void finishProcessProcesoCambiarParametroGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral ,this.jPanelParametrosReportesProcesoCambiarParametroGeneral, this.jScrollPanelDatosProcesoCambiarParametroGeneral,this.jPanelPaginacionProcesoCambiarParametroGeneral, this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral, this.jPanelAccionesProcesoCambiarParametroGeneral,this.jPanelAccionesFormularioProcesoCambiarParametroGeneral,this.jmenuBarProcesoCambiarParametroGeneral,this.jmenuBarDetalleProcesoCambiarParametroGeneral,this.jTtoolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarParametroGeneral=this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarParametroGeneral=this.jPanelParametrosReportesProcesoCambiarParametroGeneral;
		//final JScrollPane jScrollPanelDatosProcesoCambiarParametroGeneral=this.jScrollPanelDatosProcesoCambiarParametroGeneral;
		final JTable jTableDatosProcesoCambiarParametroGeneral=this.jTableDatosProcesoCambiarParametroGeneral;		
		final JPanel jPanelPaginacionProcesoCambiarParametroGeneral=this.jPanelPaginacionProcesoCambiarParametroGeneral;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarParametroGeneral=this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral;
		final JPanel jPanelAccionesProcesoCambiarParametroGeneral=this.jPanelAccionesProcesoCambiarParametroGeneral;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarParametroGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			jPanelCamposAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelCamposProcesoCambiarParametroGeneral;
			jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelAccionesFormularioProcesoCambiarParametroGeneral;
		}
		
		final JPanel jPanelCamposProcesoCambiarParametroGeneral=jPanelCamposAuxiliarProcesoCambiarParametroGeneral;
		final JPanel jPanelAccionesFormularioProcesoCambiarParametroGeneral=jPanelAccionesFormularioAuxiliarProcesoCambiarParametroGeneral;
		
		
		final JMenuBar jmenuBarProcesoCambiarParametroGeneral=this.jmenuBarProcesoCambiarParametroGeneral;		
		final JToolBar jTtoolBarProcesoCambiarParametroGeneral=this.jTtoolBarProcesoCambiarParametroGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jmenuBarDetalleProcesoCambiarParametroGeneral;
			jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTtoolBarDetalleProcesoCambiarParametroGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarParametroGeneral=jmenuBarDetalleAuxiliarProcesoCambiarParametroGeneral;
		final JToolBar jTtoolBarDetalleProcesoCambiarParametroGeneral=jTtoolBarDetalleAuxiliarProcesoCambiarParametroGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarParametroGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarParametroGeneral;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarParametroGeneral;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarParametroGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarParametroGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarParametroGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarParametroGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarParametroGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarParametroGeneral;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarParametroGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarParametroGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCambiarParametroGeneral ,jPanelParametrosReportesProcesoCambiarParametroGeneral, jTableDatosProcesoCambiarParametroGeneral,/*jScrollPanelDatosProcesoCambiarParametroGeneral,*/jPanelCamposProcesoCambiarParametroGeneral,jPanelPaginacionProcesoCambiarParametroGeneral, /*jScrollPanelDatosEdicionProcesoCambiarParametroGeneral,*/ jPanelAccionesProcesoCambiarParametroGeneral,jPanelAccionesFormularioProcesoCambiarParametroGeneral,jmenuBarProcesoCambiarParametroGeneral,jmenuBarDetalleProcesoCambiarParametroGeneral,jTtoolBarProcesoCambiarParametroGeneral,jTtoolBarDetalleProcesoCambiarParametroGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCambiarParametroGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCambiarParametroGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCambiarParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCambiarParametroGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCambiarParametroGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCambiarParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCambiarParametroGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCambiarParametroGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocambiarparametrogeneralConstantesFunciones.getsFinalQueryProcesoCambiarParametroGeneral();
		String  finalQueryPaginacionTodos=this.procesocambiarparametrogeneralConstantesFunciones.getsFinalQueryProcesoCambiarParametroGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCambiarParametroGeneralConstantesFunciones.getArrayColumnasGlobalesNoProcesoCambiarParametroGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCambiarParametroGeneralConstantesFunciones.getArrayColumnasGlobalesProcesoCambiarParametroGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCambiarParametroGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocambiarparametrogeneralsEliminados= new ArrayList<ProcesoCambiarParametroGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCambiarParametroGeneral();
		
				///*ProcesoCambiarParametroGeneralSessionBean*/this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			
			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
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
					this.iNumeroPaginacion=ProcesoCambiarParametroGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCambiarParametroGeneralConstantesFunciones.getClassesForeignKeysOfProcesoCambiarParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocambiarparametrogeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocambiarparametrogeneralsAux= new ArrayList<ProcesoCambiarParametroGeneral>();
			
				
			procesocambiarparametrogeneralLogic.setDatosCliente(this.datosCliente);
			procesocambiarparametrogeneralLogic.setDatosDeep(this.datosDeep);
			procesocambiarparametrogeneralLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCambiarParametroGeneral")) {
				this.sDetalleReporte=ProcesoCambiarParametroGeneralConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarParametroGeneral(id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarParametroGeneralConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarParametroGeneral(id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarParametroGeneralConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarParametroGeneral(id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()==null||procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocambiarparametrogenerals==null|| procesocambiarparametrogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarparametrogeneralsAux=new ArrayList<ProcesoCambiarParametroGeneral>();
						procesocambiarparametrogeneralsAux.addAll(procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarparametrogeneralsAux=new ArrayList<ProcesoCambiarParametroGeneral>();
							procesocambiarparametrogeneralsAux.addAll(procesocambiarparametrogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarParametroGeneralConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarParametroGeneral(id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarParametroGeneralConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarParametroGeneral(id_tipo_visualBusquedaProcesoCambiarParametroGeneral,con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,con_botones_tool_barBusquedaProcesoCambiarParametroGeneral,id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,path_exportarBusquedaProcesoCambiarParametroGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCambiarParametroGenerals("BusquedaProcesoCambiarParametroGeneral",procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCambiarParametroGenerals("BusquedaProcesoCambiarParametroGeneral",procesocambiarparametrogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarparametrogeneralLogic.setProcesoCambiarParametroGenerals(new ArrayList<ProcesoCambiarParametroGeneral>());
						procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().addAll(procesocambiarparametrogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarparametrogenerals=new ArrayList<ProcesoCambiarParametroGeneral>();
							procesocambiarparametrogenerals.addAll(procesocambiarparametrogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCambiarParametroGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCambiarParametroGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarparametrogenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarparametrogenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) {
		Boolean permite=true;
		
		if(this.procesocambiarparametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCambiarParametroGeneralConstantesFunciones.getOrderByListaProcesoCambiarParametroGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCambiarParametroGeneralConstantesFunciones.getOrderByListaProcesoCambiarParametroGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				if(procesocambiarparametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarparametrogeneralTotales=procesocambiarparametrogeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:this.procesocambiarparametrogenerals) {
				if(procesocambiarparametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarparametrogeneralTotales=procesocambiarparametrogeneral;
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
			this.procesocambiarparametrogeneralAux=new ProcesoCambiarParametroGeneral();
			this.procesocambiarparametrogeneralAux.setsType(Constantes2.S_TOTALES);
			this.procesocambiarparametrogeneralAux.setIsNew(false);
			this.procesocambiarparametrogeneralAux.setIsChanged(false);
			this.procesocambiarparametrogeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCambiarParametroGeneralConstantesFunciones.TotalizarValoresFilaProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals(),this.procesocambiarparametrogeneralAux);
				
				//this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().add(this.procesocambiarparametrogeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCambiarParametroGeneralConstantesFunciones.TotalizarValoresFilaProcesoCambiarParametroGeneral(this.procesocambiarparametrogenerals,this.procesocambiarparametrogeneralAux);
				
				this.procesocambiarparametrogenerals.add(this.procesocambiarparametrogeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocambiarparametrogeneralTotales=new ProcesoCambiarParametroGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().remove(procesocambiarparametrogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarparametrogenerals.remove(procesocambiarparametrogeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocambiarparametrogeneralTotales=new ProcesoCambiarParametroGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				if(procesocambiarparametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarparametrogeneralTotales=procesocambiarparametrogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarParametroGeneralConstantesFunciones.TotalizarValoresFilaProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals(),procesocambiarparametrogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:this.procesocambiarparametrogenerals) {
				if(procesocambiarparametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarparametrogeneralTotales=procesocambiarparametrogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarParametroGeneralConstantesFunciones.TotalizarValoresFilaProcesoCambiarParametroGeneral(this.procesocambiarparametrogenerals,procesocambiarparametrogeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCambiarParametroGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoDelimiter()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDelimiter";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoExportar()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoExportar";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFondo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondoBorde()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFondoBorde";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondoControl()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFondoControl";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoTamanioControl()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTamanioControl";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoVisual()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoVisual";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral(String sFinalQuery,Long id_tipo_visual,Boolean con_mensaje_confirmacion,Boolean con_botones_tool_bar,Long id_tipo_fondo,Long id_tipo_fondo_borde,Long id_tipo_fondo_control,Long id_tipo_tamanio_control,Long id_tipo_exportar,Long id_tipo_delimiter,Boolean con_exportar_cabecera,String path_exportar)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral(sFinalQuery,this.pagination,id_tipo_visual,con_mensaje_confirmacion,con_botones_tool_bar,id_tipo_fondo,id_tipo_fondo_borde,id_tipo_fondo_control,id_tipo_tamanio_control,id_tipo_exportar,id_tipo_delimiter,con_exportar_cabecera,path_exportar);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoDelimiter(String sFinalQuery,Long id_tipo_delimiter)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoDelimiter(sFinalQuery,this.pagination,id_tipo_delimiter);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoExportar(String sFinalQuery,Long id_tipo_exportar)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoExportar(sFinalQuery,this.pagination,id_tipo_exportar);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondo(String sFinalQuery,Long id_tipo_fondo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoFondo(sFinalQuery,this.pagination,id_tipo_fondo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondoBorde(String sFinalQuery,Long id_tipo_fondo_borde)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoFondoBorde(sFinalQuery,this.pagination,id_tipo_fondo_borde);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoFondoControl(String sFinalQuery,Long id_tipo_fondo_control)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoFondoControl(sFinalQuery,this.pagination,id_tipo_fondo_control);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoTamanioControl(String sFinalQuery,Long id_tipo_tamanio_control)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoTamanioControl(sFinalQuery,this.pagination,id_tipo_tamanio_control);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCambiarParametroGeneralsFK_IdTipoVisual(String sFinalQuery,Long id_tipo_visual)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGeneralsFK_IdTipoVisual(sFinalQuery,this.pagination,id_tipo_visual);
				
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
	
	public void inicializarPermisosProcesoCambiarParametroGeneral() {
		this.isPermisoTodoProcesoCambiarParametroGeneral=false;
		this.isPermisoNuevoProcesoCambiarParametroGeneral=false;
		this.isPermisoActualizarProcesoCambiarParametroGeneral=false;
		this.isPermisoActualizarOriginalProcesoCambiarParametroGeneral=false;
		this.isPermisoEliminarProcesoCambiarParametroGeneral=false;
		this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral=false;
		this.isPermisoConsultaProcesoCambiarParametroGeneral=true;
		this.isPermisoBusquedaProcesoCambiarParametroGeneral=true;
		this.isPermisoReporteProcesoCambiarParametroGeneral=true;
		this.isPermisoOrdenProcesoCambiarParametroGeneral=false;		
		this.isPermisoPaginacionMedioProcesoCambiarParametroGeneral=false;		
		this.isPermisoPaginacionAltoProcesoCambiarParametroGeneral=false;		
		this.isPermisoPaginacionTodoProcesoCambiarParametroGeneral=false;		
		this.isPermisoCopiarProcesoCambiarParametroGeneral=false;		
		this.isPermisoVerFormProcesoCambiarParametroGeneral=false;		
		this.isPermisoDuplicarProcesoCambiarParametroGeneral=false;
		this.isPermisoOrdenProcesoCambiarParametroGeneral=false;
	}
	
	public void setPermisosUsuarioProcesoCambiarParametroGeneral(Boolean isPermiso) {
		this.isPermisoTodoProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoNuevoProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoActualizarProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoEliminarProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoConsultaProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoBusquedaProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoReporteProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoOrdenProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoCopiarProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoVerFormProcesoCambiarParametroGeneral=isPermiso;		
		this.isPermisoDuplicarProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoOrdenProcesoCambiarParametroGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCambiarParametroGeneral(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoNuevoProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoActualizarProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoEliminarProcesoCambiarParametroGeneral=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral=isPermiso;
		//this.isPermisoConsultaProcesoCambiarParametroGeneral=isPermiso;
		//this.isPermisoBusquedaProcesoCambiarParametroGeneral=isPermiso;
		//this.isPermisoReporteProcesoCambiarParametroGeneral=isPermiso;
		//this.isPermisoOrdenProcesoCambiarParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCambiarParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCambiarParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCambiarParametroGeneral=isPermiso;		
		//this.isPermisoCopiarProcesoCambiarParametroGeneral=isPermiso;		
		//this.isPermisoDuplicarProcesoCambiarParametroGeneral=isPermiso;
		//this.isPermisoOrdenProcesoCambiarParametroGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarParametroGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCambiarParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarParametroGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCambiarParametroGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCambiarParametroGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCambiarParametroGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCambiarParametroGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCambiarParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCambiarParametroGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCambiarParametroGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCambiarParametroGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCambiarParametroGeneral=this.isPermisoActualizarProcesoCambiarParametroGeneral;
			this.isPermisoEliminarProcesoCambiarParametroGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCambiarParametroGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCambiarParametroGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCambiarParametroGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCambiarParametroGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarParametroGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCambiarParametroGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCambiarParametroGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCambiarParametroGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCambiarParametroGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCambiarParametroGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCambiarParametroGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarParametroGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCambiarParametroGeneral.setToolTipText(this.jTableDatosProcesoCambiarParametroGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCambiarParametroGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCambiarParametroGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCambiarParametroGeneral() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCambiarParametroGeneralListas()throws Exception {
		try	{						
			
				this.tipovisualsForeignKey=new ArrayList();
				this.tipofondosForeignKey=new ArrayList();
				this.tipofondobordesForeignKey=new ArrayList();
				this.tipofondocontrolsForeignKey=new ArrayList();
				this.tipotamaniocontrolsForeignKey=new ArrayList();
				this.tipoexportarsForeignKey=new ArrayList();
				this.tipodelimitersForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCambiarParametroGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoVisualListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFondoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFondoBordeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFondoControlListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTamanioControlListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoExportarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDelimiterListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoVisualListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovisualsForeignKey==null||this.tipovisualsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoVisualConstantesFunciones.getArrayColumnasGlobalesTipoVisual(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoVisualConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoVisualConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoVisualsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofondosForeignKey==null||this.tipofondosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFondoConstantesFunciones.getArrayColumnasGlobalesTipoFondo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFondoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFondoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFondosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondoBordeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofondobordesForeignKey==null||this.tipofondobordesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFondoConstantesFunciones.getArrayColumnasGlobalesTipoFondo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFondoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFondoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFondoBordesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondoControlListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofondocontrolsForeignKey==null||this.tipofondocontrolsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFondoControlConstantesFunciones.getArrayColumnasGlobalesTipoFondoControl(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFondoControlConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFondoControlConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFondoControlsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTamanioControlListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotamaniocontrolsForeignKey==null||this.tipotamaniocontrolsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTamanioControlConstantesFunciones.getArrayColumnasGlobalesTipoTamanioControl(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTamanioControlConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTamanioControlConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTamanioControlsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoExportarListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoexportarsForeignKey==null||this.tipoexportarsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoExportarConstantesFunciones.getArrayColumnasGlobalesTipoExportar(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoExportarConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoExportarConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoExportarsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDelimiterListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodelimitersForeignKey==null||this.tipodelimitersForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDelimiterConstantesFunciones.getArrayColumnasGlobalesTipoDelimiter(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDelimiterConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDelimiterConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDelimitersForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCambiarParametroGeneral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoVisual();
			this.addItemDefectoCombosForeignKeyTipoFondo();
			this.addItemDefectoCombosForeignKeyTipoFondoBorde();
			this.addItemDefectoCombosForeignKeyTipoFondoControl();
			this.addItemDefectoCombosForeignKeyTipoTamanioControl();
			this.addItemDefectoCombosForeignKeyTipoExportar();
			this.addItemDefectoCombosForeignKeyTipoDelimiter();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoVisual()throws Exception {
		try {
			if(this.procesocambiarparametrogeneralSessionBean==null) {
				this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
			}

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoVisual()) {
				TipoVisual tipovisual=new TipoVisual();
				TipoVisualConstantesFunciones.setTipoVisualDescripcion(tipovisual,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovisual.setId(null);

				if(!TipoVisualConstantesFunciones.ExisteEnLista(this.tipovisualsForeignKey,tipovisual,true)) {

					this.tipovisualsForeignKey.add(0,tipovisual);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFondo()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondo()) {
				TipoFondo tipofondo=new TipoFondo();
				TipoFondoConstantesFunciones.setTipoFondoDescripcion(tipofondo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipofondo.setId(null);

				if(!TipoFondoConstantesFunciones.ExisteEnLista(this.tipofondosForeignKey,tipofondo,true)) {

					this.tipofondosForeignKey.add(0,tipofondo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFondoBorde()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondoBorde()) {
				TipoFondo tipofondoborde=new TipoFondo();
				TipoFondoConstantesFunciones.setTipoFondoDescripcion(tipofondoborde,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipofondoborde.setId(null);

				if(!TipoFondoConstantesFunciones.ExisteEnLista(this.tipofondobordesForeignKey,tipofondoborde,true)) {

					this.tipofondobordesForeignKey.add(0,tipofondoborde);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFondoControl()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoFondoControl()) {
				TipoFondoControl tipofondocontrol=new TipoFondoControl();
				TipoFondoControlConstantesFunciones.setTipoFondoControlDescripcion(tipofondocontrol,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipofondocontrol.setId(null);

				if(!TipoFondoControlConstantesFunciones.ExisteEnLista(this.tipofondocontrolsForeignKey,tipofondocontrol,true)) {

					this.tipofondocontrolsForeignKey.add(0,tipofondocontrol);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTamanioControl()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoTamanioControl()) {
				TipoTamanioControl tipotamaniocontrol=new TipoTamanioControl();
				TipoTamanioControlConstantesFunciones.setTipoTamanioControlDescripcion(tipotamaniocontrol,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotamaniocontrol.setId(null);

				if(!TipoTamanioControlConstantesFunciones.ExisteEnLista(this.tipotamaniocontrolsForeignKey,tipotamaniocontrol,true)) {

					this.tipotamaniocontrolsForeignKey.add(0,tipotamaniocontrol);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoExportar()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoExportar()) {
				TipoExportar tipoexportar=new TipoExportar();
				TipoExportarConstantesFunciones.setTipoExportarDescripcion(tipoexportar,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoexportar.setId(null);

				if(!TipoExportarConstantesFunciones.ExisteEnLista(this.tipoexportarsForeignKey,tipoexportar,true)) {

					this.tipoexportarsForeignKey.add(0,tipoexportar);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDelimiter()throws Exception {
		try {

			if(!this.procesocambiarparametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDelimiter()) {
				TipoDelimiter tipodelimiter=new TipoDelimiter();
				TipoDelimiterConstantesFunciones.setTipoDelimiterDescripcion(tipodelimiter,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodelimiter.setId(null);

				if(!TipoDelimiterConstantesFunciones.ExisteEnLista(this.tipodelimitersForeignKey,tipodelimiter,true)) {

					this.tipodelimitersForeignKey.add(0,tipodelimiter);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCambiarParametroGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCambiarParametroGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCambiarParametroGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarParametroGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral)throws Exception {	
		try {
			
			this.setActualTipoVisualForeignKey(procesocambiarparametrogeneral.getid_tipo_visual(),false,"Formulario");
			this.setActualTipoFondoForeignKey(procesocambiarparametrogeneral.getid_tipo_fondo(),false,"Formulario");
			this.setActualTipoFondoBordeForeignKey(procesocambiarparametrogeneral.getid_tipo_fondo_borde(),false,"Formulario");
			this.setActualTipoFondoControlForeignKey(procesocambiarparametrogeneral.getid_tipo_fondo_control(),false,"Formulario");
			this.setActualTipoTamanioControlForeignKey(procesocambiarparametrogeneral.getid_tipo_tamanio_control(),false,"Formulario");
			this.setActualTipoExportarForeignKey(procesocambiarparametrogeneral.getid_tipo_exportar(),false,"Formulario");
			this.setActualTipoDelimiterForeignKey(procesocambiarparametrogeneral.getid_tipo_delimiter(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCambiarParametroGeneral()throws Exception {	
		try {
			
			this.setActualTipoVisualForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_visual(),false,"Formulario");
			this.setActualTipoFondoForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_fondo(),false,"Formulario");
			this.setActualTipoFondoBordeForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_fondo_borde(),false,"Formulario");
			this.setActualTipoFondoControlForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_fondo_control(),false,"Formulario");
			this.setActualTipoTamanioControlForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_tamanio_control(),false,"Formulario");
			this.setActualTipoExportarForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_exportar(),false,"Formulario");
			this.setActualTipoDelimiterForeignKey(this.procesocambiarparametrogeneralConstantesFunciones.getid_tipo_delimiter(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarParametroGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCambiarParametroGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCambiarParametroGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCambiarParametroGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCambiarParametroGeneral()throws Exception {
		try {
			

			this.cargarCombosFrameTipoVisualsForeignKey("Todos");
			this.cargarCombosFrameTipoFondosForeignKey("Todos");
			this.cargarCombosFrameTipoFondoBordesForeignKey("Todos");
			this.cargarCombosFrameTipoFondoControlsForeignKey("Todos");
			this.cargarCombosFrameTipoTamanioControlsForeignKey("Todos");
			this.cargarCombosFrameTipoExportarsForeignKey("Todos");
			this.cargarCombosFrameTipoDelimitersForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCambiarParametroGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoVisualsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFondosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFondoBordesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFondoControlsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTamanioControlsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoExportarsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDelimitersForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCambiarParametroGeneral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean(); 
		this.procesocambiarparametrogeneralConstantesFunciones=new ProcesoCambiarParametroGeneralConstantesFunciones(); 
		this.procesocambiarparametrogeneralBean=new ProcesoCambiarParametroGeneral();//(this.procesocambiarparametrogeneralConstantesFunciones); 		
		this.procesocambiarparametrogeneralReturnGeneral=new ProcesoCambiarParametroGeneralParameterReturnGeneral(); 
		
		this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarparametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCambiarParametroGeneral(true);
			
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
			
			this.procesocambiarparametrogeneralConstantesFunciones=new ProcesoCambiarParametroGeneralConstantesFunciones(); 
			this.procesocambiarparametrogeneralBean=new ProcesoCambiarParametroGeneral();//this.procesocambiarparametrogeneralConstantesFunciones); 			
			this.procesocambiarparametrogeneralReturnGeneral=new ProcesoCambiarParametroGeneralParameterReturnGeneral(); 
		
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Parametro General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocambiarparametrogeneral=new ProcesoCambiarParametroGeneral();
			this.procesocambiarparametrogenerals = new ArrayList<ProcesoCambiarParametroGeneral>();
			this.procesocambiarparametrogeneralsAux = new ArrayList<ProcesoCambiarParametroGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic=new ProcesoCambiarParametroGeneralLogic();
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocambiarparametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral);	
					}
					
					if(this.jInternalFrameImportacionProcesoCambiarParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarParametroGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCambiarParametroGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral);
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral);
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCambiarParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarParametroGeneral);
					this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setVisible(false);
					this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarParametroGeneral);
					this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setVisible(false);
					this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCambiarParametroGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCambiarParametroGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocambiarparametrogeneralReturnGeneral=new ProcesoCambiarParametroGeneralParameterReturnGeneral();
			
			this.procesocambiarparametrogeneralParameterGeneral=new ProcesoCambiarParametroGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarParametroGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado(),this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarParametroGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado(),this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			
			
			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=true;
			this.isVisibilidadFK_IdTipoDelimiter=true;
			this.isVisibilidadFK_IdTipoExportar=true;
			this.isVisibilidadFK_IdTipoFondo=true;
			this.isVisibilidadFK_IdTipoFondoBorde=true;
			this.isVisibilidadFK_IdTipoFondoControl=true;
			this.isVisibilidadFK_IdTipoTamanioControl=true;
			this.isVisibilidadFK_IdTipoVisual=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCambiarParametroGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCambiarParametroGeneral(false);
			
			this.setPermisosUsuarioProcesoCambiarParametroGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() && this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCambiarParametroGeneralClasesRelacionadas();
			}
			
			if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCambiarParametroGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCambiarParametroGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarParametroGeneral();
			}
			
			if(!this.isPermisoBusquedaProcesoCambiarParametroGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCambiarParametroGeneralConstantesFunciones.getTiposSeleccionarProcesoCambiarParametroGeneral());
				
				this.tiposColumnasSelect=ProcesoCambiarParametroGeneralConstantesFunciones.getTiposSeleccionarProcesoCambiarParametroGeneral(true);
				
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
			//if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCambiarParametroGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCambiarParametroGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCambiarParametroGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarParametroGeneral() ;
			
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
			
			this.tipovisualLogic=new TipoVisualLogic();
			this.tipofondoLogic=new TipoFondoLogic();
			this.tipofondobordeLogic=new TipoFondoLogic();
			this.tipofondocontrolLogic=new TipoFondoControlLogic();
			this.tipotamaniocontrolLogic=new TipoTamanioControlLogic();
			this.tipoexportarLogic=new TipoExportarLogic();
			this.tipodelimiterLogic=new TipoDelimiterLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocambiarparametrogeneralImplementable= (ProcesoCambiarParametroGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarParametroGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocambiarparametrogeneralImplementableHome= (ProcesoCambiarParametroGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarParametroGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocambiarparametrogenerals= new ArrayList<ProcesoCambiarParametroGeneral>();
			this.procesocambiarparametrogeneralsEliminados= new ArrayList<ProcesoCambiarParametroGeneral>();
						
			this.isEsNuevoProcesoCambiarParametroGeneral=false;
			this.esParaAccionDesdeFormularioProcesoCambiarParametroGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipovisualsForeignKey=new ArrayList<TipoVisual>() ;
			this.tipofondosForeignKey=new ArrayList<TipoFondo>() ;
			this.tipofondobordesForeignKey=new ArrayList<TipoFondo>() ;
			this.tipofondocontrolsForeignKey=new ArrayList<TipoFondoControl>() ;
			this.tipotamaniocontrolsForeignKey=new ArrayList<TipoTamanioControl>() ;
			this.tipoexportarsForeignKey=new ArrayList<TipoExportar>() ;
			this.tipodelimitersForeignKey=new ArrayList<TipoDelimiter>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCambiarParametroGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCambiarParametroGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCambiarParametroGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCambiarParametroGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCambiarParametroGeneral();
			}
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCambiarParametroGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCambiarParametroGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCambiarParametroGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCambiarParametroGeneral")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCambiarParametroGeneral();	
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
	
	public void cargarCombosForeignKeyProcesoCambiarParametroGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCambiarParametroGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCambiarParametroGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCambiarParametroGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCambiarParametroGeneral();
		
		this.cargarCombosFrameForeignKeyProcesoCambiarParametroGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCambiarParametroGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCambiarParametroGeneral();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoVisual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoVisualListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoVisual();
				this.cargarCombosFrameTipoVisualsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoVisual(this.tipovisualsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFondoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFondo();
				this.cargarCombosFrameTipoFondosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFondo(this.tipofondosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondoBorde(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFondoBordeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFondoBorde();
				this.cargarCombosFrameTipoFondoBordesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFondoBorde(this.tipofondobordesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFondoControl(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFondoControlListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFondoControl();
				this.cargarCombosFrameTipoFondoControlsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFondoControl(this.tipofondocontrolsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTamanioControl(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTamanioControlListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTamanioControl();
				this.cargarCombosFrameTipoTamanioControlsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTamanioControl(this.tipotamaniocontrolsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoExportar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoExportarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoExportar();
				this.cargarCombosFrameTipoExportarsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoExportar(this.tipoexportarsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDelimiter(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDelimiterListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDelimiter();
				this.cargarCombosFrameTipoDelimitersForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDelimiter(this.tipodelimitersForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			
			if(jTableDatosProcesoCambiarParametroGeneral.getRowCount()>=1) {
				jTableDatosProcesoCambiarParametroGeneral.removeRowSelectionInterval(0, jTableDatosProcesoCambiarParametroGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCambiarParametroGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarParametroGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(true);			
			//this.procesocambiarparametrogeneral=new ProcesoCambiarParametroGeneral();
			//this.procesocambiarparametrogeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral() ;
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarParametroGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocambiarparametrogeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);				
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCambiarParametroGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRows().length;			
			}
			
			procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCambiarParametroGeneral--;			
				//ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux= new ProcesoCambiarParametroGeneral();			
				//procesocambiarparametrogeneralAux.setId(this.iIdNuevoProcesoCambiarParametroGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCambiarParametroGeneral procesocambiarparametrogeneralOrigen=new ProcesoCambiarParametroGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralOrigen : procesocambiarparametrogeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocambiarparametrogeneralOrigen =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarparametrogeneralOrigen =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCambiarParametroGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocambiarparametrogeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCambiarParametroGeneral(procesocambiarparametrogeneralOrigen,this.procesocambiarparametrogeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().add(this.procesocambiarparametrogeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogenerals.add(this.procesocambiarparametrogeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
				
				this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarParametroGeneral(), this.getIndiceNuevoProcesoCambiarParametroGeneral());
				
				int iLastRow =  this.jTableDatosProcesoCambiarParametroGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarParametroGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarParametroGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();									
		
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneralOrigen=new ProcesoCambiarParametroGeneral();
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneralDestino=new ProcesoCambiarParametroGeneral();
				
			procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocambiarparametrogeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarparametrogeneralOrigen =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarparametrogeneralOrigen =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarparametrogeneralDestino =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarparametrogeneralDestino =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocambiarparametrogeneralOrigen =procesocambiarparametrogeneralsSeleccionados.get(0);
				procesocambiarparametrogeneralDestino =procesocambiarparametrogeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCambiarParametroGeneral(procesocambiarparametrogeneralOrigen,procesocambiarparametrogeneralDestino,true,false);
				
				procesocambiarparametrogeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocambiarparametrogeneralDestino,procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocambiarparametrogeneralDestino,procesocambiarparametrogenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
				
				//this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarParametroGeneral(), this.getIndiceNuevoProcesoCambiarParametroGeneral());
				
				int iLastRow =  this.jTableDatosProcesoCambiarParametroGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarParametroGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarParametroGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCambiarParametroGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(!isVisible);
			this.jPanelAccionesProcesoCambiarParametroGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCambiarParametroGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCambiarParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCambiarParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCambiarParametroGeneral();
			
			this.abrirFrameOrderByProcesoCambiarParametroGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCambiarParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCambiarParametroGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarParametroGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSize(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jContentPaneDetalleProcesoCambiarParametroGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jContentPaneDetalleProcesoCambiarParametroGeneral.getWidth(),ProcesoCambiarParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jContentPaneDetalleProcesoCambiarParametroGeneral.getWidth(),ProcesoCambiarParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jContentPaneDetalleProcesoCambiarParametroGeneral.getWidth(),ProcesoCambiarParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCambiarParametroGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCambiarParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCambiarParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarParametroGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarParametroGeneral);
				this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setVisible(false);
				this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarParametroGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarParametroGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCambiarParametroGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCambiarParametroGeneral==null) {
				
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral=new ImportacionJInternalFrame(ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarParametroGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarParametroGeneral);
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setVisible(false);
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSelected(false);


				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarParametroGeneral"));
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarParametroGeneral"));
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarParametroGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCambiarParametroGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral==null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral=new ReporteDinamicoJInternalFrame(ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral);
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarParametroGeneral"));
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarParametroGeneral"));
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarParametroGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarParametroGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCambiarParametroGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarParametroGeneral);
			
	       	this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.dispose();
			//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCambiarParametroGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCambiarParametroGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setVisible(true);
	        this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCambiarParametroGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setVisible(true);
	        this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCambiarParametroGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setVisible(false);
	        this.jInternalFrameOrderByProcesoCambiarParametroGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCambiarParametroGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCambiarParametroGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setVisible(false);
	        this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCambiarParametroGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCambiarParametroGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(true);
			//this.isEsNuevoProcesoCambiarParametroGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false) ;
			
			if(procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarParametroGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCambiarParametroGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCambiarParametroGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(true);
			//this.isEsNuevoProcesoCambiarParametroGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocambiarparametrogeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false) ;
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarParametroGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoVisual(List<TipoVisual> tipovisualsForeignKey)throws Exception{
		TableColumn tableColumnTipoVisual=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL));
		TableCellEditor tableCellEditorTipoVisual =tableColumnTipoVisual.getCellEditor();

		TipoVisualTableCell tipovisualTableCellFk=(TipoVisualTableCell)tableCellEditorTipoVisual;

		if(tipovisualTableCellFk!=null) {
			tipovisualTableCellFk.settipovisualsForeignKey(tipovisualsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovisualTableCellFk.setRowActual(intSelectedRow);
			//tipovisualTableCellFk.settipovisualsForeignKeyActual(tipovisualsForeignKey);
		//}


		if(tipovisualTableCellFk!=null) {
			tipovisualTableCellFk.RecargarTipoVisualsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFondo(List<TipoFondo> tipofondosForeignKey)throws Exception{
		TableColumn tableColumnTipoFondo=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO));
		TableCellEditor tableCellEditorTipoFondo =tableColumnTipoFondo.getCellEditor();

		TipoFondoTableCell tipofondoTableCellFk=(TipoFondoTableCell)tableCellEditorTipoFondo;

		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.settipofondosForeignKey(tipofondosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofondoTableCellFk.setRowActual(intSelectedRow);
			//tipofondoTableCellFk.settipofondosForeignKeyActual(tipofondosForeignKey);
		//}


		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.RecargarTipoFondosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFondoBorde(List<TipoFondo> tipofondobordesForeignKey)throws Exception{
		TableColumn tableColumnTipoFondoBorde=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE));
		TableCellEditor tableCellEditorTipoFondoBorde =tableColumnTipoFondoBorde.getCellEditor();

		TipoFondoTableCell tipofondoTableCellFk=(TipoFondoTableCell)tableCellEditorTipoFondoBorde;

		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.settipofondosForeignKey(tipofondobordesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofondoTableCellFk.setRowActual(intSelectedRow);
			//tipofondoTableCellFk.settipofondosForeignKeyActual(tipofondobordesForeignKey);
		//}


		if(tipofondoTableCellFk!=null) {
			tipofondoTableCellFk.RecargarTipoFondosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFondoControl(List<TipoFondoControl> tipofondocontrolsForeignKey)throws Exception{
		TableColumn tableColumnTipoFondoControl=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL));
		TableCellEditor tableCellEditorTipoFondoControl =tableColumnTipoFondoControl.getCellEditor();

		TipoFondoControlTableCell tipofondocontrolTableCellFk=(TipoFondoControlTableCell)tableCellEditorTipoFondoControl;

		if(tipofondocontrolTableCellFk!=null) {
			tipofondocontrolTableCellFk.settipofondocontrolsForeignKey(tipofondocontrolsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofondocontrolTableCellFk.setRowActual(intSelectedRow);
			//tipofondocontrolTableCellFk.settipofondocontrolsForeignKeyActual(tipofondocontrolsForeignKey);
		//}


		if(tipofondocontrolTableCellFk!=null) {
			tipofondocontrolTableCellFk.RecargarTipoFondoControlsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTamanioControl(List<TipoTamanioControl> tipotamaniocontrolsForeignKey)throws Exception{
		TableColumn tableColumnTipoTamanioControl=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL));
		TableCellEditor tableCellEditorTipoTamanioControl =tableColumnTipoTamanioControl.getCellEditor();

		TipoTamanioControlTableCell tipotamaniocontrolTableCellFk=(TipoTamanioControlTableCell)tableCellEditorTipoTamanioControl;

		if(tipotamaniocontrolTableCellFk!=null) {
			tipotamaniocontrolTableCellFk.settipotamaniocontrolsForeignKey(tipotamaniocontrolsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotamaniocontrolTableCellFk.setRowActual(intSelectedRow);
			//tipotamaniocontrolTableCellFk.settipotamaniocontrolsForeignKeyActual(tipotamaniocontrolsForeignKey);
		//}


		if(tipotamaniocontrolTableCellFk!=null) {
			tipotamaniocontrolTableCellFk.RecargarTipoTamanioControlsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoExportar(List<TipoExportar> tipoexportarsForeignKey)throws Exception{
		TableColumn tableColumnTipoExportar=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR));
		TableCellEditor tableCellEditorTipoExportar =tableColumnTipoExportar.getCellEditor();

		TipoExportarTableCell tipoexportarTableCellFk=(TipoExportarTableCell)tableCellEditorTipoExportar;

		if(tipoexportarTableCellFk!=null) {
			tipoexportarTableCellFk.settipoexportarsForeignKey(tipoexportarsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoexportarTableCellFk.setRowActual(intSelectedRow);
			//tipoexportarTableCellFk.settipoexportarsForeignKeyActual(tipoexportarsForeignKey);
		//}


		if(tipoexportarTableCellFk!=null) {
			tipoexportarTableCellFk.RecargarTipoExportarsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDelimiter(List<TipoDelimiter> tipodelimitersForeignKey)throws Exception{
		TableColumn tableColumnTipoDelimiter=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER));
		TableCellEditor tableCellEditorTipoDelimiter =tableColumnTipoDelimiter.getCellEditor();

		TipoDelimiterTableCell tipodelimiterTableCellFk=(TipoDelimiterTableCell)tableCellEditorTipoDelimiter;

		if(tipodelimiterTableCellFk!=null) {
			tipodelimiterTableCellFk.settipodelimitersForeignKey(tipodelimitersForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodelimiterTableCellFk.setRowActual(intSelectedRow);
			//tipodelimiterTableCellFk.settipodelimitersForeignKeyActual(tipodelimitersForeignKey);
		//}


		if(tipodelimiterTableCellFk!=null) {
			tipodelimiterTableCellFk.RecargarTipoDelimitersForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarParametroGeneral(false);
			
			//if(!this.isEsNuevoProcesoCambiarParametroGeneral) {								
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				
			}
			
			if(this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCambiarParametroGeneral=true;
					this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
					this.isEsNuevoProcesoCambiarParametroGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCambiarParametroGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCambiarParametroGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(false);
			
												
				
				if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCambiarParametroGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocambiarparametrogeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarparametrogeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarparametrogeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCambiarParametroGeneralModel) this.jTableDatosProcesoCambiarParametroGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCambiarParametroGeneral=true;
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
				this.isEsNuevoProcesoCambiarParametroGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(false);
				
				
				
				if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCambiarParametroGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCambiarParametroGeneral.getRowCount()>=1) {
				jTableDatosProcesoCambiarParametroGeneral.removeRowSelectionInterval(0, jTableDatosProcesoCambiarParametroGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCambiarParametroGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(false) ;
			
			this.isEsNuevoProcesoCambiarParametroGeneral=false;
			
			if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCambiarParametroGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				
				//SI ES MANUAL
				if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCambiarParametroGeneral--;			
			//ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux= new ProcesoCambiarParametroGeneral();			
			//procesocambiarparametrogeneralAux.setId(this.iIdNuevoProcesoCambiarParametroGeneral);
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCambiarParametroGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
			
			this.procesocambiarparametrogeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().add(this.procesocambiarparametrogeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocambiarparametrogenerals.add(this.procesocambiarparametrogeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			
			this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarParametroGeneral(), this.getIndiceNuevoProcesoCambiarParametroGeneral());
			
			int iLastRow =  this.jTableDatosProcesoCambiarParametroGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCambiarParametroGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCambiarParametroGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();
			}
			
			//this.abrirFrameTreeProcesoCambiarParametroGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setFileImportacion(this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCambiarParametroGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		

		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCambiarParametroGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCambiarParametroGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoVisual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoVisual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoVisual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoVisual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFondo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFondo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFondo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFondo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFondoBorde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFondoBorde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFondoBorde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFondoBorde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFondoControl_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFondoControl_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFondoControl_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFondoControl_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTamanioControl_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTamanioControl_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTamanioControl_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTamanioControl_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nMensajeConfirmacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nMensajeConfirmacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nMensajeConfirmacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nMensajeConfirmacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nBotonesToolBar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nBotonesToolBar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nBotonesToolBar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nBotonesToolBar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoExportar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoExportar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoExportar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoExportar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDelimiter_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDelimiter_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDelimiter_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDelimiter_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nExportarCabecera_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nExportarCabecera_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nExportarCabecera_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nExportarCabecera_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_thExportar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_thExportar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_thExportar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_thExportar_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL:
					sNombreCampoCategoria="id_tipo_visual";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO:
					sNombreCampoCategoria="id_tipo_fondo";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE:
					sNombreCampoCategoria="id_tipo_fondo_borde";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL:
					sNombreCampoCategoria="id_tipo_fondo_control";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL:
					sNombreCampoCategoria="id_tipo_tamanio_control";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION:
					sNombreCampoCategoria="con_mensaje_confirmacion";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR:
					sNombreCampoCategoria="con_botones_tool_bar";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR:
					sNombreCampoCategoria="id_tipo_exportar";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER:
					sNombreCampoCategoria="id_tipo_delimiter";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA:
					sNombreCampoCategoria="con_exportar_cabecera";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR:
					sNombreCampoCategoria="path_exportar";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL:
					sNombreCampoCategoriaValor="id_tipo_visual";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO:
					sNombreCampoCategoriaValor="id_tipo_fondo";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE:
					sNombreCampoCategoriaValor="id_tipo_fondo_borde";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL:
					sNombreCampoCategoriaValor="id_tipo_fondo_control";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL:
					sNombreCampoCategoriaValor="id_tipo_tamanio_control";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION:
					sNombreCampoCategoriaValor="con_mensaje_confirmacion";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR:
					sNombreCampoCategoriaValor="con_botones_tool_bar";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR:
					sNombreCampoCategoriaValor="id_tipo_exportar";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER:
					sNombreCampoCategoriaValor="id_tipo_delimiter";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA:
					sNombreCampoCategoriaValor="con_exportar_cabecera";
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR:
					sNombreCampoCategoriaValor="path_exportar";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Visual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_visual");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Fondo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_fondo");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Fondo Borde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_fondo_borde");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Fondo Control",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_fondo_control");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Tamanio Control",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_tamanio_control");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Mensaje Confirmacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_mensaje_confirmacion");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Botones Tool Bar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_botones_tool_bar");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Exportar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_exportar");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Delimiter",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_delimiter");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Exportar Cabecera",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_exportar_cabecera");
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Path Exportar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"path_exportar");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCambiarParametroGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipovisual_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipofondo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipofondoborde_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipofondocontrol_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.getcon_mensaje_confirmacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.getcon_botones_tool_bar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipoexportar_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.gettipodelimiter_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.getcon_exportar_cabecera());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR);
					iRow++;

					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral:procesocambiarparametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarparametrogeneral.getpath_exportar());
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
			//	this.getFilaCabeceraExportarExcelProcesoCambiarParametroGeneral(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCambiarParametroGeneral(procesocambiarparametrogeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCambiarParametroGeneral(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarParametroGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCambiarParametroGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCambiarParametroGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCambiarParametroGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCambiarParametroGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCambiarParametroGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCambiarParametroGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCambiarParametroGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCambiarParametroGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCambiarParametroGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCambiarParametroGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCambiarParametroGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCambiarParametroGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarParametroGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarParametroGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCambiarParametroGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral();
		
		this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarParametroGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarParametroGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarParametroGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarParametroGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCambiarParametroGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCambiarParametroGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarParametroGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarParametroGeneral() throws Exception {
		try	{
			if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarParametroGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarParametroGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarParametroGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			
			if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCambiarParametroGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarParametroGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarParametroGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCambiarParametroGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_visualBusquedaProcesoCambiarParametroGeneral=((TipoVisual)this.jComboBoxid_tipo_visualBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		this.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral=this.jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.isSelected();
		this.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral=this.jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.isSelected();
		if(this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral=((TipoFondo)this.jComboBoxid_tipo_fondoBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral=((TipoFondo)this.jComboBoxid_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral=((TipoFondoControl)this.jComboBoxid_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral=((TipoTamanioControl)this.jComboBoxid_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral=((TipoExportar)this.jComboBoxid_tipo_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()!=null){this.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral=((TipoDelimiter)this.jComboBoxid_tipo_delimiterBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getSelectedItem()).getId();}
		this.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral=this.jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.isSelected();
		this.path_exportarBusquedaProcesoCambiarParametroGeneral=this.jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCambiarParametroGeneral(Boolean esInicializar) throws Exception {				
		if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarParametroGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCambiarParametroGeneral() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCambiarParametroGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCambiarParametroGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocambiarparametrogenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCambiarParametroGeneral.setModel(new ProcesoCambiarParametroGeneralModel(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCambiarParametroGeneral.setModel(new ProcesoCambiarParametroGeneralModel(this.procesocambiarparametrogenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral!=null && this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarParametroGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,procesocambiarparametrogeneralConstantesFunciones.resaltarSeleccionarProcesoCambiarParametroGeneral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO,procesocambiarparametrogeneralConstantesFunciones.resaltarSeleccionarProcesoCambiarParametroGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostraridProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltaridProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activaridProcesoCambiarParametroGeneral,this,true,"idProcesoCambiarParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltaridProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activaridProcesoCambiarParametroGeneral,this,true,"idProcesoCambiarParametroGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_visualProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoVisualTableCell(this.tipovisualsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_visualProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_visualProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoVisualTableCell(this.tipovisualsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_visualProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_visualProcesoCambiarParametroGeneral,true,"id_tipo_visualProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondoProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFondoTableCell(this.tipofondosForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondoProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondoProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoFondoTableCell(this.tipofondosForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondoProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondoProcesoCambiarParametroGeneral,true,"id_tipo_fondoProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_bordeProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFondoTableCell(this.tipofondobordesForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_bordeProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_bordeProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoFondoTableCell(this.tipofondobordesForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_bordeProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_bordeProcesoCambiarParametroGeneral,true,"id_tipo_fondo_bordeProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_controlProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFondoControlTableCell(this.tipofondocontrolsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_controlProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_controlProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoFondoControlTableCell(this.tipofondocontrolsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_controlProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_controlProcesoCambiarParametroGeneral,true,"id_tipo_fondo_controlProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_tamanio_controlProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTamanioControlTableCell(this.tipotamaniocontrolsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_tamanio_controlProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_tamanio_controlProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoTamanioControlTableCell(this.tipotamaniocontrolsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_tamanio_controlProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_tamanio_controlProcesoCambiarParametroGeneral,true,"id_tipo_tamanio_controlProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_mensaje_confirmacionProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_mensaje_confirmacionProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_mensaje_confirmacionProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_mensaje_confirmacionProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_mensaje_confirmacionProcesoCambiarParametroGeneral,this,true,"con_mensaje_confirmacionProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_botones_tool_barProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_botones_tool_barProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_botones_tool_barProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_botones_tool_barProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_botones_tool_barProcesoCambiarParametroGeneral,this,true,"con_botones_tool_barProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_exportarProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoExportarTableCell(this.tipoexportarsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_exportarProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_exportarProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoExportarTableCell(this.tipoexportarsForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_exportarProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_exportarProcesoCambiarParametroGeneral,true,"id_tipo_exportarProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_delimiterProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDelimiterTableCell(this.tipodelimitersForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_delimiterProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_delimiterProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new TipoDelimiterTableCell(this.tipodelimitersForeignKey,this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_delimiterProcesoCambiarParametroGeneral,this,this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_delimiterProcesoCambiarParametroGeneral,true,"id_tipo_delimiterProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_exportar_cabeceraProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_exportar_cabeceraProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_exportar_cabeceraProcesoCambiarParametroGeneral));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_exportar_cabeceraProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarcon_exportar_cabeceraProcesoCambiarParametroGeneral,this,true,"con_exportar_cabeceraProcesoCambiarParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR));

		if(this.procesocambiarparametrogeneralConstantesFunciones.mostrarpath_exportarProcesoCambiarParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarpath_exportarProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarpath_exportarProcesoCambiarParametroGeneral,this,true,"path_exportarProcesoCambiarParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocambiarparametrogeneralConstantesFunciones.resaltarpath_exportarProcesoCambiarParametroGeneral,this.procesocambiarparametrogeneralConstantesFunciones.activarpath_exportarProcesoCambiarParametroGeneral,this,true,"path_exportarProcesoCambiarParametroGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarParametroGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarParametroGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCambiarParametroGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCambiarParametroGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCambiarParametroGeneral.moveColumn(this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCambiarParametroGeneral.moveColumn(this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCambiarParametroGeneral.moveColumn(this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCambiarParametroGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCambiarParametroGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCambiarParametroGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCambiarParametroGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCambiarParametroGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCambiarParametroGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocambiarparametrogenerals.size()-1;
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
		//this.jTableDatosProcesoCambiarParametroGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCambiarParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCambiarParametroGeneral();
			
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
				
				//this.isEsNuevoProcesoCambiarParametroGeneral=false;
					
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
				if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarParametroGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocambiarparametrogeneral.getsType().equals("DUPLICADO")
				   || this.procesocambiarparametrogeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCambiarParametroGeneral=true;
				
				} else {
					this.isEsNuevoProcesoCambiarParametroGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocambiarparametrogeneral.getId()>=0 && !this.procesocambiarparametrogeneral.getIsNew()) {						
						this.isEsNuevoProcesoCambiarParametroGeneral=false;
						
					} else {
						this.isEsNuevoProcesoCambiarParametroGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarParametroGeneral(esRelaciones);						
				
				this.seleccionarProcesoCambiarParametroGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocambiarparametrogeneral.getId()<0) {
					this.isEsNuevoProcesoCambiarParametroGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCambiarParametroGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCambiarParametroGeneral(evt,rowIndex);
				}	
				
				if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCambiarParametroGeneral: " + this.dDif); 
					}
				}								
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCambiarParametroGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {
					if(this.procesocambiarparametrogeneral.getId()>0) {
						this.procesocambiarparametrogeneral.setIsDeleted(true);
						
						this.procesocambiarparametrogeneralsEliminados.add(this.procesocambiarparametrogeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().remove(this.procesocambiarparametrogeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogenerals.remove(this.procesocambiarparametrogeneral);				
					}
					
					
					((ProcesoCambiarParametroGeneralModel) this.jTableDatosProcesoCambiarParametroGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCambiarParametroGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCambiarParametroGeneral) {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarParametroGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoVisual
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_visualProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_visualProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoVisualsForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_visual());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipovisualsForeignKey=new ArrayList<TipoVisual>();

						if(procesocambiarparametrogeneral.getTipoVisual()!=null) {
							this.tipovisualsForeignKey.add(procesocambiarparametrogeneral.getTipoVisual());
						}

						this.addItemDefectoCombosForeignKeyTipoVisual();
						this.cargarCombosFrameTipoVisualsForeignKey("Todos");
					}
					this.setActualTipoVisualForeignKey(this.procesocambiarparametrogeneral.getid_tipo_visual(),false,"Formulario");

					//TipoFondo
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_fondoProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_fondoProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoFondosForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_fondo());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipofondosForeignKey=new ArrayList<TipoFondo>();

						if(procesocambiarparametrogeneral.getTipoFondo()!=null) {
							this.tipofondosForeignKey.add(procesocambiarparametrogeneral.getTipoFondo());
						}

						this.addItemDefectoCombosForeignKeyTipoFondo();
						this.cargarCombosFrameTipoFondosForeignKey("Todos");
					}
					this.setActualTipoFondoForeignKey(this.procesocambiarparametrogeneral.getid_tipo_fondo(),false,"Formulario");

					//TipoFondoBorde
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_fondo_bordeProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_fondo_bordeProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoFondoBordesForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_fondo_borde());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipofondobordesForeignKey=new ArrayList<TipoFondo>();

						if(procesocambiarparametrogeneral.getTipoFondoBorde()!=null) {
							this.tipofondobordesForeignKey.add(procesocambiarparametrogeneral.getTipoFondoBorde());
						}

						this.addItemDefectoCombosForeignKeyTipoFondoBorde();
						this.cargarCombosFrameTipoFondoBordesForeignKey("Todos");
					}
					this.setActualTipoFondoBordeForeignKey(this.procesocambiarparametrogeneral.getid_tipo_fondo_borde(),false,"Formulario");

					//TipoFondoControl
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_fondo_controlProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_fondo_controlProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoFondoControlsForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_fondo_control());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipofondocontrolsForeignKey=new ArrayList<TipoFondoControl>();

						if(procesocambiarparametrogeneral.getTipoFondoControl()!=null) {
							this.tipofondocontrolsForeignKey.add(procesocambiarparametrogeneral.getTipoFondoControl());
						}

						this.addItemDefectoCombosForeignKeyTipoFondoControl();
						this.cargarCombosFrameTipoFondoControlsForeignKey("Todos");
					}
					this.setActualTipoFondoControlForeignKey(this.procesocambiarparametrogeneral.getid_tipo_fondo_control(),false,"Formulario");

					//TipoTamanioControl
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_tamanio_controlProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_tamanio_controlProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoTamanioControlsForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_tamanio_control());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipotamaniocontrolsForeignKey=new ArrayList<TipoTamanioControl>();

						if(procesocambiarparametrogeneral.getTipoTamanioControl()!=null) {
							this.tipotamaniocontrolsForeignKey.add(procesocambiarparametrogeneral.getTipoTamanioControl());
						}

						this.addItemDefectoCombosForeignKeyTipoTamanioControl();
						this.cargarCombosFrameTipoTamanioControlsForeignKey("Todos");
					}
					this.setActualTipoTamanioControlForeignKey(this.procesocambiarparametrogeneral.getid_tipo_tamanio_control(),false,"Formulario");

					//TipoExportar
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_exportarProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_exportarProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoExportarsForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_exportar());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipoexportarsForeignKey=new ArrayList<TipoExportar>();

						if(procesocambiarparametrogeneral.getTipoExportar()!=null) {
							this.tipoexportarsForeignKey.add(procesocambiarparametrogeneral.getTipoExportar());
						}

						this.addItemDefectoCombosForeignKeyTipoExportar();
						this.cargarCombosFrameTipoExportarsForeignKey("Todos");
					}
					this.setActualTipoExportarForeignKey(this.procesocambiarparametrogeneral.getid_tipo_exportar(),false,"Formulario");

					//TipoDelimiter
					if(!this.procesocambiarparametrogeneralConstantesFunciones.cargarid_tipo_delimiterProcesoCambiarParametroGeneral || this.procesocambiarparametrogeneralConstantesFunciones.event_dependid_tipo_delimiterProcesoCambiarParametroGeneral) {
						//this.cargarCombosTipoDelimitersForeignKeyLista(" where id="+this.procesocambiarparametrogeneral.getid_tipo_delimiter());
									//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
						this.tipodelimitersForeignKey=new ArrayList<TipoDelimiter>();

						if(procesocambiarparametrogeneral.getTipoDelimiter()!=null) {
							this.tipodelimitersForeignKey.add(procesocambiarparametrogeneral.getTipoDelimiter());
						}

						this.addItemDefectoCombosForeignKeyTipoDelimiter();
						this.cargarCombosFrameTipoDelimitersForeignKey("Todos");
					}
					this.setActualTipoDelimiterForeignKey(this.procesocambiarparametrogeneral.getid_tipo_delimiter(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCambiarParametroGeneral(procesocambiarparametrogeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(procesocambiarparametrogeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCambiarParametroGeneral(procesocambiarparametrogeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarParametroGeneral(procesocambiarparametrogeneral);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneral.getId().toString());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_mensaje_confirmacion());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_botones_tool_bar());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_exportar_cabecera());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneral.getpath_exportar());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocambiarparametrogeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocambiarparametrogeneralLocal=this.procesocambiarparametrogeneral;
			} else {
				procesocambiarparametrogeneralLocal=this.procesocambiarparametrogeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocambiarparametrogeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCambiarParametroGeneral(procesocambiarparametrogeneralLocal,true);
					
					if(procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocambiarparametrogeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocambiarparametrogeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(procesocambiarparametrogeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(procesocambiarparametrogeneral);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(procesocambiarparametrogeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.getText()==null || this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.getText()=="" || this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setText("0");
			}

			if(conColumnasBase) {procesocambiarparametrogeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelIdProcesoCambiarParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocambiarparametrogeneral.setcon_mensaje_confirmacion(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocambiarparametrogeneral.setcon_botones_tool_bar(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocambiarparametrogeneral.setcon_exportar_cabecera(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocambiarparametrogeneral.setpath_exportar(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelpath_exportarProcesoCambiarParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralBean,ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_visual()!=null && !procesocambiarparametrogeneralBean.getid_tipo_visual().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_visual(procesocambiarparametrogeneralBean.getid_tipo_visual());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_fondo()!=null && !procesocambiarparametrogeneralBean.getid_tipo_fondo().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo(procesocambiarparametrogeneralBean.getid_tipo_fondo());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_fondo_borde()!=null && !procesocambiarparametrogeneralBean.getid_tipo_fondo_borde().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo_borde(procesocambiarparametrogeneralBean.getid_tipo_fondo_borde());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_fondo_control()!=null && !procesocambiarparametrogeneralBean.getid_tipo_fondo_control().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo_control(procesocambiarparametrogeneralBean.getid_tipo_fondo_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_tamanio_control()!=null && !procesocambiarparametrogeneralBean.getid_tipo_tamanio_control().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_tamanio_control(procesocambiarparametrogeneralBean.getid_tipo_tamanio_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_exportar()!=null && !procesocambiarparametrogeneralBean.getid_tipo_exportar().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_exportar(procesocambiarparametrogeneralBean.getid_tipo_exportar());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralBean.getid_tipo_delimiter()!=null && !procesocambiarparametrogeneralBean.getid_tipo_delimiter().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_delimiter(procesocambiarparametrogeneralBean.getid_tipo_delimiter());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralOrigen,ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getId()!=null && !procesocambiarparametrogeneralOrigen.getId().equals(0L))) {procesocambiarparametrogeneral.setId(procesocambiarparametrogeneralOrigen.getId());}}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_visual()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_visual().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_visual(procesocambiarparametrogeneralOrigen.getid_tipo_visual());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_fondo()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_fondo().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo(procesocambiarparametrogeneralOrigen.getid_tipo_fondo());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_fondo_borde()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_fondo_borde().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo_borde(procesocambiarparametrogeneralOrigen.getid_tipo_fondo_borde());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_fondo_control()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_fondo_control().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_fondo_control(procesocambiarparametrogeneralOrigen.getid_tipo_fondo_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_tamanio_control()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_tamanio_control().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_tamanio_control(procesocambiarparametrogeneralOrigen.getid_tipo_tamanio_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getcon_mensaje_confirmacion()!=null && !procesocambiarparametrogeneralOrigen.getcon_mensaje_confirmacion().equals(false))) {procesocambiarparametrogeneral.setcon_mensaje_confirmacion(procesocambiarparametrogeneralOrigen.getcon_mensaje_confirmacion());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getcon_botones_tool_bar()!=null && !procesocambiarparametrogeneralOrigen.getcon_botones_tool_bar().equals(false))) {procesocambiarparametrogeneral.setcon_botones_tool_bar(procesocambiarparametrogeneralOrigen.getcon_botones_tool_bar());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_exportar()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_exportar().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_exportar(procesocambiarparametrogeneralOrigen.getid_tipo_exportar());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getid_tipo_delimiter()!=null && !procesocambiarparametrogeneralOrigen.getid_tipo_delimiter().equals(-1L))) {procesocambiarparametrogeneral.setid_tipo_delimiter(procesocambiarparametrogeneralOrigen.getid_tipo_delimiter());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getcon_exportar_cabecera()!=null && !procesocambiarparametrogeneralOrigen.getcon_exportar_cabecera().equals(false))) {procesocambiarparametrogeneral.setcon_exportar_cabecera(procesocambiarparametrogeneralOrigen.getcon_exportar_cabecera());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralOrigen.getpath_exportar()!=null && !procesocambiarparametrogeneralOrigen.getpath_exportar().equals(""))) {procesocambiarparametrogeneral.setpath_exportar(procesocambiarparametrogeneralOrigen.getpath_exportar());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneral.getId().toString());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_mensaje_confirmacion());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_botones_tool_bar());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneral.getcon_exportar_cabecera());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneral.getpath_exportar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneralBean procesocambiarparametrogeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneralBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneralBean.getcon_mensaje_confirmacion());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneralBean.getcon_botones_tool_bar());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setSelected(procesocambiarparametrogeneralBean.getcon_exportar_cabecera());
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setText(procesocambiarparametrogeneralBean.getpath_exportar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneralParameterReturnGeneral procesocambiarparametrogeneralReturnGeneral,ProcesoCambiarParametroGeneralBean procesocambiarparametrogeneralBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal=new ProcesoCambiarParametroGeneral();
			
			procesocambiarparametrogeneralLocal=procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getId()!=null && !procesocambiarparametrogeneralLocal.getId().equals(0L))) {procesocambiarparametrogeneralBean.setId(procesocambiarparametrogeneralLocal.getId());}}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_visual()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_visual().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_visual(procesocambiarparametrogeneralLocal.getid_tipo_visual());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_fondo()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_fondo().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_fondo(procesocambiarparametrogeneralLocal.getid_tipo_fondo());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_fondo_borde()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_fondo_borde().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_fondo_borde(procesocambiarparametrogeneralLocal.getid_tipo_fondo_borde());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_fondo_control()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_fondo_control().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_fondo_control(procesocambiarparametrogeneralLocal.getid_tipo_fondo_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_tamanio_control()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_tamanio_control().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_tamanio_control(procesocambiarparametrogeneralLocal.getid_tipo_tamanio_control());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getcon_mensaje_confirmacion()!=null && !procesocambiarparametrogeneralLocal.getcon_mensaje_confirmacion().equals(false))) {procesocambiarparametrogeneralBean.setcon_mensaje_confirmacion(procesocambiarparametrogeneralLocal.getcon_mensaje_confirmacion());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getcon_botones_tool_bar()!=null && !procesocambiarparametrogeneralLocal.getcon_botones_tool_bar().equals(false))) {procesocambiarparametrogeneralBean.setcon_botones_tool_bar(procesocambiarparametrogeneralLocal.getcon_botones_tool_bar());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_exportar()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_exportar().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_exportar(procesocambiarparametrogeneralLocal.getid_tipo_exportar());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getid_tipo_delimiter()!=null && !procesocambiarparametrogeneralLocal.getid_tipo_delimiter().equals(-1L))) {procesocambiarparametrogeneralBean.setid_tipo_delimiter(procesocambiarparametrogeneralLocal.getid_tipo_delimiter());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getcon_exportar_cabecera()!=null && !procesocambiarparametrogeneralLocal.getcon_exportar_cabecera().equals(false))) {procesocambiarparametrogeneralBean.setcon_exportar_cabecera(procesocambiarparametrogeneralLocal.getcon_exportar_cabecera());}
			if(conDefault || (!conDefault && procesocambiarparametrogeneralLocal.getpath_exportar()!=null && !procesocambiarparametrogeneralLocal.getpath_exportar().equals(""))) {procesocambiarparametrogeneralBean.setpath_exportar(procesocambiarparametrogeneralLocal.getpath_exportar());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCambiarParametroGeneralGenerico(Long idProcesoCambiarParametroGeneralSeleccionado,JComboBox jComboBoxProcesoCambiarParametroGeneral,List<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsLocal)throws Exception {
		try {
			ProcesoCambiarParametroGeneral  procesocambiarparametrogeneralTemp=null;

			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsLocal) {
				if(procesocambiarparametrogeneralAux.getId()!=null && procesocambiarparametrogeneralAux.getId().equals(idProcesoCambiarParametroGeneralSeleccionado)) {
					procesocambiarparametrogeneralTemp=procesocambiarparametrogeneralAux;
					break;
				}
			}

			jComboBoxProcesoCambiarParametroGeneral.setSelectedItem(procesocambiarparametrogeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCambiarParametroGeneralGenerico(JComboBox jComboBoxProcesoCambiarParametroGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarParametroGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCambiarParametroGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarParametroGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCambiarParametroGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarparametrogeneral=(ProcesoCambiarParametroGeneral) procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) procesocambiarparametrogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoVisual")) {
			//sDescripcion=this.getActualTipoVisualForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipovisual_descripcion();
			} else {
				//sDescripcion=this.getActualTipoVisualForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipovisual_descripcion();
			}
		}

		if(sTipo.equals("TipoFondo")) {
			//sDescripcion=this.getActualTipoFondoForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipofondo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFondoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipofondo_descripcion();
			}
		}

		if(sTipo.equals("TipoFondoBorde")) {
			//sDescripcion=this.getActualTipoFondoBordeForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipofondoborde_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFondoBordeForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipofondoborde_descripcion();
			}
		}

		if(sTipo.equals("TipoFondoControl")) {
			//sDescripcion=this.getActualTipoFondoControlForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipofondocontrol_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFondoControlForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipofondocontrol_descripcion();
			}
		}

		if(sTipo.equals("TipoTamanioControl")) {
			//sDescripcion=this.getActualTipoTamanioControlForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTamanioControlForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion();
			}
		}

		if(sTipo.equals("TipoExportar")) {
			//sDescripcion=this.getActualTipoExportarForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipoexportar_descripcion();
			} else {
				//sDescripcion=this.getActualTipoExportarForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipoexportar_descripcion();
			}
		}

		if(sTipo.equals("TipoDelimiter")) {
			//sDescripcion=this.getActualTipoDelimiterForeignKeyDescripcion((Long)value);
			if(!procesocambiarparametrogeneral.getIsNew() && !procesocambiarparametrogeneral.getIsChanged() && !procesocambiarparametrogeneral.getIsDeleted()) {
				sDescripcion=procesocambiarparametrogeneral.gettipodelimiter_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDelimiterForeignKeyDescripcion((Long)value);
				sDescripcion=procesocambiarparametrogeneral.gettipodelimiter_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCambiarParametroGeneral procesocambiarparametrogeneralRow=new ProcesoCambiarParametroGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarparametrogeneralRow=(ProcesoCambiarParametroGeneral) procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarparametrogeneralRow=(ProcesoCambiarParametroGeneral) procesocambiarparametrogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));			
			this.jButtonDuplicarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral && this.isPermisoDuplicarProcesoCambiarParametroGeneral));			
			this.jButtonCopiarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral && this.isPermisoCopiarProcesoCambiarParametroGeneral));
			this.jButtonVerFormProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral && this.isPermisoVerFormProcesoCambiarParametroGeneral));
			
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));			
			
			this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));			
			this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral && this.isPermisoEliminarProcesoCambiarParametroGeneral));
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral);							
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));						
			this.jButtonDuplicarToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral && this.isPermisoDuplicarProcesoCambiarParametroGeneral));						
			this.jButtonCopiarToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral && this.isPermisoCopiarProcesoCambiarParametroGeneral));			
			this.jButtonVerFormToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral && this.isPermisoVerFormProcesoCambiarParametroGeneral));			
			this.jButtonAbrirOrderByToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));
			this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral  && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral && this.isPermisoEliminarProcesoCambiarParametroGeneral));
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarToolBarProcesoCambiarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral);				
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));			
			this.jMenuItemDuplicarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral && this.isPermisoDuplicarProcesoCambiarParametroGeneral));			
			this.jMenuItemCopiarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral && this.isPermisoCopiarProcesoCambiarParametroGeneral));			
			this.jMenuItemVerFormProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral && this.isPermisoVerFormProcesoCambiarParametroGeneral));			
			this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));			
			//this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));
			this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral && this.isPermisoOrdenProcesoCambiarParametroGeneral));			
			this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral));			
			this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral && this.isPermisoNuevoProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));									
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemModificarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemActualizarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral && this.isPermisoActualizarProcesoCambiarParametroGeneral));	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemEliminarProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral && this.isPermisoEliminarProcesoCambiarParametroGeneral));
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemCancelarProcesoCambiarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));						
			this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=this.jButtonNuevoProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral=this.jButtonDuplicarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral=this.jButtonCopiarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral=this.jButtonVerFormProcesoCambiarParametroGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCambiarParametroGeneral=this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=this.jButtonModificarProcesoCambiarParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=this.jButtonNuevoToolBarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarToolBarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarToolBarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarToolBarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarToolBarProcesoCambiarParametroGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=this.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=this.jMenuItemNuevoProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemModificarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemActualizarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemEliminarProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemCancelarProcesoCambiarParametroGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCambiarParametroGeneral(Boolean esInicializar) {
		if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarParametroGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCambiarParametroGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCambiarParametroGeneral() {
		this.jButtonNuevoProcesoCambiarParametroGeneral.setVisible(this.isPermisoNuevoProcesoCambiarParametroGeneral);			
		this.jButtonDuplicarProcesoCambiarParametroGeneral.setVisible(this.isPermisoDuplicarProcesoCambiarParametroGeneral);			
		this.jButtonCopiarProcesoCambiarParametroGeneral.setVisible(this.isPermisoCopiarProcesoCambiarParametroGeneral);			
		this.jButtonVerFormProcesoCambiarParametroGeneral.setVisible(this.isPermisoVerFormProcesoCambiarParametroGeneral);			
		
		this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.setVisible(this.isPermisoOrdenProcesoCambiarParametroGeneral);					
		
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.setVisible(this.isPermisoNuevoProcesoCambiarParametroGeneral);			
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarProcesoCambiarParametroGeneral.setVisible(this.isPermisoActualizarProcesoCambiarParametroGeneral);	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.setVisible(this.isPermisoActualizarProcesoCambiarParametroGeneral);	
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.setVisible(this.isPermisoEliminarProcesoCambiarParametroGeneral);
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral);						
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.setVisible(this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setVisible(this.isPermisoActualizarProcesoCambiarParametroGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarParametroGeneral() {
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarProcesoCambiarParametroGeneral.setVisible(this.isPermisoActualizarProcesoCambiarParametroGeneral);	
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.setVisible(this.isPermisoActualizarProcesoCambiarParametroGeneral);	
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.setVisible(this.isPermisoEliminarProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral);							
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral && this.isPermisoGuardarCambiosProcesoCambiarParametroGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCambiarParametroGeneral() {
		if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarParametroGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCambiarParametroGeneral() {
	}
	
	public void jTableDatosProcesoCambiarParametroGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCambiarParametroGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocambiarparametrogeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovisual=true;

			idTienePermisotipovisual=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoVisualConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovisual) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipovisualBeanSwingJInternalFrame=new TipoVisualBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovisualBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovisualBeanSwingJInternalFrame.getTipoVisualLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_visual()!=null) {
					this.tipovisualBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovisualBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_visual());
					this.tipovisualBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovisualBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovisualBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoVisual();
				}

				JInternalFrameBase jinternalFrame =this.tipovisualBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipovisual=(TitledBorder)this.tipovisualBeanSwingJInternalFrame.jScrollPanelDatosTipoVisual.getBorder();

				titledBordertipovisual.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Visual");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_visualProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_visual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_visual = "+this.procesocambiarparametrogeneral.getid_tipo_visual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipofondo=true;

			idTienePermisotipofondo=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoFondoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipofondo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipofondoBeanSwingJInternalFrame=new TipoFondoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipofondoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipofondoBeanSwingJInternalFrame.getTipoFondoLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo()!=null) {
					this.tipofondoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipofondoBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_fondo());
					this.tipofondoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipofondoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipofondoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFondo();
				}

				JInternalFrameBase jinternalFrame =this.tipofondoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipofondo=(TitledBorder)this.tipofondoBeanSwingJInternalFrame.jScrollPanelDatosTipoFondo.getBorder();

				titledBordertipofondo.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Fondo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_fondo = "+this.procesocambiarparametrogeneral.getid_tipo_fondo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipofondoborde=true;

			idTienePermisotipofondoborde=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoFondoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipofondoborde) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipofondobordeBeanSwingJInternalFrame=new TipoFondoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipofondobordeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipofondobordeBeanSwingJInternalFrame.getTipoFondoLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo_borde()!=null) {
					this.tipofondobordeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipofondobordeBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_fondo_borde());
					this.tipofondobordeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipofondobordeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipofondobordeBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFondo();
				}

				JInternalFrameBase jinternalFrame =this.tipofondobordeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipofondoborde=(TitledBorder)this.tipofondobordeBeanSwingJInternalFrame.jScrollPanelDatosTipoFondo.getBorder();

				titledBordertipofondoborde.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Fondo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo_borde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_fondo_borde = "+this.procesocambiarparametrogeneral.getid_tipo_fondo_borde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipofondocontrol=true;

			idTienePermisotipofondocontrol=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoFondoControlConstantesFunciones.CLASSNAME);

			if(idTienePermisotipofondocontrol) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipofondocontrolBeanSwingJInternalFrame=new TipoFondoControlBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipofondocontrolBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipofondocontrolBeanSwingJInternalFrame.getTipoFondoControlLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo_control()!=null) {
					this.tipofondocontrolBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipofondocontrolBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_fondo_control());
					this.tipofondocontrolBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipofondocontrolBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipofondocontrolBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFondoControl();
				}

				JInternalFrameBase jinternalFrame =this.tipofondocontrolBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipofondocontrol=(TitledBorder)this.tipofondocontrolBeanSwingJInternalFrame.jScrollPanelDatosTipoFondoControl.getBorder();

				titledBordertipofondocontrol.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Fondo Control");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_fondo_control()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_fondo_control = "+this.procesocambiarparametrogeneral.getid_tipo_fondo_control().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotamaniocontrol=true;

			idTienePermisotipotamaniocontrol=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoTamanioControlConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotamaniocontrol) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipotamaniocontrolBeanSwingJInternalFrame=new TipoTamanioControlBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotamaniocontrolBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotamaniocontrolBeanSwingJInternalFrame.getTipoTamanioControlLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_tamanio_control()!=null) {
					this.tipotamaniocontrolBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotamaniocontrolBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_tamanio_control());
					this.tipotamaniocontrolBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotamaniocontrolBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotamaniocontrolBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTamanioControl();
				}

				JInternalFrameBase jinternalFrame =this.tipotamaniocontrolBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipotamaniocontrol=(TitledBorder)this.tipotamaniocontrolBeanSwingJInternalFrame.jScrollPanelDatosTipoTamanioControl.getBorder();

				titledBordertipotamaniocontrol.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Tamanio Control");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_tamanio_control()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_tamanio_control = "+this.procesocambiarparametrogeneral.getid_tipo_tamanio_control().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getcon_mensaje_confirmacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_mensaje_confirmacion = "+this.procesocambiarparametrogeneral.getcon_mensaje_confirmacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getcon_botones_tool_bar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_botones_tool_bar = "+this.procesocambiarparametrogeneral.getcon_botones_tool_bar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoexportar=true;

			idTienePermisotipoexportar=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoExportarConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoexportar) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipoexportarBeanSwingJInternalFrame=new TipoExportarBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoexportarBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoexportarBeanSwingJInternalFrame.getTipoExportarLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_exportar()!=null) {
					this.tipoexportarBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoexportarBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_exportar());
					this.tipoexportarBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoexportarBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoexportarBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoExportar();
				}

				JInternalFrameBase jinternalFrame =this.tipoexportarBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipoexportar=(TitledBorder)this.tipoexportarBeanSwingJInternalFrame.jScrollPanelDatosTipoExportar.getBorder();

				titledBordertipoexportar.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Exportar");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_exportar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_exportar = "+this.procesocambiarparametrogeneral.getid_tipo_exportar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodelimiter=true;

			idTienePermisotipodelimiter=this.tienePermisosUsuarioEnPaginaWebProcesoCambiarParametroGeneral(TipoDelimiterConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodelimiter) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCambiarParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCambiarParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);

				this.tipodelimiterBeanSwingJInternalFrame=new TipoDelimiterBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodelimiterBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodelimiterBeanSwingJInternalFrame.getTipoDelimiterLogic().setConnexion(this.procesocambiarparametrogeneralLogic.getConnexion());

				if(this.procesocambiarparametrogeneral.getid_tipo_delimiter()!=null) {
					this.tipodelimiterBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodelimiterBeanSwingJInternalFrame.setIdActual(this.procesocambiarparametrogeneral.getid_tipo_delimiter());
					this.tipodelimiterBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodelimiterBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodelimiterBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDelimiter();
				}

				JInternalFrameBase jinternalFrame =this.tipodelimiterBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCambiarParametroGeneral=(TitledBorder)this.jScrollPanelDatosProcesoCambiarParametroGeneral.getBorder();
				TitledBorder titledBordertipodelimiter=(TitledBorder)this.tipodelimiterBeanSwingJInternalFrame.jScrollPanelDatosTipoDelimiter.getBorder();

				titledBordertipodelimiter.setTitle(titledBorderProcesoCambiarParametroGeneral.getTitle() + " -> Tipo Delimiter");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getid_tipo_delimiter()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_delimiter = "+this.procesocambiarparametrogeneral.getid_tipo_delimiter().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getcon_exportar_cabecera()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_exportar_cabecera = "+this.procesocambiarparametrogeneral.getcon_exportar_cabecera().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpath_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.getprocesocambiarparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarparametrogeneral==null) {
						this.procesocambiarparametrogeneral = new ProcesoCambiarParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);
				}

				if(this.procesocambiarparametrogeneral.getpath_exportar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where path_exportar like '%"+this.procesocambiarparametrogeneral.getpath_exportar()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsBusquedaProcesoCambiarParametroGeneral();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDelimiterProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoDelimiter();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoExportarProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoExportar();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFondoProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoFondo();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFondoBordeProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoFondoBorde();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFondoControlProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoFondoControl();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTamanioControlProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoTamanioControl();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoVisualProcesoCambiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);

			this.getProcesoCambiarParametroGeneralsFK_IdTipoVisual();

			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);

			//if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarparametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCambiarParametroGeneral() {
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.dispose();
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.dispose();
			this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCambiarParametroGeneral!=null) {
			this.jInternalFrameImportacionProcesoCambiarParametroGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCambiarParametroGeneral.dispose();
			this.jInternalFrameImportacionProcesoCambiarParametroGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCambiarParametroGeneral();
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCambiarParametroGeneral")) {
				jButtonDuplicarProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCambiarParametroGeneral")) {
				jButtonCopiarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCambiarParametroGeneral")) {
				jButtonVerFormProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCambiarParametroGeneral")) {
				jButtonDuplicarProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCambiarParametroGeneral")) {
				jButtonDuplicarProcesoCambiarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCambiarParametroGeneral")) {
				jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCambiarParametroGeneral")) {
				jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCambiarParametroGeneral")) {
				jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCambiarParametroGeneral")) {
				jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCambiarParametroGeneral")) {
				jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCambiarParametroGeneral")) {
				jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCambiarParametroGeneral")) {
				jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCambiarParametroGeneral")) {
				jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCambiarParametroGeneral")) {
				jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCambiarParametroGeneral")) {
				jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCambiarParametroGeneral")) {
				jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCambiarParametroGeneral")) {
				jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCambiarParametroGeneral")) {
				jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCambiarParametroGeneral")) {
				jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCambiarParametroGeneral")) {
				jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCambiarParametroGeneral")) {
				jButtonMostrarOcultarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCambiarParametroGeneral")) {
				jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCambiarParametroGeneral")) {
				jButtonCopiarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCambiarParametroGeneral")) {
				jButtonVerFormProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCambiarParametroGeneral")) {
				jButtonCopiarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCambiarParametroGeneral")) {
				jButtonVerFormProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarParametroGeneral")) {
				jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCambiarParametroGeneral")) {
				jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCambiarParametroGeneral")) {
				jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCambiarParametroGeneral")) {
				jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCambiarParametroGeneral")) {
				jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCambiarParametroGeneral")) {
				jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCambiarParametroGeneral")) {
				jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCambiarParametroGeneral")) {
				jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCambiarParametroGeneral")) {
				jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCambiarParametroGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral")) {
				jButtonAbrirOrderByProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCambiarParametroGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCambiarParametroGeneral")) {
				jButtonMostrarOcultarProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral")) {
				jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCambiarParametroGeneral")) {
				jButtonProcesarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCambiarParametroGeneral")) {
				jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCambiarParametroGeneral")) {
				jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCambiarParametroGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCambiarParametroGeneral")) {
				jButtonCerrarImportacionProcesoCambiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCambiarParametroGeneral")) {
				
				jButtonGenerarImportacionProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCambiarParametroGeneral")) {
				
				jButtonAbrirImportacionProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCambiarParametroGeneral")) {
				jComboBoxTiposAccionesProcesoCambiarParametroGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCambiarParametroGeneral")) {
				jComboBoxTiposRelacionesProcesoCambiarParametroGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCambiarParametroGeneral")) {
				jComboBoxTiposAccionesProcesoCambiarParametroGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCambiarParametroGeneral")) {
				
				jComboBoxTiposSeleccionarProcesoCambiarParametroGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCambiarParametroGeneral")) {
				jTextFieldValorCampoGeneralProcesoCambiarParametroGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCambiarParametroGeneral")) {
				jButtonAbrirOrderByProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCambiarParametroGeneral")) {
				jButtonAbrirOrderByProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCambiarParametroGeneral")) {
				jButtonCerrarOrderByProcesoCambiarParametroGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonidProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_visualProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_visualProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondoProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondoProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_botones_tool_barProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_exportarProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_exportarProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_delimiterProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_exportarProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonpath_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral")) {
				this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneralActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCambiarParametroGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocambiarparametrogeneralLocal=this.procesocambiarparametrogeneral;
			} else {
				procesocambiarparametrogeneralLocal=this.procesocambiarparametrogeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
							
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
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
			
			


			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
								
						
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
								
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
							
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
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
			
			


			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
								
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCambiarParametroGeneral")) {
					jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCambiarParametroGeneral")) {
					jCheckBoxSeleccionadosProcesoCambiarParametroGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCambiarParametroGeneral")) {
					
				}
				
				


				
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
												
				
				


				
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
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
			
			


			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarparametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarparametrogeneral);
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
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
				
				


				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarParametroGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarparametrogeneralAnterior =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCambiarParametroGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCambiarParametroGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocambiarparametrogeneral =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocambiarparametrogeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCambiarParametroGeneral")) {
				
				}
				
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCambiarParametroGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCambiarParametroGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarParametroGeneral")) {
			
			}
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCambiarParametroGeneral();
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCambiarParametroGeneral")) {
				jButtonDuplicarProcesoCambiarParametroGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCambiarParametroGeneral")) {
				jButtonCopiarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCambiarParametroGeneral")) {
				jButtonVerFormProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarParametroGeneral")) {
				jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCambiarParametroGeneral")) {
				jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCambiarParametroGeneral")) {
				jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCambiarParametroGeneral")) {
				jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCambiarParametroGeneral")) {
				jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCambiarParametroGeneral")) {
				jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarParametroGeneral")) {
				jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCambiarParametroGeneral")) {
				jButtonAbrirOrderByProcesoCambiarParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarParametroGeneral")) {
				jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCambiarParametroGeneral")) {
				jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCambiarParametroGeneral")) {
				jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonidProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_visualProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_visualProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondoProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondoProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_botones_tool_barProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_exportarProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_exportarProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_delimiterProcesoCambiarParametroGeneralUpdate")) {
				this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_exportarProcesoCambiarParametroGeneralBusqueda")) {
				this.jButtonpath_exportarProcesoCambiarParametroGeneralBusquedaActionPerformed(evt);
			}
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCambiarParametroGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCambiarParametroGeneral")) {
				closingInternalFrameProcesoCambiarParametroGeneral();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarParametroGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarParametroGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCambiarParametroGeneralBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarParametroGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(null);
			}
			
			ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarparametrogeneral,new Object(),this.procesocambiarparametrogeneralParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCambiarParametroGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCambiarParametroGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCambiarParametroGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {
			if(!esControlTabla) {
				if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);			
				}
				
				if(this.procesocambiarparametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral,this.procesocambiarparametrogeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocambiarparametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarParametroGeneral(classes,this.procesocambiarparametrogeneralReturnGeneral,this.procesocambiarparametrogeneralBean,false);
					}
						
					if(this.procesocambiarparametrogeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral());	
					}
						
					if(this.procesocambiarparametrogeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral(),classes);//this.procesocambiarparametrogeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,classes);//this.procesocambiarparametrogeneralBean);									
				}
			
				if(ProcesoCambiarParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarParametroGeneral(this.procesocambiarparametrogeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocambiarparametrogeneralAnterior!=null) {
						this.procesocambiarparametrogeneral=this.procesocambiarparametrogeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocambiarparametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral(),procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGeneral(),this.procesocambiarparametrogenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCambiarParametroGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCambiarParametroGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCambiarParametroGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCambiarParametroGeneral() throws Exception {
		
		ProcesoCambiarParametroGeneralModel procesocambiarparametrogeneralModel=(ProcesoCambiarParametroGeneralModel)this.jTableDatosProcesoCambiarParametroGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarparametrogeneralModel.procesocambiarparametrogenerals=this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocambiarparametrogeneralModel.procesocambiarparametrogenerals=this.procesocambiarparametrogenerals;
		}
		
		
		((ProcesoCambiarParametroGeneralModel) this.jTableDatosProcesoCambiarParametroGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCambiarParametroGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocambiarparametrogeneralAnterior(),this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocambiarparametrogeneralAnterior(),this.procesocambiarparametrogenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCambiarParametroGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
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
										
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarparametrogeneral,new Object(),generalEntityParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCambiarParametroGeneralConstantesFunciones.getClassesRelationshipsOfProcesoCambiarParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCambiarParametroGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCambiarParametroGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCambiarParametroGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarparametrogeneral,new Object(),generalEntityParameterGeneral,this.procesocambiarparametrogeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneralBean procesocambiarparametrogeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarParametroGeneral(ArrayList<Classe> classes,ProcesoCambiarParametroGeneralReturnGeneral procesocambiarparametrogeneralReturnGeneral,ProcesoCambiarParametroGeneralBean procesocambiarparametrogeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral = new ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones(),this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.procesocambiarparametrogeneralLogic=this.procesocambiarparametrogeneralLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCambiarParametroGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarParametroGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarParametroGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCambiarParametroGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarParametroGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarParametroGeneral"));
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarParametroGeneral"));

		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarParametroGeneral"));
					
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemModificarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarParametroGeneral"));
						
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemActualizarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarParametroGeneral"));
								
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemEliminarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarParametroGeneral"));
					
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemCancelarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarParametroGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarParametroGeneral"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarParametroGeneral"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarParametroGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonidProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_botones_tool_barProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"path_exportarProcesoCambiarParametroGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarParametroGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCambiarParametroGeneral"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarParametroGeneral"));
		}
		
		this.jTableDatosProcesoCambiarParametroGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCambiarParametroGeneral"));
		
		this.jTableDatosProcesoCambiarParametroGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCambiarParametroGeneral"));
		
		this.jButtonNuevoProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoProcesoCambiarParametroGeneral"));
		
		this.jButtonDuplicarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCambiarParametroGeneral"));
		
		this.jButtonCopiarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"CopiarProcesoCambiarParametroGeneral"));
		
		this.jButtonVerFormProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"VerFormProcesoCambiarParametroGeneral"));
		
		
		this.jButtonNuevoToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCambiarParametroGeneral"));
			
		this.jButtonDuplicarToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemNuevoProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCambiarParametroGeneral"));
			
		this.jMenuItemDuplicarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCambiarParametroGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCambiarParametroGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonModificarToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarParametroGeneral"));
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemModificarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonActualizarToolBarProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarParametroGeneral"));
				
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemActualizarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonEliminarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarParametroGeneral"));
						
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemEliminarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonCancelarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarParametroGeneral"));
			
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemCancelarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarParametroGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonCerrarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarProcesoCambiarParametroGeneral"));
		
		
		this.jButtonCerrarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemCerrarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCambiarParametroGeneral"));
			
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCambiarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarParametroGeneral"));
		}
		
		this.jButtonCopiarToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCambiarParametroGeneral"));
			
		this.jButtonVerFormToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCambiarParametroGeneral"));
		
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCambiarParametroGeneral"));
			
		this.jMenuItemCopiarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCambiarParametroGeneral"));		
		
		this.jMenuItemVerFormProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarParametroGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarParametroGeneral"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCambiarParametroGeneral"));
					
		this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCambiarParametroGeneral"));
		
		this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCambiarParametroGeneral"));		
		
		
		
		this.jButtonAnterioresProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCambiarParametroGeneral"));
		
		
		this.jButtonAnterioresToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCambiarParametroGeneral"));
		
		this.jMenuItemAnterioresProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonSiguientesProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCambiarParametroGeneral"));
		
		
		this.jButtonSiguientesToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemSiguientesProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCambiarParametroGeneral"));
			
		this.jMenuItemAbrirOrderByProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCambiarParametroGeneral"));
			
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCambiarParametroGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral"));		
		
		
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCambiarParametroGeneral"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCambiarParametroGeneral"));

		this.jCheckBoxSeleccionadosProcesoCambiarParametroGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCambiarParametroGeneral"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarParametroGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCambiarParametroGeneral"));
			
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCambiarParametroGeneral"));
					
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCambiarParametroGeneral"));
			
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCambiarParametroGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonidProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_botones_tool_barProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"path_exportarProcesoCambiarParametroGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarParametroGeneral"));
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarParametroGeneral"));
				this.jInternalFrameReporteDinamicoProcesoCambiarParametroGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarParametroGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarParametroGeneral"));				
			//this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarParametroGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarParametroGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarParametroGeneral"));
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarParametroGeneral"));
				this.jInternalFrameImportacionProcesoCambiarParametroGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarParametroGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCambiarParametroGeneral"));
			
			this.jButtonAbrirOrderByToolBarProcesoCambiarParametroGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCambiarParametroGeneral"));			
			
			if(this.jInternalFrameOrderByProcesoCambiarParametroGeneral!=null) {
				this.jInternalFrameOrderByProcesoCambiarParametroGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarParametroGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarParametroGeneral"));
		
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
            		closingInternalFrameProcesoCambiarParametroGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarParametroGeneral = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCambiarParametroGeneralBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarParametroGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCambiarParametroGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCambiarParametroGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCambiarParametroGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCambiarParametroGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarParametroGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonModificarProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonActualizarProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonEliminarProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCancelarProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCerrarProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCambiarParametroGeneral";
		inputMap = this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonGuardarCambiosProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCambiarParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCambiarParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCambiarParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonidProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_visualProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondoProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_botones_tool_barProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_exportarProcesoCambiarParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"path_exportarProcesoCambiarParametroGeneralBusqueda"));
		
		
		this.jButtonBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCambiarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCambiarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCambiarParametroGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCambiarParametroGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
					procesocambiarparametrogeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogenerals) {
					procesocambiarparametrogeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCambiarParametroGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
						procesocambiarparametrogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogenerals) {
						procesocambiarparametrogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
					
						if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_mensaje_confirmacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_botones_tool_bar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_exportar_cabecera(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogenerals) {
						
						if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_mensaje_confirmacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_botones_tool_bar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA)) {
							existe=true;
							procesocambiarparametrogeneralAux.setcon_exportar_cabecera(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarParametroGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarParametroGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCambiarParametroGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarParametroGeneral.getSelectedRows();
			
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneralLocal=new ProcesoCambiarParametroGeneral();
			
			//this.seleccionarTodosProcesoCambiarParametroGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocambiarparametrogeneralLocal =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals().toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocambiarparametrogeneralLocal =(ProcesoCambiarParametroGeneral) this.procesocambiarparametrogenerals.toArray()[this.jTableDatosProcesoCambiarParametroGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocambiarparametrogeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
						procesocambiarparametrogeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogenerals) {
						procesocambiarparametrogeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarParametroGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarParametroGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarParametroGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCambiarParametroGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCambiarParametroGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCambiarParametroGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCambiarParametroGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
				
						if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR)) {
							existe=true;
							procesocambiarparametrogeneralAux.setpath_exportar(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogenerals) {
					
						if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR)) {
							existe=true;
							procesocambiarparametrogeneralAux.setpath_exportar(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCambiarParametroGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCambiarParametroGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCambiarParametroGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCambiarParametroGeneral(conSplash);
				
					this.generarReporteProcesoCambiarParametroGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCambiarParametroGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarParametroGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarParametroGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarParametroGeneral();
				
				this.exportarProcesoCambiarParametroGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCambiarParametroGenerals();
				//this.importarProcesoCambiarParametroGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarParametroGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCambiarParametroGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cambiar Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCambiarParametroGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCambiarParametroGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCambiarParametroGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCambiarParametroGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCambiarParametroGeneral(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCambiarParametroGeneral();
						
						this.generarReporteProcesoAccionProcesoCambiarParametroGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cambiar Parametro GeneralES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cambiar Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCambiarParametroGeneral();
				
						this.actualizarParametrosGeneralProcesoCambiarParametroGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocambiarparametrogeneralReturnGeneral=procesocambiarparametrogeneralLogic.procesarAccionProcesoCambiarParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals(),this.procesocambiarparametrogeneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCambiarParametroGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCambiarParametroGeneral();
					
					ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCambiarParametroGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCambiarParametroGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCambiarParametroGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCambiarParametroGeneral();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
			ProcesoCambiarParametroGeneral procesocambiarparametrogeneral=new ProcesoCambiarParametroGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral.getSelectedItem();
			
			
			
			
			procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocambiarparametrogeneralsSeleccionados.size()==1) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
					procesocambiarparametrogeneral=procesocambiarparametrogeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCambiarParametroGeneral();
			
      		//this.finishProcessProcesoCambiarParametroGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCambiarParametroGeneralReturnGeneral() throws Exception {
		if(this.procesocambiarparametrogeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarparametrogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocambiarparametrogeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarparametrogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocambiarparametrogeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocambiarparametrogeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
		}
		
		if(this.procesocambiarparametrogeneralReturnGeneral.getConRetornoLista() || this.procesocambiarparametrogeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocambiarparametrogeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocambiarparametrogeneralLogic.setProcesoCambiarParametroGenerals(this.procesocambiarparametrogeneralReturnGeneral.getProcesoCambiarParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCambiarParametroGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCambiarParametroGeneral() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCambiarParametroGeneral> getProcesoCambiarParametroGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCambiarParametroGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals()) {
					if(procesocambiarparametrogeneralAux.getIsSelected()) {
						procesocambiarparametrogeneralsSeleccionados.add(procesocambiarparametrogeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:this.procesocambiarparametrogenerals) {
					if(procesocambiarparametrogeneralAux.getIsSelected()) {
						procesocambiarparametrogeneralsSeleccionados.add(procesocambiarparametrogeneralAux);				
					}
				}
			}
			
			if(procesocambiarparametrogeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocambiarparametrogeneralsSeleccionados.addAll(this.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocambiarparametrogeneralsSeleccionados.addAll(this.procesocambiarparametrogenerals);				
					}
				}
			}
		} else {
			procesocambiarparametrogeneralsSeleccionados.add(this.procesocambiarparametrogeneral);
		}
		
		return procesocambiarparametrogeneralsSeleccionados;
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
	
	public void generarReporteProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCambiarParametroGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCambiarParametroGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarParametroGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarParametroGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cambiar Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCambiarParametroGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCambiarParametroGeneral();
		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCambiarParametroGeneral();
		
		
		//this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados ,procesocambiarparametrogeneralImplementable,procesocambiarparametrogeneralImplementableHome);
	}
	
	public void mostrarImportacionProcesoCambiarParametroGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCambiarParametroGeneral();
		
		this.abrirFrameImportacionProcesoCambiarParametroGeneral();		
		
			
		//this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados ,procesocambiarparametrogeneralImplementable,procesocambiarparametrogeneralImplementableHome);
	}
	
	public void importarProcesoCambiarParametroGenerals() throws Exception {		
	
	}
	
	public void exportarProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCambiarParametroGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCambiarParametroGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCambiarParametroGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cambiar Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCambiarParametroGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCambiarParametroGeneral(procesocambiarparametrogeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocambiarparametrogeneralAux.setsDetalleGeneralEntityReporte(procesocambiarparametrogeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCambiarParametroGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocambiarparametrogeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipovisual_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipofondo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipofondoborde_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipofondocontrol_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.getcon_mensaje_confirmacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.getcon_botones_tool_bar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipoexportar_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.gettipodelimiter_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.getcon_exportar_cabecera().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarparametrogeneral.getpath_exportar();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCambiarParametroGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCambiarParametroGeneral(row);				
				iRow++;
			}				
			
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCambiarParametroGeneral(procesocambiarparametrogeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCambiarParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();		
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarparametrogeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocambiarparametrogenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocambiarparametrogeneral");
			//elementRoot.appendChild(element);
		
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
				element = document.createElement("procesocambiarparametrogeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCambiarParametroGeneral(procesocambiarparametrogeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCambiarParametroGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipovisual_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipofondo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipofondoborde_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipofondocontrol_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.getcon_mensaje_confirmacion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.getcon_botones_tool_bar());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipoexportar_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.gettipodelimiter_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.getcon_exportar_cabecera());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarparametrogeneral.getpath_exportar());				
	}
	
	public void setFilaDatosExportarXmlProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneral procesocambiarparametrogeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocambiarparametrogeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocambiarparametrogeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipovisual_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOVISUAL);
		elementtipovisual_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipovisual_descripcion()));
		element.appendChild(elementtipovisual_descripcion);

		Element elementtipofondo_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDO);
		elementtipofondo_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipofondo_descripcion()));
		element.appendChild(elementtipofondo_descripcion);

		Element elementtipofondoborde_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDOBORDE);
		elementtipofondoborde_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipofondoborde_descripcion()));
		element.appendChild(elementtipofondoborde_descripcion);

		Element elementtipofondocontrol_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOFONDOCONTROL);
		elementtipofondocontrol_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipofondocontrol_descripcion()));
		element.appendChild(elementtipofondocontrol_descripcion);

		Element elementtipotamaniocontrol_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOTAMANIOCONTROL);
		elementtipotamaniocontrol_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipotamaniocontrol_descripcion()));
		element.appendChild(elementtipotamaniocontrol_descripcion);

		Element elementcon_mensaje_confirmacion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.CONMENSAJECONFIRMACION);
		elementcon_mensaje_confirmacion.appendChild(document.createTextNode(procesocambiarparametrogeneral.getcon_mensaje_confirmacion().toString().trim()));
		element.appendChild(elementcon_mensaje_confirmacion);

		Element elementcon_botones_tool_bar = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.CONBOTONESTOOLBAR);
		elementcon_botones_tool_bar.appendChild(document.createTextNode(procesocambiarparametrogeneral.getcon_botones_tool_bar().toString().trim()));
		element.appendChild(elementcon_botones_tool_bar);

		Element elementtipoexportar_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPOEXPORTAR);
		elementtipoexportar_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipoexportar_descripcion()));
		element.appendChild(elementtipoexportar_descripcion);

		Element elementtipodelimiter_descripcion = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.IDTIPODELIMITER);
		elementtipodelimiter_descripcion.appendChild(document.createTextNode(procesocambiarparametrogeneral.gettipodelimiter_descripcion()));
		element.appendChild(elementtipodelimiter_descripcion);

		Element elementcon_exportar_cabecera = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.CONEXPORTARCABECERA);
		elementcon_exportar_cabecera.appendChild(document.createTextNode(procesocambiarparametrogeneral.getcon_exportar_cabecera().toString().trim()));
		element.appendChild(elementcon_exportar_cabecera);

		Element elementpath_exportar = document.createElement(ProcesoCambiarParametroGeneralConstantesFunciones.PATHEXPORTAR);
		elementpath_exportar.appendChild(document.createTextNode(procesocambiarparametrogeneral.getpath_exportar().trim()));
		element.appendChild(elementpath_exportar);
	}
	
	public void generarReporteGroupGenericoProcesoCambiarParametroGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados=new ArrayList<ProcesoCambiarParametroGeneral>();
		
		procesocambiarparametrogeneralsSeleccionados=this.getProcesoCambiarParametroGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCambiarParametroGeneral(procesocambiarparametrogeneralsSeleccionados);
		
		this.generarReporteProcesoCambiarParametroGenerals("Todos",procesocambiarparametrogeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCambiarParametroGeneral(ArrayList<ProcesoCambiarParametroGeneral> procesocambiarparametrogeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCambiarParametroGeneral procesocambiarparametrogeneralAux:procesocambiarparametrogeneralsSeleccionados) {
				procesocambiarparametrogeneralAux.setsDetalleGeneralEntityReporte(procesocambiarparametrogeneralAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipovisual_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipofondo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipofondoborde_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipofondocontrol_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipotamaniocontrol_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneralAux.getcon_mensaje_confirmacion()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneralAux.getcon_botones_tool_bar()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipoexportar_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.gettipodelimiter_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesocambiarparametrogeneralAux.getcon_exportar_cabecera()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR)) {
					existe=true;
					procesocambiarparametrogeneralAux.setsDescripcionGeneralEntityReporte1(procesocambiarparametrogeneralAux.getpath_exportar());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCambiarParametroGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=true;
		} else {
			this.actualizarEstadoPanelsProcesoCambiarParametroGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCambiarParametroGeneral=false;
			//this.isVisibilidadCeldaVerFormProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarParametroGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;												
			}
			
			this.jButtonCerrarProcesoCambiarParametroGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocambiarparametrogeneral)) {
			this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCambiarParametroGeneral=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarParametroGeneral=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarParametroGeneral=false;
		//this.isVisibilidadCeldaModificarProcesoCambiarParametroGeneral=true;
		this.isVisibilidadCeldaActualizarProcesoCambiarParametroGeneral=false;
		this.isVisibilidadCeldaEliminarProcesoCambiarParametroGeneral=false;
		//this.isVisibilidadCeldaCancelarProcesoCambiarParametroGeneral=true;			
		this.isVisibilidadCeldaGuardarProcesoCambiarParametroGeneral=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarParametroGeneral() {
	}
	
	public void actualizarEstadoPanelsProcesoCambiarParametroGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarParametroGeneral!=null) {
				this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarParametroGeneral!=null) {
				this.jPanelPaginacionProcesoCambiarParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
					this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarParametroGeneral!=null) {
				this.jPanelParametrosReportesProcesoCambiarParametroGeneral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoVisual(Boolean isParaTipoVisual){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoVisualNegation=!isParaTipoVisual;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoVisual;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFondo(Boolean isParaTipoFondo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFondoNegation=!isParaTipoFondo;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoFondo;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFondoBorde(Boolean isParaTipoFondoBorde){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFondoBordeNegation=!isParaTipoFondoBorde;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoFondoBorde;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFondoControl(Boolean isParaTipoFondoControl){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFondoControlNegation=!isParaTipoFondoControl;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoFondoControl;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTamanioControl(Boolean isParaTipoTamanioControl){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTamanioControlNegation=!isParaTipoTamanioControl;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoTamanioControl;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoExportar(Boolean isParaTipoExportar){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoExportarNegation=!isParaTipoExportar;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoExportar;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDelimiter(Boolean isParaTipoDelimiter){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDelimiterNegation=!isParaTipoDelimiter;

			this.isVisibilidadBusquedaProcesoCambiarParametroGeneral=isParaTipoDelimiter;
			if(!this.isVisibilidadBusquedaProcesoCambiarParametroGeneral) {this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);}
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
			
			this.inicializarActualizarBindingTablaProcesoCambiarParametroGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCambiarParametroGeneral() {
		this.updateBorderResaltarBusquedasFormularioProcesoCambiarParametroGeneral();
		this.updateVisibilidadBusquedasFormularioProcesoCambiarParametroGeneral();
		this.updateHabilitarBusquedasFormularioProcesoCambiarParametroGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCambiarParametroGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponents().length>0) {
	

		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral!=null) {
			index= this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.indexOfComponent(this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponent(index);
				jPanel.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCambiarParametroGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.indexOfComponent(this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			if(!this.procesocambiarparametrogeneralConstantesFunciones.mostrarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral && index>-1) {
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCambiarParametroGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.indexOfComponent(this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
				this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setEnabledAt(index,this.procesocambiarparametrogeneralConstantesFunciones.activarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCambiarParametroGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCambiarParametroGeneral")) {
			index= this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.indexOfComponent(this.jPanelBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);

			this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarParametroGeneral.getComponent(index);

			this.procesocambiarparametrogeneralConstantesFunciones.setResaltarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral(resaltar);

			jPanel.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCambiarParametroGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCambiarParametroGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCambiarParametroGeneral();
		this.updateVisibilidadResaltarControlesFormularioProcesoCambiarParametroGeneral();
		this.updateHabilitarResaltarControlesFormularioProcesoCambiarParametroGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCambiarParametroGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltaridProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltaridProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_visualProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_visualProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondoProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondoProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_bordeProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_bordeProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_controlProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_fondo_controlProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_tamanio_controlProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_tamanio_controlProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_mensaje_confirmacionProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_mensaje_confirmacionProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_botones_tool_barProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_botones_tool_barProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_exportarProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_exportarProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_delimiterProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarid_tipo_delimiterProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_exportar_cabeceraProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarcon_exportar_cabeceraProcesoCambiarParametroGeneral);}
		if(this.procesocambiarparametrogeneralConstantesFunciones.resaltarpath_exportarProcesoCambiarParametroGeneral!=null && this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setBorder(this.procesocambiarparametrogeneralConstantesFunciones.resaltarpath_exportarProcesoCambiarParametroGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCambiarParametroGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostraridProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelidProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostraridProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_visualProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_visualProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_visualProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondoProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondoProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_bordeProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_bordeProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_fondo_controlProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_tamanio_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_tamanio_controlProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_mensaje_confirmacionProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_mensaje_confirmacionProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_botones_tool_barProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_botones_tool_barProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_exportarProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_exportarProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_delimiterProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarid_tipo_delimiterProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_exportar_cabeceraProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarcon_exportar_cabeceraProcesoCambiarParametroGeneral);
		//this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarpath_exportarProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jPanelpath_exportarProcesoCambiarParametroGeneral.setVisible(this.procesocambiarparametrogeneralConstantesFunciones.mostrarpath_exportarProcesoCambiarParametroGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCambiarParametroGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral!=null) {
	
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jLabelidProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activaridProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_visualProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondoProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_bordeProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_fondo_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_tamanio_controlProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarcon_mensaje_confirmacionProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarcon_botones_tool_barProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_exportarProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarid_tipo_delimiterProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarcon_exportar_cabeceraProcesoCambiarParametroGeneral);
		this.jInternalFrameDetalleFormProcesoCambiarParametroGeneral.jTextAreapath_exportarProcesoCambiarParametroGeneral.setEnabled(this.procesocambiarparametrogeneralConstantesFunciones.activarpath_exportarProcesoCambiarParametroGeneral);
		}
	}
	
		
}