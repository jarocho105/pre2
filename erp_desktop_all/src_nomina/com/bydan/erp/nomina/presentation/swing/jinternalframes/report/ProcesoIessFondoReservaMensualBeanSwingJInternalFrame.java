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

//import com.bydan.erp.nomina.util.ProcesoIessFondoReservaMensualConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaMensualParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaMensualParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoIessFondoReservaMensualBean;
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
public class ProcesoIessFondoReservaMensualBeanSwingJInternalFrame extends ProcesoIessFondoReservaMensualJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualValidator = new ClassValidator<ProcesoIessFondoReservaMensual>(ProcesoIessFondoReservaMensual.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoIessFondoReservaMensual procesoiessfondoreservamensual;	
	public ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux;
	public ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoIessFondoReservaMensual procesoiessfondoreservamensualTotales;
	public Long idProcesoIessFondoReservaMensualActual;
	public Long iIdNuevoProcesoIessFondoReservaMensual=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

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

	public String sFinalQueryComboNumeroPatronal="";

	public List<NumeroPatronal> numeropatronalsForeignKey;

	public List<NumeroPatronal> getnumeropatronalsForeignKey() {
		return numeropatronalsForeignKey;
	}

	public void setnumeropatronalsForeignKey(List<NumeroPatronal> numeropatronalsForeignKey) {
		this.numeropatronalsForeignKey = numeropatronalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public NumeroPatronal numeropatronalForeignKey;

	public NumeroPatronal getnumeropatronalForeignKey() {
		return numeropatronalForeignKey;
	}

	public void setnumeropatronalForeignKey(NumeroPatronal numeropatronalForeignKey) {
		this.numeropatronalForeignKey = numeropatronalForeignKey;
	}

	public String sFinalQueryComboTipoProcesoNomina="";

	public List<TipoProcesoNomina> tipoprocesonominasForeignKey;

	public List<TipoProcesoNomina> gettipoprocesonominasForeignKey() {
		return tipoprocesonominasForeignKey;
	}

	public void settipoprocesonominasForeignKey(List<TipoProcesoNomina> tipoprocesonominasForeignKey) {
		this.tipoprocesonominasForeignKey = tipoprocesonominasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProcesoNomina tipoprocesonominaForeignKey;

	public TipoProcesoNomina gettipoprocesonominaForeignKey() {
		return tipoprocesonominaForeignKey;
	}

	public void settipoprocesonominaForeignKey(TipoProcesoNomina tipoprocesonominaForeignKey) {
		this.tipoprocesonominaForeignKey = tipoprocesonominaForeignKey;
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
	
	public Boolean isPermisoTodoProcesoIessFondoReservaMensual;
	public Boolean isPermisoNuevoProcesoIessFondoReservaMensual;
	public Boolean isPermisoActualizarProcesoIessFondoReservaMensual;
	public Boolean isPermisoActualizarOriginalProcesoIessFondoReservaMensual;
	public Boolean isPermisoEliminarProcesoIessFondoReservaMensual;
	public Boolean isPermisoGuardarCambiosProcesoIessFondoReservaMensual;
	public Boolean isPermisoConsultaProcesoIessFondoReservaMensual;
	public Boolean isPermisoBusquedaProcesoIessFondoReservaMensual;
	public Boolean isPermisoReporteProcesoIessFondoReservaMensual;
	public Boolean isPermisoPaginacionMedioProcesoIessFondoReservaMensual;
	public Boolean isPermisoPaginacionAltoProcesoIessFondoReservaMensual;
	public Boolean isPermisoPaginacionTodoProcesoIessFondoReservaMensual;
	public Boolean isPermisoCopiarProcesoIessFondoReservaMensual;
	public Boolean isPermisoVerFormProcesoIessFondoReservaMensual;
	public Boolean isPermisoDuplicarProcesoIessFondoReservaMensual;
	public Boolean isPermisoOrdenProcesoIessFondoReservaMensual;
	
	
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
	
	public ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualReturnGeneral;
	public ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoIessFondoReservaMensual=false;
	public Boolean esParaAccionDesdeFormularioProcesoIessFondoReservaMensual=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoIessFondoReservaMensualSessionBeanAdditional procesoiessfondoreservamensualSessionBeanAdditional=null;
	
	public ProcesoIessFondoReservaMensualSessionBeanAdditional getProcesoIessFondoReservaMensualSessionBeanAdditional() {
		return this.procesoiessfondoreservamensualSessionBeanAdditional;
	}
	
	public void setProcesoIessFondoReservaMensualSessionBeanAdditional(ProcesoIessFondoReservaMensualSessionBeanAdditional procesoiessfondoreservamensualSessionBeanAdditional) {
		try {
			this.procesoiessfondoreservamensualSessionBeanAdditional=procesoiessfondoreservamensualSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional procesoiessfondoreservamensualBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoIessFondoReservaMensualBeanSwingJInternalFrame
	
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional getProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional() {
		return this.procesoiessfondoreservamensualBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional(ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional procesoiessfondoreservamensualBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoiessfondoreservamensualBeanSwingJInternalFrameAdditional=procesoiessfondoreservamensualBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoIessFondoReservaMensualLogic procesoiessfondoreservamensualLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoIessFondoReservaMensual procesoiessfondoreservamensualBean;
	public ProcesoIessFondoReservaMensualConstantesFunciones procesoiessfondoreservamensualConstantesFunciones;
	//public ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public NumeroPatronalLogic numeropatronalLogic;
	public TipoProcesoNominaLogic tipoprocesonominaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals;	
	//public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsEliminados;
	//public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual=true;
	public Boolean isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual=true;
	public Boolean isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual=true;
	public Boolean isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoIessFondoReservaMensual=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdNumeroPatronal=false;
	public Boolean isVisibilidadFK_IdTipoProcesoNomina=false;
	
	public Long getiIdNuevoProcesoIessFondoReservaMensual() {
		return this.iIdNuevoProcesoIessFondoReservaMensual;
	}

	public void setiIdNuevoProcesoIessFondoReservaMensual(Long iIdNuevoProcesoIessFondoReservaMensual) {
		this.iIdNuevoProcesoIessFondoReservaMensual = iIdNuevoProcesoIessFondoReservaMensual;
	}
	
	public Long getidProcesoIessFondoReservaMensualActual() {
		return this.idProcesoIessFondoReservaMensualActual;
	}

	public void setidProcesoIessFondoReservaMensualActual(Long idProcesoIessFondoReservaMensualActual) {
		this.idProcesoIessFondoReservaMensualActual = idProcesoIessFondoReservaMensualActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoIessFondoReservaMensual getprocesoiessfondoreservamensual() {
		return this.procesoiessfondoreservamensual;
	}

	public void setprocesoiessfondoreservamensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) {
		this.procesoiessfondoreservamensual = procesoiessfondoreservamensual;
	}
	
	public ProcesoIessFondoReservaMensual getprocesoiessfondoreservamensualAux() {
		return this.procesoiessfondoreservamensualAux;
	}

	public void setprocesoiessfondoreservamensualAux(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux) {
		this.procesoiessfondoreservamensualAux = procesoiessfondoreservamensualAux;
	}				
	
	public ProcesoIessFondoReservaMensual getprocesoiessfondoreservamensualAnterior() {
		return this.procesoiessfondoreservamensualAnterior;
	}

	public void setprocesoiessfondoreservamensualAnterior(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAnterior) {
		this.procesoiessfondoreservamensualAnterior = procesoiessfondoreservamensualAnterior;
	}	
	
	public ProcesoIessFondoReservaMensual getprocesoiessfondoreservamensualTotales() {
		return this.procesoiessfondoreservamensualTotales;
	}

	public void setprocesoiessfondoreservamensualTotales(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualTotales) {
		this.procesoiessfondoreservamensualTotales = procesoiessfondoreservamensualTotales;
	}	
	
	public ProcesoIessFondoReservaMensual getprocesoiessfondoreservamensualBean() {
		return this.procesoiessfondoreservamensualBean;
	}

	public void setprocesoiessfondoreservamensualBean(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualBean) {
		this.procesoiessfondoreservamensualBean = procesoiessfondoreservamensualBean;
	}	
	
	public ProcesoIessFondoReservaMensualParameterReturnGeneral getprocesoiessfondoreservamensualReturnGeneral() {
		return this.procesoiessfondoreservamensualReturnGeneral;
	}

	public void setprocesoiessfondoreservamensualReturnGeneral(ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualReturnGeneral) {
		this.procesoiessfondoreservamensualReturnGeneral = procesoiessfondoreservamensualReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoIessFondoReservaMensual=null;

	public Long getid_anioBusquedaProcesoIessFondoReservaMensual() {
		return this.id_anioBusquedaProcesoIessFondoReservaMensual;
	}

	public void setid_anioBusquedaProcesoIessFondoReservaMensual(Long id_anioBusquedaProcesoIessFondoReservaMensual) {
		this.id_anioBusquedaProcesoIessFondoReservaMensual = id_anioBusquedaProcesoIessFondoReservaMensual;
	}

;
	public Long id_mesBusquedaProcesoIessFondoReservaMensual=null;

	public Long getid_mesBusquedaProcesoIessFondoReservaMensual() {
		return this.id_mesBusquedaProcesoIessFondoReservaMensual;
	}

	public void setid_mesBusquedaProcesoIessFondoReservaMensual(Long id_mesBusquedaProcesoIessFondoReservaMensual) {
		this.id_mesBusquedaProcesoIessFondoReservaMensual = id_mesBusquedaProcesoIessFondoReservaMensual;
	}

;
	public Long id_numero_patronalBusquedaProcesoIessFondoReservaMensual=-1L;

	public Long getid_numero_patronalBusquedaProcesoIessFondoReservaMensual() {
		return this.id_numero_patronalBusquedaProcesoIessFondoReservaMensual;
	}

	public void setid_numero_patronalBusquedaProcesoIessFondoReservaMensual(Long id_numero_patronalBusquedaProcesoIessFondoReservaMensual) {
		this.id_numero_patronalBusquedaProcesoIessFondoReservaMensual = id_numero_patronalBusquedaProcesoIessFondoReservaMensual;
	}

;
	public Long id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual=-1L;

	public Long getid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual() {
		return this.id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual;
	}

	public void setid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual(Long id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual) {
		this.id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual = id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_numero_patronalFK_IdNumeroPatronal=-1L;

	public Long getid_numero_patronalFK_IdNumeroPatronal() {
		return this.id_numero_patronalFK_IdNumeroPatronal;
	}

	public void setid_numero_patronalFK_IdNumeroPatronal(Long id_numero_patronalFK_IdNumeroPatronal) {
		this.id_numero_patronalFK_IdNumeroPatronal = id_numero_patronalFK_IdNumeroPatronal;
	}

	public Long id_tipo_proceso_nominaFK_IdTipoProcesoNomina=-1L;

	public Long getid_tipo_proceso_nominaFK_IdTipoProcesoNomina() {
		return this.id_tipo_proceso_nominaFK_IdTipoProcesoNomina;
	}

	public void setid_tipo_proceso_nominaFK_IdTipoProcesoNomina(Long id_tipo_proceso_nominaFK_IdTipoProcesoNomina) {
		this.id_tipo_proceso_nominaFK_IdTipoProcesoNomina = id_tipo_proceso_nominaFK_IdTipoProcesoNomina;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoIessFondoReservaMensualLogic getProcesoIessFondoReservaMensualLogic()	{		
		return procesoiessfondoreservamensualLogic;
	}

	public void setProcesoIessFondoReservaMensualLogic(ProcesoIessFondoReservaMensualLogic procesoiessfondoreservamensualLogic) {
		this.procesoiessfondoreservamensualLogic = procesoiessfondoreservamensualLogic;
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
	
	public Boolean getIsEsNuevoProcesoIessFondoReservaMensual() {
		return isEsNuevoProcesoIessFondoReservaMensual;
	}

	public void setIsEsNuevoProcesoIessFondoReservaMensual(Boolean isEsNuevoProcesoIessFondoReservaMensual) {
		this.isEsNuevoProcesoIessFondoReservaMensual = isEsNuevoProcesoIessFondoReservaMensual;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoIessFondoReservaMensual() {
		return esParaAccionDesdeFormularioProcesoIessFondoReservaMensual;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoIessFondoReservaMensual(Boolean esParaAccionDesdeFormularioProcesoIessFondoReservaMensual) {
		this.esParaAccionDesdeFormularioProcesoIessFondoReservaMensual = esParaAccionDesdeFormularioProcesoIessFondoReservaMensual;
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
	
	
	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			}

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(procesoiessfondoreservamensualSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			}

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(procesoiessfondoreservamensualSessionBean.getlidMesActual());
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

	public void cargarCombosNumeroPatronalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NumeroPatronalLogic numeropatronalLogic=new NumeroPatronalLogic();

			numeropatronalLogic.getNumeroPatronalDataAccess().setIsForForeingKeyData(true);

			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			}

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getNumeroPatronalDataAccess().setIsForForeingKeyData(true);

					numeropatronalLogic.getTodosNumeroPatronalsWithConnection(sFinalQuery,new Pagination());

					this.numeropatronalsForeignKey=numeropatronalLogic.getNumeroPatronals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNumeroPatronal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getEntityWithConnection(procesoiessfondoreservamensualSessionBean.getlidNumeroPatronalActual());
					this.numeropatronalsForeignKey.add(numeropatronalLogic.getNumeroPatronal());
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

	public void cargarCombosTipoProcesoNominasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprocesonominasForeignKey=new ArrayList<TipoProcesoNomina>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProcesoNominaLogic tipoprocesonominaLogic=new TipoProcesoNominaLogic();

			tipoprocesonominaLogic.getTipoProcesoNominaDataAccess().setIsForForeingKeyData(true);

			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			}

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoNomina()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesonominaLogic.getTipoProcesoNominaDataAccess().setIsForForeingKeyData(true);

					tipoprocesonominaLogic.getTodosTipoProcesoNominasWithConnection(sFinalQuery,new Pagination());

					this.tipoprocesonominasForeignKey=tipoprocesonominaLogic.getTipoProcesoNominas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProcesoNomina(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesonominaLogic.getEntityWithConnection(procesoiessfondoreservamensualSessionBean.getlidTipoProcesoNominaActual());
					this.tipoprocesonominasForeignKey.add(tipoprocesonominaLogic.getTipoProcesoNomina());
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

	
	
	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.procesoiessfondoreservamensual!=null) {
						this.procesoiessfondoreservamensual.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
						jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
							//jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioProcesoIessFondoReservaMensualGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoIessFondoReservaMensualGenerico!=null && jComboBoxid_anioProcesoIessFondoReservaMensualGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoIessFondoReservaMensualGenerico.setSelectedIndex(0);
				}
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

					if(this.procesoiessfondoreservamensual!=null) {
						this.procesoiessfondoreservamensual.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
						jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
							//jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesoIessFondoReservaMensualGenerico)throws Exception
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
				jComboBoxid_mesProcesoIessFondoReservaMensualGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesoIessFondoReservaMensualGenerico!=null && jComboBoxid_mesProcesoIessFondoReservaMensualGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesoIessFondoReservaMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNumeroPatronalForeignKey(Long idNumeroPatronalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(numeropatronalTemp!=null) {

					if(this.procesoiessfondoreservamensual!=null) {
						this.procesoiessfondoreservamensual.setNumeroPatronal(numeropatronalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedItem(numeropatronalTemp);
					}
				} else {
					//jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedItem(numeropatronalTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){
					if(numeropatronalTemp!=null && jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
						jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(numeropatronalTemp);
					} else {
						if(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
							//jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(numeropatronalTemp);
							if(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getItemCount()>0) {
								jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(0);
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

	public String getActualNumeroPatronalForeignKeyDescripcion(Long idNumeroPatronalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}


			sDescripcion=NumeroPatronalConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNumeroPatronalForeignKeyGenerico(Long idNumeroPatronalSeleccionado,JComboBox jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}

			if(numeropatronalTemp!=null) {
				jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico.setSelectedItem(numeropatronalTemp);
			} else {
				if(jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico!=null && jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico.getItemCount()>0) {
					jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProcesoNominaForeignKey(Long idTipoProcesoNominaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProcesoNomina  tipoprocesonominaTemp=null;

			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasForeignKey) {
				if(tipoprocesonominaAux.getId()!=null && tipoprocesonominaAux.getId().equals(idTipoProcesoNominaSeleccionado)) {
					tipoprocesonominaTemp=tipoprocesonominaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprocesonominaTemp!=null) {

					if(this.procesoiessfondoreservamensual!=null) {
						this.procesoiessfondoreservamensual.setTipoProcesoNomina(tipoprocesonominaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonominaTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonominaTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesonominaTemp!=null && jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
						jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonominaTemp);
					} else {
						if(jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
							//jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonominaTemp);
							if(jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getItemCount()>0) {
								jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(0);
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

	public String getActualTipoProcesoNominaForeignKeyDescripcion(Long idTipoProcesoNominaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProcesoNomina  tipoprocesonominaTemp=null;

			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasForeignKey) {
				if(tipoprocesonominaAux.getId()!=null && tipoprocesonominaAux.getId().equals(idTipoProcesoNominaSeleccionado)) {
					tipoprocesonominaTemp=tipoprocesonominaAux;
					break;
				}
			}


			sDescripcion=TipoProcesoNominaConstantesFunciones.getTipoProcesoNominaDescripcion(tipoprocesonominaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProcesoNominaForeignKeyGenerico(Long idTipoProcesoNominaSeleccionado,JComboBox jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			TipoProcesoNomina  tipoprocesonominaTemp=null;

			for(TipoProcesoNomina tipoprocesonominaAux:tipoprocesonominasForeignKey) {
				if(tipoprocesonominaAux.getId()!=null && tipoprocesonominaAux.getId().equals(idTipoProcesoNominaSeleccionado)) {
					tipoprocesonominaTemp=tipoprocesonominaAux;
					break;
				}
			}

			if(tipoprocesonominaTemp!=null) {
				jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico.setSelectedItem(tipoprocesonominaTemp);
			} else {
				if(jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico!=null && jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,JComboBox jComboBoxid_anioProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoIessFondoReservaMensualGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoIessFondoReservaMensualGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesoiessfondoreservamensual.setid_anio(anioAux.getId());
				procesoiessfondoreservamensual.setanio_descripcion(ProcesoIessFondoReservaMensualConstantesFunciones.getAnioDescripcion(anioAux));
				procesoiessfondoreservamensual.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,JComboBox jComboBoxid_mesProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesoIessFondoReservaMensualGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesoIessFondoReservaMensualGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesoiessfondoreservamensual.setid_mes(mesAux.getId());
				procesoiessfondoreservamensual.setmes_descripcion(ProcesoIessFondoReservaMensualConstantesFunciones.getMesDescripcion(mesAux));
				procesoiessfondoreservamensual.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNumeroPatronalForeignKey(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,JComboBox jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalAux=new NumeroPatronal();

			if(jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico==null) {
				numeropatronalAux=(NumeroPatronal)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getSelectedItem();
			} else {
				numeropatronalAux=(NumeroPatronal)jComboBoxid_numero_patronalProcesoIessFondoReservaMensualGenerico.getSelectedItem();
			}

			if(numeropatronalAux!=null && numeropatronalAux.getId()!=null) {
				procesoiessfondoreservamensual.setid_numero_patronal(numeropatronalAux.getId());
				procesoiessfondoreservamensual.setnumeropatronal_descripcion(ProcesoIessFondoReservaMensualConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalAux));
				procesoiessfondoreservamensual.setNumeroPatronal(numeropatronalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoNominaForeignKey(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,JComboBox jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico)throws Exception
	{
		try
		{
			TipoProcesoNomina  tipoprocesonominaAux=new TipoProcesoNomina();

			if(jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico==null) {
				tipoprocesonominaAux=(TipoProcesoNomina)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getSelectedItem();
			} else {
				tipoprocesonominaAux=(TipoProcesoNomina)jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensualGenerico.getSelectedItem();
			}

			if(tipoprocesonominaAux!=null && tipoprocesonominaAux.getId()!=null) {
				procesoiessfondoreservamensual.setid_tipo_proceso_nomina(tipoprocesonominaAux.getId());
				procesoiessfondoreservamensual.settipoprocesonomina_descripcion(ProcesoIessFondoReservaMensualConstantesFunciones.getTipoProcesoNominaDescripcion(tipoprocesonominaAux));
				procesoiessfondoreservamensual.setTipoProcesoNomina(tipoprocesonominaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
					}

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addItem(anio);
							}
						}

						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
					}

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addItem(mes);
							}
						}

						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNumeroPatronalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNumeroPatronal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.addItem(numeropatronal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
					}

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addItem(numeropatronal);
							}
						}

						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProcesoNominasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProcesoNomina=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.removeAllItems();

							for(TipoProcesoNomina tipoprocesonomina:this.tipoprocesonominasForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.addItem(tipoprocesonomina);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { 
					}

					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.removeAllItems();

							for(TipoProcesoNomina tipoprocesonomina:this.tipoprocesonominasForeignKey) {
								this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addItem(tipoprocesonomina);
							}
						}

						if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameNumeroPatronalForeignKey(NumeroPatronal numeropatronal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedItem(numeropatronal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(numeropatronal);
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProcesoNominaForeignKey(TipoProcesoNomina tipoprocesonomina,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonomina);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedItem(tipoprocesonomina);
						} else {
							this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoIessFondoReservaMensual() throws Exception {
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
		
	public ProcesoIessFondoReservaMensualParameterReturnGeneral getProcesoIessFondoReservaMensualParameterGeneral() {
		return this.procesoiessfondoreservamensualParameterGeneral;
	}
	
	public void setProcesoIessFondoReservaMensualParameterGeneral(ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualParameterGeneral) {
		this.procesoiessfondoreservamensualParameterGeneral = procesoiessfondoreservamensualParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoIessFondoReservaMensual() {
		return isPermisoTodoProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoTodoProcesoIessFondoReservaMensual(Boolean isPermisoTodoProcesoIessFondoReservaMensual) {
		this.isPermisoTodoProcesoIessFondoReservaMensual = isPermisoTodoProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoNuevoProcesoIessFondoReservaMensual() {
		return isPermisoNuevoProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoNuevoProcesoIessFondoReservaMensual(Boolean isPermisoNuevoProcesoIessFondoReservaMensual) {
		this.isPermisoNuevoProcesoIessFondoReservaMensual = isPermisoNuevoProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoActualizarProcesoIessFondoReservaMensual() {
		return isPermisoActualizarProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoActualizarProcesoIessFondoReservaMensual(Boolean isPermisoActualizarProcesoIessFondoReservaMensual) {
		this.isPermisoActualizarProcesoIessFondoReservaMensual = isPermisoActualizarProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoEliminarProcesoIessFondoReservaMensual() {
		return isPermisoEliminarProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoEliminarProcesoIessFondoReservaMensual(Boolean isPermisoEliminarProcesoIessFondoReservaMensual) {
		this.isPermisoEliminarProcesoIessFondoReservaMensual = isPermisoEliminarProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoIessFondoReservaMensual() {
		return isPermisoGuardarCambiosProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoGuardarCambiosProcesoIessFondoReservaMensual(Boolean isPermisoGuardarCambiosProcesoIessFondoReservaMensual) {
		this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual = isPermisoGuardarCambiosProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoConsultaProcesoIessFondoReservaMensual() {
		return isPermisoConsultaProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoConsultaProcesoIessFondoReservaMensual(Boolean isPermisoConsultaProcesoIessFondoReservaMensual) {
		this.isPermisoConsultaProcesoIessFondoReservaMensual = isPermisoConsultaProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoBusquedaProcesoIessFondoReservaMensual() {
		return isPermisoBusquedaProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoBusquedaProcesoIessFondoReservaMensual(Boolean isPermisoBusquedaProcesoIessFondoReservaMensual) {
		this.isPermisoBusquedaProcesoIessFondoReservaMensual = isPermisoBusquedaProcesoIessFondoReservaMensual;
	}

	public Boolean getIsPermisoReporteProcesoIessFondoReservaMensual() {
		return isPermisoReporteProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoReporteProcesoIessFondoReservaMensual(Boolean isPermisoReporteProcesoIessFondoReservaMensual) {
		this.isPermisoReporteProcesoIessFondoReservaMensual = isPermisoReporteProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoIessFondoReservaMensual() {
		return isPermisoPaginacionMedioProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoPaginacionMedioProcesoIessFondoReservaMensual(Boolean isPermisoPaginacionMedioProcesoIessFondoReservaMensual) {
		this.isPermisoPaginacionMedioProcesoIessFondoReservaMensual = isPermisoPaginacionMedioProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoIessFondoReservaMensual() {
		return isPermisoPaginacionTodoProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoPaginacionTodoProcesoIessFondoReservaMensual(Boolean isPermisoPaginacionTodoProcesoIessFondoReservaMensual) {
		this.isPermisoPaginacionTodoProcesoIessFondoReservaMensual = isPermisoPaginacionTodoProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoIessFondoReservaMensual() {
		return isPermisoPaginacionAltoProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoPaginacionAltoProcesoIessFondoReservaMensual(Boolean isPermisoPaginacionAltoProcesoIessFondoReservaMensual) {
		this.isPermisoPaginacionAltoProcesoIessFondoReservaMensual = isPermisoPaginacionAltoProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoCopiarProcesoIessFondoReservaMensual() {
		return isPermisoCopiarProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoCopiarProcesoIessFondoReservaMensual(Boolean isPermisoCopiarProcesoIessFondoReservaMensual) {
		this.isPermisoCopiarProcesoIessFondoReservaMensual = isPermisoCopiarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoVerFormProcesoIessFondoReservaMensual() {
		return isPermisoVerFormProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoVerFormProcesoIessFondoReservaMensual(Boolean isPermisoVerFormProcesoIessFondoReservaMensual) {
		this.isPermisoVerFormProcesoIessFondoReservaMensual = isPermisoVerFormProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoDuplicarProcesoIessFondoReservaMensual() {
		return isPermisoDuplicarProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoDuplicarProcesoIessFondoReservaMensual(Boolean isPermisoDuplicarProcesoIessFondoReservaMensual) {
		this.isPermisoDuplicarProcesoIessFondoReservaMensual = isPermisoDuplicarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsPermisoOrdenProcesoIessFondoReservaMensual() {
		return isPermisoOrdenProcesoIessFondoReservaMensual;
	}

	public void setIsPermisoOrdenProcesoIessFondoReservaMensual(Boolean isPermisoOrdenProcesoIessFondoReservaMensual) {
		this.isPermisoOrdenProcesoIessFondoReservaMensual = isPermisoOrdenProcesoIessFondoReservaMensual;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaNuevoProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual = isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual = isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaCopiarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual = isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaVerFormProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual = isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaOrdenProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual = isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual = isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaModificarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaModificarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaModificarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual = isVisibilidadCeldaModificarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaActualizarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual = isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaEliminarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual = isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaCancelarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual = isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaGuardarProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual = isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual() {
		return isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual(Boolean isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual) {
		this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual = isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual;
	}
		
	public ProcesoIessFondoReservaMensualSessionBean getprocesoiessfondoreservamensualSessionBean() {
		return this.procesoiessfondoreservamensualSessionBean;
	}
	
	public void setprocesoiessfondoreservamensualSessionBean(ProcesoIessFondoReservaMensualSessionBean procesoiessfondoreservamensualSessionBean) {
		this.procesoiessfondoreservamensualSessionBean=procesoiessfondoreservamensualSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoIessFondoReservaMensual() {
		return this.isVisibilidadBusquedaProcesoIessFondoReservaMensual;
	}

	public void setisVisibilidadBusquedaProcesoIessFondoReservaMensual(Boolean isVisibilidadBusquedaProcesoIessFondoReservaMensual) {
		this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=isVisibilidadBusquedaProcesoIessFondoReservaMensual;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdNumeroPatronal() {
		return this.isVisibilidadFK_IdNumeroPatronal;
	}

	public void setisVisibilidadFK_IdNumeroPatronal(Boolean isVisibilidadFK_IdNumeroPatronal) {
		this.isVisibilidadFK_IdNumeroPatronal=isVisibilidadFK_IdNumeroPatronal;
	}

	public Boolean getisVisibilidadFK_IdTipoProcesoNomina() {
		return this.isVisibilidadFK_IdTipoProcesoNomina;
	}

	public void setisVisibilidadFK_IdTipoProcesoNomina(Boolean isVisibilidadFK_IdTipoProcesoNomina) {
		this.isVisibilidadFK_IdTipoProcesoNomina=isVisibilidadFK_IdTipoProcesoNomina;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesoiessfondoreservamensual,null);
				this.setActualParaGuardarMesForeignKey(procesoiessfondoreservamensual,null);
				this.setActualParaGuardarNumeroPatronalForeignKey(procesoiessfondoreservamensual,null);
				this.setActualParaGuardarTipoProcesoNominaForeignKey(procesoiessfondoreservamensual,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoIessFondoReservaMensual(procesoiessfondoreservamensual);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoiessfondoreservamensualAux.setId(procesoiessfondoreservamensual.getId());
		procesoiessfondoreservamensualAux.setVersionRow(procesoiessfondoreservamensual.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal) throws Exception {
		
		if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal) throws Exception {	
		if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesoiessfondoreservamensualLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesoiessfondoreservamensualLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NumeroPatronalDetalleFormJInternalFrame.class)) {
				NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrameLocal=(NumeroPatronalBeanSwingJInternalFrame) ((NumeroPatronalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				numeropatronalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.getnumeropatronal(),true);
				numeropatronalBeanSwingJInternalFrameLocal.actualizarLista(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal,this.numeropatronalsForeignKey);

				numeropatronalBeanSwingJInternalFrameLocal.actualizarRelaciones(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				procesoiessfondoreservamensualLocal.setNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey("Formulario");
				this.setActualNumeroPatronalForeignKey(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoNominaDetalleFormJInternalFrame.class)) {
				TipoProcesoNominaBeanSwingJInternalFrame tipoprocesonominaBeanSwingJInternalFrameLocal=(TipoProcesoNominaBeanSwingJInternalFrame) ((TipoProcesoNominaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesonominaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoNomina(tipoprocesonominaBeanSwingJInternalFrameLocal.gettipoprocesonomina(),true);
				tipoprocesonominaBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesonominaBeanSwingJInternalFrameLocal.tipoprocesonomina,this.tipoprocesonominasForeignKey);

				tipoprocesonominaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesonominaBeanSwingJInternalFrameLocal.tipoprocesonomina);

				procesoiessfondoreservamensualLocal.setTipoProcesoNomina(tipoprocesonominaBeanSwingJInternalFrameLocal.tipoprocesonomina);

				this.addItemDefectoCombosForeignKeyTipoProcesoNomina();
				this.cargarCombosFrameTipoProcesoNominasForeignKey("Formulario");
				this.setActualTipoProcesoNominaForeignKey(tipoprocesonominaBeanSwingJInternalFrameLocal.tipoprocesonomina.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoIessFondoReservaMensualActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoiessfondoreservamensualValidator.getInvalidValues(this.procesoiessfondoreservamensual);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals) throws Exception {
		try	{			
			ProcesoIessFondoReservaMensualConstantesFunciones.actualizarSelectedLista(procesoiessfondoreservamensual,procesoiessfondoreservamensuals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoiessfondoreservamensualsLocal=this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoiessfondoreservamensualsLocal=this.procesoiessfondoreservamensuals;
			}
			//ARCHITECTURE
		
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal:procesoiessfondoreservamensualsLocal) {
				if(this.permiteMantenimiento(procesoiessfondoreservamensualLocal) && procesoiessfondoreservamensualLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoIessFondoReservaMensualConstantesFunciones.getProcesoIessFondoReservaMensualLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaMensualConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_anioProcesoIessFondoReservaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaMensualConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_mesProcesoIessFondoReservaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaMensualConstantesFunciones.IDNUMEROPATRONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_numero_patronalProcesoIessFondoReservaMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaMensualConstantesFunciones.IDTIPOPROCESONOMINA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_anioProcesoIessFondoReservaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_mesProcesoIessFondoReservaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_numero_patronalProcesoIessFondoReservaMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual,"");
		
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
		this.iIdNuevoProcesoIessFondoReservaMensual--;	
		
		
		this.procesoiessfondoreservamensualAux=new ProcesoIessFondoReservaMensual();
		
		this.procesoiessfondoreservamensualAux.setId(this.iIdNuevoProcesoIessFondoReservaMensual);
		this.procesoiessfondoreservamensualAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().add(this.procesoiessfondoreservamensualAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoiessfondoreservamensuals.add(this.procesoiessfondoreservamensualAux);
		}
		//ARCHITECTURE
		
		this.procesoiessfondoreservamensual=this.procesoiessfondoreservamensualAux;
		
		if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
		}
				
		//this.setDefaultControlesProcesoIessFondoReservaMensual();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoIessFondoReservaMensual();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReservaMensual();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReservaMensual();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualBean,this.procesoiessfondoreservamensual,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral,this.procesoiessfondoreservamensualBean,false);
		
		if(this.procesoiessfondoreservamensualReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual());
		}
		
		if(this.procesoiessfondoreservamensualReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual(),classes);//this.procesoiessfondoreservamensualBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoIessFondoReservaMensual();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoIessFondoReservaMensual();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.RecargarFormProcesoIessFondoReservaMensual(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
						
			if(procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();
			}
			
			this.actualizarVisualTableDatosProcesoIessFondoReservaMensual();
			
			this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReservaMensual(), this.getIndiceNuevoProcesoIessFondoReservaMensual());
			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
						
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setEnabled(isHabilitar && this.procesoiessfondoreservamensualConstantesFunciones.activarid_anioProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setEnabled(isHabilitar && this.procesoiessfondoreservamensualConstantesFunciones.activarid_mesProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setEnabled(isHabilitar && this.procesoiessfondoreservamensualConstantesFunciones.activarid_numero_patronalProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setEnabled(isHabilitar && this.procesoiessfondoreservamensualConstantesFunciones.activarid_tipo_proceso_nominaProcesoIessFondoReservaMensual);
	};
	
	public void setDefaultControlesProcesoIessFondoReservaMensual() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReservaMensual(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(true);			
			this.procesoiessfondoreservamensualSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setVisible(true);
			
					
		} else {
			//this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(false);			
			this.procesoiessfondoreservamensualSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoIessFondoReservaMensual() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				if(procesoiessfondoreservamensualAux.getId().equals(this.iIdNuevoProcesoIessFondoReservaMensual)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensuals) {
				if(procesoiessfondoreservamensualAux.getId().equals(this.iIdNuevoProcesoIessFondoReservaMensual)) {
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
	
	public int getIndiceActualProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				if(procesoiessfondoreservamensualAux.getId().equals(procesoiessfondoreservamensual.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensuals) {
				if(procesoiessfondoreservamensualAux.getId().equals(procesoiessfondoreservamensual.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				if(procesoiessfondoreservamensualAux.getProcesoIessFondoReservaMensualOriginal().getId().equals(procesoiessfondoreservamensualOriginal.getId())) {
					existe=true;
					procesoiessfondoreservamensualOriginal.setId(procesoiessfondoreservamensualAux.getId());
					procesoiessfondoreservamensualOriginal.setVersionRow(procesoiessfondoreservamensualAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensuals) {
				if(procesoiessfondoreservamensualAux.getProcesoIessFondoReservaMensualOriginal().getId().equals(procesoiessfondoreservamensualOriginal.getId())) {
					existe=true;
					procesoiessfondoreservamensualOriginal.setId(procesoiessfondoreservamensualAux.getId());
					procesoiessfondoreservamensualOriginal.setVersionRow(procesoiessfondoreservamensualAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoIessFondoReservaMensual(Boolean esParaCancelar) throws Exception {
		procesoiessfondoreservamensualsAux=new ArrayList<ProcesoIessFondoReservaMensual>();
		procesoiessfondoreservamensualAux=new ProcesoIessFondoReservaMensual();
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
					if(procesoiessfondoreservamensualAux.getId()<0) {
						procesoiessfondoreservamensualsAux.add(procesoiessfondoreservamensualAux);
					}		
				}
				this.iIdNuevoProcesoIessFondoReservaMensual=0L;
				this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().removeAll(procesoiessfondoreservamensualsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensuals) {
					if(procesoiessfondoreservamensualAux.getId()<0) {
						procesoiessfondoreservamensualsAux.add(procesoiessfondoreservamensualAux);
					}		
				}
				this.iIdNuevoProcesoIessFondoReservaMensual=0L;
				this.procesoiessfondoreservamensuals.removeAll(procesoiessfondoreservamensualsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoIessFondoReservaMensual 
					&& this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size()>0
					) {
					procesoiessfondoreservamensualAux=this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().get(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size() - 1);
				
					if(procesoiessfondoreservamensualAux.getId()<0) {
						this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().remove(procesoiessfondoreservamensualAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoIessFondoReservaMensual && this.procesoiessfondoreservamensuals.size()>0) {
					procesoiessfondoreservamensualAux=this.procesoiessfondoreservamensuals.get(this.procesoiessfondoreservamensuals.size() - 1);
				
					if(procesoiessfondoreservamensualAux.getId()<0) {
						this.procesoiessfondoreservamensuals.remove(procesoiessfondoreservamensualAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoIessFondoReservaMensual(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoiessfondoreservamensual.getId()<0) {
				this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().remove(this.procesoiessfondoreservamensual);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoiessfondoreservamensual.getId()<0) {
				this.procesoiessfondoreservamensuals.remove(this.procesoiessfondoreservamensual);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoIessFondoReservaMensual(List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsAux) throws Exception {
		ProcesoIessFondoReservaMensualConstantesFunciones.setEstadosInicialesProcesoIessFondoReservaMensual(procesoiessfondoreservamensualsAux);
	}
	
	public void setEstadosInicialesProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux) throws Exception {
		ProcesoIessFondoReservaMensualConstantesFunciones.setEstadosInicialesProcesoIessFondoReservaMensual(procesoiessfondoreservamensualAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoIessFondoReservaMensualActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoIessFondoReservaMensualActual()) {
				if(!this.isEsNuevoProcesoIessFondoReservaMensual) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoIessFondoReservaMensual=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoIessFondoReservaMensualActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Iess Fondo Reserva Mensual ?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) throws Exception {
		ProcesoIessFondoReservaMensualConstantesFunciones.seleccionarAsignar(this.procesoiessfondoreservamensual,procesoiessfondoreservamensual);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoIessFondoReservaMensual=this.isPermisoActualizarOriginalProcesoIessFondoReservaMensual;
			
			
			this.seleccionarAsignar(procesoiessfondoreservamensual);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoiessfondoreservamensualSessionBean.setsFuncionBusquedaRapida(this.procesoiessfondoreservamensualSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoIessFondoReservaMensual) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoIessFondoReservaMensual(esParaCancelar);				
				this.cancelarNuevoProcesoIessFondoReservaMensual(esParaCancelar);								
			}
			
			this.procesoiessfondoreservamensual=new ProcesoIessFondoReservaMensual();
			
			this.inicializarProcesoIessFondoReservaMensual();
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoIessFondoReservaMensual() throws Exception {
		try {
			ProcesoIessFondoReservaMensualConstantesFunciones.inicializarProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoIessFondoReservaMensuals(String sAccionBusqueda,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoIessFondoReservaMensual"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoIessFondoReservaMensualMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoIessFondoReservaMensualMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoIessFondoReservaMensual"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Iess Fondo Reserva Mensuales");		
		parameters.put("busquedapor", ProcesoIessFondoReservaMensualConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoIessFondoReservaMensual=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoIessFondoReservaMensual);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoIessFondoReservaMensualConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoIessFondoReservaMensualBean.TraerProcesoIessFondoReservaMensualBeans(procesoiessfondoreservamensualsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(null);
					//this.generarExcelReporteProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoIessFondoReservaMensuals(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservamensualsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoIessFondoReservaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservaMensuals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessFondoReservaMensual("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual : procesoiessfondoreservamensualsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoIessFondoReservaMensualConstantesFunciones.generarExcelReporteDataProcesoIessFondoReservaMensual("NORMAL",row,workbook,procesoiessfondoreservamensual,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoIessFondoReservaMensual(String sTipo,Row row,Workbook workbook) {
		
		ProcesoIessFondoReservaMensualConstantesFunciones.generarExcelReporteHeaderProcesoIessFondoReservaMensual(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoIessFondoReservaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservaMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual : procesoiessfondoreservamensualsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.getProcesoIessFondoReservaMensualDescripcion(procesoiessfondoreservamensual));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreservamensual.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreservamensual.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreservamensual.getnumeropatronal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreservamensual.gettipoprocesonomina_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoIessFondoReservaMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsRespaldo=null;
		
		classes=ProcesoIessFondoReservaMensualConstantesFunciones.getClassesRelationshipsOfProcesoIessFondoReservaMensual(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoiessfondoreservamensualLogic.setDatosCliente(this.datosCliente);
		this.procesoiessfondoreservamensualLogic.setDatosDeep(this.datosDeep);
		this.procesoiessfondoreservamensualLogic.setIsConDeep(true);
		
		procesoiessfondoreservamensualsRespaldo=this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals();
		
		this.procesoiessfondoreservamensualLogic.setProcesoIessFondoReservaMensuals(procesoiessfondoreservamensualsParaReportes);	
		this.procesoiessfondoreservamensualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoiessfondoreservamensualsParaReportes=this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals();
		this.procesoiessfondoreservamensualLogic.setProcesoIessFondoReservaMensuals(procesoiessfondoreservamensualsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservaMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessFondoReservaMensual("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual : procesoiessfondoreservamensualsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoIessFondoReservaMensual("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoIessFondoReservaMensualConstantesFunciones.generarExcelReporteDataProcesoIessFondoReservaMensual("NORMAL",row,workbook,procesoiessfondoreservamensual,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.getProcesoIessFondoReservaMensualDescripcion(procesoiessfondoreservamensual));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoIessFondoReservaMensual() throws Exception {		
		this.startProcessProcesoIessFondoReservaMensual(true);
	}
	
	public void startProcessProcesoIessFondoReservaMensual(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual ,this.jPanelParametrosReportesProcesoIessFondoReservaMensual, this.jScrollPanelDatosProcesoIessFondoReservaMensual,this.jPanelPaginacionProcesoIessFondoReservaMensual, this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual, this.jPanelAccionesProcesoIessFondoReservaMensual,this.jPanelAccionesFormularioProcesoIessFondoReservaMensual,this.jmenuBarProcesoIessFondoReservaMensual,this.jmenuBarDetalleProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReservaMensual=this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual; 
		
		final JPanel jPanelParametrosReportesProcesoIessFondoReservaMensual=this.jPanelParametrosReportesProcesoIessFondoReservaMensual;
		//final JScrollPane jScrollPanelDatosProcesoIessFondoReservaMensual=this.jScrollPanelDatosProcesoIessFondoReservaMensual;
		final JTable jTableDatosProcesoIessFondoReservaMensual=this.jTableDatosProcesoIessFondoReservaMensual;		
		final JPanel jPanelPaginacionProcesoIessFondoReservaMensual=this.jPanelPaginacionProcesoIessFondoReservaMensual;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReservaMensual=this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual;
		final JPanel jPanelAccionesProcesoIessFondoReservaMensual=this.jPanelAccionesProcesoIessFondoReservaMensual;
		
		JPanel jPanelCamposAuxiliarProcesoIessFondoReservaMensual=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			jPanelCamposAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelCamposProcesoIessFondoReservaMensual;
			jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelAccionesFormularioProcesoIessFondoReservaMensual;
		}
		
		final JPanel jPanelCamposProcesoIessFondoReservaMensual=jPanelCamposAuxiliarProcesoIessFondoReservaMensual;
		final JPanel jPanelAccionesFormularioProcesoIessFondoReservaMensual=jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual;
		
		
		final JMenuBar jmenuBarProcesoIessFondoReservaMensual=this.jmenuBarProcesoIessFondoReservaMensual;
		final JToolBar jTtoolBarProcesoIessFondoReservaMensual=this.jTtoolBarProcesoIessFondoReservaMensual;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jmenuBarDetalleProcesoIessFondoReservaMensual;
			jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTtoolBarDetalleProcesoIessFondoReservaMensual;
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessFondoReservaMensual=jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual;
		final JToolBar jTtoolBarDetalleProcesoIessFondoReservaMensual=jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessFondoReservaMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessFondoReservaMensual;
			processRunnable.jTableDatos=jTableDatosProcesoIessFondoReservaMensual;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessFondoReservaMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessFondoReservaMensual;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessFondoReservaMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessFondoReservaMensual;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessFondoReservaMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessFondoReservaMensual;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessFondoReservaMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessFondoReservaMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessFondoReservaMensual ,jPanelParametrosReportesProcesoIessFondoReservaMensual,jTableDatosProcesoIessFondoReservaMensual, /*jScrollPanelDatosProcesoIessFondoReservaMensual,*/jPanelCamposProcesoIessFondoReservaMensual,jPanelPaginacionProcesoIessFondoReservaMensual, /*jScrollPanelDatosEdicionProcesoIessFondoReservaMensual,*/ jPanelAccionesProcesoIessFondoReservaMensual,jPanelAccionesFormularioProcesoIessFondoReservaMensual,jmenuBarProcesoIessFondoReservaMensual,jmenuBarDetalleProcesoIessFondoReservaMensual,jTtoolBarProcesoIessFondoReservaMensual,jTtoolBarDetalleProcesoIessFondoReservaMensual);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessFondoReservaMensual ,jPanelParametrosReportesProcesoIessFondoReservaMensual, jScrollPanelDatosProcesoIessFondoReservaMensual,jPanelPaginacionProcesoIessFondoReservaMensual, jScrollPanelDatosEdicionProcesoIessFondoReservaMensual, jPanelAccionesProcesoIessFondoReservaMensual,jPanelAccionesFormularioProcesoIessFondoReservaMensual,jmenuBarProcesoIessFondoReservaMensual,jmenuBarDetalleProcesoIessFondoReservaMensual,jTtoolBarProcesoIessFondoReservaMensual,jTtoolBarDetalleProcesoIessFondoReservaMensual);
						
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
	
	public void finishProcessProcesoIessFondoReservaMensual() {// throws Exception 
		this.finishProcessProcesoIessFondoReservaMensual(true);
	}
	
	public void finishProcessProcesoIessFondoReservaMensual(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual ,this.jPanelParametrosReportesProcesoIessFondoReservaMensual, this.jScrollPanelDatosProcesoIessFondoReservaMensual,this.jPanelPaginacionProcesoIessFondoReservaMensual, this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual, this.jPanelAccionesProcesoIessFondoReservaMensual,this.jPanelAccionesFormularioProcesoIessFondoReservaMensual,this.jmenuBarProcesoIessFondoReservaMensual,this.jmenuBarDetalleProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReservaMensual=this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual; 
		
		final JPanel jPanelParametrosReportesProcesoIessFondoReservaMensual=this.jPanelParametrosReportesProcesoIessFondoReservaMensual;
		//final JScrollPane jScrollPanelDatosProcesoIessFondoReservaMensual=this.jScrollPanelDatosProcesoIessFondoReservaMensual;
		final JTable jTableDatosProcesoIessFondoReservaMensual=this.jTableDatosProcesoIessFondoReservaMensual;		
		final JPanel jPanelPaginacionProcesoIessFondoReservaMensual=this.jPanelPaginacionProcesoIessFondoReservaMensual;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReservaMensual=this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual;
		final JPanel jPanelAccionesProcesoIessFondoReservaMensual=this.jPanelAccionesProcesoIessFondoReservaMensual;
		
		JPanel jPanelCamposAuxiliarProcesoIessFondoReservaMensual=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			jPanelCamposAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelCamposProcesoIessFondoReservaMensual;
			jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelAccionesFormularioProcesoIessFondoReservaMensual;
		}
		
		final JPanel jPanelCamposProcesoIessFondoReservaMensual=jPanelCamposAuxiliarProcesoIessFondoReservaMensual;
		final JPanel jPanelAccionesFormularioProcesoIessFondoReservaMensual=jPanelAccionesFormularioAuxiliarProcesoIessFondoReservaMensual;
		
		
		final JMenuBar jmenuBarProcesoIessFondoReservaMensual=this.jmenuBarProcesoIessFondoReservaMensual;		
		final JToolBar jTtoolBarProcesoIessFondoReservaMensual=this.jTtoolBarProcesoIessFondoReservaMensual;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jmenuBarDetalleProcesoIessFondoReservaMensual;
			jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTtoolBarDetalleProcesoIessFondoReservaMensual;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessFondoReservaMensual=jmenuBarDetalleAuxiliarProcesoIessFondoReservaMensual;
		final JToolBar jTtoolBarDetalleProcesoIessFondoReservaMensual=jTtoolBarDetalleAuxiliarProcesoIessFondoReservaMensual;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessFondoReservaMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessFondoReservaMensual;
			processRunnable.jTableDatos=jTableDatosProcesoIessFondoReservaMensual;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessFondoReservaMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessFondoReservaMensual;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessFondoReservaMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessFondoReservaMensual;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessFondoReservaMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessFondoReservaMensual;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessFondoReservaMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessFondoReservaMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoIessFondoReservaMensual ,jPanelParametrosReportesProcesoIessFondoReservaMensual, jTableDatosProcesoIessFondoReservaMensual,/*jScrollPanelDatosProcesoIessFondoReservaMensual,*/jPanelCamposProcesoIessFondoReservaMensual,jPanelPaginacionProcesoIessFondoReservaMensual, /*jScrollPanelDatosEdicionProcesoIessFondoReservaMensual,*/ jPanelAccionesProcesoIessFondoReservaMensual,jPanelAccionesFormularioProcesoIessFondoReservaMensual,jmenuBarProcesoIessFondoReservaMensual,jmenuBarDetalleProcesoIessFondoReservaMensual,jTtoolBarProcesoIessFondoReservaMensual,jTtoolBarDetalleProcesoIessFondoReservaMensual));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoIessFondoReservaMensual(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoIessFondoReservaMensual(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoIessFondoReservaMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoIessFondoReservaMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoIessFondoReservaMensual,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoIessFondoReservaMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoIessFondoReservaMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoIessFondoReservaMensual,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoiessfondoreservamensualConstantesFunciones.getsFinalQueryProcesoIessFondoReservaMensual();
		String  finalQueryPaginacionTodos=this.procesoiessfondoreservamensualConstantesFunciones.getsFinalQueryProcesoIessFondoReservaMensual();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoIessFondoReservaMensualConstantesFunciones.getArrayColumnasGlobalesNoProcesoIessFondoReservaMensual(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoIessFondoReservaMensualConstantesFunciones.getArrayColumnasGlobalesProcesoIessFondoReservaMensual(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoIessFondoReservaMensualConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoiessfondoreservamensualsEliminados= new ArrayList<ProcesoIessFondoReservaMensual>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoIessFondoReservaMensual();
		
				///*ProcesoIessFondoReservaMensualSessionBean*/this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			
			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
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
					this.iNumeroPaginacion=ProcesoIessFondoReservaMensualConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoIessFondoReservaMensualConstantesFunciones.getClassesForeignKeysOfProcesoIessFondoReservaMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoiessfondoreservamensual."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoiessfondoreservamensualsAux= new ArrayList<ProcesoIessFondoReservaMensual>();
			
				
			procesoiessfondoreservamensualLogic.setDatosCliente(this.datosCliente);
			procesoiessfondoreservamensualLogic.setDatosDeep(this.datosDeep);
			procesoiessfondoreservamensualLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoIessFondoReservaMensual")) {
				this.sDetalleReporte=ProcesoIessFondoReservaMensualConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReservaMensual(id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessFondoReservaMensualConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReservaMensual(id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessFondoReservaMensualConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReservaMensual(id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()==null||procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoiessfondoreservamensuals==null|| procesoiessfondoreservamensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservamensualsAux=new ArrayList<ProcesoIessFondoReservaMensual>();
						procesoiessfondoreservamensualsAux.addAll(procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservamensualsAux=new ArrayList<ProcesoIessFondoReservaMensual>();
							procesoiessfondoreservamensualsAux.addAll(procesoiessfondoreservamensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessFondoReservaMensualConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReservaMensual(id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessFondoReservaMensualConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReservaMensual(id_anioBusquedaProcesoIessFondoReservaMensual,id_mesBusquedaProcesoIessFondoReservaMensual,id_numero_patronalBusquedaProcesoIessFondoReservaMensual,id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoIessFondoReservaMensuals("BusquedaProcesoIessFondoReservaMensual",procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoIessFondoReservaMensuals("BusquedaProcesoIessFondoReservaMensual",procesoiessfondoreservamensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservamensualLogic.setProcesoIessFondoReservaMensuals(new ArrayList<ProcesoIessFondoReservaMensual>());
						procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().addAll(procesoiessfondoreservamensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservamensuals=new ArrayList<ProcesoIessFondoReservaMensual>();
							procesoiessfondoreservamensuals.addAll(procesoiessfondoreservamensualsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoIessFondoReservaMensual();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoIessFondoReservaMensual();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservamensuals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservamensuals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) {
		Boolean permite=true;
		
		if(this.procesoiessfondoreservamensual.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoIessFondoReservaMensualConstantesFunciones.getOrderByListaProcesoIessFondoReservaMensual();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoIessFondoReservaMensualConstantesFunciones.getOrderByListaProcesoIessFondoReservaMensual();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				if(procesoiessfondoreservamensual.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservamensualTotales=procesoiessfondoreservamensual;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:this.procesoiessfondoreservamensuals) {
				if(procesoiessfondoreservamensual.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservamensualTotales=procesoiessfondoreservamensual;
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
			this.procesoiessfondoreservamensualAux=new ProcesoIessFondoReservaMensual();
			this.procesoiessfondoreservamensualAux.setsType(Constantes2.S_TOTALES);
			this.procesoiessfondoreservamensualAux.setIsNew(false);
			this.procesoiessfondoreservamensualAux.setIsChanged(false);
			this.procesoiessfondoreservamensualAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoIessFondoReservaMensualConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals(),this.procesoiessfondoreservamensualAux);
				
				//this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().add(this.procesoiessfondoreservamensualAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoIessFondoReservaMensualConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensuals,this.procesoiessfondoreservamensualAux);
				
				this.procesoiessfondoreservamensuals.add(this.procesoiessfondoreservamensualAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoiessfondoreservamensualTotales=new ProcesoIessFondoReservaMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().remove(procesoiessfondoreservamensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessfondoreservamensuals.remove(procesoiessfondoreservamensualTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoiessfondoreservamensualTotales=new ProcesoIessFondoReservaMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				if(procesoiessfondoreservamensual.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservamensualTotales=procesoiessfondoreservamensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessFondoReservaMensualConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals(),procesoiessfondoreservamensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:this.procesoiessfondoreservamensuals) {
				if(procesoiessfondoreservamensual.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservamensualTotales=procesoiessfondoreservamensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessFondoReservaMensualConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensuals,procesoiessfondoreservamensualTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoIessFondoReservaMensual";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdNumeroPatronal()throws Exception {
		try {
			sAccionBusqueda="FK_IdNumeroPatronal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdTipoProcesoNomina()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoNomina";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual(String sFinalQuery,Long id_anio,Long id_mes,Long id_numero_patronal,Long id_tipo_proceso_nomina)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual(sFinalQuery,this.pagination,id_anio,id_mes,id_numero_patronal,id_tipo_proceso_nomina);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdNumeroPatronal(String sFinalQuery,Long id_numero_patronal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsFK_IdNumeroPatronal(sFinalQuery,this.pagination,id_numero_patronal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservaMensualsFK_IdTipoProcesoNomina(String sFinalQuery,Long id_tipo_proceso_nomina)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensualsFK_IdTipoProcesoNomina(sFinalQuery,this.pagination,id_tipo_proceso_nomina);
				
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
	
	public void inicializarPermisosProcesoIessFondoReservaMensual() {
		this.isPermisoTodoProcesoIessFondoReservaMensual=false;
		this.isPermisoNuevoProcesoIessFondoReservaMensual=false;
		this.isPermisoActualizarProcesoIessFondoReservaMensual=false;
		this.isPermisoActualizarOriginalProcesoIessFondoReservaMensual=false;
		this.isPermisoEliminarProcesoIessFondoReservaMensual=false;
		this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual=false;
		this.isPermisoConsultaProcesoIessFondoReservaMensual=true;
		this.isPermisoBusquedaProcesoIessFondoReservaMensual=true;
		this.isPermisoReporteProcesoIessFondoReservaMensual=true;
		this.isPermisoOrdenProcesoIessFondoReservaMensual=false;		
		this.isPermisoPaginacionMedioProcesoIessFondoReservaMensual=false;		
		this.isPermisoPaginacionAltoProcesoIessFondoReservaMensual=false;		
		this.isPermisoPaginacionTodoProcesoIessFondoReservaMensual=false;		
		this.isPermisoCopiarProcesoIessFondoReservaMensual=false;		
		this.isPermisoVerFormProcesoIessFondoReservaMensual=false;		
		this.isPermisoDuplicarProcesoIessFondoReservaMensual=false;
		this.isPermisoOrdenProcesoIessFondoReservaMensual=false;
	}
	
	public void setPermisosUsuarioProcesoIessFondoReservaMensual(Boolean isPermiso) {
		this.isPermisoTodoProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoNuevoProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoActualizarProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoEliminarProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoConsultaProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoBusquedaProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoReporteProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoOrdenProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoPaginacionMedioProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoPaginacionAltoProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoPaginacionTodoProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoCopiarProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoVerFormProcesoIessFondoReservaMensual=isPermiso;		
		this.isPermisoDuplicarProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoOrdenProcesoIessFondoReservaMensual=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoIessFondoReservaMensual(Boolean isPermiso) {
		//this.isPermisoTodoProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoNuevoProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoActualizarProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoEliminarProcesoIessFondoReservaMensual=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual=isPermiso;
		//this.isPermisoConsultaProcesoIessFondoReservaMensual=isPermiso;
		//this.isPermisoBusquedaProcesoIessFondoReservaMensual=isPermiso;
		//this.isPermisoReporteProcesoIessFondoReservaMensual=isPermiso;
		//this.isPermisoOrdenProcesoIessFondoReservaMensual=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoIessFondoReservaMensual=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoIessFondoReservaMensual=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoIessFondoReservaMensual=isPermiso;		
		//this.isPermisoCopiarProcesoIessFondoReservaMensual=isPermiso;		
		//this.isPermisoDuplicarProcesoIessFondoReservaMensual=isPermiso;
		//this.isPermisoOrdenProcesoIessFondoReservaMensual=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessFondoReservaMensualClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoIessFondoReservaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoIessFondoReservaMensual(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessFondoReservaMensualClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoIessFondoReservaMensualClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoIessFondoReservaMensualClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoIessFondoReservaMensualClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoIessFondoReservaMensual() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoIessFondoReservaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoIessFondoReservaMensualConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoIessFondoReservaMensual=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoIessFondoReservaMensual=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoIessFondoReservaMensual=this.isPermisoActualizarProcesoIessFondoReservaMensual;
			this.isPermisoEliminarProcesoIessFondoReservaMensual=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoIessFondoReservaMensual=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoIessFondoReservaMensual=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoIessFondoReservaMensual=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoIessFondoReservaMensual=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessFondoReservaMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoIessFondoReservaMensual=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoIessFondoReservaMensual=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoIessFondoReservaMensual=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoIessFondoReservaMensual=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoIessFondoReservaMensual=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoIessFondoReservaMensual=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessFondoReservaMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoIessFondoReservaMensual.setToolTipText(this.jTableDatosProcesoIessFondoReservaMensual.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoIessFondoReservaMensual(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoIessFondoReservaMensual(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoIessFondoReservaMensual() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoIessFondoReservaMensualListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.numeropatronalsForeignKey=new ArrayList();
				this.tipoprocesonominasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoIessFondoReservaMensualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNumeroPatronalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoNominaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyNumeroPatronalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.numeropatronalsForeignKey==null||this.numeropatronalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NumeroPatronalConstantesFunciones.getArrayColumnasGlobalesNumeroPatronal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NumeroPatronalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NumeroPatronalConstantesFunciones.SFINALQUERY;

				this.cargarCombosNumeroPatronalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoNominaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprocesonominasForeignKey==null||this.tipoprocesonominasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProcesoNominaConstantesFunciones.getArrayColumnasGlobalesTipoProcesoNomina(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoNominaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProcesoNominaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProcesoNominasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoIessFondoReservaMensual()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyNumeroPatronal();
			this.addItemDefectoCombosForeignKeyTipoProcesoNomina();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesoiessfondoreservamensualSessionBean==null) {
				this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
			}

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyNumeroPatronal()throws Exception {
		try {

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
				NumeroPatronal numeropatronal=new NumeroPatronal();
				NumeroPatronalConstantesFunciones.setNumeroPatronalDescripcion(numeropatronal,Constantes.SMENSAJE_ESCOJA_OPCION);
				numeropatronal.setId(null);

				if(!NumeroPatronalConstantesFunciones.ExisteEnLista(this.numeropatronalsForeignKey,numeropatronal,true)) {

					this.numeropatronalsForeignKey.add(0,numeropatronal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProcesoNomina()throws Exception {
		try {

			if(!this.procesoiessfondoreservamensualSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoNomina()) {
				TipoProcesoNomina tipoprocesonomina=new TipoProcesoNomina();
				TipoProcesoNominaConstantesFunciones.setTipoProcesoNominaDescripcion(tipoprocesonomina,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprocesonomina.setId(null);

				if(!TipoProcesoNominaConstantesFunciones.ExisteEnLista(this.tipoprocesonominasForeignKey,tipoprocesonomina,true)) {

					this.tipoprocesonominasForeignKey.add(0,tipoprocesonomina);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoIessFondoReservaMensual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoIessFondoReservaMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoIessFondoReservaMensual()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReservaMensual();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual)throws Exception {	
		try {
			
			this.setActualNumeroPatronalForeignKey(procesoiessfondoreservamensual.getid_numero_patronal(),false,"Formulario");
			this.setActualTipoProcesoNominaForeignKey(procesoiessfondoreservamensual.getid_tipo_proceso_nomina(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoIessFondoReservaMensual()throws Exception {	
		try {
			
			this.setActualNumeroPatronalForeignKey(this.procesoiessfondoreservamensualConstantesFunciones.getid_numero_patronal(),false,"Formulario");
			this.setActualTipoProcesoNominaForeignKey(this.procesoiessfondoreservamensualConstantesFunciones.getid_tipo_proceso_nomina(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReservaMensual()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoIessFondoReservaMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoIessFondoReservaMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoIessFondoReservaMensual()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoIessFondoReservaMensual()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoNominasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoIessFondoReservaMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoNominasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoIessFondoReservaMensual()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean(); 
		this.procesoiessfondoreservamensualConstantesFunciones=new ProcesoIessFondoReservaMensualConstantesFunciones(); 
		this.procesoiessfondoreservamensualBean=new ProcesoIessFondoReservaMensual();//(this.procesoiessfondoreservamensualConstantesFunciones); 		
		this.procesoiessfondoreservamensualReturnGeneral=new ProcesoIessFondoReservaMensualParameterReturnGeneral(); 
		
		this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoIessFondoReservaMensual(true);
			
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
			
			this.procesoiessfondoreservamensualConstantesFunciones=new ProcesoIessFondoReservaMensualConstantesFunciones(); 
			this.procesoiessfondoreservamensualBean=new ProcesoIessFondoReservaMensual();//this.procesoiessfondoreservamensualConstantesFunciones); 			
			this.procesoiessfondoreservamensualReturnGeneral=new ProcesoIessFondoReservaMensualParameterReturnGeneral(); 
		
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Fondo Reserva Mensual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesoiessfondoreservamensual=new ProcesoIessFondoReservaMensual();
			this.procesoiessfondoreservamensuals = new ArrayList<ProcesoIessFondoReservaMensual>();
			this.procesoiessfondoreservamensualsAux = new ArrayList<ProcesoIessFondoReservaMensual>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic=new ProcesoIessFondoReservaMensualLogic();
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoiessfondoreservamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual);	
					}
					
					if(this.jInternalFrameImportacionProcesoIessFondoReservaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessFondoReservaMensual);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoIessFondoReservaMensual);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual);
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setVisible(false);
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual);
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoIessFondoReservaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessFondoReservaMensual);
					this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setVisible(false);
					this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessFondoReservaMensual);
					this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setVisible(false);
					this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoIessFondoReservaMensualActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoIessFondoReservaMensualConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoiessfondoreservamensualReturnGeneral=new ProcesoIessFondoReservaMensualParameterReturnGeneral();
			
			this.procesoiessfondoreservamensualParameterGeneral=new ProcesoIessFondoReservaMensualParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoiessfondoreservamensualLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessFondoReservaMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado(),this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessFondoReservaMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado(),this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			
			
			this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdNumeroPatronal=true;
			this.isVisibilidadFK_IdTipoProcesoNomina=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoIessFondoReservaMensual();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoIessFondoReservaMensual(false);
			
			this.setPermisosUsuarioProcesoIessFondoReservaMensual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() && this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoIessFondoReservaMensualClasesRelacionadas();
			}
			
			if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoIessFondoReservaMensualClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoIessFondoReservaMensual();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReservaMensual();
			}
			
			if(!this.isPermisoBusquedaProcesoIessFondoReservaMensual) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoIessFondoReservaMensualConstantesFunciones.getTiposSeleccionarProcesoIessFondoReservaMensual());
				
				this.tiposColumnasSelect=ProcesoIessFondoReservaMensualConstantesFunciones.getTiposSeleccionarProcesoIessFondoReservaMensual(true);
				
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
			//if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoIessFondoReservaMensual();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoIessFondoReservaMensual(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoIessFondoReservaMensual(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReservaMensual() ;
			
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
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.numeropatronalLogic=new NumeroPatronalLogic();
			this.tipoprocesonominaLogic=new TipoProcesoNominaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesoiessfondoreservamensualImplementable= (ProcesoIessFondoReservaMensualImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessFondoReservaMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoiessfondoreservamensualImplementableHome= (ProcesoIessFondoReservaMensualImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessFondoReservaMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoiessfondoreservamensuals= new ArrayList<ProcesoIessFondoReservaMensual>();
			this.procesoiessfondoreservamensualsEliminados= new ArrayList<ProcesoIessFondoReservaMensual>();
						
			this.isEsNuevoProcesoIessFondoReservaMensual=false;
			this.esParaAccionDesdeFormularioProcesoIessFondoReservaMensual=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>() ;
			this.tipoprocesonominasForeignKey=new ArrayList<TipoProcesoNomina>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoIessFondoReservaMensual(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoIessFondoReservaMensual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoIessFondoReservaMensualConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoIessFondoReservaMensual();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoIessFondoReservaMensual();
			}
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoIessFondoReservaMensual(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoIessFondoReservaMensual: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoIessFondoReservaMensual() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoIessFondoReservaMensual")) {
				iIndex=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoIessFondoReservaMensual();	
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
	
	public void cargarCombosForeignKeyProcesoIessFondoReservaMensual(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoIessFondoReservaMensual(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoIessFondoReservaMensual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoIessFondoReservaMensualListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoIessFondoReservaMensual();
		
		this.cargarCombosFrameForeignKeyProcesoIessFondoReservaMensual();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoIessFondoReservaMensual();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReservaMensual();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyNumeroPatronal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNumeroPatronalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNumeroPatronal(this.numeropatronalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoNomina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProcesoNominaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProcesoNomina();
				this.cargarCombosFrameTipoProcesoNominasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProcesoNomina(this.tipoprocesonominasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			
			if(jTableDatosProcesoIessFondoReservaMensual.getRowCount()>=1) {
				jTableDatosProcesoIessFondoReservaMensual.removeRowSelectionInterval(0, jTableDatosProcesoIessFondoReservaMensual.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoIessFondoReservaMensual=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReservaMensual(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(true);			
			//this.procesoiessfondoreservamensual=new ProcesoIessFondoReservaMensual();
			//this.procesoiessfondoreservamensual.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual() ;
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReservaMensual(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoiessfondoreservamensual);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);				
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoIessFondoReservaMensual: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRows().length;			
			}
			
			procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoIessFondoReservaMensual--;			
				//ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux= new ProcesoIessFondoReservaMensual();			
				//procesoiessfondoreservamensualAux.setId(this.iIdNuevoProcesoIessFondoReservaMensual);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoIessFondoReservaMensual procesoiessfondoreservamensualOrigen=new ProcesoIessFondoReservaMensual();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualOrigen : procesoiessfondoreservamensualsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoiessfondoreservamensualOrigen =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservamensualOrigen =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoIessFondoReservaMensual();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoiessfondoreservamensual.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoIessFondoReservaMensual(procesoiessfondoreservamensualOrigen,this.procesoiessfondoreservamensual,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().add(this.procesoiessfondoreservamensualAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensuals.add(this.procesoiessfondoreservamensualAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
				
				this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReservaMensual(), this.getIndiceNuevoProcesoIessFondoReservaMensual());
				
				int iLastRow =  this.jTableDatosProcesoIessFondoReservaMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessFondoReservaMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessFondoReservaMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();									
		
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensualOrigen=new ProcesoIessFondoReservaMensual();
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensualDestino=new ProcesoIessFondoReservaMensual();
				
			procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoiessfondoreservamensualsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservamensualOrigen =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservamensualOrigen =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservamensualDestino =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservamensualDestino =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoiessfondoreservamensualOrigen =procesoiessfondoreservamensualsSeleccionados.get(0);
				procesoiessfondoreservamensualDestino =procesoiessfondoreservamensualsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoIessFondoReservaMensual(procesoiessfondoreservamensualOrigen,procesoiessfondoreservamensualDestino,true,false);
				
				procesoiessfondoreservamensualDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoiessfondoreservamensualDestino,procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoiessfondoreservamensualDestino,procesoiessfondoreservamensuals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
				
				//this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReservaMensual(), this.getIndiceNuevoProcesoIessFondoReservaMensual());
				
				int iLastRow =  this.jTableDatosProcesoIessFondoReservaMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessFondoReservaMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessFondoReservaMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoIessFondoReservaMensual.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(!isVisible);
			this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(!isVisible);
			this.jPanelAccionesProcesoIessFondoReservaMensual.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoIessFondoReservaMensual();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoIessFondoReservaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoIessFondoReservaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoIessFondoReservaMensual();
			
			this.abrirFrameOrderByProcesoIessFondoReservaMensual();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoIessFondoReservaMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoIessFondoReservaMensual(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessFondoReservaMensual);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSize(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.iWidthFormulario,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jContentPaneDetalleProcesoIessFondoReservaMensual.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jContentPaneDetalleProcesoIessFondoReservaMensual.getWidth(),ProcesoIessFondoReservaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jContentPaneDetalleProcesoIessFondoReservaMensual.getWidth(),ProcesoIessFondoReservaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jContentPaneDetalleProcesoIessFondoReservaMensual.getWidth(),ProcesoIessFondoReservaMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoIessFondoReservaMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoIessFondoReservaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,false,this);
				} else {
					this.jInternalFrameOrderByProcesoIessFondoReservaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessFondoReservaMensual);
				this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setVisible(false);
				this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setSelected(false);
				
				this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessFondoReservaMensual"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoIessFondoReservaMensual();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoIessFondoReservaMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoIessFondoReservaMensual==null) {
				
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual=new ImportacionJInternalFrame(ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessFondoReservaMensual);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessFondoReservaMensual);
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setVisible(false);
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSelected(false);


				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessFondoReservaMensual"));
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessFondoReservaMensual"));
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessFondoReservaMensual"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoIessFondoReservaMensual() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual==null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual=new ReporteDinamicoJInternalFrame(ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual);
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReservaMensual"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReservaMensual"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReservaMensual"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReservaMensual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoIessFondoReservaMensual() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessFondoReservaMensual);
			
	       	this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.dispose();
			//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoIessFondoReservaMensual() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoIessFondoReservaMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setVisible(true);
	        this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoIessFondoReservaMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setVisible(true);
	        this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoIessFondoReservaMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setVisible(false);
	        this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoIessFondoReservaMensual() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoIessFondoReservaMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setVisible(false);
	        this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoIessFondoReservaMensual(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoIessFondoReservaMensual(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(true);
			//this.isEsNuevoProcesoIessFondoReservaMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false) ;
			
			if(procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReservaMensual(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoIessFondoReservaMensualActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoIessFondoReservaMensual(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(true);
			//this.isEsNuevoProcesoIessFondoReservaMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoiessfondoreservamensual.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false) ;
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReservaMensual(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNumeroPatronal(List<NumeroPatronal> numeropatronalsForeignKey)throws Exception{
		TableColumn tableColumnNumeroPatronal=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL));
		TableCellEditor tableCellEditorNumeroPatronal =tableColumnNumeroPatronal.getCellEditor();

		NumeroPatronalTableCell numeropatronalTableCellFk=(NumeroPatronalTableCell)tableCellEditorNumeroPatronal;

		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.setnumeropatronalsForeignKey(numeropatronalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//numeropatronalTableCellFk.setRowActual(intSelectedRow);
			//numeropatronalTableCellFk.setnumeropatronalsForeignKeyActual(numeropatronalsForeignKey);
		//}


		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.RecargarNumeroPatronalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProcesoNomina(List<TipoProcesoNomina> tipoprocesonominasForeignKey)throws Exception{
		TableColumn tableColumnTipoProcesoNomina=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA));
		TableCellEditor tableCellEditorTipoProcesoNomina =tableColumnTipoProcesoNomina.getCellEditor();

		TipoProcesoNominaTableCell tipoprocesonominaTableCellFk=(TipoProcesoNominaTableCell)tableCellEditorTipoProcesoNomina;

		if(tipoprocesonominaTableCellFk!=null) {
			tipoprocesonominaTableCellFk.settipoprocesonominasForeignKey(tipoprocesonominasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprocesonominaTableCellFk.setRowActual(intSelectedRow);
			//tipoprocesonominaTableCellFk.settipoprocesonominasForeignKeyActual(tipoprocesonominasForeignKey);
		//}


		if(tipoprocesonominaTableCellFk!=null) {
			tipoprocesonominaTableCellFk.RecargarTipoProcesoNominasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessFondoReservaMensual(false);
			
			//if(!this.isEsNuevoProcesoIessFondoReservaMensual) {								
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				
			}
			
			if(this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoIessFondoReservaMensual=true;
					this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
					this.isEsNuevoProcesoIessFondoReservaMensual=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoIessFondoReservaMensual=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoIessFondoReservaMensual=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(false);
				
				this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(false);
			
												
				
				if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoIessFondoReservaMensual();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoiessfondoreservamensual.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessfondoreservamensual.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessfondoreservamensual.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoIessFondoReservaMensualModel) this.jTableDatosProcesoIessFondoReservaMensual.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoIessFondoReservaMensual=true;
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
				this.isEsNuevoProcesoIessFondoReservaMensual=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(false);
				
				this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(false);
				
				
				
				if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoIessFondoReservaMensual();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoIessFondoReservaMensual.getRowCount()>=1) {
				jTableDatosProcesoIessFondoReservaMensual.removeRowSelectionInterval(0, jTableDatosProcesoIessFondoReservaMensual.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoIessFondoReservaMensual(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(false) ;
			
			this.isEsNuevoProcesoIessFondoReservaMensual=false;
			
			if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoIessFondoReservaMensual();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				
				//SI ES MANUAL
				if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoIessFondoReservaMensual--;			
			//ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux= new ProcesoIessFondoReservaMensual();			
			//procesoiessfondoreservamensualAux.setId(this.iIdNuevoProcesoIessFondoReservaMensual);
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoIessFondoReservaMensual();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
			
			this.procesoiessfondoreservamensual.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().add(this.procesoiessfondoreservamensualAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoiessfondoreservamensuals.add(this.procesoiessfondoreservamensualAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			
			this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReservaMensual(), this.getIndiceNuevoProcesoIessFondoReservaMensual());
			
			int iLastRow =  this.jTableDatosProcesoIessFondoReservaMensual.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoIessFondoReservaMensual.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoIessFondoReservaMensual.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();
			}
			
			//this.abrirFrameTreeProcesoIessFondoReservaMensual();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setFileImportacion(this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoIessFondoReservaMensual.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		

		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoIessFondoReservaMensualBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoIessFondoReservaMensualBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NumeroPatronal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NumeroPatronal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NumeroPatronal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NumeroPatronal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoNomina_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoNomina_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoNomina_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoNomina_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoria="id_numero_patronal";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA:
					sNombreCampoCategoria="id_tipo_proceso_nomina";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoriaValor="id_numero_patronal";
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA:
					sNombreCampoCategoriaValor="id_tipo_proceso_nomina";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Patronal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_numero_patronal");
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Nomina",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_nomina");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoIessFondoReservaMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreservamensual.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreservamensual.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL);
					iRow++;

					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreservamensual.getnumeropatronal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA);
					iRow++;

					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreservamensual.gettipoprocesonomina_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoIessFondoReservaMensual(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoIessFondoReservaMensual(procesoiessfondoreservamensualAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoIessFondoReservaMensual(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessFondoReservaMensual();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoIessFondoReservaMensual() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoIessFondoReservaMensual.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoIessFondoReservaMensual.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoIessFondoReservaMensual.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoIessFondoReservaMensual.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoIessFondoReservaMensual.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoIessFondoReservaMensual.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoIessFondoReservaMensual.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoIessFondoReservaMensual(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoIessFondoReservaMensual(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoIessFondoReservaMensual(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoIessFondoReservaMensual(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReservaMensual(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessFondoReservaMensual(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoIessFondoReservaMensual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual();
		
		this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessFondoReservaMensual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReservaMensual() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReservaMensual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReservaMensual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoIessFondoReservaMensual(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReservaMensual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReservaMensual() throws Exception {
		try	{
			if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessFondoReservaMensual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessFondoReservaMensual() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessFondoReservaMensual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReservaMensual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReservaMensual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoIessFondoReservaMensual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()!=null){this.id_anioBusquedaProcesoIessFondoReservaMensual=((Anio)this.jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()!=null){this.id_mesBusquedaProcesoIessFondoReservaMensual=((Mes)this.jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()!=null){this.id_numero_patronalBusquedaProcesoIessFondoReservaMensual=((NumeroPatronal)this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()!=null){this.id_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensual=((TipoProcesoNomina)this.jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoIessFondoReservaMensual(Boolean esInicializar) throws Exception {				
		if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessFondoReservaMensual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoIessFondoReservaMensual() throws Exception {
		this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoIessFondoReservaMensual() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoIessFondoReservaMensualOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensualOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoiessfondoreservamensuals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoIessFondoReservaMensual.setModel(new ProcesoIessFondoReservaMensualModel(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoIessFondoReservaMensual.setModel(new ProcesoIessFondoReservaMensualModel(this.procesoiessfondoreservamensuals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual!=null && this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoIessFondoReservaMensual();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,procesoiessfondoreservamensualConstantesFunciones.resaltarSeleccionarProcesoIessFondoReservaMensual,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,procesoiessfondoreservamensualConstantesFunciones.resaltarSeleccionarProcesoIessFondoReservaMensual,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID));

		if(this.procesoiessfondoreservamensualConstantesFunciones.mostraridProcesoIessFondoReservaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoiessfondoreservamensualConstantesFunciones.resaltaridProcesoIessFondoReservaMensual,this.procesoiessfondoreservamensualConstantesFunciones.activaridProcesoIessFondoReservaMensual,this,true,"idProcesoIessFondoReservaMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoiessfondoreservamensualConstantesFunciones.resaltaridProcesoIessFondoReservaMensual,this.procesoiessfondoreservamensualConstantesFunciones.activaridProcesoIessFondoReservaMensual,this,true,"idProcesoIessFondoReservaMensual","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO));

		if(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_anioProcesoIessFondoReservaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_anioProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_anioProcesoIessFondoReservaMensual));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_anioProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_anioProcesoIessFondoReservaMensual,true,"id_anioProcesoIessFondoReservaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES));

		if(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_mesProcesoIessFondoReservaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_mesProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_mesProcesoIessFondoReservaMensual));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_mesProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_mesProcesoIessFondoReservaMensual,true,"id_mesProcesoIessFondoReservaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL));

		if(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReservaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_numero_patronalProcesoIessFondoReservaMensual));
			tableColumn.setCellEditor(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_numero_patronalProcesoIessFondoReservaMensual,true,"id_numero_patronalProcesoIessFondoReservaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA));

		if(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_tipo_proceso_nominaProcesoIessFondoReservaMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoNominaTableCell(this.tipoprocesonominasForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_tipo_proceso_nominaProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_tipo_proceso_nominaProcesoIessFondoReservaMensual));
			tableColumn.setCellEditor(new TipoProcesoNominaTableCell(this.tipoprocesonominasForeignKey,this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_tipo_proceso_nominaProcesoIessFondoReservaMensual,this,this.procesoiessfondoreservamensualConstantesFunciones.activarid_tipo_proceso_nominaProcesoIessFondoReservaMensual,true,"id_tipo_proceso_nominaProcesoIessFondoReservaMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessFondoReservaMensual.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessFondoReservaMensual.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoIessFondoReservaMensual.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoIessFondoReservaMensual.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoIessFondoReservaMensual.moveColumn(this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoIessFondoReservaMensual.moveColumn(this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoIessFondoReservaMensual.moveColumn(this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoIessFondoReservaMensual.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoIessFondoReservaMensual.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoIessFondoReservaMensual,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoIessFondoReservaMensual.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoIessFondoReservaMensual.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoIessFondoReservaMensual.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoiessfondoreservamensuals.size()-1;
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
		//this.jTableDatosProcesoIessFondoReservaMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoIessFondoReservaMensual();
			
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
				
				//this.isEsNuevoProcesoIessFondoReservaMensual=false;
					
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
				if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessFondoReservaMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoiessfondoreservamensual.getsType().equals("DUPLICADO")
				   || this.procesoiessfondoreservamensual.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoIessFondoReservaMensual=true;
				
				} else {
					this.isEsNuevoProcesoIessFondoReservaMensual=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoiessfondoreservamensual.getId()>=0 && !this.procesoiessfondoreservamensual.getIsNew()) {						
						this.isEsNuevoProcesoIessFondoReservaMensual=false;
						
					} else {
						this.isEsNuevoProcesoIessFondoReservaMensual=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReservaMensual(esRelaciones);						
				
				this.seleccionarProcesoIessFondoReservaMensual(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoiessfondoreservamensual.getId()<0) {
					this.isEsNuevoProcesoIessFondoReservaMensual=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoIessFondoReservaMensual(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoIessFondoReservaMensual(evt,rowIndex);
				}	
				
				if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoIessFondoReservaMensual: " + this.dDif); 
					}
				}								
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoIessFondoReservaMensual(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {
					if(this.procesoiessfondoreservamensual.getId()>0) {
						this.procesoiessfondoreservamensual.setIsDeleted(true);
						
						this.procesoiessfondoreservamensualsEliminados.add(this.procesoiessfondoreservamensual);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().remove(this.procesoiessfondoreservamensual);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensuals.remove(this.procesoiessfondoreservamensual);				
					}
					
					
					((ProcesoIessFondoReservaMensualModel) this.jTableDatosProcesoIessFondoReservaMensual.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoIessFondoReservaMensual(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoIessFondoReservaMensual) {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessFondoReservaMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesoiessfondoreservamensualConstantesFunciones.cargarid_anioProcesoIessFondoReservaMensual || this.procesoiessfondoreservamensualConstantesFunciones.event_dependid_anioProcesoIessFondoReservaMensual) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesoiessfondoreservamensual.getid_anio());
									//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesoiessfondoreservamensual.getAnio()!=null) {
							this.aniosForeignKey.add(procesoiessfondoreservamensual.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesoiessfondoreservamensual.getid_anio(),false,"Formulario");

					//Mes
					if(!this.procesoiessfondoreservamensualConstantesFunciones.cargarid_mesProcesoIessFondoReservaMensual || this.procesoiessfondoreservamensualConstantesFunciones.event_dependid_mesProcesoIessFondoReservaMensual) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.procesoiessfondoreservamensual.getid_mes());
									//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(procesoiessfondoreservamensual.getMes()!=null) {
							this.messForeignKey.add(procesoiessfondoreservamensual.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.procesoiessfondoreservamensual.getid_mes(),false,"Formulario");

					//NumeroPatronal
					if(!this.procesoiessfondoreservamensualConstantesFunciones.cargarid_numero_patronalProcesoIessFondoReservaMensual || this.procesoiessfondoreservamensualConstantesFunciones.event_dependid_numero_patronalProcesoIessFondoReservaMensual) {
						//this.cargarCombosNumeroPatronalsForeignKeyLista(" where id="+this.procesoiessfondoreservamensual.getid_numero_patronal());
									//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
						this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

						if(procesoiessfondoreservamensual.getNumeroPatronal()!=null) {
							this.numeropatronalsForeignKey.add(procesoiessfondoreservamensual.getNumeroPatronal());
						}

						this.addItemDefectoCombosForeignKeyNumeroPatronal();
						this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
					}
					this.setActualNumeroPatronalForeignKey(this.procesoiessfondoreservamensual.getid_numero_patronal(),false,"Formulario");

					//TipoProcesoNomina
					if(!this.procesoiessfondoreservamensualConstantesFunciones.cargarid_tipo_proceso_nominaProcesoIessFondoReservaMensual || this.procesoiessfondoreservamensualConstantesFunciones.event_dependid_tipo_proceso_nominaProcesoIessFondoReservaMensual) {
						//this.cargarCombosTipoProcesoNominasForeignKeyLista(" where id="+this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina());
									//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
						this.tipoprocesonominasForeignKey=new ArrayList<TipoProcesoNomina>();

						if(procesoiessfondoreservamensual.getTipoProcesoNomina()!=null) {
							this.tipoprocesonominasForeignKey.add(procesoiessfondoreservamensual.getTipoProcesoNomina());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoNomina();
						this.cargarCombosFrameTipoProcesoNominasForeignKey("Todos");
					}
					this.setActualTipoProcesoNominaForeignKey(this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoIessFondoReservaMensual(procesoiessfondoreservamensual,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(procesoiessfondoreservamensual);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoIessFondoReservaMensual(procesoiessfondoreservamensual,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReservaMensual(procesoiessfondoreservamensual);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setText(procesoiessfondoreservamensual.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoiessfondoreservamensualLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoiessfondoreservamensualLocal=this.procesoiessfondoreservamensual;
			} else {
				procesoiessfondoreservamensualLocal=this.procesoiessfondoreservamensualAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoiessfondoreservamensualLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoIessFondoReservaMensual(procesoiessfondoreservamensualLocal,true);
					
					if(procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoiessfondoreservamensualLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoiessfondoreservamensualLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(procesoiessfondoreservamensual,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(procesoiessfondoreservamensual);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(procesoiessfondoreservamensual,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.getText()==null || this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.getText()=="" || this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setText("0");
			}

			if(conColumnasBase) {procesoiessfondoreservamensual.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelIdProcesoIessFondoReservaMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualBean,ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualOrigen,ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessfondoreservamensualOrigen.getId()!=null && !procesoiessfondoreservamensualOrigen.getId().equals(0L))) {procesoiessfondoreservamensual.setId(procesoiessfondoreservamensualOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setText(procesoiessfondoreservamensual.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensualBean procesoiessfondoreservamensualBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setText(procesoiessfondoreservamensualBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensualParameterReturnGeneral procesoiessfondoreservamensualReturnGeneral,ProcesoIessFondoReservaMensualBean procesoiessfondoreservamensualBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal=new ProcesoIessFondoReservaMensual();
			
			procesoiessfondoreservamensualLocal=procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessfondoreservamensualLocal.getId()!=null && !procesoiessfondoreservamensualLocal.getId().equals(0L))) {procesoiessfondoreservamensualBean.setId(procesoiessfondoreservamensualLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoIessFondoReservaMensualGenerico(Long idProcesoIessFondoReservaMensualSeleccionado,JComboBox jComboBoxProcesoIessFondoReservaMensual,List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsLocal)throws Exception {
		try {
			ProcesoIessFondoReservaMensual  procesoiessfondoreservamensualTemp=null;

			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsLocal) {
				if(procesoiessfondoreservamensualAux.getId()!=null && procesoiessfondoreservamensualAux.getId().equals(idProcesoIessFondoReservaMensualSeleccionado)) {
					procesoiessfondoreservamensualTemp=procesoiessfondoreservamensualAux;
					break;
				}
			}

			jComboBoxProcesoIessFondoReservaMensual.setSelectedItem(procesoiessfondoreservamensualTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoIessFondoReservaMensualGenerico(JComboBox jComboBoxProcesoIessFondoReservaMensual,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessFondoReservaMensual.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoIessFondoReservaMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessFondoReservaMensual.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoIessFondoReservaMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreservamensual=(ProcesoIessFondoReservaMensual) procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) procesoiessfondoreservamensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreservamensual.getIsNew() && !procesoiessfondoreservamensual.getIsChanged() && !procesoiessfondoreservamensual.getIsDeleted()) {
				sDescripcion=procesoiessfondoreservamensual.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreservamensual.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreservamensual.getIsNew() && !procesoiessfondoreservamensual.getIsChanged() && !procesoiessfondoreservamensual.getIsDeleted()) {
				sDescripcion=procesoiessfondoreservamensual.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreservamensual.getmes_descripcion();
			}
		}

		if(sTipo.equals("NumeroPatronal")) {
			//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreservamensual.getIsNew() && !procesoiessfondoreservamensual.getIsChanged() && !procesoiessfondoreservamensual.getIsDeleted()) {
				sDescripcion=procesoiessfondoreservamensual.getnumeropatronal_descripcion();
			} else {
				//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreservamensual.getnumeropatronal_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoNomina")) {
			//sDescripcion=this.getActualTipoProcesoNominaForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreservamensual.getIsNew() && !procesoiessfondoreservamensual.getIsChanged() && !procesoiessfondoreservamensual.getIsDeleted()) {
				sDescripcion=procesoiessfondoreservamensual.gettipoprocesonomina_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoNominaForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreservamensual.gettipoprocesonomina_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoIessFondoReservaMensual procesoiessfondoreservamensualRow=new ProcesoIessFondoReservaMensual();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreservamensualRow=(ProcesoIessFondoReservaMensual) procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessfondoreservamensualRow=(ProcesoIessFondoReservaMensual) procesoiessfondoreservamensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));			
			this.jButtonDuplicarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual && this.isPermisoDuplicarProcesoIessFondoReservaMensual));			
			this.jButtonCopiarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual && this.isPermisoCopiarProcesoIessFondoReservaMensual));
			this.jButtonVerFormProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual && this.isPermisoVerFormProcesoIessFondoReservaMensual));
			
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));			
			
			this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));			
			this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual && this.isPermisoEliminarProcesoIessFondoReservaMensual));
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual);							
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));						
			this.jButtonDuplicarToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual && this.isPermisoDuplicarProcesoIessFondoReservaMensual));						
			this.jButtonCopiarToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual && this.isPermisoCopiarProcesoIessFondoReservaMensual));			
			this.jButtonVerFormToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual && this.isPermisoVerFormProcesoIessFondoReservaMensual));			
			this.jButtonAbrirOrderByToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));
			this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));			
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual  && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual && this.isPermisoEliminarProcesoIessFondoReservaMensual));
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarToolBarProcesoIessFondoReservaMensual.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual);				
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));			
			this.jMenuItemDuplicarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual && this.isPermisoDuplicarProcesoIessFondoReservaMensual));			
			this.jMenuItemCopiarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual && this.isPermisoCopiarProcesoIessFondoReservaMensual));			
			this.jMenuItemVerFormProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual && this.isPermisoVerFormProcesoIessFondoReservaMensual));			
			this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));			
			//this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));
			this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));			
			//this.jMenuItemDetalleMostrarOcultarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual && this.isPermisoOrdenProcesoIessFondoReservaMensual));			
			this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual));			
			this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual && this.isPermisoNuevoProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));									
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemModificarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemActualizarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual && this.isPermisoActualizarProcesoIessFondoReservaMensual));	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemEliminarProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual && this.isPermisoEliminarProcesoIessFondoReservaMensual));
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemCancelarProcesoIessFondoReservaMensual.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual);				
			}
			
			this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));						
			this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=this.jButtonNuevoProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual=this.jButtonDuplicarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual=this.jButtonCopiarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual=this.jButtonVerFormProcesoIessFondoReservaMensual.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoIessFondoReservaMensual=this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=this.jButtonModificarProcesoIessFondoReservaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=this.jButtonNuevoToolBarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarToolBarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarToolBarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarToolBarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarToolBarProcesoIessFondoReservaMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=this.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=this.jMenuItemNuevoProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemModificarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemActualizarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemEliminarProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemCancelarProcesoIessFondoReservaMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoIessFondoReservaMensual(Boolean esInicializar) {
		if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessFondoReservaMensual();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoIessFondoReservaMensual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReservaMensual() {
		this.jButtonNuevoProcesoIessFondoReservaMensual.setVisible(this.isPermisoNuevoProcesoIessFondoReservaMensual);			
		this.jButtonDuplicarProcesoIessFondoReservaMensual.setVisible(this.isPermisoDuplicarProcesoIessFondoReservaMensual);			
		this.jButtonCopiarProcesoIessFondoReservaMensual.setVisible(this.isPermisoCopiarProcesoIessFondoReservaMensual);			
		this.jButtonVerFormProcesoIessFondoReservaMensual.setVisible(this.isPermisoVerFormProcesoIessFondoReservaMensual);			
		
		this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setVisible(this.isPermisoOrdenProcesoIessFondoReservaMensual);					
		
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.setVisible(this.isPermisoNuevoProcesoIessFondoReservaMensual);			
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarProcesoIessFondoReservaMensual.setVisible(this.isPermisoActualizarProcesoIessFondoReservaMensual);	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.setVisible(this.isPermisoActualizarProcesoIessFondoReservaMensual);	
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.setVisible(this.isPermisoEliminarProcesoIessFondoReservaMensual);
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual);						
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.setVisible(this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setVisible(this.isPermisoActualizarProcesoIessFondoReservaMensual);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessFondoReservaMensual() {
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarProcesoIessFondoReservaMensual.setVisible(this.isPermisoActualizarProcesoIessFondoReservaMensual);	
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.setVisible(this.isPermisoActualizarProcesoIessFondoReservaMensual);	
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.setVisible(this.isPermisoEliminarProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual);							
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual && this.isPermisoGuardarCambiosProcesoIessFondoReservaMensual));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoIessFondoReservaMensual() {
		if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReservaMensual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoIessFondoReservaMensual() {
	}
	
	public void jTableDatosProcesoIessFondoReservaMensualListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoIessFondoReservaMensual(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoIessFondoReservaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreservamensual==null) {
						this.procesoiessfondoreservamensual = new ProcesoIessFondoReservaMensual();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}

				if(this.procesoiessfondoreservamensual.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoiessfondoreservamensual.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoIessFondoReservaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReservaMensual(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReservaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesoiessfondoreservamensualLogic.getConnexion());

				if(this.procesoiessfondoreservamensual.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreservamensual.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReservaMensual=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReservaMensual.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoIessFondoReservaMensual.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoIessFondoReservaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreservamensual==null) {
						this.procesoiessfondoreservamensual = new ProcesoIessFondoReservaMensual();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}

				if(this.procesoiessfondoreservamensual.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesoiessfondoreservamensual.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesoIessFondoReservaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReservaMensual(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReservaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesoiessfondoreservamensualLogic.getConnexion());

				if(this.procesoiessfondoreservamensual.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreservamensual.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReservaMensual=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReservaMensual.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesoIessFondoReservaMensual.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesoIessFondoReservaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreservamensual==null) {
						this.procesoiessfondoreservamensual = new ProcesoIessFondoReservaMensual();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}

				if(this.procesoiessfondoreservamensual.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesoiessfondoreservamensual.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonumeropatronal=true;

			idTienePermisonumeropatronal=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReservaMensual(NumeroPatronalConstantesFunciones.CLASSNAME);

			if(idTienePermisonumeropatronal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReservaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);

				this.numeropatronalBeanSwingJInternalFrame=new NumeroPatronalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.numeropatronalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.numeropatronalBeanSwingJInternalFrame.getNumeroPatronalLogic().setConnexion(this.procesoiessfondoreservamensualLogic.getConnexion());

				if(this.procesoiessfondoreservamensual.getid_numero_patronal()!=null) {
					this.numeropatronalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.numeropatronalBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreservamensual.getid_numero_patronal());
					this.numeropatronalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroPatronal();
				}

				JInternalFrameBase jinternalFrame =this.numeropatronalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReservaMensual=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReservaMensual.getBorder();
				TitledBorder titledBordernumeropatronal=(TitledBorder)this.numeropatronalBeanSwingJInternalFrame.jScrollPanelDatosNumeroPatronal.getBorder();

				titledBordernumeropatronal.setTitle(titledBorderProcesoIessFondoReservaMensual.getTitle() + " -> Numero Patronal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_numero_patronalProcesoIessFondoReservaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreservamensual==null) {
						this.procesoiessfondoreservamensual = new ProcesoIessFondoReservaMensual();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}

				if(this.procesoiessfondoreservamensual.getid_numero_patronal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_numero_patronal = "+this.procesoiessfondoreservamensual.getid_numero_patronal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesonomina=true;

			idTienePermisotipoprocesonomina=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReservaMensual(TipoProcesoNominaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesonomina) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReservaMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);

				this.tipoprocesonominaBeanSwingJInternalFrame=new TipoProcesoNominaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesonominaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesonominaBeanSwingJInternalFrame.getTipoProcesoNominaLogic().setConnexion(this.procesoiessfondoreservamensualLogic.getConnexion());

				if(this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina()!=null) {
					this.tipoprocesonominaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesonominaBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina());
					this.tipoprocesonominaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesonominaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesonominaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoNomina();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesonominaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReservaMensual=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReservaMensual.getBorder();
				TitledBorder titledBordertipoprocesonomina=(TitledBorder)this.tipoprocesonominaBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoNomina.getBorder();

				titledBordertipoprocesonomina.setTitle(titledBorderProcesoIessFondoReservaMensual.getTitle() + " -> Tipo Proceso Nomina");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.getprocesoiessfondoreservamensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreservamensual==null) {
						this.procesoiessfondoreservamensual = new ProcesoIessFondoReservaMensual();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);
				}

				if(this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_nomina = "+this.procesoiessfondoreservamensual.getid_tipo_proceso_nomina().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);

			this.getProcesoIessFondoReservaMensualsBusquedaProcesoIessFondoReservaMensual();

			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);

			//if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);

			this.getProcesoIessFondoReservaMensualsFK_IdAnio();

			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);

			//if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);

			this.getProcesoIessFondoReservaMensualsFK_IdMes();

			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);

			//if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNumeroPatronalProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);

			this.getProcesoIessFondoReservaMensualsFK_IdNumeroPatronal();

			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);

			//if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoNominaProcesoIessFondoReservaMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);

			this.getProcesoIessFondoReservaMensualsFK_IdTipoProcesoNomina();

			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);

			//if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservamensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoIessFondoReservaMensual() {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.dispose();
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.dispose();
			this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual=null;
		}
		
		if(this.jInternalFrameImportacionProcesoIessFondoReservaMensual!=null) {
			this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoIessFondoReservaMensual.dispose();
			this.jInternalFrameImportacionProcesoIessFondoReservaMensual=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoIessFondoReservaMensual();
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoIessFondoReservaMensual")) {
				jButtonDuplicarProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoIessFondoReservaMensual")) {
				jButtonCopiarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoIessFondoReservaMensual")) {
				jButtonVerFormProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoIessFondoReservaMensual")) {
				jButtonDuplicarProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoIessFondoReservaMensual")) {
				jButtonDuplicarProcesoIessFondoReservaMensualActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoIessFondoReservaMensual")) {
				jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoIessFondoReservaMensual")) {
				jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoIessFondoReservaMensual")) {
				jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoIessFondoReservaMensual")) {
				jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoIessFondoReservaMensual")) {
				jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoIessFondoReservaMensual")) {
				jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoIessFondoReservaMensual")) {
				jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoIessFondoReservaMensual")) {
				jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoIessFondoReservaMensual")) {
				jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoIessFondoReservaMensual")) {
				jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoIessFondoReservaMensual")) {
				jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoIessFondoReservaMensual")) {
				jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoIessFondoReservaMensual")) {
				jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoIessFondoReservaMensual")) {
				jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoIessFondoReservaMensual")) {
				jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoIessFondoReservaMensual")) {
				jButtonMostrarOcultarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoIessFondoReservaMensual")) {
				jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoIessFondoReservaMensual")) {
				jButtonCopiarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoIessFondoReservaMensual")) {
				jButtonVerFormProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoIessFondoReservaMensual")) {
				jButtonCopiarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoIessFondoReservaMensual")) {
				jButtonVerFormProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoIessFondoReservaMensual")) {
				jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoIessFondoReservaMensual")) {
				jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoIessFondoReservaMensual")) {
				jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoIessFondoReservaMensual")) {
				jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoIessFondoReservaMensual")) {
				jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoIessFondoReservaMensual")) {
				jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoIessFondoReservaMensual")) {
				jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoIessFondoReservaMensual")) {
				jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoIessFondoReservaMensual")) {
				jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoIessFondoReservaMensual") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual")) {
				jButtonAbrirOrderByProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoIessFondoReservaMensual") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoIessFondoReservaMensual")) {
				jButtonMostrarOcultarProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoIessFondoReservaMensual")) {
				jButtonProcesarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoIessFondoReservaMensual")) {
				jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoIessFondoReservaMensual")) {
				jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoIessFondoReservaMensual")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoIessFondoReservaMensual")) {
				jButtonCerrarImportacionProcesoIessFondoReservaMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoIessFondoReservaMensual")) {
				
				jButtonGenerarImportacionProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoIessFondoReservaMensual")) {
				
				jButtonAbrirImportacionProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoIessFondoReservaMensual")) {
				jComboBoxTiposAccionesProcesoIessFondoReservaMensualActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoIessFondoReservaMensual")) {
				jComboBoxTiposRelacionesProcesoIessFondoReservaMensualActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoIessFondoReservaMensual")) {
				jComboBoxTiposAccionesProcesoIessFondoReservaMensualActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoIessFondoReservaMensual")) {
				
				jComboBoxTiposSeleccionarProcesoIessFondoReservaMensualActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoIessFondoReservaMensual")) {
				jTextFieldValorCampoGeneralProcesoIessFondoReservaMensualActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoIessFondoReservaMensual")) {
				jButtonAbrirOrderByProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoIessFondoReservaMensual")) {
				jButtonAbrirOrderByProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoIessFondoReservaMensual")) {
				jButtonCerrarOrderByProcesoIessFondoReservaMensualActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonidProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_anioProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_anioProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_mesProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_mesProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual")) {
				this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualActionPerformed(evt);
			}
			
			;
			
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoIessFondoReservaMensual();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoiessfondoreservamensualLocal=this.procesoiessfondoreservamensual;
			} else {
				procesoiessfondoreservamensualLocal=this.procesoiessfondoreservamensualAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
							
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
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
			
			


			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
								
						
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
								
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
							
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
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
			
			


			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
								
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoIessFondoReservaMensual")) {
					jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensualItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoIessFondoReservaMensual")) {
					jCheckBoxSeleccionadosProcesoIessFondoReservaMensualItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoIessFondoReservaMensual")) {
					
				}
				
				


				
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
												
				
				


				
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
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
			
			


			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreservamensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreservamensual);
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
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
				
				


				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReservaMensual.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReservaMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservamensualAnterior =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoIessFondoReservaMensual")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoIessFondoReservaMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoiessfondoreservamensual =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoiessfondoreservamensual);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReservaMensual")) {
				
				}
				
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoIessFondoReservaMensual")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoIessFondoReservaMensual.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReservaMensual")) {
			
			}
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoIessFondoReservaMensual();
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoIessFondoReservaMensual")) {
				jButtonDuplicarProcesoIessFondoReservaMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoIessFondoReservaMensual")) {
				jButtonCopiarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoIessFondoReservaMensual")) {
				jButtonVerFormProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoIessFondoReservaMensual")) {
				jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoIessFondoReservaMensual")) {
				jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoIessFondoReservaMensual")) {
				jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoIessFondoReservaMensual")) {
				jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoIessFondoReservaMensual")) {
				jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoIessFondoReservaMensual")) {
				jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessFondoReservaMensual")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoIessFondoReservaMensual")) {
				jButtonAbrirOrderByProcesoIessFondoReservaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoIessFondoReservaMensual")) {
				jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoIessFondoReservaMensual")) {
				jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoIessFondoReservaMensual")) {
				jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonidProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_anioProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_anioProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_mesProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_mesProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate")) {
				this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda")) {
				this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusquedaActionPerformed(evt);
			}
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoIessFondoReservaMensual();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoIessFondoReservaMensual")) {
				closingInternalFrameProcesoIessFondoReservaMensual();
				
			} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReservaMensual")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoIessFondoReservaMensual = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoIessFondoReservaMensualBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessFondoReservaMensual.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(null);
			}
			
			ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessfondoreservamensual,new Object(),this.procesoiessfondoreservamensualParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoIessFondoReservaMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoIessFondoReservaMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoIessFondoReservaMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {
			if(!esControlTabla) {
				if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);			
				}
				
				if(this.procesoiessfondoreservamensualSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral,this.procesoiessfondoreservamensualBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoiessfondoreservamensualSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessFondoReservaMensual(classes,this.procesoiessfondoreservamensualReturnGeneral,this.procesoiessfondoreservamensualBean,false);
					}
						
					if(this.procesoiessfondoreservamensualReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual());	
					}
						
					if(this.procesoiessfondoreservamensualReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual(),classes);//this.procesoiessfondoreservamensualBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,classes);//this.procesoiessfondoreservamensualBean);									
				}
			
				if(ProcesoIessFondoReservaMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReservaMensual(this.procesoiessfondoreservamensual);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoiessfondoreservamensualAnterior!=null) {
						this.procesoiessfondoreservamensual=this.procesoiessfondoreservamensualAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoiessfondoreservamensualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual(),procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensual(),this.procesoiessfondoreservamensuals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoIessFondoReservaMensual.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoIessFondoReservaMensual.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoIessFondoReservaMensual();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoIessFondoReservaMensual() throws Exception {
		
		ProcesoIessFondoReservaMensualModel procesoiessfondoreservamensualModel=(ProcesoIessFondoReservaMensualModel)this.jTableDatosProcesoIessFondoReservaMensual.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreservamensualModel.procesoiessfondoreservamensuals=this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoiessfondoreservamensualModel.procesoiessfondoreservamensuals=this.procesoiessfondoreservamensuals;
		}
		
		
		((ProcesoIessFondoReservaMensualModel) this.jTableDatosProcesoIessFondoReservaMensual.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoIessFondoReservaMensual() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoiessfondoreservamensualAnterior(),this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoiessfondoreservamensualAnterior(),this.procesoiessfondoreservamensuals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoIessFondoReservaMensual();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
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
										
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessfondoreservamensual,new Object(),generalEntityParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoIessFondoReservaMensualConstantesFunciones.getClassesRelationshipsOfProcesoIessFondoReservaMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoIessFondoReservaMensualConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoIessFondoReservaMensual(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoIessFondoReservaMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessfondoreservamensual,new Object(),generalEntityParameterGeneral,this.procesoiessfondoreservamensualReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensualBean procesoiessfondoreservamensualBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessFondoReservaMensual(ArrayList<Classe> classes,ProcesoIessFondoReservaMensualReturnGeneral procesoiessfondoreservamensualReturnGeneral,ProcesoIessFondoReservaMensualBean procesoiessfondoreservamensualBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual = new ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(jDesktopPane,this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones(),this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setVisible(false);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.procesoiessfondoreservamensualLogic=this.procesoiessfondoreservamensualLogic;
		
		this.cargarCombosFrameForeignKeyProcesoIessFondoReservaMensual("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessFondoReservaMensual();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessFondoReservaMensual();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoIessFondoReservaMensual("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReservaMensual();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessFondoReservaMensual"));
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessFondoReservaMensual"));

		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessFondoReservaMensual"));
					
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemModificarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessFondoReservaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessFondoReservaMensual"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessFondoReservaMensual"));
						
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemActualizarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessFondoReservaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessFondoReservaMensual"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessFondoReservaMensual"));
								
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemEliminarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessFondoReservaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessFondoReservaMensual"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessFondoReservaMensual"));
					
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemCancelarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessFondoReservaMensual"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessFondoReservaMensual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReservaMensual"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReservaMensual"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessFondoReservaMensual"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonidProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessFondoReservaMensual"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoIessFondoReservaMensual"));
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessFondoReservaMensual"));
		}
		
		this.jTableDatosProcesoIessFondoReservaMensual.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoIessFondoReservaMensual"));
		
		this.jTableDatosProcesoIessFondoReservaMensual.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoIessFondoReservaMensual"));
		
		this.jButtonNuevoProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"NuevoProcesoIessFondoReservaMensual"));
		
		this.jButtonDuplicarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"DuplicarProcesoIessFondoReservaMensual"));
		
		this.jButtonCopiarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"CopiarProcesoIessFondoReservaMensual"));
		
		this.jButtonVerFormProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"VerFormProcesoIessFondoReservaMensual"));
		
		
		this.jButtonNuevoToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoIessFondoReservaMensual"));
			
		this.jButtonDuplicarToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemNuevoProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoIessFondoReservaMensual"));
			
		this.jMenuItemDuplicarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoIessFondoReservaMensual"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoIessFondoReservaMensual"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessFondoReservaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonModificarToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessFondoReservaMensual"));
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemModificarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessFondoReservaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessFondoReservaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonActualizarToolBarProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessFondoReservaMensual"));
				
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemActualizarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessFondoReservaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessFondoReservaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonEliminarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessFondoReservaMensual"));
						
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemEliminarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessFondoReservaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessFondoReservaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonCancelarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessFondoReservaMensual"));
			
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemCancelarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessFondoReservaMensual"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonCerrarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CerrarProcesoIessFondoReservaMensual"));
		
		
		this.jButtonCerrarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemCerrarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoIessFondoReservaMensual"));
			
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessFondoReservaMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoIessFondoReservaMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReservaMensual"));
		}
		
		this.jButtonCopiarToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoIessFondoReservaMensual"));
			
		this.jButtonVerFormToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoIessFondoReservaMensual"));
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoIessFondoReservaMensual"));
			
		this.jMenuItemCopiarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoIessFondoReservaMensual"));		
		
		this.jMenuItemVerFormProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessFondoReservaMensual"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessFondoReservaMensual"));		
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoIessFondoReservaMensual"));
					
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoIessFondoReservaMensual"));
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoIessFondoReservaMensual"));		
		
		
		
		this.jButtonAnterioresProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"AnterioresProcesoIessFondoReservaMensual"));
		
		
		this.jButtonAnterioresToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoIessFondoReservaMensual"));
		
		this.jMenuItemAnterioresProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonSiguientesProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"SiguientesProcesoIessFondoReservaMensual"));
		
		
		this.jButtonSiguientesToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemSiguientesProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoIessFondoReservaMensual"));
			
		this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoIessFondoReservaMensual"));
			
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual"));
			
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoIessFondoReservaMensual"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual"));		
		
		
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoIessFondoReservaMensual"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoIessFondoReservaMensual"));

		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoIessFondoReservaMensual"));
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessFondoReservaMensual"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoIessFondoReservaMensual"));
			
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoIessFondoReservaMensual"));
					
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoIessFondoReservaMensual"));
			
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoIessFondoReservaMensual"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonidProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReservaMensual"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReservaMensual"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReservaMensual"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReservaMensual"));				
			//this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReservaMensual"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReservaMensual"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessFondoReservaMensual"));
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessFondoReservaMensual"));
				this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessFondoReservaMensual"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoIessFondoReservaMensual"));
			
			this.jButtonAbrirOrderByToolBarProcesoIessFondoReservaMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoIessFondoReservaMensual"));			
			
			if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual!=null) {
				this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessFondoReservaMensual"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessFondoReservaMensual"));
		
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
            		closingInternalFrameProcesoIessFondoReservaMensual();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoIessFondoReservaMensual = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoIessFondoReservaMensualBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessFondoReservaMensual.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoIessFondoReservaMensual.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoIessFondoReservaMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoIessFondoReservaMensual.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoIessFondoReservaMensual.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessFondoReservaMensualActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonModificarProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonActualizarProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonEliminarProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCancelarProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCerrarProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoIessFondoReservaMensual";
		inputMap = this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonGuardarCambiosProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensualItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoIessFondoReservaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoIessFondoReservaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoIessFondoReservaMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonidProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda"));
		
		
		this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoIessFondoReservaMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoIessFondoReservaMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoIessFondoReservaMensualActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoIessFondoReservaMensual(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
					procesoiessfondoreservamensualAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensuals) {
					procesoiessfondoreservamensualAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
						procesoiessfondoreservamensualAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensuals) {
						procesoiessfondoreservamensualAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensuals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReservaMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessFondoReservaMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoIessFondoReservaMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReservaMensual.getSelectedRows();
			
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensualLocal=new ProcesoIessFondoReservaMensual();
			
			//this.seleccionarTodosProcesoIessFondoReservaMensual(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoiessfondoreservamensualLocal =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoiessfondoreservamensualLocal =(ProcesoIessFondoReservaMensual) this.procesoiessfondoreservamensuals.toArray()[this.jTableDatosProcesoIessFondoReservaMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoiessfondoreservamensualLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
						procesoiessfondoreservamensualAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensuals) {
						procesoiessfondoreservamensualAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReservaMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessFondoReservaMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoIessFondoReservaMensualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoIessFondoReservaMensualParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoIessFondoReservaMensualActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensuals) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoIessFondoReservaMensualActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoIessFondoReservaMensual=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoIessFondoReservaMensual) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoIessFondoReservaMensual(conSplash);
				
					this.generarReporteProcesoIessFondoReservaMensualsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoIessFondoReservaMensualsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessFondoReservaMensualsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessFondoReservaMensualsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessFondoReservaMensual();
				
				this.exportarProcesoIessFondoReservaMensualsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoIessFondoReservaMensuals();
				//this.importarProcesoIessFondoReservaMensuals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessFondoReservaMensual();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoIessFondoReservaMensualsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoIessFondoReservaMensual();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoIessFondoReservaMensual)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoIessFondoReservaMensual(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoIessFondoReservaMensual) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoIessFondoReservaMensual(conSplash);
					
						//this.actualizarParametrosGeneralProcesoIessFondoReservaMensual();
						
						this.generarReporteProcesoAccionProcesoIessFondoReservaMensualsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Iess Fondo Reserva MensualES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoIessFondoReservaMensual();
				
						this.actualizarParametrosGeneralProcesoIessFondoReservaMensual();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoiessfondoreservamensualReturnGeneral=procesoiessfondoreservamensualLogic.procesarAccionProcesoIessFondoReservaMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals(),this.procesoiessfondoreservamensualParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoIessFondoReservaMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoIessFondoReservaMensual();
					
					ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoIessFondoReservaMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoIessFondoReservaMensual(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoIessFondoReservaMensualActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoIessFondoReservaMensual();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
			ProcesoIessFondoReservaMensual procesoiessfondoreservamensual=new ProcesoIessFondoReservaMensual();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.getSelectedItem();
			
			
			
			
			procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoiessfondoreservamensualsSeleccionados.size()==1) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
					procesoiessfondoreservamensual=procesoiessfondoreservamensualAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoIessFondoReservaMensual();
			
      		//this.finishProcessProcesoIessFondoReservaMensual(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoIessFondoReservaMensualReturnGeneral() throws Exception {
		if(this.procesoiessfondoreservamensualReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoiessfondoreservamensualReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoiessfondoreservamensualReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoiessfondoreservamensualReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoiessfondoreservamensualReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoiessfondoreservamensualReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
		}
		
		if(this.procesoiessfondoreservamensualReturnGeneral.getConRetornoLista() || this.procesoiessfondoreservamensualReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoiessfondoreservamensualReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoiessfondoreservamensualLogic.setProcesoIessFondoReservaMensuals(this.procesoiessfondoreservamensualReturnGeneral.getProcesoIessFondoReservaMensuals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoIessFondoReservaMensual(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoIessFondoReservaMensual() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoIessFondoReservaMensual> getProcesoIessFondoReservaMensualsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoIessFondoReservaMensual) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals()) {
					if(procesoiessfondoreservamensualAux.getIsSelected()) {
						procesoiessfondoreservamensualsSeleccionados.add(procesoiessfondoreservamensualAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:this.procesoiessfondoreservamensuals) {
					if(procesoiessfondoreservamensualAux.getIsSelected()) {
						procesoiessfondoreservamensualsSeleccionados.add(procesoiessfondoreservamensualAux);				
					}
				}
			}
			
			if(procesoiessfondoreservamensualsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoiessfondoreservamensualsSeleccionados.addAll(this.procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservamensualsSeleccionados.addAll(this.procesoiessfondoreservamensuals);				
					}
				}
			}
		} else {
			procesoiessfondoreservamensualsSeleccionados.add(this.procesoiessfondoreservamensual);
		}
		
		return procesoiessfondoreservamensualsSeleccionados;
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
	
	public void generarReporteProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoIessFondoReservaMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoIessFondoReservaMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessFondoReservaMensualsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessFondoReservaMensualsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Iess Fondo Reserva Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoIessFondoReservaMensualsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoIessFondoReservaMensual();
		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoIessFondoReservaMensual();
		
		
		//this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados ,procesoiessfondoreservamensualImplementable,procesoiessfondoreservamensualImplementableHome);
	}
	
	public void mostrarImportacionProcesoIessFondoReservaMensuals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoIessFondoReservaMensual();
		
		this.abrirFrameImportacionProcesoIessFondoReservaMensual();		
		
			
		//this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados ,procesoiessfondoreservamensualImplementable,procesoiessfondoreservamensualImplementableHome);
	}
	
	public void importarProcesoIessFondoReservaMensuals() throws Exception {		
	
	}
	
	public void exportarProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoIessFondoReservaMensualsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoIessFondoReservaMensualsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoIessFondoReservaMensualsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Iess Fondo Reserva Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoIessFondoReservaMensual(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoIessFondoReservaMensual(procesoiessfondoreservamensualAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoiessfondoreservamensualAux.setsDetalleGeneralEntityReporte(procesoiessfondoreservamensualAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoIessFondoReservaMensual(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoiessfondoreservamensual.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreservamensual.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreservamensual.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreservamensual.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreservamensual.getnumeropatronal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreservamensual.gettipoprocesonomina_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoIessFondoReservaMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoIessFondoReservaMensual(row);				
				iRow++;
			}				
			
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoIessFondoReservaMensual(procesoiessfondoreservamensualAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoIessFondoReservaMensualsSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();		
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreservamensual.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoiessfondoreservamensuals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoiessfondoreservamensual");
			//elementRoot.appendChild(element);
		
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
				element = document.createElement("procesoiessfondoreservamensual");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoIessFondoReservaMensual(procesoiessfondoreservamensualAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoIessFondoReservaMensual(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreservamensual.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreservamensual.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreservamensual.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreservamensual.getnumeropatronal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreservamensual.gettipoprocesonomina_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoIessFondoReservaMensual(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoiessfondoreservamensual.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoiessfondoreservamensual.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesoiessfondoreservamensual.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesoiessfondoreservamensual.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementnumeropatronal_descripcion = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.IDNUMEROPATRONAL);
		elementnumeropatronal_descripcion.appendChild(document.createTextNode(procesoiessfondoreservamensual.getnumeropatronal_descripcion()));
		element.appendChild(elementnumeropatronal_descripcion);

		Element elementtipoprocesonomina_descripcion = document.createElement(ProcesoIessFondoReservaMensualConstantesFunciones.IDTIPOPROCESONOMINA);
		elementtipoprocesonomina_descripcion.appendChild(document.createTextNode(procesoiessfondoreservamensual.gettipoprocesonomina_descripcion()));
		element.appendChild(elementtipoprocesonomina_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoIessFondoReservaMensualsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados=new ArrayList<ProcesoIessFondoReservaMensual>();
		
		procesoiessfondoreservamensualsSeleccionados=this.getProcesoIessFondoReservaMensualsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoIessFondoReservaMensual(procesoiessfondoreservamensualsSeleccionados);
		
		this.generarReporteProcesoIessFondoReservaMensuals("Todos",procesoiessfondoreservamensualsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoIessFondoReservaMensual(ArrayList<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensualAux:procesoiessfondoreservamensualsSeleccionados) {
				procesoiessfondoreservamensualAux.setsDetalleGeneralEntityReporte(procesoiessfondoreservamensualAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesoiessfondoreservamensualAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservamensualAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesoiessfondoreservamensualAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservamensualAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL)) {
					existe=true;
					procesoiessfondoreservamensualAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservamensualAux.getnumeropatronal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA)) {
					existe=true;
					procesoiessfondoreservamensualAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservamensualAux.gettipoprocesonomina_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoIessFondoReservaMensual(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=true;
		} else {
			this.actualizarEstadoPanelsProcesoIessFondoReservaMensual(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoIessFondoReservaMensual=false;
			//this.isVisibilidadCeldaVerFormProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReservaMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			if(!procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;												
			}
			
			this.jButtonCerrarProcesoIessFondoReservaMensual.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoiessfondoreservamensual)) {
			this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoIessFondoReservaMensual=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReservaMensual=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReservaMensual=false;
		//this.isVisibilidadCeldaModificarProcesoIessFondoReservaMensual=true;
		this.isVisibilidadCeldaActualizarProcesoIessFondoReservaMensual=false;
		this.isVisibilidadCeldaEliminarProcesoIessFondoReservaMensual=false;
		//this.isVisibilidadCeldaCancelarProcesoIessFondoReservaMensual=true;			
		this.isVisibilidadCeldaGuardarProcesoIessFondoReservaMensual=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessFondoReservaMensual() {
	}
	
	public void actualizarEstadoPanelsProcesoIessFondoReservaMensual(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReservaMensual!=null) {
				this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReservaMensual!=null) {
				this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
					this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReservaMensual!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReservaMensual) {this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.remove(jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=isParaMes;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReservaMensual) {this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.remove(jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaNumeroPatronal(Boolean isParaNumeroPatronal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNumeroPatronalNegation=!isParaNumeroPatronal;

			this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=isParaNumeroPatronal;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReservaMensual) {this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.remove(jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoNomina(Boolean isParaTipoProcesoNomina){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoNominaNegation=!isParaTipoProcesoNomina;

			this.isVisibilidadBusquedaProcesoIessFondoReservaMensual=isParaTipoProcesoNomina;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReservaMensual) {this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.remove(jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);}
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
			
			this.inicializarActualizarBindingTablaProcesoIessFondoReservaMensual(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoIessFondoReservaMensual() {
		this.updateBorderResaltarBusquedasFormularioProcesoIessFondoReservaMensual();
		this.updateVisibilidadBusquedasFormularioProcesoIessFondoReservaMensual();
		this.updateHabilitarBusquedasFormularioProcesoIessFondoReservaMensual();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoIessFondoReservaMensual() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponents().length>0) {
	

		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual!=null) {
			index= this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponent(index);
				jPanel.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoIessFondoReservaMensual() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			if(!this.procesoiessfondoreservamensualConstantesFunciones.mostrarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual && index>-1) {
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoIessFondoReservaMensual() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
				this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setEnabledAt(index,this.procesoiessfondoreservamensualConstantesFunciones.activarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoIessFondoReservaMensual(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoIessFondoReservaMensual")) {
			index= this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);

			this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.getComponent(index);

			this.procesoiessfondoreservamensualConstantesFunciones.setResaltarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual(resaltar);

			jPanel.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoIessFondoReservaMensual() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoIessFondoReservaMensual();
		this.updateVisibilidadResaltarControlesFormularioProcesoIessFondoReservaMensual();
		this.updateHabilitarResaltarControlesFormularioProcesoIessFondoReservaMensual();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoIessFondoReservaMensual() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltaridProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltaridProcesoIessFondoReservaMensual);}
		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_anioProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_anioProcesoIessFondoReservaMensual);}
		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_mesProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_mesProcesoIessFondoReservaMensual);}
		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReservaMensual);}
		if(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_tipo_proceso_nominaProcesoIessFondoReservaMensual!=null && this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setBorder(this.procesoiessfondoreservamensualConstantesFunciones.resaltarid_tipo_proceso_nominaProcesoIessFondoReservaMensual);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoIessFondoReservaMensual() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
	
		//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostraridProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelidProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostraridProcesoIessFondoReservaMensual);
		//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_anioProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelid_anioProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_anioProcesoIessFondoReservaMensual);
		//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_mesProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelid_mesProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_mesProcesoIessFondoReservaMensual);
		//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelid_numero_patronalProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReservaMensual);
		//this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_tipo_proceso_nominaProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setVisible(this.procesoiessfondoreservamensualConstantesFunciones.mostrarid_tipo_proceso_nominaProcesoIessFondoReservaMensual);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoIessFondoReservaMensual() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual!=null) {
	
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jLabelidProcesoIessFondoReservaMensual.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activaridProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_anioProcesoIessFondoReservaMensual.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activarid_anioProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_mesProcesoIessFondoReservaMensual.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activarid_mesProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activarid_numero_patronalProcesoIessFondoReservaMensual);
		this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual.jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setEnabled(this.procesoiessfondoreservamensualConstantesFunciones.activarid_tipo_proceso_nominaProcesoIessFondoReservaMensual);
		}
	}
	
		
}