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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ProcesoCierreMesConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoCierreMesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoCierreMesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoCierreMesBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCierreMesBeanSwingJInternalFrame extends ProcesoCierreMesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCierreMesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCierreMes> procesocierremesValidator = new ClassValidator<ProcesoCierreMes>(ProcesoCierreMes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCierreMes procesocierremes;	
	public ProcesoCierreMes procesocierremesAux;
	public ProcesoCierreMes procesocierremesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCierreMes procesocierremesTotales;
	public Long idProcesoCierreMesActual;
	public Long iIdNuevoProcesoCierreMes=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCierreMes;
	public Boolean isPermisoNuevoProcesoCierreMes;
	public Boolean isPermisoActualizarProcesoCierreMes;
	public Boolean isPermisoActualizarOriginalProcesoCierreMes;
	public Boolean isPermisoEliminarProcesoCierreMes;
	public Boolean isPermisoGuardarCambiosProcesoCierreMes;
	public Boolean isPermisoConsultaProcesoCierreMes;
	public Boolean isPermisoBusquedaProcesoCierreMes;
	public Boolean isPermisoReporteProcesoCierreMes;
	public Boolean isPermisoPaginacionMedioProcesoCierreMes;
	public Boolean isPermisoPaginacionAltoProcesoCierreMes;
	public Boolean isPermisoPaginacionTodoProcesoCierreMes;
	public Boolean isPermisoCopiarProcesoCierreMes;
	public Boolean isPermisoVerFormProcesoCierreMes;
	public Boolean isPermisoDuplicarProcesoCierreMes;
	public Boolean isPermisoOrdenProcesoCierreMes;
	
	
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
	
	public ProcesoCierreMesParameterReturnGeneral procesocierremesReturnGeneral;
	public ProcesoCierreMesParameterReturnGeneral procesocierremesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCierreMes=false;
	public Boolean esParaAccionDesdeFormularioProcesoCierreMes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCierreMesSessionBeanAdditional procesocierremesSessionBeanAdditional=null;
	
	public ProcesoCierreMesSessionBeanAdditional getProcesoCierreMesSessionBeanAdditional() {
		return this.procesocierremesSessionBeanAdditional;
	}
	
	public void setProcesoCierreMesSessionBeanAdditional(ProcesoCierreMesSessionBeanAdditional procesocierremesSessionBeanAdditional) {
		try {
			this.procesocierremesSessionBeanAdditional=procesocierremesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCierreMesBeanSwingJInternalFrameAdditional procesocierremesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCierreMesBeanSwingJInternalFrame
	
	public ProcesoCierreMesBeanSwingJInternalFrameAdditional getProcesoCierreMesBeanSwingJInternalFrameAdditional() {
		return this.procesocierremesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCierreMesBeanSwingJInternalFrameAdditional(ProcesoCierreMesBeanSwingJInternalFrameAdditional procesocierremesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocierremesBeanSwingJInternalFrameAdditional=procesocierremesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCierreMesLogic procesocierremesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCierreMes procesocierremesBean;
	public ProcesoCierreMesConstantesFunciones procesocierremesConstantesFunciones;
	//public ProcesoCierreMesParameterReturnGeneral procesocierremesReturnGeneral;
	
	//FK
	
	public MesLogic mesLogic;
	public EstructuraLogic estructuraLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCierreMes> procesocierremess;	
	//public List<ProcesoCierreMes> procesocierremessEliminados;
	//public List<ProcesoCierreMes> procesocierremessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCierreMes=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCierreMes=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCierreMes=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCierreMes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaModificarProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCierreMes=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCierreMes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCierreMes=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoProcesoCierreMes() {
		return this.iIdNuevoProcesoCierreMes;
	}

	public void setiIdNuevoProcesoCierreMes(Long iIdNuevoProcesoCierreMes) {
		this.iIdNuevoProcesoCierreMes = iIdNuevoProcesoCierreMes;
	}
	
	public Long getidProcesoCierreMesActual() {
		return this.idProcesoCierreMesActual;
	}

	public void setidProcesoCierreMesActual(Long idProcesoCierreMesActual) {
		this.idProcesoCierreMesActual = idProcesoCierreMesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCierreMes getprocesocierremes() {
		return this.procesocierremes;
	}

	public void setprocesocierremes(ProcesoCierreMes procesocierremes) {
		this.procesocierremes = procesocierremes;
	}
	
	public ProcesoCierreMes getprocesocierremesAux() {
		return this.procesocierremesAux;
	}

	public void setprocesocierremesAux(ProcesoCierreMes procesocierremesAux) {
		this.procesocierremesAux = procesocierremesAux;
	}				
	
	public ProcesoCierreMes getprocesocierremesAnterior() {
		return this.procesocierremesAnterior;
	}

	public void setprocesocierremesAnterior(ProcesoCierreMes procesocierremesAnterior) {
		this.procesocierremesAnterior = procesocierremesAnterior;
	}	
	
	public ProcesoCierreMes getprocesocierremesTotales() {
		return this.procesocierremesTotales;
	}

	public void setprocesocierremesTotales(ProcesoCierreMes procesocierremesTotales) {
		this.procesocierremesTotales = procesocierremesTotales;
	}	
	
	public ProcesoCierreMes getprocesocierremesBean() {
		return this.procesocierremesBean;
	}

	public void setprocesocierremesBean(ProcesoCierreMes procesocierremesBean) {
		this.procesocierremesBean = procesocierremesBean;
	}	
	
	public ProcesoCierreMesParameterReturnGeneral getprocesocierremesReturnGeneral() {
		return this.procesocierremesReturnGeneral;
	}

	public void setprocesocierremesReturnGeneral(ProcesoCierreMesParameterReturnGeneral procesocierremesReturnGeneral) {
		this.procesocierremesReturnGeneral = procesocierremesReturnGeneral;
	}	
	
	
	public Long id_mesBusquedaProcesoCierreMes=null;

	public Long getid_mesBusquedaProcesoCierreMes() {
		return this.id_mesBusquedaProcesoCierreMes;
	}

	public void setid_mesBusquedaProcesoCierreMes(Long id_mesBusquedaProcesoCierreMes) {
		this.id_mesBusquedaProcesoCierreMes = id_mesBusquedaProcesoCierreMes;
	}

;
	public Long id_estructuraBusquedaProcesoCierreMes=-1L;

	public Long getid_estructuraBusquedaProcesoCierreMes() {
		return this.id_estructuraBusquedaProcesoCierreMes;
	}

	public void setid_estructuraBusquedaProcesoCierreMes(Long id_estructuraBusquedaProcesoCierreMes) {
		this.id_estructuraBusquedaProcesoCierreMes = id_estructuraBusquedaProcesoCierreMes;
	}

;
	public Boolean es_para_reversionBusquedaProcesoCierreMes=false;

	public Boolean getes_para_reversionBusquedaProcesoCierreMes() {
		return this.es_para_reversionBusquedaProcesoCierreMes;
	}

	public void setes_para_reversionBusquedaProcesoCierreMes(Boolean es_para_reversionBusquedaProcesoCierreMes) {
		this.es_para_reversionBusquedaProcesoCierreMes = es_para_reversionBusquedaProcesoCierreMes;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCierreMesLogic getProcesoCierreMesLogic()	{		
		return procesocierremesLogic;
	}

	public void setProcesoCierreMesLogic(ProcesoCierreMesLogic procesocierremesLogic) {
		this.procesocierremesLogic = procesocierremesLogic;
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
	
	public Boolean getIsEsNuevoProcesoCierreMes() {
		return isEsNuevoProcesoCierreMes;
	}

	public void setIsEsNuevoProcesoCierreMes(Boolean isEsNuevoProcesoCierreMes) {
		this.isEsNuevoProcesoCierreMes = isEsNuevoProcesoCierreMes;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCierreMes() {
		return esParaAccionDesdeFormularioProcesoCierreMes;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCierreMes(Boolean esParaAccionDesdeFormularioProcesoCierreMes) {
		this.esParaAccionDesdeFormularioProcesoCierreMes = esParaAccionDesdeFormularioProcesoCierreMes;
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
	
	
	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierremesSessionBean==null) {
				this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
			}

			if(!this.procesocierremesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(procesocierremesSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierremesSessionBean==null) {
				this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
			}

			if(!this.procesocierremesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(procesocierremesSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	
	
	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.procesocierremes!=null) {
						this.procesocierremes.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
						this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesoCierreMes.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes!=null) {
						jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes!=null) {
							//jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesoCierreMesGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesProcesoCierreMesGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesoCierreMesGenerico!=null && jComboBoxid_mesProcesoCierreMesGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesoCierreMesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.procesocierremes!=null) {
						this.procesocierremes.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
						this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraProcesoCierreMes.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes!=null) {
						jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes!=null) {
							//jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraProcesoCierreMesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraProcesoCierreMesGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraProcesoCierreMesGenerico!=null && jComboBoxid_estructuraProcesoCierreMesGenerico.getItemCount()>0) {
					jComboBoxid_estructuraProcesoCierreMesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesoCierreMes procesocierremes,JComboBox jComboBoxid_mesProcesoCierreMesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesoCierreMesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesoCierreMesGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesocierremes.setid_mes(mesAux.getId());
				procesocierremes.setmes_descripcion(ProcesoCierreMesConstantesFunciones.getMesDescripcion(mesAux));
				procesocierremes.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(ProcesoCierreMes procesocierremes,JComboBox jComboBoxid_estructuraProcesoCierreMesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraProcesoCierreMesGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraProcesoCierreMesGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				procesocierremes.setid_estructura(estructuraAux.getId());
				procesocierremes.setestructura_descripcion(ProcesoCierreMesConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				procesocierremes.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { 
					}

					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.addItem(mes);
							}
						}

						if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { 
					}

					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.addItem(estructura);
							}
						}

						if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCierreMes() throws Exception {
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
		
	public ProcesoCierreMesParameterReturnGeneral getProcesoCierreMesParameterGeneral() {
		return this.procesocierremesParameterGeneral;
	}
	
	public void setProcesoCierreMesParameterGeneral(ProcesoCierreMesParameterReturnGeneral procesocierremesParameterGeneral) {
		this.procesocierremesParameterGeneral = procesocierremesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCierreMes() {
		return isPermisoTodoProcesoCierreMes;
	}

	public void setIsPermisoTodoProcesoCierreMes(Boolean isPermisoTodoProcesoCierreMes) {
		this.isPermisoTodoProcesoCierreMes = isPermisoTodoProcesoCierreMes;
	}

	public Boolean getIsPermisoNuevoProcesoCierreMes() {
		return isPermisoNuevoProcesoCierreMes;
	}

	public void setIsPermisoNuevoProcesoCierreMes(Boolean isPermisoNuevoProcesoCierreMes) {
		this.isPermisoNuevoProcesoCierreMes = isPermisoNuevoProcesoCierreMes;
	}

	public Boolean getIsPermisoActualizarProcesoCierreMes() {
		return isPermisoActualizarProcesoCierreMes;
	}

	public void setIsPermisoActualizarProcesoCierreMes(Boolean isPermisoActualizarProcesoCierreMes) {
		this.isPermisoActualizarProcesoCierreMes = isPermisoActualizarProcesoCierreMes;
	}

	public Boolean getIsPermisoEliminarProcesoCierreMes() {
		return isPermisoEliminarProcesoCierreMes;
	}

	public void setIsPermisoEliminarProcesoCierreMes(Boolean isPermisoEliminarProcesoCierreMes) {
		this.isPermisoEliminarProcesoCierreMes = isPermisoEliminarProcesoCierreMes;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCierreMes() {
		return isPermisoGuardarCambiosProcesoCierreMes;
	}

	public void setIsPermisoGuardarCambiosProcesoCierreMes(Boolean isPermisoGuardarCambiosProcesoCierreMes) {
		this.isPermisoGuardarCambiosProcesoCierreMes = isPermisoGuardarCambiosProcesoCierreMes;
	}
	
	public Boolean getIsPermisoConsultaProcesoCierreMes() {
		return isPermisoConsultaProcesoCierreMes;
	}

	public void setIsPermisoConsultaProcesoCierreMes(Boolean isPermisoConsultaProcesoCierreMes) {
		this.isPermisoConsultaProcesoCierreMes = isPermisoConsultaProcesoCierreMes;
	}

	public Boolean getIsPermisoBusquedaProcesoCierreMes() {
		return isPermisoBusquedaProcesoCierreMes;
	}

	public void setIsPermisoBusquedaProcesoCierreMes(Boolean isPermisoBusquedaProcesoCierreMes) {
		this.isPermisoBusquedaProcesoCierreMes = isPermisoBusquedaProcesoCierreMes;
	}

	public Boolean getIsPermisoReporteProcesoCierreMes() {
		return isPermisoReporteProcesoCierreMes;
	}

	public void setIsPermisoReporteProcesoCierreMes(Boolean isPermisoReporteProcesoCierreMes) {
		this.isPermisoReporteProcesoCierreMes = isPermisoReporteProcesoCierreMes;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCierreMes() {
		return isPermisoPaginacionMedioProcesoCierreMes;
	}

	public void setIsPermisoPaginacionMedioProcesoCierreMes(Boolean isPermisoPaginacionMedioProcesoCierreMes) {
		this.isPermisoPaginacionMedioProcesoCierreMes = isPermisoPaginacionMedioProcesoCierreMes;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCierreMes() {
		return isPermisoPaginacionTodoProcesoCierreMes;
	}

	public void setIsPermisoPaginacionTodoProcesoCierreMes(Boolean isPermisoPaginacionTodoProcesoCierreMes) {
		this.isPermisoPaginacionTodoProcesoCierreMes = isPermisoPaginacionTodoProcesoCierreMes;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCierreMes() {
		return isPermisoPaginacionAltoProcesoCierreMes;
	}

	public void setIsPermisoPaginacionAltoProcesoCierreMes(Boolean isPermisoPaginacionAltoProcesoCierreMes) {
		this.isPermisoPaginacionAltoProcesoCierreMes = isPermisoPaginacionAltoProcesoCierreMes;
	}
	
	public Boolean getIsPermisoCopiarProcesoCierreMes() {
		return isPermisoCopiarProcesoCierreMes;
	}

	public void setIsPermisoCopiarProcesoCierreMes(Boolean isPermisoCopiarProcesoCierreMes) {
		this.isPermisoCopiarProcesoCierreMes = isPermisoCopiarProcesoCierreMes;
	}
	
	public Boolean getIsPermisoVerFormProcesoCierreMes() {
		return isPermisoVerFormProcesoCierreMes;
	}

	public void setIsPermisoVerFormProcesoCierreMes(Boolean isPermisoVerFormProcesoCierreMes) {
		this.isPermisoVerFormProcesoCierreMes = isPermisoVerFormProcesoCierreMes;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCierreMes() {
		return isPermisoDuplicarProcesoCierreMes;
	}

	public void setIsPermisoDuplicarProcesoCierreMes(Boolean isPermisoDuplicarProcesoCierreMes) {
		this.isPermisoDuplicarProcesoCierreMes = isPermisoDuplicarProcesoCierreMes;
	}
	
	public Boolean getIsPermisoOrdenProcesoCierreMes() {
		return isPermisoOrdenProcesoCierreMes;
	}

	public void setIsPermisoOrdenProcesoCierreMes(Boolean isPermisoOrdenProcesoCierreMes) {
		this.isPermisoOrdenProcesoCierreMes = isPermisoOrdenProcesoCierreMes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCierreMes() {
		return isVisibilidadCeldaNuevoProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCierreMes(Boolean isVisibilidadCeldaNuevoProcesoCierreMes) {
		this.isVisibilidadCeldaNuevoProcesoCierreMes = isVisibilidadCeldaNuevoProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCierreMes() {
		return isVisibilidadCeldaDuplicarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCierreMes(Boolean isVisibilidadCeldaDuplicarProcesoCierreMes) {
		this.isVisibilidadCeldaDuplicarProcesoCierreMes = isVisibilidadCeldaDuplicarProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCierreMes() {
		return isVisibilidadCeldaCopiarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCierreMes(Boolean isVisibilidadCeldaCopiarProcesoCierreMes) {
		this.isVisibilidadCeldaCopiarProcesoCierreMes = isVisibilidadCeldaCopiarProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCierreMes() {
		return isVisibilidadCeldaVerFormProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCierreMes(Boolean isVisibilidadCeldaVerFormProcesoCierreMes) {
		this.isVisibilidadCeldaVerFormProcesoCierreMes = isVisibilidadCeldaVerFormProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCierreMes() {
		return isVisibilidadCeldaOrdenProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCierreMes(Boolean isVisibilidadCeldaOrdenProcesoCierreMes) {
		this.isVisibilidadCeldaOrdenProcesoCierreMes = isVisibilidadCeldaOrdenProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCierreMes() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCierreMes(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreMes) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes = isVisibilidadCeldaNuevoRelacionesProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCierreMes() {
		return isVisibilidadCeldaModificarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaModificarProcesoCierreMes(Boolean isVisibilidadCeldaModificarProcesoCierreMes) {
		this.isVisibilidadCeldaModificarProcesoCierreMes = isVisibilidadCeldaModificarProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCierreMes() {
		return isVisibilidadCeldaActualizarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCierreMes(Boolean isVisibilidadCeldaActualizarProcesoCierreMes) {
		this.isVisibilidadCeldaActualizarProcesoCierreMes = isVisibilidadCeldaActualizarProcesoCierreMes;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCierreMes() {
		return isVisibilidadCeldaEliminarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCierreMes(Boolean isVisibilidadCeldaEliminarProcesoCierreMes) {
		this.isVisibilidadCeldaEliminarProcesoCierreMes = isVisibilidadCeldaEliminarProcesoCierreMes;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCierreMes() {
		return isVisibilidadCeldaCancelarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCierreMes(Boolean isVisibilidadCeldaCancelarProcesoCierreMes) {
		this.isVisibilidadCeldaCancelarProcesoCierreMes = isVisibilidadCeldaCancelarProcesoCierreMes;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCierreMes() {
		return isVisibilidadCeldaGuardarProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCierreMes(Boolean isVisibilidadCeldaGuardarProcesoCierreMes) {
		this.isVisibilidadCeldaGuardarProcesoCierreMes = isVisibilidadCeldaGuardarProcesoCierreMes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCierreMes() {
		return isVisibilidadCeldaGuardarCambiosProcesoCierreMes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCierreMes(Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreMes) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes = isVisibilidadCeldaGuardarCambiosProcesoCierreMes;
	}
		
	public ProcesoCierreMesSessionBean getprocesocierremesSessionBean() {
		return this.procesocierremesSessionBean;
	}
	
	public void setprocesocierremesSessionBean(ProcesoCierreMesSessionBean procesocierremesSessionBean) {
		this.procesocierremesSessionBean=procesocierremesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCierreMes() {
		return this.isVisibilidadBusquedaProcesoCierreMes;
	}

	public void setisVisibilidadBusquedaProcesoCierreMes(Boolean isVisibilidadBusquedaProcesoCierreMes) {
		this.isVisibilidadBusquedaProcesoCierreMes=isVisibilidadBusquedaProcesoCierreMes;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(ProcesoCierreMes procesocierremes)throws Exception {
		try {
			
				this.setActualParaGuardarMesForeignKey(procesocierremes,null);
				this.setActualParaGuardarEstructuraForeignKey(procesocierremes,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCierreMes procesocierremes,ProcesoCierreMes procesocierremesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCierreMes(procesocierremes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocierremesAux.setId(procesocierremes.getId());
		procesocierremesAux.setVersionRow(procesocierremes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCierreMes procesocierremesLocal) throws Exception {
		
		if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCierreMes procesocierremesLocal) throws Exception {	
		if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesocierremesLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				procesocierremesLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCierreMesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocierremesValidator.getInvalidValues(this.procesocierremes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCierreMes procesocierremes,List<ProcesoCierreMes> procesocierremess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCierreMes procesocierremes,List<ProcesoCierreMes> procesocierremess) throws Exception {
		try	{			
			ProcesoCierreMesConstantesFunciones.actualizarSelectedLista(procesocierremes,procesocierremess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCierreMes> procesocierremessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocierremessLocal=this.procesocierremesLogic.getProcesoCierreMess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocierremessLocal=this.procesocierremess;
			}
			//ARCHITECTURE
		
			for(ProcesoCierreMes procesocierremesLocal:procesocierremessLocal) {
				if(this.permiteMantenimiento(procesocierremesLocal) && procesocierremesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCierreMesConstantesFunciones.getProcesoCierreMesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCierreMesConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreMes.jLabelid_mesProcesoCierreMes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreMesConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreMes.jLabelid_estructuraProcesoCierreMes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreMesConstantesFunciones.ESPARAREVERSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreMes.jLabeles_para_reversionProcesoCierreMes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreMes.jLabelid_mesProcesoCierreMes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreMes.jLabelid_estructuraProcesoCierreMes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreMes.jLabeles_para_reversionProcesoCierreMes,"");
		
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
		this.iIdNuevoProcesoCierreMes--;	
		
		
		this.procesocierremesAux=new ProcesoCierreMes();
		
		this.procesocierremesAux.setId(this.iIdNuevoProcesoCierreMes);
		this.procesocierremesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierremesLogic.getProcesoCierreMess().add(this.procesocierremesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocierremess.add(this.procesocierremesAux);
		}
		//ARCHITECTURE
		
		this.procesocierremes=this.procesocierremesAux;
		
		if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCierreMes(this.procesocierremes);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreMes(this.procesocierremes);
		}
				
		//this.setDefaultControlesProcesoCierreMes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCierreMes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreMes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreMes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreMes(this.procesocierremesBean,this.procesocierremes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreMes(this.procesocierremesReturnGeneral,this.procesocierremesBean,false);
		
		if(this.procesocierremesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes());
		}
		
		if(this.procesocierremesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes(),classes);//this.procesocierremesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCierreMes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCierreMes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.RecargarFormProcesoCierreMes(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCierreMes(false);
						
			if(procesocierremesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreMes();
			}
			
			this.actualizarVisualTableDatosProcesoCierreMes();
			
			this.jTableDatosProcesoCierreMes.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreMes(), this.getIndiceNuevoProcesoCierreMes());
			
			this.seleccionarFilaTablaProcesoCierreMesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCierreMes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCierreMes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setEnabled(isHabilitar && this.procesocierremesConstantesFunciones.activares_para_reversionProcesoCierreMes);	
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setEnabled(isHabilitar && this.procesocierremesConstantesFunciones.activarid_mesProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setEnabled(isHabilitar && this.procesocierremesConstantesFunciones.activarid_estructuraProcesoCierreMes);
	};
	
	public void setDefaultControlesProcesoCierreMes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCierreMes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocierremesSessionBean.setConGuardarRelaciones(true);			
			this.procesocierremesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.setVisible(true);
			
					
		} else {
			//this.procesocierremesSessionBean.setConGuardarRelaciones(false);			
			this.procesocierremesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCierreMes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
				if(procesocierremesAux.getId().equals(this.iIdNuevoProcesoCierreMes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremess) {
				if(procesocierremesAux.getId().equals(this.iIdNuevoProcesoCierreMes)) {
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
	
	public int getIndiceActualProcesoCierreMes(ProcesoCierreMes procesocierremes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
				if(procesocierremesAux.getId().equals(procesocierremes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremess) {
				if(procesocierremesAux.getId().equals(procesocierremes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCierreMes(ProcesoCierreMes procesocierremesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
				if(procesocierremesAux.getProcesoCierreMesOriginal().getId().equals(procesocierremesOriginal.getId())) {
					existe=true;
					procesocierremesOriginal.setId(procesocierremesAux.getId());
					procesocierremesOriginal.setVersionRow(procesocierremesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreMes procesocierremesAux:this.procesocierremess) {
				if(procesocierremesAux.getProcesoCierreMesOriginal().getId().equals(procesocierremesOriginal.getId())) {
					existe=true;
					procesocierremesOriginal.setId(procesocierremesAux.getId());
					procesocierremesOriginal.setVersionRow(procesocierremesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCierreMes(Boolean esParaCancelar) throws Exception {
		procesocierremessAux=new ArrayList<ProcesoCierreMes>();
		procesocierremesAux=new ProcesoCierreMes();
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
					if(procesocierremesAux.getId()<0) {
						procesocierremessAux.add(procesocierremesAux);
					}		
				}
				this.iIdNuevoProcesoCierreMes=0L;
				this.procesocierremesLogic.getProcesoCierreMess().removeAll(procesocierremessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreMes procesocierremesAux:this.procesocierremess) {
					if(procesocierremesAux.getId()<0) {
						procesocierremessAux.add(procesocierremesAux);
					}		
				}
				this.iIdNuevoProcesoCierreMes=0L;
				this.procesocierremess.removeAll(procesocierremessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreMes 
					&& this.procesocierremesLogic.getProcesoCierreMess().size()>0
					) {
					procesocierremesAux=this.procesocierremesLogic.getProcesoCierreMess().get(this.procesocierremesLogic.getProcesoCierreMess().size() - 1);
				
					if(procesocierremesAux.getId()<0) {
						this.procesocierremesLogic.getProcesoCierreMess().remove(procesocierremesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreMes && this.procesocierremess.size()>0) {
					procesocierremesAux=this.procesocierremess.get(this.procesocierremess.size() - 1);
				
					if(procesocierremesAux.getId()<0) {
						this.procesocierremess.remove(procesocierremesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCierreMes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocierremes.getId()<0) {
				this.procesocierremesLogic.getProcesoCierreMess().remove(this.procesocierremes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocierremes.getId()<0) {
				this.procesocierremess.remove(this.procesocierremes);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCierreMes(List<ProcesoCierreMes> procesocierremessAux) throws Exception {
		ProcesoCierreMesConstantesFunciones.setEstadosInicialesProcesoCierreMes(procesocierremessAux);
	}
	
	public void setEstadosInicialesProcesoCierreMes(ProcesoCierreMes procesocierremesAux) throws Exception {
		ProcesoCierreMesConstantesFunciones.setEstadosInicialesProcesoCierreMes(procesocierremesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCierreMesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCierreMesActual()) {
				if(!this.isEsNuevoProcesoCierreMes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCierreMes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCierreMesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cierre Mes ?", "MANTENIMIENTO DE Proceso Cierre Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCierreMes procesocierremes) throws Exception {
		ProcesoCierreMesConstantesFunciones.seleccionarAsignar(this.procesocierremes,procesocierremes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCierreMes=this.isPermisoActualizarOriginalProcesoCierreMes;
			
			
			this.seleccionarAsignar(procesocierremes);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCierreMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocierremesSessionBean.setsFuncionBusquedaRapida(this.procesocierremesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCierreMes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCierreMes(esParaCancelar);				
				this.cancelarNuevoProcesoCierreMes(esParaCancelar);								
			}
			
			this.procesocierremes=new ProcesoCierreMes();
			
			this.inicializarProcesoCierreMes();
			
			this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCierreMes() throws Exception {
		try {
			ProcesoCierreMesConstantesFunciones.inicializarProcesoCierreMes(this.procesocierremes);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocierremesLogic.getProcesoCierreMess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCierreMess(String sAccionBusqueda,List<ProcesoCierreMes> procesocierremessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCierreMes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCierreMesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCierreMesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCierreMes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cierre Meses");		
		parameters.put("busquedapor", ProcesoCierreMesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCierreMes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCierreMes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCierreMesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCierreMesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCierreMesBean.TraerProcesoCierreMesBeans(procesocierremessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCierreMesActionPerformed(null);
					//this.generarExcelReporteProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCierreMess(sAccionBusqueda,sTipoArchivoReporte,procesocierremessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCierreMess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreMes> procesocierremessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreMess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreMes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCierreMes procesocierremes : procesocierremessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCierreMesConstantesFunciones.generarExcelReporteDataProcesoCierreMes("NORMAL",row,workbook,procesocierremes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCierreMes(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCierreMesConstantesFunciones.generarExcelReporteHeaderProcesoCierreMes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCierreMess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreMes> procesocierremessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreMess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCierreMes procesocierremes : procesocierremessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCierreMesConstantesFunciones.getProcesoCierreMesDescripcion(procesocierremes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreMesConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierremes.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierremes.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesocierremes.getes_para_reversion()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCierreMess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreMes> procesocierremessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCierreMes> procesocierremessRespaldo=null;
		
		classes=ProcesoCierreMesConstantesFunciones.getClassesRelationshipsOfProcesoCierreMes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocierremesLogic.setDatosCliente(this.datosCliente);
		this.procesocierremesLogic.setDatosDeep(this.datosDeep);
		this.procesocierremesLogic.setIsConDeep(true);
		
		procesocierremessRespaldo=this.procesocierremesLogic.getProcesoCierreMess();
		
		this.procesocierremesLogic.setProcesoCierreMess(procesocierremessParaReportes);	
		this.procesocierremesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocierremessParaReportes=this.procesocierremesLogic.getProcesoCierreMess();
		this.procesocierremesLogic.setProcesoCierreMess(procesocierremessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreMess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreMes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCierreMes procesocierremes : procesocierremessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCierreMes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCierreMesConstantesFunciones.generarExcelReporteDataProcesoCierreMes("NORMAL",row,workbook,procesocierremes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCierreMesConstantesFunciones.getProcesoCierreMesDescripcion(procesocierremes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCierreMes() throws Exception {		
		this.startProcessProcesoCierreMes(true);
	}
	
	public void startProcessProcesoCierreMes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCierreMes ,this.jPanelParametrosReportesProcesoCierreMes, this.jScrollPanelDatosProcesoCierreMes,this.jPanelPaginacionProcesoCierreMes, this.jScrollPanelDatosEdicionProcesoCierreMes, this.jPanelAccionesProcesoCierreMes,this.jPanelAccionesFormularioProcesoCierreMes,this.jmenuBarProcesoCierreMes,this.jmenuBarDetalleProcesoCierreMes,this.jTtoolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreMes=this.jTabbedPaneBusquedasProcesoCierreMes; 
		
		final JPanel jPanelParametrosReportesProcesoCierreMes=this.jPanelParametrosReportesProcesoCierreMes;
		//final JScrollPane jScrollPanelDatosProcesoCierreMes=this.jScrollPanelDatosProcesoCierreMes;
		final JTable jTableDatosProcesoCierreMes=this.jTableDatosProcesoCierreMes;		
		final JPanel jPanelPaginacionProcesoCierreMes=this.jPanelPaginacionProcesoCierreMes;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreMes=this.jScrollPanelDatosEdicionProcesoCierreMes;
		final JPanel jPanelAccionesProcesoCierreMes=this.jPanelAccionesProcesoCierreMes;
		
		JPanel jPanelCamposAuxiliarProcesoCierreMes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreMes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			jPanelCamposAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jPanelCamposProcesoCierreMes;
			jPanelAccionesFormularioAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jPanelAccionesFormularioProcesoCierreMes;
		}
		
		final JPanel jPanelCamposProcesoCierreMes=jPanelCamposAuxiliarProcesoCierreMes;
		final JPanel jPanelAccionesFormularioProcesoCierreMes=jPanelAccionesFormularioAuxiliarProcesoCierreMes;
		
		
		final JMenuBar jmenuBarProcesoCierreMes=this.jmenuBarProcesoCierreMes;
		final JToolBar jTtoolBarProcesoCierreMes=this.jTtoolBarProcesoCierreMes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreMes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreMes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jmenuBarDetalleProcesoCierreMes;
			jTtoolBarDetalleAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jTtoolBarDetalleProcesoCierreMes;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreMes=jmenuBarDetalleAuxiliarProcesoCierreMes;
		final JToolBar jTtoolBarDetalleProcesoCierreMes=jTtoolBarDetalleAuxiliarProcesoCierreMes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreMes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreMes;
			processRunnable.jTableDatos=jTableDatosProcesoCierreMes;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreMes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreMes;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreMes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreMes;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreMes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreMes;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreMes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreMes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreMes ,jPanelParametrosReportesProcesoCierreMes,jTableDatosProcesoCierreMes, /*jScrollPanelDatosProcesoCierreMes,*/jPanelCamposProcesoCierreMes,jPanelPaginacionProcesoCierreMes, /*jScrollPanelDatosEdicionProcesoCierreMes,*/ jPanelAccionesProcesoCierreMes,jPanelAccionesFormularioProcesoCierreMes,jmenuBarProcesoCierreMes,jmenuBarDetalleProcesoCierreMes,jTtoolBarProcesoCierreMes,jTtoolBarDetalleProcesoCierreMes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreMes ,jPanelParametrosReportesProcesoCierreMes, jScrollPanelDatosProcesoCierreMes,jPanelPaginacionProcesoCierreMes, jScrollPanelDatosEdicionProcesoCierreMes, jPanelAccionesProcesoCierreMes,jPanelAccionesFormularioProcesoCierreMes,jmenuBarProcesoCierreMes,jmenuBarDetalleProcesoCierreMes,jTtoolBarProcesoCierreMes,jTtoolBarDetalleProcesoCierreMes);
						
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
	
	public void finishProcessProcesoCierreMes() {// throws Exception 
		this.finishProcessProcesoCierreMes(true);
	}
	
	public void finishProcessProcesoCierreMes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCierreMes ,this.jPanelParametrosReportesProcesoCierreMes, this.jScrollPanelDatosProcesoCierreMes,this.jPanelPaginacionProcesoCierreMes, this.jScrollPanelDatosEdicionProcesoCierreMes, this.jPanelAccionesProcesoCierreMes,this.jPanelAccionesFormularioProcesoCierreMes,this.jmenuBarProcesoCierreMes,this.jmenuBarDetalleProcesoCierreMes,this.jTtoolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreMes=this.jTabbedPaneBusquedasProcesoCierreMes; 
		
		final JPanel jPanelParametrosReportesProcesoCierreMes=this.jPanelParametrosReportesProcesoCierreMes;
		//final JScrollPane jScrollPanelDatosProcesoCierreMes=this.jScrollPanelDatosProcesoCierreMes;
		final JTable jTableDatosProcesoCierreMes=this.jTableDatosProcesoCierreMes;		
		final JPanel jPanelPaginacionProcesoCierreMes=this.jPanelPaginacionProcesoCierreMes;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreMes=this.jScrollPanelDatosEdicionProcesoCierreMes;
		final JPanel jPanelAccionesProcesoCierreMes=this.jPanelAccionesProcesoCierreMes;
		
		JPanel jPanelCamposAuxiliarProcesoCierreMes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreMes=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			jPanelCamposAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jPanelCamposProcesoCierreMes;
			jPanelAccionesFormularioAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jPanelAccionesFormularioProcesoCierreMes;
		}
		
		final JPanel jPanelCamposProcesoCierreMes=jPanelCamposAuxiliarProcesoCierreMes;
		final JPanel jPanelAccionesFormularioProcesoCierreMes=jPanelAccionesFormularioAuxiliarProcesoCierreMes;
		
		
		final JMenuBar jmenuBarProcesoCierreMes=this.jmenuBarProcesoCierreMes;		
		final JToolBar jTtoolBarProcesoCierreMes=this.jTtoolBarProcesoCierreMes;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreMes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreMes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jmenuBarDetalleProcesoCierreMes;
			jTtoolBarDetalleAuxiliarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jTtoolBarDetalleProcesoCierreMes;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreMes=jmenuBarDetalleAuxiliarProcesoCierreMes;
		final JToolBar jTtoolBarDetalleProcesoCierreMes=jTtoolBarDetalleAuxiliarProcesoCierreMes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreMes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreMes;
			processRunnable.jTableDatos=jTableDatosProcesoCierreMes;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreMes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreMes;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreMes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreMes;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreMes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreMes;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreMes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreMes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCierreMes ,jPanelParametrosReportesProcesoCierreMes, jTableDatosProcesoCierreMes,/*jScrollPanelDatosProcesoCierreMes,*/jPanelCamposProcesoCierreMes,jPanelPaginacionProcesoCierreMes, /*jScrollPanelDatosEdicionProcesoCierreMes,*/ jPanelAccionesProcesoCierreMes,jPanelAccionesFormularioProcesoCierreMes,jmenuBarProcesoCierreMes,jmenuBarDetalleProcesoCierreMes,jTtoolBarProcesoCierreMes,jTtoolBarDetalleProcesoCierreMes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCierreMes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCierreMes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCierreMes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCierreMes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCierreMes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCierreMes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCierreMes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCierreMes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCierreMes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocierremesConstantesFunciones.getsFinalQueryProcesoCierreMes();
		String  finalQueryPaginacionTodos=this.procesocierremesConstantesFunciones.getsFinalQueryProcesoCierreMes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCierreMesConstantesFunciones.getArrayColumnasGlobalesNoProcesoCierreMes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCierreMesConstantesFunciones.getArrayColumnasGlobalesProcesoCierreMes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCierreMesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocierremessEliminados= new ArrayList<ProcesoCierreMes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCierreMes();
		
				///*ProcesoCierreMesSessionBean*/this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
			
			if(this.procesocierremesSessionBean==null) {
				this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
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
					this.iNumeroPaginacion=ProcesoCierreMesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCierreMesConstantesFunciones.getClassesForeignKeysOfProcesoCierreMes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocierremes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocierremessAux= new ArrayList<ProcesoCierreMes>();
			
				
			procesocierremesLogic.setDatosCliente(this.datosCliente);
			procesocierremesLogic.setDatosDeep(this.datosDeep);
			procesocierremesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCierreMes")) {
				this.sDetalleReporte=ProcesoCierreMesConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreMes(id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocierremesLogic.getProcesoCierreMessBusquedaProcesoCierreMes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreMesConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreMes(id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreMesConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreMes(id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocierremesLogic.getProcesoCierreMess()==null||procesocierremesLogic.getProcesoCierreMess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocierremess==null|| procesocierremess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierremessAux=new ArrayList<ProcesoCierreMes>();
						procesocierremessAux.addAll(procesocierremesLogic.getProcesoCierreMess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierremessAux=new ArrayList<ProcesoCierreMes>();
							procesocierremessAux.addAll(procesocierremess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocierremesLogic.getProcesoCierreMessBusquedaProcesoCierreMes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreMesConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreMes(id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreMesConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreMes(id_mesBusquedaProcesoCierreMes,id_estructuraBusquedaProcesoCierreMes,es_para_reversionBusquedaProcesoCierreMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCierreMess("BusquedaProcesoCierreMes",procesocierremesLogic.getProcesoCierreMess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCierreMess("BusquedaProcesoCierreMes",procesocierremess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierremesLogic.setProcesoCierreMess(new ArrayList<ProcesoCierreMes>());
						procesocierremesLogic.getProcesoCierreMess().addAll(procesocierremessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierremess=new ArrayList<ProcesoCierreMes>();
							procesocierremess.addAll(procesocierremessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCierreMes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCierreMes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierremesLogic.getProcesoCierreMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierremess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierremesLogic.getProcesoCierreMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierremess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCierreMes procesocierremes) {
		Boolean permite=true;
		
		if(this.procesocierremes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCierreMesConstantesFunciones.getOrderByListaProcesoCierreMes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCierreMesConstantesFunciones.getOrderByListaProcesoCierreMes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreMes procesocierremes:procesocierremesLogic.getProcesoCierreMess()) {
				if(procesocierremes.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierremesTotales=procesocierremes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreMes procesocierremes:this.procesocierremess) {
				if(procesocierremes.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierremesTotales=procesocierremes;
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
			this.procesocierremesAux=new ProcesoCierreMes();
			this.procesocierremesAux.setsType(Constantes2.S_TOTALES);
			this.procesocierremesAux.setIsNew(false);
			this.procesocierremesAux.setIsChanged(false);
			this.procesocierremesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCierreMesConstantesFunciones.TotalizarValoresFilaProcesoCierreMes(this.procesocierremesLogic.getProcesoCierreMess(),this.procesocierremesAux);
				
				//this.procesocierremesLogic.getProcesoCierreMess().add(this.procesocierremesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCierreMesConstantesFunciones.TotalizarValoresFilaProcesoCierreMes(this.procesocierremess,this.procesocierremesAux);
				
				this.procesocierremess.add(this.procesocierremesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocierremesTotales=new ProcesoCierreMes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierremesLogic.getProcesoCierreMess().remove(procesocierremesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierremess.remove(procesocierremesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocierremesTotales=new ProcesoCierreMes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreMes procesocierremes:procesocierremesLogic.getProcesoCierreMess()) {
				if(procesocierremes.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierremesTotales=procesocierremes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreMesConstantesFunciones.TotalizarValoresFilaProcesoCierreMes(this.procesocierremesLogic.getProcesoCierreMess(),procesocierremesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreMes procesocierremes:this.procesocierremess) {
				if(procesocierremes.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierremesTotales=procesocierremes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreMesConstantesFunciones.TotalizarValoresFilaProcesoCierreMes(this.procesocierremess,procesocierremesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCierreMessBusquedaProcesoCierreMes()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCierreMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreMessFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreMessFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCierreMessBusquedaProcesoCierreMes(String sFinalQuery,Long id_mes,Long id_estructura,Boolean es_para_reversion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierremesLogic.getProcesoCierreMessBusquedaProcesoCierreMes(sFinalQuery,this.pagination,id_mes,id_estructura,es_para_reversion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreMessFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierremesLogic.getProcesoCierreMessFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreMessFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierremesLogic.getProcesoCierreMessFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosProcesoCierreMes() {
		this.isPermisoTodoProcesoCierreMes=false;
		this.isPermisoNuevoProcesoCierreMes=false;
		this.isPermisoActualizarProcesoCierreMes=false;
		this.isPermisoActualizarOriginalProcesoCierreMes=false;
		this.isPermisoEliminarProcesoCierreMes=false;
		this.isPermisoGuardarCambiosProcesoCierreMes=false;
		this.isPermisoConsultaProcesoCierreMes=true;
		this.isPermisoBusquedaProcesoCierreMes=true;
		this.isPermisoReporteProcesoCierreMes=true;
		this.isPermisoOrdenProcesoCierreMes=false;		
		this.isPermisoPaginacionMedioProcesoCierreMes=false;		
		this.isPermisoPaginacionAltoProcesoCierreMes=false;		
		this.isPermisoPaginacionTodoProcesoCierreMes=false;		
		this.isPermisoCopiarProcesoCierreMes=false;		
		this.isPermisoVerFormProcesoCierreMes=false;		
		this.isPermisoDuplicarProcesoCierreMes=false;
		this.isPermisoOrdenProcesoCierreMes=false;
	}
	
	public void setPermisosUsuarioProcesoCierreMes(Boolean isPermiso) {
		this.isPermisoTodoProcesoCierreMes=isPermiso;
		this.isPermisoNuevoProcesoCierreMes=isPermiso;
		this.isPermisoActualizarProcesoCierreMes=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreMes=isPermiso;
		this.isPermisoEliminarProcesoCierreMes=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreMes=isPermiso;
		this.isPermisoConsultaProcesoCierreMes=isPermiso;
		this.isPermisoBusquedaProcesoCierreMes=isPermiso;
		this.isPermisoReporteProcesoCierreMes=isPermiso;
		this.isPermisoOrdenProcesoCierreMes=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCierreMes=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCierreMes=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCierreMes=isPermiso;		
		this.isPermisoCopiarProcesoCierreMes=isPermiso;		
		this.isPermisoVerFormProcesoCierreMes=isPermiso;		
		this.isPermisoDuplicarProcesoCierreMes=isPermiso;
		this.isPermisoOrdenProcesoCierreMes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCierreMes(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCierreMes=isPermiso;
		this.isPermisoNuevoProcesoCierreMes=isPermiso;
		this.isPermisoActualizarProcesoCierreMes=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreMes=isPermiso;
		this.isPermisoEliminarProcesoCierreMes=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreMes=isPermiso;
		//this.isPermisoConsultaProcesoCierreMes=isPermiso;
		//this.isPermisoBusquedaProcesoCierreMes=isPermiso;
		//this.isPermisoReporteProcesoCierreMes=isPermiso;
		//this.isPermisoOrdenProcesoCierreMes=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCierreMes=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCierreMes=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCierreMes=isPermiso;		
		//this.isPermisoCopiarProcesoCierreMes=isPermiso;		
		//this.isPermisoDuplicarProcesoCierreMes=isPermiso;
		//this.isPermisoOrdenProcesoCierreMes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreMesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCierreMesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCierreMes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreMesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCierreMesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCierreMesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCierreMesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCierreMes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCierreMesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCierreMesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCierreMes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCierreMes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCierreMes=this.isPermisoActualizarProcesoCierreMes;
			this.isPermisoEliminarProcesoCierreMes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCierreMes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCierreMes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCierreMes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCierreMes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCierreMes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreMes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCierreMes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCierreMes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCierreMes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCierreMes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCierreMes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCierreMes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreMes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCierreMes.setToolTipText(this.jTableDatosProcesoCierreMes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCierreMes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCierreMes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCierreMesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCierreMesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCierreMes() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCierreMesListas()throws Exception {
		try	{						
			
				this.messForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCierreMesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCierreMesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCierreMes()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyEstructura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {
			if(this.procesocierremesSessionBean==null) {
				this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
			}

			if(!this.procesocierremesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.procesocierremesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreMes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreMes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCierreMes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreMes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCierreMes(ProcesoCierreMes procesocierremes)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(procesocierremes.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCierreMes(ProcesoCierreMes procesocierremes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCierreMes()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.procesocierremesConstantesFunciones.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreMes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCierreMes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCierreMes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCierreMes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCierreMes()throws Exception {
		try {
			

			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCierreMes(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCierreMes()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ProcesoCierreMesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCierreMesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCierreMesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean(); 
		this.procesocierremesConstantesFunciones=new ProcesoCierreMesConstantesFunciones(); 
		this.procesocierremesBean=new ProcesoCierreMes();//(this.procesocierremesConstantesFunciones); 		
		this.procesocierremesReturnGeneral=new ProcesoCierreMesParameterReturnGeneral(); 
		
		this.procesocierremesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierremesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCierreMesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCierreMesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCierreMesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCierreMes(true);
			
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
			
			this.procesocierremesConstantesFunciones=new ProcesoCierreMesConstantesFunciones(); 
			this.procesocierremesBean=new ProcesoCierreMes();//this.procesocierremesConstantesFunciones); 			
			this.procesocierremesReturnGeneral=new ProcesoCierreMesParameterReturnGeneral(); 
		
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Mes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocierremes=new ProcesoCierreMes();
			this.procesocierremess = new ArrayList<ProcesoCierreMes>();
			this.procesocierremessAux = new ArrayList<ProcesoCierreMes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic=new ProcesoCierreMesLogic();
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocierremesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocierremesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCierreMes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreMes);	
					}
					
					if(this.jInternalFrameImportacionProcesoCierreMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreMes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCierreMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCierreMes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreMes);
				this.jInternalFrameDetalleFormProcesoCierreMes.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCierreMes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreMes);
					this.jInternalFrameReporteDinamicoProcesoCierreMes.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCierreMes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCierreMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreMes);
					this.jInternalFrameImportacionProcesoCierreMes.setVisible(false);
					this.jInternalFrameImportacionProcesoCierreMes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCierreMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreMes);
					this.jInternalFrameOrderByProcesoCierreMes.setVisible(false);
					this.jInternalFrameOrderByProcesoCierreMes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCierreMesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCierreMesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocierremesReturnGeneral=new ProcesoCierreMesParameterReturnGeneral();
			
			this.procesocierremesParameterGeneral=new ProcesoCierreMesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocierremesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCierreMesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreMesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierremesSessionBean.getEsGuardarRelacionado(),this.procesocierremesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreMesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierremesSessionBean.getEsGuardarRelacionado(),this.procesocierremesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreMes=true;
			this.isVisibilidadCeldaCopiarProcesoCierreMes=true;
			this.isVisibilidadCeldaVerFormProcesoCierreMes=true;
			this.isVisibilidadCeldaOrdenProcesoCierreMes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			
			
			this.isVisibilidadBusquedaProcesoCierreMes=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCierreMes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCierreMes(false);
			
			this.setPermisosUsuarioProcesoCierreMes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocierremesSessionBean.getEsGuardarRelacionado() && this.procesocierremesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCierreMesClasesRelacionadas();
			}
			
			if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCierreMesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCierreMes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreMes();
			}
			
			if(!this.isPermisoBusquedaProcesoCierreMes) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCierreMesConstantesFunciones.getTiposSeleccionarProcesoCierreMes());
				
				this.tiposColumnasSelect=ProcesoCierreMesConstantesFunciones.getTiposSeleccionarProcesoCierreMes(true);
				
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
			//if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCierreMes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCierreMes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCierreMes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreMes() ;
			
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
			
			this.mesLogic=new MesLogic();
			this.estructuraLogic=new EstructuraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocierremesImplementable= (ProcesoCierreMesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreMesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocierremesImplementableHome= (ProcesoCierreMesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreMesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocierremess= new ArrayList<ProcesoCierreMes>();
			this.procesocierremessEliminados= new ArrayList<ProcesoCierreMes>();
						
			this.isEsNuevoProcesoCierreMes=false;
			this.esParaAccionDesdeFormularioProcesoCierreMes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.messForeignKey=new ArrayList<Mes>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCierreMes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCierreMes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCierreMesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCierreMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCierreMes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCierreMes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCierreMes();
			}
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCierreMes.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCierreMes.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCierreMes.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCierreMes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCierreMes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCierreMes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCierreMes")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCierreMes();	
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
	
	public void cargarCombosForeignKeyProcesoCierreMes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCierreMes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCierreMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCierreMesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCierreMes();
		
		this.cargarCombosFrameForeignKeyProcesoCierreMes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCierreMes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCierreMes();
		}
	}
	
	

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCierreMesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			
			if(jTableDatosProcesoCierreMes.getRowCount()>=1) {
				jTableDatosProcesoCierreMes.removeRowSelectionInterval(0, jTableDatosProcesoCierreMes.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCierreMes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCierreMes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCierreMes(true);			
			//this.procesocierremes=new ProcesoCierreMes();
			//this.procesocierremes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreMes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreMes() ;
			
			if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreMes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocierremes);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);				
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCierreMes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCierreMesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCierreMes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreMes.getSelectedRows().length;			
			}
			
			procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCierreMes--;			
				//ProcesoCierreMes procesocierremesAux= new ProcesoCierreMes();			
				//procesocierremesAux.setId(this.iIdNuevoProcesoCierreMes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCierreMes procesocierremesOrigen=new ProcesoCierreMes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCierreMes procesocierremesOrigen : procesocierremessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocierremesOrigen =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierremesOrigen =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCierreMes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocierremes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCierreMes(procesocierremesOrigen,this.procesocierremes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierremesLogic.getProcesoCierreMess().add(this.procesocierremesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierremess.add(this.procesocierremesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
				
				this.jTableDatosProcesoCierreMes.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreMes(), this.getIndiceNuevoProcesoCierreMes());
				
				int iLastRow =  this.jTableDatosProcesoCierreMes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreMes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreMes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreMes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();									
		
			ProcesoCierreMes procesocierremesOrigen=new ProcesoCierreMes();
			ProcesoCierreMes procesocierremesDestino=new ProcesoCierreMes();
				
			procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreMes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocierremessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCierreMes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierremesOrigen =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierremesOrigen =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierremesDestino =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierremesDestino =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocierremesOrigen =procesocierremessSeleccionados.get(0);
				procesocierremesDestino =procesocierremessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCierreMes(procesocierremesOrigen,procesocierremesDestino,true,false);
				
				procesocierremesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocierremesDestino,procesocierremesLogic.getProcesoCierreMess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocierremesDestino,procesocierremess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
				
				//this.jTableDatosProcesoCierreMes.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreMes(), this.getIndiceNuevoProcesoCierreMes());
				
				int iLastRow =  this.jTableDatosProcesoCierreMes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreMes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreMes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreMes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCierreMes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCierreMes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCierreMes.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCierreMes.setVisible(!isVisible);
			this.jPanelAccionesProcesoCierreMes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCierreMes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCierreMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCierreMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCierreMes();
			
			this.abrirFrameOrderByProcesoCierreMes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCierreMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCierreMes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreMes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCierreMes.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCierreMes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCierreMes.setSize(this.jInternalFrameDetalleFormProcesoCierreMes.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCierreMes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCierreMes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCierreMes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCierreMes.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCierreMes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreMes.jContentPaneDetalleProcesoCierreMes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreMes.jContentPaneDetalleProcesoCierreMes.getWidth(),ProcesoCierreMesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreMes.jContentPaneDetalleProcesoCierreMes.getWidth(),ProcesoCierreMesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreMes.jContentPaneDetalleProcesoCierreMes.getWidth(),ProcesoCierreMesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCierreMes.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCierreMes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCierreMes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCierreMes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCierreMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreMes,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCierreMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreMes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreMes);
				this.jInternalFrameOrderByProcesoCierreMes.setVisible(false);
				this.jInternalFrameOrderByProcesoCierreMes.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCierreMes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreMes"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCierreMes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCierreMes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCierreMes==null) {
				
				this.jInternalFrameImportacionProcesoCierreMes=new ImportacionJInternalFrame(ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreMes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreMes);
				this.jInternalFrameImportacionProcesoCierreMes.setVisible(false);
				this.jInternalFrameImportacionProcesoCierreMes.setSelected(false);


				this.jInternalFrameImportacionProcesoCierreMes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreMes"));
				this.jInternalFrameImportacionProcesoCierreMes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreMes"));
				this.jInternalFrameImportacionProcesoCierreMes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreMes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCierreMes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreMes==null) {
				this.jInternalFrameReporteDinamicoProcesoCierreMes=new ReporteDinamicoJInternalFrame(ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreMes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreMes);
				this.jInternalFrameReporteDinamicoProcesoCierreMes.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCierreMes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreMes"));
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreMes"));
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreMes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreMes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCierreMes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreMes);
			
	       	this.jInternalFrameDetalleFormProcesoCierreMes.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCierreMes.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCierreMes.dispose();
			//this.jInternalFrameDetalleFormProcesoCierreMes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCierreMes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCierreMes.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCierreMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCierreMes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCierreMes.setVisible(true);
	        this.jInternalFrameImportacionProcesoCierreMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCierreMes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCierreMes.setVisible(true);
	        this.jInternalFrameOrderByProcesoCierreMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCierreMes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCierreMes.setVisible(false);
	        this.jInternalFrameOrderByProcesoCierreMes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCierreMes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCierreMes.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCierreMes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCierreMes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCierreMes.setVisible(false);
	        this.jInternalFrameImportacionProcesoCierreMes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCierreMes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCierreMes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCierreMes(true);
			//this.isEsNuevoProcesoCierreMes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCierreMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreMes(false) ;
			
			if(procesocierremesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreMes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreMes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCierreMesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCierreMes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCierreMes(true);
			//this.isEsNuevoProcesoCierreMes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocierremes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCierreMes(false) ;
			
			if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreMes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreMes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreMes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreMes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreMes(false);
			
			//if(!this.isEsNuevoProcesoCierreMes) {								
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				
			}
			
			if(this.permiteMantenimiento(this.procesocierremes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCierreMes=true;
					this.inicializarActualizarBindingTablaProcesoCierreMes(false);
					this.isEsNuevoProcesoCierreMes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCierreMes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCierreMes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreMes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreMes(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreMes(false);
			
												
				
				if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCierreMes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCierreMesActionPerformed(evt,procesocierremesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCierreMes(this.procesocierremes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCierreMes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocierremesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocierremes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				this.procesocierremes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				this.procesocierremes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocierremes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCierreMesModel) this.jTableDatosProcesoCierreMes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCierreMes=true;
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
				this.isEsNuevoProcesoCierreMes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreMes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreMes(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreMes(false);
				
				
				
				if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCierreMes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCierreMes.getRowCount()>=1) {
				jTableDatosProcesoCierreMes.removeRowSelectionInterval(0, jTableDatosProcesoCierreMes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCierreMes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreMes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreMes(false) ;
			
			this.isEsNuevoProcesoCierreMes=false;
			
			if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCierreMes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCierreMes(false);
				
				//SI ES MANUAL
				if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCierreMes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCierreMes--;			
			//ProcesoCierreMes procesocierremesAux= new ProcesoCierreMes();			
			//procesocierremesAux.setId(this.iIdNuevoProcesoCierreMes);
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCierreMes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
			
			this.procesocierremes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocierremesLogic.getProcesoCierreMess().add(this.procesocierremesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocierremess.add(this.procesocierremesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			
			this.jTableDatosProcesoCierreMes.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreMes(), this.getIndiceNuevoProcesoCierreMes());
			
			int iLastRow =  this.jTableDatosProcesoCierreMes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCierreMes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCierreMes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreMes(false);
			
			//SI ES MANUAL
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreMes();
			}
			
			//this.abrirFrameTreeProcesoCierreMes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCierreMes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCierreMes.setFileImportacion(this.jInternalFrameImportacionProcesoCierreMes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCierreMes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCierreMes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCierreMes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCierreMes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		

		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCierreMesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCierreMesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreMesConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParaReversion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParaReversion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParaReversion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParaReversion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreMes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCierreMesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION:
					sNombreCampoCategoria="es_para_reversion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCierreMesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION:
					sNombreCampoCategoriaValor="es_para_reversion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreMesConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Para Reversion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_reversion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCierreMess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCierreMesConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesoCierreMes procesocierremes:procesocierremessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierremes.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(ProcesoCierreMes procesocierremes:procesocierremessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierremes.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION);
					iRow++;

					for(ProcesoCierreMes procesocierremes:procesocierremessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierremes.getes_para_reversion());
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
			//	this.getFilaCabeceraExportarExcelProcesoCierreMes(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCierreMes(procesocierremesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCierreMes(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreMes(false);
			
			//SI ES MANUAL
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreMes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreMes(false);
			
			//SI ES MANUAL
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreMes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreMes(false);
			
			//SI ES MANUAL
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreMes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCierreMes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCierreMes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCierreMes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCierreMes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCierreMes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCierreMes.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCierreMes.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCierreMes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCierreMes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCierreMes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCierreMes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCierreMes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCierreMes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCierreMes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreMes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreMes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCierreMes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCierreMes();
		
		this.inicializarActualizarBindingBotonesManualProcesoCierreMes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreMes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreMes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreMes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreMes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCierreMes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCierreMes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCierreMes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionNuevoProcesoCierreMes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionSinCerrarProcesoCierreMes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionSinMensajeProcesoCierreMes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCierreMes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCierreMes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCierreMes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
				this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionNuevoProcesoCierreMes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionSinCerrarProcesoCierreMes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxPostAccionSinMensajeProcesoCierreMes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCierreMes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCierreMes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCierreMes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCierreMes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCierreMes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCierreMes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCierreMes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCierreMes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCierreMes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCierreMes(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreMes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreMes() throws Exception {
		try	{
			if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreMes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreMes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreMes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCierreMes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCierreMes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCierreMes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCierreMes.addItem(reporte);
			}
			
			
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCierreMes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCierreMes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCierreMes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCierreMes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCierreMes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCierreMes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCierreMes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreMes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreMes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreMes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCierreMes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.getSelectedItem()!=null){this.id_mesBusquedaProcesoCierreMes=((Mes)this.jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.getSelectedItem()!=null){this.id_estructuraBusquedaProcesoCierreMes=((Estructura)this.jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.getSelectedItem()).getId();}
		this.es_para_reversionBusquedaProcesoCierreMes=this.jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.isSelected();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCierreMes(Boolean esInicializar) throws Exception {				
		if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreMes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCierreMes() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCierreMes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCierreMes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCierreMesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCierreMes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocierremesLogic.getProcesoCierreMess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocierremess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCierreMes.setModel(new ProcesoCierreMesModel(this.procesocierremesLogic.getProcesoCierreMess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCierreMes.setModel(new ProcesoCierreMesModel(this.procesocierremess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCierreMes!=null && this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCierreMes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,procesocierremesConstantesFunciones.resaltarSeleccionarProcesoCierreMes,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,procesocierremesConstantesFunciones.resaltarSeleccionarProcesoCierreMes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_ID));

		if(this.procesocierremesConstantesFunciones.mostraridProcesoCierreMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreMesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocierremesConstantesFunciones.resaltaridProcesoCierreMes,this.procesocierremesConstantesFunciones.activaridProcesoCierreMes,this,true,"idProcesoCierreMes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocierremesConstantesFunciones.resaltaridProcesoCierreMes,this.procesocierremesConstantesFunciones.activaridProcesoCierreMes,this,true,"idProcesoCierreMes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_IDMES));

		if(this.procesocierremesConstantesFunciones.mostrarid_mesProcesoCierreMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreMesConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.procesocierremesConstantesFunciones.resaltarid_mesProcesoCierreMes,this,this.procesocierremesConstantesFunciones.activarid_mesProcesoCierreMes));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.procesocierremesConstantesFunciones.resaltarid_mesProcesoCierreMes,this,this.procesocierremesConstantesFunciones.activarid_mesProcesoCierreMes,true,"id_mesProcesoCierreMes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.procesocierremesConstantesFunciones.mostrarid_estructuraProcesoCierreMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.procesocierremesConstantesFunciones.resaltarid_estructuraProcesoCierreMes,this,this.procesocierremesConstantesFunciones.activarid_estructuraProcesoCierreMes));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.procesocierremesConstantesFunciones.resaltarid_estructuraProcesoCierreMes,this,this.procesocierremesConstantesFunciones.activarid_estructuraProcesoCierreMes,true,"id_estructuraProcesoCierreMes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION));

		if(this.procesocierremesConstantesFunciones.mostrares_para_reversionProcesoCierreMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesocierremesConstantesFunciones.resaltares_para_reversionProcesoCierreMes,this.procesocierremesConstantesFunciones.activares_para_reversionProcesoCierreMes));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesocierremesConstantesFunciones.resaltares_para_reversionProcesoCierreMes,this.procesocierremesConstantesFunciones.activares_para_reversionProcesoCierreMes,this,true,"es_para_reversionProcesoCierreMes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCierreMesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreMes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreMes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocierremesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCierreMes.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCierreMes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCierreMes.moveColumn(this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCierreMes.moveColumn(this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCierreMes.moveColumn(this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCierreMes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCierreMes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCierreMes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCierreMes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCierreMes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCierreMes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocierremesLogic.getProcesoCierreMess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocierremess.size()-1;
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
		//this.jTableDatosProcesoCierreMes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCierreMes();
			
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
				
				//this.isEsNuevoProcesoCierreMes=false;
					
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
				if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreMes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreMes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreMes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocierremes.getsType().equals("DUPLICADO")
				   || this.procesocierremes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCierreMes=true;
				
				} else {
					this.isEsNuevoProcesoCierreMes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocierremes.getId()>=0 && !this.procesocierremes.getIsNew()) {						
						this.isEsNuevoProcesoCierreMes=false;
						
					} else {
						this.isEsNuevoProcesoCierreMes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCierreMes(esRelaciones);						
				
				this.seleccionarProcesoCierreMes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocierremes.getId()<0) {
					this.isEsNuevoProcesoCierreMes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCierreMes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCierreMes(evt,rowIndex);
				}	
				
				if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCierreMes: " + this.dDif); 
					}
				}								
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCierreMes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocierremes)) {
					if(this.procesocierremes.getId()>0) {
						this.procesocierremes.setIsDeleted(true);
						
						this.procesocierremessEliminados.add(this.procesocierremes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierremesLogic.getProcesoCierreMess().remove(this.procesocierremes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierremess.remove(this.procesocierremes);				
					}
					
					
					((ProcesoCierreMesModel) this.jTableDatosProcesoCierreMes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreMes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCierreMes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCierreMes) {
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreMes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreMes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCierreMes(this.procesocierremes);
				}
				
				//ARCHITECTURE
				try {
					

					//Mes
					if(!this.procesocierremesConstantesFunciones.cargarid_mesProcesoCierreMes || this.procesocierremesConstantesFunciones.event_dependid_mesProcesoCierreMes) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.procesocierremes.getid_mes());
									//this.inicializarActualizarBindingProcesoCierreMes(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(procesocierremes.getMes()!=null) {
							this.messForeignKey.add(procesocierremes.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.procesocierremes.getid_mes(),false,"Formulario");

					//Estructura
					if(!this.procesocierremesConstantesFunciones.cargarid_estructuraProcesoCierreMes || this.procesocierremesConstantesFunciones.event_dependid_estructuraProcesoCierreMes) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.procesocierremes.getid_estructura());
									//this.inicializarActualizarBindingProcesoCierreMes(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(procesocierremes.getEstructura()!=null) {
							this.estructurasForeignKey.add(procesocierremes.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.procesocierremes.getid_estructura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCierreMes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCierreMes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreMes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreMes(ProcesoCierreMes procesocierremes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCierreMes(procesocierremes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreMes(ProcesoCierreMes procesocierremes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCierreMes(procesocierremes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCierreMes(procesocierremes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreMes(procesocierremes);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCierreMes(ProcesoCierreMes procesocierremes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setText(procesocierremes.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setSelected(procesocierremes.getes_para_reversion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCierreMes procesocierremesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocierremesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCierreMes procesocierremesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocierremesLocal=this.procesocierremes;
			} else {
				procesocierremesLocal=this.procesocierremesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocierremesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCierreMes(procesocierremesLocal,true);
					
					if(procesocierremesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocierremesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocierremesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCierreMes(ProcesoCierreMes procesocierremes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreMes(procesocierremes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(procesocierremes);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreMes(ProcesoCierreMes procesocierremes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreMes(procesocierremes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreMes(ProcesoCierreMes procesocierremes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.getText()==null || this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.getText()=="" || this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setText("0");
			}

			if(conColumnasBase) {procesocierremes.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreMesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreMes.jLabelIdProcesoCierreMes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocierremes.setes_para_reversion(this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreMes.jLabeles_para_reversionProcesoCierreMes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreMes(ProcesoCierreMes procesocierremesBean,ProcesoCierreMes procesocierremes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCierreMes(ProcesoCierreMes procesocierremesOrigen,ProcesoCierreMes procesocierremes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierremesOrigen.getId()!=null && !procesocierremesOrigen.getId().equals(0L))) {procesocierremes.setId(procesocierremesOrigen.getId());}}
			if(conDefault || (!conDefault && procesocierremesOrigen.getes_para_reversion()!=null && !procesocierremesOrigen.getes_para_reversion().equals(false))) {procesocierremes.setes_para_reversion(procesocierremesOrigen.getes_para_reversion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreMes(ProcesoCierreMes procesocierremes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setText(procesocierremes.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setSelected(procesocierremes.getes_para_reversion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreMes(ProcesoCierreMesBean procesocierremesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setText(procesocierremesBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setSelected(procesocierremesBean.getes_para_reversion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCierreMes(ProcesoCierreMesParameterReturnGeneral procesocierremesReturnGeneral,ProcesoCierreMesBean procesocierremesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCierreMes procesocierremesLocal=new ProcesoCierreMes();
			
			procesocierremesLocal=procesocierremesReturnGeneral.getProcesoCierreMes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierremesLocal.getId()!=null && !procesocierremesLocal.getId().equals(0L))) {procesocierremesBean.setId(procesocierremesLocal.getId());}}
			if(conDefault || (!conDefault && procesocierremesLocal.getes_para_reversion()!=null && !procesocierremesLocal.getes_para_reversion().equals(false))) {procesocierremesBean.setes_para_reversion(procesocierremesLocal.getes_para_reversion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCierreMesGenerico(Long idProcesoCierreMesSeleccionado,JComboBox jComboBoxProcesoCierreMes,List<ProcesoCierreMes> procesocierremessLocal)throws Exception {
		try {
			ProcesoCierreMes  procesocierremesTemp=null;

			for(ProcesoCierreMes procesocierremesAux:procesocierremessLocal) {
				if(procesocierremesAux.getId()!=null && procesocierremesAux.getId().equals(idProcesoCierreMesSeleccionado)) {
					procesocierremesTemp=procesocierremesAux;
					break;
				}
			}

			jComboBoxProcesoCierreMes.setSelectedItem(procesocierremesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCierreMesGenerico(JComboBox jComboBoxProcesoCierreMes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreMes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCierreMes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreMes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCierreMes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierremes=(ProcesoCierreMes) procesocierremesLogic.getProcesoCierreMess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierremes =(ProcesoCierreMes) procesocierremess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesocierremes.getIsNew() && !procesocierremes.getIsChanged() && !procesocierremes.getIsDeleted()) {
				sDescripcion=procesocierremes.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierremes.getmes_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!procesocierremes.getIsNew() && !procesocierremes.getIsChanged() && !procesocierremes.getIsDeleted()) {
				sDescripcion=procesocierremes.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierremes.getestructura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCierreMes procesocierremesRow=new ProcesoCierreMes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierremesRow=(ProcesoCierreMes) procesocierremesLogic.getProcesoCierreMess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierremesRow=(ProcesoCierreMes) procesocierremess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCierreMes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));			
			this.jButtonDuplicarProcesoCierreMes.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreMes && this.isPermisoDuplicarProcesoCierreMes));			
			this.jButtonCopiarProcesoCierreMes.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreMes && this.isPermisoCopiarProcesoCierreMes));
			this.jButtonVerFormProcesoCierreMes.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreMes && this.isPermisoVerFormProcesoCierreMes));
			
			this.jButtonAbrirOrderByProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));			
			
			this.jButtonNuevoRelacionesProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));			
			this.jButtonNuevoGuardarCambiosProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarProcesoCierreMes.setVisible((this.isVisibilidadCeldaModificarProcesoCierreMes && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreMes && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreMes && this.isPermisoEliminarProcesoCierreMes));
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreMes);							
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));						
			this.jButtonDuplicarToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreMes && this.isPermisoDuplicarProcesoCierreMes));						
			this.jButtonCopiarToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreMes && this.isPermisoCopiarProcesoCierreMes));			
			this.jButtonVerFormToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreMes && this.isPermisoVerFormProcesoCierreMes));			
			this.jButtonAbrirOrderByToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));
			this.jButtonNuevoRelacionesToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));			
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaModificarProcesoCierreMes && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreMes  && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreMes && this.isPermisoEliminarProcesoCierreMes));
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarToolBarProcesoCierreMes.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreMes);				
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));			
			this.jMenuItemDuplicarProcesoCierreMes.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreMes && this.isPermisoDuplicarProcesoCierreMes));			
			this.jMenuItemCopiarProcesoCierreMes.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreMes && this.isPermisoCopiarProcesoCierreMes));			
			this.jMenuItemVerFormProcesoCierreMes.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreMes && this.isPermisoVerFormProcesoCierreMes));			
			this.jMenuItemAbrirOrderByProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));			
			//this.jMenuItemMostrarOcultarProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));
			this.jMenuItemDetalleAbrirOrderByProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCierreMes.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreMes && this.isPermisoOrdenProcesoCierreMes));			
			this.jMenuItemNuevoRelacionesProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes));			
			this.jMenuItemNuevoGuardarCambiosProcesoCierreMes.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreMes && this.isPermisoNuevoProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));									
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemModificarProcesoCierreMes.setVisible((this.isVisibilidadCeldaModificarProcesoCierreMes && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemActualizarProcesoCierreMes.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreMes && this.isPermisoActualizarProcesoCierreMes));	
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemEliminarProcesoCierreMes.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreMes && this.isPermisoEliminarProcesoCierreMes));
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemCancelarProcesoCierreMes.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreMes);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));						
			this.jMenuItemGuardarCambiosTablaProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=this.jButtonNuevoProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCierreMes=this.jButtonDuplicarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCierreMes=this.jButtonCopiarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCierreMes=this.jButtonVerFormProcesoCierreMes.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCierreMes=this.jButtonAbrirOrderByProcesoCierreMes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=this.jButtonNuevoRelacionesProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaModificarProcesoCierreMes=this.jButtonModificarProcesoCierreMes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.isVisibilidadCeldaActualizarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=this.jButtonGuardarCambiosTablaProcesoCierreMes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCierreMes=this.jButtonNuevoToolBarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=this.jButtonNuevoRelacionesToolBarProcesoCierreMes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarToolBarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarToolBarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarToolBarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarToolBarProcesoCierreMes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreMes=this.jButtonGuardarCambiosToolBarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCierreMes=this.jMenuItemNuevoProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=this.jMenuItemNuevoRelacionesProcesoCierreMes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemModificarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemActualizarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemEliminarProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreMes=this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemCancelarProcesoCierreMes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreMes=this.jMenuItemGuardarCambiosProcesoCierreMes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=this.jMenuItemGuardarCambiosTablaProcesoCierreMes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCierreMes(Boolean esInicializar) {
		if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreMes();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCierreMes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCierreMes() {
		this.jButtonNuevoProcesoCierreMes.setVisible(this.isPermisoNuevoProcesoCierreMes);			
		this.jButtonDuplicarProcesoCierreMes.setVisible(this.isPermisoDuplicarProcesoCierreMes);			
		this.jButtonCopiarProcesoCierreMes.setVisible(this.isPermisoCopiarProcesoCierreMes);			
		this.jButtonVerFormProcesoCierreMes.setVisible(this.isPermisoVerFormProcesoCierreMes);			
		
		this.jButtonAbrirOrderByProcesoCierreMes.setVisible(this.isPermisoOrdenProcesoCierreMes);					
		
		this.jButtonNuevoRelacionesProcesoCierreMes.setVisible(this.isPermisoNuevoProcesoCierreMes);			
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarProcesoCierreMes.setVisible(this.isPermisoActualizarProcesoCierreMes);	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.setVisible(this.isPermisoActualizarProcesoCierreMes);	
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.setVisible(this.isPermisoEliminarProcesoCierreMes);
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreMes);						
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.setVisible(this.isPermisoGuardarCambiosProcesoCierreMes);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.setVisible(this.isPermisoActualizarProcesoCierreMes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreMes() {
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarProcesoCierreMes.setVisible(this.isPermisoActualizarProcesoCierreMes);	
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.setVisible(this.isPermisoActualizarProcesoCierreMes);	
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.setVisible(this.isPermisoEliminarProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreMes);							
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreMes && this.isPermisoGuardarCambiosProcesoCierreMes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCierreMes() {
		if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreMes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCierreMes() {
	}
	
	public void jTableDatosProcesoCierreMesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCierreMes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCierreMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierremes==null) {
						this.procesocierremes = new ProcesoCierreMes();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				}

				if(this.procesocierremes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocierremes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesoCierreMesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesoCierreMes(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreMes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreMes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesocierremesLogic.getConnexion());

				if(this.procesocierremes.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesocierremes.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreMes=(TitledBorder)this.jScrollPanelDatosProcesoCierreMes.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesoCierreMes.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesoCierreMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierremes==null) {
						this.procesocierremes = new ProcesoCierreMes();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				}

				if(this.procesocierremes.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesocierremes.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraProcesoCierreMesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebProcesoCierreMes(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreMes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreMes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.procesocierremesLogic.getConnexion());

				if(this.procesocierremes.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.procesocierremes.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreMes=(TitledBorder)this.jScrollPanelDatosProcesoCierreMes.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderProcesoCierreMes.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraProcesoCierreMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierremes==null) {
						this.procesocierremes = new ProcesoCierreMes();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				}

				if(this.procesocierremes.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.procesocierremes.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_para_reversionProcesoCierreMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.getprocesocierremes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierremes==null) {
						this.procesocierremes = new ProcesoCierreMes();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);
				}

				if(this.procesocierremes.getes_para_reversion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_reversion = "+this.procesocierremes.getes_para_reversion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCierreMesProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreMes(false,false);

			this.getProcesoCierreMessBusquedaProcesoCierreMes();

			this.inicializarActualizarBindingProcesoCierreMes(false);

			//if(ProcesoCierreMesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreMes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreMes(false,false);

			this.getProcesoCierreMessFK_IdEstructura();

			this.inicializarActualizarBindingProcesoCierreMes(false);

			//if(ProcesoCierreMesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreMes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesoCierreMesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreMes(false,false);

			this.getProcesoCierreMessFK_IdMes();

			this.inicializarActualizarBindingProcesoCierreMes(false);

			//if(ProcesoCierreMesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreMes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierremesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCierreMes() {
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
			this.jInternalFrameDetalleFormProcesoCierreMes.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCierreMes.dispose();
			this.jInternalFrameDetalleFormProcesoCierreMes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
			this.jInternalFrameReporteDinamicoProcesoCierreMes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCierreMes.dispose();
			this.jInternalFrameReporteDinamicoProcesoCierreMes=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCierreMes!=null) {
			this.jInternalFrameImportacionProcesoCierreMes.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCierreMes.dispose();
			this.jInternalFrameImportacionProcesoCierreMes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCierreMes();
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCierreMes")) {
				jButtonDuplicarProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCierreMes")) {
				jButtonCopiarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCierreMes")) {
				jButtonVerFormProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCierreMes")) {
				jButtonDuplicarProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCierreMes")) {
				jButtonDuplicarProcesoCierreMesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCierreMes")) {
				jButtonModificarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCierreMes")) {
				jButtonModificarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCierreMes")) {
				jButtonModificarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCierreMes")) {
				jButtonActualizarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCierreMes")) {
				jButtonActualizarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCierreMes")) {
				jButtonActualizarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCierreMes")) {
				jButtonEliminarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCierreMes")) {
				jButtonEliminarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCierreMes")) {
				jButtonEliminarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCierreMes")) {
				jButtonCancelarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCierreMes")) {
				jButtonCancelarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCierreMes")) {
				jButtonCancelarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCierreMes")) {
				jButtonCerrarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCierreMes")) {
				jButtonCerrarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCierreMes")) {
				jButtonCerrarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCierreMes")) {
				jButtonMostrarOcultarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCierreMes")) {
				jButtonCancelarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCierreMes")) {
				jButtonCopiarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCierreMes")) {
				jButtonVerFormProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCierreMes")) {
				jButtonCopiarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCierreMes")) {
				jButtonVerFormProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCierreMes")) {
				jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCierreMes")) {
				jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCierreMes")) {
				jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCierreMes")) {
				jButtonAnterioresProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCierreMes")) {
				jButtonAnterioresProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCierreMes")) {
				jButtonAnterioresProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCierreMes")) {
				jButtonSiguientesProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCierreMes")) {
				jButtonSiguientesProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCierreMes")) {
				jButtonSiguientesProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCierreMes") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCierreMes")) {
				jButtonAbrirOrderByProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCierreMes") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCierreMes")) {
				jButtonMostrarOcultarProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreMes")) {
				jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCierreMes")) {
				jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCierreMes")) {
				jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCierreMes")) {
				jButtonProcesarInformacionProcesoCierreMesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCierreMes")) {
				jButtonCerrarReporteDinamicoProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCierreMes")) {
				jButtonGenerarReporteDinamicoProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCierreMes")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCierreMes")) {
				jButtonCerrarImportacionProcesoCierreMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCierreMes")) {
				
				jButtonGenerarImportacionProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCierreMes")) {
				
				jButtonAbrirImportacionProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCierreMes")) {
				jComboBoxTiposAccionesProcesoCierreMesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCierreMes")) {
				jComboBoxTiposRelacionesProcesoCierreMesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCierreMes")) {
				jComboBoxTiposAccionesProcesoCierreMesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCierreMes")) {
				
				jComboBoxTiposSeleccionarProcesoCierreMesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCierreMes")) {
				jTextFieldValorCampoGeneralProcesoCierreMesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCierreMes")) {
				jButtonAbrirOrderByProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCierreMes")) {
				jButtonAbrirOrderByProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCierreMes")) {
				jButtonCerrarOrderByProcesoCierreMesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreMesBusqueda")) {
				this.jButtonidProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoCierreMesUpdate")) {
				this.jButtonid_mesProcesoCierreMesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoCierreMesBusqueda")) {
				this.jButtonid_mesProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreMesUpdate")) {
				this.jButtonid_estructuraProcesoCierreMesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreMesBusqueda")) {
				this.jButtonid_estructuraProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_reversionProcesoCierreMesBusqueda")) {
				this.jButtones_para_reversionProcesoCierreMesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCierreMesProcesoCierreMes")) {
				this.jButtonBusquedaProcesoCierreMesProcesoCierreMesActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCierreMes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCierreMes procesocierremesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocierremesLocal=this.procesocierremes;
			} else {
				procesocierremesLocal=this.procesocierremesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
							
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
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
			
			


			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
								
						
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
								
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
							
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
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
			
			


			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
								
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCierreMes")) {
					jCheckBoxSeleccionarTodosProcesoCierreMesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCierreMes")) {
					jCheckBoxSeleccionadosProcesoCierreMesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCierreMes")) {
					
				}
				
				


				
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
												
				
				


				
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
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
			
			


			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreMesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierremes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierremes);
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
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
				
				


				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreMes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreMes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierremesAnterior =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCierreMes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCierreMesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCierreMes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocierremes =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocierremes =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocierremes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCierreMes")) {
				
				}
				
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCierreMes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCierreMes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCierreMes")) {
			
			}
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCierreMes();
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCierreMes")) {
				jButtonDuplicarProcesoCierreMesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCierreMes")) {
				jButtonCopiarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCierreMes")) {
				jButtonVerFormProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreMes")) {
				jButtonNuevoProcesoCierreMesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCierreMes")) {
				jButtonModificarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCierreMes")) {
				jButtonActualizarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCierreMes")) {
				jButtonEliminarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCierreMes")) {
				jButtonCancelarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCierreMes")) {
				jButtonCerrarProcesoCierreMesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCierreMes")) {
				jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreMes")) {
				jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCierreMes")) {
				jButtonAbrirOrderByProcesoCierreMesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCierreMes")) {
				jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCierreMes")) {
				jButtonAnterioresProcesoCierreMesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCierreMes")) {
				jButtonSiguientesProcesoCierreMesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreMesBusqueda")) {
				this.jButtonidProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoCierreMesUpdate")) {
				this.jButtonid_mesProcesoCierreMesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoCierreMesBusqueda")) {
				this.jButtonid_mesProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreMesUpdate")) {
				this.jButtonid_estructuraProcesoCierreMesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreMesBusqueda")) {
				this.jButtonid_estructuraProcesoCierreMesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_reversionProcesoCierreMesBusqueda")) {
				this.jButtones_para_reversionProcesoCierreMesBusquedaActionPerformed(evt);
			}
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCierreMes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCierreMes")) {
				closingInternalFrameProcesoCierreMes();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCierreMes")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCierreMes = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCierreMesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreMesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreMes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCierreMesActionPerformed(null);
			}
			
			ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierremes,new Object(),this.procesocierremesParameterGeneral,this.procesocierremesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCierreMes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCierreMes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCierreMes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocierremes)) {
			if(!esControlTabla) {
				if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);			
				}
				
				if(this.procesocierremesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCierreMes(this.procesocierremes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreMes(this.procesocierremesReturnGeneral,this.procesocierremesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocierremesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreMes(classes,this.procesocierremesReturnGeneral,this.procesocierremesBean,false);
					}
						
					if(this.procesocierremesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes());	
					}
						
					if(this.procesocierremesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreMes(this.procesocierremesReturnGeneral.getProcesoCierreMes(),classes);//this.procesocierremesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreMes(this.procesocierremes,classes);//this.procesocierremesBean);									
				}
			
				if(ProcesoCierreMesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCierreMes(this.procesocierremes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreMes(this.procesocierremes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocierremesAnterior!=null) {
						this.procesocierremes=this.procesocierremesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocierremesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocierremesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocierremesReturnGeneral.getProcesoCierreMes(),procesocierremesLogic.getProcesoCierreMess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocierremesReturnGeneral.getProcesoCierreMes(),this.procesocierremess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCierreMes.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCierreMes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCierreMes();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCierreMes() throws Exception {
		
		ProcesoCierreMesModel procesocierremesModel=(ProcesoCierreMesModel)this.jTableDatosProcesoCierreMes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierremesModel.procesocierremess=this.procesocierremesLogic.getProcesoCierreMess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocierremesModel.procesocierremess=this.procesocierremess;
		}
		
		
		((ProcesoCierreMesModel) this.jTableDatosProcesoCierreMes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCierreMes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocierremesAnterior(),this.procesocierremesLogic.getProcesoCierreMess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocierremesAnterior(),this.procesocierremess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCierreMes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCierreMes(ProcesoCierreMes procesocierremes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
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
										
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierremes,new Object(),generalEntityParameterGeneral,this.procesocierremesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCierreMesConstantesFunciones.getClassesRelationshipsOfProcesoCierreMes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCierreMesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCierreMes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCierreMes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCierreMesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierremes,new Object(),generalEntityParameterGeneral,this.procesocierremesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCierreMes(ProcesoCierreMesBean procesocierremesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreMes(ArrayList<Classe> classes,ProcesoCierreMesReturnGeneral procesocierremesReturnGeneral,ProcesoCierreMesBean procesocierremesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCierreMes(ProcesoCierreMes procesocierremes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocierremes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreMes = new ProcesoCierreMesDetalleFormJInternalFrame(jDesktopPane,this.procesocierremesSessionBean.getConGuardarRelaciones(),this.procesocierremesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCierreMes.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCierreMes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCierreMes.procesocierremesLogic=this.procesocierremesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCierreMes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreMes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreMes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCierreMes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreMes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCierreMes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreMes"));
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreMes"));

		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreMes"));
					
		this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemModificarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreMes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreMes"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreMes"));
						
		this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemActualizarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreMes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreMes"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreMes"));
								
		this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemEliminarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreMes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreMes"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreMes"));
					
		this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemCancelarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreMes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemDetalleCerrarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreMes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreMes"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreMes"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreMes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonidProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtones_para_reversionProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"es_para_reversionProcesoCierreMesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreMes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCierreMes"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreMes"));
		}
		
		this.jTableDatosProcesoCierreMes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCierreMes"));
		
		this.jTableDatosProcesoCierreMes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCierreMes"));
		
		this.jButtonNuevoProcesoCierreMes.addActionListener(new ButtonActionListener(this,"NuevoProcesoCierreMes"));
		
		this.jButtonDuplicarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCierreMes"));
		
		this.jButtonCopiarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"CopiarProcesoCierreMes"));
		
		this.jButtonVerFormProcesoCierreMes.addActionListener(new ButtonActionListener(this,"VerFormProcesoCierreMes"));
		
		
		this.jButtonNuevoToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCierreMes"));
			
		this.jButtonDuplicarToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCierreMes"));
			
		this.jMenuItemNuevoProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCierreMes"));
			
		this.jMenuItemDuplicarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCierreMes"));		
		
		
		this.jButtonNuevoRelacionesProcesoCierreMes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCierreMes"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCierreMes"));
			
		this.jMenuItemNuevoRelacionesProcesoCierreMes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCierreMes"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonModificarToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreMes"));
			
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemModificarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonActualizarToolBarProcesoCierreMes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreMes"));
				
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemActualizarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonEliminarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreMes"));
						
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemEliminarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonCancelarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreMes"));
			
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemCancelarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreMes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCierreMes"));		
		
		
		this.jButtonCerrarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CerrarProcesoCierreMes"));
		
		
		this.jButtonCerrarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCierreMes"));
			
		this.jMenuItemCerrarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCierreMes"));
			
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jMenuItemDetalleCerrarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCierreMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreMes"));
		}
		
		this.jButtonCopiarToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCierreMes"));
			
		this.jButtonVerFormToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCierreMes"));
		
		this.jMenuItemGuardarCambiosProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCierreMes"));
			
		this.jMenuItemCopiarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCierreMes"));		
		
		this.jMenuItemVerFormProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCierreMes"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreMes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCierreMes"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreMes"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreMes.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCierreMes"));
					
		this.jButtonRecargarInformacionToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCierreMes"));
		
		this.jMenuItemRecargarInformacionProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCierreMes"));		
		
		
		
		this.jButtonAnterioresProcesoCierreMes.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCierreMes"));
		
		
		this.jButtonAnterioresToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCierreMes"));
		
		this.jMenuItemAnterioresProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCierreMes"));		
		
		
		this.jButtonSiguientesProcesoCierreMes.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCierreMes"));
		
		
		this.jButtonSiguientesToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCierreMes"));
			
		this.jMenuItemSiguientesProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCierreMes"));
			
		this.jMenuItemAbrirOrderByProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCierreMes"));
			
		this.jMenuItemMostrarOcultarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCierreMes"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCierreMes"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCierreMes"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCierreMes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCierreMes"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCierreMes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCierreMes"));		
		
		
		this.jButtonProcesarInformacionProcesoCierreMes.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCierreMes"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCierreMes"));

		this.jCheckBoxSeleccionadosProcesoCierreMes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCierreMes"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreMes"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCierreMes.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCierreMes"));
			
		this.jComboBoxTiposAccionesProcesoCierreMes.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCierreMes"));
					
		this.jComboBoxTiposSeleccionarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCierreMes"));
			
		this.jTextFieldValorCampoGeneralProcesoCierreMes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCierreMes"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonidProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtones_para_reversionProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"es_para_reversionProcesoCierreMesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCierreMesProcesoCierreMes.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreMesProcesoCierreMes"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreMes!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreMes"));
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreMes"));
				this.jInternalFrameReporteDinamicoProcesoCierreMes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreMes"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCierreMes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreMes"));				
			//this.jButtonGenerarReporteDinamicoProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreMes"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreMes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCierreMes!=null) {
				this.jInternalFrameImportacionProcesoCierreMes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreMes"));
				this.jInternalFrameImportacionProcesoCierreMes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreMes"));
				this.jInternalFrameImportacionProcesoCierreMes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreMes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCierreMes.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCierreMes"));
			
			this.jButtonAbrirOrderByToolBarProcesoCierreMes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCierreMes"));			
			
			if(this.jInternalFrameOrderByProcesoCierreMes!=null) {
				this.jInternalFrameOrderByProcesoCierreMes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreMes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreMes.jTabbedPaneRelacionesProcesoCierreMes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreMes"));
		
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
            		closingInternalFrameProcesoCierreMes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCierreMes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCierreMes = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCierreMesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreMesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreMes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCierreMesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCierreMes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCierreMesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCierreMes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCierreMes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCierreMes";
		inputMap = this.jButtonNuevoProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreMesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCierreMes";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreMesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCierreMes";
		inputMap = this.jButtonModificarProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCierreMes";
		inputMap = this.jButtonActualizarProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCierreMes";
		inputMap = this.jButtonEliminarProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCierreMes";
		inputMap = this.jButtonCancelarProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCierreMes";
		inputMap = this.jButtonCerrarProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCierreMes";
		inputMap = this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonGuardarCambiosProcesoCierreMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCierreMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCierreMesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCierreMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCierreMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCierreMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCierreMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCierreMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCierreMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonidProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_mesProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoCierreMesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtonid_estructuraProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreMes.jButtones_para_reversionProcesoCierreMesBusqueda.addActionListener(new ButtonActionListener(this,"es_para_reversionProcesoCierreMesBusqueda"));
		
		
		this.jButtonBusquedaProcesoCierreMesProcesoCierreMes.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreMesProcesoCierreMes"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCierreMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCierreMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCierreMesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCierreMes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCierreMes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
					procesocierremesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreMes procesocierremesAux:procesocierremess) {
					procesocierremesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCierreMesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
						procesocierremesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreMes procesocierremesAux:procesocierremess) {
						procesocierremesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
					
						if(sTipoSeleccionar.equals(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION)) {
							existe=true;
							procesocierremesAux.setes_para_reversion(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreMes procesocierremesAux:procesocierremess) {
						
						if(sTipoSeleccionar.equals(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION)) {
							existe=true;
							procesocierremesAux.setes_para_reversion(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreMes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreMes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCierreMesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCierreMes.getSelectedRows();
			
			ProcesoCierreMes procesocierremesLocal=new ProcesoCierreMes();
			
			//this.seleccionarTodosProcesoCierreMes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocierremesLocal =(ProcesoCierreMes) this.procesocierremesLogic.getProcesoCierreMess().toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocierremesLocal =(ProcesoCierreMes) this.procesocierremess.toArray()[this.jTableDatosProcesoCierreMes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocierremesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
						procesocierremesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreMes procesocierremesAux:procesocierremess) {
						procesocierremesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreMes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreMes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreMes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCierreMesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCierreMesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCierreMesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCierreMes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreMes procesocierremesAux:this.procesocierremesLogic.getProcesoCierreMess()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreMes procesocierremesAux:procesocierremess) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCierreMesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCierreMes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCierreMes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCierreMes) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCierreMes(conSplash);
				
					this.generarReporteProcesoCierreMessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCierreMessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreMessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreMessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreMes();
				
				this.exportarProcesoCierreMessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCierreMess();
				//this.importarProcesoCierreMess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreMes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCierreMessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cierre Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCierreMes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCierreMes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCierreMes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCierreMesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCierreMes) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCierreMes(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCierreMes();
						
						this.generarReporteProcesoAccionProcesoCierreMessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCierreMesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cierre MesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cierre Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCierreMes();
				
						this.actualizarParametrosGeneralProcesoCierreMes();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocierremesReturnGeneral=procesocierremesLogic.procesarAccionProcesoCierreMessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocierremesLogic.getProcesoCierreMess(),this.procesocierremesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCierreMesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCierreMes();
					
					ProcesoCierreMesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCierreMesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreMes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxTiposAccionesFormularioProcesoCierreMes.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCierreMes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCierreMesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCierreMes();
			
			if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
			ProcesoCierreMes procesocierremes=new ProcesoCierreMes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCierreMes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCierreMes.getSelectedItem();
			
			
			
			
			procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocierremessSeleccionados.size()==1) {
				for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
					procesocierremes=procesocierremesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCierreMes();
			
      		//this.finishProcessProcesoCierreMes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCierreMesReturnGeneral() throws Exception {
		if(this.procesocierremesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocierremesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocierremesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocierremesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocierremesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocierremesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCierreMes(false);
		}
		
		if(this.procesocierremesReturnGeneral.getConRetornoLista() || this.procesocierremesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocierremesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocierremesLogic.setProcesoCierreMess(this.procesocierremesReturnGeneral.getProcesoCierreMess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCierreMes(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCierreMes() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCierreMes> getProcesoCierreMessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCierreMes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCierreMes procesocierremesAux:procesocierremesLogic.getProcesoCierreMess()) {
					if(procesocierremesAux.getIsSelected()) {
						procesocierremessSeleccionados.add(procesocierremesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreMes procesocierremesAux:this.procesocierremess) {
					if(procesocierremesAux.getIsSelected()) {
						procesocierremessSeleccionados.add(procesocierremesAux);				
					}
				}
			}
			
			if(procesocierremessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocierremessSeleccionados.addAll(this.procesocierremesLogic.getProcesoCierreMess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocierremessSeleccionados.addAll(this.procesocierremess);				
					}
				}
			}
		} else {
			procesocierremessSeleccionados.add(this.procesocierremes);
		}
		
		return procesocierremessSeleccionados;
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
	
	public void generarReporteProcesoCierreMessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCierreMessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCierreMessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreMessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreMessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cierre Mes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCierreMessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCierreMes();
		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCierreMes();
		
		
		//this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados ,procesocierremesImplementable,procesocierremesImplementableHome);
	}
	
	public void mostrarImportacionProcesoCierreMess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCierreMes();
		
		this.abrirFrameImportacionProcesoCierreMes();		
		
			
		//this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados ,procesocierremesImplementable,procesocierremesImplementableHome);
	}
	
	public void importarProcesoCierreMess() throws Exception {		
	
	}
	
	public void exportarProcesoCierreMessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCierreMessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCierreMessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCierreMessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cierre Mes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCierreMes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCierreMes(procesocierremesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocierremesAux.setsDetalleGeneralEntityReporte(procesocierremesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCierreMes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCierreMesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreMesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreMesConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCierreMes(ProcesoCierreMes procesocierremes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocierremes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierremes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierremes.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierremes.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierremes.getes_para_reversion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCierreMess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCierreMes(row);				
				iRow++;
			}				
			
			for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCierreMes(procesocierremesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCierreMessSeleccionados() throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();		
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierremes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocierremess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocierremes");
			//elementRoot.appendChild(element);
		
			for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
				element = document.createElement("procesocierremes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCierreMes(procesocierremesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCierreMes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCierreMes(ProcesoCierreMes procesocierremes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierremes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierremes.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierremes.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierremes.getes_para_reversion());				
	}
	
	public void setFilaDatosExportarXmlProcesoCierreMes(ProcesoCierreMes procesocierremes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCierreMesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocierremes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCierreMesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocierremes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmes_descripcion = document.createElement(ProcesoCierreMesConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesocierremes.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementestructura_descripcion = document.createElement(ProcesoCierreMesConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(procesocierremes.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementes_para_reversion = document.createElement(ProcesoCierreMesConstantesFunciones.ESPARAREVERSION);
		elementes_para_reversion.appendChild(document.createTextNode(procesocierremes.getes_para_reversion().toString().trim()));
		element.appendChild(elementes_para_reversion);
	}
	
	public void generarReporteGroupGenericoProcesoCierreMessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCierreMes> procesocierremessSeleccionados=new ArrayList<ProcesoCierreMes>();
		
		procesocierremessSeleccionados=this.getProcesoCierreMessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCierreMes(procesocierremessSeleccionados);
		
		this.generarReporteProcesoCierreMess("Todos",procesocierremessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCierreMes(ArrayList<ProcesoCierreMes> procesocierremessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCierreMes procesocierremesAux:procesocierremessSeleccionados) {
				procesocierremesAux.setsDetalleGeneralEntityReporte(procesocierremesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCierreMesConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesocierremesAux.setsDescripcionGeneralEntityReporte1(procesocierremesAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					procesocierremesAux.setsDescripcionGeneralEntityReporte1(procesocierremesAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION)) {
					existe=true;
					procesocierremesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesocierremesAux.getes_para_reversion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreMesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCierreMes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCierreMes=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=true;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=true;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=true;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=true;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=true;
			this.isVisibilidadCeldaModificarProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
			this.isVisibilidadCeldaModificarProcesoCierreMes=true;
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
			this.isVisibilidadCeldaCancelarProcesoCierreMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCierreMes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=true;
		} else {
			this.actualizarEstadoPanelsProcesoCierreMes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCierreMes=false;
			//this.isVisibilidadCeldaVerFormProcesoCierreMes=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreMes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocierremesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocierremesSessionBean.getEsGuardarRelacionado()) {
			if(!procesocierremesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;												
			}
			
			this.jButtonCerrarProcesoCierreMes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocierremes)) {
			this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
			this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCierreMes=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreMes=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreMes=false;
		//this.isVisibilidadCeldaModificarProcesoCierreMes=true;
		this.isVisibilidadCeldaActualizarProcesoCierreMes=false;
		this.isVisibilidadCeldaEliminarProcesoCierreMes=false;
		//this.isVisibilidadCeldaCancelarProcesoCierreMes=true;			
		this.isVisibilidadCeldaGuardarProcesoCierreMes=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreMes() {
	}
	
	public void actualizarEstadoPanelsProcesoCierreMes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCierreMes!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreMes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreMes!=null) {
				this.jScrollPanelDatosProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreMes!=null) {
				this.jPanelPaginacionProcesoCierreMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
					this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreMes!=null) {
				this.jTabbedPaneBusquedasProcesoCierreMes.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCierreMes!=null) {
				this.jPanelParametrosReportesProcesoCierreMes.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesoCierreMes=isParaMes;
			if(!this.isVisibilidadBusquedaProcesoCierreMes) {this.jTabbedPaneBusquedasProcesoCierreMes.remove(jPanelBusquedaProcesoCierreMesProcesoCierreMes);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaProcesoCierreMes=isParaEstructura;
			if(!this.isVisibilidadBusquedaProcesoCierreMes) {this.jTabbedPaneBusquedasProcesoCierreMes.remove(jPanelBusquedaProcesoCierreMesProcesoCierreMes);}
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
			
			this.inicializarActualizarBindingTablaProcesoCierreMes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCierreMes() {
		this.updateBorderResaltarBusquedasFormularioProcesoCierreMes();
		this.updateVisibilidadBusquedasFormularioProcesoCierreMes();
		this.updateHabilitarBusquedasFormularioProcesoCierreMes();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCierreMes() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCierreMes.getComponents().length>0) {
	

		if(this.procesocierremesConstantesFunciones.resaltarBusquedaProcesoCierreMesProcesoCierreMes!=null) {
			index= this.jTabbedPaneBusquedasProcesoCierreMes.indexOfComponent(this.jPanelBusquedaProcesoCierreMesProcesoCierreMes);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreMes.getComponent(index);
				jPanel.setBorder(this.procesocierremesConstantesFunciones.resaltarBusquedaProcesoCierreMesProcesoCierreMes);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCierreMes() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCierreMes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreMes.indexOfComponent(this.jPanelBusquedaProcesoCierreMesProcesoCierreMes);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreMes.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocierremesConstantesFunciones.mostrarBusquedaProcesoCierreMesProcesoCierreMes);
			if(!this.procesocierremesConstantesFunciones.mostrarBusquedaProcesoCierreMesProcesoCierreMes && index>-1) {
				this.jTabbedPaneBusquedasProcesoCierreMes.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCierreMes() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCierreMes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreMes.indexOfComponent(this.jPanelBusquedaProcesoCierreMesProcesoCierreMes);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreMes.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocierremesConstantesFunciones.activarBusquedaProcesoCierreMesProcesoCierreMes);
				this.jTabbedPaneBusquedasProcesoCierreMes.setEnabledAt(index,this.procesocierremesConstantesFunciones.activarBusquedaProcesoCierreMesProcesoCierreMes);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCierreMes(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCierreMes")) {
			index= this.jTabbedPaneBusquedasProcesoCierreMes.indexOfComponent(this.jPanelBusquedaProcesoCierreMesProcesoCierreMes);

			this.jTabbedPaneBusquedasProcesoCierreMes.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreMes.getComponent(index);

			this.procesocierremesConstantesFunciones.setResaltarBusquedaProcesoCierreMesProcesoCierreMes(resaltar);

			jPanel.setBorder(this.procesocierremesConstantesFunciones.resaltarBusquedaProcesoCierreMesProcesoCierreMes);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCierreMes.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCierreMes() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCierreMes();
		this.updateVisibilidadResaltarControlesFormularioProcesoCierreMes();
		this.updateHabilitarResaltarControlesFormularioProcesoCierreMes();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCierreMes() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocierremesConstantesFunciones.resaltaridProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes!=null) {this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setBorder(this.procesocierremesConstantesFunciones.resaltaridProcesoCierreMes);}
		if(this.procesocierremesConstantesFunciones.resaltarid_mesProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes!=null) {this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setBorder(this.procesocierremesConstantesFunciones.resaltarid_mesProcesoCierreMes);}
		if(this.procesocierremesConstantesFunciones.resaltarid_estructuraProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes!=null) {this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setBorder(this.procesocierremesConstantesFunciones.resaltarid_estructuraProcesoCierreMes);}
		if(this.procesocierremesConstantesFunciones.resaltares_para_reversionProcesoCierreMes!=null && this.jInternalFrameDetalleFormProcesoCierreMes!=null) {this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setBorder(this.procesocierremesConstantesFunciones.resaltares_para_reversionProcesoCierreMes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCierreMes() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostraridProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jPanelidProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostraridProcesoCierreMes);
		//this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrarid_mesProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jPanelid_mesProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrarid_mesProcesoCierreMes);
		//this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrarid_estructuraProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jPanelid_estructuraProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrarid_estructuraProcesoCierreMes);
		//this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrares_para_reversionProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jPaneles_para_reversionProcesoCierreMes.setVisible(this.procesocierremesConstantesFunciones.mostrares_para_reversionProcesoCierreMes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCierreMes() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreMes!=null) {
	
		this.jInternalFrameDetalleFormProcesoCierreMes.jLabelidProcesoCierreMes.setEnabled(this.procesocierremesConstantesFunciones.activaridProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_mesProcesoCierreMes.setEnabled(this.procesocierremesConstantesFunciones.activarid_mesProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jComboBoxid_estructuraProcesoCierreMes.setEnabled(this.procesocierremesConstantesFunciones.activarid_estructuraProcesoCierreMes);
		this.jInternalFrameDetalleFormProcesoCierreMes.jCheckBoxes_para_reversionProcesoCierreMes.setEnabled(this.procesocierremesConstantesFunciones.activares_para_reversionProcesoCierreMes);
		}
	}
	
		
}